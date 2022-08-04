public class Item {
    String itemType;
    int price;

    public int getPrice(){
        return price;
    }
    public Item(String itemType) {
        this.itemType = itemType;
    }
    public Item(String itemType, int price) {
        this.itemType = itemType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "itemType: " + itemType + " , price: " + price;
    }
}
