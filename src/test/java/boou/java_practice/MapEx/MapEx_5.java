package boou.java_practice.MapEx;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

public class MapEx_5 {

    @Test
    void myFrequencyTest() {
        assertThat(List(1)).isFalse();
        assertThat(List(2)).isTrue();
        assertThat(List(3)).isTrue();

        ArrayList<String> names = new ArrayList<>();
        names.add("박효신");
        names.add("이지은");
        names.add("이지은");
        names.add("하현우");
        names.add("하현우");
        names.add("하현우");

//        int 박효신Count = myFrequency(names, "박효신");
//        int 이지은Count = myFrequency(names, "이지은");
//        int 하현우Count = myFrequency(names, "하현우");
//
//        assertThat(박효신Count).isEqualTo(1);
//        assertThat(이지은Count).isEqualTo(2);
//        assertThat(하현우Count).isEqualTo(3);
    }



    Boolean List(Integer n) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer lis : list) {
            if (list.contains(n)) {
                return true;
            }
        }
        return false;
    }
}
