package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)
    {
	     int[] intNumbers = {1,2,3,5,6,7,4,54,64,547,54,5,3};

       IntStream.of(intNumbers)
               .forEach(value -> System.out.printf("%d ",value));
    }
}
