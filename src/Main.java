public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 55000);

        printAllEmployees(employees);
        double totalSalaryExpenses = calculateTotalSalaryExpenses(employees);
        System.out.println("Общие затраты на ЗП: " + totalSalaryExpenses);

        Employee minSalaryEmployee = findMinSalaryEmployee(employees);
        System.out.println("Сотрудник с минимальной ЗП: " + minSalaryEmployee);

        Employee maxSalaryEmployee = findMaxSalaryEmployee(employees);
        System.out.println("Сотрудник с максимальной ЗП: " + maxSalaryEmployee);

        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Средняя зарплата: " + averageSalary);

        printFullNames(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalaryExpenses(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static Employee findMinSalaryEmployee(Employee[] employees) {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployee(Employee[] employees) {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                count++;
            }
        }
        return count > 0 ? totalSalary / count : 0;
    }

    public static void printFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}