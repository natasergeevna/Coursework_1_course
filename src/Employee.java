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
        return "ID: " + this.id + "\nFull Name: " + this.fullName + "\nDepartment: " + this.depart + "\nSalary: " + this.salary;
    }

    public static void separator() {
        System.out.println("--------------------");
    }

    public static int salaryMonth(Employee[] emp) {
        int sum = 0;
        for (Employee employee : emp) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void minSalary(Employee[] emp) {
        int min = emp[0].getSalary();
        String person = emp[0].getFullName();
        for (Employee employee : emp) {
            if (min >= employee.getSalary()) {
                min = employee.getSalary();
                person = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зп: " + person);
    }

    public static void maxSalary(Employee[] emp) {
        int max = emp[0].getSalary();
        String person = emp[0].getFullName();
        for (Employee employee : emp) {
            if (max <= employee.getSalary()) {
                max = employee.getSalary();
                person = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зп: " + person);
    }

    public static void averageSlary(Employee[] emp) {
        int count = 0;
        for (int i = 0; i < emp.length; i++) {
            count++;
        }
        System.out.println("Cреднее значение зп: "+Employee.salaryMonth(emp) / count);
    }

    public static void fullName(Employee[] emp) {
        System.out.println("\nСписок всех сотрудников:");
        for (Employee employee : emp) {
            System.out.println(employee.getFullName());
        }
    }

}
