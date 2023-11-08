package com.company;

import java.util.ArrayList;

public class arraylist01 { public static void main(String[] args) {
    ArrayList<Integer> l1 = new ArrayList<>();
    ArrayList<Integer> l2 = new ArrayList<>();


    l1.add(54);
    l1.add(3);
    l1.add(52);
    l1.add(51);
    l1.add(50);
    l2.add(1);
    l2.add(2);
    l2.add(3);
    l1.addAll(l2);
    l1.add(5);
    l1.toString();
//l1.clear();// sare elements ko clear kar dega arraylist se
    for(int i=0;i<l1.size();i++){
        System.out.print(l1.get(i)+" ");

    }
    System.out.println();
//    System.out.println(l1.toArray());
    System.out.println(l1.toString());
    System.out.println(l1.subList(1,5));
//        System.out.println(l1.contains(52));  // agar element 52 hoga to true return karega
//        System.out.println(l1.contains(1));
//        System.out.println(l1.indexOf(1));  // 1 jis index pe hoga vo indexNumber print ho jayega
//        System.out.println(l1.lastIndexOf(3)); // ye last se dekhana chalu karega jo pahla element milega uuse hi print karva dega
//        l1.remove(1); // ye index   1 vale element ko remove kar dega
//        System.out.println(l1.indexOf(3));  // check kiya ki element ko remove kiya ya
//    for(int i=0;i<)
//    System.out.println(l1.get(0));
}

}
