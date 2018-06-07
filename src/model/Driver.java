package model;

import util.FileIO;

public class Driver {

    public static void main(String[] args) {
        Student lab2[] = new Student[15];
        FileIO fileIO = new FileIO();
        //Populate the student array
        lab2 = fileIO.readFile("filename.txt", lab2);

        //Initialize Statistics Analysis
        Statistics statlab2 = new Statistics();

        //find high, low and average
        for (int i=0;i<5;i++){
            statlab2.calculateStatistics(lab2, i) ;
        }

        //Print the data
        System.out.print("##############LAB 2#############\n");
        for (int i = 0; i< lab2.length;i++){
            //Print Student ID
            lab2[i].printSID();
            lab2[i].printScore();
            System.out.print("\n");
        }

        //Print the statistics
        statlab2.print();
    }


}


