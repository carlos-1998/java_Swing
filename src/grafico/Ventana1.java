/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

/**
 *
 * @author Carlos
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Ventana1 extends JFrame{
    
    JButton button,btn2,btn3;
    JLabel jLabel,jLabe2,jLabel3;
    JPanel jPanel;
    public Ventana1() {
        button = new JButton();
        jLabel = new JLabel();
        jPanel = new JPanel();
        btn2 = new JButton();
        btn3 = new JButton();
        jLabe2 = new JLabel();
        jLabel3 = new JLabel();
        
        this.add(jPanel);
        jPanel.add(jLabel);
        jPanel.add(button);
        jPanel.add(btn2);
        jPanel.add(btn3);
        jPanel.add(jLabe2);
        jPanel.add(jLabel3);
        
        
        jLabel.setText("Hola");
        jLabe2.setText("Hola2");
        jLabel3.setText("Hola3");
        button.setText("Saludar");
        btn2.setText("Saludar2");
        btn3.setText("saludar3");
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola3"); 
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola2");
            }
        });
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola");
            }
            
        });
    }
    
    
    
    
}
