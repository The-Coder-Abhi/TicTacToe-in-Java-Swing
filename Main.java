import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.Math;

public class Main {
  static JFrame f;
  static JLabel S1;
  static JLabel S2;
  static int Player = 1;
  static int score1 = 0;
  static int score2 = 0;
  static JLabel L1;
  static JButton b1;
  static JButton b2;
  static JButton b3;
  static JButton b4;
  static JButton b5;
  static JButton b6;
  static JButton b7;
  static JButton b8;
  static JButton b9;

  static void check(int a[], int b[], int c[]) {
    int win = 0;
    if (a[0] == 1 && a[1] == 1 && a[2] == 1) {
      win = 1;
      b1.setBackground(Color.decode("#FC6A03"));
      b1.setForeground(Color.BLACK);
      b1.setFont(new Font("Arial", Font.BOLD, 19));
      b2.setBackground(Color.decode("#FC6A03"));
      b2.setForeground(Color.BLACK);
      b2.setFont(new Font("Arial", Font.BOLD, 19));
      b3.setBackground(Color.decode("#FC6A03"));
      b3.setForeground(Color.BLACK);
      b3.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 1 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (b[0] == 1 && b[1] == 1 && b[2] == 1) {
      win = 2;
      b1.setBackground(Color.decode("#FC6A03"));
      b1.setForeground(Color.BLACK);
      b1.setFont(new Font("Arial", Font.BOLD, 19));
      b2.setBackground(Color.decode("#FC6A03"));
      b2.setForeground(Color.BLACK);
      b2.setFont(new Font("Arial", Font.BOLD, 19));
      b3.setBackground(Color.decode("#FC6A03"));
      b3.setForeground(Color.BLACK);
      b3.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 2 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (a[0] == 1 && a[3] == 1 && a[6] == 1) {
      win = 1;
      b1.setBackground(Color.decode("#FC6A03"));
      b1.setForeground(Color.BLACK);
      b1.setFont(new Font("Arial", Font.BOLD, 19));
      b4.setBackground(Color.decode("#FC6A03"));
      b4.setForeground(Color.BLACK);
      b4.setFont(new Font("Arial", Font.BOLD, 19));
      b7.setBackground(Color.decode("#FC6A03"));
      b7.setForeground(Color.BLACK);
      b7.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 1 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (b[0] == 1 && b[3] == 1 && b[6] == 1) {
      win = 2;
      b1.setBackground(Color.decode("#FC6A03"));
      b1.setForeground(Color.BLACK);
      b1.setFont(new Font("Arial", Font.BOLD, 19));
      b4.setBackground(Color.decode("#FC6A03"));
      b4.setForeground(Color.BLACK);
      b4.setFont(new Font("Arial", Font.BOLD, 19));
      b7.setBackground(Color.decode("#FC6A03"));
      b7.setForeground(Color.BLACK);
      b7.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 2 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (a[0] == 1 && a[4] == 1 && a[8] == 1) {
      win = 1;
      b1.setBackground(Color.decode("#FC6A03"));
      b1.setForeground(Color.BLACK);
      b1.setFont(new Font("Arial", Font.BOLD, 19));
      b5.setBackground(Color.decode("#FC6A03"));
      b5.setForeground(Color.BLACK);
      b5.setFont(new Font("Arial", Font.BOLD, 19));
      b9.setBackground(Color.decode("#FC6A03"));
      b9.setForeground(Color.BLACK);
      b9.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 1 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (b[0] == 1 && b[4] == 1 && b[8] == 1) {
      win = 2;
      b1.setBackground(Color.decode("#FC6A03"));
      b1.setForeground(Color.BLACK);
      b1.setFont(new Font("Arial", Font.BOLD, 19));
      b5.setBackground(Color.decode("#FC6A03"));
      b5.setForeground(Color.BLACK);
      b5.setFont(new Font("Arial", Font.BOLD, 19));
      b9.setBackground(Color.decode("#FC6A03"));
      b9.setForeground(Color.BLACK);
      b9.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 2 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (a[2] == 1 && a[4] == 1 && a[6] == 1) {
      win = 1;
      b3.setBackground(Color.decode("#FC6A03"));
      b3.setForeground(Color.BLACK);
      b3.setFont(new Font("Arial", Font.BOLD, 19));
      b5.setBackground(Color.decode("#FC6A03"));
      b5.setForeground(Color.BLACK);
      b5.setFont(new Font("Arial", Font.BOLD, 19));
      b7.setBackground(Color.decode("#FC6A03"));
      b7.setForeground(Color.BLACK);
      b7.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 1 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (b[2] == 1 && b[4] == 1 && b[6] == 1) {
      win = 2;
      b3.setBackground(Color.decode("#FC6A03"));
      b3.setForeground(Color.BLACK);
      b3.setFont(new Font("Arial", Font.BOLD, 19));
      b5.setBackground(Color.decode("#FC6A03"));
      b5.setForeground(Color.BLACK);
      b5.setFont(new Font("Arial", Font.BOLD, 19));
      b7.setBackground(Color.decode("#FC6A03"));
      b7.setForeground(Color.BLACK);
      b7.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 2 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (a[3] == 1 && a[4] == 1 && a[5] == 1) {
      win = 1;
      b4.setBackground(Color.decode("#FC6A03"));
      b4.setForeground(Color.BLACK);
      b4.setFont(new Font("Arial", Font.BOLD, 19));
      b5.setBackground(Color.decode("#FC6A03"));
      b5.setForeground(Color.BLACK);
      b5.setFont(new Font("Arial", Font.BOLD, 19));
      b6.setBackground(Color.decode("#FC6A03"));
      b6.setForeground(Color.BLACK);
      b6.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 1 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (b[3] == 1 && b[4] == 1 && b[5] == 1) {
      win = 2;
      b4.setBackground(Color.decode("#FC6A03"));
      b4.setForeground(Color.BLACK);
      b4.setFont(new Font("Arial", Font.BOLD, 19));
      b5.setBackground(Color.decode("#FC6A03"));
      b5.setForeground(Color.BLACK);
      b5.setFont(new Font("Arial", Font.BOLD, 19));
      b6.setBackground(Color.decode("#FC6A03"));
      b6.setForeground(Color.BLACK);
      b6.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 2 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (a[1] == 1 && a[4] == 1 && a[7] == 1) {
      win = 1;
      b2.setBackground(Color.decode("#FC6A03"));
      b2.setForeground(Color.BLACK);
      b2.setFont(new Font("Arial", Font.BOLD, 19));
      b5.setBackground(Color.decode("#FC6A03"));
      b5.setForeground(Color.BLACK);
      b5.setFont(new Font("Arial", Font.BOLD, 19));
      b8.setBackground(Color.decode("#FC6A03"));
      b8.setForeground(Color.BLACK);
      b8.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 1 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (b[1] == 1 && b[4] == 1 && b[7] == 1) {
      win = 2;
      b2.setBackground(Color.decode("#FC6A03"));
      b2.setForeground(Color.BLACK);
      b2.setFont(new Font("Arial", Font.BOLD, 19));
      b5.setBackground(Color.decode("#FC6A03"));
      b5.setForeground(Color.BLACK);
      b5.setFont(new Font("Arial", Font.BOLD, 19));
      b8.setBackground(Color.decode("#FC6A03"));
      b8.setForeground(Color.BLACK);
      b8.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 2 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (a[2] == 1 && a[5] == 1 && a[8] == 1) {
      win = 1;
      b3.setBackground(Color.decode("#FC6A03"));
      b3.setForeground(Color.BLACK);
      b3.setFont(new Font("Arial", Font.BOLD, 19));
      b6.setBackground(Color.decode("#FC6A03"));
      b6.setForeground(Color.BLACK);
      b6.setFont(new Font("Arial", Font.BOLD, 19));
      b9.setBackground(Color.decode("#FC6A03"));
      b9.setForeground(Color.BLACK);
      b9.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 1 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (b[2] == 1 && b[5] == 1 && b[8] == 1) {
      win = 2;
      b3.setBackground(Color.decode("#FC6A03"));
      b3.setForeground(Color.BLACK);
      b3.setFont(new Font("Arial", Font.BOLD, 19));
      b6.setBackground(Color.decode("#FC6A03"));
      b6.setForeground(Color.BLACK);
      b6.setFont(new Font("Arial", Font.BOLD, 19));
      b9.setBackground(Color.decode("#FC6A03"));
      b9.setForeground(Color.BLACK);
      b9.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 2 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (a[6] == 1 && a[7] == 1 && a[8] == 1) {
      win = 1;
      b7.setBackground(Color.decode("#FC6A03"));
      b7.setForeground(Color.BLACK);
      b7.setFont(new Font("Arial", Font.BOLD, 19));
      b8.setBackground(Color.decode("#FC6A03"));
      b8.setForeground(Color.BLACK);
      b8.setFont(new Font("Arial", Font.BOLD, 19));
      b9.setBackground(Color.decode("#FC6A03"));
      b9.setForeground(Color.BLACK);
      b9.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 1 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (b[6] == 1 && b[7] == 1 && b[8] == 1) {
      win = 2;
      b7.setBackground(Color.decode("#FC6A03"));
      b7.setForeground(Color.BLACK);
      b7.setFont(new Font("Arial", Font.BOLD, 19));
      b8.setBackground(Color.decode("#FC6A03"));
      b8.setForeground(Color.BLACK);
      b8.setFont(new Font("Arial", Font.BOLD, 19));
      b9.setBackground(Color.decode("#FC6A03"));
      b9.setForeground(Color.BLACK);
      b9.setFont(new Font("Arial", Font.BOLD, 19));
      JOptionPane.showMessageDialog(f, "Player 2 won", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    } else if (c[0] == 1 && c[1] == 1 && c[2] == 1 && c[3] == 1 && c[4] == 1 && c[5] == 1 && c[6] == 1 && c[7] == 1
        && c[8] == 1) {
      JOptionPane.showMessageDialog(f, "Draw", "Game", JOptionPane.ERROR_MESSAGE);
      f.setSize(350, 350);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    }
    if (win > 0) {
      if(win==1)
      {
      score1 += 1;
      S1.setText("Player 1 : " + score1);
      }
      else
      {
        score2 += 1;
        S2.setText("Player 2 : " + score2);
      }
      b1.setText(" ");
      b1.setBackground(Color.decode("#000000"));
      b1.setForeground(Color.WHITE);
      b2.setText(" ");
      b2.setBackground(Color.decode("#000000"));
      b2.setForeground(Color.WHITE);
      b3.setText(" ");
      b3.setBackground(Color.decode("#000000"));
      b3.setForeground(Color.WHITE);
      b4.setText(" ");
      b4.setBackground(Color.decode("#000000"));
      b4.setForeground(Color.WHITE);
      b5.setText(" ");
      b5.setBackground(Color.decode("#000000"));
      b5.setForeground(Color.WHITE);
      b6.setText(" ");
      b6.setBackground(Color.decode("#000000"));
      b6.setForeground(Color.WHITE);
      b7.setText(" ");
      b7.setBackground(Color.decode("#000000"));
      b7.setForeground(Color.WHITE);
      b8.setText(" ");
      b8.setBackground(Color.decode("#000000"));
      b8.setForeground(Color.WHITE);
      b9.setText(" ");
      b9.setBackground(Color.decode("#000000"));
      b9.setForeground(Color.WHITE);
      for (int i = 0; i <= 8; i++) {
        c[i] = 0;
        a[i] = 0;
        b[i] = 0;
      }
    }
  }

  public static void PlayerCheck(int a, int b) {
    if (a == 1) {
      if (b == 1) {
        L1.setText("Player 1 with X");
      } else {
        L1.setText("Player 1 with O");
      }
    } else {
      if (b == 1) {
        L1.setText("Player 2 with O");
      } else {
        L1.setText("Player 2 with X");
      }
    }

  }

  public static void main(String[] args) {
    S1 = new JLabel("Player 1: " + score1);
    S2 = new JLabel("Player 2: " + score2);
    L1 = new JLabel(" ");
    L1.setBounds(10, 10, 150, 30);
    S1.setBounds(10, 290, 100, 60);
    S2.setBounds(250, 290, 100, 60);
    S1.setFont(new Font("Ariel",Font.BOLD,15));
    S2.setFont(new Font("Ariel",Font.BOLD,15));
    int rand = (int) (Math.random() * 2 + 1);
    System.out.println(rand);
    f = new JFrame();// creating instance of JFrame
    int[] P1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] P2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] B = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    f.add(L1);
    PlayerCheck(Player, rand);
    // Position No. 1
    b1 = new JButton(" ");
    b1.setBounds(100, 50, 50, 50);
    b1.setBackground(Color.decode("#000000"));
    b1.setForeground(Color.WHITE);
    b1.setFont(new Font("Arial", Font.PLAIN, 20));

    // Position No. 2
    b2 = new JButton(" ");
    b2.setBounds(160, 50, 50, 50);
    b2.setBackground(Color.decode("#000000"));
    b2.setForeground(Color.WHITE);
    b2.setFont(new Font("Arial", Font.PLAIN, 20));

    // Position No. 3
    b3 = new JButton(" ");
    b3.setBounds(220, 50, 50, 50);
    b3.setBackground(Color.decode("#000000"));
    b3.setForeground(Color.WHITE);
    b3.setFont(new Font("Arial", Font.PLAIN, 20));

    // Position No. 4
    b4 = new JButton(" ");
    b4.setBounds(100, 110, 50, 50);
    b4.setBackground(Color.decode("#000000"));
    b4.setForeground(Color.WHITE);
    b4.setFont(new Font("Arial", Font.PLAIN, 20));

    // Position No. 5
    b5 = new JButton(" ");
    b5.setBounds(160, 110, 50, 50);
    b5.setBackground(Color.decode("#000000"));
    b5.setForeground(Color.WHITE);
    b5.setFont(new Font("Arial", Font.PLAIN, 20));

    // Position No. 6
    b6 = new JButton(" ");
    b6.setBounds(220, 110, 50, 50);
    b6.setBackground(Color.decode("#000000"));
    b6.setForeground(Color.WHITE);
    b6.setFont(new Font("Arial", Font.PLAIN, 20));

    // Position No. 7
    b7 = new JButton(" ");
    b7.setBounds(100, 170, 50, 50);
    b7.setBackground(Color.decode("#000000"));
    b7.setForeground(Color.WHITE);
    b7.setFont(new Font("Arial", Font.PLAIN, 20));

    // Position No. 8
    b8 = new JButton(" ");
    b8.setBounds(160, 170, 50, 50);
    b8.setBackground(Color.decode("#000000"));
    b8.setForeground(Color.WHITE);
    b8.setFont(new Font("Arial", Font.PLAIN, 20));

    // Position No. 9
    b9 = new JButton(" ");
    b9.setBounds(220, 170, 50, 50);
    b9.setBackground(Color.decode("#000000"));
    b9.setForeground(Color.WHITE);
    b9.setFont(new Font("Arial", Font.PLAIN, 20));

    // Score Reset Button
    JButton ResetS = new JButton("Restart");
    ResetS.setBounds(137, 230, 100, 50);
    ResetS.setBackground(Color.decode("#FC6A03"));
    ResetS.setForeground(Color.BLACK);
    ResetS.setFont(new Font("Arial", Font.BOLD, 15));

    f.add(b1);// adding button in JFrame
    f.add(b2);// adding button in JFrame
    f.add(b3);// adding button in JFrame
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(ResetS);
    f.add(L1);
    f.add(S1);
    f.add(S2);
    f.setSize(400, 500);// 400 width and 500 height
    f.setLayout(null);// using no layout managers
    f.setVisible(true);// making the frame visible
    // while(win==0)
    // Button1 ActionListener
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b1.setText("X");
          P1[0] = 1;
          B[0] = 1;
          Player += 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b1.setText("O");
          P1[0] = 1;
          B[0] = 1;
          Player += 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 2 && rand == 1) {
          b1.setText("O");
          P2[0] = 1;
          Player -= 1;
          B[0] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b1.setText("X");
          P2[0] = 1;
          Player -= 1;
          B[0] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    // Button2 ActionListener
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b2.setText("X");
          P1[1] = 1;
          Player += 1;
          B[1] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b2.setText("O");
          P1[1] = 1;
          Player += 1;
          B[1] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 2 && rand == 1) {
          b2.setText("O");
          P2[1] = 1;
          Player -= 1;
          B[1] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b2.setText("X");
          P2[1] = 1;
          Player -= 1;
          B[1] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    // Button3 ActionListener
    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b3.setText("X");
          P1[2] = 1;
          Player += 1;
          B[2] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b3.setText("O");
          P1[2] = 1;
          Player += 1;
          B[2] = 1;
          check(P1, P2, B);
        } else if (Player == 2 && rand == 1) {
          b3.setText("O");
          P2[2] = 1;
          Player -= 1;
          B[2] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b3.setText("X");
          P2[2] = 1;
          Player -= 1;
          B[2] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    // Button4 ActionListener
    b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b4.setText("X");
          P1[3] = 1;
          Player += 1;
          B[3] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b4.setText("O");
          P1[3] = 1;
          Player += 1;
          B[3] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 2 && rand == 1) {
          b4.setText("O");
          P2[3] = 1;
          Player -= 1;
          B[3] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b4.setText("X");
          P2[3] = 1;
          Player -= 1;
          B[3] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    // Button5 ActionListener
    b5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b5.setText("X");
          P1[4] = 1;
          Player += 1;
          B[4] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b5.setText("O");
          P1[4] = 1;
          Player += 1;
          B[4] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 2 && rand == 1) {
          b5.setText("O");
          P2[4] = 1;
          Player -= 1;
          B[4] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b5.setText("X");
          P2[4] = 1;
          Player -= 1;
          B[4] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    // Button6 ActionListener
    b6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b6.setText("X");
          P1[5] = 1;
          Player += 1;
          B[5] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b6.setText("O");
          P1[5] = 1;
          Player += 1;
          B[5] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 2 && rand == 1) {
          b6.setText("O");
          P2[5] = 1;
          Player -= 1;
          B[5] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b6.setText("X");
          P2[5] = 1;
          Player -= 1;
          B[5] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    // Button7 ActionListener
    b7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b7.setText("X");
          P1[6] = 1;
          Player += 1;
          B[6] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b7.setText("O");
          P1[6] = 1;
          Player += 1;
          B[6] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 2 && rand == 1) {
          b7.setText("O");
          P2[6] = 1;
          Player -= 1;
          B[6] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b7.setText("X");
          P2[6] = 1;
          Player -= 1;
          B[6] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    // Button8 ActionListener
    b8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b8.setText("X");
          P1[7] = 1;
          Player += 1;
          B[7] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b8.setText("O");
          P1[7] = 1;
          Player += 1;
          B[7] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 2 && rand == 1) {
          b8.setText("O");
          P2[7] = 1;
          Player -= 1;
          B[7] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b8.setText("X");
          P2[7] = 1;
          Player -= 1;
          B[7] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    // Button9 ActionListener
    b9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (Player == 1 && rand == 1) {
          b9.setText("X");
          P1[8] = 1;
          Player += 1;
          B[8] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 1 && rand == 2) {
          b9.setText("O");
          P1[8] = 1;
          Player += 1;
          B[8] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else if (Player == 2 && rand == 1) {
          b9.setText("O");
          P2[8] = 1;
          Player -= 1;
          B[8] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        } else {
          b9.setText("X");
          P2[8] = 1;
          Player -= 1;
          B[8] = 1;
          check(P1, P2, B);
          PlayerCheck(Player, rand);
        }
      }
    });
    ResetS.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        score1 = 0;
        score2 = 0;
        Player = 1;
        S1.setText("Player 1:" + score1);
        S2.setText("Player 2:" + score2);
        b1.setText(" ");
        b1.setBackground(Color.decode("#000000"));
        b1.setForeground(Color.WHITE);
        b2.setText(" ");
        b2.setBackground(Color.decode("#000000"));
        b2.setForeground(Color.WHITE);
        b3.setText(" ");
        b3.setBackground(Color.decode("#000000"));
        b3.setForeground(Color.WHITE);
        b4.setText(" ");
        b4.setBackground(Color.decode("#000000"));
        b4.setForeground(Color.WHITE);
        b5.setText(" ");
        b5.setBackground(Color.decode("#000000"));
        b5.setForeground(Color.WHITE);
        b6.setText(" ");
        b6.setBackground(Color.decode("#000000"));
        b6.setForeground(Color.WHITE);
        b7.setText(" ");
        b7.setBackground(Color.decode("#000000"));
        b7.setForeground(Color.WHITE);
        b8.setText(" ");
        b8.setBackground(Color.decode("#000000"));
        b8.setForeground(Color.WHITE);
        b9.setText(" ");
        b9.setBackground(Color.decode("#000000"));
        b9.setForeground(Color.WHITE);
        for (int i = 0; i <= 8; i++) {
          B[i] = 0;
          P1[i] = 0;
          P2[i] = 0;
        }
        PlayerCheck(Player, rand);
      }
    });
  }

}
