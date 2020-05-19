package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConversionTest {

  static final double[] celsiusTemperatures = {0, -40, 100, -273.15};
  static final double[] fahrenheitTemperatures = {32, -40, 212, -459.67};
  static final double TOLERANCE = 0.000001;

  @Test
  void convertC2FScalar() {
    for (int i = 0; i < celsiusTemperatures.length; i++) {
      assertEquals(fahrenheitTemperatures[i],
          TemperatureConversion.convertC2F(celsiusTemperatures[i]), TOLERANCE);
    }
  }

  @Test
  void convertF2CScalar() {
    for (int i = 0; i < fahrenheitTemperatures.length; i++) {
      assertEquals(celsiusTemperatures[i],
          TemperatureConversion.convertF2C(fahrenheitTemperatures[i]), TOLERANCE);
    }
  }

  @Test
  void convertC2FArray() {
    assertArrayEquals(fahrenheitTemperatures,
        TemperatureConversion.convertC2F(celsiusTemperatures), TOLERANCE);
  }

  @Test
  void convertF2CArray() {
    assertArrayEquals(celsiusTemperatures,
        TemperatureConversion.convertF2C(fahrenheitTemperatures), TOLERANCE);
  }
}