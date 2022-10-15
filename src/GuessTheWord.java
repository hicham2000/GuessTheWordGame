import java.util.Scanner;

public class GuessTheWord {


    private boolean play = true;
    private int round = 10;
    private Scanner scanner = new Scanner(System.in);

    Words randomWard = new Words();

    public void start(){


        do {
            showWord();
            getInput();
            cheakInput();

        }while (play);


    }
    void showWord(){
        System.out.println(randomWard);
    }

    void getInput(){
        System.out.println("enter a letter: ");
        String usrguess = scanner.nextLine();
        randomWard.guess(usrguess.charAt(0));



    }

    void cheakInput(){

        if (randomWard.isGuessRight()){
            System.out.println("congrats you won !!");
            System.out.println("the word is : "+randomWard);
            play = false;
        }


    }

    public void end(){
        scanner.close();
    }

}
