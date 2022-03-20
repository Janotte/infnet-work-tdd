package br.com.infnet.worktdd.temperature;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("Testes de Conversão de Temperatura")
public class TemperatureConversionTest {

    TemperatureConversion conversion = new TemperatureConversion();

    // O método anotado com @BeforeEach será executado antes de cada método de teste na classe de teste.
    @BeforeEach
    void setupThis(){
        conversion = new TemperatureConversion();
    }

    @Test
    @DisplayName("Deve converter uma temperatura Celsius para Fahrenheit")
    void shouldConvertACelsiusTemperatureToFahrenheit() {
        double celsius = 13.0;
        assertEquals(55.40, conversion.convert("celsiusToFahrenheit", celsius));
    }

    @Test
    @DisplayName("Deve converter uma temperatura Fahrenheit para Celsius")
    void shouldConvertAFahrenheitTemperatureToCelsius() {
        double fahrenheit = 100.0;
        assertEquals(37.78, conversion.convert("fahrenheitToCelsius", fahrenheit));
    }

    @Test
    @DisplayName("Deve converter uma temperatura Fahrenheit para Kelvin")
    void shouldConvertAFahrenheitTemperatureToKelvin() {
        double fahrenheit = 100;
        assertEquals(310.93, conversion.convert("fahrenheitToKelvin", fahrenheit));
    }

    @Test
    @DisplayName("Deve converter uma temperatura Kelvin para Fahrenheit")
    void shouldConvertKelvinTemperatureToFahrenheit() {
        double kelvin = 200;
        assertEquals(-99.67, conversion.convert("kelvinToFahrenheit", kelvin));
    }

    @Test
    @DisplayName("Deve converter uma temperatura Kelvin para Celsius")
    void shouldConvertKelvinTemperatureToCelsius() {
        double kelvin = 200;
        assertEquals(-73.15, conversion.convert("kelvinToCelsius", kelvin));
    }

    @Test
    @DisplayName("Deve converter uma temperatura Celsius para Kelvin")
    void shouldConvertCelsiusTemperatureToKelvin() {
        double celsius = 50;
        assertEquals(323.15, conversion.convert("celsiusToKelvin",celsius));
    }

    @Test
    @DisplayName("Deve lançar uma exceção quando fornecido um tipo de entrada inválido")
    public void shouldThrowAnExceptionWhenGivenAnInvalidInputType() {

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> conversion.convert("INFORMADO!", 0.0));

        Assertions.assertEquals("Não existe uma conversão do tipo INFORMADO!.", exception.getMessage());
    }
}
