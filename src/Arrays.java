public class Arrays {

    public int task1(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int task2(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public void task3(int[] array) {
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexOfMin])
                indexOfMin = i;
        }


    }

    public void task4(int[] array) {
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexOfMax])
                indexOfMax = i;
        }
    }

    public void task5(int[] array) {
        int index = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum1 += array[i];
            } else if (array[index] % 2 != 0) {
                sum2 += array[index];
            }
        }
    }

    public void task6(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int reverse = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = reverse;
        }
    }

    public int task7(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                index = array[i];
            }
        }
        return index;
    }

    public void task8(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public void bubbleSort(int[] array) {
        boolean sorted = false;
        int bubble;
        while (!sorted) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    bubble = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = bubble;
                }
            }
        }
    }

    public void selectedSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = i;
            int minNumber = array[i];
            for (int a = i + 1; a < array.length; a++) {
                if (array[a] < minNumber) {
                    x = a;
                    minNumber = array[a];
                }
            }
            array[x] = array[i];
            array[i] = minNumber;
        }
    }

    public void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            int y = i - 1;
            while (y >= 0 && array[y] > x) {
                array[y + 1] = array[y];
                y -= 1;
            }
            array[y + 1] = x;
        }
    }
}
