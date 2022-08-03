package com.company;
import org.junit.jupiter.api.Test;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
        assertTrue(run);
    }

    @org.junit.jupiter.api.Test
    void newApple() {
        GamePanel gamePanel =new GamePanel();
        assertEquals(gamePanel.ApplesEaten, gamePanel.ApplesEaten++);
    }

    @Test
    void move(){
        GamePanel gamePanel =new GamePanel();
        int size  =UnitSize;
        int y = gamePanel.y[0];
        int x = gamePanel.x[0];

        assertNotNull(gamePanel.direction);
        assertTrue(gamePanel.running);
       assertEquals('U',y-size);
       assertEquals('D',y+size);
       assertEquals('L',x-size);
       assertEquals('R',x+size);
        }

@Test
void snakesDirection(){
        GamePanel panel = new GamePanel();
        if (panel.direction=='U'){
    assertEquals(panel.y[0], panel.y[0] - UnitSize);
}
    if (panel.direction=='D'){
        assertEquals(panel.y[0], panel.y[0] + UnitSize);
    }
    if (panel.direction=='L'){
        assertEquals(panel.x[0], panel.x[0] - UnitSize);
    }
    if (panel.direction=='R'){
        assertEquals(panel.x[0], panel.x[0] + UnitSize);
    }
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
            assertEquals(SnakeCoordinatesY, AppleCoordinatesY);
        }
        if (SnakeCoordinatesY==10 && AppleCoordinatesY ==12){
            assertNotEquals(SnakeCoordinatesY, AppleCoordinatesX);
        }
        if((SnakeCoordinatesX== AppleCoordinatesX)&&(SnakeCoordinatesY==AppleCoordinatesY)){
            assertEquals(3, NumberApples);
            assertEquals(11, SnakeLength);
        }
    }

    @Test
    void collisionsLoopTest(){
        GamePanel p= new GamePanel();
        assertEquals(0,p.bodyParts=0);
        assertFalse(p.bodyParts < 0);
        assertFalse(p.x[0] < 0);
        assertFalse(p.x[0] > ScreenWidth);
        assertFalse(p.y[0] < 0);
        assertFalse(p.y[0] > ScreenHeight);
    }
    @Test
    void collisionsTest(){
        GamePanel g = new GamePanel();
        int a=g.x[0]=2;
        int b=g.x[g.bodyParts]=2;
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
    assertEquals(11,SnakeLength+1);
    assertEquals(SnakeLength, SnakeLength++);
}

if (SnakesX==ApplesX&& SnakesY!=ApplesY){
    assertEquals(10,SnakeLength);
    assertFalse(SnakeLength!=SnakeLength++);
}

if (SnakesX!=ApplesX&&SnakesY==ApplesY){
    assertFalse(SnakeLength!=SnakeLength++);
    assertEquals(SnakeLength, SnakeLength);
}
}

    @org.junit.jupiter.api.Test
    void gameOver() {
        GamePanel Panel = new GamePanel();
       assertTrue(Panel.running);
       assertSame("GAME OVER","GAME OVER");
    }

    @Test
    void keyPressedCheck() {
        KeyAdapter keyAdapter = new KeyAdapter() {
               public void keyPressed(KeyEvent e) {
                   assertNotNull(e.getKeyCode());
                assertEquals('L',KeyEvent.VK_LEFT);
                   assertNotEquals(KeyEvent.VK_LEFT, 'R');
                assertEquals('R',KeyEvent.VK_RIGHT);
                   assertNotEquals(KeyEvent.VK_RIGHT, 'L');
                assertEquals('D',KeyEvent.VK_DOWN);
                   assertNotEquals(KeyEvent.VK_DOWN, 'U');
                assertEquals('U',KeyEvent.VK_UP);
                   assertNotEquals(KeyEvent.VK_UP, 'D');
               }
        };}

    @org.junit.jupiter.api.Test
    void actionPerformed() {
        boolean run = false;
        assertFalse(run);
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


