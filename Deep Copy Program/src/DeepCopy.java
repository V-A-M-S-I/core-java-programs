
public class DeepCopy {
    public String name;
    public int rollNumber;
    public int[] marks;

    // Parameterized Constructor
    public DeepCopy(String name, int rollNumber, int[] marks) {
        System.out.println("Parameterized Constructor Called");
        this.name = name;
        this.rollNumber = rollNumber;

        // Deep copy of marks array
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    // Deep Copy Constructor
    public DeepCopy(DeepCopy sc) {
        System.out.println("Deep Copy Constructor Called");
        this.name = sc.name;
        this.rollNumber = sc.rollNumber;

        // Deep copy of marks array
        this.marks = new int[sc.marks.length];
        for (int i = 0; i < sc.marks.length; i++) {
            this.marks[i] = sc.marks[i];
        }
    }

    public void display() {
        System.out.println("\n---- Student Details ----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }


}
