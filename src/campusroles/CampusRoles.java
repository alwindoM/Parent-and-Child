package campusroles;

//Parent Class
class Person
{
    String name;
    
    void introduce()
    {
        System.out.println("Halo namaku adalah "+name+".");
    }
}

//child class
class Student extends Person
{
    String studentId;
    
    void showStudentInfo()
    {
        System.out.println("Aku adalah murid dengan ID "+studentId+".");
    }
}

//Child class 2
class Lecturer extends Person
{
    String subject;
    
    void showLecturerInfo()
    {
        System.out.println("Aku mengajar subjek: "+subject+".");
    }
}

//Main class
public class CampusRoles
{
    public static void main(String[]args)
    {
        //Object Student
        Student student = new Student();
        student.name = "Towa";
        student.studentId = "666";
        student.introduce();
        student.showStudentInfo();
        
        System.out.println();
        
        //Object Lecturer
        Lecturer lecturer = new Lecturer();
        lecturer.name = "Suisei";
        lecturer.subject = "Idol";
        lecturer.introduce();
        lecturer.showLecturerInfo();
    }
}
