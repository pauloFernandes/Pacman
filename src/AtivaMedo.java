public class AtivaMedo implements Runnable {
	Fantasma azul;
	Fantasma amarelo;
	Fantasma vermelho;
	Fantasma rosa;
	Jogador jogador;
	Semaforo semaforo,
	          semaforoDesativa;
	Pacman pacman;
	
	public AtivaMedo (Fantasma azul, Fantasma amarelo, Fantasma vermelho, Fantasma rosa, Jogador jogador, Semaforo semaforo, Semaforo desativa, Pacman pacman){
		this.azul = azul;
		this.amarelo = amarelo;
		this.vermelho = vermelho;
		this.rosa = rosa;
		this.jogador = jogador;
		this.semaforo = semaforo;
		this.pacman = pacman;
		this.semaforoDesativa = desativa;
	}
	
	public void run(){
		while(jogador.getVidas()>0){
			semaforo.down();
			
			azul.setScared(true);
			azul.setImagemAtual(Constants.FANTASMA_AZUL_APAVORADO_KEY);
			azul.setVelocidade(Constants.VELOCIDADE_FANTASMA_APAVORADO);
			
			amarelo.setScared(true);
			amarelo.setImagemAtual(Constants.FANTASMA_AMARELO_APAVORADO_KEY);
			amarelo.setVelocidade(Constants.VELOCIDADE_FANTASMA_APAVORADO);
			
			vermelho.setScared(true);
			vermelho.setImagemAtual(Constants.FANTASMA_VERMELHO_APAVORADO_KEY);
			vermelho.setVelocidade(Constants.VELOCIDADE_FANTASMA_APAVORADO);
			
			rosa.setScared(true);
			rosa.setImagemAtual(Constants.FANTASMA_ROSA_APAVORADO_KEY);
			rosa.setVelocidade(Constants.VELOCIDADE_FANTASMA_APAVORADO);
			
			pacman.setFantasmasAssustados(true);
			
			semaforoDesativa.up();
		}
	}

}
