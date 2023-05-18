package week3.day1.bank;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("This is a deposit account in Axis bank");
	}

	public static void main(String[] args) {

		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();

	}

}
