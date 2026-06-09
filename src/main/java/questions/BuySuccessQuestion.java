package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import ui.HomePage;

public class BuySuccessQuestion implements Question<Boolean> {


    public static final Target BACK_HOME_BUTTON =
            Target.the("botón back home")
                    .located(By.id("back-to-products"));
    public static BuySuccessQuestion displayed() {
        return new BuySuccessQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {return BACK_HOME_BUTTON.resolveFor(actor).isVisible();
    }
}

