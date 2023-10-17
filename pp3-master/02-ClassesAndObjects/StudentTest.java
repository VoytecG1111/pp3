public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.ID = 226712;
        s.age = 21;
        s.semesterNumber = 3;
        s.averageGrade = 3.0;
        s.isStudentIdValid = true;
        System.out.println(s.name + " " + s.age);

        Student b = new Student();
        
        b.name = "Chris";
        b.age = 27;
        //System.out.println(b.name + " " + b.age);

        //s.sayHello();
        //b.sayHello();
        s.displayId();
    }

}
