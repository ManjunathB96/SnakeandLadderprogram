package bridgelabz_snake_ladder_program;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game...!");

        int startPosition = 0;
        int dieRolls= (int) ((Math.random() * 10) %6 + 1);
        System.out.println("Start Position is : "+startPosition);
        System.out.println("The Number of Die Rolls is : "+dieRolls);
    }
}
