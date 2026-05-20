public class DataTypes {
    void display() {

        int age = 20;
        float marks = 85.5f;
        char grade = 'A';
        boolean result = true;
        String name = "Satya";

        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
        System.out.println("Grade = " + grade);
        System.out.println("Result = " + result);
        System.out.println("Name = " + name);
    }

    public static void main(String[] args) {

        DataTypes obj = new DataTypes();
        obj.display();
    }
}