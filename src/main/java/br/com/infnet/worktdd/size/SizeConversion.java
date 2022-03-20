package br.com.infnet.worktdd.size;

public class SizeConversion {

    public double convert(String inputType, double inputValue) {
        switch (inputType) {

            case "meterToYard":
                return getRoundDouble(inputValue * 1.09361);
            case "yardToMeter":
                return getRoundDouble(inputValue * 0.9144);
            case "centimeterToInch":
                return getRoundDouble(inputValue * 0.39370078740157);
            case "inchTocCentimeter":
                return getRoundDouble(inputValue * 2.54);
            case "yardToInch":
                return getRoundDouble(inputValue * 36);
            case "inchToYard":
                return getRoundDouble(inputValue / 36);
            default:
                throw new IllegalArgumentException("Não existe uma conversão do tipo " + inputType + ".");
        }
    }

    private double getRoundDouble(Double inputValue) {
        return Math.round(inputValue *100.0)/100.0;
    }

}

