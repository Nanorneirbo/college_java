public class Main {


	    // Add the code to traverse the array from beginning to end. Display, count, calculate the sum of,
        // and calculate the average of the EVEN numbers. Note the average should be displayed with two decimal
        //places (use printf!). Be careful because if there are no even numbers your program will crash if you try to calculate the average.


            public static void main(String[] args) {
                int i;
                int[] data = new int[10]; // create array CAPABLE of storing 10 ints

                for(i=0; i < data.length; i++) {
                    data[i] = (int)(Math.random()*5000+1);
                }

                int j;
                float sum =0;
                float count =0;
                float average;
                for(j=0; j < data.length; j++){
                    if(data[j]%2==0)
                    {
                        System.out.println(data[j]);
                        count++;
                        sum += data[j];
                    }
                }
                if(sum > 0) {
                    average = sum / count;
                }
                else
                {
                    average = 0;

                }
                System.out.println("Sum of the numbers: " + sum);
                System.out.println("There were " + count + " numbers");
                System.out.printf("Average is; %.3f", average);
            }
        }
		
		public class Main {



    //Add the code to traverse the array from the approximate mid-point (i.e. data.length/2) to the end. Display the values on the screen.

    public static void main(String[] args) {
                int i;
                int[] data = new int[10]; // create array CAPABLE of storing 10 ints

                for(i=0; i < data.length; i++) {
                    data[i] = (int)(Math.random()*5000+1);
                }

                int j;
                for(j=data.length/2; j<data.length; j++){
                    System.out.println("position " +  j +": " + data[j]);
                }
    }
        }
		
		   //Add the code to traverse the array from the approximate mid-point (i.e. data.length/2) to the beginning. Display the values on the screen.
    public static void main(String[] args) {
                int i;
                int[] data = new int[10]; // create array CAPABLE of storing 10 ints

                for(i=0; i < data.length; i++) {
                    data[i] = (int)(Math.random()*5000+1);
                }

                int j;
                for(j=data.length/2; j>0; j--){
                    System.out.println("position " +  j +": " + data[j]);
                }
    }
        }
