package model;

public class Item {
    private final String itemType;
    private final int price;

    public int getPrice(){
        return price;
    }
    public String getItemType(){
        return itemType;
    }

    public Item(String itemType, int price) {
        this.itemType = itemType;
        this.price = price;
    }

    @Override
    public String toString() {
        return itemType;
    }
}
