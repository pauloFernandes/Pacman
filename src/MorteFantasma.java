
public class MorteFantasma implements Runnable {
	Fantasma azul;
	Fantasma amarelo;
	Fantasma vermelho;
	Fantasma rosa;
	Jogador jogador;
	Semaforo semaforo;
	
	public MorteFantasma(Fantasma azul, Fantasma amarelo, Fantasma vermelho, Fantasma rosa, Jogador jogador, Semaforo semaforo){
		this.azul = azul;
		this.amarelo = amarelo;
		this.vermelho = vermelho;
		this.rosa = rosa;
		
		this.jogador = jogador;
		
		this.semaforo = semaforo;
	}
	
	public void run(){
		while(jogador.getVidas() > 0){
			semaforo.down();
			if(jogador.getComeuFantasma() == 1){
				azul.stop();
			}
			else if(jogador.getComeuFantasma() == 2){
				amarelo.stop();
			}
			else if(jogador.getComeuFantasma() == 3){
				rosa.stop();
			}
			else if(jogador.getComeuFantasma() == 4){
				vermelho.stop();
			}
		}
	}

}
