package Prototype;
public class CalendarEvent {
    private Calendar calendar;

    public CalendarEvent(Calendar calendar) {
        this.calendar = calendar;
    }

    public Calendar makeClone() throws CloneNotSupportedException {
        return (Calendar)this.calendar.clone();
    }

    public static void main(String[] args) {
        Calendar tempCalendar = null;
        Calendar prot = new CalendarPatty();
        CalendarEvent calendarEvent = new CalendarEvent(prot);
        try {
            tempCalendar = calendarEvent.makeClone();
            System.out.println("YEAH! We cloned this object");
        } catch (CloneNotSupportedException cloneException) {
            System.out.println("We can`t clone this object " + cloneException);
        }
    }
}
