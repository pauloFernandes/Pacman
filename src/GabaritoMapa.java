
public class GabaritoMapa {
	// Vetor do tipo PontoMapa, que será retornado dependendo do numero do mapa que será escolhido. 
	private static PontoMapa[][] mapas = new PontoMapa[Constants.TAMANHO_DO_MAPA][Constants.TAMANHO_DO_MAPA];
	// A quantidade de pontos no mapa deve iniciar como area do mapa - 1, porque o pacman ocupa um ponto do mapa,
	// que aqui será iniciado como ponto. Se nao houvesse esse decrescimo, no final, todos os pontos do mapa seriam
	// capturados pelo pacman e a fase nao seria concluida.
	private static int qtdePonto;
	
	private static PontoMapa[][] _mapa1() {
		// Esta linha deve estar no inicio de todos os mapas. Ele carrega todas as posicoes do 
		// mapa com pontos comuns e as extremidades com paredes.
		GabaritoMapa.iniciaMapa();
		
		// setando os pontos de parede dentro do mapa.
		GabaritoMapa.insereParede(5, 1);
		GabaritoMapa.insereParede(6, 1);
		GabaritoMapa.insereParede(10, 1);
		GabaritoMapa.insereParede(11, 1);
		GabaritoMapa.insereParede(2, 2);
		GabaritoMapa.insereParede(3, 2);
		GabaritoMapa.insereParede(8, 2);
		GabaritoMapa.insereParede(13, 2);
		GabaritoMapa.insereParede(14, 2);
		GabaritoMapa.insereParede(5, 3);
		GabaritoMapa.insereParede(6, 3);
		GabaritoMapa.insereParede(10, 3);
		GabaritoMapa.insereParede(11, 3);
		GabaritoMapa.insereParede(2, 4);
		GabaritoMapa.insereParede(3, 4);
		GabaritoMapa.insereParede(6, 4);
		GabaritoMapa.insereParede(8, 4);
		GabaritoMapa.insereParede(10, 4);
		GabaritoMapa.insereParede(13, 4);
		GabaritoMapa.insereParede(14, 4);
		GabaritoMapa.insereParede(2, 5);
		GabaritoMapa.insereParede(3, 5);
		GabaritoMapa.insereParede(4, 5);
		GabaritoMapa.insereParede(6, 5);
		GabaritoMapa.insereParede(8, 5);
		GabaritoMapa.insereParede(10, 5);
		GabaritoMapa.insereParede(12, 5);
		GabaritoMapa.insereParede(13, 5);
		GabaritoMapa.insereParede(14, 5);
		GabaritoMapa.insereParede(8, 6);
		GabaritoMapa.insereParede(1, 7);
		GabaritoMapa.insereParede(3, 7);
		GabaritoMapa.insereParede(5, 7);
		GabaritoMapa.insereParede(7, 7);
		GabaritoMapa.insereParede(8, 7);
		GabaritoMapa.insereParede(9, 7);
		GabaritoMapa.insereParede(11, 7);
		GabaritoMapa.insereParede(13, 7);
		GabaritoMapa.insereParede(15, 7);
		GabaritoMapa.insereParede(1, 8);
		GabaritoMapa.insereParede(3, 8);
		GabaritoMapa.insereParede(5, 8);
		GabaritoMapa.insereParede(7, 8);
		GabaritoMapa.insereParede(8, 8);
		GabaritoMapa.insereParede(9, 8);
		GabaritoMapa.insereParede(11, 8);
		GabaritoMapa.insereParede(13, 8);
		GabaritoMapa.insereParede(15, 8);
		GabaritoMapa.insereParede(1, 9);
		GabaritoMapa.insereParede(3, 9);
		GabaritoMapa.insereParede(5, 9);
		GabaritoMapa.insereParede(7, 9);
		GabaritoMapa.insereParede(8, 9);
		GabaritoMapa.insereParede(9, 9);
		GabaritoMapa.insereParede(11, 9);
		GabaritoMapa.insereParede(13, 9);
		GabaritoMapa.insereParede(15, 9);
		GabaritoMapa.insereParede(2, 11);
		GabaritoMapa.insereParede(3, 11);
		GabaritoMapa.insereParede(4, 11);
		GabaritoMapa.insereParede(5, 11);
		GabaritoMapa.insereParede(7, 11);
		GabaritoMapa.insereParede(9, 11);
		GabaritoMapa.insereParede(11, 11);
		GabaritoMapa.insereParede(12, 11);
		GabaritoMapa.insereParede(13, 11);
		GabaritoMapa.insereParede(14, 11);
		GabaritoMapa.insereParede(2, 12);
		GabaritoMapa.insereParede(3, 12);
		GabaritoMapa.insereParede(4, 12);
		GabaritoMapa.insereParede(5, 12);
		GabaritoMapa.insereParede(11, 12);
		GabaritoMapa.insereParede(12, 12);
		GabaritoMapa.insereParede(13, 12);
		GabaritoMapa.insereParede(14, 12);
		GabaritoMapa.insereParede(5, 13);
		GabaritoMapa.insereParede(7, 13);
		GabaritoMapa.insereParede(8, 13);
		GabaritoMapa.insereParede(9, 13);
		GabaritoMapa.insereParede(11, 13);
		GabaritoMapa.insereParede(2, 14);
		GabaritoMapa.insereParede(3, 14);
		GabaritoMapa.insereParede(8, 14);
		GabaritoMapa.insereParede(13, 14);
		GabaritoMapa.insereParede(14, 14);
		GabaritoMapa.insereParede(5, 15);
		GabaritoMapa.insereParede(6, 15);
		GabaritoMapa.insereParede(10, 15);
		GabaritoMapa.insereParede(11, 15);
		// setando os pontos de ponto especial
		GabaritoMapa.inserePontoEspecial(1, 2);
		GabaritoMapa.inserePontoEspecial(1, 14);
		GabaritoMapa.inserePontoEspecial(15, 14);
		GabaritoMapa.inserePontoEspecial(15, 2);
		
		qtdePonto = 135;
		
		return mapas;

	}
	
	private static PontoMapa[][] _mapa2() {
		// Esta linha deve estar no inicio de todos os mapas. Ele carrega todas as posicoes do 
		// mapa com pontos comuns e as extremidades com paredes.
		GabaritoMapa.iniciaMapa();
		
		// setando os pontos de parede dentro do mapa.
		GabaritoMapa.insereParede(0, 4);
		GabaritoMapa.insereParede(0, 8);
		GabaritoMapa.insereParede(0, 12);
		GabaritoMapa.insereParede(2, 14);
		GabaritoMapa.insereParede(1, 6);
		GabaritoMapa.insereParede(1, 10);
		GabaritoMapa.insereParede(2, 2);
		GabaritoMapa.insereParede(2, 4);
		GabaritoMapa.insereParede(2, 8);
		GabaritoMapa.insereParede(2, 12);
		GabaritoMapa.insereParede(3, 0);
		GabaritoMapa.insereParede(3, 2);
		GabaritoMapa.insereParede(3, 4);
		GabaritoMapa.insereParede(3, 6);
		GabaritoMapa.insereParede(3, 8);
		GabaritoMapa.insereParede(3, 10);
		GabaritoMapa.insereParede(3, 12);
		GabaritoMapa.insereParede(3, 14);
		GabaritoMapa.insereParede(3, 16);
		GabaritoMapa.insereParede(4, 2);
		GabaritoMapa.insereParede(4, 14);
		GabaritoMapa.insereParede(5, 2);
		GabaritoMapa.insereParede(5, 4);
		GabaritoMapa.insereParede(5, 6);
		GabaritoMapa.insereParede(5, 7);
		GabaritoMapa.insereParede(5, 8);
		GabaritoMapa.insereParede(5, 9);
		GabaritoMapa.insereParede(5, 11);
		GabaritoMapa.insereParede(5, 12);
		GabaritoMapa.insereParede(5, 14);
		GabaritoMapa.insereParede(6, 4);
		GabaritoMapa.insereParede(6, 11);
		GabaritoMapa.insereParede(6, 12);
		GabaritoMapa.insereParede(7, 2);
		GabaritoMapa.insereParede(7, 4);
		GabaritoMapa.insereParede(7, 5);
		GabaritoMapa.insereParede(7, 7);
		GabaritoMapa.insereParede(7, 8);
		GabaritoMapa.insereParede(7, 9);
		GabaritoMapa.insereParede(7, 11);
		GabaritoMapa.insereParede(7, 12);
		GabaritoMapa.insereParede(7, 14);
		GabaritoMapa.insereParede(8, 2);
		GabaritoMapa.insereParede(8, 4);
		GabaritoMapa.insereParede(8, 5);
		GabaritoMapa.insereParede(8, 7);
		GabaritoMapa.insereParede(8, 8);
		GabaritoMapa.insereParede(8, 9);
		GabaritoMapa.insereParede(8, 11);
		GabaritoMapa.insereParede(8, 12);
		GabaritoMapa.insereParede(8, 14);
		GabaritoMapa.insereParede(9, 2);
		GabaritoMapa.insereParede(9, 7);
		GabaritoMapa.insereParede(9, 8);
		GabaritoMapa.insereParede(9, 9);
		GabaritoMapa.insereParede(9, 14);
		GabaritoMapa.insereParede(10, 0);
		GabaritoMapa.insereParede(10, 2);
		GabaritoMapa.insereParede(10, 4);
		GabaritoMapa.insereParede(10, 5);
		GabaritoMapa.insereParede(10, 8);
		GabaritoMapa.insereParede(10, 11);
		GabaritoMapa.insereParede(10, 12);
		GabaritoMapa.insereParede(10, 14);
		GabaritoMapa.insereParede(10, 16);
		GabaritoMapa.insereParede(11, 2);
		GabaritoMapa.insereParede(11, 4);
		GabaritoMapa.insereParede(11, 5);
		GabaritoMapa.insereParede(11, 6);
		GabaritoMapa.insereParede(11, 10);
		GabaritoMapa.insereParede(11, 11);
		GabaritoMapa.insereParede(11, 12);
		GabaritoMapa.insereParede(11, 14);
		GabaritoMapa.insereParede(12, 8);
		GabaritoMapa.insereParede(13, 0);
		GabaritoMapa.insereParede(13, 2);
		GabaritoMapa.insereParede(13, 3);
		GabaritoMapa.insereParede(13, 4);
		GabaritoMapa.insereParede(13, 6);
		GabaritoMapa.insereParede(13, 7);
		GabaritoMapa.insereParede(13, 8);
		GabaritoMapa.insereParede(13, 9);
		GabaritoMapa.insereParede(13, 10);
		GabaritoMapa.insereParede(13, 12);
		GabaritoMapa.insereParede(13, 13);
		GabaritoMapa.insereParede(13, 14);
		GabaritoMapa.insereParede(13, 16);
		GabaritoMapa.insereParede(14, 7);
		GabaritoMapa.insereParede(14, 8);
		GabaritoMapa.insereParede(14, 9);
		GabaritoMapa.insereParede(15, 1);
		GabaritoMapa.insereParede(15, 5);
		GabaritoMapa.insereParede(14, 3);
		GabaritoMapa.insereParede(15, 11);
		GabaritoMapa.insereParede(15, 15);
		GabaritoMapa.insereParede(14, 13);
		GabaritoMapa.insereParede(16, 7);
		GabaritoMapa.insereParede(16, 8);
		GabaritoMapa.insereParede(16, 9);

		// setando os pontos de ponto especial
		GabaritoMapa.inserePontoEspecial(2, 3);
		GabaritoMapa.inserePontoEspecial(2, 13);
		GabaritoMapa.inserePontoEspecial(12, 3);
		GabaritoMapa.inserePontoEspecial(12, 13);

		qtdePonto = 137;
		
		return mapas;

	}
	
	private static PontoMapa[][] _mapa3(){
		
		// Esta linha deve estar no inicio de todos os mapas. Ele carrega todas as posicoes do 
		// mapa com pontos comuns e as extremidades com paredes.
		GabaritoMapa.iniciaMapa();
		
		// setando os pontos de parede dentro do mapa.
		GabaritoMapa.insereParede(0, 5);
		GabaritoMapa.insereParede(0, 6);
		GabaritoMapa.insereParede(0, 7);
		GabaritoMapa.insereParede(0, 16);
		GabaritoMapa.insereParede(2, 11);
		GabaritoMapa.insereParede(2, 12);
		GabaritoMapa.insereParede(2, 13);
		GabaritoMapa.insereParede(2, 14);
		GabaritoMapa.insereParede(2, 2);
		GabaritoMapa.insereParede(2, 3);
		GabaritoMapa.insereParede(2, 5);
		GabaritoMapa.insereParede(2, 6);
		GabaritoMapa.insereParede(2, 7);
		GabaritoMapa.insereParede(2, 9);
		GabaritoMapa.insereParede(2, 16);
		GabaritoMapa.insereParede(3, 5);
		GabaritoMapa.insereParede(3, 6);
		GabaritoMapa.insereParede(3, 7);
		GabaritoMapa.insereParede(3, 9);
		GabaritoMapa.insereParede(3, 11);
		GabaritoMapa.insereParede(3, 12);
		GabaritoMapa.insereParede(3, 13);
		GabaritoMapa.insereParede(3, 14);
		GabaritoMapa.insereParede(3, 16);
		GabaritoMapa.insereParede(4, 3);
		GabaritoMapa.insereParede(4, 5);
		GabaritoMapa.insereParede(4, 6);
		GabaritoMapa.insereParede(4, 7);
		GabaritoMapa.insereParede(4, 9);
		GabaritoMapa.insereParede(4, 11);
		GabaritoMapa.insereParede(4, 12);
		GabaritoMapa.insereParede(4, 2);
		GabaritoMapa.insereParede(5, 3);
		GabaritoMapa.insereParede(5, 7);
		GabaritoMapa.insereParede(5, 9);
		GabaritoMapa.insereParede(5, 11);
		GabaritoMapa.insereParede(5, 12);
		GabaritoMapa.insereParede(5, 14);
		GabaritoMapa.insereParede(6, 1);
		GabaritoMapa.insereParede(6, 3);
		GabaritoMapa.insereParede(6, 5);
		GabaritoMapa.insereParede(6, 14);
		GabaritoMapa.insereParede(7, 1);
		GabaritoMapa.insereParede(7, 3);
		GabaritoMapa.insereParede(7, 7);
		GabaritoMapa.insereParede(7, 8);
		GabaritoMapa.insereParede(7, 9);
		GabaritoMapa.insereParede(7, 11);
		GabaritoMapa.insereParede(7, 12);
		GabaritoMapa.insereParede(7, 14);
		GabaritoMapa.insereParede(8, 5);
		GabaritoMapa.insereParede(8, 7);
		GabaritoMapa.insereParede(8, 8);
		GabaritoMapa.insereParede(8, 9);
		GabaritoMapa.insereParede(8, 11);
		GabaritoMapa.insereParede(8, 12);
		GabaritoMapa.insereParede(8, 14);
		GabaritoMapa.insereParede(9, 3);
		GabaritoMapa.insereParede(9, 4);
		GabaritoMapa.insereParede(9, 5);
		GabaritoMapa.insereParede(9, 7);
		GabaritoMapa.insereParede(9, 8);
		GabaritoMapa.insereParede(9, 9);
		GabaritoMapa.insereParede(9, 11);
		GabaritoMapa.insereParede(9, 12);
		GabaritoMapa.insereParede(9, 14);
		GabaritoMapa.insereParede(9, 2);
		GabaritoMapa.insereParede(10, 9);
		GabaritoMapa.insereParede(10, 11);
		GabaritoMapa.insereParede(10, 12);
		GabaritoMapa.insereParede(10, 14);
		GabaritoMapa.insereParede(11, 1);
		GabaritoMapa.insereParede(11, 3);
		GabaritoMapa.insereParede(11, 4);
		GabaritoMapa.insereParede(11, 6);
		GabaritoMapa.insereParede(11, 7);
		GabaritoMapa.insereParede(11, 9);
		GabaritoMapa.insereParede(11, 11);
		GabaritoMapa.insereParede(11, 12);
		GabaritoMapa.insereParede(11, 14);
		GabaritoMapa.insereParede(12, 4);
		GabaritoMapa.insereParede(13, 2);
		GabaritoMapa.insereParede(13, 4);
		GabaritoMapa.insereParede(13, 5);
		GabaritoMapa.insereParede(13, 6);
		GabaritoMapa.insereParede(13, 7);
		GabaritoMapa.insereParede(13, 9);
		GabaritoMapa.insereParede(13, 10);
		GabaritoMapa.insereParede(13, 11);
		GabaritoMapa.insereParede(13, 12);
		GabaritoMapa.insereParede(13, 13);
		GabaritoMapa.insereParede(13, 14);
		GabaritoMapa.insereParede(13, 16);
		GabaritoMapa.insereParede(14, 2);
		GabaritoMapa.insereParede(14, 7);
		GabaritoMapa.insereParede(14, 9);
		GabaritoMapa.insereParede(14, 10);
		GabaritoMapa.insereParede(14, 14);
		GabaritoMapa.insereParede(14, 16);
		GabaritoMapa.insereParede(15, 4);
		GabaritoMapa.insereParede(15, 5);
		GabaritoMapa.insereParede(15, 12);
		GabaritoMapa.insereParede(15, 16);
		GabaritoMapa.insereParede(16, 12);
		GabaritoMapa.insereParede(16, 16);

		// setando os pontos de ponto especial
		GabaritoMapa.inserePontoEspecial(3, 2);
		GabaritoMapa.inserePontoEspecial(1, 14);
		GabaritoMapa.inserePontoEspecial(12, 2);
		GabaritoMapa.inserePontoEspecial(15, 14);

		qtdePonto = 130;
		
		return mapas;
	}
	
	private static PontoMapa[][] _mapa4(){

		// Esta linha deve estar no inicio de todos os mapas. Ele carrega todas as posicoes do 
		// mapa com pontos comuns e as extremidades com paredes.
		GabaritoMapa.iniciaMapa();
		
		// setando os pontos de parede dentro do mapa.
		GabaritoMapa.insereParede(7, 2);
		GabaritoMapa.insereParede(2, 2);
		GabaritoMapa.insereParede(2, 3);
		GabaritoMapa.insereParede(2, 4);
		GabaritoMapa.insereParede(2, 6);
		GabaritoMapa.insereParede(2, 7);
		GabaritoMapa.insereParede(9, 2);
		GabaritoMapa.insereParede(3, 3);
		GabaritoMapa.insereParede(4, 3);
		GabaritoMapa.insereParede(5, 3);
		GabaritoMapa.insereParede(11, 3);
		GabaritoMapa.insereParede(12, 3);
		GabaritoMapa.insereParede(13, 3);
		GabaritoMapa.insereParede(3, 4);
		GabaritoMapa.insereParede(7, 4);
		GabaritoMapa.insereParede(9, 4);
		GabaritoMapa.insereParede(13, 4);
		GabaritoMapa.insereParede(5, 5);
		GabaritoMapa.insereParede(7, 5);
		GabaritoMapa.insereParede(9, 5);
		GabaritoMapa.insereParede(11, 5);
		GabaritoMapa.insereParede(3, 6);
		GabaritoMapa.insereParede(5, 6);
		GabaritoMapa.insereParede(11, 6);
		GabaritoMapa.insereParede(13, 6);
		GabaritoMapa.insereParede(0, 7);
		GabaritoMapa.insereParede(3, 7);
		GabaritoMapa.insereParede(5, 7);
		GabaritoMapa.insereParede(7, 7);
		GabaritoMapa.insereParede(8, 7);
		GabaritoMapa.insereParede(9, 7);
		GabaritoMapa.insereParede(11, 7);
		GabaritoMapa.insereParede(13, 7);
		GabaritoMapa.insereParede(16, 7);
		GabaritoMapa.insereParede(0, 8);
		GabaritoMapa.insereParede(7, 8);
		GabaritoMapa.insereParede(8, 8);
		GabaritoMapa.insereParede(9, 8);
		GabaritoMapa.insereParede(16, 8);
		GabaritoMapa.insereParede(0, 9);
		GabaritoMapa.insereParede(3, 9);
		GabaritoMapa.insereParede(5, 9);
		GabaritoMapa.insereParede(7, 9);
		GabaritoMapa.insereParede(8, 9);
		GabaritoMapa.insereParede(9, 9);
		GabaritoMapa.insereParede(11, 9);
		GabaritoMapa.insereParede(13, 9);
		GabaritoMapa.insereParede(16, 9);
		GabaritoMapa.insereParede(3, 10);
		GabaritoMapa.insereParede(5, 10);
		GabaritoMapa.insereParede(11, 10);
		GabaritoMapa.insereParede(13, 10);
		GabaritoMapa.insereParede(6, 11);
		GabaritoMapa.insereParede(7, 11);
		GabaritoMapa.insereParede(8, 11);
		GabaritoMapa.insereParede(9, 11);
		GabaritoMapa.insereParede(10, 11);
		GabaritoMapa.insereParede(11, 11);
		GabaritoMapa.insereParede(8, 14);
		GabaritoMapa.insereParede(9, 14);
		GabaritoMapa.insereParede(16, 11);
		GabaritoMapa.insereParede(3, 12);
		GabaritoMapa.insereParede(8, 12);
		GabaritoMapa.insereParede(9, 12);
		GabaritoMapa.insereParede(13, 12);
		GabaritoMapa.insereParede(14, 12);
		GabaritoMapa.insereParede(16, 12);
		GabaritoMapa.insereParede(5, 13);
		GabaritoMapa.insereParede(6, 13);
		GabaritoMapa.insereParede(8, 13);
		GabaritoMapa.insereParede(9, 13);
		GabaritoMapa.insereParede(5, 11);
		GabaritoMapa.insereParede(11, 13);
		GabaritoMapa.insereParede(16, 13);
		GabaritoMapa.insereParede(3, 14);
		GabaritoMapa.insereParede(13, 14);
		GabaritoMapa.insereParede(14, 14);
		GabaritoMapa.insereParede(16, 14);
		GabaritoMapa.insereParede(3, 2);
		GabaritoMapa.insereParede(4, 2);
		GabaritoMapa.insereParede(5, 2);
		GabaritoMapa.insereParede(11, 2);
		GabaritoMapa.insereParede(12, 2);
		GabaritoMapa.insereParede(13, 2);
		GabaritoMapa.insereParede(14, 2);
		GabaritoMapa.insereParede(14, 3);
		GabaritoMapa.insereParede(14, 4);
		GabaritoMapa.insereParede(14, 6);
		GabaritoMapa.insereParede(14, 7);
		GabaritoMapa.insereParede(2, 12);
		GabaritoMapa.insereParede(2, 14);
		GabaritoMapa.insereParede(4, 14);
		GabaritoMapa.insereParede(5, 14);
		GabaritoMapa.insereParede(6, 14);
		GabaritoMapa.insereParede(11, 14);
		GabaritoMapa.insereParede(12, 14);
		GabaritoMapa.insereParede(2, 9);
		GabaritoMapa.insereParede(2, 10);
		GabaritoMapa.insereParede(14, 9);
		GabaritoMapa.insereParede(14, 10);
		
		
		// setando os pontos de ponto especial
		GabaritoMapa.inserePontoEspecial(1, 2);
		GabaritoMapa.inserePontoEspecial(1, 14);
		GabaritoMapa.inserePontoEspecial(15, 2);
		GabaritoMapa.inserePontoEspecial(15, 14);

		qtdePonto = 135;
		
		return mapas;
	}
	
	private static PontoMapa[][] _mapa5(){
		
		// Esta linha deve estar no inicio de todos os mapas. Ele carrega todas as posicoes do 
		// mapa com pontos comuns e as extremidades com paredes.
		GabaritoMapa.iniciaMapa();
		
		// setando os pontos de parede dentro do mapa.
		GabaritoMapa.insereParede(5, 2);
		GabaritoMapa.insereParede(11, 2);
		GabaritoMapa.insereParede(5, 3);
		GabaritoMapa.insereParede(6, 3);
		GabaritoMapa.insereParede(8, 3);
		GabaritoMapa.insereParede(10, 3);
		GabaritoMapa.insereParede(11, 3);
		GabaritoMapa.insereParede(3, 4);
		GabaritoMapa.insereParede(8, 4);
		GabaritoMapa.insereParede(13, 4);
		GabaritoMapa.insereParede(6, 5);
		GabaritoMapa.insereParede(8, 5);
		GabaritoMapa.insereParede(10, 5);
		GabaritoMapa.insereParede(0, 6);
		GabaritoMapa.insereParede(2, 6);
		GabaritoMapa.insereParede(4, 6);
		GabaritoMapa.insereParede(12, 6);
		GabaritoMapa.insereParede(14, 6);
		GabaritoMapa.insereParede(16, 6);
		GabaritoMapa.insereParede(0, 7);
		GabaritoMapa.insereParede(4, 7);
		GabaritoMapa.insereParede(5, 7);
		GabaritoMapa.insereParede(7, 7);
		GabaritoMapa.insereParede(8, 7);
		GabaritoMapa.insereParede(9, 7);
		GabaritoMapa.insereParede(11, 7);
		GabaritoMapa.insereParede(12, 7);
		GabaritoMapa.insereParede(16, 7);
		GabaritoMapa.insereParede(0, 8);
		GabaritoMapa.insereParede(2, 8);
		GabaritoMapa.insereParede(3, 8);
		GabaritoMapa.insereParede(4, 8);
		GabaritoMapa.insereParede(5, 8);
		GabaritoMapa.insereParede(7, 8);
		GabaritoMapa.insereParede(8, 8);
		GabaritoMapa.insereParede(9, 8);
		GabaritoMapa.insereParede(11, 8);
		GabaritoMapa.insereParede(12, 8);
		GabaritoMapa.insereParede(13, 8);
		GabaritoMapa.insereParede(14, 8);
		GabaritoMapa.insereParede(16, 8);
		GabaritoMapa.insereParede(0, 9);
		GabaritoMapa.insereParede(7, 9);
		GabaritoMapa.insereParede(8, 9);
		GabaritoMapa.insereParede(9, 9);
		GabaritoMapa.insereParede(16, 9);
		GabaritoMapa.insereParede(2, 10);
		GabaritoMapa.insereParede(3, 10);
		GabaritoMapa.insereParede(5, 10);
		GabaritoMapa.insereParede(11, 10);
		GabaritoMapa.insereParede(13, 10);
		GabaritoMapa.insereParede(14, 10);
		GabaritoMapa.insereParede(5, 11);
		GabaritoMapa.insereParede(7, 11);
		GabaritoMapa.insereParede(8, 11);
		GabaritoMapa.insereParede(9, 11);
		GabaritoMapa.insereParede(11, 11);
		GabaritoMapa.insereParede(3, 12);
		GabaritoMapa.insereParede(5, 12);
		GabaritoMapa.insereParede(11, 12);
		GabaritoMapa.insereParede(13, 12);
		GabaritoMapa.insereParede(13, 2);
		GabaritoMapa.insereParede(5, 13);
		GabaritoMapa.insereParede(7, 13);
		GabaritoMapa.insereParede(8, 13);
		GabaritoMapa.insereParede(9, 13);
		GabaritoMapa.insereParede(11, 13);
		GabaritoMapa.insereParede(3, 14);
		GabaritoMapa.insereParede(5, 14);
		GabaritoMapa.insereParede(11, 14);
		GabaritoMapa.insereParede(7, 15);
		GabaritoMapa.insereParede(8, 15);
		GabaritoMapa.insereParede(5, 16);
		GabaritoMapa.insereParede(11, 16);
		GabaritoMapa.insereParede(2, 2);
		GabaritoMapa.insereParede(2, 4);
		GabaritoMapa.insereParede(3, 2);
		GabaritoMapa.insereParede(13, 4);
		GabaritoMapa.insereParede(14, 2);
		GabaritoMapa.insereParede(14, 4);
		GabaritoMapa.insereParede(7, 1);
		GabaritoMapa.insereParede(8, 1);
		GabaritoMapa.insereParede(9, 1);
		GabaritoMapa.insereParede(2, 12);
		GabaritoMapa.insereParede(2, 14);
		GabaritoMapa.insereParede(13, 14);
		GabaritoMapa.insereParede(14, 14);
		GabaritoMapa.insereParede(14, 12);
		GabaritoMapa.insereParede(9, 15);
		
		// setando os pontos de ponto especial
		GabaritoMapa.inserePontoEspecial(1, 2);
		GabaritoMapa.inserePontoEspecial(15, 2);
		GabaritoMapa.inserePontoEspecial(1, 14);
		GabaritoMapa.inserePontoEspecial(15, 14);

		qtdePonto = 146;
		
		return mapas;
	}

	private static void inserePonto(int posX, int posY) {
		GabaritoMapa.mapas[posX][posY] = new PontoMapa(Constants.PONTO_COMUM_KEY);
	}
	
	private static void inserePontoEspecial(int posX, int posY) {
		GabaritoMapa.mapas[posX][posY] = new PontoMapa(Constants.PONTO_ESPECIAL_KEY);
	}
	
	private static void insereParede(int posX, int posY) {
		GabaritoMapa.mapas[posX][posY] = new PontoMapa(Constants.PAREDE_KEY);
		GabaritoMapa.setQtdePontos();
	}
	
	/**
	 * Decrementa a quantidade de pontos do mapa.
	 */
	public static void setQtdePontos() {
		GabaritoMapa.qtdePonto--;
		System.out.println(GabaritoMapa.qtdePonto);
	}
	
	public static int getQtdePontos() {
		return GabaritoMapa.qtdePonto;
	}
	
	public static void incrementaQtdePontos(){
		qtdePonto++;
	}
	
	public static PontoMapa[][] retornaMapa(int level) {
		switch (level) {
		case 1:
			return GabaritoMapa._mapa2();
		case 2:
			return GabaritoMapa._mapa2();
		case 3:
			return GabaritoMapa._mapa3();
		case 4:
			return GabaritoMapa._mapa4();
		case 5:
			return GabaritoMapa._mapa5();
		}
		return GabaritoMapa._mapa5();
	}
	
	private static void iniciaMapa() {
		// Inicializando todos os pontos do mapa como pontos comuns e as
		// extremidades como paredes.
		for (int i = 0; i < Constants.TAMANHO_DO_MAPA; i++) {
			for (int j = 0; j < Constants.TAMANHO_DO_MAPA; j++) {
				if ((i == 0) || (j == 0)
						|| (i == Constants.TAMANHO_DO_MAPA - 1)
						|| (j == Constants.TAMANHO_DO_MAPA - 1))
					GabaritoMapa.insereParede(i, j);
				else
					GabaritoMapa.inserePonto(i, j);
			}
		}
	}
}
