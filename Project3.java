import java.awt.*;

public class Project3{
   
   public static final int PANEL_WIDTH = 500;
   public static final int PANEL_HEIGHT = 400;
   public static final int SLEEP_TIME = 50;
   public static final int BALL_SIZE = 10;
   public static final int INITIAL_BALL_VELOCITY_X = 3;
   public static final int INITIAL_BALL_VELOCITY_Y = 1;
   public static final int PADDLE_LENGTH = 50;
   public static final int PADDLE_X = PANEL_WIDTH - 40;
   public static final Color BALL_COLOR = Color.RED;
   public static final Color BACKGROUND_COLOR = Color.WHITE;
   public static final Color PADDLE_COLOR = Color.BLACK;
   public static final int UP_ARROW = 38;
   public static final int DOWN_ARROW = 40;
   public static final int KEY_SPACE = ' ';
   public static final int PADDLE_MOVE_AMOUNT = 5;
   public static final int MAX_COMPUTER_PADDLE_MOVE = 2;
   public static final int COMPUTER_SCORE_X = 100;
   public static final int USER_SCORE_X = 250;
   public static final int SCORES_Y = 40;
   public static final Color SCORES_COLOR = Color.RED;
   public static final int SCORES_FONT_SIZE = 30;
   public static final int SCORE_MAX = 5;
   public static int ballX;
   public static int ballY;
   public static int ballVelocityX;
   public static int ballVelocityY;
   public static int paddleY;
   public static int computerPaddleY;
   public static Font normalFont;
   public static Font scoreFont;
   public static int compScore = 0;
   public static int userScore = 0;
   
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(PANEL_WIDTH, PANEL_HEIGHT);
      Graphics g = panel.getGraphics( );
      g.drawString("Project 3 by Diego Romero",10,15);
      ballX = PANEL_WIDTH/2;
      ballY = PANEL_HEIGHT/2;
      ballVelocityX = 0;
      ballVelocityY = 0;
      normalFont = g.getFont();
      scoreFont = new Font(normalFont.getName(),normalFont.getStyle(),SCORES_FONT_SIZE);
      drawScore(g, SCORES_COLOR);
      computerPaddleY = PANEL_HEIGHT/2 - PADDLE_LENGTH/2;
      paddleY = PANEL_HEIGHT/2 - PADDLE_LENGTH/2;
      drawBall(g,BALL_COLOR);
      drawPaddle(g,PADDLE_COLOR);
      drawComputerPaddle(g, PADDLE_COLOR);
      startGame(panel, g);
   }
   
   public static void startGame(DrawingPanel panel, Graphics g) {
      while(true) {
        handleKeys(panel,g);
        moveBall(g);
        moveComputerPaddle(g);
        detectHit();
        drawPaddle(g, PADDLE_COLOR);
        panel.sleep(SLEEP_TIME);
      }
   }
   
   public static void drawBall(Graphics g, Color c) {
      g.setColor(c);
      g.fillOval(ballX-BALL_SIZE/2,ballY-BALL_SIZE/2,BALL_SIZE,BALL_SIZE);
   }
   
   public static void moveBall(Graphics g) {
      drawBall(g,BACKGROUND_COLOR);
      ballX += ballVelocityX;
      ballY += ballVelocityY;
      if (ballX >= PANEL_WIDTH) {
         resetBall(g);
         compScore ++;
         addToComputerScore(g);
      }
      if(ballX <= 0){
        resetBall(g);
        userScore ++;
        addToUserScore(g);
      }
      drawBall(g,BALL_COLOR);
   }
   
   public static void drawPaddle(Graphics g, Color c) {
      g.setColor(c);
      g.drawLine(PADDLE_X,paddleY,PADDLE_X,paddleY+PADDLE_LENGTH);
   }
   
   public static void handleKeys(DrawingPanel panel, Graphics g) {
      int keyCode = panel.getKeyCode();
      if (keyCode == UP_ARROW)
         movePaddle(g,-PADDLE_MOVE_AMOUNT);
      else if (keyCode == DOWN_ARROW)
         movePaddle(g,PADDLE_MOVE_AMOUNT);
      else if (keyCode == KEY_SPACE)
         resetBall(g);
   }
   
   public static void movePaddle(Graphics g, int amount) {
      drawPaddle(g, BACKGROUND_COLOR);
      paddleY += amount;
      if (paddleY < 0)
         paddleY = 0;
      if (paddleY + PADDLE_LENGTH > PANEL_HEIGHT)
         paddleY = PANEL_HEIGHT - PADDLE_LENGTH;
      drawPaddle(g,PADDLE_COLOR);
   }
   
   public static void detectHit() {
      if ((ballVelocityX > 0) &&
          (ballY + BALL_SIZE/2 >= paddleY) &&
          (ballY - BALL_SIZE/2 <= paddleY + PADDLE_LENGTH) &&
          (ballX + BALL_SIZE/2 >= PADDLE_X) &&
          (ballX - BALL_SIZE/2 <= PADDLE_X))
         ballVelocityX = -ballVelocityX;
      if ((ballVelocityY < 0) && 
          (ballY - BALL_SIZE/2 <= 0))
         ballVelocityY = -ballVelocityY;
      else if ((ballVelocityY >0) &&
               (ballY + BALL_SIZE/2 >= PANEL_HEIGHT))
         ballVelocityY = -ballVelocityY;
      if((ballVelocityX < 0) && 
         (ballY + BALL_SIZE/2 >= computerPaddleY) && 
         (ballY - BALL_SIZE/2 <= computerPaddleY + PADDLE_LENGTH) &&
         (ballX + BALL_SIZE/2 >= 40) &&
         (ballX - BALL_SIZE/2 <= 40))
        ballVelocityX = INITIAL_BALL_VELOCITY_X;
   }
   
   public static void resetBall(Graphics g) {
      drawBall(g,BACKGROUND_COLOR);
      ballX = PANEL_WIDTH/2;
      ballY = PANEL_HEIGHT/2;
      ballVelocityX = INITIAL_BALL_VELOCITY_X;
      ballVelocityY = INITIAL_BALL_VELOCITY_Y;
   }
   public static void drawComputerPaddle(Graphics g, Color c){
    g.setColor(c);
    g.drawLine(40, computerPaddleY, 40, computerPaddleY +PADDLE_LENGTH);
   }
   public static void moveComputerPaddle(Graphics g){
     drawComputerPaddle(g, BACKGROUND_COLOR);
     int normal = computerPaddleY;
     int bottomPaddle = computerPaddleY + PADDLE_LENGTH;
     int distanceOfBall = ballY;
     int distanceOfPaddle = (bottomPaddle + computerPaddleY) /2;
     int distance = distanceOfPaddle - distanceOfBall;
     if(distance == 0){
       computerPaddleY = normal;
     }else if(distance <= MAX_COMPUTER_PADDLE_MOVE){
       computerPaddleY += MAX_COMPUTER_PADDLE_MOVE;
     }else if(distance >= MAX_COMPUTER_PADDLE_MOVE){
       computerPaddleY -= MAX_COMPUTER_PADDLE_MOVE;
     }
     drawComputerPaddle(g, PADDLE_COLOR);
   }
   public static void drawScore(Graphics g, Color c){
     g.setColor(c);
     String blank = "";
     g.setFont(scoreFont);
     if(compScore == userScore){
       blank = Integer.toString(compScore);
       g.drawString(blank, COMPUTER_SCORE_X, SCORES_Y);
       g.drawString(blank, USER_SCORE_X, SCORES_Y);
     }else if(compScore < userScore){
       blank = Integer.toString(userScore - 1);
       g.setColor(BACKGROUND_COLOR);
       g.drawString(blank, USER_SCORE_X, SCORES_Y);
       
       blank = Integer.toString(userScore);
       g.setColor(c);
       g.drawString(blank, USER_SCORE_X, SCORES_Y);
     }else if(userScore < compScore){
       blank = Integer.toString(compScore - 1);
       g.setColor(BACKGROUND_COLOR);
       g.drawString(blank, COMPUTER_SCORE_X, SCORES_Y);
       
       blank = Integer.toString(compScore);
       g.setColor(c);
       g.drawString(blank, COMPUTER_SCORE_X, SCORES_Y);
     }
     g.setFont(normalFont);
     if(compScore == SCORE_MAX){
     ballVelocityX = 0;
     ballVelocityY = 0;
     g.drawString("You lost", 225, 175);
     compScore = 0;
     userScore = 0;
     }else if(userScore == SCORE_MAX){
       ballVelocityX = 0;
       ballVelocityY = 0;
       g.drawString("You Won", 225, 175);
       compScore = 0;
       userScore = 0;
     }
     
     
   }
   public static void addToComputerScore(Graphics g){
     drawScore(g, BACKGROUND_COLOR);
     drawScore(g,SCORES_COLOR);
   }
   public static void addToUserScore(Graphics g){
     drawScore(g, BACKGROUND_COLOR);
     drawScore(g, SCORES_COLOR);
   }
}