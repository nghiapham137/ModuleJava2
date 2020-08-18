package com.codegym;

import java.util.List;


public class RandomListFacade {
    private RandomNumber randomNumber;
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(RandomNumber randomNumber, RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomNumber = randomNumber;
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }


    public void printRandomEvenList(int size, int min, int max) {
        List<Integer> array = this.randomList.generateList(size, min, max);
        this.listPrinter.printList(array);
        System.out.println();
        System.out.println("List after using filter Odd: ");
        System.out.println(this.listFilter.filterOdd(array));

    }
}
