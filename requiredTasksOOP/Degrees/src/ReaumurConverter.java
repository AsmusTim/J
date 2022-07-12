public class ReaumurConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue * 1.25;
    }
    public static double convert(double baseValue){
        return new ReaumurConverter().getConvertedValue(baseValue);
    }

}
