package net.serenitybbd.tutorials.features.search;


import net.serenitybbd.tutorials.tasks.searchterm.Search;
import net.serenitybbd.tutorials.tasks.searchterm.openTheGooglePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

@RunWith(SerenityRunner.class)
public class SearchKeyboardTest {

    Actor carlos = Actor.named("Carlos");

    @Managed
   public WebDriver hisBrowser;

    @Before
    public void carlosCanBrowseTheWeb(){

        carlos.can(BrowseTheWeb.with(hisBrowser));
    }

    @Steps
    openTheGooglePage openTheGooglePage;


    @Test
    public void search_results_should_display_the_search_term_in_the_page_title()
    {
        givenThat(carlos).wasAbleTo(openTheGooglePage);
        when(carlos).attemptsTo(Search.forTheTerm("BDD in action"));

        then(carlos).should(eventually(
                seeThat(TheWebPage.title(),containsString("BDD in action"))));

    }

}

