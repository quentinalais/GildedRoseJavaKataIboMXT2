package edu.insightr.gildedrose;

public class Updater {

    public void update(Item item, String categorie) {

        Update update = new Update();

        switch (categorie) {
            case "Conjured Mana Cake":
                item.setQuality(update.ConjuredManaCake(item));
                item.setSellIn(item.getSellIn()-1);
                break;

            case "+5 Dexterity Vest":
                item.setQuality(update.DexterityVest(item));
                item.setSellIn(item.getSellIn()-1);
                break;

            case "Aged Brie":
                item.setQuality(update.AgedBrie(item));
                item.setSellIn(item.getSellIn()-1);
                break;

            case "Elixir of the Mongoose":
                item.setQuality(update.ElixirOfTheMongoose(item));
                item.setSellIn(item.getSellIn()-1);
                break;

            case "Backstage passes to a TAFKAL80ETC concert":
                item.setQuality(update.Backstage(item));
                item.setSellIn(item.getSellIn()-1);
                break;


        }


    }

}