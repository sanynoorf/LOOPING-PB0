public class Looping5 {
    int base;
    int start;
    int loop;

    Looping5(int base, int start, int loop) {
        this.base = base;
        this.start = start;
        this.loop = loop;
    }

    public void hitungLoop() {
        int hasil = 0;
        for(int i = 0; i < loop; i++) {
            hasil = base * (start + i);
            System.out.println(base + "X" + (start + i) + "=" + hasil);
        }
    }
}
