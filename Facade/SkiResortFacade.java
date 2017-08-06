package Facade;
public class SkiResortFacade {
    private SkiRent skiRent = new SkiRent();
    private SkiResortTicketSystem skiResortTicketSystem = new SkiResortTicketSystem();
    private HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();

    public int HaveGoodRest(int height, int weight, int feetSize, int skierLever, int roomQuality) {
        int skiPrice = skiRent.RentSki(weight, roomQuality);
        int skiBootsPrice = skiRent.RentBoots(feetSize, skierLever);
        int polePrice = skiRent.RentPole(height);
        int oneDayTicket = skiResortTicketSystem.BuyOneDayTicket();
        int hotelPrice = hotelBookingSystem.BookRoom(roomQuality);

        return skiPrice + skiBootsPrice + polePrice + oneDayTicket + hotelPrice;
    }

    public int HaveRestWithOwnSkis() {
        int OneDayTicketPrice = skiResortTicketSystem.BuyOneDayTicket();
        return OneDayTicketPrice;
    }
}
