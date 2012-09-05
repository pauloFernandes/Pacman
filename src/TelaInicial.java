import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaInicial extends JFrame {

	private ImageIcon imagemIcon;
	private ImageIcon playIcon;
	private ImageIcon creditsIcon;
	private ImageIcon quitIcon;
	private JLabel titulo;
	private JLabel imagem;
	private JButton play;
	private JButton credits;
	private JButton quit;
	private static TelaInicial telaInicial;

	private TelaInicial() {
		imagemIcon  = new ImageIcon("Imagens/pacman_disco.gif");
		playIcon    = new ImageIcon("Imagens/play.png");
		creditsIcon = new ImageIcon("Imagens/credits.png");
		quitIcon    = new ImageIcon("Imagens/quit.png");
		imagem      = new JLabel(imagemIcon);
		play        = new JButton(playIcon);
		credits     = new JButton(creditsIcon);
		quit        = new JButton(quitIcon);
		try {
			mostra();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static TelaInicial getInstance() {
		if (telaInicial == null) {
			telaInicial = new TelaInicial();
		}
		return telaInicial;
	}

	private void mostra() throws Exception {
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(732, 670);
		this.setTitle("Pacman");
		this.setResizable(false);

		imagem.setBounds(new Rectangle(200, 190, 357, 213));
		this.getContentPane().add(imagem, null);
		play.setBounds(new Rectangle(330,400,90,30));
		this.getContentPane().add(play, null);
		play.addMouseListener (new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String nome = JOptionPane.showInputDialog("Digite seu nome.");
				Jogador jogador = new Jogador(nome);
				esconderJanela();
			    Tela.iniciaMapa(1, jogador);
			}});
		credits.setBounds(new Rectangle(300,440,150,30));
		this.getContentPane().add(credits, null);
		credits.addMouseListener (new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String creditos = "Alessandra Semião Drumond\n" +
								  "Camila Luana de Andrade\n" +
								  "Jéssica Braga da Cruz Lopes\n" +
								  "Paulo Henrique Fernandes Pereira\n" +
								  "Renan Martins da Costa Pullig";
				JOptionPane.showMessageDialog(null, creditos);
			}});		
		quit.setBounds(new Rectangle(320,480,100,30));
		this.getContentPane().add(quit, null);
		quit.addMouseListener (new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}});
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				aoFechar(e);
			}
		});
	}

	private void esconderJanela() {
		this.setVisible(false);
	}
	
	public void mostrarJanela() {
		this.setVisible(true);
	}
	
	private void aoFechar(WindowEvent e) {
		System.exit(0);
	}
}
