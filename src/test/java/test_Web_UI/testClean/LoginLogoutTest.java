package test_Web_UI.testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test_Web_UI.page.MainPage;
import test_Web_UI.page.MenuSection;
import test_Web_UI.page.SignupModal;

public class LoginLogoutTest extends BaseTodoLy{
MainPage mainPage=new MainPage();
SignupModal signupModal=new SignupModal();
MenuSection menuSection=new MenuSection();
@Test
    public void verifyLoginLogoutTodoLy() throws InterruptedException {
    //CREAR
    String fullname="Denisse";
    String email="deni@gmail.com";
    String pass="12345";
    mainPage.signupButton.click();
    signupModal.fullnameTxt.setText(fullname);
    signupModal.emailTxt.setText(email);
    signupModal.passTxt.setText(pass);
    signupModal.checkboxTermofService.click();
    Thread.sleep(2000);
    signupModal.signupButton.click();
    Thread.sleep(2000);
    Assertions.assertTrue(menuSection.logout.isControlDisplayed(),"ERROR: no se hizo el login");
    //Logout
    menuSection.logout.click();
    Thread.sleep(2000);
    Assertions.assertTrue(mainPage.signupButton.isControlDisplayed(),"ERROR:no se hizo el logout");

}
}
