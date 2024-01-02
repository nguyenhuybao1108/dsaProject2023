/* Name: GROUP 8 
    Ma Phung Nghia - ITCSIU2106
    Huynh Thi Ngoc Tram - ITCSIU21238
    Nguyen Huy Bao - ITDSIU21076
    Purpose : create a game apply data structure and all knowledge about coding*/

package Decor;

import Decor.IComponent;

import java.awt.Graphics;

public abstract class Decorator implements IComponent {
    protected IComponent component;

    public Decorator(IComponent component) {
        this.component = component;
    }

    public void drawBoard(Graphics g, int sW, int sH) {
        component.drawBoard(g, sW, sH);
    }

    @Override
    public void loadImage() {
        component.loadImage();
    }
}
