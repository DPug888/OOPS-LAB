class MovieTicket {
    String movieName;
    int seatNumber;
    boolean isBooked = false;

    MovieTicket(String name, int seat) {
        movieName = name;
        seatNumber = seat;
    }

    void book() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Booked: " + movieName + " (Seat " + seatNumber + ")");
        } else {
            System.out.println("Seat already booked.");
        }
    }

    void show() {
        System.out.println(movieName + " - Seat " + seatNumber + " - " + (isBooked ? "Booked" : "Available"));
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers", 7);
        ticket.show();
        ticket.book();
        ticket.show();
    }
}
