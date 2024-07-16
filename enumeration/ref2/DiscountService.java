package enumeration.ref2;

public class DiscountService {

    public int discount(Grade Grade, int price){
        return price * Grade.getDiscountPercent() / 100;
    }
}

