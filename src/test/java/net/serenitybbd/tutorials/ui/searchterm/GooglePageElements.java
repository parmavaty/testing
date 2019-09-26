package net.serenitybbd.tutorials.ui.searchterm;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GooglePageElements {

    public static Target SEARCH_INPUT = Target.the("search input")
            .located(By.name("q"));
    public static Target SEARCH_BUTTON = Target.the("search button").located(org.openqa.selenium.By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
}
