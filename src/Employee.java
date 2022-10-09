public class Employee {
    private final String name;
    private final int workHours;
    private final int hireYear;
    private final double salary;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    private double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return 0.03;
        }
    }

    private double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    private double raiseSalary() {
        int diffYear = 2021 - this.hireYear;
        if (diffYear < 10) {
            return this.salary * 0.05;
        } else if (diffYear < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        String employeeInformation = "";
        employeeInformation += "Name: " + this.name;
        employeeInformation += "\nSalary: " + this.salary;
        employeeInformation += "\nWork Hours: " + this.workHours;
        employeeInformation += "\nHire Year: " + this.hireYear;
        employeeInformation += "\nTax: " + (this.salary + bonus()) * tax();
        employeeInformation += "\nBonus: " + bonus();
        employeeInformation += "\nRaise Salary: " + raiseSalary();
        employeeInformation += "\nSalary With Tax And Bonus: " + ((this.salary + bonus()) - ((this.salary + bonus()) * tax()));
        employeeInformation += "\nTotal Salary: " + ((this.salary + bonus()+raiseSalary()) - ((this.salary + bonus() + raiseSalary()) * tax()));;


        return  employeeInformation;
    }

}
