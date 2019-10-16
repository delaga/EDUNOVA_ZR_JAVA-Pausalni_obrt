/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.view;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import zavrsnirad.model.Klijent_kupac;

/**
 *
 * @author mirza
 */
public class KlijentiKupciCellRenderer extends JLabel implements ListCellRenderer<Klijent_kupac>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Klijent_kupac> list, Klijent_kupac value, int index, boolean isSelected, boolean cellHasFocus) {
        String naziv = value.getNaziv();
        setText(naziv);
        if (isSelected) {
            setBackground(Color.GRAY);
            setForeground(Color.BLACK);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        
        return this;
    }
    
}
