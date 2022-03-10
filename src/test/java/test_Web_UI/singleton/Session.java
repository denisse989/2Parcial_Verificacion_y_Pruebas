package test_Web_UI.singleton;


import org.openqa.selenium.WebDriver;
import test_Web_UI.factoryBrowser.FactoryBrowser;


public class Session {
    private static Session session=null;
    private WebDriver driver;

    private Session(){
        driver= FactoryBrowser.make("chrome").createBrowser();
    }

    public static Session getInstance(){
        if (session == null)
            session= new Session();
        return session;
    }

    public void closeSession(){
        driver.quit();
        session=null;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void externo(){
        driver.switchTo().alert().accept();
    }
}
