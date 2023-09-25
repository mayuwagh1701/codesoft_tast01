import java.util.Scanner;

class GenRadonNum {
    public int genrateNum(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenRadonNum rg = new GenRadonNum();
        int totalAttempts = 0;
        int win = 0;

        while (true) {
            System.out.println(" Please Enter The Minimum  Number:");
            int min = sc.nextInt();
            System.out.println("Please Enter The Maximum Number:");
            int max = sc.nextInt();

            int cnum = rg.genrateNum(min, max);
            int attemps = 0;
            
            while(true){
                System.out.println("Please Guess a Number between " + min+ " and "+ max);
            int gnum =sc.nextInt();
            attemps++;

                if(gnum > cnum){
                    System.out.println("Your guess is too high number.");
                }else if(gnum < cnum){
                    System.out.println("Your guess is too low number.");
                }else{
                    System.out.println("Congratulations! You guessed the correct Number.");
                    win++;
                    break;
                }
            }
            totalAttempts += attemps;
            System.out.println("Attemps= "+attemps);
            System.out.println("Wins= "+win);

            double winrate = (double) win/ totalAttempts * 100;
            System.out.printf("Your winrate is %.2f%%\n",winrate);

            System.out.println("Do You want to play again: (yes/no)");
            String playAgain = sc.next();
            if(!playAgain.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(attemps);
            }
            sc.nextLine();
        }
    }
}


