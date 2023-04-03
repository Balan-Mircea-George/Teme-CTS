public class SusanBurgerBuilder implements BurgerBuilder{
    Burger burger;
    SusanBurgerBuilder(){burger=new SusanBurger();}

    public void buildChiflaSusan() {
        ((SusanBurger)burger).setChiflaSusan("de la lidl");
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
