package week3.day1;

public class AxisBank {
	public void deposit()
	{
		System.out.println("deposit");
	}
	public static void main(String[] args) {
		
		
		BankInfo info=new BankInfo();
		info.savings();
		info.fixed();
		info.deposit();
		AxisBank axis =new AxisBank();
		axis.deposit();
	}

}
