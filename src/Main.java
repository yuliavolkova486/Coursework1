public class Main {

    public static void main(String[] args) {
        EmployeesBook employeesBook = new EmployeesBook();
        employeesBook.addEmployee(new Employee("Иванов", "Иван", "Иванович", "1", 65_358.07));
        employeesBook.addEmployee(new Employee("Петров", "Пётр", "Петрович", "2", 56_446.48));
        employeesBook.addEmployee(new Employee("Сидоров", "Сидор", "Сидорович","3", 73_221.03));
        employeesBook.addEmployee(new Employee("Орлов", "Никита", "Сергеевич", "2", 59_332.09));
        employeesBook.addEmployee(new Employee("Петухов", "Александр", "Прокопьевич", "1", 61_977.32));
        employeesBook.addEmployee(new Employee("Никитин", "Олег", "Олегович", "4", 49_228.55));
        employeesBook.addEmployee(new Employee("Рыбкин", "Афанасий", "Афанасьевич", "5", 78_364.60));
        employeesBook.addEmployee(new Employee("Сухов", "Андрей", "Витальевич", "5", 65_695.09));
        employeesBook.addEmployee(new Employee("Найдёнова", "Анна", "Ивановна", "1", 71_333.07));
        employeesBook.addEmployee(new Employee("Огоньков", "Виктор", "Афанасьевич", "1", 70_699.34));
        employeesBook.printAllDataAboutTheEmployees();
        employeesBook.printSumEmployeesSalary();
        employeesBook.printEmployeeWithMinSalary();
        employeesBook.printEmployeeWithMaxSalary();
        employeesBook.calculateAndPrintAverageSalary();
        employeesBook.printFullName();
    }
}