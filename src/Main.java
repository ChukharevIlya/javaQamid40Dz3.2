public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myWeight = 71.3;
        double myGrowth = 1.7;
        double myBmi = service.calculate(myWeight, myGrowth);
        System.out.println(myBmi);
    }
}
