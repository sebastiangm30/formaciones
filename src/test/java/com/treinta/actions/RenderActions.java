package com.treinta.actions;

import static org.assertj.core.api.Assertions.assertThat;
import static com.treinta.pages.InputFormsPage.A_FIELD;
import static com.treinta.pages.InputFormsPage.B_FIELD;
import static com.treinta.pages.InputFormsPage.DISPLAY_VALUE;
import static com.treinta.pages.InputFormsPage.GET_TOTAL;

import java.time.Duration;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.treinta.pages.InputFormsPage;

public class RenderActions extends UIInteractionSteps {

  @Page
  InputFormsPage inputFormsPage;

  @Step("ingresa el texto en pantalla y valida su renderización {0}")
  public void validateBasicRendering(String message) {
    openPageAndClosePopUp();
    $("#user-message").sendKeys(message);
    $("//button[@class='btn btn-default'][text()='Show Message']").click();
    String messageRedenred = $("#display").getText();
    assertThat(message).isEqualTo(messageRedenred);
  }

  @Step("Validar que la suma de {0} y {1}")
  public void madeTheSum(String a, String b) {
    openPageAndClosePopUp();
    $(A_FIELD).sendKeys(a);
    $(B_FIELD).sendKeys(b);
    $(GET_TOTAL).click();
  }

  public String getSumVale(){
    return $(DISPLAY_VALUE).getText();
  }

  private void openPageAndClosePopUp(){
    inputFormsPage.open();
    WebElementFacade popup = $(".at-cv-button.at-cv-lightbox-yesno.at-cm-no-button");
    withTimeoutOf(Duration.ofSeconds(15)).waitFor(ExpectedConditions.visibilityOf(popup));
    if(popup.isDisplayed()){
      popup.click();
    }
  }
}
