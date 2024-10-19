public class Main {
    public static void main(String[] args) {
        // Таблица а
        System.out.println("а)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Таблица б
        System.out.println("\nб)");
        for (int i = 5; i <= 9; i++) {
            for (int j = 0; j < (10 - i); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Таблица в
        System.out.println("\nв)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i * 10 + " ");
            }
            System.out.println();
        }

        // Таблица г
        System.out.println("\nг)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < (6 - i); j++) {
                System.out.print(i * 5 + " ");
            }
            System.out.println();
        }
    }
}