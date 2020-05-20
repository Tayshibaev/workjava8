import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stringCollection.add("aaa1");

//        List<String> list = stringCollection.stream().filter((a->a.contains("1")))
//                .map(a->a.toUpperCase())
//                .collect(Collectors.toList());
//
//
//                long count = list.stream().sorted().count();
//        System.out.println(count);


//        Map<Integer, String> map = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            map.putIfAbsent(i, "val" + i);
//        }
//        map.forEach((id, val) -> System.out.println(id+" "+val));

        DateTimeFormatter dd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate dd1= (LocalDate) dd.parse("2103-08-08");

        LocalDate date = LocalDate.now();

        System.out.println(dd.format(date));

    }
}

