package model;

import util.FileIO;

public class Driver {

    public static void main(String[] args) {
        Student lab2[] = new Student[40];
        FileIO fileIO = new FileIO();
        //Populate the student array
        lab2 = fileIO.readFile("filename.txt", lab2);

        //Initialize Statistics Analysis
        Statistics statlab2 = new Statistics();

        //find high, low and average
        statlab2.calculateStatistics(lab2);

        //Print the data
        System.out.print("##############LAB 2#############\n");
        for (int i = 0; i < lab2.length; i++) {
            if (lab2[i] == null) continue;
            //Print Student ID
            lab2[i].printSID();
            lab2[i].printScore();
            System.out.print("\n");
        }

        //Print the statistics
        statlab2.print();
    }


}


