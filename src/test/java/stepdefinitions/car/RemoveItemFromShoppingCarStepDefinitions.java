package stepdefinitions.car;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ProductIsNotInCart;
import tasks.AddProduct;
import tasks.GoToCart;
import tasks.RemoveProduct;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class RemoveItemFromShoppingCarStepDefinitions {

    @Given("agrega el producto {string} al carrito")
    public void agrega_el_producto_al_carrito(String productName) {

        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.toCart());
    }

    @When("remueve el producto {string} del carrito")
    public void remueve_el_producto_del_carrito(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCart.goToCart());
        OnStage.theActorInTheSpotlight().attemptsTo(RemoveProduct.remove(productName));
    }

    @Then("el producto {string} no debe aparecer en el carrito")
    public void el_producto_no_debe_aparecer_en_el_carrito(String productName) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ProductIsNotInCart.called(productName), is(true))
        );
    }
}

