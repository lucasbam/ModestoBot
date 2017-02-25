package BarrosCompany.ModestoDiscord;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;

public class ComandosManager {
	
	Leitor Dicionarios;
	Hashtable<String, String> Falas;
	Hashtable<String, String> Acoes;
	
	Comandos listaComandos;
	String channelId;
	
	public ComandosManager(){
		listaComandos = new Comandos();
		Dicionarios = new Leitor();
		Falas = Dicionarios.getFalas();
		Acoes = Dicionarios.getCmds();
	}
	
	public void checarComando(String Comando){
		String[] fullCmd = Comando.split(" ");
		String comando = fullCmd[0];
		String args = null;
		
		if(fullCmd.length > 1)
			args = fullCmd[1];
		
		boolean isFala = existeComando(Falas, comando);
		boolean isAcao = existeComando(Acoes, comando);
		
		if (isFala)
			listaComandos.Responder(Falas.get(comando.toLowerCase()));
		
		if (isAcao){
			Class<?> c = null;
			
			try {
				c = Class.forName("BarrosCompany.ModestoDiscord.Comandos");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
			try {
				Method m = c.getDeclaredMethod(Acoes.get(comando.toLowerCase()));
				if(m.getParameterTypes().length > 0)
					m.invoke(this, args);
				else
					m.invoke(this);
			} catch(InvocationTargetException x){
				x.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public boolean existeComando(Hashtable<String, String> Dicionario, String key){
		return Dicionario.containsKey(key);
	}
	
	public void setChannelId(String id){
		channelId = id;
	}
	
	public String getChannelId(){
		return channelId;
		
	}
}
