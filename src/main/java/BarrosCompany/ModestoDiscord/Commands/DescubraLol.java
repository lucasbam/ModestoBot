package BarrosCompany.ModestoDiscord.Commands;

import BarrosCompany.ModestoDiscord.Handlers.MensageHandler;
import BarrosCompany.ModestoDiscord.Interfaces.IComando;
import BarrosCompany.ModestoDiscord.Jogos.JDescubraLol;
import sx.blah.discord.handle.obj.IMessage;

public class DescubraLol implements IComando {
	String playerId;
	JDescubraLol instancia = null;
	
	public void Executar(IMessage msg) {		
		if(instancia == null){
			instancia = new JDescubraLol(msg, this);
			playerId = msg.getAuthor().getID();
		}else{
			if(msg.getAuthor().getID() == playerId)
				MensageHandler.erroJogoAcontecendo(msg);
			else{
				new DescubraLol().Executar(msg);
			}
		}
	}
	
	public void setInstanciaNull(){
		instancia = null;
	}

}
