package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.SwagLabsPage;

public class AddProduct implements Task {

    public static AddProduct toCart() {
        return Tasks.instrumented(AddProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPage.INPUT_CART_ITEM_LIGHT)

        );
    }
}

