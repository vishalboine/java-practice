
import java.util.*;


class Student {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}


public class ComperatorEg {
    public static void main(String[] args) {
        
        
        Comparator<Student> c = ( i, j ) -> i.age > j.age ? 1 : -1;

        
        List<Student> stud = new ArrayList<>();

        stud.add(new Student(21,"Vishal" ));
        stud.add(new Student(22,"Neha" ));
        stud.add(new Student(18,"Jack" ));
        stud.add(new Student(34,"John" ));
        stud.add(new Student(11,"Sameer" ));

        Collections.sort(stud, c);

        for(Student s : stud){
            System.out.println(s);
        }

    }
}
