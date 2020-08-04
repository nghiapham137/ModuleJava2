public class TennisGame {
    public static final int ZERO_POINT = 0;
    public static final int ONE_POINT = 1;
    public static final int TWO_POINT = 2;
    public static final int THREE_POINT = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore=0;
        if (player1Score==player2Score)
        {
            score = getString(player1Score);
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            score = getString(player1Score, player2Score);
        }
        else
        {
            score = getString(player1Score, player2Score, score);
        }
        return score;
    }

//    @org.jetbrains.annotations.NotNull
    private static String getString(int player1Score, int player2Score, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = player1Score;
            else { score +="-"; tempScore = player2Score;}
            switch(tempScore)
            {
                case ZERO_POINT:
                    score +="Love";
                    break;
                case ONE_POINT:
                    score +="Fifteen";
                    break;
                case TWO_POINT:
                    score +="Thirty";
                    break;
                case THREE_POINT:
                    score +="Forty";
                    break;
            }
        }
        return score;
    }

    //    @org.jetbrains.annotations.NotNull
    private static String getString(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    //    @org.jetbrains.annotations.NotNull
    private static String getString(int player1Score) {
        String score;
        switch (player1Score)
        {
            case ZERO_POINT:
                score = "Love-All";
                break;
            case ONE_POINT:
                score = "Fifteen-All";
                break;
            case TWO_POINT:
                score = "Thirty-All";
                break;
            case THREE_POINT:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}