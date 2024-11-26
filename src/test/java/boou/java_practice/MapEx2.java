package boou.java_practice;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {
        Boolean stop = false;
        HashMap<String, Integer > namelist = new HashMap<>();
        List<String> nameList = List.of(
                "권상윤",
                "김민성", "추민영", "김성락", "황승혁", "문성희", "문인혁", "박현지", "윤찬영",
                "윤태우", "권상윤", "이채현", "황효진", "권상윤", "황승혁", "박현지", "이호연",
                "전지예", "정해준", "문인혁", "김성락", "추민영", "허재", "황승혁", "황효진");
        //namelist 에 nameList 안의 String 값을 넣기

        for (String name : nameList) {
            namelist.put(name, 2);
            if (namelist.get(name).equals(namelist.)) {
                namelist.put(name, namelist.get(name) + 1);
            }
        }


//       while (!stop){
//           int i = 0;
//            namelist.put(i,namelist.get(i));
//           i++;
//           if (nameList.size()>) {
//           }
//        }
    }
}

