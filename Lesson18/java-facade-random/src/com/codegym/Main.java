package com.codegym;

public class Main {
    public void printRandomEvenList(int size, int min, int max) {
        RandomListFacade randomListFacade = new RandomListFacade(new RandomNumber(), new RandomList(), new ListFilter(), new ListPrinter());
        randomListFacade.printRandomEvenList(size, min, max);
    }


    public static void main(String[] args) {
	    Main client = new Main();
	    client.printRandomEvenList(5, 1, 20);
    }
}
