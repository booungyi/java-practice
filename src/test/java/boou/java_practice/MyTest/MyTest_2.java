package boou.java_practice.MyTest;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import static org.assertj.core.api.Assertions.*;
public class MyTest_2 {
    Scanner scanner = new Scanner(System.in);

        @Test
        void minMaxTest (){
            assertThat(score(130)).isEqualTo(100);
            assertThat(score(50)).isEqualTo(50);
            assertThat(score(-30)).isEqualTo(0);
            System.out.println("yul".concat(",")
                    .concat("hi")
                    .concat("!")
                    .length()); // .length() ==
            //==>
            System.out.println("yul,hi!".length()); //7
            assertThat(strConcat("s", "s")).isEqualTo("s,s");
        }

    String strConcat(String s1, String s2) {
        return String.join(",",s1,s2);

    }
        int score (int n) {
            return Math.min(Math.max(n, 0), 100);
        }

        //Method chaining (메서드 체이닝)
        void MethodChaining(String str){
            System.out.println("yul".concat(",")
                    .concat("hi")
                    .concat("!")
                    .length()); // .length()
        }
        //연쇄적으로 . 찍고 메서드를 호출하는 방식을 메서드 체이닝(Method chaining)

        @Test
        void subStringTtest(){
            String url = "www.google.com";
            String result = url.substring(4, 9); // 4부터8까지 출력
            System.out.println("result = " + result);
        }
}
