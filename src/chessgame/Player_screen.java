//package chessgame;//package chessgame;
//
//
//import chess.Board;
//import chess.GamePanel;
//import com.formdev.flatlaf.FlatDarculaLaf;
//import com.formdev.flatlaf.ui.FlatLineBorder;
//import org.w3c.dom.Node;
//
//import javax.swing.*;
//import java.awt.*;
//
///**
// *
// * @author NGHĨA
// */
//public class Player_screen extends javax.swing.JFrame {
//GamePanel GP;
//private int count = 0;
//private Board board;
//
//    /**
//     * Creates new form frame1
//     */
//    public Player_screen(GamePanel gp) {
//        this.GP = gp;
//        initComponents();
//        try {
//            UIManager.setLookAndFeel(new FlatDarculaLaf());
//        } catch (UnsupportedLookAndFeelException e) {
//            throw new RuntimeException(e);
//        }
//        this.setTitle("Chess game");
//        this.setResizable(false);
//        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setVisible(true);
//        board = GP.getBoard();
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
//        jSeparator1 = new javax.swing.JSeparator();
//        jButton1 = new javax.swing.JButton();
//        jButton2 = new javax.swing.JButton();
//        jButton3 = new javax.swing.JButton();
//        jButton4 = new javax.swing.JButton();
//        jButton5 = new javax.swing.JButton();
//        jPanel1 = new javax.swing.JPanel();
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//
//
//        jButton1.setText("Theme");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });
//
//        jButton2.setText("Redo");
//        jButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton2ActionPerformed(evt);
//            }
//        });
//
//        jButton3.setText("Undo");
//        jButton3.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton3ActionPerformed(evt);
//            }
//        });
//
//        jButton4.setText("New Game");
//        jButton4.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton4ActionPerformed(evt);
//            }
//        });
//
//        jButton5.setText("Exit");
//        jButton5.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton5ActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(GP);
//        GP.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGap(0, 937, Short.MAX_VALUE)
//        );
//        jPanel1Layout.setVerticalGroup(
//                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGap(0, 631, Short.MAX_VALUE)
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                .addGap(20, 24, 30)
//                                .addComponent(GP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
//                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(50, 50, 55)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                                .addGap(35, 35, 35))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addGap(69, 69, 69)
//                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(62, 62, 62)
//                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(59, 59, 59)
//                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(59, 59, 59)
//                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(62, 62, 62)
//                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addGap(27, 27, 27)
//                                                .addComponent(GP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                .addContainerGap(18, Short.MAX_VALUE))
//        );
//
//        pack();
//    }// </editor-fold>
//
//    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//
//    }
//
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//        count++;
//        // TODO add your handling code here:
//        if(count == 1){
//            GP.setColorBoard(GamePanel.ColorBoard.C);
//            GP.repaint();
//        }
//        if(count == 2){
//            GP.setColorBoard(GamePanel.ColorBoard.N);
//            GP.repaint();
//        }
//        if(count == 3){
//            GP.setColorBoard(GamePanel.ColorBoard.D);
//            GP.repaint();
//            count = 0;
//        }
//
//
//    }
//
//    int undoMove = 0;
//    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
////        Linkedlist.Undo undo = new Linkedlist.Undo(board);
////       undo.Execute(GP);
//        undoMove++;
//        GP.Undo(undoMove);
//        GP.repaint();
//    }
//
//    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
//        GamePanel.GameMode gameMode = GP.getGameMode();
//         System.out.println(gameMode);
//        // TODO add your handling code here:
//        GP = new GamePanel(this.getWidth() , this.getHeight());
//        GP.setColorBoard(GamePanel.ColorBoard.D);
//        GP.setGameMode(gameMode);
//        if(GP.getGameMode() == GamePanel.GameMode.AI){
//            GP.newAiGame();
//        }
//        else{
//            GP.newGame();        }
//        this.dispose();
//        Player_screen p = new Player_screen(GP);
//        p.setLocationRelativeTo(null);
//        p.setResizable(false);
//        p.setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//        this.dispose();
//    }
//
//    // Variables declaration - do not modify
//    private javax.swing.JButton jButton1;
//    private javax.swing.JButton jButton2;
//    private javax.swing.JButton jButton3;
//    private javax.swing.JButton jButton4;
//    private javax.swing.JButton jButton5;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JSeparator jSeparator1;
//    // End of variables declaration
//}
