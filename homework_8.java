

// представьте, что вы разрабатываете алгоритм для кофейного аппарата, в котором есть всего 4 кнопки.
// Выбор напитков может быть следующий: эспрессо, американо, капучино, чай.
// При нажатии кнопки, ваш напиток должен приготовиться.
// Попробуйте отобразить в консоли процесс приготовления напитков, исходя из нажатой кнопки
// (1-эспрессо, 2-американо, 3-капучино, 4-чай) через switch case.
//
// Помимо этого сформируйте и разделите процесс на отдельные методы для их переиспользования,
// т.к. напитки могут быть разделены на самостоятельные процессы:
//
// Эспрессо  - неразделимый процесс
// Американо - эспрессо + добавление воды
// Капучино  - эспрессо + добавление вспененного молока

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int button;
        int repeat;
        do {
            do {
                System.out.print("Choose a button: \n 1: espresso;\n 2: americano;\n 3: cappuccino;\n 4: tea;\n 0: exit. \nBUTTON: ");
                button = sc.nextInt();
                repeat = 33;
                switch (button) {
                    case 0:
                        System.out.println("Good luck. See you later :)");
                        repeat = 36;
                        break;
                    case 1:
                        System.out.println("Your selection's espresso");
                        System.out.println(getEspresso());
                        System.out.println(getFinalMessage());
                        break;
                    case 2:
                        System.out.println("Your selection's americano");
                        System.out.println(getAmericano());
                        System.out.println(getFinalMessage());
                        break;
                    case 3:
                        System.out.println("Your selection's cappuccino");
                        System.out.println(getCappuccino());
                        System.out.println(getFinalMessage());
                        break;
                    case 4:
                        System.out.println("Your selection's tea");
                        System.out.println(getTea());
                        System.out.println(getFinalMessage());
                        break;
                    default:
                        System.out.println("ERROR\nTry again.");
                        break;
                }

            } while (!(button > 0 && button < 5) && repeat != 36);
            if (repeat == 33) {
                System.out.println("One more drink ? \n Yes: 1; No: 2.");
                repeat = sc2.nextInt();
            }
            if (repeat % 2 == 0 && repeat != 36) {
                System.out.println("Good luck. See you later :)");
            }
        } while (repeat % 2 != 0 );
        sc.close();
        sc2.close();


    }

    public static String getEspresso() {
        return "\tespresso in process";
    }

    public static String getAmericano() {
        String result = "";
        result += getEspresso();
        result += "\n";
        result += getWater();
        return result;
    }

    public static String getCappuccino() {
        String result = getEspresso();
        result += "\n";
        result += "\tadding some foam milk";
        return result;
    }

    public static String getTea() {
        String result = "\tselected tea package";
        result += "\n";
        result += getWater();
        return result;
    }

    public static String getWater() {
        return "\tadding some water";
    }

    public static String getFinalMessage() {
        return "\tDrink done";
    }
}

// Давид, извиняюсь, что не в срок. Хлопоты житейские отвлекли от учебного процесса.
// Немного код выглядит коряво, но работает корректно. В вопросе про повтор отрабатывает на чётные/нечётные,
// просто чтобы не городить ещё цикл для правильного ввода.
