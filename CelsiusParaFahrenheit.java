public class CelsiusParaFahrenheit {
    public static void main(String[] args){
        //(0 °C × 9/5) + 32
        double celsius = 27;
        final double divisao = 9/5;
        final int tempBase = 32;


        System.out.println((celsius *divisao) + tempBase);
    }
}
