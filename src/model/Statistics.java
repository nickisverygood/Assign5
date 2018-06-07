package model;

class Statistics

{
    int lab;
    private int[] lowscores = new int[5];
    private int[] highscores = new int[5];
    private float[] avgscores = new float[5];
    private boolean[] statisticsCheckList = {false,false,false}; //status of {lowest, highest, avg} being calculated

    public int findlow(Student[] a, int lab) {
        /* This method will find the lowest score and store it in an array names lowscores. */
        int min = a[0].getScores()[lab];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i].getScores()[lab]) {
                min = a[i].getScores()[lab];
            }
            lowscores[lab] = min;
        }
        statisticsCheckList[0] = true;
        return lowscores[lab];
    }

    public int findhigh(Student[] a, int lab) {
        /* This method will find the highest score and store it in an array names highscores. */
        int max = a[0].getScores()[lab];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i].getScores()[lab]) {
                max = a[i].getScores()[lab];
            }
            highscores[lab] = max;
        }
        statisticsCheckList[1] = true;
        return highscores[lab];

    }

    public void calculateStatistics(Student[] a, int lab){
        this.lab = lab;
        findlow( a, lab);
        findhigh( a, lab);
        findavg( a, lab);
    }
    float findavg(Student[] a, int lab) {
        /* This method will find avg score for each quiz and store it in an array names avgscores. */
        int total = 0;
        for (int i = 1; i < a.length; i++) {
            total += a[i].getScores()[lab];
        }
        avgscores[lab] = total / a.length;
        statisticsCheckList[2] = true;
        return avgscores[lab];
    }
    public void print(){
        if(operatorANDtoArray(statisticsCheckList)){
            for(int i=0;i<lowscores.length;i++){
                System.out.print("<Quiz"+String.valueOf(i+1)+" Statistics>\n");
                System.out.print("Highest Score: "+highscores[i]+"\n");
                System.out.print("Lowest Score: "+lowscores[i]+"\n");
                System.out.print("Average Score: "+avgscores[i]+"\n\n");
            }

        }else{
            System.out.print("Sorry, there is no statistics availible now\n");
        }

    }
    private boolean operatorANDtoArray(boolean[] toapplyAND){
        boolean toReturn = toapplyAND[0];
        if(toapplyAND.length>1){
            for(int i=1;i<toapplyAND.length;i++){
                toReturn = toReturn&&toapplyAND[i];
            }
        }

        return toReturn;

    }
}