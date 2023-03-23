//singleton-avem o referinta la singurul obiect
//tre sa avem o singura instanta si un constructor privat
//am avea nevoie cand accesam o baza de date
//servarul tre sa aiba o singura instanta de server

public class Main {
    public static void main(String[] args){
        Server x;
        x = Server.getInstance();
        System.out.println(x.showStatus());
        System.out.println(x.Modificare("portocaliu"));
        System.out.println(x.Adaugare(25));
        //2 numere si unu va avea cu siguranta singleton
        //returneaza adresa obiectului respectiv
    }}
//tre sa fie static pt ca are proprietatea de a fi apelate direct
//prin accesarea clasei fara a fi nevoie de a crea un obiect
