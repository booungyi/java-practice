package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map_city {
    @Test
    void test() {

        HashMap<String, String> 제주 = new HashMap<>();
        제주.put("도시", "제주");
        제주.put("인구수", "100만");
        제주.put("특산물", "한라봉");
        제주.put("시장", "한라봉");

        HashMap<String, String> 서울 = new HashMap<>();
        서울.put("도시", "서울");
        서울.put("인구수", "941만");
        서울.put("특산물", "배");
        서울.put("시장", "오세훈");

        HashMap<String, String> 강릉 = new HashMap<>();
        강릉.put("도시", "강원도");
        강릉.put("인구수", "21만");
        강릉.put("특산물", "강릉버거");
        강릉.put("시장", "김홍규");

        ArrayList<HashMap<String, String>> 한국도시들 = new ArrayList<>();
        한국도시들.add(제주);
        한국도시들.add(서울);
        한국도시들.add(강릉);

        for (HashMap<String, String> 도시들 : 한국도시들) {
//            for (Map.Entry<String, String> entry : 도시들.entrySet()) {
//                System.out.println(entry.getKey()+": "+entry.getValue());
            System.out.println("-----");
            System.out.println("도시:" + 도시들.get("도시"));
            System.out.println(도시들.get("인구수"));
            System.out.println(도시들.get("특산물"));
            System.out.println(도시들.get("시장"));

        }
    }
}
