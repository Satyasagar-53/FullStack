public class SwapWithoutThird {

    void swap() {

        int x = 30, y = 40;

        System.out.println("Before Swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {

        SwapWithoutThird obj = new SwapWithoutThird();
        obj.swap();
    }
}
