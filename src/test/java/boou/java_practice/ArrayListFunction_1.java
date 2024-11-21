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

        //assertThat(getSum(List.of(1,2,3,4))).isEqualTo(10);
        System.out.println(getSum(List.of(1,2,3,4)));
    }

    ArrayList getSum(List<Integer> a) {
        ArrayList<Integer> getSum = new ArrayList<Integer>();


        int getone = 0;
        getSum.add(1);
        getSum.add(2);
        getSum.add(3);
        getSum.add(4);
//        getone += getSum.get();
        return getSum;
    }
}


