package DayThree.Scanner;

public class TaxCalculation {
	
	public void caculateTax(Person s) {
		if(s.getAge() > 65 ||s.getGender().equalsIgnoreCase("female")) {
			s.setTax(0);
			System.out.println("Tax is not applicable ");
		}else {
			if(s.getIncome() <= 160000) {
				s.setTax(0);
				System.out.println("Tax is not applicable ");

			}else if(s.getIncome() > 160000 && s.getIncome() <= 800000) {
				s.setTax((s.getIncome() - 160000) *10/100);
			}
			else if(s.getIncome() > 500000 && s.getIncome() <= 500000) {
				s.setTax((s.getIncome() - 500000) *20/100 + 34000);
			}else {
				s.setTax((s.getIncome() - 800000) *30/100 + 94000);
			}
		}
	}
	

}
