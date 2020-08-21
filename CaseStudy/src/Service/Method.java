package Service;

import Entities.Example;
import Entities.Meaning;
import Entities.MeaningType;
import Entities.Word;
import IO.IOManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method implements Iservices {
    List<Word> list = new ArrayList<>();
    public Method(List<Word> list){
        this.list = list;
    }

    Scanner scanner = new Scanner(System.in);
    IOManager ioManager = new IOManager();
    String[] listType =  {"noun" , "adjective", "verb", "synonym", "pronunciation"};

    public void define() {
        System.out.println("Enter word: ");
        String name = scanner.nextLine();
        Word word = getWord(name);
        System.out.println("Enter meaning type: ");
        String type = scanner.nextLine();
        MeaningType mt = getMeaningType(word,type);
        System.out.println("Enter word's meaning: ");
        String meaning = scanner.nextLine();
        Meaning m = getMeaning(mt,meaning);
        System.out.println("Enter meaning example: ");
        String example = scanner.nextLine();
        Example ex = getExample(m,example);
        System.out.println("Saved!");
    }
    private Word getWord(String name) {
        for (Word word : list) {
            if (name.equals(word.getName())) {
                return word;
            }
        }
        System.out.println("@ " + name + " is not existed in database, creat new one!" );
        Word word = new Word(name);
        list.add(word);
        return word;
    }

    private MeaningType getMeaningType(Word word, String type) {
        for (MeaningType meaningType : word.getList()) {
            if (type.equals(meaningType.getName())) {
                return meaningType;
            }
        }
        MeaningType meaningType = new MeaningType(type);
        word.addMeaningType(meaningType);
        return meaningType;
    }

    private Meaning getMeaning(MeaningType type, String meaning) {
        for (Meaning wordMeaning : type.getList()) {
            if (meaning.equals(wordMeaning.getName())) {
                return wordMeaning;
            }
        }
        Meaning wordMeaning = new Meaning(meaning);
        type.addMeaning(wordMeaning);
        return wordMeaning;
    }

    private Example getExample(Meaning meaning, String example) {
        for (Example wordExample : meaning.getList()) {
            if (example.equals(wordExample.getName())) {
                return wordExample;
            }
        }
        Example wordExample = new Example(example);
        meaning.addExample(wordExample);
        return wordExample;
    }

    public void search() {
        System.out.println("Enter word: ");
        String searchWord = scanner.nextLine();
        for (Word word : list) {
            if (searchWord.equals(word.getName())){
                System.out.println(word);
                System.out.println();
                return;
            }
        }
        System.out.println(searchWord + " is not existed!");

    }

    public void remove() {
        System.out.println("Enter word: ");
        String wordWantToRemove = scanner.nextLine();
        for (Word word : list) {
            if (wordWantToRemove.equals(word.getName())){
                list.remove(word);
                System.out.println("Done!");
                return;
            }
        }
        System.out.println(wordWantToRemove + " is not existed");
    }

    public void export() {
        ioManager.writeToFile(list);
        System.out.println("Exporting...");
        for (int i = 0; i <= 100 ; i += 10) {
            System.out.print(i + "%");
        }
        System.out.println("Done");
    }

    public void show() {
        for (Word word : list) {
            System.out.println("@" + word.getName());
            System.out.println();
        }
    }

}
