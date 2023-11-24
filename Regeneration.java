package regeneration.regeneration;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Regeneration extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
    getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void regen(PlayerDeathEvent event) {
        Player killer = event.getEntity().getKiller();
        killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 250, 1));
        killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 165, 1));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
