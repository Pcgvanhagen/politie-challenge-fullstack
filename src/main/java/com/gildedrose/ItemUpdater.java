package com.gildedrose;

public class ItemUpdater {
	
	public void update(Item item) {
		this.updateSellin(item);
		this.updateQuality(item);
	}
	
	public void updateQuality(Item item) {
		if(item.sellIn <= 0) {
			item.quality = Math.max(item.quality-2, 0);
		} else {
			item.quality = Math.max(item.quality-1, 0);
		}
	}
	public void updateSellin(Item item) {
		item.sellIn--;
	}
}
