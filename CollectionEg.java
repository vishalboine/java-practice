// import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionEg {
    public static void main(String[] args) {
        Set<Integer> num1 = new TreeSet<>();        //sorted unique values
        
        Collection<Integer> num2 = new ArrayList<>();
        Set<Integer> num3 = new HashSet<>();          // not sorted unique values


        Map<String, Integer> students = new HashMap<>();

        students.put("Vishal", 100);
        students.put("Shiv", 80);
        students.put("Ravi", 90);
        students.put("Krunal", 40);
        students.put("Shiv", 70);


        for(String key :  students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }

        num1.add(22);
        num1.add(44);
        num1.add(3);
        num1.add(4);
        num1.add(32);

        num2.add(22);
        num2.add(44);
        num2.add(3);
        num2.add(4);
        num2.add(32);


        num1.forEach((item)->System.out.println(item));
        System.out.println(num2);
        System.out.println(students);
    }
}
