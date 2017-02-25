package BarrosCompany.ModestoDiscord;

import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

public class Comandos {
	ComandosManager Manager;
	
	public Comandos(){
		Manager = new ComandosManager();
	}
	
	public void Responder(String msg){
		try {
			ModestoBot.Bot.getChannelByID(Manager.getChannelId()).sendMessage(msg);
		} catch (MissingPermissionsException e) {
			e.printStackTrace();
		} catch (RateLimitException e) {
			e.printStackTrace();
		} catch (DiscordException e) {
			e.printStackTrace();
		}
	}
	
	public void Teste(){
		Responder("Teste concluido com sucesso.");
	}
	



}


