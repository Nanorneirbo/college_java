  public String newmove(int from, int to, boolean before) {

        String temp = sheets[from];
        if (from == to) {
            System.out.println("Sheets cannot be moved as same values were entered");
            return null;
        }
        else if(from < to) {
            int i;
            for (i = from; i < to; i++) {
                sheets[i] = sheets[i + 1];
            }
            if(before == true){
                sheets[to-1] = temp;
            }
            else{
                sheets[to] = temp;
            }
        }
		else {
                int j;
                for (j = from; j > to; j--) {
                        sheets[j] = sheets[j - 1];

                    }
                if(before == true){
                 sheets[to] = temp;
            }
                else{
                    sheets[to+1] = temp;
            }
                }

            return temp;
        }
		
		
		public int newmove(String from, String to, boolean before) {
        int indexOfFrom = indexOf(from);
        int indexOfTo = indexOf(to);
		
		
        String temp = from;
        if (indexOfFrom == to) {
            System.out.println("Sheets cannot be moved as same values were entered");
            return null;
        }
        else if(indexOfFrom < to) {
            int i;
            for (i = indexOfFrom; i < to; i++) {
                sheets[i] = sheets[i + 1];
            }
            if(before == true){
                sheets[indexOfTo-1] = temp;
            }
            else{
                sheets[indexOfTo] = temp;
            }
        }
		else {
                int j;
                for (j = indexOfFrom; j > indexOfTo; j--) {
                        sheets[j] = sheets[j - 1];

                    }
                if(before == true){
                 sheets[indexOfTo] = temp;
            }
                else{
                    sheets[indexOfTo+1] = temp;
            }
                }

            return indexOfFrom;
        }