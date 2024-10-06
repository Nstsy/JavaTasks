package lesson_2;

public class Main {
    public static void main(String[] args) {
        //задача 1 Сотрудник
        Employee employee1 = new Employee("Ivan Ivanov", "manager", "ivanov@gmail.com", "+375(29)-231-91-07", 2000.50, 33);
        employee1.info();
        System.out.println();

        //задача 2 Создать массив из 5 сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan Ivanov", "director", "ivanov@gmail.com", "+375(29)-231-91-07", 2000.50, 33);
        employees[1] = new Employee("Elena Petrova", "manager", "tree@gmail.com", "+375(29)-239-12-12", 1500.00, 44);
        employees[2] = new Employee("Petr Ivanov", "salesman", "minsk@gmail.com", "+375(29)-223-11-10", 1000.50, 28);
        employees[3] = new Employee("Kirill Black", "salesman", "boroboro@gmail.com", "+375(33)-431-11-07", 1000.50, 25);
        employees[4] = new Employee("Ivan Black", "cleaner", "cool@gmail.com", "+375(25)-331-56-23", 700.50, 61);
        for (Employee employee : employees) {
            employee.info();
        }
        System.out.println();

        //задача 3 - Парк
        Park park1 = new Park("Gomelskiy park");

        park1.addAttraction("Mini Golf", "09:00 - 22:00", 6.5);
        park1.addAttraction("Carousel", "09:00 - 22:00", 7.0);
        park1.addAttraction("Cars", "09:00 - 21:00", 5.5);
        park1.addAttraction("Safari", "09:00 - 21:00", 6.0);
        park1.addAttraction("Train", "09:00 - 20:00", 3.5);

        park1.infoParkAttractions();
    }
}