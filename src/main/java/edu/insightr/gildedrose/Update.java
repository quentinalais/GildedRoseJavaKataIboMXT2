package edu.insightr.gildedrose;

public class Update {

    public int AgedBrie(Item i) {

        int quality = i.getQuality();
        int sellIn = i.getSellIn();

        if (sellIn > 0) {
            quality = quality + 1;
        } else {
            quality = quality + 2;
        }
        if (quality > 50) {
            quality = 50;
        }
        return quality;

    }

    public int ConjuredManaCake(Item i) {
        int quality = i.getQuality();
        int sellIn = i.getSellIn();
        if (sellIn > 0) {
            quality = quality - 2;
        } else {
            quality = quality - 4;
        }
        if (quality < 0) {
            quality = 0;
        }
        return quality;
    }


    public int DexterityVest(Item i)
    {
        int quality = i.getQuality();
        int sellIn = i.getSellIn();

        if (sellIn > 0) {
            quality = quality - 1;
        } else {
            quality = quality - 2;
        }
        if (quality < 0) {
            quality = 0;
        }

        return quality;
    }

    public int ElixirOfTheMongoose(Item i) {
        int quality = i.getQuality();
        int sellIn = i.getSellIn();

        if (sellIn > 0) {
            quality = quality - 1;
        } else {
            quality = quality - 2;
        }
        if (quality < 0) {
            quality = 0;
        }

        return quality;
    }

    public int Backstage(Item i) {

        int quality = i.getQuality();
        int sellIn = i.getSellIn();

        if (sellIn == 0) {
            quality = 0;
        } else if (sellIn <= 5) {
            quality = quality + 3;
        } else if (sellIn <= 10) {
            quality = quality + 2;
        } else {
            quality = quality + 1;
        }

        if (quality > 50) {
            quality = 50;
        }

        return quality;
    }
}



