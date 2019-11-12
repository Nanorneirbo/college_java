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

        workbook1.rename("sheet8", "Ronan is Gr8");
        workbook1.rename("Ronan is Gr8", "Seriously soo great!");
    workbook1.display();
        //workbook1.remove("Sheet4");
    //workbook1.remove(0);
        //workbook1.rename("Sheet1", "Sheet3");

        //System.out.println( "the sheetname at index " + workbook1.sheetName(0));
        // System.out.println("Sheet you required is at index ; " + workbook1.indexOf("ShEet8"));


        //System.out.println("The sheet you are searching for is at position : " + workbook1.index("Sheet6"));


      //  workbook1.display();

        //workbook1.seeWholeArray();



    }
-------------------------------------------------------------------------------------


public class Workbook {
    private String[] sheets;
    private int nextPosition;
    private int count;

    public Workbook() {
        sheets = new String[5];
        nextPosition = 0;
        count = 0;
    }

    public Workbook(int capacity) {
        sheets = new String[capacity];
        nextPosition = 0;
        count = 0;
    }

    public boolean addFirst(String sheet) {

        if (nextPosition < sheets.length) {
            for (int i = nextPosition; i >= 0; i--) {
                sheets[i + 1] = sheets[i];
            }
            sheets[0] = new String(sheet);
            nextPosition++;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public boolean addToEnd(String sheet) {
        if (nextPosition < sheets.length) {
            sheets[nextPosition] = new String(sheet);
            count++;
            return true;
        } else {
            return false;
        }
    }

    public boolean add() {
        if (nextPosition < sheets.length) {
            sheets[nextPosition] = "Sheet" + (count + 1);
            nextPosition++;
            count++;
            return true;
        } else {
            System.out.println("Workbook is full cannot add any more sheets");
            return false;
        }
    }

    public void seeWholeArray() {
        int i;
        for (i = 0; i < sheets.length; i++) {
            System.out.println("Array position :" + i + " has value : " + sheets[i]);
        }
    }

    public void display() {
        int i;
        for (i = 0; i < nextPosition; i++) {
            System.out.println(sheets[i]);
        }
    }

    public int indexOf(String searchWord) {
        for (int i = 0; i < nextPosition; i++) {
            if (sheets[i].compareToIgnoreCase(searchWord) == 0) {
                return i;
            }

        }
        return -1;
    }


    public int remove(String sheetName) {
        if (sheets[1] == null) {
            System.out.println("Cannot delete last sheet (String one)");
            return -1;
        }

        int i = indexOf(sheetName);
        if (i == -1) {
            System.out.println("Cannot delete " + sheetName + " because it does not exist.");
            return -1;
        } else {
            sheets[i] = null;
            int j; // this is the shuffle to fill gaps
            for (j = i; j < sheets.length - 1; j++) {
                sheets[j] = sheets[j + 1];
            }
            nextPosition--;
            return i;
        }
    }

    public String remove(int indexPosition) {
        String nameOfSheet = sheets[indexPosition];
        if (sheets[1] == null) {                    // if second position is null and the shuffle is working properly then there is only 1 sheet in the workbook
            System.out.println("Cannot delete last sheet ( integer one)");
            return nameOfSheet + "Not Deleted";
        }
        sheets[indexPosition] = null;
        int j;
        for (j = indexPosition; j < sheets.length - 1; j++) {
            sheets[j] = sheets[j + 1];
        }
        nextPosition--;
        return nameOfSheet;
    }

// String move

    public int move(String from, String to, boolean before) {
        int x = indexOf(from);
        int y = indexOf(to);
        if (x == y) {
            System.out.println("Sheets cannot be moved as same values were entered");
            return -1;
        } else if (x == -1 || y == -1) {
            System.out.println("one of the values you entered was not in Workbook");
            return -1;
        } else {
            if (before == true) {
                //System.out.println("x is " + x);
                //System.out.println("y is "+ y);
                int i = x;// declare two new variables so as to keep original values
                int j = y;
                for (i = x; i < sheets.length - 1; i++) {  //SHUFFLE IT FORWARD to remove the from
                    sheets[i] = sheets[i + 1];
                }
                for (j = sheets.length - 2; j >= y - 1; j--) {
                    sheets[j + 1] = sheets[j];               //shuffle the other direction ( -2 not -1 length since value missing from string)
                }
                if (x < y) {
                    sheets[y - 1] = from;
                }
                if (y < x) {
                    sheets[y] = from;
                }
            }
            if (before == false) {
                int i = x;
                int j = y;

                for (i = x; i < sheets.length - 1; i++) {
                    sheets[i] = sheets[i + 1];
                }

                for (j = sheets.length - 2; j >= y; j--) { //not (y-1) since when it goes this direction it is not losing one of the positions ahead of it
                    sheets[j + 1] = sheets[j];
                }
                if (x < y) {
                    sheets[y] = from;
                }
                if (y < x) {
                    sheets[y + 1] = from;
                }
            }
        }
        return y;
    }
    //integer move

    public String move(int from, int to, boolean before) {
        int x = from;
        int y = to;
        String original = sheets[from];
        if (x == y) {
            System.out.println("Sheets cannot be moved as same values were entered");
            return null;
        } else if (x == -1 || y == -1) {
            System.out.println("one of the values you entered was not in Workbook");
            return null;
        } else {
            if (before == true) {
                //System.out.println("x is " + x);
                //System.out.println("y is "+ y);
                int i = x;// declare two new variables so as to keep original values
                int j = y;
                for (i = x; i < sheets.length - 1; i++) {  //SHUFFLE IT FORWARD to remove the from
                    sheets[i] = sheets[i + 1];
                }
                for (j = sheets.length - 2; j >= y - 1; j--) {
                    sheets[j + 1] = sheets[j];               //shuffle the other direction ( -2 not -1 length since value missing from string)
                }
                if (x < y) {
                    sheets[y - 1] = original;
                }
                if (y < x) {
                    sheets[y] = original;
                }
            }
            if (before == false) {
                int i = x;
                int j = y;

                for (i = x; i < length() - 1; i++) {
                    sheets[i] = sheets[i + 1];
                }

                for (j = sheets.length - 2; j >= y; j--) {
                    sheets[j + 1] = sheets[j];
                }
                if (x < y) {
                    sheets[y] = original;
                }
                if (y < x) {
                    sheets[y + 1] = original;
                }
            }
        }
        return original;
    }

    public int moveToEnd(String from) {
        int i = indexOf(from);
        String temp = from;
        if (i == -1) {
            System.out.println(from + " : No such sheet name");
        } else {
            int j; // this is the shuffle to fill gaps
            for (j = i; j < length() - 1; j++) {
                sheets[j] = sheets[j + 1];
            }
            sheets[length() - 1] = temp;
        }

        return i;
    }


    public String moveToEnd(int from) {

        int i = from;
        String temp = sheets[from];
        int j; // this is the shuffle to fill gaps
        for (j = i; j < length(); j++) {
            sheets[j] = sheets[j + 1];
        }
        sheets[length()] = temp;
        return sheets[i];
    }


    public int length() {
        int count = 0;
        for (int i = 0; sheets[i] != null; i++) {
            count++;
        }
        return count;
    }


    public int rename(String currentName, String newName) {
        int i = indexOf(newName);
        int j = indexOf(currentName);
        if (specialChars(newName) ==true) {
            return -1;
        }
        if (i != -1) {
            System.out.println(newName + " : is already in List");
            return -1;
        } else if (j == -1) {
            System.out.println(currentName + " : not currently in the list");
            return -1;
        } else {
            sheets[j] = newName;
            return j;
        }
    }

    public int index(String SheetName) {
        int i = indexOf(SheetName);
        if (i == -1) {
            System.out.println("Sheet not Found");
            return -1;
        } else {
            return i;
        }
    }

    public String sheetName(int index) {
        if (0 <= index && index <= length()) {
            return sheets[index];
        } else
            return null;

    }

  /*  public boolean specialChars(String s) {
        String text = s.toUpperCase();
        System.out.println(s);
        int i;
        String allowedChars "ABCDEFGHIJKLMNOP0123456789";
        boolean specialChars = false;
        System.out.println(specialChars);
        for (i = 0; i < text.length(); i++) {
            if (('A' > text.charAt(i) && text.charAt(i) < 'Z')) //&& ('0' > text.charAt(i) && text.charAt(i) < '9'))
             {
                specialChars = true;
                 System.out.println(text.length());
                 System.out.println(specialChars);
            }
        }

            if (specialChars) {
                System.out.println("There are special characters please try again with letters and number only");
            } else {
                System.out.println(s + " is  an acceptable sheet name - sheet renamed.");
            }
            return specialChars;
        }
*/
  public boolean specialChars(String s) {
      //String text = s.toUpperCase();
      //System.out.println(s);
      int i;
      String allowedChars = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      boolean specialChars = false;
      //System.out.println(specialChars);
      for (i = 0; i < s.length(); i++) {
          if (allowedChars.indexOf(s.charAt(i)) == -1){
              specialChars = true;
              //System.out.println((allowedChars.indexOf(s.charAt(i))));
          }

      }

      if (specialChars) {
          System.out.println(s + "contains special characters please try again with letters and number only");
      } else {
          System.out.println(s + " is  an acceptable sheet name - sheet renamed.");
      }
      return specialChars;
  }



}
