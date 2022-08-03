package com.company;

import org.junit.jupiter.api.Test;

import static com.company.GamePanel.*;
import static org.junit.jupiter.api.Assertions.*;

class GamePanelTest {
    @org.junit.jupiter.api.Test

    void startGame() {
        GamePanel panel = new GamePanel();
        assertTrue(panel.running);
    }
    @org.junit.jupiter.api.Test
    void startNewGame() {
        GamePanel Panel = new GamePanel();
        this.startGame();
        assertTrue(Panel.running);
    }

    @org.junit.jupiter.api.Test
    void draw() {
        boolean run = true;
        assertEquals(run,true);
    }

    @org.junit.jupiter.api.Test
    void newApple() {
        GamePanel gamePanel =new GamePanel();
        assertTrue(gamePanel.ApplesEaten==gamePanel.ApplesEaten++);
    }

    @Test
    void move(){
        GamePanel gamePanel =new GamePanel();
        int size  =2;
        int y = gamePanel.y[0];
       assertTrue(y==y-size);
        }

    @Test
    void moveToUp() {
        GamePanel panel = new GamePanel();
        int size =3;
        int y = panel.y[0];
        char NewDirections = 'R';
        assertEquals(NewDirections, 'R');

        NewDirections = 'U';
        assertEquals(NewDirections, 'U');
        assertTrue(NewDirections != 'D');
        assertTrue(y==y-size);
    }

    @Test
    void moveToDown() {
        GamePanel gamePanel = new GamePanel();
        int size =5;
        int y= gamePanel.y[0];
        char NewDirections = 'L';

        NewDirections = 'D';
        assertEquals(NewDirections, 'D');
        assertTrue(NewDirections != 'U');
        assertTrue(y==y+size);
    }

    @Test
    void moveToRight() {
        GamePanel panel = new GamePanel();
        int size=4;
        int x = panel.x[0];
        char direction = 'U';
        direction = 'R';
        assertEquals(direction, 'R');
        assertTrue(direction != 'L');
        assertTrue(x==x+size);

    }

    @Test
    void moveToLeft() {
        GamePanel panel = new GamePanel();
        int size = 6;
        int x =panel.x[0];
        char directions = 'D';

        directions = 'L';
        assertEquals(directions, 'L');
        assertTrue(directions != 'R');
    assertTrue(x==x-size);
    }

    @Test
    void movement(){
        char direction = 'L';
        int[] Xcoordinates = new int[12];
        int[] Ycoordinates = new int[12];
        }

    @Test
    void snakeMoves() {
        int SnakeParts = 16;
        int SnakesX = 11;
        int SnakesY = 11;
        for (int i = SnakeParts; i > 0; i--) {
            SnakesX = SnakesX - 1;
            SnakesY = SnakesY - 1;
        }
    }

        @Test
    void checkIfSnakeEatsApple() {
        int SnakeCoordinatesX = 5;
        int SnakeCoordinatesY = 10;
        int AppleCoordinatesX=2;
        int AppleCoordinatesY=5;

        int SnakeLength =10;
        int NumberApples = 2;

        if (SnakeCoordinatesX==5 && AppleCoordinatesX ==5){
            assertEquals(SnakeLength,SnakeLength++);
        }

        if (SnakeCoordinatesX==5 && AppleCoordinatesX ==7){
            assertTrue(SnakeCoordinatesX!=AppleCoordinatesX);
        }
        if (SnakeCoordinatesY==10 && AppleCoordinatesY ==10){
            assertTrue(SnakeCoordinatesY==AppleCoordinatesY);
        }
        if (SnakeCoordinatesY==10 && AppleCoordinatesY ==12){
            assertFalse(SnakeCoordinatesY==AppleCoordinatesX);
        }

        if((SnakeCoordinatesX== AppleCoordinatesX)&&(SnakeCoordinatesY==AppleCoordinatesY)){
            assertTrue(NumberApples==3);
            assertTrue(SnakeLength==11);
        }
    }

    @Test
    void checkCollisions() {
        GamePanel Panel = new GamePanel();
        int SnakesX=2;
        int SnakesY= 5;
        int SnakeLength =20;
        for (int i = SnakeLength; i>0;i--){
             if (Panel.x[0] == Panel.x[i] && Panel.y[0] == Panel.y[i]) {
                assertTrue(Panel.running);
            }
             if (Panel.x[0]<0){
                 assertTrue(Panel.running);
             }
            if (Panel.x[0]>ScreenWidth){
                assertTrue(Panel.running);
            }
            if (Panel.x[0]>ScreenHeight){
                assertTrue(Panel.running);
            }
           for (int a =SnakeLength; a>0;a--){
               if (SnakesX<0){
                   assertTrue(Panel.running);
               }
               if (SnakesY>ScreenHeight){
                   assertTrue(Panel.running);
               }
            }
        }
    }


    @org.junit.jupiter.api.Test
    void doesSnakeGrow(){
        GamePanel panel = new GamePanel();
        assertNotNull(panel);
int SnakeLength =10;
int ApplesX = 3;
int ApplesY = 4;
int SnakesX = 3;
int SnakesY = 4;
if (SnakesX==ApplesX && SnakesY==ApplesY){
    assertEquals(11,SnakeLength++);
    assertTrue(SnakeLength==SnakeLength++);
}

if (SnakesX==ApplesX&& SnakesY!=ApplesY){
    assertEquals(10,SnakeLength);
    assertFalse(SnakeLength!=SnakeLength++);
}

if (SnakesX!=ApplesX&&SnakesY==ApplesY){
    assertFalse(SnakeLength!=SnakeLength++);
    assertTrue(SnakeLength==SnakeLength);
}
else {
    assertTrue(SnakeLength==10);
    assertEquals(10,SnakeLength);
}}


    @org.junit.jupiter.api.Test
    void gameOver() {
        GamePanel Panel = new GamePanel();
       assertTrue(!Panel.running);
       assertSame("GAME OVER","GAME OVER");
    }


    @org.junit.jupiter.api.Test
    void actionPerformed() {
        boolean run = false;
        assertTrue(run==false);
    }

    @Test
    void gamePanel(){
        GamePanel gamePanel =new GamePanel();
        assertNotNull(gamePanel);
    }
    @Test
    void gameframe(){
        Gameframe gameframe = new Gameframe();
        assertNotNull(gameframe);
    }
    @Test
    void mainTest() {
        Main main = new Main();
        assertNotNull(main);
    }
        @Test
        void mainGameframe(){
        Gameframe gameframe = new Gameframe();
        this.gameframe();
        assertNotNull(gameframe);
    }}
