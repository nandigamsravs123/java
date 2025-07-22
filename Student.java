class Student {
    String name; // corrected this line
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student(); // corrected object creation
        s.name = "Shravya";
        s.age = 22;
        s.display();
    }
}
