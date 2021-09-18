package tasksDayNo03.task01;

public class Cat {
    private String name;



    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Miau miau");
    }

    void eatMice(int mice) {
        System.out.println("I ate " + mice + " mice");
    }

    void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
