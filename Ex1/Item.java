package Ex1;

public class Item {
    public String name;
    private final int price;

    public int getPrice() {
        return price;
    }
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println("이름: "+name+", 가격: "+price);
    }
}
