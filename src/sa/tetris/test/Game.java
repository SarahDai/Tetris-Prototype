package sa.tetris.test;

import sa.tetris.controller.Controller;
import sa.tetris.entities.Ground;
import sa.tetris.entities.ShapeFactory;
import sa.tetris.view.GamePanel;

import javax.swing.*;

/**
 * Created by SarahDai on 2/26/16.
 */
public class Game {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Ground ground = new Ground();
        GamePanel gamePanel = new GamePanel();
        Controller controller = new Controller(shapeFactory, ground, gamePanel);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(gamePanel.getWidth() + 10, gamePanel.getHeight() + 35);
        frame.add(gamePanel);
        gamePanel.addKeyListener(controller);
        frame.setVisible(true);
        frame.addKeyListener(controller);
        controller.newGame();
    }

}
