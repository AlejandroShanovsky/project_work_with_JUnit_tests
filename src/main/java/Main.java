public class Main {
    public static void main(String[] args) {
        Money money = Money.dollar(3);
        System.out.println(money.times(5).amount);
    }
}
