package chessgame;//package chessgame;/*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
// */
//
//import chess.GamePanel;
//
//import javax.swing.*;
//import javax.swing.plaf.TreeUI;
//import java.awt.event.MouseEvent;
//
///**
// *
// * @author NGHĨA
// */
//public class Main_screen_chess extends JFrame {
//    GamePanel GP;
//    public GamePanel.ColorBoard color;
//    JFrame frame = new JFrame("Chess game");
//
//    public boolean Chosen = false;
//    public boolean hasInitialize = false;
//    GamePanel gp;
//
//    boolean selectChristmast = false;
//    boolean selectNewyear = false;
//    boolean selectDefault = false;
//    boolean selectedTheme = false;
//
//    /**
//     * Creates new form Main_screen_chess
//     */
//    public Main_screen_chess() {
//        initComponents();
//      //  GP = new GamePanel(this.getWidth() , this.getHeight());
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">
//    private void initComponents() {
//
//        jProgressBar1 = new javax.swing.JProgressBar();
//        jCheckBox1 = new javax.swing.JCheckBox();
//        jLabel1 = new javax.swing.JLabel();
//        jButton1 = new javax.swing.JButton();
//        jButton2 = new javax.swing.JButton();
//        jButton3 = new javax.swing.JButton();
//
//        jCheckBox1.setText("jCheckBox1");
//
//        jLabel1.setText("Theme");
//        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jLabel1MouseClicked(evt);
//            }
//        });
//
//        jButton1.setText("AI");
//
//        jButton2.setText("HUMAN");
//        jButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton2ActionPerformed(evt);
//            }
//        });
//
//        jButton3.setText("jButton3");
//        jButton3.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton3ActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
//        this.setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGap(88, 88, 88)
//                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
//                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(80, 80, 97))
//                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
//                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(220, 220, 320))
//                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(25, 25, 25))))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGap(0, 0, 0)
//                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
//                                .addGap(0, 10, 100)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(60, 100, 150)
//                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(30, 30, 50))
//        );
//
//        pack();
//    }// </editor-fold>
//
//    private void jLabel1MouseClicked(MouseEvent evt) {
//        // TODO add your handling code here:
//        Object level = JOptionPane.showInputDialog(this, "Theme choosing",
//                "THEME",
//                JOptionPane.QUESTION_MESSAGE,
//                null,
//                new Object[] {"Default", "Christmas","New Year"},
//                "Default");
//
//        // interprets JOptionPane result
//
//            if (level.toString().equals("Christmas")){
//                 color  = GamePanel.ColorBoard.C;
//            }
//            if(level.toString().equals("New Year")){
//                color = GamePanel.ColorBoard.N;
//            }
//            if(level.toString().equals("Default") || level == null){
//                 color = GamePanel.ColorBoard.D;
//            }
//    }
//
//    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//        hasInitialize = true;
//        this.dispose();
//         Chosen = true;
//        GP = new GamePanel(this.getWidth() , this.getHeight());
//        GP.setColorBoar(color);
//        GP.newAiGame();
//        JFrame frame1 = new JFrame();
//   //     Player_screen p = new Player_screen(this.getWidth(), this.getHeight(), GP);
//        frame1.add(GP);
//        frame1.setSize(1076,666);
//        frame1.setVisible(true);;
//    }
//
//    public void setup(){
//            frame.add(new Main_screen_chess());
//            frame.setSize(1076,666);
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//
//
//    }
//
//    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
////        GP = new GamePanel(this.getWidth() , this.getHeight());
////        GP.setColorBoar(color);
////        GP.newAiGame();
////        if(GP.FinishedSelect){
////            frame.dispose();
////        }
////    //    Player_screen p = new Player_screen(1076, 666, GP);
////       frame.add(GP);
////       frame.setSize(1076,700);
////       frame.setVisible(true);
//
//    }
//
//
//    public GamePanel.ColorBoard getColor(){
//        return color;
//    }
//
//    public GamePanel getGP(){
//        return GP;
//    }
//
//
//
//
//    // Variables declaration - do not modify
//    private javax.swing.JButton jButton1;
//    private javax.swing.JButton jButton2;
//    private javax.swing.JButton jButton3;
//    private javax.swing.JCheckBox jCheckBox1;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JProgressBar jProgressBar1;
//    // End of variables declaration
//}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import chess.GamePanel;

import javax.swing.*;

/**
 *
 * @author NGHĨA
 */
public class Main_screen_chess extends javax.swing.JFrame {

    GamePanel GP;
    GamePanel.ColorBoard color;

    /**
     * Creates new form frame1
     */
    public Main_screen_chess() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setLabel("AI");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("button2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setLabel("button3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(251, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        GP = new GamePanel(this.getWidth(), this.getHeight());
        GP.setColorBoard(color);
        GP.newAiGame();
        GP.setGameMode(GamePanel.GameMode.AI);
        this.dispose();
        Player_screen p = new Player_screen( GP);

    }

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        GP = new GamePanel(this.getWidth(), this.getHeight());
        GP.newGame();
        GP.setGameMode(GamePanel.GameMode.Human);
        this.dispose();
        Player_screen p = new Player_screen(GP);
    }

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        Object BoardTheme = JOptionPane.showInputDialog(this, "Theme choosing",
                "THEME",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[] {"Default", "Christmas","New Year"},
                "Default");

        // interprets JOptionPane result
        if (BoardTheme.toString().equals("Christmas")){
            color  = GamePanel.ColorBoard.C;
        }
        if(BoardTheme.toString().equals("New Year")){
            color = GamePanel.ColorBoard.N;
        }
        if(BoardTheme.toString().equals("Default") ){
            color = GamePanel.ColorBoard.D;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_screen_chess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    // End of variables declaration
}
