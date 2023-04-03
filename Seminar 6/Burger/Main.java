public class Main {
    //Să se implementeze un builder pentru crearea unui obiect de tip Burger,
    //având câmpurile ”tip de chifla”, ”carne”, ”sos”, ”legume” și ”condimente.
    //Builderul trebuie să ofere metode pentru a seta fiecare câmp în parte,
    //respectiv ”setChifla(String)”, ”setCarne(String)”, ”setSos(String)”, ”setLegume(String)” și
    //”setCondimente(String)”. De asemenea, builderul trebuie să ofere o metodă
    //”build()” pentru a crea obiectul Burger cu valorile setate în câmpuri. Trebuie
    //să se asigure că obiectul Burger creat are toate câmpurile setate corect.
    public static void main(String[] args) {
        BurgerBuilder bg=new CeapaBurgerBuilder();
        Cheff cheff=new Cheff(bg);
        cheff.BuildBurger();
        Burger burger= cheff.getBurger();
        System.out.println(burger.showDetails());

        bg=new SusanBurgerBuilder();
        cheff=new Cheff(bg);
        cheff.BuildBurger();
        burger= cheff.getBurger();
        System.out.println(burger.showDetails());
    }
}