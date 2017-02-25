package BarrosCompany.ModestoDiscord;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.obj.Message;

public class EventHandler {
	String Prefixo = "~";
	static String channelId;
	ComandosManager Manager;

	@EventSubscriber
	public void onReadyEvent(ReadyEvent event){
		System.out.println("Entrou");
		try{
			Manager = new ComandosManager();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@EventSubscriber
	public void onMessageEvent(MessageReceivedEvent event){
		Message m = (Message) event.getMessage();
		String conteudo = m.getContent();
		channelId = m.getChannel().getID();
		
		if(conteudo.startsWith("~"))
		{
			Manager.checarComando(conteudo.substring(1));
		}
//			if(Boca.falaExiste(conteudo.substring(1)))
//				Boca.Falar(conteudo, m.getChannel().getID());
	}
}