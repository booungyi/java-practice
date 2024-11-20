package boou.java_practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest_4 {
    @Test
    void myTest() {
        //비번 강도
        assertThat(specialChars("2321#Ddd")).isTrue();
        assertThat(specialChars("12121233")).isFalse();
        assertThat(specialChars("Ddddd211")).isFalse();
        assertThat(specialChars("2223aaas")).isFalse();
    }

    //비밀번호 강도 확인
    Boolean specialChars(String str) {
        //8 자리 확인
        Boolean pass;

        Boolean pass1 = false;
        Boolean pass2 = false;
        Boolean pass3 = false;
        Boolean pass4 = false;
        String specialChars = "!@#$%^&*()";

        if (str.length() < 8) {
            return false;
        }

        for (int i = 0; i < str.length(); ++i) {
            if (Character.isUpperCase(str.charAt(i))) {
                pass1 = true;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                pass2 = true;
            }
            if (Character.isDigit(str.charAt(i))) {
                pass3 = true;
            }
            if (specialChars.contains(String.valueOf(str.charAt(i)))) {
                pass4 = true;
            }
            if (pass1 && pass3 && pass2 && pass4) {
                return true;
            }
        }
        return false;

    }
}
