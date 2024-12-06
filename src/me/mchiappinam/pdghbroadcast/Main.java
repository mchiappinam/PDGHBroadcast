package me.mchiappinam.pdghbroadcast;

import java.util.Random;

import org.bukkit.event.EventHandler;
//import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
//import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHBroadcast] §2ativando... - Plugin by: mchiappinam");
		getServer().getPluginManager().registerEvents(this, this);
		start();
		getServer().getConsoleSender().sendMessage("§3[PDGHBroadcast] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHBroadcast] §2Acesse: http://pdgh.com.br/");
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHBroadcast] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHBroadcast] §2Acesse: http://pdgh.com.br/");
	}
	
	public void start() {
		getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
	  		public void run() {
	        	Random randomgen = new Random();
	        	int i = randomgen.nextInt(12) + 1;
	        	if(i == 1) {
		  			getServer().broadcastMessage("§a§l[§7§l/Ajuda§a§l] §7É novato? Precisa de ajuda? Verifique se o §a§l/ajuda §7pode te ajudar.");
	        	}else if(i == 2) {
		  			getServer().broadcastMessage("§a§l[§7§lNovidades§a§l] §7Já sabe quais são as novidades? Veja: §ahttp://pdgh.com.br/changelog");
	        	}else if(i == 3) {
		  			getServer().broadcastMessage("§a§l[§7§lTeamSpeak§a§l] §7Participe de nosso TeamSpeak: §ats.pdgh.com.br");
	        	}else if(i == 4) {
		  			getServer().broadcastMessage("§a§l[§7§lFórum§a§l] §7Participe de nosso fórum: §ahttp://pdgh.com.br/forum");
	        	}else if(i == 5) {
		  			getServer().broadcastMessage("§a§l[§7§lTextura§a§l] §7Baixe a textura da PDGH: §ahttp://pdgh.com.br/textura");
	        	}else if(i == 6) {
		  			getServer().broadcastMessage("§a§l[§7§lSTAFF§a§l] §bQuer ser staffer, designer ou até mesmo construtor para fazer parte de nossa equipe? Vá até a aba 'Outros' no nosso site e escolha a opção desejada. Site: §ahttp://pdgh.com.br/");
	        	}else if(i == 7) {
		  			getServer().broadcastMessage("§a§l[§7§l/DESBUGAR§a§l] §aRaros jogadores bugam(ficam parados para os outros jogadores). Implantamos um sistema de se desbugar utilizando o comando /d. (Pode ser utilizado em PvP)");
	        	}else if(i == 8) {
		  			getServer().broadcastMessage("§c[Download de Plugins] §bBaixe alguns de nossos plugins no link a seguir: https://goo.gl/qdQgDR");
	        	}//else{// if(i == 8) {
		  			//getServer().broadcastMessage("§2§l[§7§l/REPORTAR§2§l] §2Reporte jogadores que estão infringindo as regras com o comando /reportar");
	        		//getServer().broadcastMessage("§3§l[PvP] §2Servidor sendo TOTALMENTE revitalizado. O mesmo estará disponível para jogar em breve! Preparem-se para jogar no MELHOR SERVIDOR DE PVP da história do Minecraft!");
	        	
	        	//else{
	        		/**getServer().broadcastMessage("§3§l[PDGH] §aAniversário PDGH! 4 anos! <3");
					getServer().broadcastMessage("§3§l[PDGH] §bSorteio de contas de e-mail exclusivas @pdgh.com.br");
					getServer().broadcastMessage("§3§l[PDGH] §bItens exclusivos de aniversário");
					getServer().broadcastMessage("§3§l[PDGH] §bCorra, promoção até o dia §c§l31/05§b.");
					getServer().broadcastMessage("§3§l[PDGH] §bMais informações acesse: §c§lwww.pdgh.com.br/promo");*/
	        		//getServer().broadcastMessage("§f§lSopas desativadas. Consiga os novos itens de regeneração em loots espalhados pelo mapa.");
//		  			getServer().broadcastMessage(" ");
//		  			getServer().broadcastMessage("§6§l[»VIP«] §7O VIP está em promoção apenas esse mês. Veja: http://pdgh.com.br/promo/");
//		  			getServer().broadcastMessage(" ");
	        	//}
	  		}
		}, 0, 2*65*20*1);
	}
	
	@EventHandler
	public void onPlayerJoin(final PlayerJoinEvent e) {
		getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
			public void run() {
				if(e.getPlayer()==null)
					return;
				e.getPlayer().sendMessage("§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=");
				/**e.getPlayer().sendMessage("§3§l[PDGH] §aAniversário PDGH! 4 anos! <3");
				e.getPlayer().sendMessage("§3§l[PDGH] §bSorteio de contas de e-mail exclusivas @pdgh.com.br");
				e.getPlayer().sendMessage("§3§l[PDGH] §bItens exclusivos de aniversário");
				e.getPlayer().sendMessage("§3§l[PDGH] §bCorra, promoção até o dia §c§l31/05§b.");
				e.getPlayer().sendMessage("§3§l[PDGH] §bMais informações acesse: §c§lwww.pdgh.com.br/promo");*/
				e.getPlayer().sendMessage(" ");
				e.getPlayer().sendMessage("§6§l[»VIP«] §7O VIP está em promoção apenas esse mês. Veja: http://pdgh.com.br/promo/");
				e.getPlayer().sendMessage(" ");
				e.getPlayer().sendMessage("§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=§b§l=§a§l=");
			}
		}, 100L);
	}
	
	
	
	
	
	
}