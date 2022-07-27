package treinta.test;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import treinta.actions.RenderActions;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("data/dataSum.csv")
public class WhenIVerifyTheSum {

  private String a;
  private String b;
  private String sum;

  @Managed(driver = "chrome")
  private WebDriver driver;

  @Steps
  RenderActions renderActions;

  @Test
  public void validateSum(){
    renderActions.madeTheSum(a, b);
    String total = renderActions.getSumVale();
    assertThat(total).isEqualTo(sum);
  }
}
