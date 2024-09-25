public class DVD extends product {

    private int lenght;
    private String rating;
    private String studio;

    public DVD() {
        lenght = 300;
        rating = "PG";
        studio = "NewLine Cinema";
    }
    public DVD(int number, String name, int quantity, double price, int lenght, String rating, String studio) {
        super(number, name, quantity, price);
        this.lenght = lenght;
        this.rating = rating;
        this.studio = studio;
    }

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void print() {
        System.out.println("Lenght\t: " + lenght);
        System.out.println("Rating\t: " + rating);
        System.out.println("Studio\t: " + studio);
    }
    
}
