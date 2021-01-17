public class Calculator {
    public static void Add(int value_1, int value_2)
    {
        int sum=value_1+value_2;
        System.out.println("Sum of two numbers are "+ sum);
    }
    public static void Subtraction(int value_1, int value_2)
    {
        int sub = value_1 - value_2;
        System.out.println("Difference between the numbers is "+ sub);
    }
    public static void Multiplication(int value_1, int value_2)
    {
        int product=value_1*value_2;
        System.out.println("Product of two numbers will be "+ product);
    }
    public static void Division(int value_1, int value_2)
    {
        int div=value_1/value_2;
        System.out.println("Division of two number will be "+ div);
    }
}