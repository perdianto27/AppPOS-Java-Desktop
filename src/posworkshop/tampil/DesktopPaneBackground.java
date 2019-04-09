/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posworkshop.tampil;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author PERDIANTO
 */
public class DesktopPaneBackground extends JDesktopPane {
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics=(Graphics2D) g.create();
        
        Image img = new ImageIcon(getClass().getResource("/posworkshop/gambar/background.png")).getImage();
        graphics.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        graphics.dispose();
    }
    
}
