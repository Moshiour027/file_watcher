package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by moshiour.rahman on 7/23/2017.
 */
public class APp {
    public JPanel panelMain;
    public JButton jBUtton;

    public APp() {

        jBUtton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello WOrld");
            }
        });
    }
}
