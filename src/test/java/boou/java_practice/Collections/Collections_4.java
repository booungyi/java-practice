package boou.java_practice.Collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Collections_4 {
    @Test
    void countNameOccurrencesTest2() {
        // 다음과 같은 이름 목록이 주어진 경우
        ArrayList<String> names = new ArrayList<>();
        // 박효신 10만명
        for (int i = 0; i < 100000; i++) {
            names.add("박효신");
        }
        names.add("이지은"); // 이지은 1명
        names.add("하현우"); // 하현우 1명

        long before = System.currentTimeMillis(); // 함수 실행 직전 시각
        // 이름별로 몇 명인지 세어 Map에 담으면
        Map<String, Integer> countsByName = countNameOccurrences(names);
        long after = System.currentTimeMillis(); // 함수 실행 완료 직후 시각
        System.out.println("걸린 시간: " + (after - before) / 1000.0 + "초");

        // Map의 이름별 인원수가 정확히 일치해야 한다
        assertThat(countsByName).containsEntry("박효신", 100000)
                .containsEntry("이지은", 1)
                .containsEntry("하현우", 1);
    }

    Map<String, Integer> countNameOccurrences(ArrayList<String> namelist) {
        Map<String, Integer> nameMap = new HashMap<>();
        for (String name : namelist) {
            nameMap.put(name, Collections.frequency(namelist, name));
        }
        return nameMap;
    }

}
