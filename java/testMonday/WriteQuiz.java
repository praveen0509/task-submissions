package testMonday;
import java.util.*;

public class WriteQuiz {
	@SuppressWarnings("null")
	public static void main(String args[]) throws Exception{
		
		Question quizQ = null;

		/*hard coding the questoins */
		quizQ.addQuestion(new Question("Entomology is the science that studies" +
				"*A.Behavior of human beings" +
				"*B.Insects" +
				"*c.The origin and history of technical and scientific terms" +
				"*D.The formation of rocks", 1, "B"));
		
		quizQ.addQuestion(new Question("SemanticBits Started in the Year:" +
				"*A.2005" +
				"*B.2006" +
				"*c.2007" +
				"*D.2010", 2, "A"));
		
		quizQ.addQuestion(new Question("No.of Employees in SB:" +
				"*A.Below 50" +
				"*B.Above 50" +
				"*c.Above 100" +
				"*D.above 200", 3, "C"));
		
		Question nextQuestion=quizQ.getNextQuestion();
		System.out.println("level:"+nextQuestion.level+"Question:"+nextQuestion.question+" CorrctAnswer"+nextQuestion.correctAnswer);
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name, age, PhoneNumber of The participant");
		Participant quizP;
		quizP.registerParticipant(sc.nextLine(), sc.nextInt(), sc.nextLong());
		System.out.println("Current Level:"+quizP.getCurrentLevel());
		
		
	}

}




interface Quiz
{
	ArrayList<Question> al=new ArrayList<Question>();
	// addQuestion adds the question given in the parameter and adds it to the questions array
	void addQuestion(Question q);

	// The quiz begins with the registration of the participant
	// Participant name, age in years, phone number and friend's phone number are the parameters
	// an instance of the participant should be created and returned
	Participant registerParticipant(String name, int age, long phone);

	// getCurrentLevel returns the current level the participant is playing
	// It should return a value between 1 - 15 inclusive
	int getCurrentLevel();

	// getNextQuestion returns the next question for the participant to answer
	// The question object has the question text along with options A B C and D
	Question getNextQuestion();

	// lockAnswer accepts the question object and the participants answer
	// Checks if the answer is correct and returns true.
	// If the answer is incorrect it returns false.
	// It also updates the participant's
	boolean lockAnswer(Question q, String answer);

	// getPrizeMoney returns the current prize money the participant is awarded
	// For example, if he/she answered level 6 then Rs. 20,000 is the prize money.
	int getPrizeMoney();

}





class Question implements Quiz{
	
	String question;
	int level;
	String correctAnswer;
	
	
	Question(String question,int level, String correctAnswer) {
		this.question=question;
		this.level=level;
		this.correctAnswer=correctAnswer;		
	}
	
	public void addQuestion(Question q){
		al.add(q);
	}
	
	public Question getNextQuestion() {
		for(Question q:al) {
			return q;			
		}
		return null;		
	}
	
	public Participant registerParticipant(String name, int age, long phone){
		return null;}
	
	
	public int getPrizeMoney(){
		if(level==15)
			return 320000;
		else if (5<level && 10>level)
			return 50000;
		else if(10<level && 15<level)
			return 150000;
		else {
			System.out.println("Sorry you lost the quiz");
			return 0;
		}
	}
	
	public int getCurrentLevel() {
		return level;		
	}
	
	public boolean lockAnswer(Question q, String answer){
		if(answer==q.correctAnswer) {
		    level++;
			return true;
		}
		else {
			level--;
			return false;
		}
	}
	
}







class Participant implements Quiz {
	
	String name;
	int age;
	long phNo;
	int currLevel=0;
	int prizeMoney=0;
	
	public Participant registerParticipant(String name, int age, long phNo) {
		this.name=name;
		this.age=age;
		this.phNo=phNo;
		return null;
	}
	
	public void addQuestion(Question q){}
	
	public int getCurrentLevel() {
		return currLevel;		
	}
	
	ArrayList<Question> al=new ArrayList<Question>();
	public Question getNextQuestion() {
		for(Question q:al) {
			return q;			
		}
		return null;		
	}
	
	Scanner sc=new Scanner(System.in);
	public boolean lockAnswer(Question q, String answer){
		System.out.println("Enter Your Answer:"+sc.next());
		String s=sc.next();
		if(s.equals(q.correctAnswer))
			return true;
		else 
			return false;		
	}

	
	public int getPrizeMoney() {
		if(currLevel==15)
			return 320000;
		else if (5<currLevel && 10>currLevel)
			return 50000;
		else if(10<currLevel && 15<currLevel)
			return 150000;
		else {
			System.out.println("Sorry you lost the quiz");
			return 0;
		}
	}
	
	
}
















