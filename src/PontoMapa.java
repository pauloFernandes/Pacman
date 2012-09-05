
class PontoMapa {
	private int posicao;
	private int posicaoAnterior;
	
	
	public PontoMapa(int pontoInicial) {
		this.posicao         = pontoInicial;
		this.posicaoAnterior = pontoInicial;
	}
	
	/**
	 * @return the posicao
	 */
	public int getPosicao() {
		return posicao;
	}
	
	
	/**
	 * @param posicao the posicao to set
	 */
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	
	/**
	 * @return the posicaoAnterior
	 */
	public int getPosicaoAnterior() {
		return posicaoAnterior;
	}
	
	
	/**
	 * @param posicaoAnterior the posicaoAnterior to set
	 */
	public void setPosicaoAnterior(int posicaoAnterior) {
		this.posicaoAnterior = posicaoAnterior;
	}

		
}