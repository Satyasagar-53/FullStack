public class PrimitiveTypes {

    void show() {

        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 10.5f;
        double d = 99.99;
        char c = 'S';
        boolean bool = true;

        System.out.println("Byte = " + b);
        System.out.println("Short = " + s);
        System.out.println("Int = " + i);
        System.out.println("Long = " + l);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);
        System.out.println("Char = " + c);
        System.out.println("Boolean = " + bool);
    }

    public static void main(String[] args) {

        PrimitiveTypes obj = new PrimitiveTypes();
        obj.show();
    }
}
