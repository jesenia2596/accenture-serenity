package stepdefinitions.producto;


import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.AddManyProduct;
import tasks.Checkout;
import tasks.GoToCart;

public class BuyMultipleItemsStepDefinitions {

    //given ya lo estoy implementando el StepDefinition de Buyitem

    @When("agrega multiples productos al carrito y realiza el checkout")
    public void agrega_multiples_productos_al_carrito_y_realiza_el_checkout() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddManyProduct.toCart());
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCart.goToCart());
        OnStage.theActorInTheSpotlight().attemptsTo(Checkout.complete());

    }
//then ya lo estoy implementando el StepDefinition de Buyitem

}

