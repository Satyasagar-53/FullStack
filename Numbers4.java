class NumberPrograms4 {
    void prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
    void primeSeries(int n) {
        for (int i = 2; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2)
                System.out.print(i + " ");
        }
        System.out.println();
    }
    void fibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
    void factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
    void gcd(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }

        System.out.println("GCD = " + gcd);
    }
}
public class Numbers4 {
    public static void main(String[] args) {

        NumberPrograms4 obj = new NumberPrograms4();
        obj.prime(7);
        obj.primeSeries(20);
        obj.fibonacci(10);
        obj.factorial(5);
        obj.gcd(12, 18);
    }
}
