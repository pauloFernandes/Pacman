import java.io.IOException;

import javax.swing.JOptionPane;


public class DoRank {
	private String fullText;
	private Jogador jogador;
	
	public DoRank(Jogador jogador) {
		try {
			fullText = ArquivoExterno.carregar(Constants.ARQUIVO_PATH);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		this.jogador = jogador;
	}
	
	
	public void doRankString() {
		String[] registros = this.fullText.split(Constants.SEPARADOR_INICIO_REGISTRO);
		String nome[] = new String[registros.length];
		int pontos[]  = new int[registros.length];
		
		for (int i = 0; i < registros.length; i++) {
			String[] aux = registros[i].split(Constants.SEPARADOR_PONTO_JOGADOR);
			
			nome[i]   = aux[0];
			pontos[i] = Integer.parseInt(aux[1]);
		}
		
		bubbleSort(pontos, nome);

		if (nome[0].equals(jogador.getNome()) && pontos[0] == jogador.getPontos()) {
			JOptionPane.showMessageDialog(null, "Novo Record!!!");
		}
		
		this.imprimeRecordList(nome, pontos);
	}
	
	private void imprimeRecordList(String[] nomes, int[] pontos) {
		String recordList = "Lista de recordistas: \n";
		for (int i = 0; i < nomes.length && i < 10; i++) {
			recordList += nomes[i] + "     " + pontos[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, recordList);
	}
	
	private void bubbleSort (int [] pontos, String nomes[]){

		boolean houveTroca = true;

		while (houveTroca == true) {
			houveTroca = false;
			for (int i = 0; i < (pontos.length)-1; i++){
				if (pontos[i] < pontos[i+1]){
					int auxInt       = pontos[i+1];
					String auxString = nomes[i+1];
					pontos[i+1]      = pontos[i];
					nomes[i+1]       = nomes[i];
					pontos[i]        = auxInt;
					nomes[i]         = auxString;
					houveTroca       = true;
				}
			}
		}         
	}
	
	
}
