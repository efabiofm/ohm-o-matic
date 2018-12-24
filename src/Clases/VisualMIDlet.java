package Clases;

import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author Fabio Flores M.
 */
public class VisualMIDlet extends MIDlet implements CommandListener {
    private boolean midletPaused = false;
    private double memoria;
    
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form form;
    private ChoiceGroup choiceGroup;
    private ChoiceGroup choiceGroup3;
    private StringItem stringItem;
    private ChoiceGroup choiceGroup1;
    private ChoiceGroup choiceGroup2;
    private Form form1;
    private TextField textField;
    private ChoiceGroup choiceGroup5;
    private StringItem stringItem1;
    private Form form2;
    private StringItem stringItem2;
    private ChoiceGroup choiceGroup4;
    private TextField textField1;
    private Form form3;
    private StringItem stringItem3;
    private StringItem stringItem4;
    private StringItem stringItem5;
    private StringItem stringItem6;
    private Form form4;
    private TextField textField2;
    private ChoiceGroup choiceGroup6;
    private StringItem stringItem7;
    private DibujoCanvas dibujoCanvas;
    private MenuCanvas menuCanvas;
    private Command exitCommand;
    private Command backCommand;
    private Command okCommand;
    private Command itemCommand;
    private Command helpCommand;
    private Command backCommand1;
    private Command itemCommand1;
    private Command okCommand1;
    private Command itemCommand2;
    private Command okCommand2;
    private Command itemCommand3;
    private Command backCommand2;
    private Command okCommand3;
    private Command backCommand3;
    private Command itemCommand4;
    private Command exitCommand1;
    private Command backCommand4;
//</editor-fold>//GEN-END:|fields|0|
    
    /**
     * The VisualMIDlet constructor.
     */
    public VisualMIDlet(){
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
        choiceGroup5 = new ChoiceGroup("Unidad", Choice.POPUP);//GEN-BEGIN:|0-initialize|1|0-postInitialize
        choiceGroup5.append("\u2126", null);
        choiceGroup5.append("K\u2126", null);
        choiceGroup5.append("M\u2126", null);
        choiceGroup5.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, menuCanvas);
        switchDisplayable(null, getMenuCanvas());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display;
     * if <code>null</code>, then <code>nextDisplayable</code> is set
     * immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == dibujoCanvas) {//GEN-BEGIN:|7-commandAction|1|164-preAction
            if (command == backCommand4) {//GEN-END:|7-commandAction|1|164-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm4());//GEN-LINE:|7-commandAction|2|164-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|28-preAction
        } else if (displayable == form) {
            if (command == backCommand) {//GEN-END:|7-commandAction|3|28-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenuCanvas());//GEN-LINE:|7-commandAction|4|28-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|5|30-preAction
                // write pre-action user code here
                calcCodColores();
//GEN-LINE:|7-commandAction|6|30-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|99-preAction
        } else if (displayable == form1) {
            if (command == backCommand) {//GEN-END:|7-commandAction|7|99-preAction
                // write pre-action user code here
                limpiar(1);
                switchDisplayable(null, getMenuCanvas());//GEN-LINE:|7-commandAction|8|99-postAction
                // write post-action user code here
            } else if (command == itemCommand2) {//GEN-LINE:|7-commandAction|9|106-preAction
                // write pre-action user code here
                limpiar(1);
//GEN-LINE:|7-commandAction|10|106-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|11|102-preAction
                // write pre-action user code here
                calcResistSerie();
//GEN-LINE:|7-commandAction|12|102-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|110-preAction
        } else if (displayable == form2) {
            if (command == backCommand) {//GEN-END:|7-commandAction|13|110-preAction
                // write pre-action user code here
                limpiar(2);
                switchDisplayable(null, getMenuCanvas());//GEN-LINE:|7-commandAction|14|110-postAction
                // write post-action user code here
            } else if (command == itemCommand3) {//GEN-LINE:|7-commandAction|15|122-preAction
                // write pre-action user code here
                limpiar(2);
//GEN-LINE:|7-commandAction|16|122-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|17|113-preAction
                // write pre-action user code here
                calcResistParal();
//GEN-LINE:|7-commandAction|18|113-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|19|136-preAction
        } else if (displayable == form3) {
            if (command == backCommand2) {//GEN-END:|7-commandAction|19|136-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenuCanvas());//GEN-LINE:|7-commandAction|20|136-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|21|157-preAction
        } else if (displayable == form4) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|21|157-preAction
                // write pre-action user code here
                limpiar(4);
                switchDisplayable(null, getMenuCanvas());//GEN-LINE:|7-commandAction|22|157-postAction
                // write post-action user code here
            } else if (command == okCommand3) {//GEN-LINE:|7-commandAction|23|154-preAction
                // write pre-action user code here
                obtCodColores();
//GEN-LINE:|7-commandAction|24|154-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|25|174-preAction
        } else if (displayable == menuCanvas) {
            if (command == exitCommand1) {//GEN-END:|7-commandAction|25|174-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|26|174-postAction
                // write post-action user code here
            } else if (command == itemCommand4) {//GEN-LINE:|7-commandAction|27|171-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm3());//GEN-LINE:|7-commandAction|28|171-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|29|7-postCommandAction
        }//GEN-END:|7-commandAction|29|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|30|
//</editor-fold>//GEN-END:|7-commandAction|30|

// Mis métodos
    
public double convertirUnidad(double elNumero, int opcion){
    switch(opcion){
        case 0: elNumero = memoria;
            break;
        case 1: elNumero = memoria / 1000;
            break;
        case 2: elNumero = memoria / 1000000;
            break;
     }
     return elNumero;
}

public void calcCodColores(){
    String banda1 = "";
    String banda2 = "";
    String tolerancia = "";
    String resultado = "";
    switch(choiceGroup.getSelectedIndex()){
        case 0: banda1 = "1";
            break;
        case 1: banda1 = "2";
            break;
        case 2: banda1 = "3";
            break;
        case 3: banda1 = "4";
            break;
        case 4: banda1 = "5";
            break;
        case 5: banda1 = "6";
            break;
        case 6: banda1 = "7";
            break;
        case 7: banda1 = "8";
            break;
        case 8: banda1 = "9";
            break;
        }
    switch(choiceGroup1.getSelectedIndex()){
        case 0: banda2 = "0";
            break;
        case 1: banda2 = "1";
            break;
        case 2: banda2 = "2";
            break;
        case 3: banda2 = "3";
            break;
        case 4: banda2 = "4";
            break;
        case 5: banda2 = "5";
            break;
        case 6: banda2 = "6";
            break;
        case 7: banda2 = "7";
            break;
        case 8: banda2 = "8";
            break;
        case 9: banda2 = "9";
            break;
        }
    switch(choiceGroup2.getSelectedIndex()){
        case 0: resultado = "0." + banda1 + banda2 + " Ω";
            break;
        case 1: resultado = banda1 + "." + banda2 + " Ω";
            break;
        case 2: resultado = banda1 + banda2 + " Ω";
            break;
        case 3: resultado = banda1 + banda2 + "0 Ω";
            break;
        case 4: resultado = banda1 + "." + banda2 + " KΩ";
            break;
        case 5: resultado = banda1 + banda2 + " KΩ";
            break;
        case 6: resultado = banda1 + banda2 + "0 KΩ";
            break;
        case 7: resultado = banda1 + "." + banda2 + " MΩ";
            break;
        case 8: resultado = banda1+ banda2 + " MΩ";
            break;
        }
    switch(choiceGroup3.getSelectedIndex()){
        case 0: tolerancia = " ±10%";
            break;
        case 1: tolerancia = " ±5%";
            break;
        }
        stringItem.setText(resultado + tolerancia);
}

public void obtCodColores(){
    stringItem7.setText("");
    try{
        String texto = textField2.getString();
        int numero = Integer.parseInt("" + texto.charAt(0));
        int cantidad = 0;
        boolean noCero = false;
        for(int i=2; i<texto.length() && !noCero; i++){
            char actualChar = texto.charAt(i);
            if(actualChar != '0'){
                noCero = true;
            }else{
                cantidad++;
            }
        }
        if(!noCero && numero != 0){
            int banda1 = 0, banda2 = 0, banda3 = 0, banda4 = 0;
            switch(numero){
                case 1: banda1 = 0x800000;
                    break;
                case 2: banda1 = 0xFF0000;
                    break;
                case 3: banda1 = 0xFF6600;
                    break;
                case 4: banda1 = 0xFFFF00;
                    break;
                case 5: banda1 = 0x008000;
                    break;
                case 6: banda1 = 0x0000FF;
                    break;
                case 7: banda1 = 0x800080;
                    break;
                case 8: banda1 = 0x808080;
                    break;
                case 9: banda1 = 0xFFFFFF;
                    break;
            }
            if(texto.length() > 1){
                numero = Integer.parseInt("" + texto.charAt(1));
                switch(numero){
                    case 0: banda2 = 0x000000;
                        break;
                    case 1: banda2 = 0x800000;
                        break;
                    case 2: banda2 = 0xFF0000;
                        break;
                    case 3: banda2 = 0xFF6600;
                        break;
                    case 4: banda2 = 0xFFFF00;
                        break;
                    case 5: banda2 = 0x008000;
                        break;
                    case 6: banda2 = 0x0000FF;
                        break;
                    case 7: banda2 = 0x800080;
                        break;
                    case 8: banda2 = 0x808080;
                        break;
                    case 9: banda2 = 0xFFFFFF;
                        break;
                }
                switch(cantidad){
                    case 0: banda3 = 0x000000;
                        break;
                    case 1: banda3 = 0x800000;
                        break;
                    case 2: banda3 = 0xFF0000;
                        break;
                    case 3: banda3 = 0xFF6600;
                        break;
                    case 4: banda3 = 0xFFFF00;
                        break;
                    case 5: banda3 = 0x008000;
                        break;
                    case 6: banda3 = 0x0000FF;
                        break;
                }

            }else{
                banda2 = 0x000000;
                banda3 = 0xCC9900;
            }
            switch(choiceGroup6.getSelectedIndex()){
                case 0: banda4 = 0xCC9900;
                    break;
                case 1: banda4 = 0xC0C0C0;
                    break;
            }
            getDibujoCanvas().setBandas(banda1, banda2, banda3, banda4);
            switchDisplayable(null, dibujoCanvas);
        }else{
            stringItem7.setText("Valor no aceptado");
            textField2.setString("");
        }
    }catch(Exception e){
        stringItem7.setText("Debe escribir algo");
    }
}

public void calcResistSerie(){
    try{
        double numero = Double.parseDouble(textField.getString());
        memoria += numero;
        stringItem1.setText("" + this.convertirUnidad(memoria, choiceGroup5.getSelectedIndex()));
        textField.setString("");
    }catch(Exception e){
        stringItem1.setText("" + this.convertirUnidad(memoria, choiceGroup5.getSelectedIndex()));
    }
}

public void calcResistParal(){
    try{
        double numero = Double.parseDouble(textField1.getString());
        if(memoria != 0 && numero != 0){
            memoria = 1/(1/memoria + 1/numero);
        }else{
            memoria += numero;
        }
        stringItem2.setText("" + this.convertirUnidad(memoria, choiceGroup4.getSelectedIndex()));
        textField1.setString("");
    }catch(Exception e){
        stringItem2.setText("" + this.convertirUnidad(memoria, choiceGroup4.getSelectedIndex()));
    }
}

public void limpiar(int opcion){
    switch(opcion){
        case 1: //form1
            memoria = 0;
            stringItem1.setText("" + memoria);
            break;
        case 2: //form2
            memoria = 0;
            stringItem2.setText("" + memoria);
            break;
        case 3: //form3
            break;
        case 4: //form4
            stringItem7.setText("");
            break;
    }
}

// Creación de elementos

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|25-getter|0|25-preInit
            // write pre-init user code here
            form = new Form("Calc. c\u00F3d. colores", new Item[]{getChoiceGroup(), getChoiceGroup1(), getChoiceGroup2(), getChoiceGroup3(), getStringItem()});//GEN-BEGIN:|25-getter|1|25-postInit
            form.addCommand(getBackCommand());
            form.addCommand(getOkCommand());
            form.setCommandListener(this);//GEN-END:|25-getter|1|25-postInit
            // write post-init user code here
        }//GEN-BEGIN:|25-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|25-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|21-getter|0|21-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|21-getter|0|21-preInit
            // write pre-init user code here
            exitCommand = new Command("Salir", Command.EXIT, 0);//GEN-LINE:|21-getter|1|21-postInit
            // write post-init user code here
        }//GEN-BEGIN:|21-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|21-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            backCommand = new Command("Atr\u00E1s", Command.BACK, 0);//GEN-LINE:|27-getter|1|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|29-getter|0|29-preInit
            // write pre-init user code here
            okCommand = new Command("Calcular", Command.OK, 0);//GEN-LINE:|29-getter|1|29-postInit
            // write post-init user code here
        }//GEN-BEGIN:|29-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|29-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initialized instance of choiceGroup component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|35-getter|0|35-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Banda 1", Choice.POPUP);//GEN-BEGIN:|35-getter|1|35-postInit
            choiceGroup.append("Marr\u00F3n", null);
            choiceGroup.append("Rojo", null);
            choiceGroup.append("Naranja", null);
            choiceGroup.append("Amarillo", null);
            choiceGroup.append("Verde", null);
            choiceGroup.append("Azul", null);
            choiceGroup.append("Violeta", null);
            choiceGroup.append("Gris", null);
            choiceGroup.append("Blanco", null);
            choiceGroup.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            choiceGroup.setSelectedFlags(new boolean[]{false, false, false, false, false, false, false, false, false});//GEN-END:|35-getter|1|35-postInit
            // write post-init user code here
        }//GEN-BEGIN:|35-getter|2|
        return choiceGroup;
    }
//</editor-fold>//GEN-END:|35-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initialized instance of choiceGroup1 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {//GEN-END:|36-getter|0|36-preInit
            // write pre-init user code here
            choiceGroup1 = new ChoiceGroup("Banda 2", Choice.POPUP);//GEN-BEGIN:|36-getter|1|36-postInit
            choiceGroup1.append("Negro", null);
            choiceGroup1.append("Marr\u00F3n", null);
            choiceGroup1.append("Rojo", null);
            choiceGroup1.append("Naranja", null);
            choiceGroup1.append("Amarillo", null);
            choiceGroup1.append("Verde", null);
            choiceGroup1.append("Azul", null);
            choiceGroup1.append("Violeta", null);
            choiceGroup1.append("Gris", null);
            choiceGroup1.append("Blanco", null);
            choiceGroup1.setSelectedFlags(new boolean[]{false, false, false, false, false, false, false, false, false, false});//GEN-END:|36-getter|1|36-postInit
            // write post-init user code here
        }//GEN-BEGIN:|36-getter|2|
        return choiceGroup1;
    }
//</editor-fold>//GEN-END:|36-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup2 ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initialized instance of choiceGroup2 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup2() {
        if (choiceGroup2 == null) {//GEN-END:|37-getter|0|37-preInit
            // write pre-init user code here
            choiceGroup2 = new ChoiceGroup("Multiplicador", Choice.POPUP);//GEN-BEGIN:|37-getter|1|37-postInit
            choiceGroup2.append("Plata", null);
            choiceGroup2.append("Oro", null);
            choiceGroup2.append("Negro", null);
            choiceGroup2.append("Marr\u00F3n", null);
            choiceGroup2.append("Rojo", null);
            choiceGroup2.append("Naranja", null);
            choiceGroup2.append("Amarillo", null);
            choiceGroup2.append("Verde", null);
            choiceGroup2.setSelectedFlags(new boolean[]{false, false, false, false, false, false, false, false});//GEN-END:|37-getter|1|37-postInit
            // write post-init user code here
        }//GEN-BEGIN:|37-getter|2|
        return choiceGroup2;
    }
//</editor-fold>//GEN-END:|37-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup3 ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initialized instance of choiceGroup3 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup3() {
        if (choiceGroup3 == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            choiceGroup3 = new ChoiceGroup("Tolerancia", Choice.POPUP);//GEN-BEGIN:|38-getter|1|38-postInit
            choiceGroup3.append("Plata", null);
            choiceGroup3.append("Oro", null);
            choiceGroup3.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            choiceGroup3.setSelectedFlags(new boolean[]{false, false});//GEN-END:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return choiceGroup3;
    }
//</editor-fold>//GEN-END:|38-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|39-getter|0|39-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|39-getter|0|39-preInit
            // write pre-init user code here
            stringItem = new StringItem("Resultado:", null);//GEN-LINE:|39-getter|1|39-postInit
            // write post-init user code here
        }//GEN-BEGIN:|39-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|39-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|76-getter|0|76-preInit
    /**
     * Returns an initialized instance of itemCommand component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {//GEN-END:|76-getter|0|76-preInit
            // write pre-init user code here
            itemCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|76-getter|1|76-postInit
            // write post-init user code here
        }//GEN-BEGIN:|76-getter|2|
        return itemCommand;
    }
//</editor-fold>//GEN-END:|76-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: helpCommand ">//GEN-BEGIN:|79-getter|0|79-preInit
    /**
     * Returns an initialized instance of helpCommand component.
     *
     * @return the initialized component instance
     */
    public Command getHelpCommand() {
        if (helpCommand == null) {//GEN-END:|79-getter|0|79-preInit
            // write pre-init user code here
            helpCommand = new Command("Ayuda", Command.HELP, 0);//GEN-LINE:|79-getter|1|79-postInit
            // write post-init user code here
        }//GEN-BEGIN:|79-getter|2|
        return helpCommand;
    }
//</editor-fold>//GEN-END:|79-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand1 ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initialized instance of itemCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand1() {
        if (itemCommand1 == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            itemCommand1 = new Command("Acerca de", Command.ITEM, 0);//GEN-LINE:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return itemCommand1;
    }
//</editor-fold>//GEN-END:|82-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initialized instance of backCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|86-getter|0|86-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|86-getter|1|86-postInit
            // write post-init user code here
        }//GEN-BEGIN:|86-getter|2|
        return backCommand1;
    }
//</editor-fold>//GEN-END:|86-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|97-getter|0|97-preInit
    /**
     * Returns an initialized instance of form1 component.
     *
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {//GEN-END:|97-getter|0|97-preInit
            // write pre-init user code here
            form1 = new Form("Calc. resist. serie", new Item[]{getTextField(), getStringItem1(), choiceGroup5});//GEN-BEGIN:|97-getter|1|97-postInit
            form1.addCommand(getOkCommand1());
            form1.addCommand(getItemCommand2());
            form1.addCommand(getBackCommand());
            form1.setCommandListener(this);//GEN-END:|97-getter|1|97-postInit
            // write post-init user code here
        }//GEN-BEGIN:|97-getter|2|
        return form1;
    }
//</editor-fold>//GEN-END:|97-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|103-getter|0|103-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|103-getter|0|103-preInit
            // write pre-init user code here
            textField = new TextField("Ingrese valor en ohms", null, 32, TextField.DECIMAL);//GEN-LINE:|103-getter|1|103-postInit
            // write post-init user code here
        }//GEN-BEGIN:|103-getter|2|
        return textField;
    }
//</editor-fold>//GEN-END:|103-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|101-getter|0|101-preInit
    /**
     * Returns an initialized instance of okCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|101-getter|0|101-preInit
            // write pre-init user code here
            okCommand1 = new Command("Aceptar", Command.OK, 0);//GEN-LINE:|101-getter|1|101-postInit
            // write post-init user code here
        }//GEN-BEGIN:|101-getter|2|
        return okCommand1;
    }
//</editor-fold>//GEN-END:|101-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand2 ">//GEN-BEGIN:|105-getter|0|105-preInit
    /**
     * Returns an initialized instance of itemCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand2() {
        if (itemCommand2 == null) {//GEN-END:|105-getter|0|105-preInit
            // write pre-init user code here
            itemCommand2 = new Command("Reiniciar", Command.ITEM, 0);//GEN-LINE:|105-getter|1|105-postInit
            // write post-init user code here
        }//GEN-BEGIN:|105-getter|2|
        return itemCommand2;
    }
//</editor-fold>//GEN-END:|105-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form2 ">//GEN-BEGIN:|109-getter|0|109-preInit
    /**
     * Returns an initialized instance of form2 component.
     *
     * @return the initialized component instance
     */
    public Form getForm2() {
        if (form2 == null) {//GEN-END:|109-getter|0|109-preInit
            // write pre-init user code here
            form2 = new Form("Calc. resist. paral.", new Item[]{getTextField1(), getStringItem2(), getChoiceGroup4()});//GEN-BEGIN:|109-getter|1|109-postInit
            form2.addCommand(getBackCommand());
            form2.addCommand(getOkCommand2());
            form2.addCommand(getItemCommand3());
            form2.setCommandListener(this);//GEN-END:|109-getter|1|109-postInit
            // write post-init user code here
        }//GEN-BEGIN:|109-getter|2|
        return form2;
    }
//</editor-fold>//GEN-END:|109-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|114-getter|0|114-preInit
    /**
     * Returns an initialized instance of textField1 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|114-getter|0|114-preInit
            // write pre-init user code here
            textField1 = new TextField("Ingrese valor en ohms", null, 32, TextField.DECIMAL);//GEN-LINE:|114-getter|1|114-postInit
            // write post-init user code here
        }//GEN-BEGIN:|114-getter|2|
        return textField1;
    }
//</editor-fold>//GEN-END:|114-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup4 ">//GEN-BEGIN:|115-getter|0|115-preInit
    /**
     * Returns an initialized instance of choiceGroup4 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup4() {
        if (choiceGroup4 == null) {//GEN-END:|115-getter|0|115-preInit
            // write pre-init user code here
            choiceGroup4 = new ChoiceGroup("Unidad", Choice.POPUP);//GEN-BEGIN:|115-getter|1|115-postInit
            choiceGroup4.append("\u2126", null);
            choiceGroup4.append("K\u2126", null);
            choiceGroup4.append("M\u2126", null);
            choiceGroup4.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|115-getter|1|115-postInit
            // write post-init user code here
        }//GEN-BEGIN:|115-getter|2|
        return choiceGroup4;
    }
//</editor-fold>//GEN-END:|115-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem2 ">//GEN-BEGIN:|119-getter|0|119-preInit
    /**
     * Returns an initialized instance of stringItem2 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem2() {
        if (stringItem2 == null) {//GEN-END:|119-getter|0|119-preInit
            // write pre-init user code here
            stringItem2 = new StringItem("Resultado:", "0.0", Item.PLAIN);//GEN-BEGIN:|119-getter|1|119-postInit
            stringItem2.setPreferredSize(-1, -1);//GEN-END:|119-getter|1|119-postInit
            // write post-init user code here
        }//GEN-BEGIN:|119-getter|2|
        return stringItem2;
    }
//</editor-fold>//GEN-END:|119-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|112-getter|0|112-preInit
    /**
     * Returns an initialized instance of okCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|112-getter|0|112-preInit
            // write pre-init user code here
            okCommand2 = new Command("Aceptar", Command.OK, 0);//GEN-LINE:|112-getter|1|112-postInit
            // write post-init user code here
        }//GEN-BEGIN:|112-getter|2|
        return okCommand2;
    }
//</editor-fold>//GEN-END:|112-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand3 ">//GEN-BEGIN:|121-getter|0|121-preInit
    /**
     * Returns an initialized instance of itemCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand3() {
        if (itemCommand3 == null) {//GEN-END:|121-getter|0|121-preInit
            // write pre-init user code here
            itemCommand3 = new Command("Reiniciar", Command.ITEM, 0);//GEN-LINE:|121-getter|1|121-postInit
            // write post-init user code here
        }//GEN-BEGIN:|121-getter|2|
        return itemCommand3;
    }
//</editor-fold>//GEN-END:|121-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form3 ">//GEN-BEGIN:|123-getter|0|123-preInit
    /**
     * Returns an initialized instance of form3 component.
     *
     * @return the initialized component instance
     */
    public Form getForm3() {
        if (form3 == null) {//GEN-END:|123-getter|0|123-preInit
            // write pre-init user code here
            form3 = new Form("Acerca de", new Item[]{getStringItem3(), getStringItem4(), getStringItem5(), getStringItem6()});//GEN-BEGIN:|123-getter|1|123-postInit
            form3.addCommand(getBackCommand2());
            form3.setCommandListener(this);//GEN-END:|123-getter|1|123-postInit
            // write post-init user code here
        }//GEN-BEGIN:|123-getter|2|
        return form3;
    }
//</editor-fold>//GEN-END:|123-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem3 ">//GEN-BEGIN:|125-getter|0|125-preInit
    /**
     * Returns an initialized instance of stringItem3 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem3() {
        if (stringItem3 == null) {//GEN-END:|125-getter|0|125-preInit
            // write pre-init user code here
            stringItem3 = new StringItem("OHM-\u2126-MATIC", "-----------------");//GEN-LINE:|125-getter|1|125-postInit
            // write post-init user code here
        }//GEN-BEGIN:|125-getter|2|
        return stringItem3;
    }
//</editor-fold>//GEN-END:|125-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem5 ">//GEN-BEGIN:|129-getter|0|129-preInit
    /**
     * Returns an initialized instance of stringItem5 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem5() {
        if (stringItem5 == null) {//GEN-END:|129-getter|0|129-preInit
            // write pre-init user code here
            stringItem5 = new StringItem("Fecha", "11/10/2012");//GEN-LINE:|129-getter|1|129-postInit
            // write post-init user code here
        }//GEN-BEGIN:|129-getter|2|
        return stringItem5;
    }
//</editor-fold>//GEN-END:|129-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem6 ">//GEN-BEGIN:|130-getter|0|130-preInit
    /**
     * Returns an initialized instance of stringItem6 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem6() {
        if (stringItem6 == null) {//GEN-END:|130-getter|0|130-preInit
            // write pre-init user code here
            stringItem6 = new StringItem("Versi\u00F3n", "2.3.1");//GEN-LINE:|130-getter|1|130-postInit
            // write post-init user code here
        }//GEN-BEGIN:|130-getter|2|
        return stringItem6;
    }
//</editor-fold>//GEN-END:|130-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand2 ">//GEN-BEGIN:|135-getter|0|135-preInit
    /**
     * Returns an initialized instance of backCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand2() {
        if (backCommand2 == null) {//GEN-END:|135-getter|0|135-preInit
            // write pre-init user code here
            backCommand2 = new Command("Atr\u00E1s", Command.BACK, 0);//GEN-LINE:|135-getter|1|135-postInit
            // write post-init user code here
        }//GEN-BEGIN:|135-getter|2|
        return backCommand2;
    }
//</editor-fold>//GEN-END:|135-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem4 ">//GEN-BEGIN:|143-getter|0|143-preInit
    /**
     * Returns an initialized instance of stringItem4 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem4() {
        if (stringItem4 == null) {//GEN-END:|143-getter|0|143-preInit
            // write pre-init user code here
            stringItem4 = new StringItem("Autor", "Fabio Flores M.");//GEN-LINE:|143-getter|1|143-postInit
            // write post-init user code here
        }//GEN-BEGIN:|143-getter|2|
        return stringItem4;
    }
//</editor-fold>//GEN-END:|143-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form4 ">//GEN-BEGIN:|144-getter|0|144-preInit
    /**
     * Returns an initialized instance of form4 component.
     *
     * @return the initialized component instance
     */
    public Form getForm4() {
        if (form4 == null) {//GEN-END:|144-getter|0|144-preInit
            // write pre-init user code here
            form4 = new Form("Obt. c\u00F3d. colores", new Item[]{getTextField2(), getChoiceGroup6(), getStringItem7()});//GEN-BEGIN:|144-getter|1|144-postInit
            form4.addCommand(getOkCommand3());
            form4.addCommand(getBackCommand3());
            form4.setCommandListener(this);//GEN-END:|144-getter|1|144-postInit
            // write post-init user code here
        }//GEN-BEGIN:|144-getter|2|
        return form4;
    }
//</editor-fold>//GEN-END:|144-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: dibujoCanvas ">//GEN-BEGIN:|147-getter|0|147-preInit
    /**
     * Returns an initialized instance of dibujoCanvas component.
     *
     * @return the initialized component instance
     */
    public DibujoCanvas getDibujoCanvas() {
        if (dibujoCanvas == null) {//GEN-END:|147-getter|0|147-preInit
            // write pre-init user code here
            dibujoCanvas = new DibujoCanvas();//GEN-BEGIN:|147-getter|1|147-postInit
            dibujoCanvas.setTitle("C\u00F3digo de colores");
            dibujoCanvas.addCommand(getBackCommand4());
            dibujoCanvas.setCommandListener(this);//GEN-END:|147-getter|1|147-postInit
            // write post-init user code here
        }//GEN-BEGIN:|147-getter|2|
        return dibujoCanvas;
    }
//</editor-fold>//GEN-END:|147-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|159-getter|0|159-preInit
    /**
     * Returns an initialized instance of textField2 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|159-getter|0|159-preInit
            // write pre-init user code here
            textField2 = new TextField("Escriba valor en ohms", "", 8, TextField.NUMERIC);//GEN-LINE:|159-getter|1|159-postInit
            // write post-init user code here
        }//GEN-BEGIN:|159-getter|2|
        return textField2;
    }
//</editor-fold>//GEN-END:|159-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|153-getter|0|153-preInit
    /**
     * Returns an initialized instance of okCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {//GEN-END:|153-getter|0|153-preInit
            // write pre-init user code here
            okCommand3 = new Command("Aceptar", Command.OK, 0);//GEN-LINE:|153-getter|1|153-postInit
            // write post-init user code here
        }//GEN-BEGIN:|153-getter|2|
        return okCommand3;
    }
//</editor-fold>//GEN-END:|153-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand3 ">//GEN-BEGIN:|156-getter|0|156-preInit
    /**
     * Returns an initialized instance of backCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand3() {
        if (backCommand3 == null) {//GEN-END:|156-getter|0|156-preInit
            // write pre-init user code here
            backCommand3 = new Command("Atr\u00E1s", Command.BACK, 0);//GEN-LINE:|156-getter|1|156-postInit
            // write post-init user code here
        }//GEN-BEGIN:|156-getter|2|
        return backCommand3;
    }
//</editor-fold>//GEN-END:|156-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup6 ">//GEN-BEGIN:|160-getter|0|160-preInit
    /**
     * Returns an initialized instance of choiceGroup6 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup6() {
        if (choiceGroup6 == null) {//GEN-END:|160-getter|0|160-preInit
            // write pre-init user code here
            choiceGroup6 = new ChoiceGroup("Tolerancia", Choice.POPUP);//GEN-BEGIN:|160-getter|1|160-postInit
            choiceGroup6.append("\u00B15%", null);
            choiceGroup6.append("\u00B110%", null);
            choiceGroup6.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            choiceGroup6.setSelectedFlags(new boolean[]{false, false});//GEN-END:|160-getter|1|160-postInit
            // write post-init user code here
        }//GEN-BEGIN:|160-getter|2|
        return choiceGroup6;
    }
//</editor-fold>//GEN-END:|160-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand4 ">//GEN-BEGIN:|163-getter|0|163-preInit
    /**
     * Returns an initialized instance of backCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand4() {
        if (backCommand4 == null) {//GEN-END:|163-getter|0|163-preInit
            // write pre-init user code here
            backCommand4 = new Command("Atr\u00E1s", Command.BACK, 0);//GEN-LINE:|163-getter|1|163-postInit
            // write post-init user code here
        }//GEN-BEGIN:|163-getter|2|
        return backCommand4;
    }
//</editor-fold>//GEN-END:|163-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem7 ">//GEN-BEGIN:|167-getter|0|167-preInit
    /**
     * Returns an initialized instance of stringItem7 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem7() {
        if (stringItem7 == null) {//GEN-END:|167-getter|0|167-preInit
            // write pre-init user code here
            stringItem7 = new StringItem("Observaciones", "");//GEN-LINE:|167-getter|1|167-postInit
            // write post-init user code here
        }//GEN-BEGIN:|167-getter|2|
        return stringItem7;
    }
//</editor-fold>//GEN-END:|167-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: menuCanvas ">//GEN-BEGIN:|168-getter|0|168-preInit
    /**
     * Returns an initialized instance of menuCanvas component.
     *
     * @return the initialized component instance
     */
    public MenuCanvas getMenuCanvas() {
        if (menuCanvas == null) {//GEN-END:|168-getter|0|168-preInit
            // write pre-init user code here
            menuCanvas = new MenuCanvas(this);//GEN-BEGIN:|168-getter|1|168-postInit
            menuCanvas.setTitle("OHM-\u2126-MATIC");
            menuCanvas.addCommand(getItemCommand4());
            menuCanvas.addCommand(getExitCommand1());
            menuCanvas.setCommandListener(this);//GEN-END:|168-getter|1|168-postInit
            // write post-init user code here
        }//GEN-BEGIN:|168-getter|2|
        return menuCanvas;
    }
//</editor-fold>//GEN-END:|168-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand4 ">//GEN-BEGIN:|170-getter|0|170-preInit
    /**
     * Returns an initialized instance of itemCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand4() {
        if (itemCommand4 == null) {//GEN-END:|170-getter|0|170-preInit
            // write pre-init user code here
            itemCommand4 = new Command("Acerca de", Command.ITEM, 0);//GEN-LINE:|170-getter|1|170-postInit
            // write post-init user code here
        }//GEN-BEGIN:|170-getter|2|
        return itemCommand4;
    }
//</editor-fold>//GEN-END:|170-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|173-getter|0|173-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|173-getter|0|173-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Salir", Command.EXIT, 0);//GEN-LINE:|173-getter|1|173-postInit
            // write post-init user code here
        }//GEN-BEGIN:|173-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|173-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|181-getter|0|181-preInit
    /**
     * Returns an initialized instance of stringItem1 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {//GEN-END:|181-getter|0|181-preInit
            // write pre-init user code here
            stringItem1 = new StringItem("Resultado", "0.0");//GEN-LINE:|181-getter|1|181-postInit
            // write post-init user code here
        }//GEN-BEGIN:|181-getter|2|
        return stringItem1;
    }
//</editor-fold>//GEN-END:|181-getter|2|

// Métodos de aplicación

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
