import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        task1();
        printEmployees();
        findEmployeeWithMinSalary();
        findEmployeeWithMaxSalary();
        calculateAverageSalary();
        printFIO();
    }
    public static void task1(){
        Employee emp1 = new Employee("Яблоков Петр Петр", 1, 65600);
        Employee emp2 = new Employee("Грушев Фома Никитич", 1, 70600);
        Employee emp3  = new Employee("Персикова Ольга Петровна", 2 , 80000);
        Employee emp4  = new Employee("Бананова Ирина Станиславовна", 2 , 100600);
        Employee emp5  = new Employee("Вишнев Олег Юрьевич", 3 , 120000);
        Employee emp6  = new Employee("Абрикосов Натан Натанович", 3 , 100000);
        Employee emp7  = new Employee("Виноградова Марина Давыдовна ", 4 , 95600);
        Employee emp8  = new Employee("Ананасов Кирилл Владимирович", 4 , 70000);
        Employee emp9  = new Employee("Апельсинова Наталья Ивановна", 5 , 150400);
        Employee emp10  = new Employee("Киви Ольга Николаевна", 5 , 95000);

        employees[0] = emp1;
        employees[1] = emp2;
        employees [2] = emp3;
        employees [3] = emp4;
        employees [4] = emp5;
        employees [5] = emp6;
        employees [6] = emp7;
        employees [7] = emp8;
        employees [8] = emp9;
        employees [9] = emp10;
        Employee[] emp = Arrays.copyOf(employees, 10);

        System.out.println("СПИСОК ВСЕХ СОТРУДНИКОВ С ИМЕЮЩИМИСЯ ПО НИМ ДАННЫМИ:");
        Arrays.stream(emp).forEach(System.out::println);
        System.out.println();
        System.out.println("КОЛИЧЕСТВО СОТРУДНИКОВ: " + emp.length);
    }
    public static void printEmployees() {
        for (Employee employee : employees) {
           // System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() /(float) employees.length;
    }

    public static void printFIO() {
        System.out.println();
        System.out.println("ФИО СОТРУДНИКОВ:");
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }


}
