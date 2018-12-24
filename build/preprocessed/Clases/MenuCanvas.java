package Clases;

import javax.microedition.lcdui.*;
import javax.microedition.media.*;

/**
 * @author Fabio Flores M.
 */
public class MenuCanvas extends Canvas implements CommandListener {
    private Image img, img1, img2, img3, tmp;
    private VisualMIDlet vm;
    private Display disp;
    private boolean presionado;
    private final int ancho = getWidth();
    private final int alto = getHeight();
    
    /**
     * constructor
     */
    public MenuCanvas(VisualMIDlet elMIDlet) {
        setCommandListener(this);
        crearImagenes();
        vm = elMIDlet;
        disp = vm.getDisplay();
        presionado = false;
    }

    /**
     * paint
     */
    public void paint(Graphics g) {
        g.setColor(0xFFFFFF);
        g.fillRect(0, 0, ancho, alto);
        g.drawImage(img, 0, alto/2 - 84, Graphics.LEFT | Graphics.VCENTER);
        g.drawImage(img1, 0, alto/2 - 28, Graphics.LEFT | Graphics.VCENTER);
        g.drawImage(img2, 0, alto/2 + 28, Graphics.LEFT | Graphics.VCENTER);
        g.drawImage(img3, 0, alto/2 + 84, Graphics.LEFT | Graphics.VCENTER);
    }
    
    public void crearImagenes(){
        try{
            img = Image.createImage("/Media/btn.png");
            img1 = Image.createImage("/Media/btn1.png");
            img2 = Image.createImage("/Media/btn2.png");
            img3 = Image.createImage("/Media/btn3.png");
        }catch (Exception e){}
    }

    /**
     * Called when a key is pressed.
     */
    protected void keyPressed(int keyCode) {
    }

    /**
     * Called when a key is released.
     */
    protected void keyReleased(int keyCode) {
    }

    /**
     * Called when a key is repeated (held down).
     */
    protected void keyRepeated(int keyCode) {
    }

    /**
     * Called when the pointer is dragged.
     */
    protected void pointerDragged(int x, int y) {
    }

    /**
     * Called when the pointer is pressed.
     */
    protected void pointerPressed(int x, int y) {
        try{    
            if(x <= 200 && y >= alto/2 - 109 && y <= alto/2 - 59){
                img = Image.createImage("/Media/btn_p.png");
                presionado = true;
            }else if(x <= 200 && y >= alto/2 - 53 && y <= alto/2 - 3){
                img1 = Image.createImage("/Media/btn1_p.png");
                presionado = true;
            }else if(x <= 200 && y >= alto/2 + 3 && y <= alto/2 + 53){
                img2 = Image.createImage("/Media/btn2_p.png");
                presionado = true;
            }else if(x <= 200 && y >= alto/2 + 59 && y <= alto/2 + 109){
                img3 = Image.createImage("/Media/btn3_p.png");
                presionado = true;
            }
            if(presionado){
                playSound("/Media/click.wav");
                repaint();
            }
        }catch(Exception e){}
    }

    /**
     * Called when the pointer is released.
     */
    protected void pointerReleased(int x, int y) {
            if(x <= 200 && y >= alto/2 - 109 && y <= alto/2 - 59){
                disp.setCurrent(vm.getForm());
            }else if(x <= 200 && y >= alto/2 - 53 && y <= alto/2 - 3){
                disp.setCurrent(vm.getForm4());
            }else if(x <= 200 && y >= alto/2 + 3 && y <= alto/2 + 53){
                disp.setCurrent(vm.getForm1());
            }else if(x <= 200 && y >= alto/2 + 59 && y <= alto/2 + 109){
                disp.setCurrent(vm.getForm2());
            }
            if(presionado){
                crearImagenes();
                repaint();
                presionado = false;
            }
    }
    
  private void playSound(String elSonido){
    try{
      Player p = Manager.createPlayer(getClass().getResourceAsStream(elSonido), "audio/x-wav");
      p.start();
    }catch (Exception e){}
  }

    /**
     * Called when action should be handled
     */
    public void commandAction(Command command, Displayable displayable){
    }
}
