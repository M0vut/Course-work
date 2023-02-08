class Main{
    static Employee[] employees = new Employee[10];

    public static void list(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

    }

    public static void printFullName(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());

        }
    }
    public static void averageSalary(Employee[] employees) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
            average = sum / employees.length;
        }
        System.out.println("Средняя зп по палате - " + average);
    }
    public static void maximumWage(Employee[] employees) {
        int max = 0;
        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зп - " + max);
    }
    public static void minimumWage(Employee[] employees) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        System.out.println("Самый бедный получает - " + min);
    }
    public static void totalAmount(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Ушло на зп сотрудникам в месяц - " + sum);
    }



    //Employee[10]
    public static void main(String[] args) {
        employees[0] = new Employee("Сабзиро",1,1600000);
        employees[1] = new Employee("Бородач Александр Родионович",1,2000000);
        employees[2] = new Employee("Ирина Скоробейникова",1,1600000);
        employees[3] = new Employee("Голубков Лёня",2,1500000);
        employees[4] = new Employee("Дулин Иван",3,1200000);
        employees[5] = new Employee("Михалыч",3,3000000);
        employees[6] = new Employee("Равшан",3,4200000);
        employees[7] = new Employee("Джамшут",3,4800000);
        employees[8] = new Employee("Игорь Николаевич Гнездилов",1,2000000);
        employees[9] = new Employee("Полиграф Полиграфович Шариков",4,4000000);

        list(employees);
        totalAmount(employees);
        minimumWage(employees);
        maximumWage(employees);
        averageSalary(employees);
        printFullName(employees);




    }
}