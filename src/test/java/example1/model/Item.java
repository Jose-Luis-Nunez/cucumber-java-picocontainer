package example1.model;

public class Item {
    private String itemType;
    private int price;

    public String getItemType(){
        return itemType;
    }

    public int getPrice(){
        return price;
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
