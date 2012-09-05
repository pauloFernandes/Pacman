
abstract public class Individuo extends Thread {
	protected boolean direcaoNorte;
	protected boolean direcaoSul;
	protected boolean direcaoLeste;
	protected boolean direcaoOeste;
	protected int posicaoX;
	protected int posicaoY;
	protected int velocidade;
	protected int imagemAtual;
	protected Mapa mapaBase;
	
	
	/**
	 * @return the direcaoNorte
	 */
	
	public boolean isDirecaoNorte() {
		return direcaoNorte;
	}
	
	
	/**
	 * @param direcaoNorte the direcaoNorte to set
	 */
	
	public void setDirecaoNorte(boolean direcaoNorte) {
		this.direcaoNorte = direcaoNorte;
	}
	
	
	/**
	 * @return the direcaoSul
	 */
	
	public boolean isDirecaoSul() {
		return direcaoSul;
	}
	
	
	/**
	 * @param direcaoSul the direcaoSul to set
	 */
	
	public void setDirecaoSul(boolean direcaoSul) {
		this.direcaoSul = direcaoSul;
	}
	
	
	/**
	 * @return the direcaoLeste
	 */
	
	public boolean isDirecaoLeste() {
		return direcaoLeste;
	}
	
	
	/**
	 * @param direcaoLeste the direcaoLeste to set
	 */
	
	public void setDirecaoLeste(boolean direcaoLeste) {
		this.direcaoLeste = direcaoLeste;
	}
	
	
	/**
	 * @return the direcaoOeste
	 */
	
	public boolean isDirecaoOeste() {
		return direcaoOeste;
	}
	
	
	/**
	 * @param direcaoOeste the direcaoOeste to set
	 */
	
	public void setDirecaoOeste(boolean direcaoOeste) {
		this.direcaoOeste = direcaoOeste;
	}
	
	
	/**
	 * @return the posicaoX
	 */
	
	public int getPosicaoX() {
		return posicaoX;
	}
	
	
	/**
	 * @param posicaoX the posicaoX to set
	 */
	
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	
	/**
	 * @return the posicaoY
	 */
	
	public int getPosicaoY() {
		return posicaoY;
	}
	
	
	/**
	 * @param posicaoY the posicaoY to set
	 */
	
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	
	/**
	 * @return the velocidade
	 */
	
	public int getVelocidade() {
		return velocidade;
	}
	
	
	/**
	 * @param velocidade the velocidade to set
	 */
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	/**
	 * @return the imagemAtual
	 */
	
	public int getImagemAtual() {
		return imagemAtual;
	}
	
	
	/**
	 * @param imagemAtual the imagemAtual to set
	 */
	
	public void setImagemAtual(int imagemAtual) {
		this.imagemAtual = imagemAtual;
	}
	
	
	/**
	 * Altera a direcao do individuo para a direcao
	 * passada como parametro.
	 * 
	 * @param novaDirecao
	 */
	
	public void alteraDirecao (int novaDirecao) {
		switch (novaDirecao) {
		// direcao norte
		case 0:
			this.direcaoNorte = true;
			this.direcaoSul   = false;
			this.direcaoLeste = false;
			this.direcaoOeste = false;
			break;
		// direcao sul
		case 1:
			this.direcaoNorte = false;
			this.direcaoSul   = true;
			this.direcaoLeste = false;
			this.direcaoOeste = false;
			break;
		// direcao leste
		case 2:
			this.direcaoNorte = false;
			this.direcaoSul   = false;
			this.direcaoLeste = true;
			this.direcaoOeste = false;
			break;
		// direcao oeste
		case 3:
			this.direcaoNorte = false;
			this.direcaoSul   = false;
			this.direcaoLeste = false;
			this.direcaoOeste = true;
			break;
		}
	}

	
	/**
	 * retorna a direcao atual do individuo.
	 * 
	 * @return
	 */
	
	
	public int getDirecao () {
		if(this.direcaoNorte)
			return 0;
		if (this.direcaoSul)
			return 1;
		if(this.direcaoOeste)
			return 2;
		else
			return 3;
	}
	
	
}
