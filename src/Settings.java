import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame implements ActionListener {
    Settings(UI ui) {
        setSize(720, 480);
        setTitle("Настройки");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(156, 156, 156));
        setLocationRelativeTo(null);
        setResizable(false);
        setFocusable(true);
        setLayout(null);
        setVisible(true);
        JButton tima2 = new JButton("Чорна тема");
        JButton tima3 = new JButton("Біла тема");
        JButton tima4 = new JButton("Синя тема");
        JButton tima5 = new JButton("Червона тема");
        tima2.setBounds(0, 50, 200, 50);
        tima3.setBounds(0, 100, 200, 50);
        tima4.setBounds(0, 150, 200, 50);
        tima5.setBounds(0, 200, 200, 50);
        add(tima2);
        add(tima3);
        add(tima4);
        add(tima5);
        //-------------------------------------------
        JTextArea name = new JTextArea("Введіть ім'я");
        name.setBounds(300, 50, 200, 50);
        add(name);
        JButton primenit = new JButton("Применити ім'я");
        add(primenit);
        primenit.setBounds(300, 100, 200, 50);
        primenit.setVisible(true);
        primenit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.setTitle(name.getText());
                ui.getHero().setFocusable(true);
                ui.getHero().requestFocusInWindow();
            }
        });
        tima2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.getContentPane().setBackground(Color.BLACK);
                ui.getContentPane().setForeground(Color.BLACK);
                ui.getContentPane().repaint();
                ui.getHero().setFocusable(true);
                ui.getHero().requestFocusInWindow();
            }
        });
        //-------------------------------------------------
        tima3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.getContentPane().setBackground(Color.WHITE);
                ui.getContentPane().setForeground(Color.WHITE);
                ui.getContentPane().repaint();
                ui.getHero().setFocusable(true);
                ui.getHero().requestFocusInWindow();
            }
        });
        tima4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.getContentPane().setBackground(Color.BLUE);
                ui.getContentPane().setForeground(Color.BLUE);
                ui.getContentPane().repaint();
                ui.getHero().setFocusable(true);
                ui.getHero().requestFocusInWindow();
            }
        });
        tima5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.getContentPane().setBackground(Color.RED);
                ui.getContentPane().setForeground(Color.RED);
                ui.getContentPane().repaint();
                ui.getHero().setFocusable(true);
                ui.getHero().requestFocusInWindow();
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}