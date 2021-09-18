package tasksDayNo03.task03;

public class OrderItem {
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public double getAmount(){
        return quantity*price;
    }
    public boolean isCorrect(){
        return (quantity>0)&(price>0);
    }
    public void print(){
        System.out.println(productName+" | "+price+" zł | "+" pcs | "+ getAmount()+" zł");
    }

    public int getQuantity() {
        return quantity;
    }
}
