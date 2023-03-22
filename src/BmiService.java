public class BmiService {
    public int calculate (double weigtInKg, double hightInMet) {
        double bmi = weigt / (hight * hight);
        return (int) bmi;
    }
}
