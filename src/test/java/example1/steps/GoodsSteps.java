package example1.steps;

import example1.model.Customer;
import example1.model.Item;
import example1.model.World;
import io.cucumber.java.en.Given;

public class GoodsSteps {
    private World world;

    public GoodsSteps(World world) {
        this.world = world;
    }

    @Given("^that (.*) bought a (.*) for \\$(\\d+)$")
    public void buyItem(String name, String itemType, int price) {
        world.setCustomer(new Customer(name));
        world.setItem(new Item(itemType, price));
    }
}
