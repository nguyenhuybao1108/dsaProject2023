package Decor;

import Decor.Decorator;
import Decor.IComponent;
import chess.GamePanel;
import chess.Piece;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

public class WoodDecorator extends Decorator {
    public WoodDecorator(IComponent component) {
        super(component);
    }

    final Color lightColor = new Color(221,192,127);
    final Color darkColor = new Color(101, 67,33);

    boolean imagesLoaded = false;
    private GamePanel gp;

    private void loadWoodImages(){
        try {
            // initialize two arrays of bufferedImages
            BufferedImage[] whiteImages = new BufferedImage[6];
            BufferedImage[] blackImages = new BufferedImage[6];

            // if the PIECES folder doesn't exist, create it
            File directory = new File ("wood_src");
            if (!directory.exists()) {
                if (directory.mkdir()) {
                    // the directory will be empty, so throw an exception
                    throw new Exception("The PIECES directory did not exist. " +
                            "It has been created. Ensure that it contains the files: \n");
                }
            }


            // load all white images
            whiteImages[0] = ImageIO.read(new File("wood_src/wpawn.png"));
            whiteImages[1] = ImageIO.read(new File("wood_src/wknight.png"));
            whiteImages[2] = ImageIO.read(new File("wood_src/wbishop.png"));
            whiteImages[3] = ImageIO.read(new File("wood_src/wrook.png"));
            whiteImages[4] = ImageIO.read(new File("wood_src/wqueen.png"));
            whiteImages[5] = ImageIO.read(new File("wood_src/wking.png"));

            // load all black images
            blackImages[0] = ImageIO.read(new File("wood_src/bpawn.png"));
            blackImages[1] = ImageIO.read(new File("wood_src/bknight.png"));
            blackImages[2] = ImageIO.read(new File("wood_src/bbishop.png"));
            blackImages[3] = ImageIO.read(new File("wood_src/brook.png"));
            blackImages[4] = ImageIO.read(new File("wood_src/bqueen.png"));
            blackImages[5] = ImageIO.read(new File("wood_src/bking.png"));

            // set the white and black images in the Piece class
            Piece.setBlackImages(blackImages);
            Piece.setWhiteImages(whiteImages);

            // images loaded without errors
            imagesLoaded = true;
        } catch (Exception e) {
           // status = GamePanel.GameStatus.Error;
            // create a message to inform the use about the error
            String message = "Could not load piece images. " +
                    "Check that all 12 images exist in the PIECES folder " +
                    "and are accessible to the program.\n" +
                    "The program will not function properly until this is resolved.\n\n" +
                    "Error details: " + e.getMessage();
            // display the message
            JOptionPane.showMessageDialog(gp, message, "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void addWoodTheme(Graphics g, int sW, int sH) {
        // draw a light background
        g.setColor(lightColor);

        g.fillRect(0, 0, sW * 8, sH * 8);

        boolean dark = false;
        g.setColor(darkColor);
        // draw black squares
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (dark) {
                    g.fillRect(x * sW, y * sH, sW, sH);
                }
                dark = !dark;
            }
            dark = !dark;
        }
    }


    @Override
    public void drawBoard(Graphics g, int sW, int sH) {
        // TODO Auto-generated method stub
        super.drawBoard(g, sW, sH);
        addWoodTheme(g, sW, sH);
        super.loadImage();
        loadWoodImages();
    }
}