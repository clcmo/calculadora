package mycalc;

private javax.swing.JButton button0;
private javax.swing.JButton button1; 
private javax.swing.JButton button2;
private javax.swing.JButton button3; 
private javax.swing.JButton button4;
private javax.swing.JButton button5; 
private javax.swing.JButton button6;
private javax.swing.JButton button7;
private javax.swing.JButton button8;
private javax.swing.JButton button9; 
private javax.swing.JButton buttonCE;
private javax.swing.JButton buttonPlus;
private javax.swing.JButton buttonSum;
private javax.swing.JButton buttonSub;
private javax.swing.JButton buttonDiv;
private javax.swing.JButton buttonEquals;
private javax.swing.JPanel jPanel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTextPane viewCalc;

class Screen extends javax.swing.JFrame {
	
	public Screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
 
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCalc = new javax.swing.JTextPane();
        buttonCE = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        buttonPlus = new javax.swing.JButton();
        buttonDiv = new javax.swing.JButton();
        buttonSub = new javax.swing.JButton();
        buttonSum = new javax.swing.JButton();
        buttonEquals = new javax.swing.JButton();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        jScrollPane1.setViewportView(viewCalc);
 
        buttonCE.setText("CE");
        buttonCE.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                buttonCEMouseClicked(evt);
            }
        });
 
        button7.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        button7.setText("7");
        button7.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button7MouseClicked(evt);
            }
        });
 
        button8.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        button8.setText("8");
        button8.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button8MouseClicked(evt);
            }
        });
 
        button9.setFont(new java.awt.Font("Ubuntu", 0, 24));
        button9.setText("9");
        button9.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button9MouseClicked(evt);
            }
        });
 
        button5.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        button5.setText("5");
        button5.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button5MouseClicked(evt);
            }
        });
 
        button6.setFont(new java.awt.Font("Ubuntu", 0, 24));
        button6.setText("6");
        button6.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button6MouseClicked(evt);
            }
        });
 
        button4.setFont(new java.awt.Font("Ubuntu", 0, 24));
        button4.setText("4");
        button4.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button4MouseClicked(evt);
            }
        });
 
        button1.setFont(new java.awt.Font("Ubuntu", 0, 24));
        button1.setText("1");
        button1.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button1MouseClicked(evt);
            }
        });
 
        button2.setFont(new java.awt.Font("Ubuntu", 0, 24));
        button2.setText("2");
        button2.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button2MouseClicked(evt);
            }
        });
 
        button3.setFont(new java.awt.Font("Ubuntu", 0, 24));
        button3.setText("3");
        button3.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                button3MouseClicked(evt);
            }
        });
 
        button0.setFont(new java.awt.Font("Ubuntu", 0, 24));
        button0.setText("0");
        button0.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button0MouseClicked(evt);
            }
        });
 
        buttonPlus.setFont(new java.awt.Font("Ubuntu", 0, 24));
        buttonPlus.setText("*");
        buttonPlus.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                buttonPlusMouseClicked(evt);
            }
        });
 
        buttonDiv.setFont(new java.awt.Font("Ubuntu", 0, 24));
        buttonDiv.setText("/");
        buttonDiv.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                buttonDivMouseClicked(evt);
            }
        });
 
        buttonSub.setFont(new java.awt.Font("Ubuntu", 0, 24));
        buttonSub.setText("-");
        buttonSub.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                buttonSubMouseClicked(evt);
            }
        });
 
        buttonSum.setFont(new java.awt.Font("Ubuntu", 0, 24));
        buttonSum.setText("+");
        buttonSum.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                buttonSumMouseClicked(evt);
            }
        });
 
        buttonEquals.setText("=");
        buttonEquals.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                buttonEqualsMouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup
            (javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup
                (javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent
                        (jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, 
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent
                            (buttonCE, javax.swing.GroupLayout.Alignment.LEADING, 
                            javax.swing.GroupLayout.DEFAULT_SIZE, 
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(button0, javax.swing.GroupLayout.DEFAULT_SIZE, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, 
                            jPanel1Layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap
                                (javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                             jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button7, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button4, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button5, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button8, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                 javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSum, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(buttonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, 
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button6, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        Short.MAX_VALUE)
                                        .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonSub, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        Short.MAX_VALUE))
                                    .addComponent(buttonPlus, 
                                    javax.swing.GroupLayout.Alignment.TRAILING, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
                                    jPanel1Layout.createSequentialGroup()
                                        .addComponent(button9, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        Short.MAX_VALUE)
                                        .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonDiv, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        Short.MAX_VALUE)))
                                .addGap(2, 2, 2)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(buttonSub, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
 
        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]
         {button7, button8, button9});
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
 
        pack();
    }
 
    private void buttonCEMouseClicked(java.awt.event.MouseEvent evt){                                     
        viewCalc.setText("");
    }                                    
 
    private void buttonPlusMouseClicked(java.awt.event.MouseEvent evt){                                        
        String value = viewCalc.getText();
        viewCalc.setText(value + "*");
    }                                       
 
    private void button7MouseClicked(java.awt.event.MouseEvent evt){                                    
        String value = viewCalc.getText();
        viewCalc.setText(value + "7");
    }                                   
 
    private void button8MouseClicked(java.awt.event.MouseEvent evt){                                    
        String value = viewCalc.getText();
        viewCalc.setText(value + "8");        
    }                                   
 
    private void button9MouseClicked(java.awt.event.MouseEvent evt){                                    
        String value = viewCalc.getText();
        viewCalc.setText(value + "9");        
    }                                   
 
    private void buttonDivMouseClicked(java.awt.event.MouseEvent evt) {                                      
        String value = viewCalc.getText();
        viewCalc.setText(value + "/");        
    }                                     
 
    private void button4MouseClicked(java.awt.event.MouseEvent evt) {                                    
        String value = viewCalc.getText();
        viewCalc.setText(value + "4");        
    }                                   
 
    private void button5MouseClicked(java.awt.event.MouseEvent evt){                                    
        String value = viewCalc.getText();
        viewCalc.setText(value + "5");        
    }                                   
 
    private void button6MouseClicked(java.awt.event.MouseEvent evt){                                    
        String value = viewCalc.getText();
        viewCalc.setText(value + "6");        
    }                                   
 
    private void buttonSubMouseClicked(java.awt.event.MouseEvent evt){                                        
        String value = viewCalc.getText();
        viewCalc.setText(value + "-");       
    }                                       
 
    private void button1MouseClicked(java.awt.event.MouseEvent evt){
        String value = viewCalc.getText();
        viewCalc.setText(value + "1");        
    }
 
    private void button2MouseClicked(java.awt.event.MouseEvent evt){
        String value = viewCalc.getText();
        viewCalc.setText(value + "2");        
    }
 
    private void button3MouseClicked(java.awt.event.MouseEvent evt){
        String value = viewCalc.getText();
        viewCalc.setText(value + "3");        
    }
 
    private void buttonSumMouseClicked(java.awt.event.MouseEvent evt) {
        String value = viewCalc.getText();
        viewCalc.setText(value + "+");        
    }
 
    private void button0MouseClicked(java.awt.event.MouseEvent evt){
        String value = viewCalc.getText();
        viewCalc.setText(value + "0");        
    }
 
    private void buttonEqualsMouseClicked(java.awt.event.MouseEvent evt) {
        String value = viewCalc.getText();
        System.out.println(">>>"+value);
        Calc calc = new Calc();
        String res = Calc.calc(value);
        viewCalc.setText(res);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
            javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }
}