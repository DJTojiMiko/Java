import java.util.Scanner;

public class Plurals{
    public static String PluralForm(String word){
        int ln = word.length();
        // ,.!?;
        if (word.endsWith(",") || word.endsWith(".") || word.endsWith("!") || word.endsWith("?") || word.endsWith(";")){
            // conditional to ln - 2
            String newword = word.substring(0, ln-1);
            String special = word.substring(ln-1);
            String plural = PluralForm(newword);
            String act_plural = plural + special; 
            return act_plural;
        }
        else if (word.endsWith("s") || word.endsWith("x") || word.endsWith("z") || word.endsWith("ch") || word.endsWith("sh")){
            // s, x, z, ch, or sh
            word = word + "es";
        }
        else if (word.endsWith("o") && !(word.endsWith("ao")||word.endsWith("eo")||word.endsWith("io")||word.endsWith("oo")||word.endsWith("uo"))){
            //o preceded by a consonant
            word = word + "es";
        }
        else if (word.endsWith("y") && !(word.endsWith("ay")||word.endsWith("ey")||word.endsWith("oy")||word.endsWith("uy"))){
            //replace y with ies
            return word.replace("y", "ies");
        }
        else{
            word = word + "s";
        }
        return word;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("This program converts an English word to its plural form. \n");
        System.out.print("English word: ");
        String singular = scnr.next();
        String plural = PluralForm(singular);
        System.out.printf("Plural form: %s",plural);
        scnr.close();
    }
}