package example2.steps;

import example2.model2.CustomerContainer;
import example2.model2.ItemContainer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerSteps {
    private CustomerContainer customer;
    private ItemContainer item;

    public CustomerSteps(CustomerContainer customer, ItemContainer item) {
        this.customer = customer;
        this.item = item;
    }

    @When("^John Doe returns (.*) to the store$")
    public void returnItem(String itemType) {
        assertThat(item.getItemType(), is(itemType));
    }

    @And("shows receipt with price \\$(\\d+)$")
    public void showReceipt(int price) {
        customer.refund(item.getPrice());
        assertThat(item.getPrice(), is(price));
    }

    @Then("^customer will get \\$(\\d+) refunded from store$")
    public void itemGetRefunded(int expected) {
        assertThat(customer.getRefunded(), is(expected));
    }
}
