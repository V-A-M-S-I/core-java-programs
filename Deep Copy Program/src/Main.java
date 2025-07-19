public class Main{
    public static void main(String[] args) {
        System.out.println("---- Program Started ----");

        int[] marks = {80, 90, 75};

        // Creating original student object
        DeepCopy s1 = new DeepCopy("Ram", 19265, marks);

        // Creating deep copy of student object
        DeepCopy s2 = new DeepCopy(s1);

        // Modifying original object's data
        System.out.println("\n-- Modifying original object's data --");
        s1.name = "Vamsi";
        s1.rollNumber = 19233;
        s1.marks[1] = 100; // Only s1's marks should change due to deep copy

        // Display both objects
        System.out.println("\n-- Displaying s1 (original object) --");
        s1.display();

        System.out.println("\n-- Displaying s2 (deep copied object) --");
        s2.display();

        System.out.println("\n---- Program Ended ----");
    }
}