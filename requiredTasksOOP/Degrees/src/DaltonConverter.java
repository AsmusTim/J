public class DaltonConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return 100 * ((Math.log10(baseValue + 273.15) - Math.log10(273.15))/(Math.log10(373.15) - Math.log10(273.15)));
    }
    public static double convert(double baseValue){
        return new DaltonConverter().getConvertedValue(baseValue);
    }
}
