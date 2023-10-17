public class Student {
    String name;
    int age;
    int ID;
    boolean isStudentIdValid;
    int semesterNumber;
    double averageGrade;
    void sayHello(){
        System.out.println("Hello from "+name);
}
    void displayName(){
        System.out.println(name);
}
    void displayAge(){
        System.out.println(age);
}
void displayData(){
        System.out.println(name+" "+semesterNumber+" "+averageGrade);
}

void displayId(){
        System.out.println(name+" "+ID+" "+(isStudentIdValid ? "valid" : "invalid"));


}
}
