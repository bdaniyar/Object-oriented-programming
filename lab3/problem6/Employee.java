package problem6;

import lab2.problem5.Person;

class Employee extends Person implements Payable, Comparable<Employee>, Cloneable {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getOccupation() {
        return "Employee";
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}
