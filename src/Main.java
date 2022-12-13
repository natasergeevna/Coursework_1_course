public class Main {
    public static void separator() {
        System.out.println("--------------------");
    }

    public static int salaryMonth(Employee[] emp) {
        int sum = 0;
        for (Employee employee : emp) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зп в месяц: "+sum);
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
        System.out.println("Cреднее значение зп: "+salaryMonth(emp) / count);
    }

    public static void fullName(Employee[] emp) {
        System.out.println("\nСписок всех сотрудников:");
        for (Employee employee : emp) {
            System.out.println(employee.getFullName());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Shashina Natalia Sergeevna", 1, 200000);
        employees[1] = new Employee("Mishina Anna Petrovna", 2, 95000);
        employees[2] = new Employee("Shashin Petr Pavlovich", 3, 85000);
        employees[3] = new Employee("Berezina Ekaterina Sergeevna", 4, 75000);
        employees[4] = new Employee("Yakimova Julia Anatolievna", 5, 65000);
        employees[5] = new Employee("Busko Polina Vitalievna", 4, 50000);
        employees[6] = new Employee("Kabanova Vlada Sergeevna", 5, 70000);
        employees[7] = new Employee("Dybovitskaya Larisa Petrovna", 1, 80000);
        employees[8] = new Employee("Shashin Sergey Pavlovich", 2, 90000);
        employees[9] = new Employee("Degtuareva Nadezda Valentinovna", 3, 100000);

        separator();
        for (Employee employee : employees) {  //8a
            System.out.println(employee);
            separator();
        }
        salaryMonth(employees);
        minSalary(employees);
        maxSalary(employees);
        averageSlary(employees);
        fullName(employees);
    }
}