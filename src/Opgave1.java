import java.util.*;

public class Opgave1 {

    public static int countVowels(ArrayList<String> strings){
        //Først returnerer jeg 0 hvis listen er tom
        if (strings.size()==0){
            return 0;
        }
        int vowels = 0;

        //Laver en løkke der traverserer hele listen
        for(int i=0;i<strings.size();i++){
            //I den nestede løkke checker jeg ascii-værdien for
            //alle chars i hver String i listen og hvis det er
            //en vokal bliver 'vowels' 1 større
            int count = 0;
            while(count<strings.get(i).length()){
                String string = strings.get(i);
                string.toLowerCase();
                char c = string.charAt(count);
                if(c == 97 || c==101 || c==105||c==111||c==117){
                    vowels++;
                }
                count++;
            }
        }
        return vowels;
    }

    public static int countUnique(List<Integer> ints){
        //Samme som før returnerer jeg 0 hvis listen er tom
        if(ints.size()==0){
            return 0;
        }
        //Jeg opretter et HashSet som jeg skriver den givne liste ind i
        Set<Integer> setOfInts = new HashSet<Integer>();
        for(int i=0;i<ints.size();i++){
            setOfInts.add(ints.get(i));
        }
        //Sets kan ikke have ens værdier så jeg kan bare returnere
        //størrelsen af settet
        return setOfInts.size();
    }

    public static int minLength (Set<String> strings){
        //Samme som før returneres 0 hvis settet er tomt
        int shortestString = 0;
        if (strings.isEmpty()){
            return shortestString;
        }
        //Opretter et nyt set som jeg vil have sorteret
        //så jeg kan traversere det nemt
        TreeSet sortedSet = new TreeSet<String>(strings);
        String firstString = (String)sortedSet.first();
        //Her sætter jeg shortestString til at være den første
        //String i settet
        shortestString=firstString.length();

        //Herefter traverserer jeg settet og sammenligner
        //String lengths og sætter shortestString til at
        //være den korteste
        for(String value : strings){
            shortestString=Math.min(shortestString,value.length());
        }
        return shortestString;
    }

    public static Set<String> removeOddLength(Set<String> strings){
        //Her overfører jeg det givne set til et HashSet
        //Så jeg nemt kan traversere det
        HashSet<String> hashSet = new HashSet<>(strings);
        for(String value: hashSet){
            //Hvis længden af Stringen er ulige bliver den
            //fjernet fra sættet
            if(value.length()%2!=0){
                strings.remove(value);
            }
        }
        return strings;
    }

    public static boolean contains3 (List<String> strings){
        /*Denne metode er ikke særligt effektiv ift runtime.
        Den har et nested for-loop der for hver String i
        listen traverserer hele listen for at tælle duplikanter
        Det kan potentielt tage meget lang tid hvis det er
        en meget lang liste*/
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i=0;i<strings.size();i++){
            hashMap.put(new Integer (i), strings.get(i));
        }

        for(Map.Entry mapElement1 : hashMap.entrySet()){
            int count = 0;
            String value = (String)mapElement1.getValue();
            for (Map.Entry mapElement2 : hashMap.entrySet()){
                String value2 = (String)mapElement2.getValue();
                if(value.equalsIgnoreCase(value2)){
                    count++;
                    if (count>=3){
                        return true;
                    }
                }
            }

        }

        return false;
    }

    public static boolean isUnique(Map<String,String> map){
        /*Lidt samme problem som ift runtime.
        For hver String i mappet traverserer og sammenligner
        jeg Strings i hele mappet (undtagen hvis de har samme key
        for at undgå at metoden altid ville give true)*/
        for (Map.Entry mapelement1 : map.entrySet()){
            String key = (String)mapelement1.getKey();
            String value = (String)mapelement1.getValue();

            for (Map.Entry mapelement2 : map.entrySet()){
                String value2 = (String)mapelement2.getValue();
                String key2 = (String)mapelement2.getKey();

                if(value.equalsIgnoreCase(value2)&& key!=key2){
                    return false;
                }
            }
        }
        return true;
    }
}
