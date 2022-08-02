package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    static final int ScreenWidth = 1300;
    static final int ScreenHeight = 750;
    static final int UnitSize = 50;
    static final int GameUnits = (ScreenWidth * ScreenHeight) / UnitSize;
    static final int delay = 175;

    // cordinates for game
    final int[] x = new int[GameUnits];
    final int[] y = new int[GameUnits];

    //
    int bodyParts = 6;
    int ApplesEaten;
    int AppleX;
    int AppleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new Keyadapter());
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(delay, this);
        timer.start();

    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
         draw(graphics);
}
public void draw(Graphics graphics){
        if (running) {
// create apple
            graphics.setColor(Color.RED);
            graphics.fillOval(AppleX, AppleY, UnitSize, UnitSize);

            // create snake
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {//head of snake
                    graphics.setColor(Color.blue);
                    graphics.fillRect(x[i], y[i], UnitSize, UnitSize);
                } else { //body
                    graphics.setColor(Color.CYAN);
                    graphics.fillRect(x[i], y[i], UnitSize, UnitSize);
                }
            }

            // score board
            graphics.setColor(Color.RED);
            graphics.setFont(new Font("Ink Free",Font.BOLD,40));
            FontMetrics metrics = getFontMetrics(graphics.getFont());
            graphics.drawString("SCORE: "+ApplesEaten,(ScreenWidth-metrics.stringWidth("SCORE: "+ApplesEaten))/2,graphics.getFont().getSize());//
                    }
        else {
            gameOver(graphics);
        }
    }
    public void newApple(){
        AppleX = random.nextInt((int)(ScreenWidth/UnitSize))*UnitSize;
        AppleY = random.nextInt(ScreenHeight/UnitSize)*UnitSize;
    }
    public void move(){
        for (int i = bodyParts; i >0 ; i--) {
            x[i] = x[i-1];
            y[i]=y[i-1];
        }
        switch(direction) {
            case 'U':
                y[0] = y[0] - UnitSize;
                break;

            case 'D':
                y[0] = y[0] + UnitSize;
                break;

            case 'L':
                x[0] = x[0] - UnitSize;
                break;

            case 'R':
                x[0] = x[0] + UnitSize;
                break;
        }
    }

    public void checkApple(){
        if ((x[0]==AppleX)&&(y[0]==AppleY)){
            bodyParts++;
            ApplesEaten++;
            newApple();
        }

    }
    public void checkCollisions(){
        // check if head collides with body
        for (int i = bodyParts; i>0;i--){
            if (x[0] == x[i] && y[0] == y[i]) {
                running = false;
            }}
    //check if head touches left border
            if (x[0]<0){
                running = false;
            }
// right border
            if (x[0]>ScreenWidth){
                running =false;
            }
            //top border
            if (y[0]<0){
                running =false;
            }
            //bottom border
            if (y[0]>ScreenHeight){
                running = false;
            }
            if (!running){
                timer.stop();
            }
}

    public void gameOver(Graphics graphics){
        // gameover display
        graphics.setColor(Color.RED);
        graphics.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics metrics1 = getFontMetrics(graphics.getFont());
        graphics.drawString("GAME OVER",(ScreenWidth-metrics1.stringWidth("GAME OVER"))/2,ScreenHeight/2);// center text display

        // final score
        graphics.setColor(Color.RED);
        graphics.setFont(new Font("Ink Free",Font.BOLD,40));
        FontMetrics metrics2 = getFontMetrics(graphics.getFont());
        graphics.drawString("FINAL SCORE: "+ApplesEaten,(ScreenWidth-metrics2.stringWidth("FINAL SCORE: "+ApplesEaten))/2,graphics.getFont().getSize());//

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (running){
                move();
                checkApple();
                checkCollisions();
            }
            repaint();
    }
    public class Keyadapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {

            // get direction for snake
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'l';
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction='R';
                    }
                    break;

                case KeyEvent.VK_UP:
                    if (direction != 'D'){
                        direction ='U';
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if (direction!='U'){
                        direction ='D';
                    }
                    break;
            }
        }
    }
}
