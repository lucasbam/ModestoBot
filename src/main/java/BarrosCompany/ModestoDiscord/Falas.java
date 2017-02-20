package BarrosCompany.ModestoDiscord;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

public class Falas {
	String[] Comandos = {"Dominó", "Bina", "Olá"};
	String[] Respostas = {"Instigo","Minha putinha.","Oi bebê"};
	int index;
	
	public void Falar(String comandoEnviado, String id){
	
		try {
			ModestoBot.Bot.getChannelByID(id).sendMessage(Respostas[index]);
		} catch (MissingPermissionsException e) {
			e.printStackTrace();
		} catch (RateLimitException e) {
			e.printStackTrace();
		} catch (DiscordException e) {
			e.printStackTrace();
		}
	}
	
	public boolean falaExiste(String comandoEnviado){
		for(int i = 0; i < Comandos.length; i++){
			if(Comandos[i].toLowerCase().equals(comandoEnviado.toLowerCase())){
				index = i;
				return true;
			}
		}
		return false;
	}
}