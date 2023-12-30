//import chessgame.GameWindow;
//import com.sun.tools.javac.Main;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
//public class MainFrame extends javax.swing.JFrame {
//    private CardLayout cardLayout;
//
//    public MainFrame() throws IOException {
//        this.getContentPane().setBackground(Color.BLACK);
//        cardLayout = new CardLayout();
//        setLayout(cardLayout);
//
//        // Add the chess panel
//        add(new ChessPanel(), "ChessPanel");
//
//        // Add the GameWindow panel
//        add(new GameWindow(), "GameWindow");
//
//        // Show the chess panel initially
//        cardLayout.show(getContentPane(), "ChessPanel");
//
//    }
//
//    private class ChessPanel extends JPanel {
//        private javax.swing.JLabel jLabel1;
//        private javax.swing.JLabel jLabel2;
//        private javax.swing.JOptionPane jOptionPane1;
//        private JLabel image;
//        Timer timer;
//
//        public ChessPanel() throws IOException {
//            jOptionPane1 = new javax.swing.JOptionPane();
//            jLabel1 = new javax.swing.JLabel();
//            jLabel2 = new javax.swing.JLabel();
//
//            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//            //  jLabel1.setText("Chess");
//
//            jLabel2.setText("                          PLAY");
//            jLabel2.setForeground(Color.WHITE);
//            jLabel2.setFont(new Font("Serif", Font.TRUETYPE_FONT, 40));
//            image = new JLabel();
//
//            BufferedImage imageIcon = ImageIO.read(new File("PIECES/Test_title_2.PNG"));
//            BufferedImage scaleImage = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_BGR);
//            Graphics2D g = scaleImage.createGraphics();
//            g.setComposite(AlphaComposite.Src);
//            g.drawImage(imageIcon, this.getWidth() , this.getHeight() ,null);
//            g.dispose();
//            ImageIcon imageIcon1 = new ImageIcon(scaleImage);
//            jLabel1.setIcon(imageIcon1);
//            this.add(image);
//
//            jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
//                public void mouseClicked(java.awt.event.MouseEvent evt) {
//                    removeAll();
//                    GameWindow gw = new GameWindow();
//                    MainFrame.this.add(gw);
//
//                }
//            });
//
//            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//            getContentPane().setLayout(layout);
//            layout.setHorizontalGroup(
//                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                    .addGap(143, 143, 143)
//                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                    .addGap(143, 143, 143))
//
//                            .addGroup(layout.createSequentialGroup()
//                                    .addGap(203, 203, 203)
//                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                    .addContainerGap(220, Short.MAX_VALUE))
//            );
//            layout.setVerticalGroup(
//                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                                    .addGap(16, 16, 16)
//                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
//                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                    .addGap(77, 77, 77))
//            );
//
//            pack();
//
//        }
//
//
//        public static void main(String[] args) {
//            EventQueue.invokeLater(() -> {
//                try {
//                    MainFrame frame = new MainFrame();
//                    frame.setVisible(true);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//}
//
//}
