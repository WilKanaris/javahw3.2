public class BmiService {
    public double calculate(int m, double h) {
        double index;
        index = (m / (h * h));
        return index;
    }
}
