package com.treinta.treintapp.test;

import com.treinta.treintapp.actions.LoginTreintaActions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class UserCanLogin {

  @Managed
  private WebDriver driver;

  @Steps
  LoginTreintaActions loginTreintaActions;

  @Test
  public void loginWithPhone(){
    loginTreintaActions.loginSuccessful();
  }

}
