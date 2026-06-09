package stepdefinitions.producto;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ProductNames;
import questions.ProductPrices;
import tasks.FilterItem;
import util.Utils;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FilterItemStepDefinitions {

    @When("selecciona el filtro {string}")
    public void selecciona_el_filtro(String filter) {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterItem.clickInFilter(filter));
    }

    @Then("los productos deben mostrarse en orden {string}")
    public void los_productos_deben_mostrarse_en_orden(String order) {
        Actor actor = OnStage.theActorInTheSpotlight();

        switch (order) {
            case "ascendente_precio" -> actor.should(seeThat(ProductPrices.displayed(), Utils::isAscending));

            case "descendente_precio" -> actor.should(seeThat(ProductPrices.displayed(), Utils::isDescending));

            case "ascendente_nombre" -> actor.should(seeThat(ProductNames.displayed(), Utils::isAscending));

            case "descendente_nombre" -> actor.should(seeThat(ProductNames.displayed(), Utils::isDescending));
        }
    }
}
