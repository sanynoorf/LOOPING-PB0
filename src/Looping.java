public class Looping {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 7; i++) {
            System.out.println("Saya Semangat Belajar Java");
        }

        int angka = 1;
        System.out.println("Angka" + angka + ":");
        for(int i = 0; i < 6; i++) {
            System.out.println(angka + " ");
            angka = angka + 2;
        }

        int deret = 9;
        System.out.println("Deret" + deret + ":");
        for(int i = 0; i < 6; i++) {
            System.out.println(deret + " ");
            deret = deret - 3;
        }

        int perkalian = 4;
        System.out.println("Perkalian" + perkalian + ":");
        for(int i = 0; i < 4; i++) {
            int hasil = perkalian * i;
            System.out.println(perkalian + "X" + i + "=" + hasil);
        }
    }
}
