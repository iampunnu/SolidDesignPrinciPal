package MainFunction.designpattern.vendingMachine;

public class Item {
    ItemType type;
    Integer price;

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
