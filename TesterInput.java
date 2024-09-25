import java.util.Scanner;
public class TesterInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("CD/DVD?: ");
        String pilihan = in.nextLine();

        System.out.println("Nama: ");
        String nama = in.nextLine();

        System.out.println("Number: ");
        int number = in.nextInt();

        System.out.println("Quantity: ");
        int quantity = in.nextInt();

        System.out.println("Price: ");
        double price = in.nextDouble();
        in.nextLine();

        if (pilihan.equals("CD")) {

            System.out.println("Artist: ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Total Song: ");
            int numSong = in.nextInt();

            CD c1 = new CD(number, nama, quantity, price, artist, numSong, label);
            c1.print();

        } else if (pilihan.equals("DVD")) {

            System.out.println("Lenght: ");
            int lenght = in.nextInt();
            in.nextLine();
            System.out.println("Rating: ");
            String rating = in.nextLine();
            System.out.println("Studio: ");
            String studio = in.nextLine();  

            DVD d1 = new DVD(number, nama, quantity, price, lenght, rating, studio);
            d1.print();
        }
        in.close();
}
}
