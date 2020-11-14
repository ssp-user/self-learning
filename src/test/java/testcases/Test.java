package testcases;

import java.util.ArrayList;
import java.util.List;

public class Test {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        boolean contains = false;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < names1.length; i++) {
            for (int j = 0; j < names2.length; j++) {
                if (names1[i] == names2[j]) {
                    contains = true;
                    break;
                }
            }

            if(!contains){
                list.add(names1[i]);
            }
            else{
                contains = false;
            }
        }
        System.out.println(list);

		String array[] = new String[list.size()];              
		for(int j =0;j<list.size();j++){
		  array[j] = list.get(j);
		}        
		return array;
    }
    
    public static void main(String[] args) {
    	int i = 10;
    	int j = i/2;
    	System.out.println(i + "   " + j);
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", Test.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}