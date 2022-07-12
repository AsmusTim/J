public class RankinConverter implements Converter{

    @Override
    public double getConvertedValue(double baseValue) {
        return new KelvinConverter().getConvertedValue(baseValue) / 1.8;
    }
    public static double convert(double baseValue){
        return new RankinConverter().getConvertedValue(baseValue);
    }
}
