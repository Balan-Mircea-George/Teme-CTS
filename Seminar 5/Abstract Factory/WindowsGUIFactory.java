public class WindowsGUIFactory implements GUIFactory{
    public Button createButton(){
        return new WindowsButton();
    }
    public Menu createMenu(){
        return new WindowsMenu();
    }
}
