package boou.java_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MyTest_3 {
    @Test
    void myTest() {
        //유효한 이메일인지 판별
        assertThat(isValidEmail("ansdlsgur@gmail.com")).isTrue();
        assertThat(isValidEmail("DORAEMON")).isFalse();
        //주민등록번호로 성별 판별
        assertThat(isFemale("1234567")).isFalse();
        assertThat(isFemale("2345678")).isTrue();
        assertThat(isFemale("3456789")).isFalse();
        assertThat(isFemale("4567890")).isTrue();
        //주민등록번호 뒷자리
        assertThat(Character.isDigit('7')).isTrue();
        assertThat(isValidIdNumber("1234567")).isTrue();
        assertThat(isValidIdNumber("1abcd67")).isFalse();
        //문자를 대문자로
        assertThat(toCameCase("snake_case")).isEqualTo("snakeCase");
        assertThat(toCameCase("product_name")).isEqualTo("productName");
        assertThat(toCameCase("created_at")).isEqualTo("createdAt");
        //유효한 휴대폰 번호인지 판별
//        assertThat(isValidPhoneNumber("01012345678")).isTrue();
//        assertThat(isValidPhoneNumber("010123456789")).isFalse();
//        assertThat(isValidPhoneNumber("00012345678")).isFalse();
        assertThat(isValidPhoneNumber("010xxxx5678")).isFalse();
    }

    //유효한 이메일인지 판별
    Boolean isValidEmail(String s1) {
        return s1.contains("@");
    }

    //주민등록번호로 성별 판별
    Boolean isFemale(String s1) {
        return s1.startsWith("2") || s1.startsWith("4");
    }

    //주민등록번호 뒷자리가 주어질 떄
    //전부 숫자이면 true 아니면 false
    Boolean isValidIdNumber(String s1) {
        for (int i =0;i<s1.length();i++) {
            if (!Character.isDigit(s1.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    //문자를 대문자로 바꾸기
    String toCameCase(String s1) {
        //Character.toUpperCase() 를쓰면 안에있는 문자를 대문자로 변경

        String str1, str2;
        str1 =s1.substring(0,s1.indexOf('_')); //"snake"
        str2 =s1.substring(s1.indexOf('_')+1); //"case"
        return str1 +Character.toUpperCase(str2.charAt(0))+str2.substring(str2.indexOf(0)+2);
        //str1 = "snake Case" 왼쪽("snake") + "C" + str2.indexof(0)+2 = (ase)
    }
    //유효한 휴대폰 번호인지 판별
    Boolean isValidPhoneNumber (String num1) {
        for (int i = 0; i<num1.length();i++) {
            if (!Character.isDigit(num1.charAt(i))
                    ||num1.length()!=11
                    ||!num1.startsWith("010"))
                return false;
        }
        return true;
    }

}

