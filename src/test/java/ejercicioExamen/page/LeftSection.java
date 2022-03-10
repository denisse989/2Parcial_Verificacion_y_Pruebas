package ejercicioExamen.page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LeftSection {
//
    public Button addProject=new Button(By.xpath("//*[@id=\"list_holder\"]/div/div[1]/div/button"));
    public TextBox nameProject=new TextBox(By.xpath("//*[@id=\"projects_list\"]/li[last()]/div/div/a"));
//ACTUALIZAR
    public Button optionsProject=new Button(By.xpath("//*[@id=\"projects_list\"]/li[last()]/div/div/div/button"));
    public Button editButton=new Button(By.xpath("/html/body/div[5]/div[2]/div/ul/li[4]/div[2]"));
//Eliminar
    public Button deleteButton=new Button(By.xpath("/html/body/div[5]/div[2]/div/ul/li[12]/div[2]"));


}
