package Service;

import Entities.Example;
import Entities.Meaning;
import Entities.MeaningType;
import Entities.Word;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Method implements Iservices {
    List<Word> list = new ArrayList<>();
    public Method(List<Word> list){
        this.list = list;
    }

    Scanner scanner = new Scanner(System.in);
//    IOManager ioManager = new IOManager();

    public void define() {
        System.out.println("Enter word: ");
        String name = scanner.nextLine();
        Word word = getWord(name);
        String type = null;
        doThis:
        do {
            System.out.println("Meaning types:");
            System.out.println("1. Pronunciation");
            System.out.println("2. Noun");
            System.out.println("3. Adjective");
            System.out.println("4. Verb");
            System.out.println("5. Synonym");
            System.out.println("Enter meaning type: ");
           String choice = scanner.nextLine();
           switch (choice) {
               case "1" ->{type = "Pronunciation";}
               case "2" -> type = "Noun";
               case "3" -> type = "Adjective";
               case "4" -> type = "Verb";
               case "5" -> type = "Synonym";
               default -> {System.err.println("Type is not exist");break doThis;}
           }
           break ;
        } while (true );

        MeaningType mt = getMeaningType(word,type);
        System.out.println("Enter word's meaning: ");
        String meaning = scanner.nextLine();
        Meaning m = getMeaning(mt,meaning);
        String yesOrNo = null;
        do {
            System.out.println("Do you want to add example?");
            yesOrNo = scanner.nextLine();
            if (yesOrNo.equalsIgnoreCase("n")) break;
            System.out.println("Enter meaning example: ");
            String example = scanner.nextLine();
            Example ex = getExample(m,example);
            System.out.println("Example saved");
        } while (!yesOrNo.equalsIgnoreCase("n"));

        System.out.println("Saved!");

        Collections.sort(list);
    }
    private Word getWord(String name) {
        for (Word word : list) {
            if (name.equalsIgnoreCase(word.getName())) {
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

    public void search()
    {
        System.out.println("Enter word: ");
        String searchWord = scanner.nextLine();
        for (Word word : list) {
            if (searchWord.equalsIgnoreCase(word.getName())){
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
            if (wordWantToRemove.equalsIgnoreCase(word.getName())){
                list.remove(word);
                System.out.println("Done!");
                return;
            }
        }
        System.out.println(wordWantToRemove + " is not existed");
    }

    public void export() {
        System.out.println("Enter a word ");
        String wordWantToExport = scanner.nextLine();
        for (Word word : list) {
            if (wordWantToExport.equalsIgnoreCase(word.getName())) {
                try {
                    FileWriter writer = new FileWriter(word.getName() + ".txt");
                    writer.write(word.toString());
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void show() {
        for (Word word : list) {
            System.out.println("@" + word.getName());
            System.out.println();
        }
    }


}
