package TennisGame;

import java.util.ArrayList;

public class TennisGame2 implements TennisGame
{
    public int pointP1 = 0;
    public int pointP2 = 0;
    
    public String resP1 = "";
    public String resP2 = "";
    
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";


    public TennisGame2(String player1Name, String player2Name) {
    }

    public String getScore(){
        String score = "";
        if (pointP1 == pointP2 )
        {
            if (pointP1 ==0)
                score = "Love";
            if (pointP1 ==1)
                score = FIFTEEN;
            if (pointP1 ==2)
                score = THIRTY;
            score += "-All";
            if (pointP1 >=3)
                score = "Deuce";
        }

        
        if (pointP1 > 0 && pointP2 ==0)
        {
            if (pointP1 ==1)
                resP1 = FIFTEEN;
            if (pointP1 ==2)
                resP1 = THIRTY;
            if (pointP1 ==3)
                resP1 = FORTY;
            
            resP2 = "Love";
            score = resP1 + "-" + resP2;
        }
        if (pointP2 > 0 && pointP1 ==0)
        {
            if (pointP2 ==1)
                resP2 = FIFTEEN;
            if (pointP2 ==2)
                resP2 = THIRTY;
            if (pointP2 ==3)
                resP2 = FORTY;
            
            resP1 = "Love";
            score = resP1 + "-" + resP2;
        }
        
        if (pointP1 > pointP2  )
        {
            if (pointP1 ==2)
                resP1 =THIRTY;
            if (pointP1 ==3)
                resP1 =FORTY;
            if (pointP2 ==1)
                resP2 =FIFTEEN;
            if (pointP2 ==2)
                resP2 =THIRTY;
            score = resP1 + "-" + resP2;
            if (pointP2 >= 3)
                score = "Advantage player1";

        }
        if (pointP2 > pointP1 )
        {
            if (pointP2 ==2)
                resP2 =THIRTY;
            if (pointP2 ==3)
                resP2 =FORTY;
            if (pointP1 ==1)
                resP1 =FIFTEEN;
            if (pointP1 ==2)
                resP1 =THIRTY;
            score = resP1 + "-" + resP2;
            if (pointP1 >= 3)
                score = "Advantage player2";

        }

        if (pointP1 >=4  && (pointP1 - pointP2)>=2)
        {
            score = "Win for player1";
        }
        if (pointP2 >=4 && (pointP2 - pointP1)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    
    public void setPlayer1(int number){
        
        for (int i = 0; i < number; i++)
        {
            incrementPlayer1();
        }
            
    }
    
    public void setPlayer2(int number){
        
        for (int i = 0; i < number; i++)
        {
            incrementPlayer2();
        }
            
    }
    
    public void incrementPlayer1(){
        pointP1++;
    }
    
    public void incrementPlayer2(){
        pointP2++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            incrementPlayer1();
        else
            incrementPlayer2();
    }
}