package SingletonPattern;

public class Student {
    Student student = new Student();
    private Student(){}
    public Student getInstance(){
        if(null == student){
            return new Student();
        }
        return student;
    }
}
