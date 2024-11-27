package boou.java_practice;

import ch.qos.logback.core.net.ssl.SSL;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class MapEx_4 {
    @Test
    void test() {
        assertThat(countDuplicateItems(List.of(1000, 2000, 1000, 3000, 2000))).containsExactlyInAnyOrder(List.of(1000, 2), List.of(2000, 2), List.of(3000, 1));
        assertThat(countDuplicateItems(List.of(5000))).containsExactlyInAnyOrder(List.of(5000, 1));
        assertThat(countDuplicateItems(List.of())).isEqualTo(List.of());

        // TODO: 두 리스트에 모두 존재하는 수 찾기(교집합 찾기)
        ArrayList<Integer> section = new ArrayList<>();
        List<Integer> section2 = new ArrayList<>();
        section.add(1);
        section.add(2);
        section.add(3);
        section.add(4);

        section2.add(2);
        section2.add(4);
        section2.add(5);
        section2.add(6);

        List<Integer> section3 = new ArrayList<>();

        for (Integer list : section2) {
            if (section.contains(list)) {
                section3.add(list);
            }
        }
        System.out.println(section3);


        //TODO: Map 의 Value 가 리스트인 상황
        Map<String, List<String>> Worldmap = new HashMap<>();
        //worldmap 의 string 부분을 contry 로하고
        //worldmap 의 두번재 부분을 리스트 로 가져옴
        List<String> Korea = new ArrayList<>();
        List<String> USA = new ArrayList<>();
        List<String> GER = new ArrayList<>();

        Korea.add("제주");
        Korea.add("강릉");
        Korea.add("부여");

        USA.add("뉴욕");
        USA.add("LA");
        USA.add("디트로이트");

        GER.add("함부르크");
        GER.add("뮌헨");
        GER.add("프랑크푸르트");

        Worldmap.put("한국", Korea);
        Worldmap.put("미국", USA);
        Worldmap.put("독일", GER);

        System.out.println(Worldmap);


        //TODO: List의 요소(element)들이 MAP 인 상황
        // List (1) 에는 {Map(상품명: (칙촉\n 가격: 2000원\n 카테고리:식품)]} 이들어있고
        // 2 == {Map(상품명:,(세탁 건조 일체형 워시 콤보\n 가격:400만원 \n 카테고리: 가전) )EX

        //
        List<String> elementlist = new ArrayList<>();
        Map<Integer, String> elementMap = new HashMap<>();
        elementMap.put(1, "1\n  상품명: 칙촉\n  가격:2000원\n  카테고리:식품\n");
        elementMap.put(2, "2\n  상품명: 세탁 건조 일체형 워시 콤보\n  가격:400만원\n  카테고리:가전\n");
        elementMap.put(3, "3\n  상품명: 바나나우유\n  가격:1700원\n  카테고리:식품\n");

        elementlist.add(elementMap.get(1));
        elementlist.add(elementMap.get(2));
        elementlist.add(elementMap.get(3));


        System.out.println(elementlist.get(0));
    }


    //중북 상품 개수 계산
    //HashMap 도 함께 사용해야 함
    //integer 타입의 상품 가격 리스트가 주어짐(input)
    // 다음 조건에 맞는 함수 를 작성해주세용
    // 각 가격의 상품이 리스트에 몇개 존재하는지 계산합니다.
    // 상품 가격과 그 개수를 매핑한 새로운 리스트를 반환합니다.
    // 결과 리스트는 [가격,개수] 형태여야 합니다.
        List<List<Integer>> countDuplicateItems(List<Integer> numbers) {
            HashMap<Integer, Integer> priceMap = new HashMap<>();

        for (Integer number : numbers) {
            priceMap.put(number,priceMap.getOrDefault(number, 0) +1);
        }
            List<List<Integer>> price = new ArrayList<>();
            for (Map.Entry<Integer,Integer> entry : priceMap.entrySet()) {
                price.add(new ArrayList<>(Arrays.asList(
                        entry.getKey(),
                        entry.getValue()
                )));
            }
        return price;
    }
}

