import java.util.Objects;

public class Employee {
    private String surName;
    private String name;
    private String middleName;
    private String department;
    private double employeeSalary;
    private static long counter = 1L;
    private final long id;

    public Employee(String surName, String name, String middleName, String department, double employeeSalary) {
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        if (Utility.isDepartment(department)) {
            this.department = department;
        }
        this.employeeSalary = employeeSalary;
        id = counter++;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDepartment() {
        return department;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id: " + id + ", Фамилия: " + surName + ", Имя: " + name + ", Отчество: " + middleName + ", Отдел: " + department + ", Зарплата: " + String.format("%.2f", getEmployeeSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
