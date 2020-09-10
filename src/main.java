import java.util.*;

public class main {
    public static void main(String[] args) {

        //Jeg erklærer og fylder de lister, sets og maps jeg har brug for at kunne
        //afprøve min kode
        Map<String,String> mapOfStrings = new HashMap<String, String>();

        mapOfStrings.put("One","1");
        mapOfStrings.put("Two","2");
        mapOfStrings.put("Three","3");
        mapOfStrings.put("Four","4");
        mapOfStrings.put("Five","4");

        ArrayList<String> listOfStrings = new ArrayList<>();

        String string1 = "Here's one string";
        String string2 = "and another";
        String string3 = "the third";
        String string4 = "Even number of";

        listOfStrings.add(string1);
        listOfStrings.add(string2);
        listOfStrings.add(string3);
        listOfStrings.add(string1);
        listOfStrings.add(string1);

        Set<String> setOfStrings = new TreeSet<>();

        setOfStrings.add(string1);
        setOfStrings.add(string2);
        setOfStrings.add(string3);
        setOfStrings.add(string4);

        ArrayList<Integer> listOfInts = new ArrayList<>();

        listOfInts.add(1);
        listOfInts.add(1);
        listOfInts.add(3);
        listOfInts.add(2);
        listOfInts.add(1);
        listOfInts.add(6);
        listOfInts.add(4);


        //Her kører jeg alle metoderne og printer resultatet i konsollen
        System.out.println("countVowels test: " + Opgave1.countVowels(listOfStrings));

        System.out.println("countUnique test: " + Opgave1.countUnique(listOfInts));

        System.out.println("minLength test:" + Opgave1.minLength(setOfStrings));

        System.out.println("removeOddLength test: " + Opgave1.removeOddLength(setOfStrings));

        System.out.println("contains3 test: " + Opgave1.contains3(listOfStrings));

        System.out.println("isUnique test: " + Opgave1.isUnique(mapOfStrings));
    }

}
