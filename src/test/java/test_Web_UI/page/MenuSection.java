package test_Web_UI.page;

import org.openqa.selenium.By;
import test_Web_UI.control.Button;

public class MenuSection {
    public Button logout=new Button(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]"));
}
