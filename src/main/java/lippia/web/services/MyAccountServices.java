package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;

import java.util.HashMap;
import java.util.Map;

import static com.crowdar.core.actions.ActionManager.*;
import static lippia.web.constants.MyAccountConstants.*;
import static lippia.web.constants.MyAccountConstants.BUTTON_PEDIDOS;
import static lippia.web.constants.RegistrationConstants.REGISTER_BUTTON;

public class MyAccountServices {
    public static void enterUser(String user) {
        setInput(INPUT_USER, user);
    }

    public static void enterPassword(String password) {
        setInput(INPUT_PASSWORD, password);
    }

    public static void mapsMyAccount(String button) throws InterruptedException {
        Map<String,String> buttons = new HashMap<>();
        buttons.put("Mi cuenta", BUTTON_MYACCOUNT);
        buttons.put("Inicio de sesion", BUTTON_LOGIN);
        buttons.put("Pedidos", BUTTON_PEDIDOS);
        buttons.put("Registarse", REGISTER_BUTTON);

        try {
            waitVisibility(buttons.get(button));
            waitClickable(buttons.get(button)).click();
        }catch (Exception e){
            System.out.println("El boton no pudo ser encontrado");
        }

    }
}
