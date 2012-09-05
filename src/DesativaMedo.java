import java.util.Timer;

public class DesativaMedo implements Runnable {
	Fantasma azul;
	Fantasma amarelo;
	Fantasma vermelho;
	Fantasma rosa;
	Jogador jogador;
	Semaforo semaforo;
	Pacman pacman;
	
	public DesativaMedo (Fantasma azul, Fantasma amarelo, Fantasma vermelho, Fantasma rosa, Jogador jogador, Semaforo semaforo, Pacman pacman){
		this.azul = azul;
		this.amarelo = amarelo;
		this.vermelho = vermelho;
		this.rosa = rosa;
		this.jogador = jogador;
		this.semaforo = semaforo;
		this.pacman = pacman;
	}
	
	public void run(){
		while(jogador.getVidas() > 0)
		{
			semaforo.down();
			try{
				Thread.sleep(Constants.TEMPO_FANTASMA_APAVORADO);
				}
			catch(InterruptedException e) { }
			
			azul.setScared(false);
			azul.setImagemAtual(Constants.FANTASMA_AZUL_KEY);
			azul.setVelocidade(Constants.VELOCIDADE_FANTASMA);
		
			amarelo.setScared(false);
			amarelo.setImagemAtual(Constants.FANTASMA_AMARELO_KEY);
			amarelo.setVelocidade(Constants.VELOCIDADE_FANTASMA);
		
			vermelho.setScared(false);
			vermelho.setImagemAtual(Constants.FANTASMA_VERMELHO_KEY);
			vermelho.setVelocidade(Constants.VELOCIDADE_FANTASMA);
			
			rosa.setScared(false);		
			rosa.setImagemAtual(Constants.FANTASMA_ROSA_KEY);
			rosa.setVelocidade(Constants.VELOCIDADE_FANTASMA);
			
			pacman.setFantasmasAssustados(false);
		}
	}

}
