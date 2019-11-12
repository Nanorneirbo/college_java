public class Wk5LabEx7 {
    public static void main (String[]args){
        int a;
        
        a = (int)(Math.random()*5+1);
        System.out.println("MTS is " + a);
        
        if (a == 1){
            System.out.println("Patient is in need of Immediate care see in 0 minutes");
        }
        else if (a == 2) {
            System.out.println("Patient needs Very Urgent care see within 10 minutes");
        }
        
        else if (a == 3) {
                System.out.println(" Urgent care needed - 60 minutes max");
            }
        else if (a== 4) {
            System.out.println("Patients condition is Standard dont bother your arse for 2 hours");
        }
        else {
            System.out.println(" Screw em they are probably just drunk its non urgent so let em sober up for 4 hours");
        }
    }
}