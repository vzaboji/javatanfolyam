package thirdweek.inheritanceexample;

public class Tanulo extends Ember {

    private int magassag;

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    @Override
    public void setNev(String nev) {
        if (nev.length() < 3 || nev.length()>33){
            throw new IllegalArgumentException("keves vagy sok karakter.");
        }
        this.nev = nev;
        //super.setNev();
    }

    @Override
    public String toString() {
        return "tanulo: "+nev+" "+getEletkor()+" "+magassag;
    }

    @Override
    public String beszel() {
        return "diak nyelven beszel";
    }

    @Override
    protected String idegesenRangatozik() {
        return "a tanulo sosem rangatozik";

    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("tanulo equals metodus futasa");
        super.equals(obj);
        System.out.println("Tanulo equals metodus fut");
        if (obj instanceof Tanulo){
            return magassag==((Tanulo) obj).magassag;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 89 * hash + this.magassag;
        return hash;
    }

}
