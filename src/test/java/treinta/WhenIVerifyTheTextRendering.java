package treinta;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(SerenityRunner.class)
public class WhenIVerifyTheTextRendering {

  @Managed(driver = "chrome")
  private WebDriver driver;

  @Steps
  RenderActions renderActions;

  @Test
  public void validateTextRendering(){
    driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
    String message = "Hola Mundo";
    renderActions.validateBasicRendering(message);
  }
}
