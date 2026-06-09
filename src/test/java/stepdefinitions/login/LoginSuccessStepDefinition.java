package stepdefinitions.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.LoginSuccessQuestion;
import tasks.LoginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class LoginSuccessStepDefinition {

    @Given("el usuario necesita iniciar sesion con sus credenciales")
    public void el_usuario_necesita_iniciar_sesion_con_sus_credenciales() {
        OnStage.theActorCalled("usuario");
    }

    @When("ingresa usuario {string} y password {string}")
    public void ingresa_usuario_y_password(String user, String password){
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.withCredentials(user, password));
    }

    @Then("deberia tener acceso a la aplicacion")
    public void debería_ver_el_dashboard() {
        OnStage.theActorInTheSpotlight().should(seeThat(LoginSuccessQuestion.displayed(), is(true)));
    }
}
