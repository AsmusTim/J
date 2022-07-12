public class GelilConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return (100 - baseValue) * 1.5;
    }
    public static double convert(double baseValue){
        return new GelilConverter().getConvertedValue(baseValue);
    }
}
