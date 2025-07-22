public class array {
    public static void main(String[] args) {
        int[] marks = {95, 85, 76, 88, 100};//looping array

        System.out.println("Student marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}
