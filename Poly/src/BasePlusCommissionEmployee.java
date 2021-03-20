
public class BasePlusCommissionEmployee extends ComissionEmployee {
	public double baseSalary;
	
	//Constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if(baseSalary < 0.0) throw new IllegalArgumentException("Base Salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	//Set base salary
	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0) throw new IllegalArgumentException("Base Salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	//Return String representation of BasePlusCommissionEmployee object
	@Override
	public String toString() {
		return String.format("%s %s: %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
	}
}

