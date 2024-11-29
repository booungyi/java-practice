package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JavaPracticeApplicationTest {

    @Test
    void getCommonElementsTest() {
        List<Integer> firstList = List.of(1, 2, 3);
        List<Integer> secondList = List.of(2, 3, 4);

        List<Integer> commonElements = getCommonElements(firstList, secondList);
        Map<Integer, Boolean> intTOBool = new HashMap<>();
        for (Integer i : secondList) {
            intTOBool.put(i, true);
        }
        for (Integer i : firstList) {
            if (intTOBool.get(i)) {

            }
        }

        assertThat(commonElements)
                .containsExactlyInAnyOrder(2, 3);

        assertThat(intTOBool.containsKey(1)).isFalse();
        assertThat(intTOBool.containsKey(2)).isTrue();
        assertThat(intTOBool.containsKey(3)).isTrue();
        assertThat(intTOBool.containsKey(4)).isFalse();
    }

    ArrayList<Integer> getCommonElements(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer lit : list1) {
            if (list2.contains(lit)) {
                list.add(lit);
            }
        }
        return list;
    }


//        Map<Integer, Boolean> intTOBool = new HashMap<>();
//        for (Integer i : listmap1) {
//            .put(i, true);
//        }
//        for (Integer i : listmap2)
//            if (int.get(i)) {
//
//            }
//            return 0;
}

