package CodeReview4.ru.okulova.codereview.main;

import java.util.Arrays;
import java.util.List;

import CodeReview4.ru.okulova.codereview.errors.ErrorChecker;
import CodeReview4.ru.okulova.codereview.gun.Gun;
import CodeReview4.ru.okulova.codereview.house.House;
import CodeReview4.ru.okulova.codereview.house.HouseUpdate;
import CodeReview4.ru.okulova.codereview.humans.EmployeeUpdate;
import CodeReview4.ru.okulova.codereview.humans.Employee;
import CodeReview4.ru.okulova.codereview.humans.Department;
import CodeReview4.ru.okulova.codereview.time.Time;

public class Main {
    public static void main(String[] args) {
        ErrorChecker errors = new ErrorChecker();
        //FIX_ME: переименуем, чтобы имена переменных стали осмысленными
//        Scanner keyboard = new Scanner(System.in);
//        int taskNumber, smallTask, userInput, userCartridge, userShoots;
//        String userName, userDepartment;
//        boolean run, runner;
//        run = true;
        boolean programRunning = true;
        //while (run) {
        while (programRunning) {
            System.out.println("""
                    Добро пожаловать!
                    Перед вами на выбор 5 задач:
                    1. Время и Дом.
                    2. Сотрудники и отделы.
                    3. Сотрудники и отделы(обнавленная версия).
                    4. Создаем Дом.
                    5. Пистолет стреляет.
                    Для того, чтобы завершить работу программы, необходимо написать 0.
                    """);
            System.out.print("Введите целое число(0-5) - номер задачи: ");
            //taskNumber = errors.checkInteger();
            int taskNumber = errors.checkInteger();

            switch (taskNumber) {
                case 0: {
                    System.out.println("Завершение программы....");
                    //FIX_ME: переименуем, чтобы имя переменной стало осмысленным
                    //run = false;
                    programRunning = false;
                    break;
                }
                case 1: {
                    //FIX_ME: переименуем, чтобы имя переменной стало осмысленным
//                    runner = true;
//                    while (runner) {
                    boolean subRunning = true;
                    while (subRunning) {
                        System.out.println("""
                                Данное задание делится на два подзадания на выбор:
                                1. Время
                                2. Дом
                                Для того, чтобы завершить задание, необходимо написать 0.
                                """);
                        System.out.print("Введите целое число(0-2) - номер подзадачи: ");
                        //smallTask = errors.checkInteger();
                        int smallTask = errors.checkInteger();

                        switch (smallTask) {
                            case 1: {
                                System.out.println("""
                                        1. Время
                                        Создайте сущность Время, которое будет описывать текущее время суток в 24-х часовом
                                        формате. Время описывается числом секунд, прошедшим с начала суток. Время может быть
                                        приведено к текстовой форме следующего формата: “ЧЧ:ММ:СС”. Например,если время задано как
                                        12000, то текстовая форма будет “3:20:00”. Если общее время превышает 24 часа, то отображаться
                                        в текстовом виде должно только то время, которое прошло с начала последних суток, например
                                        91800, это не 25:30:00, а 1:30:00.
                                        Необходимо создать и вывести на экран текстовую форму для следующих вариантов времени:
                                        1. 10 секунд
                                        2. 10000 секунд
                                        3. 100000 секунд
                                        """);
                                Time timer = new Time(10);
                                System.out.println(timer);
                                timer = new Time(10000);
                                System.out.println(timer);
                                timer = new Time(100000);
                                System.out.println(timer);
                                System.out.println("""
                                        Сейчас вам необходимо будет записать своё время - а мы выведем результат на экран.
                                        """);
                                System.out.print("Введите целое число - количество секунд: ");
                                //userInput = errors.checkInteger();
                                int userInput = errors.checkInteger();
                                Time userTimer = new Time();
                                userTimer.setTime(userInput);
                                System.out.println(userTimer);
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.println("""
                                        2. Дом.
                                           Создайте сущность Дом, которая описывается количеством этажей в виде числа. У Дома можно
                                           запросить текстовую форму, которое имеет представление вида “дом с N этажами”, где N это
                                           число. Гарантировать правильное окончание фразы, в зависимости от количества этажей. Создать
                                           и вывести на экран дома с 1, 5, 23 этажами.
                                        """);

                                House home = new House(1);
                                System.out.println(home);
                                home = new House(5);
                                System.out.println(home);
                                home = new House(23);

                                System.out.println(home);
                                System.out.println("""
                                        Сейчас вам небоходимо будет записать своё число - количество этажей в доме,
                                        а мы выведем результат на экран.
                                        """);
                                System.out.print("Введите целое число - количество этажей: ");
                                //userInput = errors.checkInteger();
                                int userInput = errors.checkInteger();
                                //FIX_ME: добавим проверку
                                //if (userInput == 0) {
                                if (userInput <= 0) {
                                    System.out.println("В доме не может быть " + userInput + " этажей.");
                                } else {
                                    House newHome = new House();
                                    newHome.setFloors(userInput);
                                    System.out.println(newHome);
                                    System.out.println();
                                }
                                break;
                            }
                            case 0: {
                                System.out.println("Завершение работы задания...");
                                //FIX_ME: переименуем, чтобы имя переменной стало осмысленным
                                //runner = false;
                                subRunning = false;
                                System.out.println();
                                break;
                            }
                            default: {
                                System.out.println("Введено неверное значение.");
                                System.out.println();
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("""
                            2. Сотрудники и отделы.
                            Создайте сущность Сотрудник, которая описывается именем (в строковой форме) и отделом, в
                            котором сотрудник работает, причем у каждого отдела есть название и начальник, который
                            также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя
                            работает в отделе Название, начальник которого Имя”. В случае если сотрудник является
                            руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.
                            Необходимо выполнить следующие задачи:
                            1. Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.
                            2. Сделать Козлова начальником IT отдела.
                            3. Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен
                            оказаться один и тот же отдел и начальник)
                            """);
                    Employee petrov = new Employee("Петров", "IT");
                    Employee kozlov = new Employee("Козлов", "IT", true);
                    Employee sidorov = new Employee("Сидоров", "IT");

                    petrov.setBoss(kozlov);
                    sidorov.setBoss(kozlov);

                    System.out.println(petrov);
                    System.out.println(sidorov);
                    System.out.println(kozlov);
                    System.out.println();

                    System.out.println("""
                            Сейчас вам небоходимо будет создать собственного сотрудника.
                            """);
                    System.out.println("Введите фамилию сотрудника: ");
                    //userName = errors.checkString();
                    String userName = errors.checkString();
                    System.out.println("Введите название отдела: ");
                    //userDepartment = errors.checkString().toUpperCase();
                    String userDepartment = errors.checkString().toUpperCase();
                    Employee user = new Employee(userName, userDepartment);

                    if (user.getDepartment().equals("IT")) {
                        user.setBoss(kozlov);
                    } else {
                        System.out.println("Хотите назначить " + user.getName() + " начальником?");
                        System.out.println("""
                                1. Да, хочу.
                                2. Нет, не хочу.
                                """);
                        //FIX_ME: переименуем, чтобы имя переменной стало осмысленным
//                        runner = true;
//                        while (runner) {
                        boolean choiceRunning = true;
                        while (choiceRunning) {
                            System.out.println("Введите цифру(1-2) - ваш выбор: ");
                            //userInput = errors.checkInteger();
                            int userInput = errors.checkInteger();
                            switch (userInput) {
                                case 1: {
                                    user.setBoss(user);
                                    //FIX_ME: переименуем, чтобы имя переменной стало осмысленным
                                    //runner = false;
                                    choiceRunning = false;
                                    break;
                                }
                                case 2: {
                                    System.out.println("Завершение...");
                                    //FIX_ME: переименуем, чтобы имя переменной стало осмысленным
                                    //runner = false;
                                    choiceRunning = false;
                                    break;
                                }
                                default: {
                                    System.out.println("Введено неверное значение.");
                                    break;
                                }
                            }
                        }
                    }
                    System.out.println();
                    System.out.println(user);
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("""
                            3. Сотрудники и отделы.
                            Измените решение, полученное в задаче 2.4 таким образом, чтобы имея ссылку на сотрудника,
                            можно было бы узнать список всех сотрудников этого отдела.
                            """);
                    List<Department> departments = Arrays.asList(
                            new Department("IT"),
                            new Department("Маркетинг"),
                            new Department("Юристы")
                    );

                    EmployeeUpdate itBoss = new EmployeeUpdate("Козлов", departments.get(0));

                    departments.get(0).setBoss(itBoss);
                    new EmployeeUpdate("Петров", departments.get(0));
                    new EmployeeUpdate("Смирнов", departments.get(0));

                    EmployeeUpdate merchandisingBoss = new EmployeeUpdate("Евстафьева", departments.get(1));
                    departments.get(1).setBoss(merchandisingBoss);
                    new EmployeeUpdate("Ушакова", departments.get(1));
                    new EmployeeUpdate("Окулова", departments.get(1));

                    EmployeeUpdate legalBoss = new EmployeeUpdate("Кузнецова", departments.get(2));
                    departments.get(2).setBoss(legalBoss);
                    new EmployeeUpdate("Соколова", departments.get(2));
                    new EmployeeUpdate("Новикова", departments.get(2));

                    while (true) {
                        System.out.println("Выберите отдел: ");
                        System.out.println("1 - IT");
                        System.out.println("2 - Маркетинг");
                        System.out.println("3 - Юридический");
                        System.out.println("0 - Выход");
                        System.out.println();
                        System.out.print("Ваш выбор: ");

                        int choice;
                        choice = errors.checkInteger();

                        if (choice == 0) break;
                        if (choice < 1 || choice > 3) {
                            System.out.println("Ошибка! Введите число от 0 до 3\n");
                            continue;
                        }

                        Department selected = departments.get(choice - 1);
                        EmployeeUpdate boss = selected.getBoss();

                        System.out.println();
                        System.out.println("Отдел: " + selected.getName());
                        System.out.println();
                        System.out.println("Начальник: " + (boss != null ? boss.getName() : "не назначен"));
                        System.out.println();
                        System.out.println("Сотрудники:");

                        for (EmployeeUpdate emp : selected.getEmployees()) {
                            System.out.println(" * " + emp.toString());
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    System.out.println("""
                            4. Создаем Дом.
                               Измените сущность Дом из задачи 1.5. Новые требования включают:
                               1. Создание дома может осуществляться только путем указания количества этажей.
                               2. После создания дому нельзя изменить количество этажей.
                               Создайте и выведите на экран дома с 2, 35, 91 этажами. Продемонстрируйте на примере что дому
                               нельзя заменить количество этажей.
                            """);
                    HouseUpdate house1 = new HouseUpdate(2);
                    HouseUpdate house2 = new HouseUpdate(35);
                    HouseUpdate house3 = new HouseUpdate(91);
                    System.out.println(house1);
                    System.out.println(house2);
                    System.out.println(house3);

                    System.out.println("""
                            Сейчас вам небоходимо будет записать своё число - количество этажей в доме,
                            а мы выведем результат на экран.
                            """);
                    System.out.print("Введите целое число - количество этажей: ");
                    //userInput = errors.checkInteger();
                    int userInput = errors.checkInteger();

                    //FIX_ME: добавим проверку
//                    if (userInput == 0) {
//                        System.out.println("В доме не может быть 0 этажей.");
                    if (userInput <= 0) {
                        System.out.println("В доме не может быть " + userInput + " этажей.");
                    } else {
                        HouseUpdate newHome = new HouseUpdate(userInput);
                        System.out.println(newHome);
                    }
                    System.out.println();
                    break;
                }

                case 5: {
                    System.out.println("""
                            5. Пистолет стреляет.
                               1. Создайте сущность Пистолет, которая описывается следующим образом:
                               2. Имеет Количество патронов (целое число)
                               3. Может быть создан с указанием начального количества патронов
                               4. Может быть создан без указания начального количества патронов, в этом случае он
                               изначально заряжен пятью патронами.
                               5. Может Стрелять, что приводит к выводу на экран текста “Бах!” в том случае, если
                               количество патронов больше нуля, иначе делает “Клац!”. После каждого выстрела (когда
                               вывелся “Бах!”) количество патронов уменьшается на один.
                               Создайте пистолет с тремя патронами и выстрелите из него пять раз.\s
                            """);
                    Gun gun = new Gun(3);
                    System.out.println(gun);
                    for (int i = 0; i < 5; i++) {
                        gun.shoot();
                    }
                    System.out.println();

                    System.out.println("""
                            Сейчас вам необоходимо будет ввести целое число - количество пуль в пистолете
                            и количество выстрелов.
                            """);
                    Gun userGun = new Gun();
                    System.out.print("Введите число - количество пуль: ");
                    //userCartridge = errors.checkInteger();
                    int userCartridge = errors.checkInteger();
                    System.out.print("Введите число - количество выстрелов: ");
                    //userShoots = errors.checkInteger();
                    int userShoots = errors.checkInteger();

                    if (userShoots == 0) {
                        System.out.println("Пистолет не стреляет....");
                    } else {
                        userGun.setCartridge(userCartridge);
                        System.out.println(userGun);
                        for (int i = 0; i < userShoots; i++) {
                            userGun.shoot();
                        }
                        System.out.println();
                    }
                    break;
                }
                default: {
                    System.out.println("Введено неверное значение.");
                    break;
                }
            }
        }
        System.out.println("Программа завершена.");
    }
}