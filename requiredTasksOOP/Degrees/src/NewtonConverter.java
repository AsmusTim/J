public class NewtonConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return (33/100) * baseValue;
    }
    public static double convert(double baseValue){
        return new NewtonConverter().getConvertedValue(baseValue);
    }
}
