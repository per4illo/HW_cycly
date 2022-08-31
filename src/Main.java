public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        while (i > 0) {
            System.out.print(" " + i);
            i--;
        }
        System.out.println();
        int friday = 1;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число.");
            friday = friday + 7;
        }
        System.out.println();

        int day = 2021;
        int j = 0;
        int day100 = day + 100;
        day = day - 200;
        while (j < day100) {
            if (j > day && j < day100) {
                System.out.println(j);
                j = j + 79;
            }
        }

    }
}