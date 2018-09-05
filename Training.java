package designPatternSingleTon;

public class Training {
	String Mentee, Mentor;

	public Training(String traineeName) {
		this.Mentee = traineeName;
		Program program = Program.singleton();
		Mentor = program.getMentor();
	}

	public String getMentee() {
		return Mentee;
	}

	public void setMentee(String mentee) {
		Mentee = mentee;
	}

	public String getMentor() {
		return Mentor;
	}

	public void setMentor(String mentor) {
		Mentor = mentor;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Training java = new Training("Mentee " + i);
			System.out.println(java.getMentee() + " has Mentor: " + java.getMentor());
		}
	}
}
