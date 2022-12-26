public class EmployeesBook {
    private static  Employee[] employees = new Employee[10];
    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
    }
    public void printAllDataAboutTheEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public double calculateSumEmployeesSalary() {
        double sum = 0d;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getEmployeeSalary();
            }
        }
        return sum;
    }
    public void printSumEmployeesSalary() {
        System.out.println("Сумма затрат на зарплаты: " + calculateSumEmployeesSalary());
    }
    public int getFirstNotNullSalaryIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                return i;
            }
        }
        return 0;
    }
    public Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeSalary() < employeeWithMinSalary.getEmployeeSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }
    public void printEmployeeWithMinSalary() {
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary());
    }
    public Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeSalary() > employeeWithMaxSalary.getEmployeeSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }
    public void printEmployeeWithMaxSalary() {
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary());
    }
    public void calculateAndPrintAverageSalary() {
        System.out.println("Среднее значение зарплат: " + calculateSumEmployeesSalary() / employees.length);
    }
    public void printFullName() {
        for (Employee employee : employees) {
            System.out.println("Фамилия: " + employee.getSurName() + ", Имя: "
                    + employee.getName() + ", Отчество: " + employee.getMiddleName());
        }
    }
}
