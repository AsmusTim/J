public class PlanckianConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.416784 * Math.pow(10, 32) * new KelvinConverter().getConvertedValue(baseValue);
    }
    public static double convert(double baseValue){
        return new PlanckianConverter().getConvertedValue(baseValue);
    }
}
