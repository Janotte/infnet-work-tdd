package br.com.infnet.worktdd.size;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("Testes de Conversão de Medida")
public class SizeConversionTest {

    private SizeConversion conversion = null;

    // O método anotado com @BeforeEach será executado antes de cada método de teste na classe de teste.
    @BeforeEach
    void setupThis(){
        conversion = new SizeConversion();
    }

    @Test
    @DisplayName("Deve converter Jardas para Metros")
    void shouldConvertAYardsToMeters() {
        double yard = 55.0;
        assertEquals(50.29, conversion.convert("yardToMeter", yard));
    }

    @Test
    @DisplayName("Deve converter Metros para Jardas")
    void shouldConvertAMetersToYards() {
        double meter = 97.0;
        assertEquals(106.08, conversion.convert("meterToYard", meter));
    }

    @Test
    @DisplayName("Deve converter Centimetros para Polegadas")
    void shouldConvertACentimetersToInches() {
        double centimeter = 100.0;
        assertEquals(39.37, conversion.convert("centimeterToInch", centimeter));
    }

    @Test
    @DisplayName("Deve converter Polegadas para Centimetros")
    void shouldConvertAInchesToCentimeters() {
        double inch = 100.0;
        assertEquals(254.00, conversion.convert("inchTocCentimeter", inch));
    }

    @Test
    @DisplayName("Deve converter Polegadas para Centimetros")
    void shouldConvertAYardsToInches() {
        double yard = 10.0;
        assertEquals(360.00, conversion.convert("yardToInch", yard));
    }

    @Test
    @DisplayName("Deve converter Polegadas para Centimetros")
    void shouldConvertAInchesToYards() {
        double yard = 88.0;
        assertEquals(2.44, conversion.convert("inchToYard", yard));
    }

    @Test
    @DisplayName("Deve lançar uma exceção quando fornecido um tipo de entrada inválido")
    public void shouldThrowAnExceptionWhenGivenAnInvalidInputType() {

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> conversion.convert("INFORMADO!", 0.0));

        Assertions.assertEquals("Não existe uma conversão do tipo INFORMADO!.", exception.getMessage());
    }
    
}

