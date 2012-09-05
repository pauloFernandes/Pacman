import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Tela {

	/**
	 * @param args
	 */
	
	public static void iniciaMapa(int nivel, Jogador jogador) {
		Mapa map = new Mapa(jogador, nivel);
		map.show();	
		
		Semaforo semaforoAtiva    = new Semaforo(0);
		Semaforo semaforoDesativa = new Semaforo(0);
		Semaforo semaforoMorteP   = new Semaforo(0);
		Semaforo semaforoMorteF   = new Semaforo(1);
		
		Fantasma fantasmaAmarelo  = new Fantasma(Constants.FANTASMA_AMARELO_KEY, 7, 9, 3, map, semaforoMorteP, semaforoMorteF);
		Fantasma fantasmaAzul     = new Fantasma(Constants.FANTASMA_AZUL_KEY, 7, 7, 3, map, semaforoMorteP, semaforoMorteF);
		Fantasma fantasmaVermelho = new Fantasma(Constants.FANTASMA_VERMELHO_KEY, 9, 7, 2, map, semaforoMorteP, semaforoMorteF);
		Fantasma fantasmaRosa     = new Fantasma(Constants.FANTASMA_ROSA_KEY, 9, 9, 2, map, semaforoMorteP, semaforoMorteF);
		
		
		Pacman pacman = new Pacman(12, 14, 3, map,semaforoAtiva, semaforoMorteP, semaforoMorteF);
		
		AtivaMedo ativaMedo = new AtivaMedo(fantasmaAzul, fantasmaAmarelo, fantasmaVermelho, fantasmaRosa, jogador, semaforoAtiva, semaforoDesativa, pacman);
		DesativaMedo desativaMedo = new DesativaMedo(fantasmaAzul, fantasmaAmarelo, fantasmaVermelho, fantasmaRosa, jogador, semaforoDesativa, pacman);
		
		MorteFantasma morteFantasma= new MorteFantasma(fantasmaAzul, fantasmaAmarelo, fantasmaVermelho, fantasmaRosa, jogador, semaforoMorteF);
		MortePacman mortePacman = new MortePacman(fantasmaAzul, fantasmaAmarelo, fantasmaVermelho, fantasmaRosa, jogador, semaforoAtiva, semaforoMorteP, map, pacman);
		
		ExecutorService exec = Executors.newFixedThreadPool(4);
		
		fantasmaAmarelo.start();
		fantasmaAzul.start();
		fantasmaRosa.start();
		fantasmaVermelho.start();
		pacman.start();
		
		exec.submit(ativaMedo);
		exec.submit(desativaMedo);
		exec.submit(mortePacman);
		exec.submit(morteFantasma);
		
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
