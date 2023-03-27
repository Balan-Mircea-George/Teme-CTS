public class MacGUIFactory implements GUIFactory{
    public Button createButton(){
        return new MacButton();
    }
    public Menu createMenu(){
        return new MacMenu();
    }
}
