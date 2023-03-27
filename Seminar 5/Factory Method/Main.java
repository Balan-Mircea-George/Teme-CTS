public class Main {
    public static void main(String[] args) {
        AnimalFactory af1, af2,af3;
        af1=new DogFactory();
        af2=new CatFactory();
        af3=new DinozaurFactory();
        af1.createAnimal();
        af2.createAnimal();
        af3.createAnimal();
    }
}