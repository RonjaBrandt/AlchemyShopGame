import javax.swing.*;
import java.awt.event.*;

public class AlchemyGUI {
    private JPanel panelMain;
    private JLabel counter;
    private JButton buttonClicker;

    private Integer x = 0;



    public AlchemyGUI() {
        buttonClicker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*JOptionPane.showMessageDialog(null,"Hello World");*/
                x++;
                counter.setText(Integer.toString(x));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AlchemyShop");
        frame.setContentPane(new AlchemyGUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
