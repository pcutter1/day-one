package edu.cnm.deepdive;

public class TemperatureConversion {

  private static final double CELSIUS_TO_FAHRENHEIT_SCALE = 9.0 / 5.0;
  private static final double FAHRENHEIT_TO_CELSIUS_SCALE =  1 / CELSIUS_TO_FAHRENHEIT_SCALE;
  private static final double SCALE_OFFSET = 32;

  public static void main(String[] args) {
    if (args.length == 0) {
      double tempCelsius = 100;
      double tempFahrenheit = 32;
      System.out
          .println("Celsius " + tempCelsius + " = " + convertC2F(tempCelsius) + " Fahrenheit");
      System.out.println(
          "Fahrenheit " + tempFahrenheit + " = " + convertF2C(tempFahrenheit) + " Celsius");
    } else {
      for (String arg : args) {
        double tempCelsius = Double.parseDouble(arg);
        System.out
            .println("Celsius " + tempCelsius + " = " + convertC2F(tempCelsius) + " Fahrenheit");
      }
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * CELSIUS_TO_FAHRENHEIT_SCALE + SCALE_OFFSET;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - SCALE_OFFSET) * FAHRENHEIT_TO_CELSIUS_SCALE;
  }

  public static double[] convertC2F(double[] celsiusTemperatures) {
    double[] fahrenheitTemperatures = new double[celsiusTemperatures.length];
    for (int i = 0; i < celsiusTemperatures.length; i++) {
      double celsius = celsiusTemperatures[i];
      double fahrenheit = convertC2F(celsius);
      fahrenheitTemperatures[i] = fahrenheit;
    }
    return fahrenheitTemperatures;
  }

  public static double[] convertF2C(double[] fahrenheitTemperatures) {
    double[] celsiusTemperatures = new double[fahrenheitTemperatures.length];
    for (int i = 0; i < fahrenheitTemperatures.length; i++) {
      double fahrenheit = fahrenheitTemperatures[i];
      double celsius = convertF2C(fahrenheit);
      celsiusTemperatures[i] = celsius;
    }
    return celsiusTemperatures;
  }

}
