import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Double.parseDouble;

class CalJava extends JFrame implements ActionListener {
    private JTextField tbxX;
    private JTextField tbxY;
    private JTextField tbxR;
    private JButton btCalc;

    public CalJava(){
        this.setTitle("Calculadora");
        this.setSize(500, 500);
        this.addWindowListener(new ExitListener());

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout());

        tbxX = new JTextField(10);
        pane.add(tbxX);
        pane.add(new JLabel("+"));
        tbxY = new JTextField(10);
        pane.add(tbxY);
        pane.add(new JLabel("="));
        tbxR = new JTextField(10);
        pane.add(tbxR);

        btCalc = new JButton("Calcular");
        pane.add(btCalc);
        btCalc.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btCalc){
            final double x = parseDouble(this.tbxX.getText());
            final double y = parseDouble(this.tbxY.getText());
            final double r = x + y;
            this.tbxR.setText(Double.toString(r));
        }
    }
}
