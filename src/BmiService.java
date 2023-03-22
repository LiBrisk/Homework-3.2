public class BmiService {
    public int calculate (double weigtInKg, double hightInMet) {
        double bmi = weigtInKg / (hightInMet * hightInMet);
        return (int) bmi;
    }
}
