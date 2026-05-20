public class SwapUsingThird {

    void swap() {

        int a = 10, b = 20, temp;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        SwapUsingThird obj = new SwapUsingThird();
        obj.swap();
    }
}
