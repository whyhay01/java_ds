import java.util.Scanner;

public class PigLatin {
    /** INPUT TYPE: all gaul is divided into three parts
     * OUTPUT TYPE: allay, aulgay, isay, ividedday, intoay, eethray, artspay
     */

    public static void main (String[] args){
//        String[] inputType = {"all","gaul","valley","divided", "is"};
//        translation(inputType, 0);
        String word;
//        System.out.print ("> ");
//        word = readWord ();
//        while (! word.equals (".")) {
//            System.out.println (word + " => " + toPig (word));
//            System.out.print ("> ");
//            word = readWord ();
//        }
        while (true) {
            System.out.print ("> ");
            word = readWord ();
            if (word.equals ("."))
                break;
            System.out.println (word + " => " + toPig (word));
        }
    }

    private static String readWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /** True iff X is vowel*/
    private static boolean isVowel(char x){
        String vowel = "aeiou";
        return vowel.indexOf(x) >= 0;
    }

    /**
     * Translate the ARRAy of word into a single word
     */
    static void translation(String[] sent, int k){

        if (k < sent.length){
            System.out.print(toPig(sent[k]) + " ");
            translation(sent, k+1);
        }
    }

    /**
     * Translation of W (a single word) into Pig Latin
     */
    static String toPig(String w){
        //Todo()
        return w.substring( numberOfConsonant(w)) + w.substring(0,numberOfConsonant(w)) + "ay";
    }

    /**
     * The number of consonant at the beginning of W (a single world)
     */
    static int numberOfConsonant(String w){
        return numberOfConsonant(w, 0);
    }

    /**
     * the number of consonant at the beginning of the substring of W (a single word)
     * that start at position k
     */
    public static int numberOfConsonant(String w, int k){
        if (w.length() <= k || isVowel(w.charAt(k)))
            return 0;
        else
            return 1 + numberOfConsonant(w, k+1);

        /* Guarded commands considered to simplify the method
        *  An empty string has no empty consonant at the beginning
        *  A string w that start with a vowel has no consonant at the beginning
        *  A string that is not empty and does not start with vowel has one more consonant at the beginning
        *  than it has at the tail
        */
    }
}
