import java.util.Scanner;

public class FibonacciApp {
    private Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    private int selected;
    private int selectedFibonacci;

    private void getNumber() {
        System.out.println("Give me a number: ");
        selected = scanner.nextInt();
    }
    private int nextFibonacci(int num) {
        double a = num * (1 + Math.sqrt(5)) / 2.0;
        return (int) Math.round(a);
    }



    private void findFibonacciNumber(int num) {
        if (num == 0){
            selectedFibonacci = 0;
            return;
        }
        int x = 0;
        int y = 1;
        int z = x + y;

        while (z <= num) {
            x = y;
            y = z;
            z = x + y;
        }
        selectedFibonacci = (Math.abs(z - num) >= Math.abs(y - num)) ? y : z;
    }

    private void printNextFive(int num) {
        int fibonacci1 = nextFibonacci(num);
        int fibonacci2 = num + fibonacci1;
        int fibonacci3 = fibonacci2 + fibonacci1;
        int fibonacci4 = fibonacci3 + fibonacci2;
        int fibonacci5 = fibonacci4 + fibonacci3;
        System.out.println(fibonacci1 + " " + fibonacci2 + " " +  fibonacci3 + " " + fibonacci4 + " " + fibonacci5);
    }

    public void giveNextFive() {
        getNumber();
        findFibonacciNumber(selected);
        printNextFive(selectedFibonacci);
    }

}
