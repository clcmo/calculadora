import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Screen extends JFrame{

    private JPanel panel;
    private JTextField result;
    private JButton clean, div, plus, minus, sum, equals;
    private JButton one, two, three, four, five;
    private JButton six, seven, eight, nine, zero;

    public Screen(){
        initComponents();
    }

    private void initComponents() {
        this.setContentPane(panel);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        result.setFont(new Font("Ubuntu", Font.PLAIN, 30));

        clean.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        clean.setText("C");
        clean.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cleanClicked(e);
            }
        });

        div.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        div.setText("/");
        div.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                divClicked(e);
            }
        });

        plus.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        plus.setText("*");
        plus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                plusClicked(e);
            }
        });

        minus.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        minus.setText("-");
        minus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minusClicked(e);
            }
        });

        sum.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        sum.setText("+");
        sum.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sumClicked(e);
            }
        });

        one.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        one.setText("1");
        one.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                oneClicked(e);
            }
        });

        two.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        two.setText("2");
        two.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                twoCLicked(e);
            }
        });

        three.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        three.setText("3");
        three.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                threeClicked(e);
            }
        });

        four.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        four.setText("4");
        four.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fourClicked(e);
            }
        });

        five.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        five.setText("5");
        five.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fiveClicked(e);
            }
        });

        six.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        six.setText("6");
        six.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sixClicked(e);
            }
        });

        seven.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        seven.setText("7");
        seven.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sevenClicked(e);
            }
        });

        eight.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        eight.setText("8");
        eight.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eightClicked(e);
            }
        });

        nine.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        nine.setText("9");
        nine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nineCicked(e);
            }
        });

        zero.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        zero.setText("0");
        zero.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                zeroClicked(e);
            }
        });

        equals.setFont(new Font("Ubuntu", Font.PLAIN, 24));
        equals.setText("=");
        equals.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                equalsClicked(e);
            }
        });
    }

    private void equalsClicked(MouseEvent e) {
        String value = result.getText();
        System.out.println(">>>" + value);
        Calculus calculus = new Calculus();
        String res = calculus.calculator(value);
        result.setText(res);
    }

    private void zeroClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "0");
    }

    private void nineCicked(MouseEvent e){
        String value = result.getText();
        result.setText(value + "9");
    }

    private void eightClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "8");
    }

    private void sevenClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "7");
    }

    private void sixClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "6");
    }

    private void fiveClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "5");
    }

    private void fourClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "4");
    }

    private void threeClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "3");
    }

    private void twoCLicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "2");
    }

    private void oneClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "1");
    }

    private void sumClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "+");
    }

    private void minusClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "-");
    }

    private void plusClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "*");
    }

    private void divClicked(MouseEvent e) {
        String value = result.getText();
        result.setText(value + "/");
    }

    private void cleanClicked(MouseEvent e) {
        result.setText("");
    }
}