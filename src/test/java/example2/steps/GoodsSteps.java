package example2.steps;

import example2.model2.Customer;
import example2.model2.Item;
import io.cucumber.java.en.Given;

public class GoodsSteps {
    private Customer customer;
    private Item item;

    public GoodsSteps(Customer customer, Item item) {
        this.customer = customer;
        this.item = item;
    }

    @Given("(.*) bought a (.*) for \\$(\\d+) in store$")
    public void buy(String name, String itemType, int price) {
        customer.setName(name);
        item.setItemType(itemType);
        item.setPrice(price);
    }
}
