import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main()  {
        setTitle("Snake Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();

    }
}
