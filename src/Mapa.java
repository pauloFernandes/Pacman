
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mapa extends JFrame implements KeyListener{

	// objetos dos icones da imagens
	private ImageIcon paredeIcon;
	private ImageIcon vazioIcon;
	private ImageIcon pontoComumIcon;
	private ImageIcon pontoEspecialIcon;
	private ImageIcon pacmanAcimaIcon;
	private ImageIcon pacmanAbaixoIcon;
	private ImageIcon pacmanEsquerdaIcon;
	private ImageIcon pacmanDireitaIcon;
	private ImageIcon fantasmaAzulIcon;
	private ImageIcon fantasmaRosaIcon;
	private ImageIcon fantasmaAmareloIcon;
	private ImageIcon fantasmaVermelhoIcon;
	private ImageIcon fantasmaApavoradoIcon;
	private JLabel    labelVidas;
	private JLabel    pontuacao;
	private int       keyTyped;

	// mapas de chaves e imagens
	private PontoMapa[][] mapa_chaves;
	private JLabel[][] mapa_imagens;
	
	public Jogador jogador;
	private int nivel;

	public Mapa(Jogador jogador, int nivel) {

		this.paredeIcon            = new ImageIcon(Constants.PAREDE_PATH);
		this.vazioIcon             = new ImageIcon(Constants.VAZIO_PATH);
		this.pontoComumIcon        = new ImageIcon(Constants.PONTO_COMUM_PATH);
		this.pontoEspecialIcon     = new ImageIcon(Constants.PONTO_ESPECIAL_PATH);
		this.pacmanAcimaIcon       = new ImageIcon(Constants.PACMAN_ACIMA_PATH);
		this.pacmanAbaixoIcon      = new ImageIcon(Constants.PACMAN_ABAIXO_PATH);
		this.pacmanEsquerdaIcon    = new ImageIcon(Constants.PACMAN_ESQUERDA_PATH);
		this.pacmanDireitaIcon     = new ImageIcon(Constants.PACMAN_DIREITA_PATH);
		this.fantasmaAzulIcon      = new ImageIcon(Constants.FANTASMA_AZUL_PATH);
		this.fantasmaRosaIcon      = new ImageIcon(Constants.FANTASMA_ROSA_PATH);
		this.fantasmaVermelhoIcon  = new ImageIcon(Constants.FANTASMA_VERMELHO_PATH);
		this.fantasmaAmareloIcon   = new ImageIcon(Constants.FANTASMA_AMARELO_PATH);
		this.fantasmaApavoradoIcon = new ImageIcon(Constants.FANTASMA_APAVORADO_PATH);
		this.labelVidas            = new JLabel(new ImageIcon(Constants.TRES_VP_PATH));
		
//		 Os dois campos abaixo deverão ter metodos criados para serem alterados os valores
//		de pontuacao e nivel do mapa. O metodo de alteracao de niveis tambem nao foi implementado.
		
		this.jogador               = jogador;
		
		this.pontuacao             = new JLabel();
		this.atualizaPontuacao(this.jogador.getPontos());

		this.mapa_chaves           = new PontoMapa[Constants.TAMANHO_DO_MAPA][Constants.TAMANHO_DO_MAPA];
		this.mapa_imagens          = new JLabel[Constants.TAMANHO_DO_MAPA][Constants.TAMANHO_DO_MAPA];

		this.nivel = nivel;
		
		this.setMapaInicial();
		this.setMapaDeImagens();

		try {
			mostra();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void mostra() {

		// Insira aqui os dados de criação da janela
		this.getContentPane().setLayout(null);		
		this.setSize(722, 660);
		this.setTitle("Pacman");
		this.setResizable(false);
		this.addKeyListener(this);

		// Insira aqui os dados da Criação dos Controles na Janela
		labelVidas.setBounds(new Rectangle(149, 568, 120, 33));
	    this.getContentPane().add(labelVidas, null);
	    pontuacao.setBounds(new Rectangle(420, 570, 780, 13));
	    this.getContentPane().add(pontuacao, null);
		for (int i = 0; i < Constants.TAMANHO_DO_MAPA; i++) {
			for (int j = 0; j < Constants.TAMANHO_DO_MAPA; j++)
				inicializaMapaImagem(i, j);
		}

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				aoFechar(e);
			}
		});

	}

	private void aoFechar(WindowEvent e) {

		System.exit(0);

	}

	public void setMapaDeChaves(int x, int y, int valor) {

		this.mapa_chaves[x][y].setPosicao(valor);

	}

	private void setMapaInicial() {
		mapa_chaves = GabaritoMapa.retornaMapa(nivel);
	}

	private void setUmaImagem(int x, int y) {

		switch (mapa_chaves[x][y].getPosicao()) {
		case Constants.PAREDE_KEY:
			mapa_imagens[x][y].setIcon(paredeIcon);
			break;
		case Constants.VAZIO_KEY:
			mapa_imagens[x][y].setIcon(vazioIcon);
			break;
		case Constants.PONTO_COMUM_KEY:
			mapa_imagens[x][y].setIcon(pontoComumIcon);
			break;
		case Constants.PONTO_ESPECIAL_KEY:
			mapa_imagens[x][y].setIcon(pontoEspecialIcon);
			break;
		case Constants.PACMAN_ACIMA_KEY:
			mapa_imagens[x][y].setIcon(pacmanAcimaIcon);
			break;
		case Constants.PACMAN_ABAIXO_KEY:
			mapa_imagens[x][y].setIcon(pacmanAbaixoIcon);
			break;
		case Constants.PACMAN_ESQUERDA_KEY:
			mapa_imagens[x][y].setIcon(pacmanEsquerdaIcon);
			break;
		case Constants.PACMAN_DIREITA_KEY:
			mapa_imagens[x][y].setIcon(pacmanDireitaIcon);
			break;
		case Constants.FANTASMA_AZUL_KEY:
			mapa_imagens[x][y].setIcon(fantasmaAzulIcon);
			break;
		case Constants.FANTASMA_ROSA_KEY:
			mapa_imagens[x][y].setIcon(fantasmaRosaIcon);
			break;
		case Constants.FANTASMA_AMARELO_KEY:
			mapa_imagens[x][y].setIcon(fantasmaAmareloIcon);
			break;
		case Constants.FANTASMA_VERMELHO_KEY:
			mapa_imagens[x][y].setIcon(fantasmaVermelhoIcon);
			break;
		case Constants.FANTASMA_AZUL_APAVORADO_KEY:
			mapa_imagens[x][y].setIcon(fantasmaApavoradoIcon);
			break;
		case Constants.FANTASMA_AMARELO_APAVORADO_KEY:
			mapa_imagens[x][y].setIcon(fantasmaApavoradoIcon);
			break;
		case Constants.FANTASMA_ROSA_APAVORADO_KEY:
			mapa_imagens[x][y].setIcon(fantasmaApavoradoIcon);
			break;
		case Constants.FANTASMA_VERMELHO_APAVORADO_KEY:
			mapa_imagens[x][y].setIcon(fantasmaApavoradoIcon);
			break;
		}

	}

	private void setMapaDeImagens() {

		for (int i = 0; i < Constants.TAMANHO_DO_MAPA; i++) {
			for (int j = 0; j < Constants.TAMANHO_DO_MAPA; j++) {
				mapa_imagens[i][j] = new JLabel();
				setUmaImagem(i, j);
			}
		}

	}

	private void inicializaMapaImagem(int i, int j) {

		mapa_imagens[i][j].setBounds(new Rectangle(100 + (i * 30),
				40 + (j * 30), 35, 35));
		this.getContentPane().add(mapa_imagens[i][j], null);

	}
	
	public void carregaPosicaoMapa(int x, int y, int valor){
		
		this.setMapaDeChaves(x, y, valor);
		this.setUmaImagem(x, y);
		this.inicializaMapaImagem(x, y);
		this.repaint();
		
	}

	public void carregaPersonagem(Individuo personagem) {
		int posX = personagem.getPosicaoX();
		int posY = personagem.getPosicaoY();
		this.setMapaDeChaves(posX, posY, personagem.getImagemAtual());
		if(personagem.getClass().toString().equals("class Pacman")) {
			this.mapa_chaves[posX][posY].setPosicaoAnterior(personagem.getImagemAtual());
		}
		this.setUmaImagem(posX, posY);
		this.inicializaMapaImagem(posX, posY);
		this.repaint();
	}
	
	public int getPosicaoMapa(int posX, int posY) {
		return this.mapa_chaves[posX][posY].getPosicao();
	}
	
	public void setPosicaoMapa(int posX, int posY, int posicao) {
		this.mapa_chaves[posX][posY].setPosicao(posicao);	
	}

	public int getPosicaoAnteriorMapa(int posX, int posY) {
		return this.mapa_chaves[posX][posY].getPosicaoAnterior();
	}
	
	public void setPosicaoAnteriorMapa(int posX, int posY, int posicao) {
		this.mapa_chaves[posX][posY].setPosicaoAnterior(posicao);
	}

	public void atualizaNumVidas(int numVidas) {
		if (numVidas == 2) {
			labelVidas.setIcon(new ImageIcon(Constants.DOIS_VP_PATH));
			labelVidas.setBounds(new Rectangle(149, 568, 120, 33));
		} else if (numVidas == 1) {
			labelVidas.setIcon(new ImageIcon(Constants.UM_VP_PATH));
			labelVidas.setBounds(new Rectangle(149, 568, 120, 33));
		} else if (numVidas == 0) {
			labelVidas.setIcon(new ImageIcon(Constants.GAME_OVER_PATH));
			labelVidas.setBounds(new Rectangle(149, 568, 120, 33));
			this.labelVidas.setBounds(new Rectangle(166, 201, 400, 230));
		}
		this.labelVidas.repaint();
	}
	
	public void atualizaPontuacao(long pontos){
		
		this.pontuacao.setText("Pontos: " + pontos);
	}
	
	public int proximoNivel(){
		return nivel+1;
	}

	public int getKeyTyped() {
		return this.keyTyped;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		this.keyTyped = e.getKeyCode();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		this.keyTyped = e.getKeyCode();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		this.keyTyped = e.getKeyCode();
	}
}