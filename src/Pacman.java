import java.awt.event.KeyEvent;


public class Pacman extends Individuo{
	private Semaforo semaforo,
	                  semaforoMorteP,
	                  semaforoMorteF;
	private boolean fantasmasComMedo = false;
	private int comeuFantasma = 0;
	
	
	public Pacman (int posicaoX, int posicaoY, int direcao, Mapa mapa, Semaforo semaforo, Semaforo semaforoMorteP, Semaforo semaforoMorteF) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.velocidade = Constants.VELOCIDADE_PACMAN;
		this.alteraDirecao(direcao);
		switch (direcao) {
		case 0:
			this.imagemAtual = Constants.PACMAN_ACIMA_KEY;
			break;
		case 1:
			this.imagemAtual = Constants.PACMAN_ABAIXO_KEY;
			break;
		case 2: 
			this.imagemAtual = Constants.PACMAN_DIREITA_KEY;
			break;
		case 3:
			this.imagemAtual = Constants.PACMAN_ESQUERDA_KEY;
			break;
		}
		this.mapaBase = mapa;
		mapaBase.carregaPersonagem(this);
		
		this.semaforo = semaforo;
		this.semaforoMorteP = semaforoMorteP;
		this.semaforoMorteF = semaforoMorteF;
	}

	@Override
	public void alteraDirecao (int novaDirecao) {
		switch (novaDirecao) {
		// direcao norte
		case 0:
			this.direcaoNorte = true;
			this.direcaoSul   = false;
			this.direcaoLeste = false;
			this.direcaoOeste = false;
			this.imagemAtual = Constants.PACMAN_ACIMA_KEY;
			break;
		// direcao sul
		case 1:
			this.direcaoNorte = false;
			this.direcaoSul   = true;
			this.direcaoLeste = false;
			this.direcaoOeste = false;
			this.imagemAtual = Constants.PACMAN_ABAIXO_KEY;
			break;
		// direcao leste
		case 2:
			this.direcaoNorte = false;
			this.direcaoSul   = false;
			this.direcaoLeste = true;
			this.direcaoOeste = false;
			this.imagemAtual = Constants.PACMAN_DIREITA_KEY;
			break;
		// direcao oeste
		case 3:
			this.direcaoNorte = false;
			this.direcaoSul   = false;
			this.direcaoLeste = false;
			this.direcaoOeste = true;
			this.imagemAtual = Constants.PACMAN_ESQUERDA_KEY;
			break;
		}
	}
	
	private boolean movimenta(int x, int y, int direcao){
		int posX = this.getPosicaoX();
		int posY = this.getPosicaoY(); 
		
		if (this.mapaBase.getPosicaoMapa(posX + x, posY + y) != Constants.PAREDE_KEY) {
			
//			Este bloco faz com que quando o pacman passar pelo fantasma perca uma vida.
//			###################################################################################
			if (this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.FANTASMA_AMARELO_KEY || this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.FANTASMA_AZUL_KEY ||this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.FANTASMA_ROSA_KEY || this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.FANTASMA_VERMELHO_KEY) {
				this.mapaBase.jogador.decrementaVidas();
				this.mapaBase.atualizaNumVidas(mapaBase.jogador.getVidas());
				semaforoMorteP.up();
			}
//			###################################################################################

			
// 			Este bloco insere pontos para cada elemento do mapa. Um fantasma amedrontado está rodando no mapa para testar a pontuacao.			
//			###################################################################################			
			if (this.mapaBase.getPosicaoAnteriorMapa(posX + x, posY + y) == Constants.PONTO_COMUM_KEY ||
				this.mapaBase.getPosicaoAnteriorMapa(posX + x, posY + y) == Constants.PONTO_ESPECIAL_KEY) {
				GabaritoMapa.setQtdePontos();
				if(GabaritoMapa.getQtdePontos() == 0){
					if(this.mapaBase.proximoNivel() < 6){
						Tela.iniciaMapa(this.mapaBase.proximoNivel(), this.mapaBase.jogador);
						this.mapaBase.hide();
					}
				}
			}
//			###################################################################################			
			
			if (this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.PONTO_COMUM_KEY) {
				this.mapaBase.jogador.incrementaPontos(Constants.PONTUACAO_PONTO_SIMPLES);
				this.mapaBase.atualizaPontuacao(this.mapaBase.jogador.getPontos());
			} else if (this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.PONTO_ESPECIAL_KEY) {
				this.mapaBase.jogador.incrementaPontos(Constants.PONTUACAO_PONTO_ESPECIAL);
				this.mapaBase.atualizaPontuacao(this.mapaBase.jogador.getPontos());
				semaforo.up();
			} 
			if(fantasmasComMedo && (this.mapaBase.getPosicaoMapa(posX + x, posY + y) != Constants.PONTO_COMUM_KEY && this.mapaBase.getPosicaoMapa(posX + x, posY + y) != Constants.PONTO_ESPECIAL_KEY && this.mapaBase.getPosicaoMapa(posX + x, posY + y) != Constants.VAZIO_KEY))
			{
				if (this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.FANTASMA_AZUL_APAVORADO_KEY) {
					this.mapaBase.jogador.setComeuFantasma(1);
					semaforoMorteF.up();
				}
				else if(this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.FANTASMA_AMARELO_APAVORADO_KEY){
					this.mapaBase.jogador.setComeuFantasma(2);
					semaforoMorteF.up();
				}
				else if(this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.FANTASMA_ROSA_APAVORADO_KEY){
					this.mapaBase.jogador.setComeuFantasma(3);
					semaforoMorteF.up();
				}
				else if(this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.FANTASMA_VERMELHO_APAVORADO_KEY){
					this.mapaBase.jogador.setComeuFantasma(4);
					semaforoMorteF.up();
				}
				this.mapaBase.jogador.incrementaPontos(Constants.PONTUACAO_FANTASMA);
				this.mapaBase.atualizaPontuacao(this.mapaBase.jogador.getPontos());
			}
			this.mapaBase.setPosicaoAnteriorMapa(posX, posY, Constants.VAZIO_KEY);
			this.mapaBase.setPosicaoAnteriorMapa(posX + x, posY + y, this.imagemAtual);
			this.mapaBase.setPosicaoMapa(posX, posY, this.mapaBase.getPosicaoMapa(posX, posY));
			if (direcao == 0)
			    this.setPosicaoY(posY + y);
			else
				this.setPosicaoX(posX + x);
			this.mapaBase.carregaPosicaoMapa(posX, posY, this.mapaBase.getPosicaoAnteriorMapa(posX, posY));
			this.mapaBase.carregaPersonagem(this);
			return true;
		}
		
		return false;
	}
	
	private boolean movimentaParaNorte () {
		return movimenta(0, -1, 0);
	}
	
	private boolean movimentaParaSul() {
		return movimenta(0, 1, 0);
	}
	
	private boolean movimentaParaLeste() {
		return movimenta(1, 0, 1);
	}
	
	private boolean movimentaParaOeste() {
		return movimenta(-1, 0, 1);
	}
	
	private void passoPacman() {
		int botaoPressionado = this.mapaBase.getKeyTyped();
		this.movimentoPacman(botaoPressionado);
		if (this.getDirecao() == 0) {
			this.movimentaParaNorte();
		} else if (this.getDirecao() == 1) {
			this.movimentaParaSul();
		} else if (this.getDirecao() == 2) {
			this.movimentaParaOeste();
		} else if (this.getDirecao() == 3) {
			this.movimentaParaLeste();
		}
		
//		Descomente esta linha para ver a pontuação.
//		System.out.println(this.jogador.getPontos());
		
		try {
			Thread.sleep(Constants.VELOCIDADE_PACMAN);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private void movimentoPacman(int botaoPressionado) {
		int posX = this.getPosicaoX();
		int posY = this.getPosicaoY();
		
		if (botaoPressionado == 38 && this.mapaBase.getPosicaoMapa(posX, posY - 1) != Constants.PAREDE_KEY) {
			this.alteraDirecao(0);
		} else if (botaoPressionado == 40 && this.mapaBase.getPosicaoMapa(posX, posY + 1) != Constants.PAREDE_KEY) {
			this.alteraDirecao(1);
		} else if (botaoPressionado == 39 && this.mapaBase.getPosicaoMapa(posX + 1, posY) != Constants.PAREDE_KEY) {
			this.alteraDirecao(2);
		} else if (botaoPressionado == 37 && this.mapaBase.getPosicaoMapa(posX - 1, posY) != Constants.PAREDE_KEY) {
			this.alteraDirecao(3);
		}
	}
	
	public void setFantasmasAssustados(boolean scared){
		this.fantasmasComMedo = scared;
	}
	
	public boolean fantasmasAssustados(){
		return this.fantasmasComMedo;
	}
	
	public int getComeuFantasma(){
		return this.comeuFantasma;
	}

	
	@Override
	public void run() {
		while (true) {
			this.passoPacman();
		}
	}

	
}