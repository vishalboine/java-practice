class Student {
    int RollNo;
    String Name;
    int Marks;
}

public class ArrayOfObjectEg {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.RollNo = 01;
        s1.Name = "Vishal";
        s1.Marks = 88;
        Student s2 = new Student();
        s2.RollNo = 02;
        s2.Name = "Neha";
        s2.Marks = 29;
        Student s3 = new Student();
        s3.RollNo = 03;
        s3.Name = "Manoj";
        s3.Marks = 1;

        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        // for(int i =0; i<s.length; i++){
        //     System.out.println("Name: "+s[i].Name+ " " + " Marks: "+ s[i].Marks);
        // }

        for(Student stud : s){
            System.out.println(stud.Name+" : "+stud.Marks);
        }

    }
}
