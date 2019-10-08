package thirdweek.carexample;

public class MethodInClasses {

    public static void main (String[] args){

        Auto a = new Auto();
        Auto b = new Auto();
        //peldanyszintu metodus hivas
        a.utkozes(b);
        //osztalyszintu metodus meghivasa
        Auto.osztalySzintuUtkozes(a, b);
        //var args metodus hasznalata
        Auto c = new Auto();
        Auto d = new Auto();

        c.utkozesVarArgs(d);
    }
}
