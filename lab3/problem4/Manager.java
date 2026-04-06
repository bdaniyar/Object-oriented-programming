package problem4;

import java.util.Vector;
import java.util.Date;

class Manager extends Employee {

    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public double getBonus() {
        return bonus;
    }
    
    public int getTeamSize() {
        return team.size();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", bonus=" + bonus +
                ", teamSize=" + team.size();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Manager)) return false;
        Manager m = (Manager) o;
        return bonus == m.bonus;
    }

    // Comparable by salary first, then by bonus
    @Override
    public int compareTo(Employee o) {
        int salaryCompare = super.compareTo(o);
        if (salaryCompare != 0) return salaryCompare;
        if (o instanceof Manager) {
            Manager m = (Manager) o;
            return Double.compare(this.bonus, m.bonus);
        }
        return salaryCompare;
    }

    // Deep clone for Manager, including cloning the team
    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>();
        for (Employee e : this.team) {
            cloned.team.add(e.clone());
        }
        return cloned;
    }
}