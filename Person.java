//2- Create 'Person' interface and that interface should have getAttandenceString() function.
//Create two class Teacher and  Student. Both should have necessary fields.
//Last step update the Italian and Math class's takeAttandence function's parameter to
// Person type and just call getAttandenceString()
public interface Person  {
    String getAttendanceString();

}
class Teacher implements Person{
    String name;
    String subject;
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    @Override
    public String getAttendanceString() {
        return "Teacher{" +
                "TeacherName:'" + name + '\'' +
                ", Subject:'" + subject+ '\'' +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
class Student implements Person{
    String studName;
    String id;
    public Student(String studName, String id){
        this.studName = studName;
        this.id = id;

    }
    @Override
    public String getAttendanceString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", id='" + id + '\'' +
                '}';

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }
}