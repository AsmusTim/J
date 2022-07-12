public class RemerConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return (21/40) * baseValue + 7.5;
    }
    public static double convert(double baseValue){
        return new RemerConverter().getConvertedValue(baseValue);
    }
}
