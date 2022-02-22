package Quiz1;

public class Student extends Person{
    public Student(String name, int id, int age) {
        super(name, id, age);
    }

    public void takeQuiz(String answer){
        System.out.println("My answer of the quiz");
    }
}
