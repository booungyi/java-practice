package boou.java_practice.Collections;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class Collections_3_2 {
    @Test
    void countNameOccurrencesTest1_2() {
        List<String> names = List.of(
                "권상윤", "김민성", "추민영", "김성락",
                "황승혁", "문성희", "문인혁", "박현지", "윤찬영",
                "윤태우", "권상윤", "이채현", "황효진", "권상윤",
                "황승혁", "박현지", "이호연", "전지예", "정해준",
                "문인혁", "김성락", "추민영", "허재", "황승혁",
                "황효진"
        );

        Map<String, Integer> countsByName = countNameOccurrences(names);

        assertThat(countsByName).containsEntry("추민영", 2)
                .containsEntry("문성희", 1)
                .containsEntry("전지예", 1)
                .containsEntry("정해준", 1)
                .containsEntry("김성락", 2)
                .containsEntry("이호연", 1)
                .containsEntry("권상윤", 3)
                .containsEntry("황승혁", 3)
                .containsEntry("박현지", 2)
                .containsEntry("김민성", 1)
                .containsEntry("이채현", 1)
                .containsEntry("문인혁", 2)
                .containsEntry("황효진", 2)
                .containsEntry("윤찬영", 1)
                .containsEntry("윤태우", 1)
                .containsEntry("허재", 1);
    }

    Map<String, Integer> countNameOccurrences(List<String> namelist) {
        Map<String, Integer> nameMap = new HashMap<>();
        for (String name : namelist) {
            nameMap.put(name, Collections.frequency(namelist, name));
        }
        return nameMap;
    }
}



