package steps;

import io.cucumber.java.en.Given;
import model.Customer;
import model.Item;
import model.World;

public class GoodsSteps {
    private final World world;

    public GoodsSteps(World world) {
        this.world = world;
    }

    @Given("^that (.*) bought a (.*) for \\$(\\d+)$")
    public void buyItem(String name, String itemType, int price) {
        world.setCustomer(new Customer(name));
        world.setItem(new Item(itemType, price));
    }
}
