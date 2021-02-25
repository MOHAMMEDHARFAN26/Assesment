
package com.kctech.assesment2;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
   
}
