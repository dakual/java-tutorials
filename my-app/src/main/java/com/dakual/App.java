package com.dakual;

import java.util.ArrayList;
import java.util.List;

public class App 
{
	public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(9);

        System.out.println( findOdd(list) );
	}

    public static int findOdd(List<Integer> list) {
        for (int number : list) {
            if(number % 2 == 0) {
                return number;
            }
        }

        return -1;
    }
}
