package treinta.test;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import treinta.actions.RenderActions;

@RunWith(SerenityRunner.class)
public class WhenIVerifyTheTextRendering {

  @Managed(driver = "chrome")
  private WebDriver driver;

  @Steps
  RenderActions renderActions;

  @Test
  public void validateTextRendering(){
    String message = "Hola Mundo";
    renderActions.validateBasicRendering(message);
  }
}
