import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManualGui implements ActionListener {
    private int pocetklikov=0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
public ManualGui()
{

        JButton button = new JButton("Klik");
        label= new JLabel("Pocet klikov je 0");
        frame= new JFrame();
        panel=new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(130,130,50,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        button.addActionListener(this);


        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My first GUI");
        frame.pack();
        frame.setVisible(true);
            }


    public static void main(String[] args) {
    new ManualGui();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
    pocetklikov++;
    label.setText("Pocet klikov : " + pocetklikov);
    }
}

// https://introcs.cs.princeton.edu/java/15inout/GUI.java.html