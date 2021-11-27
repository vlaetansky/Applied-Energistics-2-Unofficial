package appeng.integration.modules.NEIHelpers;

import appeng.client.gui.implementations.GuiMEMonitorable;
import codechicken.nei.api.INEIGuiAdapter;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.ItemStack;

public class NEIGuiHandler extends INEIGuiAdapter {
    @Override
    public boolean handleDragNDrop(GuiContainer gui, int mousex, int mousey, ItemStack draggedStack, int button) {
        if (gui instanceof GuiMEMonitorable && draggedStack != null && draggedStack.getItem() != null)
        {
            GuiMEMonitorable gmm = (GuiMEMonitorable)gui;
            if (gmm.isOverSearchField(mousex, mousey))
            {
                gmm.setSearchString(draggedStack.getDisplayName(), true);
                return true;
            }
        }
        return super.handleDragNDrop(gui, mousex, mousey, draggedStack, button);
    }
}
