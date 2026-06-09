package stepdefinitions.login;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.LoginSuccessQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class LoginFailStepDefinition {

    @Then("no deberia tener acceso a la aplicacion")
    public void no_deberia_tener_acceso_a_la_aplicacion() {
        OnStage.theActorInTheSpotlight().should(seeThat(LoginSuccessQuestion.displayed(),is(false)));
    }
}
