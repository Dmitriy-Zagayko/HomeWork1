import static java.lang.Math.max;

public class ConditionalStatements {

    public int task1(int a, int b) {
        if (a % 2 == 0) {
            return (a * b);
        } else {
            return (a + b);
        }
    }

    public String task2(int x, int y) {
        String result = "";
        if (x < 0 & y < 0) {
            result = "Х находится в 3 четверти, У находится в 3 четверти";
        } else if (x > 0 & y > 0) {
            result = "Х находится в 1 четверти, У находится в 1 четверти";
        } else if (x < 0 & y > 0) {
            result = "Х находится в 4 четверти, У находится в 4 четверти";
        } else if (x > 0 & y < 0) {
            result = "Х находится в 2 четверти, У находится в 2 четверти";
        } else if (x == 0 & y < 0) {
            result = "Х находится на системе координат в точке 0, У находится между 2 и 3 четвертью";
        } else if (x == 0 & y > 0) {
            result = "Х находится на системе координат в точке 0, У находится между 1 и 4 четвертью";
        } else if (x < 0 & y == 0) {
            result = "Х находится между 3 и 4 четвертью, У находится на системе координат в точке 0";
        } else if (x > 0 & y == 0) {
            result = "Х находится между 1 и 2 четвертью, У находится на системе координат в точке 0";
        } else {
            result = "Х и У в точке 0";
        }
        return result;
    }

    public int task3(int a, int b, int c) {
        int result = 0;
        if (a > 0) {
            result += a;
        }
        if (b > 0) {
            result += b;
        }
        if (c > 0) {
            result += c;
        }
        return result;
    }

    public int task4(int a, int b, int c) {
        return (max(a * b * c, a + b + c)) + 3;
    }

    public String task5(int number) {
        String result = "Ваша оценка - ";
        if (number <= 19) {
            return result + "F";
        }
        if (number <= 39) {
            return result + "E";
        }
        if (number <= 59) {
            return result + "D";
        }
        if (number <= 74) {
            return result + "C";
        }
        if (number <= 89) {
            return result + "B";
        }
        if (number <= 100) {
            return result + "A";
        }
        return result;
    }
}


