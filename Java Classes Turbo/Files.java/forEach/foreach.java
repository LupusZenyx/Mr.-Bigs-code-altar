import java.util.ArrayList;
public class foreach {

    public static void main(String[] args){
        ArrayList<Integer> hits = new ArrayList<Integer>();
        hits.add(1);
        hits.add(0);
        hits.add(0);

        for(int i: hits)   {
            if(i==1){
                System.out.println("no hit");
            }else{
                System.out.println("hit");
            }
        }

    }
}