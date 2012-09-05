
public class Constants {
	public static final int TAMANHO_DO_MAPA               = 17;
	// velocidade do pacman
	public static final int VELOCIDADE_PACMAN             = 250;
	// velociadade normal do fantasma
	public static final int VELOCIDADE_FANTASMA           = 250;
	// velocidade do fantasma enquanto está apavorado
	public static final int VELOCIDADE_FANTASMA_APAVORADO = 150;
	// tempo total que um fantasma deve ficar assustado
	public static final int TEMPO_FANTASMA_APAVORADO      = 10000;
	
	// Pontuação concedida por cada ponto comum capturado pelo pacman.
	public static final int PONTUACAO_PONTO_SIMPLES       = 100;
	// Pontuação concedida por cada ponto especial capturado pelo pacman.
	public static final int PONTUACAO_PONTO_ESPECIAL      = 200;
	// Pontuação concedida por cada fantasma (somente quando amedrontado) capturado pelo pacman.
	public static final int PONTUACAO_FANTASMA            = 500;
	
	// Chaves para criação do mapa lógico
	public static final int VAZIO_KEY                        = 0;
	public static final int PACMAN_DIREITA_KEY               = 1;
	public static final int PACMAN_ESQUERDA_KEY              = 2;
	public static final int PACMAN_ACIMA_KEY                 = 3;
	public static final int PACMAN_ABAIXO_KEY                = 4;
	public static final int FANTASMA_AZUL_KEY                = 5;
	public static final int FANTASMA_AMARELO_KEY             = 6;
	public static final int FANTASMA_ROSA_KEY                = 7;
	public static final int FANTASMA_VERMELHO_KEY            = 8;
	public static final int FANTASMA_AZUL_APAVORADO_KEY      = 9;
	public static final int FANTASMA_AMARELO_APAVORADO_KEY   = 10;
	public static final int FANTASMA_ROSA_APAVORADO_KEY      = 11;
	public static final int FANTASMA_VERMELHO_APAVORADO_KEY  = 12;
	public static final int PONTO_COMUM_KEY                  = 13;
	public static final int PONTO_ESPECIAL_KEY               = 14;
	public static final int PAREDE_KEY                       = 15;
	
	public static final String SEPARADOR_PONTO_JOGADOR       = "___";
	public static final String SEPARADOR_INICIO_REGISTRO                  = "   ";
	
	// Pasta das imagens para formação do mapa visual
	public static final String IMAGES_PATH  = "Imagens/";
	public static final String ARQUIVO_PATH = "arquivo/usuarios.txt";
	
	// Ícones de formação do mapa visual
	public static final String VAZIO_PATH              = IMAGES_PATH + "vazio.png";
	public static final String PACMAN_DIREITA_PATH     = IMAGES_PATH + "pacman_direita.gif";
	public static final String PACMAN_ESQUERDA_PATH    = IMAGES_PATH + "pacman_esquerda.gif";
	public static final String PACMAN_ACIMA_PATH       = IMAGES_PATH + "pacman_acima.gif";
	public static final String PACMAN_ABAIXO_PATH      = IMAGES_PATH + "pacman_abaixo.gif";
	public static final String FANTASMA_AZUL_PATH      = IMAGES_PATH + "blue_ghost.gif";
	public static final String FANTASMA_AMARELO_PATH   = IMAGES_PATH + "yellow_ghost.gif";
	public static final String FANTASMA_ROSA_PATH      = IMAGES_PATH + "pink_ghost.gif";
	public static final String FANTASMA_VERMELHO_PATH  = IMAGES_PATH + "red_ghost.gif";
	public static final String FANTASMA_APAVORADO_PATH = IMAGES_PATH + "scared_ghost.gif";
	public static final String PONTO_COMUM_PATH        = IMAGES_PATH + "ponto_comum.png";
	public static final String PONTO_ESPECIAL_PATH     = IMAGES_PATH + "ponto_especial.png";
	public static final String PAREDE_PATH             = IMAGES_PATH + "parede.png";
	public static final String UM_VP_PATH              = IMAGES_PATH + "1vp.png";
	public static final String DOIS_VP_PATH            = IMAGES_PATH + "2vp.png";
	public static final String TRES_VP_PATH            = IMAGES_PATH + "3vp.png";
	public static final String GAME_OVER_PATH          = IMAGES_PATH + "game-over1.jpg";
}