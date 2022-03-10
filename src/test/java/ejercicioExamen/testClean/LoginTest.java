package ejercicioExamen.testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.*;


public class LoginTest extends BaseTodoist {
    MainPage mainPage= new MainPage();
    LoginPage loginPage= new LoginPage();
    MenuSection menuSection = new MenuSection();
    LeftSection leftSection=new LeftSection();
    AddProjectModal addProjectModal=new AddProjectModal();
    EditProjectModal editProjectModal=new EditProjectModal();
    AccountSection accountSection=new AccountSection();
    DeleteProjectModal deleteProjectModal=new DeleteProjectModal();

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        //Login
        mainPage.loginImage.click();
        loginPage.emailTxtBox.setText("deni@email.com");
        loginPage.pwdTxtBox.setText("PassVerifi");
        Thread.sleep(2000);
        loginPage.loginButton.click();
        //menuSection.profileButton.click();
        Thread.sleep(2000);
        //Assertions.assertTrue(accountSection.logoutButton.isControlDisplayed(),"ERROR no se pudo hacer el login");
        //Crear
        String nameProject="projecto1";
        Thread.sleep(2000);
        leftSection.addProject.click();
        addProjectModal.nameProject.setText(nameProject);
        addProjectModal.buttonAdd.click();
        Thread.sleep(2000);
        Assertions.assertEquals(nameProject, leftSection.nameProject.getTextControl(), "Error, no se añadio un nuevo proyecto");
        //Actualizar
        String newName="Deni";
        leftSection.nameProject.click();
        leftSection.optionsProject.click();
        Thread.sleep(2000);
        leftSection.editButton.click();
        Thread.sleep(2000);
        editProjectModal.nameProject.clearSetText(newName);
        Thread.sleep(2000);
        editProjectModal.buttonSaveEdit.click();
        Thread.sleep(2000);
        Assertions.assertEquals(newName, leftSection.nameProject.getTextControl(), "Error, no se cambio el nombre del proyecto");
        //Eliminar
        leftSection.nameProject.click();
        leftSection.optionsProject.click();
        Thread.sleep(2000);
        leftSection.deleteButton.click();
        Thread.sleep(2000);
        deleteProjectModal.confirmDeleteButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(!newName.equals(leftSection.nameProject.getTextControl()));




    }
}
