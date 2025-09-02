package Unit3;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        System.out.println("Enter the no of Products: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.next());
        }
        Collections.sort(al);
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        al.add(1, "Daksh");
        al.addLast("Singh");
        System.out.println(al.get(1));
    }
}
