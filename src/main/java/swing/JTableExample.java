// JTable example

//package com.ack.gui.swing.simple;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class JTableExample extends JFrame {

    String data[][] = {{"John", "Sutherland", "Student"},
        {"George", "Davies", "Student"},
        {"Melissa", "Anderson", "Associate"},
        {"Stergios", "Maglaras", "Developer"},};
    String fields[] = {"Name", "Surname", "Status"};

    public static void main(String[] argv) {
        JTableExample myExample = new JTableExample("JTable Example");
    }

    public JTableExample(String title) {
        super(title);
        setSize(150, 150);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
        init();
        pack();
        setVisible(true);
    }

    private void init() {
        JTable jt = new JTable(data, fields);
        JScrollPane pane = new JScrollPane(jt);
        getContentPane().add(pane);
    }
}
