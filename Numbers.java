class NumberPrograms{
    void evenOdd(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    void checkNumber(int n) {
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
     void largest(int a, int b, int c) {
        if (a > b && a > c)
            System.out.println(a + " is Largest");
        else if (b > c)
            System.out.println(b + " is Largest");
        else
            System.out.println(c + " is Largest");
    }
    void swap1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    void swap2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
public class Numbers {
    public static void main(String[] args) {

        NumberPrograms obj = new NumberPrograms();

        obj.evenOdd(5);
        obj.checkNumber(-2);
        obj.largest(10, 20, 15);
        obj.swap1(5, 10);
        obj.swap2(2, 4);
    }
}
