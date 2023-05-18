package week3.day1.org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("The desktop size is 19 Inches");
	}

	public static void main(String[] args) {

		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();

	}

}
