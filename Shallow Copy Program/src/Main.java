public class Main {
    public static void main(String[] args) {
        System.out.println("---- Program Started ----");

        // Creating the original object
        int[] marks = {80, 90, 75};
        ShallowCopy s1 = new ShallowCopy("Ram", 19265, marks);

        // Creating a shallow copy of s1
        ShallowCopy s2 = new ShallowCopy(s1);

        // Modifying the original object (s1)
        System.out.println("\n-- Modifying s1 (original object) --");
        s1.name = "vampire";
        s1.rollNumber = 19233;
        s1.marks[1] = 100; // This will affect both s1 and s2 due to shallow copy

        // Display both objects
        System.out.println("\n-- Displaying s1 --");
        s1.display();

        System.out.println("\n-- Displaying s2 (shallow copied object) --");
        s2.display();

        System.out.println("\n---- Program Ended ----");
    }

}