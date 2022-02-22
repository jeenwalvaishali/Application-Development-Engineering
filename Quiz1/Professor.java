package Quiz1;

public class Professor extends Person {

    public Professor(String name, int id, int age) {
        super(name, id, age);
    }

    public void giveQuiz(String quiz){
        System.out.println(quiz + "Question of the quiz");
    }
}
