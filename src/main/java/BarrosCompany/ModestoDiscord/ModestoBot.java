package BarrosCompany.ModestoDiscord;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import BarrosCompany.ModestoDiscord.Handlers.EventHandler;
import BarrosCompany.ModestoDiscord.Handlers.HashHandler;
import sx.blah.discord.api.ClientBuilder;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.util.DiscordException;

public class ModestoBot {
	static String Token = "MjgxNTcwNjc3Mjk4MDM2NzM2.C4Z6lg.5deyw9buVaqMxS-VIRnrFjpws8s";
	
	public static IDiscordClient Bot;

	public static void main(String[] args) throws DiscordException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Bot = getClient(Token);
		Bot.getDispatcher().registerListener(new EventHandler());
		new HashHandler();
	}
	
	public static IDiscordClient getClient(String Token) throws DiscordException{
		return new ClientBuilder().withToken(Token).login();
	}

}

