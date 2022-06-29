package treinta;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RenderActions extends UIInteractionSteps {

  @Step("ingresa el texto en pantalla y valida su renderización {0}")
  public void validateBasicRendering(String message) {
    WebElementFacade popup = $(".at-cv-button.at-cv-lightbox-yesno.at-cm-no-button");
    withTimeoutOf(Duration.ofSeconds(15)).waitFor(ExpectedConditions.visibilityOf(popup));
    if(popup.isDisplayed()){
      popup.click();
    }
    $("#user-message").sendKeys(message);
    $("//button[@class='btn btn-default'][text()='Show Message']").click();
    String messageRedenred = $("#display").getText();
    assertThat(message).isEqualTo(messageRedenred);
  }
}
