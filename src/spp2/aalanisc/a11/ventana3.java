/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.a11;
import java.awt.*;
/**
 *
 * @author anamartha
 */
public class ventana3 extends Frame {
    private final Button btn1;
    private final Button btn2;
    private final Button btn3;
    private final Button btn4;
    private final Button btn5;
    private final Button btn6;
    private final Button btn7;
    private final Button btn8;
    private final Button btn9;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana3 (){
        
        setLayout(new GridLayout());
         btn1 = new Button("Boton #1");
         add (btn1);
         
         setLayout(new GridLayout());
         btn2 = new Button("Boton#2");
         add (btn2);
         
         setLayout(new GridLayout());
         btn3 = new Button("Boton#3");
         add (btn3);
         
         setLayout(new GridLayout());
         btn4 = new Button("Boton#4");
         add (btn4);
         
         setLayout(new GridLayout());
         btn5 = new Button("Boton#5");
         add (btn5);
         
         setLayout(new GridLayout());
         btn6 = new Button("Boton#6");
         add (btn6);
         
         setLayout(new GridLayout());
         btn7 = new Button("Boton#7");
         add (btn7);
         
         setLayout(new GridLayout());
         btn8 = new Button("Boton#8");
         add (btn8);
         
         setLayout(new GridLayout());
         btn9 = new Button("Boton#9");
         add (btn9);
         
         setSize(500,500);
        setVisible(true);
         
    }
    
    
}
