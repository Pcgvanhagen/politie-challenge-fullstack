package com.gildedrose;

import java.util.Arrays;
import java.util.Optional;

public class InventoryManager {

	private static String[] legendary = {"Sulfuras, Hand of Ragnaros"};
	private static String[] backstagePasses = {"Backstage passes to a TAFKAL80ETC concert"};
	private static String[] vintage = {"Aged Brie"};
	private static String[] conjured = {"Conjured Mana Cake"};
	
	private static ItemUpdater updater = new ItemUpdater();
	private static LegendaryUpdater lUpdater = new LegendaryUpdater();
	private static BackstagePassUpdater bUpdater = new BackstagePassUpdater();
	private static VintageUpdater vUpdater = new VintageUpdater();
	private static ConjuredUpdater cUpdater = new ConjuredUpdater();
	
	public static ItemUpdater getUpdater(String item) {
		if(Arrays.stream(legendary).anyMatch(item::equals)) {
			return InventoryManager.lUpdater;
		} else if (Arrays.stream(backstagePasses).anyMatch(item::equals)) {
			return InventoryManager.bUpdater;
		} else if (Arrays.stream(vintage).anyMatch(item::equals)) {
			return InventoryManager.vUpdater;
		} else if (Arrays.stream(conjured).anyMatch(item::equals)) {
			return InventoryManager.cUpdater;
		} else {
			return InventoryManager.updater;
		}
	}
}
