

public class MortePacman implements Runnable {
	Fantasma azul;
	Fantasma amarelo;
	Fantasma vermelho;
	Fantasma rosa;
	Jogador jogador;
	Semaforo semaforoAtiva,
	          semaforoMorteP;
	Mapa map;
	Pacman pacman;
	
	public MortePacman(Fantasma azul, Fantasma amarelo, Fantasma vermelho, Fantasma rosa, Jogador jogador, Semaforo semaforoAtiva, Semaforo semaforoMorteP, Mapa map, Pacman pacman){
		this.azul = azul;
		this.amarelo = amarelo;
		this.vermelho = vermelho;
		this.rosa = rosa;
		
		this.jogador = jogador;
		
		this.semaforoAtiva = semaforoAtiva;
		this.semaforoMorteP = semaforoMorteP;
		
		this.map = map;
		
		this.pacman = pacman;
	}
	
	public void run(){
		while(jogador.getVidas() >= 0){
			semaforoMorteP.down();
			if(jogador.getVidas() == 0){
				amarelo.stop();
				azul.stop();
				vermelho.stop();
				rosa.stop();
				jogador.persistJogador();
				DoRank a = new DoRank(this.jogador);
				a.doRankString();
				this.map.setVisible(false);
				TelaInicial.getInstance().mostrarJanela();
			}
		}
	}
}
