package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.SwagLabsPage;

public class AddManyProduct implements Task {

    public static AddManyProduct toCart() {
        return Tasks.instrumented(AddManyProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPage.INPUT_CART_ITEM_BACKPACK),
                Click.on(SwagLabsPage.INPUT_CART_ITEM_SHIRT),
                Click.on(SwagLabsPage.INPUT_CART_ITEM_JACKET),
                Click.on(SwagLabsPage.INPUT_CART_ITEM_ONESIE),
                Click.on(SwagLabsPage.INPUT_CART_ITEM_TSHIRT)


        );
    }
}

