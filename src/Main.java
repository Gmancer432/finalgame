import javax.swing.*;

public class Main
{
    public static void main(String[]args) {
        JFrame frame = new JFrame("hello");
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Sprite sprite = new Sprite() {
            @Override
            public void move() {

            }
        };
        sprite.changeImage("movinglog.png");
        sprite.setSize(50,50);
        sprite.setLocation(50, 50);
        frame.add(sprite);

        frame.setVisible(true);
    }

}