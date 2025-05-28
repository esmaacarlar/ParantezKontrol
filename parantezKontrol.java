package bm2.sinif;

public class parantezKontrol {
    private String input;
    
    public parantezKontrol(String input) {
        this.input = input;
    }
    
    public void check() {
        int size = this.input.length();
        Stack2 s = new Stack2(size);
        for(int i = 0; i < this.input.length(); i++) {
            char ch = this.input.charAt(i);
            switch(ch) {
                case '{', '[', '(' -> s.push(ch);
                case '}', ']', ')' -> {
                    if(!s.isEmpty()) {
                        char ch2 = s.pop();
                        if((ch == '}' && ch2 != '{') || (ch == ']' && ch2 != '[') || (ch == ')' && ch2 != '(')) {
                            System.out.println("Hata: " + ch + " at " + i+1);
                        }
                    }    
                    else {
                        System.out.println("Hata: " + ch + " at " + i+1);
                    }
                }  
                default -> {
                }
            }
        }
        if(!s.isEmpty()) {
            System.out.println("Hata: sağ parantez eksik.");
        }
        else {
            System.out.println("Tanıma oldu.");
        }
    }
}