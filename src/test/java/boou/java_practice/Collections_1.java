package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Collections_1 {
    @Test
    void myFrequencyTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("박효신");
        names.add("이지은");
        names.add("이지은");
        names.add("하현우");
        names.add("하현우");
        names.add("하현우");



        myFrequency(names, "박효신");
        int 박효신Count = myFrequency(names, "박효신");
        int 이지은Count = myFrequency(names, "이지은");
        int 하현우Count = myFrequency(names, "하현우");

        assertThat(박효신Count).isEqualTo(1);
        assertThat(이지은Count).isEqualTo(2);
        assertThat(하현우Count).isEqualTo(3);
    }

    int myFrequency(List<String> name1, String name2) {
        Map<List<String>, String> nameMap = new HashMap<>();
        for (List<String> strings : nameMap.keySet()) {
            if (name2.equals(strings)) {
                nameMap.put(strings,)
            }
        }
    }

//    int Collection(List<String> name1, String name2) {
//        Map<List<Integer>, Integer> names = new HashMap<>();
//
//        for (String name : name1) {
//            if (name1.contains(name2)) {
//
//            }
//        }
//        return nameMap.get();
//    }
}
