public class LeidenConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 253;
    }
    public static double convert(double baseValue){
        return new LeidenConverter().getConvertedValue(baseValue);
    }
}
