package com.company;

import javax.swing.*;

public class Gameframe extends JFrame {
    Gameframe(){
        this.add(new GamePanel());
        this.setTitle("SSnake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
