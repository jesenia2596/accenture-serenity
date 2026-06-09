package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.SwagLabsPage;

public class GoToCart implements Task {

    public static GoToCart goToCart() {
        return Tasks.instrumented(GoToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SwagLabsPage.INPUT_CART_ICONO));
    }
}

