package net.serenitybbd.tutorials.tasks.searchterm;

import net.serenitybbd.tutorials.ui.searchterm.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class openTheGooglePage implements Task {

    GooglePage googlePage;
    @Override
    @Step("Open the google page in a browser")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn().the(googlePage));
    }
}
