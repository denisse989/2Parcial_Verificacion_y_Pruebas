package ejercicioExamen.page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditProjectModal {
    public TextBox nameProject= new TextBox(By.xpath("//*[@id=\"edit_project_modal_field_name\"]"));
    public Button buttonSaveEdit=new Button(By.xpath("//*[@id=\"reactist-modal-box-9\"]/form/footer/button[2]"));
}
