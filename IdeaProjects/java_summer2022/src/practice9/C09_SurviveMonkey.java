package practice9;

public class C09_SurviveMonkey {
    public static void main(String[] args) {
         /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/

        int numberOfBananas = 165, survivalDays = 0;
        boolean monkeyAlive = true;
        int leftbananas = 0;
        do {
            for (int i = numberOfBananas; i >= 4; i -= 4) {
                if (numberOfBananas % 4 != 0) {
                    leftbananas=numberOfBananas%4;
                }
                survivalDays++;
            }
            System.out.println("survival days:" + survivalDays);
            System.out.println("Left bananas last day: "+ leftbananas);

        } while (!monkeyAlive);

    }
}
