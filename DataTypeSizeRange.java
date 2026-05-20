public class DataTypeSizeRange {

    void display() {

        System.out.println("Byte Size: " + Byte.SIZE + " bits");
        System.out.println("Byte Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.println("\nInt Size: " + Integer.SIZE + " bits");
        System.out.println("Int Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.println("\nFloat Size: " + Float.SIZE + " bits");
        System.out.println("Float Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        System.out.println("\nChar Size: " + Character.SIZE + " bits");
    }

    public static void main(String[] args) {

        DataTypeSizeRange obj = new DataTypeSizeRange();
        obj.display();
    }
}
