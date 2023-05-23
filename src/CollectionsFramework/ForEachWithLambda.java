package CollectionsFramework;

import java.util.ArrayList;


public class ForEachWithLambda {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(4);
        al.add(3);
        al.add(5);
        al.add(7);

        al.forEach(element -> {
            System.out.print(element + " ");
        });

        System.out.println();
        
       
    
    }
    
}
