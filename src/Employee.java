public class Employee {
    private String fullName;
    private int depart;
    private int salary;
    private static int count;
    private int id;

    public String getFullName() {
        return this.fullName;
    }

    public int getDepart() {
        return this.depart;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public int setDepart(int depart) {
        this.depart = depart;
        return this.depart;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return this.salary;
    }

    public Employee(String fullName, int depart, int salary) {
        this.fullName = fullName;
        this.depart = depart;
        this.salary = salary;
        this.id = count++;
    }

    public String toString() {
        return "ID: " + getId() + "\nFull Name: " + getFullName() + "\nDepartment: " + getDepart() + "\nSalary: " + getSalary();
    }

}
