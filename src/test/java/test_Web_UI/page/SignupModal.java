package test_Web_UI.page;

import org.openqa.selenium.By;
import test_Web_UI.control.Image;
import test_Web_UI.control.Label;
import test_Web_UI.control.TextBox;

public class SignupModal {
    public TextBox fullnameTxt=new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]"));
    public TextBox emailTxt=new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]"));
    public TextBox passTxt=new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]"));
    public Label checkboxTermofService=new Label(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[1]/div[2]/label"));
    public Image signupButton=new Image(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]"));
}
