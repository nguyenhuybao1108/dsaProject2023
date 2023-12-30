package UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import chess.Board;
import chess.GamePanel;

import javax.imageio.ImageIO;
import javax.swing.*;


public class GameWindow {
    private JFrame gameWindow;

    int undoMove;


//    public Clock blackClock;
//    public Clock whiteClock;

    private Timer timer;

    private GamePanel GP;

    public GameWindow(String blackName, String whiteName, GamePanel GP) {
         this.GP = GP;


//        blackClock = new Clock(hh, ss, mm);
//        whiteClock = new Clock(hh, ss, mm);

        gameWindow = new JFrame("Chess");

        try {
            Image whiteImg = ImageIO.read(new File("resources/wp.png"));
            gameWindow.setIconImage(whiteImg);
        } catch (Exception e) {
            System.out.println("Game file wp.png not found");
        }

        gameWindow.setLocation(300, 100);

        gameWindow.setLayout(new BorderLayout(30, 20));

        // Game Data window
        JPanel gameData = gameDataPanel(blackName, whiteName);
        gameData.setSize(gameData.getPreferredSize());

        gameWindow.add(gameData, BorderLayout.NORTH);

        gameWindow.add(GP, BorderLayout.CENTER);

        gameWindow.add(downButtons(), BorderLayout.SOUTH);
        gameWindow.add(sideButtons(), BorderLayout.EAST);

        gameWindow.setMinimumSize(gameWindow.getPreferredSize());
        gameWindow.setResizable(true);
        gameWindow.setSize(1000, 700);

        // gameWindow.pack();
        gameWindow.setVisible(true);
        gameWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

// Helper function to create data panel

    private JPanel gameDataPanel(final String bn, final String wn) {

        JPanel gameData = new JPanel();
        gameData.setLayout(new GridLayout(4, 2, 0, 0));


        // PLAYER NAMES

        JLabel w = new JLabel(wn);
        JLabel b = new JLabel(bn);

        w.setHorizontalAlignment(JLabel.CENTER);
        w.setVerticalAlignment(JLabel.CENTER);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setVerticalAlignment(JLabel.CENTER);

        w.setSize(w.getMinimumSize());
        b.setSize(b.getMinimumSize());

        gameData.add(w);
        gameData.add(b);

        // CLOCKS

//        final JLabel bTime = new JLabel(blackClock.getTime());
//        final JLabel wTime = new JLabel(whiteClock.getTime());

//        bTime.setHorizontalAlignment(JLabel.CENTER);
//        bTime.setVerticalAlignment(JLabel.CENTER);
//        wTime.setHorizontalAlignment(JLabel.CENTER);
//        wTime.setVerticalAlignment(JLabel.CENTER);

//        if (!(hh == 0 && mm == 0 && ss == 0)) {
//            timer = new Timer(1000, null);
//            timer.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    boolean turn = board.getTurn();
//
//                    if (turn) {
//                        whiteClock.decr();
//                        wTime.setText(whiteClock.getTime());
//
//                        if (whiteClock.outOfTime()) {
//                            timer.stop();
//                            int n = JOptionPane.showConfirmDialog(
//                                    gameWindow,
//                                    bn + " wins by time! Play a new game? \n" +
//                                            "Choosing \"No\" quits the game.",
//                                    bn + " wins!",
//                                    JOptionPane.YES_NO_OPTION);
//
//                            if (n == JOptionPane.YES_OPTION) {
//                                new GameWindow(bn, wn, hh, mm, ss);
//                                gameWindow.dispose();
//                            } else gameWindow.dispose();
//                        }
//                    } else {
//                        blackClock.decr();
//                        bTime.setText(blackClock.getTime());
//
//                        if (blackClock.outOfTime()) {
//                            timer.stop();
//                            int n = JOptionPane.showConfirmDialog(
//                                    gameWindow,
//                                    wn + " wins by time! Play a new game? \n" +
//                                            "Choosing \"No\" quits the game.",
//                                    wn + " wins!",
//                                    JOptionPane.YES_NO_OPTION);
//
//                            if (n == JOptionPane.YES_OPTION) {
//                                new GameWindow(bn, wn, hh, mm, ss);
//                                gameWindow.dispose();
//                            } else gameWindow.dispose();
//                        }
//                    }
//                }
//            });
//            timer.start();
//        } else {
//            wTime.setText("Untimed game");
//            bTime.setText("Untimed game");
//        }
//
//        gameData.add(wTime);
//        gameData.add(bTime);
//
//        gameData.setPreferredSize(gameData.getMinimumSize());
//
       return gameData;
//    }
    }

    private JPanel downButtons() {

        JPanel downButtons = new JPanel();
        downButtons.setLayout(new GridLayout(1, 4, 10, 10));

        final JButton quit = new JButton("Quit");

        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(
                        gameWindow,
                        "Are you sure you want to quit?",
                        "Confirm quit", JOptionPane.YES_NO_OPTION);

                if (n == JOptionPane.YES_OPTION) {
                    if (timer != null) timer.stop();
                    gameWindow.dispose();
                }
            }
        });

        final JButton nGame = new JButton("New game");

        nGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(
                        gameWindow,
                        "Are you sure you want to begin a new game?",
                        "Confirm new game", JOptionPane.YES_NO_OPTION);

                if (n == JOptionPane.YES_OPTION) {
                    SwingUtilities.invokeLater(new StartMenu());
                    gameWindow.dispose();
                }
            }
        });

        final JButton instr = new JButton("How to play");

        instr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(gameWindow,
                        "Move the chess pieces on the board by clicking\n"
                                + "and dragging. The game will watch out for illegal\n"
                                + "moves. You can win either by your opponent running\n"
                                + "out of time or by checkmating your opponent.\n"
                                + "\nGood luck, hope you enjoy the game!",
                        "How to play",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });



        downButtons.add(instr);
        downButtons.add(nGame);
        downButtons.add(quit);

        downButtons.setPreferredSize(downButtons.getMinimumSize());

        return downButtons;
    }

    private JPanel sideButtons() {
        JPanel sideButtons = new JPanel();
        sideButtons.setLayout(new GridLayout(7, 5, 10, 10));

        final JButton undo = new JButton("Undo");

        undo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                undoMove++;
                GP.Undo(undoMove);
                GP.repaint();
            }
        });

        final JButton redo = new JButton("Redo");

        undo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        sideButtons.add(undo);
        sideButtons.add(redo);
        sideButtons.setSize(200, 100);
        //sideButtons.setPreferredSize(sideButtons.getMinimumSize());

        return sideButtons;
    }
//    public void checkmateOccurred(int c) {
//        if (c == 0) {
//            if (timer != null) timer.stop();
//            int n = JOptionPane.showConfirmDialog(
//                    gameWindow,
//                    "White wins by checkmate! Set up a new game? \n" +
//                            "Choosing \"No\" lets you look at the final situation.",
//                    "White wins!",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (n == JOptionPane.YES_OPTION) {
//                SwingUtilities.invokeLater(new StartMenu());
//                gameWindow.dispose();
//            }
//        } else {
//            if (timer != null) timer.stop();
//            int n = JOptionPane.showConfirmDialog(
//                    gameWindow,
//                    "Black wins by checkmate! Set up a new game? \n" +
//                            "Choosing \"No\" lets you look at the final situation.",
//                    "Black wins!",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (n == JOptionPane.YES_OPTION) {
//                SwingUtilities.invokeLater(new StartMenu());
//                gameWindow.dispose();
//            }
        }
