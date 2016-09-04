
package nyc.c4q;

/**
 * Created by nesadakoca on 9/3/16.
 */


public class Change {


    Change(){

    }




    void choice(String _input, String direction){


        switch (_input){
            case "1":
                System.out.println("\nYou decided to slow down your speed car instead of driving faster than is allowed. \n" +
                        "Good choice, definitely you should slow down.  \n" +
                        "But still you didn't do the best choice. Your need to read driver license manual more carefully and pay attention to the rules.");
                break;
            case "2":
                System.out.println("\nYou decided that you should woke up early instead of running late. \n" +
                        "Bad choice, that's not the main reason why you ended up like this. Think harder.");
                break;
            case "3":
                System.out.println("\nYour decided to not picking up your phone, instead of looking down for it. \n" +
                        "Excellent choice. Absolutely you shouldn't use the phone while you driving. ");
                break;
            case "4":
                if (direction.equals("L")) {
                    System.out.println("\nYou decided to turn into your right instead of turning left. \n" +
                            "You hit an 8 years old boy and he died!! \n" +
                            "Your should think harder to find out your mistakes.");
                }else if (direction.equals("R")){
                    System.out.println("\nYou decided to turn into your left instead of turning right. \n" +
                            "You hit another car so hard... Because of the big crash, you flied out the window and you are bleeding everywhere, \n" +
                            "and the other driver a man 45 years old is still inside hic car, while his car started burning!\n" +
                            "Your should think harder to find out your mistakes.");
                }
                break;
            default:
                System.out.println("\nPlease choose one number from 1 to 4!");
                break;
        }

    }



    void choice(String _input){


        switch (_input){
            case "1":
                System.out.println("\nYou decided that you should woke up early instead of running late. \n" +
                        "Bad choice, that's not the main reason why you ended up like this. Think harder.");


                break;
            case "2":
                System.out.println("\nYou decided to pick up your phone, instead of not looking down for it. \n" +
                        "You put your head down for 2 seconds looking for your phone in the seat..." +
                        "When you turn your head up... you find your self in a live or die moment!! \n" +
                        "The car in front of you stop suddenly. You don't have enough time to stop and you hit it so hard." +
                        "Because of the big crash, some glasses hit in the face and you got blind in your left eye.\n" +
                        "The other driver broke his neck and got paralysed.\n" +
                        "You failed again!!! ");

                break;
            case "3":
                System.out.println("\nYou decided to slow down your speed car instead of driving faster that is allowed. \n" +
                        "Good choice, definitely you should slow down.  \n\n");

                break;

            default:
                System.out.println("\nPlease choose one number from 1 to 3!");
                break;
        }

    }




}
