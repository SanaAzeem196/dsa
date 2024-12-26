import java.util.Scanner;

class NumberOrder
{
    public static void checkOrder (int num1, int num2, int num3)
    {
        if (num1 < num2 && num2 < num3) {
            System.out.println("the order is Increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("the order is Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        checkOrder(num1, num2, num3);
    }
}
