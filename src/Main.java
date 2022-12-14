public class Main {
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

        Employee.separator();
        for (Employee employee : employees) {  //8a
            System.out.println(employee);
            Employee.separator();
        }

        System.out.println("Сумма затрат на зп в месяц: " + Employee.salaryMonth(employees));
        Employee.minSalary(employees);
        Employee.maxSalary(employees);
        Employee.averageSlary(employees);
        Employee.fullName(employees);
    }
}