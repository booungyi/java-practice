package boou.java_practice;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Index_ex {
    Boolean specialChars(String str) {
        //8 자리 확인

        Boolean pass;
        if (str.length() > 8) {
            pass = true;
        } else {
            pass = false;
        }
        System.out.println("pass = " + pass);
        return pass;
    }
}



