package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class Collections_3 {

    @Test
    void countNameOccurrencesTest1_1() {
        ArrayList<String> names = new ArrayList<>();
        names.add("박효신"); // 박효신 1명
        names.add("이지은");
        names.add("이지은"); // 이지은 2명
        names.add("하현우");
        names.add("하현우");
        names.add("하현우"); // 하현우 3명

        Map<String, Integer> countsByName = countNameOccurrences(names); //  이 함수는 intput 을 names 로 가짐 names = List output 은 map 으로 나옴


        assertThat(countsByName).containsEntry("이지은", 2)
                .containsEntry("박효신", 1)
                .containsEntry("하현우", 3);
    }

    Map<String, Integer> countNameOccurrences(ArrayList<String> namelist) {
        Map<String, Integer> names = new HashMap<>();
        for (String name : namelist) {
            names.put(name, Collections.frequency(namelist, name));
        }
        return names;
    }
}
