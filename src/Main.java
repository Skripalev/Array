import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] fractionalNumbers = {1.57, 7.654, 9.986};

        int[] lamb = new int[8];
        lamb[0] = 1;
        lamb[1] = 2;
        lamb[2] = 3;
        lamb[3] = 4;
        lamb[4] = 5;
        lamb[5] = 6;
        lamb[6] = 7;
        lamb[7] = 8;

        System.out.println("Task 2");
        for (int index = 0; index < numbers.length; index++) {
            if (index == numbers.length - 1) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");


        }
        for (int index = 0; index < fractionalNumbers.length; index++) {
            if (index == fractionalNumbers.length - 1) {
                System.out.println(fractionalNumbers[index]);
                break;
            }
            System.out.print(fractionalNumbers[index] + ", ");


        }
        for (int index = 0; index < lamb.length; index++) {
            if (index == lamb.length - 1) {
                System.out.println(lamb[index]);
                break;
            }
            System.out.print(lamb[index] + ", ");


        }


        System.out.println("Task 3");

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }

        System.out.println();

        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            if (i < fractionalNumbers.length - 1) {
                System.out.print(", ");
            }
            System.out.print(fractionalNumbers[i]);
        }
        System.out.println();

        for (int i = lamb.length - 1; i >= 0; i--) {
            if (i < lamb.length - 1) {
                System.out.print(", ");
            }
            System.out.print(lamb[i]);
        }
        System.out.println();


        System.out.println("Task 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));


    }
}