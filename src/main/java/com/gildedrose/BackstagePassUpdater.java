package com.gildedrose;

public class BackstagePassUpdater extends ItemUpdater {

	@Override
	public void updateQuality(Item item) {
		if(item.sellIn <= 0) {
			item.quality = 0;
		} else if (item.sellIn <= 5) {
			item.quality = Math.min(item.quality + 3, ItemUpdater.MAX_QUALITY);
		} else if (item.sellIn <= 10) {
			item.quality = Math.min(item.quality + 2, ItemUpdater.MAX_QUALITY);
		} else {
			item.quality = Math.min(item.quality + 1, ItemUpdater.MAX_QUALITY);
		}
	}

}
