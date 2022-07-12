public class FahrenheitConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return (9/5) * baseValue + 32;
    }
    public static double convert(double baseValue){
        return new FahrenheitConverter().getConvertedValue(baseValue);
    }
}
