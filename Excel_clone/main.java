
public class Main {

    public static void main(String[] args) {

        Workbook workbook1 = new Workbook(256);

        //workbook1.addFirst("nano");
        //workbook1.addFirst("nano");
        //workbook1.addFirst("15");
        //workbook1.addFirst("should be first");
        //workbook1.addToEnd("shud be last");

        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        workbook1.add();
        //System.out.println(" Current length of workbook is: " + workbook1.length());
        //workbook1.display();
       //workbook1.remove("Sheet4");
       //workbook1.remove("Sheet8");
        //workbook1.remove(9);
        //workbook1.remove(0);
        //workbook1.remove(0);
        //workbook1.remove(0);
        //workbook1.remove(0);
       // workbook1.remove("Sheet7");
        //workbook1.move(0,12, false);
        //workbook1.moveToEnd("Sheet11");
        //System.out.println(workbook1.remove(2) + " Removed");
        workbook1.remove("Sheet4");
    workbook1.remove(0);
        //workbook1.rename("Sheet1", "Sheet3");

        //System.out.println( "the sheetname at index " + workbook1.sheetName(0));
        // System.out.println("Sheet you required is at index ; " + workbook1.indexOf("ShEet8"));


        //System.out.println("The sheet you are searching for is at position : " + workbook1.index("Sheet6"));


        workbook1.display();

        //workbook1.seeWholeArray();



    }
}
