package com.shirkit.todo;

import codechicken.nei.api.IConfigureNEI;
import codechicken.nei.forge.GuiContainerManager;

import com.shirkit.todo.handler.DrawHandler;
import com.shirkit.todo.handler.InputHandler;
import com.shirkit.todo.handler.TooltipHandler;

public class NEITodoConfig implements IConfigureNEI {

	@Override
	public void loadConfig() {
		GuiContainerManager.addDrawHandler(new DrawHandler());
		GuiContainerManager.addInputHandler(new InputHandler());
		GuiContainerManager.addTooltipHandler(new TooltipHandler());
	}

	@Override
	public String getName() {
		return "To-Do Mod";
	}

	@Override
	public String getVersion() {
		return "@VERSION@";
	}

}
