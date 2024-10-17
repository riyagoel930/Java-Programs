public class Age {
    public static void ageName(String name, int age) {
        for (int i = 0; i < age; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ageName("Riya", 20);
    }
}