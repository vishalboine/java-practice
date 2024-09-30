import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if(this.age> that.age)
            return 1;
        else 
            return -1;
    }
    
}



public class ComparableEg {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();

        stud.add(new Student(21,"Vishal"));
        stud.add(new Student(22,"Sameer"));
        stud.add(new Student(32,"John"));
        stud.add(new Student(11,"Jack"));
        stud.add(new Student(44,"Neha"));

        Collections.sort(stud);

        for(Student s : stud){
            System.out.println(s);
        }


    }
}
