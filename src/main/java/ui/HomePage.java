package ui;

import org.openqa.selenium.By;

public class HomePage {

    public static By SHOPPING_CART_ELEMENT = By.id("shopping_cart_container");

    public static By FILTER_ITEM = new By.ByXPath("/html/body/div/div/div/div[1]/div[2]/div/span/select");

    public static By INVENTORY_LIST_ITEM_PRICE_ELEMENT = By.cssSelector("[data-test='inventory-item-price']");
    public static By INVENTORY_LIST_ITEM_NAME_ELEMENT = By.cssSelector("[data-test='inventory-item-name']");

}

