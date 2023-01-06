package sk.radvanisko.swinggui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton buttonmsg;
    private JPanel panelMain;
    private JPanel panelLeft;
    private JButton button1;
    private JButton button2;
    private JCheckBox checkBox1;
    private JEditorPane editorPane1;
    private JFormattedTextField formattedTextField2;
    private JSpinner spinner1;
    private JProgressBar progressBar1;
    private int progress=50;


    public App() {
    buttonmsg.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Ahoj");

        }
    });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (progress >0){
                    progress=progress-10;}

                progressBar1.setValue(progress);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (progress <=90){
                progress=progress+10;}
                        ;

                progressBar1.setValue(progress);
            }
        });
    }

    public static void main(String[] args) {

    JFrame frame= new JFrame("App");
    frame.setContentPane(new App().panelMain);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }


}
