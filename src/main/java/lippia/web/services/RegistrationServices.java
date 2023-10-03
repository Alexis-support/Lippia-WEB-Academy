package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;
import static com.crowdar.core.actions.WebActionManager.click;
import static lippia.web.constants.RegistrationConstants.*;

public class RegistrationServices {
    private static String getTextError() {
        waitPresence(ERROR_TEXT_VALIDEMAIL);
        return getElement(ERROR_TEXT_VALIDEMAIL).getText();

    }
    public static void enterUserCriteria(String user) {
        setInput(INPUT_USER, user);
    }

    public static void enterPassCriteria(String pasword) {
        setInput(INPUT_PASSWORD, pasword);
    }

    public static void verifyResults() {
        waitPresence(HELLO_TEXT);
        Assert.assertTrue(WebActionManager.isPresent(HELLO_TEXT),"El elemento no está presente");
    }

    public static void verifyMesageError(String text) {
        String[] partes = getTextError().split(": ");
        System.out.println(partes[1]);
        Assert.assertEquals(partes[1], text);
    }

    public static void clickRegistrar(String registro) {
        click(REGISTER_BUTTON,false);
    }
}
