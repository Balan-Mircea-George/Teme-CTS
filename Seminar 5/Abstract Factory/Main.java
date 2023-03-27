public class Main {
    public static void main(String[] args) {//builder&prototype 2 minute teorie/schema/exemplu implementat
        GUIFactory gf1, gf2;
        gf1 = new WindowsGUIFactory();
        gf2 = new MacGUIFactory();
        System.out.println(gf1.createButton().Show());
        System.out.println(gf1.createMenu().Show());
        System.out.println(gf2.createButton().Show());
        System.out.println(gf2.createMenu().Show());
    }
}