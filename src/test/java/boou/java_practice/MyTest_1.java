package boou.java_practice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.Buffer;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.*;

public class MyTest_1 { //클래스 안에 있는 함수 (매서드)
/*
https://programmers.co.kr/account/sign_in?referer=https%3A%2F%2Fschool.
programmers.co.kr%2Flearn%2Fcourses%2F30%2Flessons%2F120805%3Flanguage%3Djava
깨보기

월요일에 지금까지 배웠던거 중에 설명할꺼 준비해오깅ㅇ
 */
    @Test
    void maxTest() {
        assertThat(Math.max(10, 7)).isEqualTo(10);
        assertThat(squar(5)).isEqualTo(25); //정수의 제곱
        assertThat(getAverage(100, 100, 70)).isEqualTo(90);
        assertThat(add(3, 4)).isEqualTo(7);
        assertThat(add(10, -5)).isEqualTo(5);
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

    // 함수기능: 정수 두개를 전달 받아 그합을 반환한다.
    int squar(int n) {
        double sum = Math.pow(n, 2);
        return (int) sum;

    }

    //함수기능: 정수 두 개를 전달받아 그합을 반환한다.
    int add(int a, int b) {
        return a + b;
    }

    //함수 기능: 정수 세 개를 전달받아 그 편균을 반환한다.
    double getAverage(double a, double b, double c) {
        return ((a + b + c) / 3);
    }

    //함수 기능: 나이를 전달받아 출생 연도를 구해 반환한다.
    int calculateBirthYear(int n) {
        return 2024 - n;
    }

    @Test
     void 연나이테스트() {
        assertThat(calculateBirthYear(1)).isEqualTo(LocalDate.now().getYear());
        assertThat(calculateBirthYear(2)).isEqualTo(2023);
        assertThat(calculateBirthYear(20)).isEqualTo(2005);
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
        int sum = Math.max(a, b);
        if (sum < c) {
            sum = c;
        }
        return sum;
    }

    //함수 기능 : 두 정수를 전달받아 그 중 더 작은 수를 반환
    int min (int a, int b) {
        int sum = Math.min(a,b);
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
        if (n1 != "") {
            return false;
        }
        return true;
        }
    //함수 스트링 2개를 이어붙이기
    String concat(String s1, String s2) {
        return s1 + s2;
    }
    //함수기능: 주민등록번호 1 이나 3 으로 시작하면 true 아니면 false
    boolean isMale(String a1) {
        if (a1.startsWith("1")||(a1.startsWith("3"))) {
            return true;
        } else {
            return false;
        }
    }

    //함수 기능: 스트링 리스트에 저장되어 잇는 스트링 개수
    int getLength(String a1, String a2, String a3) {
        int sum = 0;
        if (a1 =="a") {
            sum +=1;
        }
        if (a2 == "b") {
            sum += 1;
        }
        if (a3 == "c") {
            sum += 1;
        }
        return sum;
    }
}



