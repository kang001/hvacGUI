package com.Kara;

import javax.swing.*;

import java.awt.*;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by stiri on 11/1/2016.
 */
public class HVACGUI extends JFrame{
    private JPanel rootPanel;
    private JButton resolveCurrentCallButton;
    private JButton printCurrentCallButton;
    private JButton printAllOutstandingCallsButton;
    private JButton printAllResolvedCallsButton;
    private JButton quitButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JList list1;

    public HVACGUI(){
        this.setContentPane(rootPanel);
        pack();
        setVisible(true);
        setPreferredSize(new Dimension(800,900));
        addListeners();
    }

    private void addListeners() {
    }
}
