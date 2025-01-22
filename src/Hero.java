import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class Hero extends JButton implements ActionListener, KeyListener {
    boolean right = true;
    Image image;
    int x = 0;
    int yake = 0;
    ImgThread imgThread;
    int y = 0;
    int life = 100;
    int speedX = 1;
    public int getSpeedX() {
        return speedX;
    }
    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }
    public Hero(String path) {

        setLayout(null);
        addActionListener(this);
        addKeyListener(this);
        setFocusable(true);

        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        imgThread = new ImgThread(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        if (image != null) {
            if (!right) {
                g2d.scale(-1, 1);
            }
            g2d.drawImage(image, x, y, 900, 900, this);
        } else {
            g2d.setColor(Color.RED);
            g2d.drawString("Не вдалося завантажити зображення!", 50, 50);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        imgThread.run();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Thread thread = new Thread(imgThread, "New Thread");

        if(!thread.isAlive()) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                yake = 0;
                thread.start();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
            yake = 1;
            thread.start();
        }
        if(e.getKeyCode() == KeyEvent.VK_C){
            yake = 2;
            thread.start();
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            yake = 3;
            thread.start();
        }
        if(e.getKeyCode() == KeyEvent.VK_E){
            yake = 4;
            thread.start();
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            yake = 5;
            thread.start();
        }
        if(e.getKeyCode() == KeyEvent.VK_Q){
            yake = 6;
            thread.start();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {}
}