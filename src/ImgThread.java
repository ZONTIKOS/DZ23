public class ImgThread implements Runnable{
    Hero hero;
    private final int imgStep = 70;

    ImgThread(Hero hero){
        this.hero = hero;
    }
    public void run(){
        if (hero.yake == 0) {
            hero.right = true;
            hero.y = 0;
            hero.x = 0;
            for (int i = 1; i < 9; i++) {
                hero.setBounds(hero.getX()+10, hero.getY(), hero.getWidth(), hero.getHeight());
                hero.x -= imgStep;
                hero.repaint();
                try {
                    Thread.sleep(1000 / 7);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            hero.x = 0;
            hero.repaint();
        }
        if (hero.yake == 1) {
            hero.right = false;
            hero.x = -560;
            hero.y = 0;
            for (int i = 1; i < 8; i++) {
                hero.setBounds(hero.getX()-10, hero.getY(), hero.getWidth(), hero.getHeight());
                hero.x += imgStep;
                hero.repaint();
                try {
                    Thread.sleep(1000 / 7);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            hero.x = 0;
            hero.repaint();
        }
        if (hero.yake == 2) {
            hero.right = true;
            hero.y = -70;
            hero.x = -350;
            for (int i = 1; i < 7; i++) {

                hero.setBounds(hero.getX()+5, hero.getY(), hero.getWidth(), hero.getHeight());
                hero.x -= imgStep;
                hero.repaint();
                try {
                    Thread.sleep(1000 / 7);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            try {
                Thread.sleep(1000 / 7);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hero.y = 0;
            hero.x = 0;
            hero.repaint();
        }
        if (hero.yake == 3) {
            hero.right = true;
            hero.x = 0;
            hero.y = -700;

            for (int i = 1; i < 9; i++) {
                hero.setBounds(hero.getX()+15, hero.getY(), hero.getWidth(), hero.getHeight());
                hero.x -= imgStep;
                hero.repaint();
                try {
                    Thread.sleep(1000 / 7);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            try {
                Thread.sleep(1000 / 7);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hero.x = 0;
            hero.repaint();
        }
        if (hero.yake == 4) {
            hero.right = true;
            hero.x = 0;
            hero.y = -140;

            for (int i = 1; i < 6; i++) {

                hero.x -= imgStep;
                hero.repaint();
                try {
                    Thread.sleep(1000 / 7);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            try {
                Thread.sleep(1000 / 7);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hero.y = -70;
            hero.x = -280;
            hero.repaint();
            System.out.println(hero.getX());
            System.out.println(hero.getY());
            try {
                Thread.sleep(1000 / 7);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hero.y = 0;
            hero.x = 0;
            hero.repaint();
        }
        if (hero.yake == 5) {
            hero.x = 0;
            hero.y = -700;
            hero.right = false;
            for (int i = 1; i < 9; i++) {
                hero.setBounds(hero.getX()-15, hero.getY(), hero.getWidth(), hero.getHeight());
                hero.x -= imgStep;
                hero.repaint();
                try {
                    Thread.sleep(1000 / 7);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            try {
                Thread.sleep(1000 / 7);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hero.x = 0;
            hero.repaint();
        }
        if (hero.yake == 6) {
            int k = 0;
            hero.right = false;
            hero.x = 0;
            hero.y = -140;
            int ee = -140;
            k = 0;
            for (int i = 1; i < 6; i++) {
                hero.setBounds(hero.getX()- 10 , hero.getY(), hero.getWidth(), hero.getHeight());
                if (k < 3) {
                    hero.setBounds(hero.getX() , hero.getY()-10, hero.getWidth(), hero.getHeight());
                    k ++;
                }else {
                    hero.setBounds(hero.getX(), hero.getY() + 15, hero.getWidth(), hero.getHeight());
                    k++;
                }
                    hero.x -= imgStep;
                    hero.repaint();
                try {
                    Thread.sleep(1000 / 7);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            try {
                Thread.sleep(1000 / 7);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            hero.y = 0;
            hero.x = 0;
            hero.repaint();
        }
    }
}
