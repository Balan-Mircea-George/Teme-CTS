public class Server {
    int port=0;
    String name=null;
    String culoare="red";
    int nrMasiniPeZi=10;
    private static Server instance;
    private Server(){}
    public static Server getInstance(){
        if(instance==null){
            Server.instance=new Server();
            return Server.instance;
        }else{
            return Server.instance;
        }
    }
    public String showStatus(){
        String text = String.format("Serverul %s ruleaza pe portul %d", name, port);
        return text;
    }
    public String Modificare(String culoare){
        this.culoare=culoare;
        return this.culoare;
    }//2 puncte pana acusica
    public int Adaugare(int nrMasini){
        this.nrMasiniPeZi+=nrMasini;
        return this.nrMasiniPeZi;
    }
}
