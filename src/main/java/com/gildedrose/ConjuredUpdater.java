package com.gildedrose;

public class ConjuredUpdater extends ItemUpdater {


	@Override
	public void updateSellin(Item item) {
		item.sellIn -=2;
	}

}
