package com.gildedrose;

public class VintageUpdater extends ItemUpdater {

	@Override
	public void updateQuality(Item item) {
		if(item.quality < ItemUpdater.MAX_QUALITY) {
			item.quality++;
		}
	}

}
