package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Mapmovie {
    @Test
    void test() {
        HashMap<String, String> 영화1 = new HashMap<>();
        영화1.put("제목", "범죄도시");
        영화1.put("감독", "강윤성");
        영화1.put("개봉일", "2017-10-03");

        HashMap<String, String> 영화2 = new HashMap<>();
        영화2.put("제목","다크나이트");
        영화2.put("감독","크리스토퍼 놀란");
        영화2.put("개봉일", "2008-08-06");

        ArrayList<HashMap<String, String>> 영화데이터 = new ArrayList<>();
        영화데이터.add(영화1);
        영화데이터.add(영화2);

        for (HashMap<String, String> 영화 : 영화데이터) {
            System.out.println("------");
            System.out.println(영화.get("제목"));
            System.out.println(영화.get("감독"));
            System.out.println(영화.get("개봉일"));

        }
    }

}
