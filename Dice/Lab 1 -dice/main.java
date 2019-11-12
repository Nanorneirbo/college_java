



public class Main {

    public static void main(String[] args) {
	// write your code here
        dice dice1 = new dice();
        int roll1;
        int roll2;
        int rollNo=1;


        roll1 = dice1.roll();
        roll2 = dice1.roll();
        System.out.println("Roll # : " + rollNo);
        System.out.println("The 1st roll is " + roll1);
        System.out.println("The 2nd roll is " + roll2);
        rollNo += 1;

        while (roll1 != roll2){
            roll1 = dice1.roll();
            roll2 = dice1.roll();
            System.out.println("Roll # : " + rollNo);
            System.out.println("The 1st roll is " + roll1);
            System.out.println("The 2nd roll is " + roll2);
            rollNo += 1;
        }

        System.out.println("You are a winner both dice are " + roll1);

    //stretch goal
        int[] arr;
        boolean[] rolledA;

        int k = 0;
        arr = new int[500];
        rolledA = new boolean[6];

        int i;
        int x=0;
        int j;
        boolean winner = false;
         //for (i = 0; i < 6; i++){
          //  rolledA[i] = false;
         //}
        /*rolledA[0] = false;
        rolledA[1] = false;
        rolledA[2] = false;
        rolledA[3] = false;
        rolledA[4] = false;
        rolledA[5] = false;*/

        for (j = 1; j < 6; j++) {
            rolledA[j] = false;
            System.out.println("Starting value: " + j + " : " + rolledA[j - 1]);
        }

        while(!winner){
             for (i = x; i <= k; i++) { //had top init x so it wouldn't redo everytime - probably a silly workaround!
                arr[i] = dice1.roll();
                for (j = 1; j < 7; j++) {
                    if (arr[i] == j) {
                        rolledA[j - 1] = true;
                        //System.out.println(j + " : " + rolledA[j - 1]);
                    }
                }
                System.out.println(" Roll # " + (i+1) + " : " + arr[i]);
            }
            //for (j = 1; j < 7; j++) {
              //System.out.println(j + " : " + rolledA[j - 1]);
            //}

            if (rolledA[0] == true && rolledA[1] == true && rolledA[2] == true && rolledA[3] ==true && rolledA[4] == true && rolledA[5] ==true) {
                winner = true;
                System.out.println("you are a winner and it took " + (k+1) + " rolls. " );

            }
            else {
                k++;
                x++;
            }
        }



    }


}




