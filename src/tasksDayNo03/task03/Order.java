package tasksDayNo03.task03;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;
    private int currentOrderItemCounter;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
        currentOrderItemCounter = 0;
    }

    public boolean addItem(OrderItem item){
        if (currentOrderItemCounter>=maxOrderItem){
            System.out.println("order is full");
            return false;
        }
        if(item.isCorrect()){
            orderItems[currentOrderItemCounter] = item;
            currentOrderItemCounter++;
            return true;

        }
        System.out.println("OrderItem is incorrect");
        return false;
    }
    public double getTotalAmount(){
        double totalAmount = 0;
        for (OrderItem item:orderItems
             ) {
            if(item!=null){
                totalAmount +=item.getAmount();
            }
        }
        return totalAmount;
    }
    public double getItemsCount(){
        double total = 0;
        for (OrderItem item:orderItems
        ) {
            if(item!=null){
                total +=item.getQuantity();
            }
        }
        return total;
    }
    public void print(){
        for(OrderItem item : orderItems){
            if(item!=null){
                item.print();
            }
        }
        System.out.println("Total amount: "+getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }
}
