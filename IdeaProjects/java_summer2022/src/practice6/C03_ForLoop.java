package practice6;

public class C03_ForLoop {
    public static void main(String[] args) {
        /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
        int row = 3;
        int column = 5;
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=column ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
