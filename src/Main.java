public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87 /* (рост в м) */;
        int m = 98 /* (вес в кг) */;
        double index = service.calculate(m, h);
        System.out.println((int) index);
    }
}