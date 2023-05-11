import java.util.Scanner;
public class ChatBot {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        printGreeting();
        repeatName();
        guessAge();
        numberCount();
        knowledge();
    }
    public static String printGreeting() {
        System.out.println("Hello! I'm Chatty. What's your name? ");

        String nameEntered = scanner.nextLine();
        return nameEntered;
    }
    public static String repeatName() {
        System.out.println("Sorry, I seem to have had a glitch. Can you repeat your name, please?");

        String name2 = scanner.nextLine();
        System.out.println("Thanks " + name2 + ". I would like to play a game and guess your age!\n");
        return name2;
    }
    public static void guessAge() {
        System.out.println("What kind of music do you like? 80's Rock, 70's Disco, 0r 90's Pop?");

        String musicType = scanner.nextLine();

        int age;

        if (musicType.equalsIgnoreCase("80's Rock")) {
            age = 32;
        } else if (musicType.equalsIgnoreCase("70's Disco")) {
            age = 65;
        }else {
            age = 28;
        }
            System.out.println("I'm going to say you are " + age + " years old." );
    }
    public static void numberCount() {
        System.out.println("Okay! Let's try something else. Pick a number and I will count to it.");

        int num = Integer.parseInt(scanner.nextLine());

        if(num > 0) {
            for(int i = 1; i <= num; i++) {
                System.out.println(i);
            }
        } else if(num < 0) {
            for (int i = -1; i >= num; i--) {
                System.out.println(i);
            }
        }
    }
    public static void knowledge () {
        System.out.println("Let's test your programming knowledge");
        System.out.println("In Java, if I want to show decimals. What do I use? Choose from the following options?");
        System.out.println("A) int");
        System.out.println("B) dec");
        System.out.println("C) double");
        System.out.println("D) decimal");

        String answer = scanner.nextLine();

        if (answer.equals("C) double")) {
            System.out.println("Congrats! You know your stuff!");
        } else {
            System.out.println("Sorry! Go hit the books and learn some more!");
        }
    }

}

