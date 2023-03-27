public class DinozaurFactory implements AnimalFactory{
    public Animal createAnimal(){
        return new Dinozaur();
    }
}
