package com.yfletch.rift.lib;

import java.util.Collection;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.WidgetInfo;

public interface IMenuEntryProvider
{
	MenuEntry createInventoryItemEntry(int action, MenuAction menuAction, Collection<Integer> itemIds);

	MenuEntry createDepositItemEntry(int action, MenuAction menuAction, Collection<Integer> itemIds);

	MenuEntry createWithdrawItemEntry(int action, MenuAction menuAction, Collection<Integer> itemIds);

	MenuEntry createObjectEntry(String action, MenuAction menuAction, int objectId);

	MenuEntry createObjectEntry(String action, MenuAction menuAction, TileObject object);

	MenuEntry createNPCEntry(String action, MenuAction menuAction, int npcId);

	MenuEntry createInterfaceEntry(String action, MenuAction menuAction, WidgetInfo widgetInfo);
}
