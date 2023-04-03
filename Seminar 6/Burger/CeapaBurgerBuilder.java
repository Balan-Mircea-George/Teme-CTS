public class CeapaBurgerBuilder implements BurgerBuilder{
    Burger burger;
    CeapaBurgerBuilder(){burger=new CeapaBurger();}

    public void buildChiflaCeapa() {
        ((CeapaBurger)burger).setChiflaCeapa("de la penny");
    }

    @Override
    public void buildCarne() {
        burger.setCarne("de vacuta");
    }

    @Override
    public void buildLegume() {
        burger.setLegume("varza+rosii");
    }

    @Override
    public void buildCondimente() {
        burger.setCondimente("sare+piper");
    }

    @Override
    public void buildSos() {
        burger.setSos("de ceapa");
    }

    @Override
    public Burger getBurger() {
        return burger;
    }
}
