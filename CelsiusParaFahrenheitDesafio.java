public class CelsiusParaFahrenheitDesafio {
    public static void main(String[] args){
        final double FATOR = 9.0/5.0;
        final int ADD = 32;
        int celsius = 27;
        double fahrenheit = (celsius * FATOR) + ADD;

        System.out.println("O resultado sera: " + fahrenheit+"\n");


    }
}
