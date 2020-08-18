package com.codegym;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(10);
        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(numbers);

    }
}
