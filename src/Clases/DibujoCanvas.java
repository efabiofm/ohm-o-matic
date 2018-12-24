package Clases;

import javax.microedition.lcdui.*;

/**
 * @author Fabio Flores M.
 */
public class DibujoCanvas extends Canvas{
    Image imagen = null;
    int b1, b2, b3, b4;
    
    /**
     * constructor
     */
    public DibujoCanvas(){
        try{
            imagen = Image.createImage("/Media/resistor.png");
        }catch (Exception e){}
    }

    /**
     * paint
     */
    public void paint(Graphics g){
        g.setColor(0xFFFFFF);
        g.fillRect(0,0, getWidth(), getHeight());
        if(imagen != null){
            g.drawImage(imagen, getWidth() / 2, getHeight() /2, Graphics.HCENTER | Graphics.VCENTER);
            g.setColor(b1);
            g.fillRect(getWidth()/2 - 25, getHeight()/2 - 13, 5, 26);
            g.setColor(b2);
            g.fillRect(getWidth()/2 - 15, getHeight()/2 - 13, 5, 26);
            g.setColor(b3);
            g.fillRect(getWidth()/2 - 5, getHeight()/2 - 13, 5, 26);
            g.setColor(b4);
            g.fillRect(getWidth()/2 + 20, getHeight()/2 - 13, 5, 26);
        }else{
            g.setColor(0,0,0);  
            g.drawString("Error: Carga fallida", 0, 0, Graphics.TOP | Graphics.LEFT);
        }
    }
    
    public void setBandas(int c1, int c2, int c3, int c4){
        b1 = c1;
        b2 = c2;
        b3 = c3;
        b4 = c4;
    }
}
