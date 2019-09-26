package net.serenitybbd.tutorials.tasks.searchterm;

import net.serenitybbd.tutorials.ui.searchterm.GooglePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {

    private final String termToSearch;

    public Search(String termToSearch) {
        this.termToSearch = termToSearch;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(termToSearch).into(GooglePageElements.SEARCH_INPUT),
                Click.on(GooglePageElements.SEARCH_BUTTON)
        );
    }
    public static Search forTheTerm(String termToSearch){

        return instrumented(Search.class,termToSearch);

    }
}
