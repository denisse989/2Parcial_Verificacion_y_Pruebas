package ejercicioExamen.page;


import ejercicioExamen.control.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button profileButton= new Button(By.xpath("//button[contains(@class,'top_bar_btn settings_btn')]"));
}
