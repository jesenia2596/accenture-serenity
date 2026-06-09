package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.SwagLabsPage;

public class Checkout implements Task {

    public static Checkout complete() {
        return Tasks.instrumented(Checkout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPage.INPUT_CART_ICONO),
                Click.on(SwagLabsPage.INPUT_CHECKOUT_BUTTON),
                Enter.theValue("Test").into(SwagLabsPage.INPUT_FIRST_NAME),
                Enter.theValue("User").into(SwagLabsPage.INPUT_LAST_NAME),
                Enter.theValue("12345").into(SwagLabsPage.INPUT_POSTAL_CODE),
                Click.on(SwagLabsPage.INPUT_BUTTON_CONTINUE),
                Click.on(SwagLabsPage.INPUT_BUTTON_FINISH)
        );
    }
}

