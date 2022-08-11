package com.treinta.treintapp.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginTreintaActions extends UIInteractionSteps {

  @Step
  public void loginSuccessful() {
    $("//android.widget.TextView[@text='Colombia']").click();
    $("//android.widget.Button[@resource-id='SignInButton']").click();
    $("//android.widget.Button[@resource-id='GoogleButton']").click();
  }
}
