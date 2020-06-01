import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;

class Calculadora extends JFrame{
    private JPanel panel;
    private JTextField tbxX;
    private JTextField tbxY;
    private JTextField tbxR;
    private JButton somar;

    public Calculadora(){
        this.setContentPane(panel);
        somar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == somar){
                    final double r = parseDouble(tbxX.getText()) + parseDouble(tbxY.getText());
                    tbxR.setText(Double.toString(r));
                }
            }
        });
    }
}
