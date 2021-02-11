public class Cycles {

    public String task1 () {
        String result = "";
        int sum = 0;
        int evenNumber = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                evenNumber++;
            }

        }
        result = "Сумма четных чисел равна " + sum + "Количество сложений четных числе равно " + evenNumber;
        return result;
    }

    public String task2 (int number) {
        String result = "";
        for (int i = 1; i < number; i++) {
            if (i % number == 0) {
                result = "Ваше число простое";
                return result;
            }
        }
        result = "Ваше число не простое";
        return result;
    }

    public void task3 () {

    }

    public void task4 (int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public int task5 (int a) {
        int sum = 0;
        while (a != 0) {
            sum = a + a;
        }
        return sum;
    }

    public int task6 (int x) {
        int number = 0;
        for (int i = 1; i <= x; i++) {
            number++;
        }
        String a = String.valueOf(number);
        return Integer.parseInt(new StringBuilder(number).reverse().toString());
    }
}
