package Decor;

import chess.GamePanel;
import chess.Piece;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

public class NewyearDecorator extends Decorator {

    boolean imagesLoaded = false;

    private GamePanel gp;

    public NewyearDecorator(IComponent component) {
        super(component);
        // TODO Auto-generated constructor stub
    }

    final Color lightColor = new Color(0, 0, 255, 255);
    final Color darkColor = new Color(255, 255, 0, 255);

    private void addNewYearTheme(Graphics g, int sW, int sH) {
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

    private void loadImages(){
        try {
            // initialize two arrays of bufferedImages
            BufferedImage[] whiteImages = new BufferedImage[6];
            BufferedImage[] blackImages = new BufferedImage[6];

            // if the PIECES folder doesn't exist, create it
            File directory = new File ("PIECES");
            if (!directory.exists()) {
                if (directory.mkdir()) {
                    // the directory will be empty, so throw an exception
                    throw new Exception("The PIECES directory did not exist. " +
                            "It has been created. Ensure that it contains the following files: \n" +
                            "WHITE_PAWN.PNG\n" +
                            "WHITE_KNIGHT.PNG\n" +
                            "WHITE_BISHOP.PNG\n" +
                            "WHITE_ROOK.PNG\n" +
                            "WHITE_QUEEN.PNG\n" +
                            "WHITE_KING.PNG\n" +
                            "BLACK_PAWN.PNG\n" +
                            "BLACK_KNIGHT.PNG\n" +
                            "BLACK_BISHOP.PNG\n" +
                            "BLACK_ROOK.PNG\n" +
                            "BLACK_QUEEN.PNG\n" +
                            "BLACK_KING.PNG");
                }
            }


            // load all white images
            whiteImages[0] = ImageIO.read(new File("PIECES/WHITE_PAWN.PNG"));
            whiteImages[1] = ImageIO.read(new File("PIECES/WHITE_KNIGHT.PNG"));
            whiteImages[2] = ImageIO.read(new File("PIECES/WHITE_BISHOP.PNG"));
            whiteImages[3] = ImageIO.read(new File("PIECES/WHITE_ROOK.PNG"));
            whiteImages[4] = ImageIO.read(new File("PIECES/WHITE_QUEEN.PNG"));
            whiteImages[5] = ImageIO.read(new File("PIECES/WHITE_KING.PNG"));

            // load all black images
            blackImages[0] = ImageIO.read(new File("PIECES/BLACK_PAWN.PNG"));
            blackImages[1] = ImageIO.read(new File("PIECES/BLACK_KNIGHT.PNG"));
            blackImages[2] = ImageIO.read(new File("PIECES/BLACK_BISHOP.PNG"));
            blackImages[3] = ImageIO.read(new File("PIECES/BLACK_ROOK.PNG"));
            blackImages[4] = ImageIO.read(new File("PIECES/BLACK_QUEEN.PNG"));
            blackImages[5] = ImageIO.read(new File("PIECES/BLACK_KING.PNG"));

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


    @Override
    public void drawBoard(Graphics g, int sW, int sH) {
        // TODO Auto-generated method stub

        super.drawBoard(g, sW, sH);
        addNewYearTheme(g, sW, sH);
        super.loadImage();
        loadImages();
    }

}