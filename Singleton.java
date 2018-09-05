package designPatternSingleTon;

public class Singleton {
	static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		System.out.println("This is singleton");
		return instance;
	}
}
