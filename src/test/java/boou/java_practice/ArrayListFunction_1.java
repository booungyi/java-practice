package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ArrayListFunction_1 {

    @Test
    void list() {

        assertThat(getSum(List.of(1, 2, 3, 4))).isEqualTo(10);
        assertThat(getSum(List.of(7))).isEqualTo(7);
        assertThat(getSum(List.of())).isEqualTo(0); // 빈 리스트가 주어질 경우 0을 return;
        //getSum(List.of(1, 2, 3, 4))의 의미는 List.of(1, 2, 3, 4)를 통해 리스트를 생성하고,
        // 그 리스트를 getSum 함수의 입력값으로 전달하는 것

    }

    int getSum (List<Integer> numbers) {
        // 컬렉션 클래스는 객체만 다룰 수 있기 때문에, int 를 사용할수없다
        //int: 원시 타입으로, 컬렉션에 바로 저장할 수 없습니다.
        //왜 List<Integer>인가?: List와 같은 컬렉션은 원시 타입인 int를 저장할 수 없기 때문에,
        //Integer와 같은 객체 타입을 사용해야 합니다.

        int getone = 0;      //리스트 를 더할 변수 생성
        for (Integer list : numbers) {
            //(리스트) 안에 들어잇는 수 를 더함
            getone += list;
        }
        return getone;
    }
}


