


public class Main {
    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int rezultat=calculator.add(5).subtract(3).multiply(2).results();
        System.out.println("a) "+rezultat);
        calculator.clear();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator(2);
        int rezultat2=advancedCalculator.add(5).power(2).results();
    }
}