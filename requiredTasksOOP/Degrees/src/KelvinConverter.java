public class KelvinConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue - 273.15;
    }
    public static double convert(double baseValue){
        return new KelvinConverter().getConvertedValue(baseValue);
    }
}
