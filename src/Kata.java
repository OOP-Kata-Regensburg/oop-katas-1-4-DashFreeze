import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        KataTest.class
})

public class Kata {

    /* Kata 1 Schreiben Sie eine Methode, die ein int[] als Parameter übergeben bekommt und die größte Zahl in diesem Array zurückgibt. */
    public static int kataIntArrayMaximum(int[] values) {
        for(int i = 1; i < kataIntArrayMaximum.length; i++){
                for(int j = 0; j < kataIntArrayMaximum.length - i; i++) {
                        if(kataIntArrayMaximum[j] < kataIntArrayMaximum[j+1]) {
                                int number = kataIntArrayMaximum[j];
                                kataIntArrayMaximum[j] = kataIntArrayMaximum[j+1];
                                kataIntArrayMaximum[j+1] = number;
                        }
                }
        }
        return kataIntArrayMaximum[0];
    }

    /* Kata 2 Schreiben Sie eine Methode, die ein int[] als Parameter übergeben bekommt, die den Durchschnittswert aller gespeicherten Integers des Arrays berechnet und zurückgibt.*/
    public static int kataIntArrayAverage(int[] values) {
        int sum = 0;
        for(int i = 0; i < kataIntArrayAverage.length; i++) {
                sum += kataIntArrayAverage[i];
        }
        average = sum/kataIntArrayAverage.length;
        return average;
    }

    /* Kata 3 Schreiben Sie eine Methode, die einen String als Parameter übergeben bekommt und in umgekehrter Reihenfolge zurückgibt.*/
    public static String kataStringReversed(String str) {
        String newName;
        for(int i = kataStringReversed.length; i > 0 ; i--){
                char currentChar = kataStringReversed.charAt(i)
                newName += currentChar
        }
        return newName;
    }

    /* Kata 4 Schreiben Sie eine Methode, die einen String als Parameter übergeben bekommt und jedes auftretende 'a' durch ein 'e' ersetzt. */
    public static String kataStringReplaceA(String str) {
        for(int i = 0; i < kataStringReplaceA.length; i++) {
                if(kataStringReplaceA.charAt(i)= "a"){
                        kataStringReplaceA.charAt(i) = "e";
                }
        }
        return kataStringReplaceA;
    }
}
