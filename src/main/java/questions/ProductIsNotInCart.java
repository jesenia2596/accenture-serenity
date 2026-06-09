package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.CartPage;

public class ProductIsNotInCart implements Question<Boolean> {

    private final String productName;

    public ProductIsNotInCart(String productName) {
        this.productName = productName;
    }

    public static ProductIsNotInCart called(String productName) {
        return new ProductIsNotInCart(productName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CartPage.PRODUCT_NAME(productName)
                .resolveAllFor(actor)
                .isEmpty();
    }
}
