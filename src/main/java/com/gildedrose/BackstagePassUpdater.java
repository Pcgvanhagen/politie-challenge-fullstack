package com.gildedrose;

public class BackstagePassUpdater extends ItemUpdater {

	@Override
	public void updateQuality(Item item) {
		if(item.sellIn <= 0) {
			item.quality = 0;
		} else if (item.sellIn <= 5) {
			if(item.quality < ItemUpdater.MAX_QUALITY)
			item.quality += 3;
		} else if (item.sellIn <= 10) {
			if(item.quality < ItemUpdater.MAX_QUALITY)
			item.quality += 2;
		} else {
			if(item.quality < ItemUpdater.MAX_QUALITY)
			item.quality ++;
		}
	}

}
