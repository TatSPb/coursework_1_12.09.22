public class Employee {
    private static int counter = 0;
    private final String FIO;
    private int department;
    private Integer id;
    private int salary;

    public Employee(String FIO, int department, double salary) {
        this.id = ++counter;
        this.FIO = FIO;
        this.department = department;
        this.salary = (int) salary;
    }

    public String getFIO() {return FIO;}
    public  int getDepartment() {return department;}
    public Integer getId() {return this.id;}
    public int getSalary() {return salary;}

    public void setDepartment(byte department) {this.department = department;}
    public void setSalary(int salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + FIO + '\'' +
                ", отдел=" + department +
                ", id=" + id +
                ", зарплата=" + salary +
                '}';
    }
}





