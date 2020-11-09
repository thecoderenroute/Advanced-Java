package com.dep.example.guava_example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Hello world!
 *
 */
public class App 
{
	static Multiset<String> animals;
	
    public static void main( String[] args )
    {
        animals = HashMultiset.create();
        animals.add("Dog");
        animals.add("cat");
        animals.add("Hum bhi jaanvar hi ban gye hai lockdown me");
        
        animals.forEach(System.out::println);
    }
}
