package com.gildedrose;

public class VintageUpdater extends ItemUpdater {

	@Override
	public void updateQuality(Item item) {
		item.quality = Math.min(item.quality + 1, ItemUpdater.MAX_QUALITY);
	}

}
