public class CD extends product {

    private String artist;
    private int numSong;
    private String label;

    public CD() {
        super();//constructor dari superclass
        artist = "Lady GaGa";    
        numSong = 10;
        label = "Sony Music";
    }

    public CD(int number, String name, int quantity, double price, String artist, int numSong, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void print() {
        super.print();
        System.out.println("Artist\t: " + artist);
        System.out.println("Number of Song\t: " + numSong);
        System.out.println("Label\t: " + label);  

}

}
