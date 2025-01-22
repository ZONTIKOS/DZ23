import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame implements ActionListener {
    Settings(UI ui) {
        setSize(1080, 720);
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

        JTextArea Healthzmina = new JTextArea("Введіть Здоров'я");
        Healthzmina.setBounds(300, 250, 200, 50);
        add(Healthzmina);
        JButton primenitt = new JButton("Применити Здоров'я");
        add(primenitt);
        primenitt.setBounds(300, 300, 200, 50);
        primenitt.setVisible(true);
        primenitt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.getHero().setLife(Integer.parseInt(Healthzmina.getText()));
                ui.gettext();
                ui.getHero().setFocusable(true);
                ui.getHero().requestFocusInWindow();
            }
        });

        JTextArea Speed = new JTextArea("Введіть Швидкість");
        Speed.setBounds(300, 450, 200, 50);
        add(Speed);
        JButton primenit2 = new JButton("Применити Швидкість");
        add(primenit2);

        primenit2.setBounds(300, 500, 200, 50);
        primenit2.setVisible(true);
        primenit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ui.getHero().setSpeedX(Integer.parseInt(Speed.getText()));
                ui.getHero().setFocusable(true);
                ui.getHero().requestFocusInWindow();
            }
        });
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}