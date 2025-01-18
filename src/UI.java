import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame  {

    private Hero hero;

    public Hero getHero() {
        return hero;
    }

    UI (){


        setSize(1920, 1080);
        setLayout( null);
        hero = new Hero("src/sd.png");
        hero.setBounds(100, 200, 70, 70);

        add(hero);
        setVisible(true);

        //---------------------------------
        JButton settings = new JButton("Settings");
        settings.setBounds(1800, 50, 100, 100);
        add(settings);
        settings.setVisible(true);
        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Settings(UI.this);
                getHero().setFocusable(false);
                getHero().requestFocusInWindow();
            }
        });
        //---------------------------------
        JButton exit = new JButton("Exit");
        exit.setBounds(1800, 200, 100, 100);
        add(exit);
        exit.setVisible(true);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                getHero().setFocusable(false);
                getHero().requestFocusInWindow();
            }
        });
        //---------------------------------


    }
}
