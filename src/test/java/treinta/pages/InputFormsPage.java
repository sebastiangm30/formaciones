package treinta.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.anhtester.com/basic-first-form-demo.html")
public class InputFormsPage extends PageObject {

    public final static By A_FIELD = By.cssSelector("#sum1");
    public final static By B_FIELD = By.cssSelector("#sum2");
    public final static By GET_TOTAL = By.xpath("//button[text()='Get Total']");
    public final static By DISPLAY_VALUE = By.cssSelector("#displayvalue");

}
