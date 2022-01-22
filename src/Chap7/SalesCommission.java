package Chap7;

public class SalesCommission {
	private final int weeklyPayment = 200;
	private final double standardCommission = 0.09;
	
	private int[] grossSales = {2050, 3600, 4000, 500, 2000, 3000};
	private int[] arrayOfCounters = new int[9];

	public Integer getGrossSales(int index) {
		
		// TODO Auto-generated method stub
		return grossSales[index];
	}
	
	public int getSalary(int index) {
		int salary = (int) (grossSales[index] * standardCommission + weeklyPayment);
		return salary;
	}
	
	
}
