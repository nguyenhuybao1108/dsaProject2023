package chess;

import java.awt.Graphics;

import java.awt.Color;

public class ChristmasDecorator extends Decorator {
    public ChristmasDecorator(IComponent component) {
        super(component);
    }

    final Color lightColor = new Color(0, 255, 0, 60);
    final Color darkColor = new Color(255, 0, 0, 255);

    private void addChristmasTheme(Graphics g, int sW, int sH) {
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
        addChristmasTheme(g, sW, sH);
    }
}
