package Java_Core.BasicCode.EmployeeSalary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EmployeeService {

    public static class Employee{
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }




    }
    public static Map<String, Employee> getHighestSalaryByDepartment(List<Employee> employees){
        Map<String, Employee> highestPaidEmp = new HashMap<>();
        for(Employee e : employees){
            String dept = e.getDepartment();
            if(!highestPaidEmp.containsKey(dept) || highestPaidEmp.get(dept).getSalary()<e.getSalary()){
                highestPaidEmp.put(dept, e);
            }

        }
        return highestPaidEmp;
    }
    public static void main(String[] a){
        Employee emp1 = new Employee(1, "Alice", "IT", 75000);
        Employee emp2 = new Employee(2, "Bob", "IT", 90000);
        Employee emp3 = new Employee(3, "Charlie", "HR", 60000);

        List<Employee> list = List.of(emp1, emp2, emp3);
        System.out.println(getHighestSalaryByDepartment(list));

    }
    }

