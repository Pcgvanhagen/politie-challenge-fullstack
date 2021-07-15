package com.gildedrose;

public class VintageUpdater extends ItemUpdater {

	@Override
	public void updateQuality(Item item) {
		if(item.quality < 50) {
			item.quality++;
		}
	}

}
