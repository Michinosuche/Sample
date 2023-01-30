package review01;

public class Review01 {

    public static void main(String[] args) {
        int num1 = 1200;
        int num2 = 10;
        double priceWithTax = tax(num1, num2);
        System.out.println(num1 + "円の商品の税込価格は" + (int) priceWithTax + "円（消費税は" + (num1/num2) + "円）です。");
    }

    public static double tax(int p, int t) {
        double result = p + ((double) p / t);
        return result;
    }
}