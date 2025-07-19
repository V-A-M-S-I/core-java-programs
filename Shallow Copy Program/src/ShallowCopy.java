public class ShallowCopy {
    public String name;
    public int rollNumber;
    public int[] marks;

    // Parameterized Constructor
    public ShallowCopy(String name, int rollNumber, int[] marks) {
        System.out.println("Parameterized Constructor Called");
        this.name = name;
        this.rollNumber = rollNumber;

        // Shallow copy: just assigning the reference
        this.marks = marks;
    }

    // Shallow Copy Constructor
    public ShallowCopy(ShallowCopy sc) {
        System.out.println("Shallow Copy Constructor Called");
        this.name = sc.name;
        this.rollNumber = sc.rollNumber;

        // Shallow copy: both objects refer to the same array
        this.marks = sc.marks;
    }

    // Display method
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
