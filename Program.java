package designPatternSingleTon;

import java.util.ArrayList;

public class Program {
	private static Program program;
	private ArrayList<String> Mentors;

	public Program() {
		Mentors = new ArrayList<String>();
		Mentors.add("Mentor 1");
		Mentors.add("Mentor 2");
		Mentors.add("Mentor 3");
		Mentors.add("Mentor 4");
		Mentors.add("Mentor 5");
	}

	public static Program singleton() {
		if (program == null || program.Mentors.size() == 0)
			program = new Program();
		return program;
		// If a program doesnt exist, make a new program.

		// If a program exists, return program

		// If there is a program and no mentors are available to assign to
		// mentees, it will make a new program.
	}

	public String getMentor() {
		// Assigning mentor to a mentee
		if (Mentors.size() > 0)
			return Mentors.remove(0);
		// Removing the Mentor from the list as he is assigned now
		return "No Teacher";
	}
}
