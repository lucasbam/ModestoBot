package BarrosCompany.ModestoBot;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.obj.Message;

public class EventHandler {
	String Prefixo = "~";
	Falas Boca;
	
	@EventSubscriber
	public void onReadyEvent(ReadyEvent event){
		System.out.println("Entrou");
		Boca = new Falas();
	}
	
	@EventSubscriber
	public void onMessageEvent(MessageReceivedEvent event){
		Message m = (Message) event.getMessage();
		String conteudo = m.getContent();
		
		if(conteudo.startsWith("~"))
			if(Boca.falaExiste(conteudo.substring(1)))
				Boca.Falar(conteudo, m.getChannel().getID());
	}
}