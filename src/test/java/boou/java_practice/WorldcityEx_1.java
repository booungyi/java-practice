package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorldcityEx_1 {

    @Test
    void test() {
        ArrayList<String> 한국도시들 = new ArrayList<>();
        한국도시들.add("제주");
        한국도시들.add("강릉");
        한국도시들.add("울산");

        ArrayList<String> 미국도시들 = new ArrayList<>();
        미국도시들.add("디트로이트");
        미국도시들.add("스프링필드");
        미국도시들.add("볼티모어");

        ArrayList<String> 독일도시들 = new ArrayList<>();
        독일도시들.add("프랑크푸르트");
        독일도시들.add("함부르크");
        독일도시들.add("브레멘");


        HashMap<String, ArrayList<String>> 세계도시들v2 = new HashMap<>();
        세계도시들v2.put("한국", 한국도시들);
        세계도시들v2.put("미국", 미국도시들);
        세계도시들v2.put("독일", 독일도시들);

        for (String 나라이름 : 세계도시들v2.keySet()) {

            ArrayList<String> 도시들 = 세계도시들v2.get(나라이름);
            String 이모지 = "";
            if (나라이름.equals("한국")) {
                이모지 = "❤️";
            }
            if (나라이름.equals("미국")) {
                이모지 = "⭐";
            }
            if (나라이름.equals("독일")) {
                이모지 = "🍺";
            }
            System.out.println(이모지 + 나라이름 + " " + 도시들);
        }
    }
}
