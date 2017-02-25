package BarrosCompany.ModestoDiscord;

import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.MissingPermissionsException;
import sx.blah.discord.util.RateLimitException;

public class Comandos {
	String channelId;

	public void Responder(String msg){
		channelId = EventHandler.channelId;
		
		try {
			ModestoBot.Bot.getChannelByID(channelId).sendMessage(msg);
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


