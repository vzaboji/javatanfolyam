package thirdweek.singletonexample;

public class Kazan {
    private boolean tele;

    public Kazan() {
       tele = false;
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
