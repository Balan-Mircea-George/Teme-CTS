public class Cheff {
    private BurgerBuilder builder;
    Cheff(BurgerBuilder builder){this.builder=builder;}
    public void BuildBurger(){
        builder.buildCarne();
        builder.buildCondimente();
        builder.buildLegume();
        builder.buildSos();
        if(builder instanceof CeapaBurgerBuilder){
            ((CeapaBurgerBuilder)builder).buildChiflaCeapa();
        }else{
            ((SusanBurgerBuilder)builder).buildChiflaSusan();
        }
    }

    Burger getBurger(){
        return this.builder.getBurger();
    }
}
