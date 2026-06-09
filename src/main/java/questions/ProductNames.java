package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import ui.HomePage;

import java.util.List;

public class ProductNames implements Question<List<String>> {

    public static final Target INVENTORY_LIST_ITEM_NAME_ELEMENT = Target
            .the("precios de productos")
            .located(HomePage.INVENTORY_LIST_ITEM_NAME_ELEMENT);


    public static ProductNames displayed() {
        return new ProductNames();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return INVENTORY_LIST_ITEM_NAME_ELEMENT.resolveAllFor(actor)
                .stream()
                .map(WebElementFacade::getText)
                .map(String::trim)
                .toList();
    }
}