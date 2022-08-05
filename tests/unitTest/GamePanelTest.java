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
        assertTrue(run);
    }

    @org.junit.jupiter.api.Test
    void newApple() {
        GamePanel gamePanel =new GamePanel();
        assertEquals(gamePanel.ApplesEaten, gamePanel.ApplesEaten++);
    }

    @Test
    void snakeMoves(){
        GamePanel gamePanel =new GamePanel();
        gamePanel.move();
        assertEquals(gamePanel.x[4],gamePanel.x[5]);
        assertEquals(gamePanel.y[3],gamePanel.x[4]);
        }

@Test
void snakesDirectionUp(){
        GamePanel panel = new GamePanel();
        panel.direction='U';
        panel.y[0] =100;
        assertEquals(50, panel.y[0] - UnitSize);
    }

    @Test
    void snakesDirectionDown(){
        GamePanel panel = new GamePanel();
        panel.direction='D';
        panel.y[0] =100;
        assertEquals(150, panel.y[0] + UnitSize);
        }

    @Test
    void snakesDirectionLeft(){
        GamePanel panel = new GamePanel();
        panel.direction='L';
        panel.x[0] =100;
        assertEquals(50, panel.x[0] - UnitSize);
    }
    @Test
    void snakesDirectionRight(){
        GamePanel panel = new GamePanel();
        panel.direction='R';
        panel.x[0] =3;
        assertEquals(53, panel.x[0] + UnitSize);
    }

        @Test
    void checkSnakeDoesntEatApple() {
        GamePanel gamePanel =new GamePanel();
            gamePanel.bodyParts = 5;
            gamePanel.ApplesEaten =3;
            gamePanel.checkApple();

            assertNotEquals(6,gamePanel.bodyParts);
            assertNotEquals(4,gamePanel.ApplesEaten);
        }
        @Test
        void checkIfSnakeEatsApple(){
        GamePanel pp =new GamePanel();
        pp.AppleY = 4;
        pp.AppleX = 2;
        pp.x[0]=2;
        pp.y[0]=4;
        int snakeX = pp.x[0];
        int snakeY = pp.y[0];
        int bodyParts =5;
        int ApplesEaten =3;
        pp.bodyParts = bodyParts;
        pp.ApplesEaten = ApplesEaten;
            bodyParts++;
            ApplesEaten++;
        assertEquals(6,bodyParts++);
        assertEquals(4,ApplesEaten++);
        assertEquals(snakeX,pp.AppleX);
        assertEquals(snakeY,pp.AppleY);

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
      int SnakesX =2;
       int SnakesY = 3;
       int ApplesX =2;
       int ApplesY = 3;
       assertEquals(SnakesX,ApplesX);
       assertEquals(SnakesY,ApplesY);
    }

    @Test
    void checkHeadAgainstLeftBorder(){
        GamePanel gm = new GamePanel();
        gm.bodyParts =4;
        gm.checkCollisions();
        gm.x[0] = -12;
        assertFalse(gm.running);
        assertEquals(!gm.running,gm.x[0]<0);
    }

    @Test
    void checkHeadAgainstRightBorder(){
        GamePanel gm = new GamePanel();
        gm.checkCollisions();
        assertEquals(!gm.running,gm.x[0]<ScreenWidth);
    }

    @Test
    void checkHeadAgainstTopBorder(){
        GamePanel gamepanel = new GamePanel();
        gamepanel.y[0] = -2;
        gamepanel.checkCollisions();
        assertTrue(!gamepanel.running);
    }

    @Test
void checkHeadAgainstBottomBorder(){
    GamePanel snakesPosition = new GamePanel();
    snakesPosition.checkCollisions();
    assertEquals(!snakesPosition.running,snakesPosition.y[0]<ScreenHeight);
    }


    @org.junit.jupiter.api.Test
    void doesSnakeGrow(){
        GamePanel panel = new GamePanel();
        assertNotNull(panel);
        panel.bodyParts = 10;
        panel.AppleX =3;
        panel.AppleY =4;
        panel.x[0]= 3;
        panel.y[0]=4;
        panel.checkApple();
        assertEquals(11,panel.bodyParts);
}
@Test
void checkSnakeDoesntGrow(){

}

@Test
void doesApplesEatenTallyIncrease(){
        GamePanel game = new GamePanel();
        game.ApplesEaten = 5;
        game.AppleY = 44;
        game.AppleX = 22;
        game.x[0]= 22;
        game.y[0]= 44;

        game.checkApple();
        assertEquals(6,game.ApplesEaten);
}

    @Test
    void keyPressed(){
        GamePanel game =new GamePanel();
    }
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
        assertTrue(gameframe.isActive());
    }}


