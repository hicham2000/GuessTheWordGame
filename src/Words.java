import java.util.Arrays;
import java.util.Random;

public class Words {
    private Random random = new Random();
    private char[] letters;


    private String selectWord;

    private String[] randomWord = {"happy","sad","incredible","flexible","hello","teacher","accontant","vendor","apple",
    "cerial","carot","onion","one","two"};

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();

        for (char lettre : letters){

            word.append(lettre == '\u0000' ? '-' : lettre);
            word.append(' ');
        }
        return word.toString();
    }

    public Words() {
        selectWord=randomWord[random.nextInt(randomWord.length)];
        letters =new char[selectWord.length()];

    }

    public void guess(char letter) {
        for (int i=0;i<selectWord.length();i++){
            if (letter == selectWord.charAt(i)){
                letters[i] = letter;
            }
        }

    }

    public boolean isGuessRight(){
        for (char letter : letters ){
            if (letter == '\u0000') return false;

        }

        return true;
    }

}
