package Score;

public class Tester {
    public static void main(String[] args) {

        Score[] Score = new Score[5];
        Score[0] = new Score1();
        Score[1] = new Score2();
        Score[2] = new Score3();
        Score[3] = new Score4();
        Score[4] = new Score5();
        //System.out.println(Score[0].name);

        Score score = new Score8();
        int avg = score.average();
        System.out.println(avg);
        String grading = " ";
        switch(avg/10) {
            case 10:
                grading = "A";
                break;
            case 9:
                grading = "A";
                break;
            case 8:
                grading = "B";
                break;
            case 7:
                grading = "C";
                break;
            case 6:
                grading = "D";
                break;
            default:
                grading = "F";
                break;

        }
        System.out.println(grading);
        score.print();


    }
}
