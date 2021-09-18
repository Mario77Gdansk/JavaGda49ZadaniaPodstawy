package tasksDayNo03.task03;

public class Main {
    public static void main(String[] args) {
        OrderItem orderItem1 = new OrderItem("Cukier",1,3.5);
        OrderItem orderItem2 = new OrderItem("Mąka",2,4);
        OrderItem orderItem3 = new OrderItem("Chleb",3,3.5);
        OrderItem orderItem4 = new OrderItem("Jaja",4,4.5);
        OrderItem orderItem5 = new OrderItem("Mleko",5,2.9);
        OrderItem orderItem6 = new OrderItem("Mleko2",5,3.5);
        OrderItem orderItem7 = new OrderItem("Mleko3",5,2.9);
        OrderItem orderItem8 = new OrderItem("Mleko4",5,2.9);

        Order order = new Order(6);
        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);
        order.addItem(orderItem4);
        order.addItem(orderItem5);
        order.addItem(orderItem6);
        order.addItem(orderItem7);
        order.addItem(orderItem8);

        order.print();
    }
}
