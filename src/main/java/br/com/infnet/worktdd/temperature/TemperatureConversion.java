package br.com.infnet.worktdd.temperature;

public class TemperatureConversion {

    public double convert(String inputType, double inputValue) {

        switch (inputType) {
            case "celsiusToFahrenheit":
                return getRoundDouble((inputValue * 1.8) + 32);
            case "fahrenheitToCelsius":
                return getRoundDouble((inputValue - 32.0) / 1.8);
            case "fahrenheitToKelvin":
                return getRoundDouble((inputValue - 32) / 1.8 + 273.15);
            case "kelvinToFahrenheit":
                return getRoundDouble((inputValue * 1.8) -459.67);
            case "kelvinToCelsius":
                return getRoundDouble(inputValue - 273.15);
            case "celsiusToKelvin":
                return getRoundDouble(inputValue + 273.15);
            default:
                throw new IllegalArgumentException("Não existe uma conversão do tipo " + inputType + ".");
        }

    }

    private double getRoundDouble(Double inputValue) {
        return Math.round(inputValue *100.0)/100.0;
    }
  
}
