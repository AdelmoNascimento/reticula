/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package reticula;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;

/**
 *
 * @author Adelmo Bonfim
 */
public class Reticula extends Frame{
    private int size;
    
    public static void main(String[] args) {
    int s = (args.length > 0 ? Integer.parseInt(args[0]): 20);
    Reticula f = new Reticula(s);
    f.show();
    }
    public Reticula(int s){
        super("Reticula");
        setSize(200,200);
        size = s;
        addWindowListener(new CloseWindowAndExit());
    }
    public void paint(Graphics g){
        Dimension dim = getSize();
        for(int i = 0; i < dim.width; i+=size)
            g.drawLine(i, 0, i, dim.height);
        for(int i = 0; i < dim.height; i+=size)
            g.drawLine(0, i, dim.width, i);
    }

}
