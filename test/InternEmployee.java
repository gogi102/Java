package test;

public class InternEmployee implements Employee{

    private final double baseSalary;
    private final EmployeeType employeeType;

    public InternEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
        this.employeeType = EmployeeType.INTERN;
    }

    @Override
    public double calculateSalary() {
        return employeeType.adjustBaseSalary(baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + employeeType +
                '}';
    }
}
