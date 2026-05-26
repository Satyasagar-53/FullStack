class NumberPrograms2 {
    void sumDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        System.out.println("Sum = " + sum);
    }
    void reverse(int n) {
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);
    }
    void palindrome(int n) {
        int temp = n, rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    void countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Digits = " + count);
    }
    void armstrong(int n) {
        int temp = n, sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }

        if (temp == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
public class Numbers2 {
    public static void main(String[] args) {

        NumberPrograms2 obj = new NumberPrograms2();
        obj.sumDigits(123);
        obj.reverse(1234);
        obj.palindrome(121);
        obj.countDigits(12345);
        obj.armstrong(153);
    }
}

