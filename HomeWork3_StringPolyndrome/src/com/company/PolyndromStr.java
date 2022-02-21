package com.company;

public class PolyndromStr {

    private String polyndrom;

    public PolyndromStr() {
    }

    public String getPolyndrom() {
        return polyndrom;
    }

    public void setPolyndrom(String polyndrom) {
        this.polyndrom = polyndrom;
        System.out.println("Test String: " + polyndrom);
    }

    public boolean isPolyndrom(int leftBorder, int rightBorder) {
        while (leftBorder <= rightBorder) {
            if (this.getPolyndrom().charAt(leftBorder) != this.getPolyndrom().charAt(rightBorder)) {
                return false;
            }
            leftBorder++;
            rightBorder--;
        }
        return true;
    }

    public String[] polyndromList() {
        String []arrayOfPolyndrom = new String[this.getPolyndrom().length()];
        int leftBorder, rightBorder;
        int indexPolyndrom = 1;
        boolean equals_flag = false;
        for (leftBorder = 0; leftBorder < this.getPolyndrom().length(); leftBorder++) {
            for (rightBorder = leftBorder + 1; rightBorder < this.getPolyndrom().length(); rightBorder++) {
                if (this.isPolyndrom(leftBorder, rightBorder) == true) {
                    int i;
                    for (i=0; i < indexPolyndrom; i++) {
                        if (this.getPolyndrom().substring(leftBorder, rightBorder+1).contentEquals(arrayOfPolyndrom[i]) == true) {
                            equals_flag = true; //i = indexPolyndrom;
                        }
                    }
                    if (equals_flag == false) {
                        arrayOfPolyndrom[indexPolyndrom] = this.getPolyndrom().substring(leftBorder, rightBorder+1);
                        indexPolyndrom++;
                    }
                } equals_flag = false;
            }
        }
        return arrayOfPolyndrom;
    }

    public void polyndromListDisplay() {
        if (this.polyndromList()[0] == null) System.out.println("No polyndroms in string " + this.getPolyndrom());
        else {
            System.out.println(((this.polyndromList()[1] != null)?"Polyndroms":"Polyndrom") + " in test string:");
            for (int i = 0; i < this.polyndromList().length; i++)
                if (this.polyndromList()[i] != null)
                    System.out.println("        " + this.polyndromList()[i]);
        }
    }

    public String maxPolyndrom() {
        String maxPolyndrom = this.polyndromList()[0];
        if (this.polyndromList()[0]== null) {
            for (int i = 0; i < this.polyndromList().length; i++)
                if (this.polyndromList()[i].length() > maxPolyndrom.length())
                    maxPolyndrom = this.polyndromList()[i];
        }
        return maxPolyndrom;
    }

    public void maxPolyndromDisplay() {
        if (this.polyndromList()[1] != null)
            System.out.println("Polyndrom maximum length: " + this.maxPolyndrom());
    }


    public static void main(String[] args) {
	// write your code here
        System.out.println("Task 3.1");
        PolyndromStr testPolyndrome1 = new PolyndromStr();
        testPolyndrome1.setPolyndrom("12321");
        if (testPolyndrome1.isPolyndrom(0, testPolyndrome1.getPolyndrom().length()-1) == true) {
            System.out.println("It's polyndrome");
        } else System.out.println("It isn't polyndrome");
        //testPolyndrome1.polyndromListDisplay();

        System.out.println();

        System.out.println("Task 3.2");
        PolyndromStr testPolyndrome2 = new PolyndromStr();
        testPolyndrome2.setPolyndrom("12321");
        testPolyndrome2.polyndromListDisplay();
        testPolyndrome2.maxPolyndromDisplay();

        System.out.println();

        System.out.println("Task 3.3");
        PolyndromStr testPolyndrome3 = new PolyndromStr();
        //testPolyndrome3.setPolyndrom("1112233");
        //testPolyndrome3.polyndromListDisplay();


      /*  String asd = new String("546");
        String dsa = new String("654");
        System.out.println(asd.contentEquals(dsa));*/

    }
}



