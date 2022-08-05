package example2.steps;

import example2.model2.CustomerContainer;
import example2.model2.ItemContainer;
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

    @When("^customer2 return the (.*) to the store$")
    public void returnItem(String itemType) {
        assertThat(item.getItemType(), is(itemType));
    }

    @When("^customer2 shows receipt$")
    public void showReceipt() {
        customer.refund(item.getPrice());
    }

    @Then("^customer2 will get \\$(\\d+) refunded$")
    public void itemGetRefunded(int expected) {
        assertThat(customer.getRefunded(), is(expected));
    }
}
