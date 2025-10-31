package mx.gob.imss.dpes.common.rule.utils;

import java.util.regex.Pattern;

public class  EmailUtil {

    public static boolean validarEmail(String email){
        if (email == null || email.trim().length() <= 0)
            return false;

        return Pattern.compile(
                "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"
        ).matcher(email).matches();
    }

}
