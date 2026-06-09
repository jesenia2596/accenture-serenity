package tasks;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.HomePage;



public class FilterItem  implements Task {

    private final String filter;

    public FilterItem (String filter){
        this.filter = filter;
    }


    public static FilterItem clickInFilter (String filter) {
        return Tasks.instrumented(FilterItem.class, filter);
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.FILTER_ITEM),
                Click.on(By.cssSelector(String.format(".product_sort_container option[value='%s']", this.filter)))
        );
    }
}
