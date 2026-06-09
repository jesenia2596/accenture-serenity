package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import ui.HomePage;

import java.util.List;


public class ProductPrices implements Question<List<Double>> {

    public static final Target INVENTORY_LIST_ITEM_PRICE = Target
            .the("precios de productos")
            .located(HomePage.INVENTORY_LIST_ITEM_PRICE_ELEMENT);

    public static ProductPrices displayed() {
        return new ProductPrices();
    }

    @Override
    public List<Double> answeredBy(Actor actor) {
        return INVENTORY_LIST_ITEM_PRICE.resolveAllFor(actor)
                .stream()
                .map(WebElementFacade::getText)
                .map(text -> text.replace("$", "").trim())
                .map(Double::parseDouble)
                .toList();
    }
}