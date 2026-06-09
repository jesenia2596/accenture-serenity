package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import ui.SwagLabsPage;

public class LoginTask implements Task {

    private final String user;
    private final String password;

    public LoginTask(String user, String password){
        this.user = user;
        this.password = password;

    }
    public static LoginTask withCredentials(String user, String password) {
        return Tasks.instrumented(LoginTask.class, user, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.saucedemo.com"),
                Enter.theValue(this.user).into(SwagLabsPage.INPUT_USER),
                Enter.theValue(this.password).into(SwagLabsPage.INPUT_PASSWORD),
                Click.on(SwagLabsPage.INPUT_BUTTON_LOGIN)
        );
    }
}


