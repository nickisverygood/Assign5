package model;

public class Student {
    //Declare Student's Data
    private int SID;
    private int scores[] = new int[5];

    //Getter for Student ID
    public int getSID() {
        return this.SID;
    }

    //Setter for Student ID
    public void setSID(int id) {
        this.SID = id;
    }

    //Getter for Student Score
    public int[] getScores() {
        return this.scores;
    }

    //Setter for Student Score
    public void setScores(int[] s) {
        this.scores = s;
    }

    //Print SID
    public void printSID() {
        System.out.print("Student ID: " + getSID() + "\n");

    }


    //Print Student's Scores
    public void printScore() {
        System.out.print("Student Scores:\n");
        for (int i = 0; i < getScores().length; i++) {
            System.out.print("Quiz " + (i + 1) + ": " + getScores()[i] + "\n");
        }

    }
}
