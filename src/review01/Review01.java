package review01;

public class Review01 {

    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 8;
        double Tax = tax(num2);
        System.out.println(num1 + "円の商品の税込価格は" + (int)(num1 + (num1 * Tax)) + "円（消費税は" + (int)(num1 * Tax) + "円）です。");
    }

    public static double tax(int t) {
        double result = ((double) t)/100;
        return result;
    }
}