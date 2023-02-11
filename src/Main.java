class Main {
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
        double max = 0;
        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зп - " + max);
    }

    public static void minimumWage(Employee[] employees) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        System.out.println("Самый бедный получает - " + min);
    }

    public static void totalAmount(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Ушло на зп сотрудникам в месяц - " + sum);
    }
    public static void   salaryConverter(double percent,Employee[] employees) { //идексация всех отделов

        for (int i = 0; i < employees.length; i++) {
            double general = employees[i].getSalary() + employees[i].getSalary() * percent * 0.01 ;
            employees[i].setSalary(general);                                  //замена через сеттер
            System.out.println(general + " проиндексирована зароботная плата " + employees[i].getFullName());

        }

    }
    public static void conclusionDepartmentMinimumWage(int dep,Employee[] employees) {
        double min = Integer.MAX_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep)
                if (employees[i].getSalary() < min)
                    min = employees[i].getSalary();
        }
            System.out.println("минимальная зарплата отела " + dep + " -" + min);
        }
    public static void conclusionDepartmentMaximumWage(int dep,Employee[] employees) {
        double max = Integer.MIN_VALUE;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep)
                if (employees[i].getSalary() > max)
                    max = employees[i].getSalary();
        }
        System.out.println("максимальная зарплата отела " + dep + " -" + max);
    }
    public static void calculateDepartmentExpenses(int dep,Employee[] employees){
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep)
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Сумму затрат на зарплату по отделу " + dep + " -" + sum);
    }

    public static void calculateAverageConsumption(int dep,Employee[] employees){
        double sum = 0;
        double average = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                sum = sum + employees[i].getSalary();
                int length = employees[i].getDepartment() + 1; // количество депортаментов
                average = sum / length;


            }
        }
        System.out.println("Средняя зп по палате номер " +  dep + " -" + average);
    }
    public static void departmentIndexing(int dep, double percent, Employee[] employees) { //индексация отдела
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                double general = employees[i].getSalary() + employees[i].getSalary() * percent * 0.01;
                employees[i].setSalary(general);
                System.out.println(general + " проиндексирована зароботная плата " + employees[i].getFullName() + " " + dep + " отдел");

            }

        }
    }
    public static void showDepartmentEmployees(int dep,Employee[] employees){ //вывод сотрудников отдела
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                System.out.println(employees[i].getFullName() + " зп " + employees[i].getSalary() + " id " + employees[i].getId());
            }
        }
    }
//Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void comparisonLessThanValue(int number,Employee[] employees){ //вывод с минимальной зп

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < number)
            System.out.println("id " + employees[i].getId() + ", Сотрудник " + employees[i].getFullName() + ", зп " + employees[i].getSalary());
        }

    }
    //Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void moreValue(int number,Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= number)
                System.out.println("id " + employees[i].getId() + ", Сотрудник " + employees[i].getFullName() + ", зп " + employees[i].getSalary());
        }

    }








    //Employee[10]
    public static void main(String[] args) {


        employees[0] = new Employee("Сабзиро",1,1);
        employees[1] = new Employee("Бородач Александр Родионович",1,2);
        employees[2] = new Employee("Ирина Скоробейникова",5,3);
        employees[3] = new Employee("Голубков Лёня",2,4);
        employees[4] = new Employee("Дулин Иван",2,5);
        employees[5] = new Employee("Михалыч",3,6);
        employees[6] = new Employee("Равшан",5,7);
        employees[7] = new Employee("Джамшут",3,8);
        employees[8] = new Employee("Игорь Николаевич Гнездилов",4,9);
        employees[9] = new Employee("Полиграф Полиграфович Шариков",4,10);


        list(employees);
        totalAmount(employees);
        minimumWage(employees);
        maximumWage(employees);
        averageSalary(employees);
        printFullName(employees);

        double percent = 0; //здесь ввод процентов индексации зп
        salaryConverter(percent,employees);

        int dep = 1;      //здесь ввод депортамента в котором необходимо узнать минимальную зп
        conclusionDepartmentMinimumWage(dep,employees);

        int department = 1; //здесь ввод депортамента в котором необходимо узнать максимальную зп
        conclusionDepartmentMaximumWage(department,employees);

        int sumDepartment = 1; //расходы на зп в месяц,ввести номер отдела
        calculateDepartmentExpenses(sumDepartment,employees);

        int averageDepartment = 1; //средняя зп отдела,ввести номер отдела
        calculateAverageConsumption(averageDepartment,employees);

        int departmentIndexing = 1;      //ввод номера отдела
        double salaryIndexation = 100;    //ввод процентов
        departmentIndexing(departmentIndexing,salaryIndexation,employees);

        int departmentStaff = 1;
        showDepartmentEmployees(departmentStaff,employees); //вывод сотрудников одного отдела

        int number1 = 2;
        comparisonLessThanValue(number1,employees); //Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
        System.out.println();
        int number2 = 9;
        moreValue(number2,employees); //Все сотрудники с зарплатой больше или равно числа








    }
}