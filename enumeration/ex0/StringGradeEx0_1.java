package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discount = new DiscountService();

        int basic = discount.discount("BASIC",price);
        int gold = discount.discount("GOLD",price);
        int diamond = discount.discount("DIAMOND",price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("discount = " + diamond);
    }
}
