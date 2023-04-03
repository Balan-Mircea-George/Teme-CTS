public class SusanBurger implements Burger{
    String sos;
    String condimente;
    String legume;
    String carne;
    String chiflaSusan;

    public void setChiflaSusan(String chiflaSusan) {
        this.chiflaSusan=chiflaSusan;
    }

    @Override
    public String showDetails() {
        return "SusanBurger{" +
                "sos='" + sos + '\'' +
                ", condimente='" + condimente + '\'' +
                ", legume='" + legume + '\'' +
                ", carne='" + carne + '\'' +
                ", chiflaSusan='" + chiflaSusan + '\'' +
                '}';
    }

    @Override
    public void setCarne(String carne) {
        this.carne=carne;
    }

    @Override
    public void setSos(String sos) {
this.sos=sos;
    }

    @Override
    public void setLegume(String legume) {
this.legume=legume;
    }

    @Override
    public void setCondimente(String condimente) {
this.condimente=condimente;
    }
}
