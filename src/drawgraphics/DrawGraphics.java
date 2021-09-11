package drawgraphics;

import javax.swing.*;
import java.awt.*;

public class DrawGraphics extends JPanel
{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.fillRect(25,25,100,30);
        g.setColor(new Color(190,81,215));
        g.fillOval(25,65,40,30);
        g.setColor(Color.BLACK);
        g.drawString("Texto en pantalla", 25,120);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Mi ventana con graficos");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawGraphics ventana = new DrawGraphics();
        f.add(ventana);
        f.setSize(200,200);
        f.setVisible(true);

    }



}
