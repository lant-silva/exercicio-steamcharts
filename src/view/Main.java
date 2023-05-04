package view;

import java.io.IOException;
import javax.swing.JOptionPane;
import controller.SteamController;

public class Main {

	public static void main(String[] args) {
		
		SteamController chart = new SteamController();
		String 
		arquivo = "SteamCharts.csv";
		String path = "C:\\Users\\dti\\AppData\\Local\\Temp";
		String ano = JOptionPane.showInputDialog(null, "Informe o ano");
		String mes = JOptionPane.showInputDialog(null, "Informe o mes(ingles)");
		float media = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a Media"));
		
		try {
			chart.criarCsv(path, arquivo, ano, mes);
			//			chart.mediaJogo(path, arquivo, ano, mes, media);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
