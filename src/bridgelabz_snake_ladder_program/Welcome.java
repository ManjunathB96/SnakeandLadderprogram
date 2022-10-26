package bridgelabz_snake_ladder_program;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game...!");

        int startPosition = 0;
        int dieRolls= (int) ((Math.random() * 10) %6 + 1);
        System.out.println("Start Position is : "+startPosition);
        System.out.println("The Number of Die Rolls is : "+dieRolls);

        double checkForOption= ((Math.random() *10) %3 +1);

        switch ((int) checkForOption){
            case 1:
                System.out.println("Stay in Same Position");

            case 2:
                System.out.println("you got ladder : move ahead as per Die number");
                startPosition=startPosition+dieRolls;
                System.out.println(startPosition);

            case 3:
                System.out.println("got Snake : move behind as per Die Number");
                startPosition = startPosition+dieRolls;
                System.out.println(startPosition);
            default:
                System.out.println("No choice Stay In Same position");
        }
        for (int i =0; i<=100; i++){
            if (startPosition == 0){
                System.out.println("Player Start From beginning");
            }
            System.out.println("Continue to play");
        }

    }
}
