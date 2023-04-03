public class CeapaBurger implements Burger{
    String sos;
    String condimente;
    String legume;
    String carne;
    String chiflaCeapa;

    public void setChiflaCeapa(String chiflaCeapa) {
        this.chiflaCeapa=chiflaCeapa;
    }

    @Override
    public String showDetails() {
        return "CeapaBurger{" +
                "sos='" + sos + '\'' +
                ", condimente='" + condimente + '\'' +
                ", legume='" + legume + '\'' +
                ", carne='" + carne + '\'' +
                ", chiflaCeapa='" + chiflaCeapa + '\'' +
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
