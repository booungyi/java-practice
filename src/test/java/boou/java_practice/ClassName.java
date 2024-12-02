package boou.java_practice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassName {

    @Test
    void test() {
        List<String> names = List.of("윤찬영",
                "정해준",
                "권상윤",
                "문인혁",
                "허재",
                "이호연",
                "윤태우",
                "김성락",
                "전지예",
                "황승혁",
                "이채현",
                "황효진",
                "김민성",
                "박현지",
                "문성희",
                "추민영");
        System.out.println(classname(names));
    }

    List<List<String>> classname(List<String> classnames) {
        ArrayList<List<String>> namelist = new ArrayList<>();
        ArrayList<String> team = new ArrayList<>();
        for (String classname : classnames) {
            team.add(classname);
            if (team.size() == 4) {
                namelist.add(new ArrayList<>(team));
                team = new ArrayList<>();
            }
        }
        if (!team.isEmpty()) {
            namelist.add(team);
        }

        return namelist;
    }
}
