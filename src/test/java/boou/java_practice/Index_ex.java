package boou.java_practice;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

class Solution {
    public static void main(String[] args) {

        System.out.println("!@#$%^&*(\\'\"<>?:;");

//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String answer = "";
//        //Stack <Character> stack = new Stack <> ();
//
//        for(Character c : a.toCharArray()){             //a=>A  B c D e F
//            if(Character.isUpperCase(c)){
//                //stack.push(Character.toLowerCase(c));
//                answer += Character.toLowerCase(c);     //answer = A b
//            }
//            else if(Character.isLowerCase(c)){
//                //stack.push(Character.toUpperCase(c));
//                answer += Character.toUpperCase(c);     //answer = A
//            }
//        }
//        System.out.println(answer);
    }
}

public class Index_ex {

    @Test
    void name() {
        assertThat(calculateArea(10)).isEqualTo(100);
        assertThat(calculateArea(4.0)).isEqualTo(16.0);
        assertThat(calculateArea(4.0, 2.54)).isEqualTo(10.16);
        assertThat(calculateArea(4.0, true)).isEqualTo(4.0 * Math.PI);
    }



    /**
     * 다음 도형들의 면적을 계산하는 메서드를 오버로딩하여 구현하세요:
     * 1. 정사각형
     * 2. 직사각형
     * 3. 원
     *
     * @param side 정사각형의 한 변의 길이
     * @return 정사각형의 면적
     */
    double calculateArea(double side) {

        // TODO: 정사각형 면적 계산 로직을 구현하세요.
        return side * side;
    }

    public int solution(int num1 ,int num2){
        int answer = 1;
        if (num1 != num2) {
            return answer = -1;
        }
        return answer;
    }
    /**
     * @param length 직사각형의 길이
     * @param width 직사각형의 너비
     * @return 직사각형의 면적
     */
    double calculateArea(double length, double width) {
        // TODO: 직사각형 면적 계산 로직을 구현하세요.

        return length * width;
    }
    /**
     * @param radius 원의 반지름
     * @return 원의 면적
     */
    double calculateArea(double radius, boolean isCircle) {

            return radius * Math.PI;
        // TODO: 원의 면적 계산 로직을 구현하세요. isCircle 매개변수는 오버로딩을 위해 사용됩니다.
    }
}



