public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 55000);

        printAllEmployees(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
}