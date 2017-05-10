package me.foodle.opm;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

/*****************************
 *  Class made by Foodle in
 * 12/04/2017
 ****************************/
public class OnePunchMan extends JavaPlugin implements Listener {

    public void onEnable(){
        getServer().getPluginManager().registerEvents(this,this);
    }
    @EventHandler
    public void hitUser(EntityDamageByEntityEvent e){
        if(e.getDamager() instanceof Player){
            if(e.getEntity() instanceof Player){
                Player player = (Player) e.getEntity();
                if(player.getName().equalsIgnoreCase("Boros")){
                    player.setHealth(player.getHealth() - 10);
                }
            }
            if(e.getEntity() instanceof LivingEntity){
                ((LivingEntity)e.getEntity()).setHealth(0);
            }
        }
    }


}
