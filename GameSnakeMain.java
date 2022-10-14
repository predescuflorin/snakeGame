import javax.swing.*;

public class GameSnakeMain extends JFrame {
    /**
     *
     */
    // private static final long serialVersionUID = 1L;

    GameSnakeMain() {
        this.add(new GameAction());
        this.setTitle("SNAKE- v1122");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new GameSnakeMain();


    }

}