import java.util.ArrayList;
import java.util.List;


//1- Create "Class" interface which will have takeAttendance and
// getAttendanceList functions.
//implement that interface from 2 class which
// called "Math" and "Italian". write test cases.
public interface Class {
    void takeAttendance(Person student );
    List<String> getAttendanceList();
}
class Math implements Class{
    List<String> attendanceList = new ArrayList<>();
    @Override
    public void takeAttendance(Person student) {//update takeAttendance function's parameter to Person type
        attendanceList.add(student.getAttendanceString()); //and just call getAttendanceString()
    }

    @Override
    public List<String> getAttendanceList() {
        return attendanceList;
    }

}

class Italian implements Class{
    List<String> attendanceList = new ArrayList<>();
    @Override
    public void takeAttendance(Person student){//update takeAttendance function's parameter to Person type
        attendanceList.add(student.getAttendanceString());//and just call getAttendanceString()
    }

    @Override
    public List<String> getAttendanceList() {
        return attendanceList;
    }
}
class ClassTest{
    public static void main(String[] args) {
        Class mathClass = new Math();
        Class italianClass = new Italian();
        Person student1 = new Student("hana","H123");
        Person student2 = new Student("Prince","P123");
        italianClass.takeAttendance(student1);
        italianClass.takeAttendance(student2);
        System.out.println(italianClass.getAttendanceList());
        Person teacher = new Teacher("Huseyin","Java");
        System.out.println(teacher.getAttendanceString());
        Person teacher2 = new Teacher("Osman","Coaching");
        System.out.println(teacher2.getAttendanceString());
    }
}