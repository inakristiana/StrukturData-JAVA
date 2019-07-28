package sortlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List Number = new ArrayList();
        Number.add("10");
        Number.add("6");
        Number.add("8");
        Number.add("2");
        Number.add("4");
        
        System.out.println("Sebelum Diurutkan");
        System.out.println(Number);
        
        Collections.sort(Number);
        System.out.println("Setelah Diurutkan");
        System.out.println(Number);
    }   
}