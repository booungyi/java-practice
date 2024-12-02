package boou.java_practice.MapEx;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class MapEx_1 {
    @Test
    void name() {

        Map<String, String> englishKorean = new HashMap<>();
        englishKorean.put("book", "책");
        englishKorean.put("apple", "사가ㅗ");
        englishKorean.put("car", "자동차");

        englishKorean.put("apple", "사과");

        assertThat(englishKorean).containsEntry("apple", "사과");
    }

    // 문제: HashMap을 사용하여 다음 작업을 수행하세요:
    // 1. 학생 이름(String)과 나이(Integer)를 저장하는 Map을 생성하세요
    // 2. 3명의 학생 정보를 추가하세요
    // 3. 특정 학생의 나이를 출력하세요
    @Test
    void studentAgeMap() {
        Map<String, Integer> studenetAgeMap = new HashMap<>();
        studenetAgeMap.put("학생1", 15);
        studenetAgeMap.put("학생2", 20);
        studenetAgeMap.put("학생3", 18);
        System.out.println("studenetAgeMap = " + studenetAgeMap);
        System.out.println(studenetAgeMap.get("학생1"));
        // 여기에 코드 작성
    }

    // 문제: 다음 작업을 수행하는 메서드를 작성하세요:
    // 1. 과일 이름(String)과 가격(Integer)을 저장하는 Map을 생성하세요
    // 2. 모든 과일의 이름과 가격을 출력하세요
    // 3. 특정 과일의 가격을 업데이트하세요

    @Test
    void fruitPriceMap() {
        Map<String, Integer> fruitPriceMap = new HashMap<>();
        fruitPriceMap.put("사과", 20000);
        fruitPriceMap.put("포도", 5000);
        fruitPriceMap.put("수박", 100000);
        fruitPriceMap.put("딸기", 200000);

        System.out.println("fruitPriceMap = " + fruitPriceMap);

        List<String> list = new ArrayList<>(fruitPriceMap.keySet());

        fruitPriceMap.put("사과", 50000);
        // 여기에 코드 작성
        // 4. 가격이 특정 금액 이상인 과일들만 출력하세요
        if (fruitPriceMap.get(list) < 100000) {
            System.out.println(fruitPriceMap.get(list));
        }
    }
}
