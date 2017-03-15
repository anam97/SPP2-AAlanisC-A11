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
public class ventana2 extends Frame {
        //Atributos: 3 botones.
    private final Button btnNorte;
    private final Button btnSur;
    private final Button btnEste;
    private final Button btnOeste;
    private final Button btnCentro;
    
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana2 (){
        super("Esta es una ventana de prueba");
        setLayout(new BorderLayout());
        
        btnNorte = new Button("Norte");
        add (btnNorte,BorderLayout.NORTH);
        
        btnSur = new Button ("Sur");
        add (btnSur,BorderLayout.SOUTH);
        
        btnEste= new Button ("Este");
        add (btnEste,BorderLayout.EAST);
        
        btnOeste= new Button ("Oeste");
        add (btnEste,BorderLayout.WEST);
        
        btnCentro = new Button ("Soy el botón Centro");
        add(btnCentro, BorderLayout.CENTER);
        
        setSize(800,600);
        setVisible(true);

}
}

