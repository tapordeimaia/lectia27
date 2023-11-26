package automobil;

public class Bmw implements Automobil{
    int combustibil;
    boolean serviceEfectuat;

    public Bmw(int combustibil, boolean serviceEfectuat) {
        this.combustibil = combustibil;
        this.serviceEfectuat = serviceEfectuat;
    }

    @Override
    public void accelereaza(){
        if(combustibil==0){
            throw new AutoCombustibilException("Nu e combustibil");
        }
    }

    @Override
    public void franeaza(){
        if (!serviceEfectuat){
            throw new RuntimeException("Nu a fost la service");
        }
    }

    public void setCombustibil(int combustibil) {
        this.combustibil = combustibil;
    }

    public void setServiceEfectuat(boolean serviceEfectuat) {
        this.serviceEfectuat = serviceEfectuat;
    }
}
