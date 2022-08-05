package example1.steps;

import example1.model.World;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.CoreMatchers.is;

public class CustomerSteps {
    private final World world;

    public CustomerSteps(World world) {
        this.world = world;
    }

    @When("^customer return the (.*) to the store$")
    public void returnItem(String itemType) {
        MatcherAssert.assertThat(world.getItem().getItemType(), is(itemType));
    }

    @When("^customer shows receipt$")
    public void showReceipt() {
        world.getCustomer().refund(world.getItem().getPrice());
    }

    @Then("^customer will get \\$(\\d+) refunded$")
    public void itemGetRefunded(int expected) {
        MatcherAssert.assertThat(world.getCustomer().getRefunded(), is(expected));
    }
}
