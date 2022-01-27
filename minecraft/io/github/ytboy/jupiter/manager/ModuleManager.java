package io.github.ytboy.jupiter.manager;

import java.util.ArrayList;
import java.util.List;

import io.github.ytboy.jupiter.module.Module;
import io.github.ytboy.jupiter.modules.*;

public class ModuleManager {
	public static List<Module> MODS;
	public ModuleManager() {
		MODS = new ArrayList<>();
		this.MODS.add(new Sprint());
		this.MODS.add(new Killaura());
		this.MODS.add(new ElytraFly());
		this.MODS.add(new ESP());
		this.MODS.add(new Speed());
	}
	public void start() {
	}
	public void addMods() {
		
	}
}
