package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Map_person {
    @Test
    void test() {
        HashMap<String, String> 사람1 = new HashMap<>();
        사람1.put("이름", "박효신");
        사람1.put("생년월일", "810901");
        사람1.put("국적", "대한민국");

        HashMap<String, String> 사람2 = new HashMap<>();
        사람2.put("이름", "마동석");
        사람2.put("생년월일", "710301");
        사람2.put("국적", "미국");

        ArrayList<HashMap<String, String>> 사람데이터 = new ArrayList<>();
        사람데이터.add(사람1);
        사람데이터.add(사람2);

        for (HashMap<String, String> 사람 : 사람데이터) {
            System.out.println("-----");
            System.out.println(사람.get("이름"));
            System.out.println(사람.get("생년월일"));
            System.out.println(사람.get("국적"));
        }
    }
}

