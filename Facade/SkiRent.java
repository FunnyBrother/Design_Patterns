package Facade;
class SkiRent {
    public int RentBoots(int feetSize, int skierLevel) {
        return 20;
    }

    public int RentSki(int weight, int skierLevel) {
        return 40;
    }

    public int RentPole(int height) {
        return 5;
    }
}

class SkiResortTicketSystem {
    public int BuyOneDayTicket() {
        return 115;
    }

    public int BuyHalfDayTicket() {
        return 60;
    }
}

class HotelBookingSystem {
    public int BookRoom(int roomQuality) throws IllegalArgumentException{
        switch (roomQuality) {
            case 3:
                return 250;
            case 4:
                return 500;
            case 5:
                return 900;
            default:
                throw new IllegalArgumentException("roomQuality should be in range [3;5]");
        }
    }
}
