package ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static Target PRODUCT_NAME(String productName) {
        return Target.the("producto en el carrito")
                .locatedBy("//div[@class='inventory_item_name' and text()='{0}']")
                .of(productName);
    }

    public static Target REMOVE_BUTTON_FOR(String productName) {
        return Target.the("botón remove para el producto " + productName)
                .locatedBy(
                        "//div[@class='inventory_item_name' and text()='{0}']" +
                                "/ancestor::div[@class='cart_item']" +
                                "//button[text()='Remove']"
                ).of(productName);
    }
}
