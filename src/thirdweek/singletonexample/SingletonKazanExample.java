package thirdweek.singletonexample;

public class SingletonKazanExample {

    public static void main(String[] args){
//        Kazan kazan = new Kazan();
//        kazan.megtolt();
//        kazan.megtolt();
//        kazan.kiurit();
//        kazan.megtolt();
        gombEsemeny(false);
        gombEsemeny(false);
        gombEsemeny(true);
        gombEsemeny(false);
    }

    public static void gombEsemeny(boolean zold){
        SingletonKazan kazan = SingletonKazan.getInstance();
        if (zold){
            kazan.kiurit();
        }else{
            kazan.megtolt();
        }
    }
}
