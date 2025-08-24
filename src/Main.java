import java.time.Year;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int setAsideMonthly = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + setAsideMonthly;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        System.out.println("Задача 2");
        int i1 = 1;
        while (i1 <= 10) {
            System.out.print(i1 + " ");
            i1 = i1 + 1;
        }
        System.out.println(" ");
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        int peopleCountryY = 12000000;
        int birthRate = 17;
        int mortalityRate = 8;
        int years = 10;
        for (i = 1; i <= years; i++) {
            int newBirthRate = peopleCountryY * birthRate / 1000;
            int newMortalityRate = peopleCountryY * mortalityRate / 1000;
            peopleCountryY = peopleCountryY + newBirthRate - newMortalityRate;
            System.out.println("Год " + i + " численность населения состовляет " + peopleCountryY);
        }
        System.out.println("Задача 4 и 5");
        int contribution = 15_000;
        int saveUp = 12_000_000;
        double percent = 0.07;
        int i2 = 0;
        while (contribution < saveUp) {
            contribution += (contribution * percent);
            i2++;
            if (i2 % 6 == 0) {
                System.out.println("Месяц " + i2 + " вклад равен " + contribution);
            }
        }
        System.out.println("Задача 6");
        int balance = 15_000;
        int total1 = 0;
        int mounth = 108;
        for (i = 1; i <= mounth; i++) {
            total1 = balance + total1;
            total1 = total1 + (balance / 100 * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накоплено " + total1 + " рублей");
            }
        }
        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Пора подготовить отчет");
            friday += 7;
        }
        System.out.println("Задача 8");
        int thisYear = 2025;
        int beginInterval = thisYear - 200;
        int endInterval = thisYear + 100;
        for (int year = beginInterval; year < endInterval; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
                }
            }

        }
    }
