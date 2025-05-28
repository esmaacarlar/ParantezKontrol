package bm2.sinif;

public class parantezKontrolMain {

    public static void main(String[] args) {
        String input = " ({[]}";
        String input2 = "a[s{h(m)k}p]z";
        parantezKontrol pk = new parantezKontrol(input);
        pk.check();
        parantezKontrol k = new parantezKontrol(input2);
        k.check();
    }   
}