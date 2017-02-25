package BarrosCompany.ModestoDiscord;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Leitor {

	private Hashtable<String, String> falas;
	private Hashtable<String, String> cmds;


	public Leitor(){
		falas = new Hashtable<String, String>();
		cmds = new Hashtable<String, String>();
		try {
			organizarDicionarios();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void organizarDicionarios() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Dialogo.txt"), "UTF-8"));
		
		while(br.ready()){
			   String[] linha = br.readLine().split("=");
			   falas.put(linha[0], linha[1]);
		}
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("Comandos.txt"), "UTF-8"));
		
		while(br2.ready()){
			   String[] line = br2.readLine().split("=");
			   cmds.put(line[0], line[1]);
		}
		
		br.close();
		br2.close();
	}
	
	public Hashtable<String, String> getFalas() {
		return falas;
	}
	
	public Hashtable<String, String> getCmds() {
		return cmds;
	}
}
