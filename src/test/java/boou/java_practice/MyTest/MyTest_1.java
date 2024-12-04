package boou.java_practice.MyTest;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.*;

public class MyTest_1 { //클래스 안에 있는 함수 (매서드)

    @Test
    void maxTest() {
        //두 수의 합
        assertThat(add(3, 4)).isEqualTo(7);
        assertThat(add(10, -5)).isEqualTo(5);
        //두 수중 더 큰수
        assertThat(Math.max(10, 7)).isEqualTo(10);
        //두 수를 곱함
        assertThat(square(4)).isEqualTo(16); //정수의 제곱
        //세 수의 평균
        assertThat(getAverage(100, 100, 70)).isEqualTo(90);
        //생일구하기
        assertThat(calculateBirthYear(-4)).isEqualTo(2028);
        //isPositive is true?
        assertThat(isPositive(3)).isEqualTo(true);
        assertThat(isPositive(9)).isTrue();
        assertThat(isPositive(0)).isFalse();
        assertThat(isPositive(-5)).isFalse();
        //0보다 작은지 아닌지
        assertThat(isNegative(3)).isEqualTo(false);
        assertThat(isNegative(9)).isFalse();
        assertThat(isNegative(0)).isFalse();
        assertThat(isNegative(-5)).isTrue();
        //정수 두개중 더 큰 값을 반환
        assertThat(getBigger(3, 7)).isEqualTo(7);
        assertThat(getBigger(7, 3)).isEqualTo(7);
        assertThat(getBigger(-9, -1)).isEqualTo(-1);
        // 세 정수를 전달받아 그중 가장 큰수 변환
        assertThat(getBiggest(1, 2, 3)).isEqualTo(3);
        assertThat(getBiggest(3, 2, 1)).isEqualTo(3);
        assertThat(getBiggest(-3, -2, -1)).isEqualTo(-1);
        assertThat(getBiggest(-1, -2, -3)).isEqualTo(-1);
        //정수 두개중 더 작은 값 반환
        assertThat(min(1, 2)).isEqualTo(1);
        assertThat(min(3, 2)).isEqualTo(2);
        assertThat(min(-3, -2)).isEqualTo(-3);
        assertThat(min(-1, -3)).isEqualTo(-3);
        //정수의 절대값
        assertThat(abs(3)).isEqualTo(3);
        assertThat(abs(-3)).isEqualTo(3);
        assertThat(abs(0)).isEqualTo(0);
        //문자열 하나를 전달받아 빈 문자열인지 판단
        assertThat(isEmpty("")).isTrue();
        assertThat(isEmpty("a")).isFalse();
        assertThat(isEmpty("    ")).isFalse();
        //스트링 두개 이어 붙이기
        assertThat(concat("hello", "world")).isEqualTo("helloworld");
        assertThat(concat("안녕", "하세요")).isEqualTo("안녕하세요");
        //주민등록번호 남자 = true
        assertThat(isMale("1234567")).isTrue();
        assertThat(isMale("2345678")).isFalse();
        assertThat(isMale("345678")).isTrue();
        assertThat(isMale("4567890")).isFalse();
        //스트링 리스트에 저장되어잇는 스트링 개수
    }

    /*
    https://programmers.co.kr/account/sign_in?referer=https%3A%2F%2Fschool.
    programmers.co.kr%2Flearn%2Fcourses%2F30%2Flessons%2F120805%3Flanguage%3Djava
    깨보기
    월요일에 지금까지 배웠던거 중에 설명할꺼 준비해오깅ㅇ
     */

    //함수기능: 정수 두 개를 전달받아 그합을 반환한다.
    int add(int a, int b) {
        return a + b;
    }

    // 함수기능: 정수 하나를 전달받아 그정수를 제곱한 값을 반환한다.
    int square(int n) {
        return (int) Math.pow(n, 2);
    }

    //함수 기능: 정수 세 개를 전달받아 그 평균 을 반환한다.
    double getAverage(double a, double b, double c) {
        return ((a + b + c) / 3);
    }

    //함수 기능: 나이를 전달받아 출생 연도를 구해 반환한다.
    int calculateBirthYear(int n) {
        int ThisYear = LocalDate.now().getYear();
        return ThisYear - n;
    }

    @Test
    void typeTest() {
        int n = 100;
        String s = "Hello";
        System.out.println(s.length());
    }

    @Test
    void 연나이테스트() {
        assertThat(calculateBirthYear(0)).isEqualTo(LocalDate.now().getYear());
        assertThat(calculateBirthYear(2)).isEqualTo(2022);
        assertThat(calculateBirthYear(20)).isEqualTo(2004);
        System.out.println(calculateBirthYear(222));
    }

    //함수 기능: 정수 하나를 전달받아 0보다 큰지 아닌지 판단 결과를 반환한다.
    boolean isPositive(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    // 함수기능: 정수 하나를 전달받아 0보다 작은지 아닌지 판단 결과를 반환한다.
    boolean isNegative(int n) {
        if (n < 0) {
            return true;
        } else {
            return false;
        }
    }

    //정수 두개를 전달받아 그중 더 큰수를 반환
    int getBigger(int a, int b) {
        return Math.max(a, b);
    }

    //함수 기능: 세 정수를 전달받아 그중 가장 큰 수를 반환
    int getBiggest(int a, int b, int c) {
        if (Math.max(a, b) < c) {
            return c;
        }
        return (Math.max(a, b));
    }

    //함수 기능 : 두 정수를 전달받아 그 중 더 작은 수를 반환
    int min(int a, int b) {
        int sum = Math.min(a, b);
        return sum;
    }

    //함수 기능: 정수 하나를 전달받고 그 절대값을반환.
    int abs(int n) {
        if (n < 0) {
            n = -n;
        }
        return n;
    }

    //함수 기능: 문자열 하나를 전달받아 빈 문자열인지 판단
    boolean isEmpty(String n1) {
        if (n1.isEmpty()) {
            return true;
        }
        return false;
    }

    //함수 스트링 2개를 이어붙이기
    String concat(String s1, String s2) {
        return s1.concat(s2);
    }

    //함수기능: 주민등록번호 1 이나 3 으로 시작하면 true 아니면 false
    boolean isMale(String a1) {
        if (a1.startsWith("1") || (a1.startsWith("3"))) {
            return true;
        } else {
            return false;
        }
    }

    //함수 기능: 스트링 리스트에 저장되어 잇는 스트링 개수
    int getLength(String a1, String a2, String a3) {
        int sum = 0;
        if (a1.equals("a")) {
            sum += 1;
        }
        if (a2.equals("b")) {
            sum += 1;
        }
        if (a3.equals("c")) {
            sum += 1;
        }
        return sum;
    }

    @Test
    void Testempty() {

        String s = "123a";
        assertThat(s.isEmpty()).isFalse(); //false (비어있는지 판별)
        assertThat(s.equals("123a")).isTrue();//true (문자열이 같은지)
        System.out.println(s.charAt(3));
        assertThat(s.charAt(3)).isEqualTo('a');// a  (charAt(안에 들어간 숫자번째 문자열을 문자 하나(char)로 변환) 123"a"::0부터시작)
        assertThat(s.toLowerCase()).isEqualTo("123a");// 222 (소문자로 변환)
        assertThat(s.toUpperCase()).isEqualTo("123A");//  222(대문자로 변환)
        assertThat(s.contains("22")).isFalse();// false (같은 문자열이 들어가있는지)
        assertThat(s.indexOf(2,3)).isEqualTo(-1);// -1 <== ((찾는 문자열이 몇번째에 있는지),(시작할위치)) 없으면 -1 반환
        assertThat(s.startsWith("1")).isTrue();//  true  (시작하는 문자열이 같은지)
        assertThat(s.endsWith("a")).isTrue();//  true    (끝나는 문자열이 같은지)
        assertThat(s.repeat(2)).isEqualTo("123a123a"); //22222222222222 (문자열 반복횟수)
        assertThat(s.concat("24241")).isEqualTo("123a24241");// 123a24241 ( 문자열 끝에 추가할 문자열 )
        assertThat(s.replace("a", "r")).isEqualTo("123r"); //replace (타겟 char 문자 하나를 (새로운문자) 로 바꿔줌
        assertThat(s.trim()).isEqualTo("123a"); // 공백을 지워줌

        String formatted = String.format("안녕하세요. %d년생 %s입니다.", 71, "마동석");
        assertThat(formatted).isEqualTo("안녕하세요. 71년생 마동석입니다.");

        int i = 23;
        System.out.println(String.format("%d_", i));    //23_
        System.out.println(String.format("%5d_", i));   //  23_
        System.out.println(String.format("%-5d_", i));  //23   _
        System.out.println(String.format("%05d_", i));  //00023_

        출처: https://blog.jiniworld.me/68 [hello jiniworld:티스토리]
        //%5d 와 같이 %와d 사이에 정수를 설정하면
        // 글자 길이를 설정할 수있다 기본적으로 오른쪽 정렬이고
        // - 를붙일경우 왼쪽정렬
        //표현할 숫자인 i의 길이가 5보다 작을경우 0을 붙입니다.

        //%d =integer 10진수 정수
        //%f 부동소수 십진수
        //%c == char 자료형
        //%s 문자열

        i = 123456789;
        String str = "3313131";
        System.out.println(String.format("%,d", i));
        System.out.println(String.join(",", s,s,str,"ㅑ"));
        //join = "((사이에 들어갈 문자열)", 문자열1,문자열2,문자열3(또는 String or char형 변수)
    }
}



