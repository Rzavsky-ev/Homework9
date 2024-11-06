public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int[] payments = {105, 120, 250, 300, 73};
        int amountExpenses = 0;
        for (int expenses : payments) {
            amountExpenses += expenses;
        }
        System.out.println("Сумма трат за месяц составила " + amountExpenses + " рублей.");

        //Задача 2
        System.out.println("Задача 2");
        //в задаче буду использовать массив из 1 задачи
        int min = payments[0], max = payments[0];
        for (int expenses : payments) {
            if (max < expenses) {
                max = expenses;
            } else if (min > expenses) {
                min = expenses;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max +
                " рублей, минимальная" + " - " + min + " рублей.");

        //Задача 3
        System.out.println("Задача 3");
        //в задаче буду использовать массив и переменную amountExpenses из 1 задачи
        System.out.println("Средняя сумма трат за месяц составила " +
                ((float) amountExpenses / (float) payments.length) + " рублей.");

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
      /*
        char temp;
        for (int i = 0; i < (reverseFullName.length - 1) / 2; i++) {
            // reverseFullName[i] = reverseFullName[j];
            temp = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (char letter : reverseFullName) {
            System.out.print(letter);
        }
        */

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}
