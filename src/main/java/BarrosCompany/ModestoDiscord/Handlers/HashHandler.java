package BarrosCompany.ModestoDiscord.Handlers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class HashHandler {
	static Hashtable<String,String> Falas;
	
	public HashHandler() throws IOException{
		Falas = new Hashtable<String, String>();
		criarDicionario("Dialogo.txt", Falas);
	}
	
	public void criarDicionario(String nomeArquivo, Hashtable<String, String> Dicionario) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(nomeArquivo), "UTF-8"));
		
		while(br.ready()){
			String[] linha = br.readLine().split("=");
			Dicionario.put(linha[0], linha[1]);   
		}
		
		br.close();
	}

}
