package week3.day1.abstraction;

public class Automation extends MultipleLanguage implements Language, TestTool {

	@Override
	public void selenium() {
		System.out.println("Selenium Method of TestTool interface implementation in Automation class");
	}

	@Override
	public void java() {
		System.out.println("Java Method of Language interface implementation in Automation class");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Method of MultipleLanguage abstract class implementation in Automation class");
	}

	public static void main(String[] args) {

		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();

	}

}
