public class Question3 {
    public static void main(String arg[]) {
        int[] empatAngka = new int[4];
        empatAngka[0] = 7;
        empatAngka[1] = 10;
        empatAngka[2] = 20;
        empatAngka[3] = 23;

        System.out.println("Ini isi dari array empatAngka:");
        for (int i = 0; i < empatAngka.length; i++) {
            int no = i + 1;
            System.out.println("Angka ke-" + no + " = " + empatAngka[i]);
        }
    }
}