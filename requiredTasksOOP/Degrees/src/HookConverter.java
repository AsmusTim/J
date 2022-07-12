public class HookConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return (5/12) * baseValue;
    }
    public static double convert(double baseValue){
        return new HookConverter().getConvertedValue(baseValue);
    }
}
