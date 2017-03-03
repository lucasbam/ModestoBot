package BarrosCompany.ModestoDiscord.Jogos;
import BarrosCompany.ModestoDiscord.Commands.DescubraLol;
import BarrosCompany.ModestoDiscord.Handlers.MensageHandler;
import sx.blah.discord.handle.obj.IMessage;

public class JDescubraLol{
	DescubraLol Instancia;
	
	public JDescubraLol(IMessage msg, DescubraLol f){
		Instancia = f;
		MensageHandler.enviarMensagem("Jogo ok!", msg);
	}

}
