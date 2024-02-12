import  java.util.Scanner;

class Addition {
//main method begins the execution of java application
public static void main(String[] arg)

{
  //scanner that reads value from standard input
Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int firstInt = input.nextInt();
    int x = firstInt;

    System.out.print("Enter second integer: ");
    int secondInt = input.nextInt();
    int y = secondInt;

    System.out.print("Enter third integer: ");
    int thirdInt = input.nextInt();
    int z = thirdInt;

    int result = firstInt * secondInt * thirdInt;
    System.out.printf("the product is: %d%n", result);


}

}
