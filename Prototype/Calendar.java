package Prototype;
public class Calendar implements Cloneable {

    @Override
    public Calendar clone() throws CloneNotSupportedException {
        Calendar copy = (Calendar)super.clone();
        return copy;
    }
}

class CalendarPatty extends Calendar {}