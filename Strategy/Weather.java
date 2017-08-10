package Strategy;
class Weather {
    private String weather;

    public Weather() {}

    public Weather(String weather) {
        this.weather = weather;
    }

    public static String getWeather() {
        return "rain";
    }
}
