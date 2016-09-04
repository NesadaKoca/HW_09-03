package nyc.c4q;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Change objCh = new Change();
        boolean validAnswer = false;

        do {

            System.out.print("\n                      WELCOME TO DRIVER GAME! \n\n" +
                    "Imagine your are in your car driving in the city faster than is allowed. \n" +
                    "You are going to work. It's morning, and you are 15 minutes late.\n" +
                    "Your cell phone start ringing. Maybe your employer is calling. Pick up the phone (Y/N) ? \n");

            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            answer = answer.toUpperCase();

            if (answer.equals("Y")) { // 1-st answer
                System.out.print("\nYou put your head down for 2 seconds looking for your phone in the seat... \n" +
                        "When you turn your head up... you find your self in a live or die moment!! \n" +
                        "A truck is coming in front of you, in your line and you don't have enough time to stop.\n" +
                        "You have two choices: Turn your car to your left (wrong way) or to your right (pedestrian walk).(L / R)? \n");
                answer = input.nextLine();
                answer = answer.toUpperCase();
                if (answer.equals("L")) { // 2-nd answer

                    System.out.print("\nYou turned in your left. \n" +
                            "You hit another car so hard... Because of the big crash, you flied out the window and you are bleeding everywhere, \n" +
                            "and the other driver a man 45 years old is still inside hic car, while his car started burning! \n\n" +
                            "In this story your actually made 4 choices. \n" +
                            "Imagine that you have another chance to change one of your choices. Which one would you change: 1 , 2 , 3 or 4? \n");
                    answer = input.nextLine();
                    answer = answer.toUpperCase();
                    objCh.choice(answer, "L");


                } else if (answer.equals("R")) { // 2-nd answer
                    System.out.print("You turned in your right. You hit an 8 years old boy and he died!! \n" +
                            "You failed!!! \n\n" +
                            "In this story you  actually made 4 choices. \n" +
                            "Imagine that you have another chance to change one of your choices. Which one would you change: 1 , 2 , 3 or 4?\n");
                    answer = input.nextLine();
                    answer = answer.toUpperCase();
                    objCh.choice(answer, "R"); // 3-rd answer
                } else {
                    System.out.print("Please write L or R!\n");
                }


            } else if (answer.equals("N")) { // 1-st answer
                System.out.print("You are driving by 45 m/h instead of 25 m/h.\n" +
                        "Slow down to 25 m/h. (Y/N)?\n");
                answer = input.nextLine();
                answer = answer.toUpperCase();
                if (answer.equals("Y")) {// 2-nd answer
                    System.out.print("\nYou went to your work 30 minutes late.\n" +
                            "Your employer was a little bit worried and angry at you.\n" +
                            "You started working as usually, and nothing bad happened to you because of your good choices. \n" +
                            "Good job!\n");
                } else if (answer.equals("N")) { // 2-nd answer
                    System.out.print("\nThe car in front of you stopped suddenly. You don't have enough time to stop and you hit it so hard.\n" +
                            "Because of the big crash, some glasses hit you in the face and you got blind in your left eye.\n" +
                            "The other driver broke his neck and got paralysed.\n" +
                            "You failed!!! \n\n" +
                            "In this story your actually made 3 choices. \n" +
                            "Imagine that you had another chance to change one of your choices. Which one would you change: 1 , 2 or 3?\n");
                    answer = input.nextLine();
                    answer = answer.toUpperCase();
                    objCh.choice(answer); // 3-rd answer
                } else {
                    System.out.print("Please write Y or N!\n");
                }
            } else {
                System.out.print("Please write Y or N!\n");
            }
            validAnswer = playAgain(validAnswer);

        } while (validAnswer);

    }

    static boolean playAgain(boolean validAnswer){
        System.out.print("PLAY AGAIN (Y/N)?\n");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        answer = answer.toUpperCase();
        if (answer.equals("Y")){
            validAnswer = true;
        }else if (answer.equals("N")){
            validAnswer = false;
        }else {
            System.out.print("Please write Y or N!\n");
        }
        return validAnswer;
    }
}
