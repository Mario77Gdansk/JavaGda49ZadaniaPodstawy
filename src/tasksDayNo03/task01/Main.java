package tasksDayNo03.task01;

public class Main {
    public static void main(String[] args) {
        Cat mruczek = new Cat("Mruczek");
        Cat filemon = new Cat("Filemon");
        Cat bonifacy = new Cat("Bonifacy");
        Cat[] catTable = {mruczek,filemon,bonifacy};


        mruczek.print();
        mruczek.makeSound();
        mruczek.eatMice(6);
        System.out.println();
        filemon.print();
        filemon.makeSound();
        filemon.eatMice(6);
        System.out.println();
        bonifacy.print();
        bonifacy.makeSound();
        bonifacy.eatMice(6);
        System.out.println();

        mruczek.setName("Mruczekkkkk");
        mruczek.print();





    }

}
