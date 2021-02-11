public class Functions {

    public String task1 (int day) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("Enter a value between 1 and 7.");
        }
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return week [day];
    }

    public double task2(double x1, double y1, double x2, double y2) {
        double ac = Math.abs(y2 - y1);
        double cb = Math.abs(x2 - x1);
        return Math.hypot(ac, cb);
    }

    public String task3 () {

    }
}
