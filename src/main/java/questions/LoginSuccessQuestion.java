package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import ui.HomePage;

public class LoginSuccessQuestion implements Question<Boolean> {

    private final Target SHOPPING_CART_ELEMENT =
            Target.the("Ver carrito de compras")
                    .located(HomePage.SHOPPING_CART_ELEMENT);

    public static LoginSuccessQuestion displayed() {
        return new LoginSuccessQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return SHOPPING_CART_ELEMENT.resolveFor(actor).isVisible();
    }
}
