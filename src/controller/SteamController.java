package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SteamController {
	
	public void mediaJogo(String path, String name, String ano, String mes, float media) throws IOException{
			
		File arquivo = new File(path, name);
		if(arquivo.exists() && arquivo.isFile()) {
			
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			linha = buffer.readLine();
			while(linha!=null) {
				
				String[] lista = linha.split(",");
				float mediaLista = Float.parseFloat(lista[3]);
				if(ano.contains(lista[1]) && mes.contains(lista[2]) && mediaLista >= media) {
					System.out.println(lista[0]+" | "+lista[3]);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			fluxo.close();
			leitor.close();
		}else {
			throw new IOException("Arquivo Inválido");
		}
	}
}
