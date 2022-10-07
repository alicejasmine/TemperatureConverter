public class TemperatureConversionModel {    //([°F] = [°C] × 9/5 + 32).

    public static double getTemperatureInFahrenheit(double tempC) {
        return tempC * 9 / 5 + 32;
    }

    public static double getTemperatureInCelsius(double tempF) {
        return (tempF - 32) * 5 / 9;
    }


}
