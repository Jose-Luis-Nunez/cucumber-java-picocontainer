package example2.steps;

import example2.model2.CustomerContainer;
import example2.model2.ItemContainer;
import io.cucumber.java.en.Given;

public class GoodsSteps {
    private CustomerContainer customer;
    private ItemContainer item;

    public GoodsSteps(CustomerContainer customer2, ItemContainer item2) {
        this.customer = customer2;
        this.item = item2;
    }

    @Given("(.*) bought a (.*) for \\$(\\d+) in store$")
    public void buy(String name, String itemType, int price) {
        customer.setName(name);
        item.setItemType(itemType);
        item.setPrice(price);
    }
}
