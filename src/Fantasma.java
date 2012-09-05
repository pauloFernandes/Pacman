import java.util.Random;


public class Fantasma extends Individuo{
	private boolean scared;
	private int scaredTimeRemaining;
	private int corOriginalFantasma;
	private Semaforo  semaforoMorteP,
	                   semaforoMorteF;
	
	
	public Fantasma(int corFantasma, int pos_x, int pos_y, int direcao_fantasma, Mapa mapa, Semaforo  semaforoMorteP, Semaforo semaforoMorteF) {
		this.alteraDirecao(direcao_fantasma);
		this.scared              = false;
		this.scaredTimeRemaining = 0;
		this.corOriginalFantasma = corFantasma;
		this.imagemAtual         = this.corOriginalFantasma;
		this.posicaoX            = pos_x;
		this.posicaoY            = pos_y;
		this.velocidade          = Constants.VELOCIDADE_FANTASMA;
		this.mapaBase = mapa;
		this.mapaBase.carregaPersonagem(this);
		this. semaforoMorteP =  semaforoMorteP;
		this.semaforoMorteF = semaforoMorteF;
	}

	
	/**
	 * @return the scared
	 */
	
	public boolean isScared() {
		return scared;
	}

	
	/**
	 * @param scared the scared to set
	 */
	
	public void setScared(boolean scared) {
		scared = scared;
	}

	
	/**
	 * @return the scaredTimeRemaining
	 */
	
	public int getScaredTimeRemaining() {
		return scaredTimeRemaining;
	}

	
	/**
	 * @param scaredTimeRemaining the scaredTimeRemaining to set
	 */
	
	public void setScaredTimeRemaining(int scaredTimeRemaining) {
		this.scaredTimeRemaining = scaredTimeRemaining;
	}

	
	/**
	 * @return the corOriginalFantasma
	 */
	
	public int getCorOriginalFantasma() {
		return corOriginalFantasma;
	}

	
	/**
	 * @param corOriginalFantasma the corOriginalFantasma to set
	 */
	
	public void setCorOriginalFantasma(int corOriginalFantasma) {
		this.corOriginalFantasma = corOriginalFantasma;
	}
	
	private boolean movimento(int x, int y, int direcao, int coordenada){
		int posX = this.getPosicaoX();
		int posY = this.getPosicaoY();
		
		if (this.mapaBase.getPosicaoMapa(posX + x, posY + y) != Constants.PAREDE_KEY) {
			if (this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.PACMAN_ABAIXO_KEY || this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.PACMAN_ACIMA_KEY ||  this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.PACMAN_DIREITA_KEY ||  this.mapaBase.getPosicaoMapa(posX + x, posY + y) == Constants.PACMAN_ESQUERDA_KEY) {
				if(this.imagemAtual != Constants.FANTASMA_AZUL_APAVORADO_KEY && this.imagemAtual != Constants.FANTASMA_AMARELO_APAVORADO_KEY && this.imagemAtual != Constants.FANTASMA_ROSA_APAVORADO_KEY && this.imagemAtual != Constants.FANTASMA_VERMELHO_APAVORADO_KEY){
					this.mapaBase.jogador.decrementaVidas();
					this.mapaBase.atualizaNumVidas(mapaBase.jogador.getVidas());
					semaforoMorteP.up();
				}
				else {
					if (this.imagemAtual == Constants.FANTASMA_AZUL_APAVORADO_KEY) {
						this.mapaBase.jogador.setComeuFantasma(1);
					}
					else if (this.imagemAtual == Constants.FANTASMA_AMARELO_APAVORADO_KEY) {
						this.mapaBase.jogador.setComeuFantasma(2);
					}
					else if (this.imagemAtual == Constants.FANTASMA_ROSA_APAVORADO_KEY) {
						this.mapaBase.jogador.setComeuFantasma(3);
					}
					else if(this.imagemAtual == Constants.FANTASMA_VERMELHO_APAVORADO_KEY) {
						this.mapaBase.jogador.setComeuFantasma(4);
					}
					semaforoMorteF.up();
					this.mapaBase.jogador.incrementaPontos(Constants.PONTUACAO_FANTASMA);
					this.mapaBase.atualizaPontuacao(this.mapaBase.jogador.getPontos());
				}
			}
			this.alteraDirecao(direcao);
			this.mapaBase.setPosicaoMapa(posX, posY, this.mapaBase.getPosicaoAnteriorMapa(posX, posY));
			if(coordenada == 0)
			    this.setPosicaoY(posY + y);
			else
				this.setPosicaoX(posX + x);
			this.mapaBase.carregaPosicaoMapa(posX, posY, this.mapaBase.getPosicaoAnteriorMapa(posX, posY));
			this.mapaBase.carregaPersonagem(this);
			return true;
		}
		
		return false;
	}
	
	private boolean movimentaParaNorte() {
		return movimento(0, -1, 0, 0);
	}

	private boolean movimentaParaSul() {
		return movimento(0, 1, 1, 0);
	}
	
	private boolean movimentaParaLeste() {
		return movimento(1, 0, 3, 1);
	}
	
	private boolean movimentaParaOeste() {
		return movimento(-1, 0, 2, 1);
	}

	private void passoFantasma() {
		boolean movimentou = false;
		
		do {
			Random r = new Random();
			int direcaoFantasma = Math.abs(r.nextInt() % 4);
			movimentou = this.movimentoFantasma(direcaoFantasma);
		}
		while (!movimentou);
		
		try {
			Thread.sleep(Constants.VELOCIDADE_FANTASMA);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private boolean movimentoFantasma(int direcao) {
		if (direcao == 0 && this.getDirecao() != 1) {
			return this.movimentaParaNorte();
		} else if (direcao == 1 && this.getDirecao() != 0) {
			return this.movimentaParaSul();
		} else if (direcao == 2 && this.getDirecao() != 3) {
			return this.movimentaParaLeste();
		} else if (direcao == 3 && this.getDirecao() != 2) {
			return this.movimentaParaOeste();
		} else {
			return false;
		}
	}



	@Override
	public void run() {
		while (true) {
			this.passoFantasma();
		}
	}
}






