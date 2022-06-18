package Acount;

class Accounting2 {
	public double valueOfSupply;
	public static double vatRate = 0.1;
	public Accounting2(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp2 {
	public static void main(String[] args) {
		Accounting2 ac = new Accounting2(10000.0);
		
		System.out.println("Value of supply : " + ac.valueOfSupply);
		System.out.println("VAT : " + ac.getVAT());
		System.out.println("Total : " + ac.getTotal());

	}
}
