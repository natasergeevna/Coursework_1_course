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

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
