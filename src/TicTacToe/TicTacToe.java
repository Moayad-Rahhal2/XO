package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TicTacToe extends JFrame {
JFrame frame;
JPanel labelPanel,buttonsPanel;
JLabel label;
JButton[] buttons=new JButton[9];
boolean xTurn;
Random random;


TicTacToe(){
    frame=new JFrame("XO Game");
    frame.setSize(630,700);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setLocationRelativeTo(null);
    labelPanel=new JPanel(new FlowLayout(FlowLayout.CENTER,0,20));
    label=new JLabel();
    label.setOpaque(true);
    label.setBackground(Color.BLACK);
    label.setForeground(Color.GREEN);
    label.setFont(new Font("Ink Free",Font.PLAIN,35));
    labelPanel.setBounds(0,0,630,70);
    labelPanel.setOpaque(true);
    labelPanel.setBackground(Color.BLACK);
    labelPanel.add(label);
    frame.add(labelPanel);

    random=new Random();
    xTurn=random.nextBoolean();
    if (xTurn){
        label.setText("X Turn");
    } else {
        label.setText("O Turn");
    }
    buttonsPanel=new JPanel(new GridLayout(3,3));

    for (int i=0;i<buttons.length;i++){
        buttons[i]=new JButton();
        buttonsPanel.add(buttons[i]);
        buttons[i].setSize(new Dimension(70,70));
        buttons[i].setFont(new Font("Ink Free",Font.BOLD,30));
        buttons[i].setOpaque(true);
    }
    buttonsPanel.setBounds(0,70,630,630);
    frame.add(buttonsPanel);


    buttons[0].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[0].setText("X");
            buttons[0].setEnabled(false);
            buttons[0].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[0].setText("O");
            buttons[0].setEnabled(false);
            buttons[0].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });
    buttons[1].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[1].setText("X");
            buttons[1].setEnabled(false);
            buttons[1].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[1].setText("O");
            buttons[1].setEnabled(false);
            buttons[1].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });
    buttons[2].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[2].setText("X");
            buttons[2].setEnabled(false);
            buttons[2].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[2].setText("O");
            buttons[2].setEnabled(false);
            buttons[2].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });
    buttons[3].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[3].setText("X");
            buttons[3].setEnabled(false);
            buttons[3].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[3].setText("O");
            buttons[3].setEnabled(false);
            buttons[3].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });
    buttons[4].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[4].setText("X");
            buttons[4].setEnabled(false);
            buttons[4].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[4].setText("O");
            buttons[4].setEnabled(false);
            buttons[4].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });
    buttons[5].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[5].setText("X");
            buttons[5].setEnabled(false);
            buttons[5].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[5].setText("O");
            buttons[5].setEnabled(false);
            buttons[5].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });
    buttons[6].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[6].setText("X");
            buttons[6].setEnabled(false);
            buttons[6].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[6].setText("O");
            buttons[6].setEnabled(false);
            buttons[6].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });
    buttons[7].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[7].setText("X");
            buttons[7].setEnabled(false);
            buttons[7].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[7].setText("O");
            buttons[7].setEnabled(false);
            buttons[7].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });
    buttons[8].addActionListener(e -> {
        if (xTurn) {
            label.setText("O Turn");
            buttons[8].setText("X");
            buttons[8].setEnabled(false);
            buttons[8].setBackground(Color.RED);
            xTurn=false;
        } else {
            label.setText("X Turn");
            buttons[8].setText("O");
            buttons[8].setEnabled(false);
            buttons[8].setBackground(Color.BLUE);
            xTurn=true;
        }
        check();
    });


}
private void check(){
    if (buttons[0].getText()=="X" && buttons[1].getText()=="X" && buttons[2].getText()=="X"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("X Win");
        }
        buttons[0].setBackground(Color.RED);
        buttons[1].setBackground(Color.RED);
        buttons[2].setBackground(Color.RED);
    }
    if (buttons[0].getText()=="O" && buttons[1].getText()=="O" && buttons[2].getText()=="O"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("O Win");
        }
        buttons[0].setBackground(Color.BLUE);
        buttons[1].setBackground(Color.BLUE);
        buttons[2].setBackground(Color.BLUE);
    }
    if (buttons[3].getText()=="X" && buttons[4].getText()=="X" && buttons[5].getText()=="X"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("X Win");
        }
        buttons[3].setBackground(Color.RED);
        buttons[4].setBackground(Color.RED);
        buttons[5].setBackground(Color.RED);
    }
    if (buttons[3].getText()=="O" && buttons[4].getText()=="O" && buttons[5].getText()=="O"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("O Win");
        }
        buttons[3].setBackground(Color.BLUE);
        buttons[4].setBackground(Color.BLUE);
        buttons[5].setBackground(Color.BLUE);
    }
    if (buttons[6].getText()=="X" && buttons[7].getText()=="X" && buttons[8].getText()=="X"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("X Win");
        }
        buttons[6].setBackground(Color.RED);
        buttons[7].setBackground(Color.RED);
        buttons[8].setBackground(Color.RED);
    }
    if (buttons[6].getText()=="O" && buttons[7].getText()=="O" && buttons[8].getText()=="O"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("O Win");
        }
        buttons[6].setBackground(Color.BLUE);
        buttons[7].setBackground(Color.BLUE);
        buttons[8].setBackground(Color.BLUE);
    }
    if (buttons[0].getText()=="X" && buttons[3].getText()=="X" && buttons[6].getText()=="X"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("X Win");
        }
        buttons[0].setBackground(Color.RED);
        buttons[3].setBackground(Color.RED);
        buttons[6].setBackground(Color.RED);
    }
    if (buttons[0].getText()=="O" && buttons[3].getText()=="O" && buttons[6].getText()=="O"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("O Win");
        }
        buttons[0].setBackground(Color.BLUE);
        buttons[3].setBackground(Color.BLUE);
        buttons[6].setBackground(Color.BLUE);
    }
    if (buttons[1].getText()=="X" && buttons[4].getText()=="X" && buttons[7].getText()=="X"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("X Win");
        }
        buttons[1].setBackground(Color.RED);
        buttons[4].setBackground(Color.RED);
        buttons[7].setBackground(Color.RED);
    }
    if (buttons[1].getText()=="O" && buttons[4].getText()=="O" && buttons[7].getText()=="O"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("O Win");
        }
        buttons[1].setBackground(Color.BLUE);
        buttons[4].setBackground(Color.BLUE);
        buttons[7].setBackground(Color.BLUE);
    }
    if (buttons[2].getText()=="X" && buttons[5].getText()=="X" && buttons[8].getText()=="X"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("X Win");
        }
        buttons[2].setBackground(Color.RED);
        buttons[5].setBackground(Color.RED);
        buttons[8].setBackground(Color.RED);
    }
    if (buttons[2].getText()=="O" && buttons[5].getText()=="O" && buttons[8].getText()=="O"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("O Win");
        }
        buttons[2].setBackground(Color.BLUE);
        buttons[5].setBackground(Color.BLUE);
        buttons[8].setBackground(Color.BLUE);
    }
    if (buttons[0].getText()=="X" && buttons[4].getText()=="X" && buttons[8].getText()=="X"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("X Win");
        }
        buttons[0].setBackground(Color.RED);
        buttons[4].setBackground(Color.RED);
        buttons[8].setBackground(Color.RED);
    }
    if (buttons[0].getText()=="O" && buttons[4].getText()=="O" && buttons[8].getText()=="O"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("O Win");
        }
        buttons[0].setBackground(Color.BLUE);
        buttons[4].setBackground(Color.BLUE);
        buttons[8].setBackground(Color.BLUE);
    }
    if (buttons[2].getText()=="X" && buttons[4].getText()=="X" && buttons[6].getText()=="X"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("X Win");
        }
        buttons[2].setBackground(Color.RED);
        buttons[4].setBackground(Color.RED);
        buttons[6].setBackground(Color.RED);
    }
    if (buttons[2].getText()=="O" && buttons[4].getText()=="O" && buttons[6].getText()=="O"){
        for (JButton button : buttons) {
            button.setBackground(Color.WHITE);
            button.setEnabled(false);
            label.setText("O Win");
        }
        buttons[2].setBackground(Color.BLUE);
        buttons[4].setBackground(Color.BLUE);
        buttons[6].setBackground(Color.BLUE);
    }

}
}
