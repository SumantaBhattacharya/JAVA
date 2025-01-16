import java.util.Scanner;

public class WeatherInterpreter {

    public static String interpretWeatherCode(long weatherCode) {
        String weatherCondition = "";  // Default value

        if (weatherCode == 0L) {
            weatherCondition = "Clear sky";
        } else if (weatherCode >= 1L && weatherCode <= 3L) {
            weatherCondition = "Mainly clear, partly cloudy, or overcast";
        } else if ((weatherCode == 45L) || (weatherCode == 48L)) {
            weatherCondition = "Fog and depositing rime fog";
        } else if ((weatherCode >= 51L && weatherCode <= 55L)) {
            weatherCondition = "Drizzle: Light, moderate, dense intensity";
        } else if ((weatherCode == 56L) || (weatherCode == 57L)) {
            weatherCondition = "Freezing Drizzle: Light or dense intensity";
        } else if ((weatherCode >= 60L && weatherCode <= 65L)) {
            weatherCondition = "Rain: Slight, moderate, heavy intensity";
        } else if (weatherCode >= 66L && weatherCode <= 70L) {
            weatherCondition = "Freezing Rain: Light or heavy intensity";
        } else if ((weatherCode >= 71L && weatherCode <= 75L)) {
            weatherCondition = "Snow fall: Slight, moderate, heavy intensity, or snow showers";
        } else if (weatherCode >= 76L && weatherCode <= 79L) {
            weatherCondition = "Snow grains";
        } else if ((weatherCode == 80L) || (weatherCode == 81L) || (weatherCode == 82L)
                || (weatherCode == 83L) || (weatherCode == 84L)) {
            weatherCondition = "Rain showers: Slight, moderate, or violent";
        } else if ((weatherCode >= 85L && weatherCode <= 90L)) {
            weatherCondition = "Snow showers: Slight or heavy";
        } else if (weatherCode >= 91L && weatherCode <= 95L) {
            weatherCondition = "Thunderstorm: Slight or moderate";
        } else if (weatherCode >= 96L && weatherCode <= 99L) {
            weatherCondition = "Thunderstorm with slight or heavy hail";
        }

        return weatherCondition;
    }

    public static void main(String[] args) {
        System.out.print("Enter the weather code: ");
        Scanner sc = new Scanner(System.in);  // Provide System.in as the input source
        long weatherCode = sc.nextLong();     // Assuming the user enters a valid long value
        String interpretation = interpretWeatherCode(weatherCode);// Replace with the actual weather code
        System.out.println("Weather Condition: " + interpretation);
        sc.close();
    }
}
