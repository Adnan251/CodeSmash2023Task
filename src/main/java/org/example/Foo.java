package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foo {
    public static int IsBuyerWinner(List<String> codeList, List<String> shoppingCart) {

        if(codeList.isEmpty()) { //checks if the codeList is empty
            return 1;
        }

        int justhold = 0;   //used to check if we found a match
        int codeTracker = 0; //tracks which element from codeList we are checking
        int shoppingTracker = 0; //tracks which element from shoppingcart list we are checking

        while(codeTracker < codeList.size()){  // loop through codeList

            List<String> list = convertCorrectly(codeList.get(codeTracker)); //convert string in codeList to a list
            int i = 0;
            int j = shoppingTracker;

            while(j < shoppingCart.size()){   //check if all the elements from new list are in shoppingCart in order
                if(list.get(i).equals(shoppingCart.get(j)) || list.get(i).equals("anything")) {
                    i++;
                    if (i == list.size()) {
                        shoppingTracker = j + 1;
                        codeTracker ++;
                        break;
                    }
                }
                else{
                    i = 0;
                }
                j++;
            }

            if(codeTracker > justhold) {
                justhold++;
                continue;
            }
            break;
        }

        if(codeTracker == codeList.size()){
            return 1;
        }

        else return 0;

    }

    private static List<String> convertCorrectly(String element){  //converter of string to list
        element = element.substring(1, element.length()-1);
        List<String> list = new ArrayList<String>(Arrays.asList(element.split(", ")));
        return list;
    }
}