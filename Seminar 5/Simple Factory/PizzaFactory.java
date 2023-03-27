public class PizzaFactory {
    public static Pizza createPizza(String type){
        if(type.equals("Cheese")){
            return new CheesePizza();
        } else if (type.equals("Peperoni")) {
            return new PeperoniPizza();
        } else if (type.equals("Anshua")) {
            return new AnshuaPizza();
        }
        return null;
    }//clasa abstracta vs interfata?
}
