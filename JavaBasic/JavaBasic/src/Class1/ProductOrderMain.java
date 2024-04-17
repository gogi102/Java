package Class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] po = new ProductOrder[3];

        po[0] = new ProductOrder();
        po[1] = new ProductOrder();
        po[2] = new ProductOrder();

        po[0].ProductName = "두부";
        po[0].price = 2000;
        po[0].Quantity = 2;

        po[1].ProductName = "김치";
        po[1].price = 5000;
        po[1].Quantity = 1;

        po[2].ProductName = "콜라";
        po[2].price = 1500;
        po[2].Quantity = 2;

        int total = 0;

        for(ProductOrder order : po) {
            System.out.println("상품명: "+order.ProductName+", 가격: "+order.price+", 수량: "+order.Quantity);
            total += order.price * order.Quantity;
        }
        System.out.println("총 결제 급액: "+total);
    }
}
