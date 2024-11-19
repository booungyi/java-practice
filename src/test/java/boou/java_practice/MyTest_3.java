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
        assertThat(isValidPhoneNumber("01012345678")).isTrue();
        assertThat(isValidPhoneNumber("010123456789")).isFalse();
        assertThat(isValidPhoneNumber("00012345678")).isFalse();
        assertThat(isValidPhoneNumber("010xxxx5678")).isFalse();
        //url 도메인 추출
        assertThat(extractDomain("https://git-scm.com/book/en/v2")).isEqualTo("git-scm.com");
        assertThat(extractDomain("https://www.google.com/search?q=java")).isEqualTo("www.google.com");
        assertThat(extractDomain("https://www.op.gg/modes/aram/teemo/build?region=global&tier=all")).isEqualTo("www.op.gg");
        //비번 강도
        assertThat(specialChars("2321#Ddd")).isTrue();
        assertThat(specialChars("12121233")).isFalse();
        assertThat(specialChars("Ddddd211")).isFalse();
        assertThat(specialChars("2223aaas")).isFalse();
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
        for (int i = 0; i < s1.length(); i++) {
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
        str1 = s1.substring(0, s1.indexOf('_')); //"snake"
        str2 = s1.substring(s1.indexOf('_') + 1); //"case"
        return str1 + Character.toUpperCase(str2.charAt(0)) + str2.substring(str2.indexOf(0) + 2);
        //str1 = "snake Case" 왼쪽("snake") + "C" + str2.indexof(0)+2 = (ase)
    }

    //유효한 휴대폰 번호인지 판별
    Boolean isValidPhoneNumber(String num1) {
        for (int i = 0; i < num1.length(); i++) {
            if (!Character.isDigit(num1.charAt(i))
                    || num1.length() != 11
                    || !num1.startsWith("010"))
                return false;
        }
        return true;
    }

    //"https://" 와 첫 "/" 사이에 있는 도메인을  return 하는 함수
    String extractDomain(String url1) {
        int strInt;
        //https://{git-scm.com}/book/en/v2 → git-scm.com
        // "//"부터 /사이에 있는 도메인 을 나눔
        // 방법 url1.indexof 로 //부분을 찾아서 정수로 반환, 반환한 수만큼의 범위를 url1.substring 저장
        String str1 = url1.substring(url1.indexOf("//") + 2); // git-scm.com/book/en/v2
        //String str2 = str1.substring(2); // git-scm.com/book/en/v2
        //strInt = str1.indexOf("/");
        return str1.substring(0, str1.indexOf("/"));
    }

    //비밀번호 강도 확인
    Boolean specialChars(String str) {

        if (str.length()<8) {
            return false;
        }
        Boolean pass1 = false;
        Boolean pass2 = false;
        Boolean pass3 = false;
        Boolean pass4 = false;

        String sChars = "!@#$%^&*";
        //8자리 인지 아닌지

        for (int i = 0; i < str.length(); i++) {
            //특수문자를 한개라도 포합하는지
            if (str.contains(String.valueOf(sChars.charAt(i)))) {
                pass1 = true;
            }
            //소문자를 포함하는지
            if (Character.isLowerCase(str.charAt(i))) {
                pass2 = true;
            }
            //대문자를 포함하는지
            if (Character.isUpperCase(str.charAt(i))) {
                pass3 = true;
            }
            //숫자를 포함하는지
            if (Character.isDigit(str.charAt(i))) {
                pass4 = true;
            }
            if (pass1 && pass2 && pass3 && pass4) {
                return true;
            }
        }
        return false;
    }
}

