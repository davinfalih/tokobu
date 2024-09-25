import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("berapa jumlah object");
        int jumlah = in.nextInt();
        
        
        if (jumlah < 1 || jumlah > 10) {
            System.out.println("Input Salah");
        }
        for (int i = 0; i <=jumlah; i++) {
            
            try {
                System.out.println("Pilihlah 1 untuk membuat CD dan 2 untuk membuat DVD");
                int pilihan = in.nextInt();
                
                if (pilihan == 1) {
                    CD c = new CD();
                    c.print();
                    
                } else if (pilihan == 2) {
                    DVD d = new DVD();
                    d.print();
                
                } else if  (jumlah > 10 || jumlah < 1) {
                    System.out.println("Jumlah harus antara 1 - 10");
                    return;
                } else {
                    System.out.println("Pilihan tidak tersedia");
                    
                }
            } catch (Exception e) {
    
                System.out.println("tipe data salah, hanya menerima angka");
        }
    }
    in.close();
        }
    }

        
