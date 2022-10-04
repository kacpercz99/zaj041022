public class Seans {
    private String title;
    private String directorName;
    private int length;
    private double ticketPrice;
    private int seatsAmount;
    private boolean[] seatOccupation;

    public Seans(String title, String directorName, int length, double ticketPrice, int seatsAmount) {
        this.title = title;
        this.directorName = directorName;
        this.length = length;
        this.ticketPrice = ticketPrice;
        this.seatsAmount = seatsAmount;
        seatOccupation = new boolean[seatsAmount];
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void wyswietlZarezerwoawane() {
        for (int i = 0; i < seatsAmount; i++) {
            if (seatOccupation[i]) System.out.print(i + 1 + " ");
        }
        System.out.println();
    }

    public int zarezerwujMiejsce() {
        for (int i = 0; i < seatsAmount; i++) {
            if (!seatOccupation[i]) {
                seatOccupation[i] = true;
                return i+1;
            }
        }
        return -1;
    }

    public void wyswietlInformacje() {
        System.out.println("Tytuł filmu: " + title);
        System.out.println("Reżyser: " + directorName);
        System.out.println("Długość filmu: " + length + "min");
        System.out.println("Cena biletu: " + ticketPrice + "zł");
    }
}
