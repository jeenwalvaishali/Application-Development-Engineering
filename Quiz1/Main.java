package Quiz1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String quiz = "Quiz1";
        Professor professor = new Professor("Professor Aashish",1, 45);
        professor.giveQuiz(quiz);

        String answer = "answer";
        Student student = new Student("Vaishali Jeenwal", 16, 29);
        student.takeQuiz(answer);
    }
}
