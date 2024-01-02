/* Name: GROUP 8 
    Ma Phung Nghia - ITCSIU2106
    Huynh Thi Ngoc Tram - ITCSIU21238
    Nguyen Huy Bao - ITDSIU21076
    Purpose : create a game apply data structure and all knowledge about coding*/
package Decor;

import java.awt.Graphics;

public interface IComponent {
    void drawBoard(Graphics g, int sW, int sH);
    void loadImage();
}
