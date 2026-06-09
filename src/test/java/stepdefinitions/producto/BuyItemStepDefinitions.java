package stepdefinitions.producto;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.BuySuccessQuestion;
import questions.LoginSuccessQuestion;
import tasks.AddProduct;
import tasks.Checkout;
import tasks.GoToCart;
import tasks.LoginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class BuyItemStepDefinitions {

    @Given("que el usuario inicio sesion y está en la página de productos")
    public void que_el_usuario_inicio_sesion_y_está_en_la_página_de_productos() {
        OnStage.theActorCalled("usuario");
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.withCredentials("standard_user","secret_sauce"));
    }


    @When("agrega un producto al carrito y realiza el checkout")
    public void agrega_un_producto_al_carrito_y_realiza_el_checkout() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.toCart());
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCart.goToCart());
        OnStage.theActorInTheSpotlight().attemptsTo(Checkout.complete());
    }

    @Then("la compra debe ser exitosa")
    public void la_compra_debe_ser_exitosa() {
        OnStage.theActorInTheSpotlight().should(seeThat(BuySuccessQuestion.displayed(), is(true)));
    }


}

