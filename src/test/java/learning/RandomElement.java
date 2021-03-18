package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
 
public class RandomElement {
 
    // Drive Function
    public static void main(String[] args)
    {
 
        // create a list of Integer type
        List<String> list = Arrays.asList("A12IIWKDK34", "BUJ87MGKJ", "CIUSM625JUF", "DJGURJ766JHJ");
        // add elements in ArrayList
         
 
        RandomElement obj = new RandomElement();
 
        // take a random element from list and print them
        System.out.println(obj.getRandomElement(list));
    }
 
    // Function select an element base on index
    // and return an element
    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}