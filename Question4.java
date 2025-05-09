public class Question4 {
    public static void main(String arg[]) {
        String[][] alfabet = {
            {"p", "s", "n"},
            {"w", "l", "b"},
            {"f", "r", "e"}
        };

        System.out.println("Berikut isi dari array dua dimensi alfabet");
        for (String[] item : alfabet) {
            for (String huruf : item) {
                System.out.print(huruf + "\t");
            }
            System.out.println();
        }
    }
}