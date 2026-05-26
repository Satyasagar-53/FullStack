class NumberPrograms3 {
    void neon(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            sum = sum + square % 10;
            square = square / 10;
        }

        if (sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
    void spy(int n) {
        int sum = 0, product = 1;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
    void duck(int n) {
        String s = String.valueOf(n);

        if (s.contains("0"))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
    void strong(int n) {
        int temp = n, sum = 0;

        while (n > 0) {
            int rem = n % 10;
            int fact = 1;

            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;
        }

        if (temp == sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
    void perfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }

        if (sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
}
public class Numbers3 {
    public static void main(String[] args) {

        NumberPrograms3 obj = new NumberPrograms3();
        obj.neon(9);
        obj.spy(123);
        obj.duck(1023);
        obj.strong(145);
        obj.perfect(28);
    }
}

