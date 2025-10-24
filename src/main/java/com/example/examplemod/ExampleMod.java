package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod("examplemod")
public class ExampleMod {

    public ExampleMod() {
        // Constructor code, runs when mod is loaded
    }

    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        // Simple event: greet the player when they join
        event.getPlayer().sendSystemMessage(new net.minecraft.network.chat.TextComponent("Hello from Example Mod!"));
    }
}
