package eightweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaExample {

    public static void main(String[] args){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(564));
        }
        list.forEach(x -> System.out.println(x+", "));
        System.out.println("");


    }
}
