
import java.util.Scanner;

class Theater {

    boolean threeD;
    boolean luxury;
    boolean[] seats;
    String title;
    int basePrice = 0;

    Theater(boolean threeD, boolean luxury, int numSeats) {
        this.threeD = threeD;
        this.luxury = luxury;
        seats = new boolean[numSeats + 1];
    }

    void setTitle(String title) {
        if (title == null || title.length() == 0) {
            System.out.println("invalid title");
        } else {
            this.title = title;
        }
    }

    void setBasePrice(int basePrice) {
        if (basePrice <= 0) {
            System.out.println("invalid price");
        } else {
            this.basePrice = basePrice;
        }
    }

    void printInfo() {
        if (threeD) {
            System.out.println("3D");
        } else {
            System.out.println("No 3D");
        }
        if (luxury) {
            System.out.println("Luxury");
        } else {
            System.out.println("Standard");
        }
        System.out.println(seats.length - 1);
        if (title == null) {
            System.out.println("title is not set");
        } else {
            System.out.println(title);
        }
        if (basePrice == 0) {
            System.out.println("price is not set");
        } else {
            System.out.println(basePrice);
        }
    }

    boolean isInRange(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= seats.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean areAllAvailable(int numSeats, int seatNumber) {
        for (int i = seatNumber; i < seatNumber + numSeats; ++i) {
            if (isInRange(i) == false) {
                return false;
            }
            if (seats[i] == true) {
                return false;
            }
        }
        return true;
    }

    private void markAllSeats(int numSeats, int seatNumber) {
        for (int i = seatNumber; i < seatNumber + numSeats; ++i) {
            seats[i] = true;
        }
    }

    int reserveOne(int seatNumber) {
        if (isInRange(seatNumber) == false || seats[seatNumber] == true) {
            System.out.println("sorry");
            return -1;
        }
        seats[seatNumber] = true;
        return basePrice;
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        if (areAllAvailable(numSeats, seatNumber)) {
            markAllSeats(numSeats, seatNumber);
            return numSeats * basePrice;
        } else {
            System.out.println("sorry");
            return -1;
        }

    }
}

public class Theater2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1) {
            threeD = true;
        }
        if (luxury1 == 1) {
            luxury = true;
        }
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1) {
                totalPrice = t.reserveOne(seatNumber);
            } else {
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            }
            if (totalPrice > 0) {
                System.out.println(totalPrice);
            }
        }

        t.printInfo();
    }
}
