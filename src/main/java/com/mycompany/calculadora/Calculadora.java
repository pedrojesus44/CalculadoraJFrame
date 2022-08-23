/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Admin
 */
//Declarando a classe publica de Calculadora e herdando de JFrame para realização da parte gráfica
public class Calculadora extends javax.swing.JFrame {
//======================================================================================================
    /**
     * Creates new form Calculadora
     */
    //Inicialização do método construtor e inicializando componentes (PADRÃO DO ARQUIVO JFRAME)
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        soma = new javax.swing.JRadioButton();
        subtracao = new javax.swing.JRadioButton();
        multiplicacao = new javax.swing.JRadioButton();
        divisao = new javax.swing.JRadioButton();
        resto = new javax.swing.JRadioButton();
        res = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        num1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num1.setText("N1");

        num2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        num2.setText("N2");

        soma.setText("Soma (+)");

        subtracao.setText("Subtração (-)");

        multiplicacao.setText("Multiplicação (*)");

        divisao.setText("Divisão (/)");

        resto.setText("Resto (%)");

        res.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        res.setText("Resultado:");

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(divisao)
                        .addComponent(multiplicacao)
                        .addComponent(subtracao)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(num1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(num2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(soma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calcular)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(res)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soma)
                    .addComponent(calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(multiplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(divisao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(res)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Definindo método para ação do botão calcular utlizando o método ActionEvent
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        //Declaração de variáveis que serão utilizadas
        String num1, num2;
        Double n1, n2;
        
        //Atribuindo os valores digitados nos campos de JTextField para a variável String
        num1 = txt1.getText();
        num2 = txt2.getText();
        
        //Convertendo e atribuindo os valores armazenados pela String para Double para que possam ser realizados os calculos
        n1 = Double.parseDouble(num1);
        n2 = Double.parseDouble(num2);
        
        //Utilização do método if e else para ação dos devidos RadioButtons selecionados e suas propriedades
        if(soma.isSelected() == true) {
            double re = n1 + n2;
            String mRe = String.valueOf(re);
            resultado.setText(mRe);
            }
        
        else 
            if(subtracao.isSelected() == true) {
                double re = n1 - n2;
                String mRe = String.valueOf(re);
                resultado.setText(mRe);
            }
        
        else 
            if(multiplicacao.isSelected() == true) {
                double re = n1 * n2;
                String mRe = String.valueOf(re);
                resultado.setText(mRe);
            }
        
        else 
            if(divisao.isSelected() == true) {
                double re = n1 / n2;
                String mRe = String.valueOf(re);
                resultado.setText(mRe);
            }
        
        else 
            if(resto.isSelected() == true) {
                double re = n1 / n2;
                double re2 = n1 % n2;
                String mRe = String.valueOf(re2);
                resultado.setText(mRe);
            }
        //======================================================================================================
        //======================================================================================================
    }//GEN-LAST:event_calcularActionPerformed

    //Definição do método para ação do botão limpar, que realizará a limpeza dos campos através do ActionEvent
    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        //Definindo os campos como nulos para sua devida limpeza
        txt1.setText(null);
        txt2.setText(null);
        resultado.setText(null);
        
        //Requerindo foco novamente para o primeiro campo
        txt1.requestFocus();
        //======================================================================================================
    }//GEN-LAST:event_limparActionPerformed

    /**
     * @param args the command line arguments
     */
    //Pacote de extensão do núcleo java
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    //======================================================================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton calcular;
    public javax.swing.JRadioButton divisao;
    public javax.swing.JButton limpar;
    public javax.swing.JRadioButton multiplicacao;
    public javax.swing.JLabel num1;
    public javax.swing.JLabel num2;
    public javax.swing.JLabel res;
    public javax.swing.JRadioButton resto;
    public javax.swing.JTextField resultado;
    public javax.swing.JRadioButton soma;
    public javax.swing.JRadioButton subtracao;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
