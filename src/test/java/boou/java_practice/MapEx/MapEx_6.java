package boou.java_practice.MapEx;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

public class MapEx_6 {


    @Test
    void myContainsTest() {

        ArrayList<String> names = new ArrayList<>();
        names.add("박효신");
        names.add("이지은");
        names.add("하현우");

        boolean 하현우존재여부 = myContains(names, "하현우");
        boolean 잔나비존재여부 = myContains(names, "잔나비");

        assertThat(하현우존재여부).isTrue();
        assertThat(잔나비존재여부).isFalse();

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

        ArrayList<ArrayList<String>> 세계도시들 = new ArrayList<>();
        세계도시들.add(한국도시들);
        세계도시들.add(미국도시들);
        세계도시들.add(독일도시들);

        for (ArrayList<String> 나라별도시들 : 세계도시들) {
            for (String 도시 : 나라별도시들) {
                System.out.println("도시 = " + 도시);
            }
        }
        System.out.println(세계도시들); // false


    }
    Boolean myContains (List<String> name1 ,String name2 ){
        return name1.contains(name2);
    }
    //TODO: 도시 List 로 표현하기
    //한국의 도시
    //제주 강릉 울산

}
