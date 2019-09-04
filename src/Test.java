
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author House
 */
class Vehicule {


    public int speed() {
        return 0;
    }
}

class Car extends Vehicule {

    public int speed() {
        return 60;
    }
}

class RaceCar extends Car {

    public int speed() {
        return 150;
    }
}

class Test {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
       		 items.add("Pen");
        		items.add("Pencil");
        		items.add("Box");
       	 for (String i : items) {
            	if (i.indexOf("P") == 0) {
                	continue;
            	} else {
                System.out.print(i + " ");
            }
        }


String s1 = new String("Test");
String s2 = new String("Test");

if (s1==s2)
System.out.println("Same");

if (s1.equals(s2))

System.out.println("Equals");

    }
}
