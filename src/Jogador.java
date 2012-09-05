import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Jogador {
	private String nome;
	private int vidas;
	private long pontos = 0;
	private int comeuFantasma = 0; 
	
	public Jogador(String nome) {
		this.vidas  = 3;
		this.pontos = 0;
		this.nome   = nome;
	}

	/**
	 * @return the vidas
	 */
	public int getVidas() {
		return vidas;
	}

	/**
	 * @param vidas the vidas to set
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	/**
	 * @return the pontos
	 */
	public long getPontos() {
		return pontos;
	}

	/**
	 * @param pontos the pontos to set
	 */
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void incrementaPontos(int pts) {
		this.pontos += pts;
	}
	
	public void incremetaVidas() {
		this.vidas++;
	}
	
	public void decrementaVidas() {
		this.vidas--;
	}
	
	public void setComeuFantasma(int x){
		this.comeuFantasma = x;
	}
	
	public int getComeuFantasma(){
		return this.comeuFantasma;
	}
	
	public void persistJogador() {
		String conteudo = "";
		
		if (new File(Constants.ARQUIVO_PATH).exists()) {
			conteudo = Constants.SEPARADOR_INICIO_REGISTRO + this.nome + Constants.SEPARADOR_PONTO_JOGADOR + this.pontos;
		} else {
			conteudo = this.nome + Constants.SEPARADOR_PONTO_JOGADOR + this.pontos;
		}
		
		try {
			ArquivoExterno.salvar(Constants.ARQUIVO_PATH, conteudo, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
