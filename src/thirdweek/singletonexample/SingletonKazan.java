package thirdweek.singletonexample;

public class SingletonKazan {

    private static SingletonKazan kazan;
    private boolean tele;
    private SingletonKazan() {
        tele = false;
    }

    public static SingletonKazan getInstance(){
        if (kazan == null){
            kazan = new SingletonKazan();
        }
        return kazan;
    }

    public void megtolt(){
        if (!tele){
            System.out.println("Kazan töltese");
            tele = true;
        }else{
            System.out.println("A kazan mar tele van!");
        }
    }

    public void kiurit(){
        System.out.println("A kazan uritese");
        tele=false;
    }

}
