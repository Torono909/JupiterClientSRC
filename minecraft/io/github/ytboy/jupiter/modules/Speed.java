package io.github.ytboy.jupiter.modules;
package io.github.ytboy.jupiter.modules;

import org.lwjgl.input.Keyboard;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;

import io.github.ytboy.jupiter.event.EventPostUpdate;
import io.github.ytboy.jupiter.event.EventPreUpdate;
import io.github.ytboy.jupiter.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketAnimation;

public class Speed extends Module {
	public Speed() {
		super("Speed", "Like Timer but only bypass with the right settings.", Keyboard.KEY_O, Category.MOVEMENT);
  }
