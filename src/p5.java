import java.util.Scanner;

class T1 {
    public int function(int count_of_zeros, int count_of_units) {
        if (count_of_zeros == 0 && count_of_units > 0) {
            return 1;
        } else if (count_of_zeros == 1) {
            return count_of_units + 1;
        } else if (count_of_zeros > 1 && count_of_units == 0) {
            return 0;
        } else {
            return function(count_of_zeros - 1, count_of_units - 1) + function(count_of_zeros, count_of_units - 1);
        }
    }
}

class T2 {
    public int lengthOfDigit(int number) {
        if (number < 10) {
            return 1;
        } else {
            return 1 + lengthOfDigit(number / 10);
        }
    }

    public int reverseNumber(int number) {
        if (number % 10 == 0 && number / 100 == 0) {
            return number / 10;
        }
        int num = number / 10 % 10;
        number /= 100;
        return (int) (num * Math.pow(10, lengthOfDigit(number)) + (reverseNumber(number * 10)));
    }
}

class T3 {
    public int sequence() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 1) {
            if (number == 0) {
                number = scanner.nextInt();
                if (number == 1) {
                    return 1 + sequence();
                }
            }
            if (number == 0) {
                return 0;
            }
            number = scanner.nextInt();
        }
        return 1 + sequence();
    }
}

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T1 task1 = new T1();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(task1.function(a, b));
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        T2 task2 = new T2();
        int number = scanner.nextInt() * 10;
        System.out.println(task2.reverseNumber(number));
        System.out.println(">>>>>>>>>>>>>>>>>>>>");
        T3 task3 = new T3();
        System.out.println(task3.sequence());
    }
}
