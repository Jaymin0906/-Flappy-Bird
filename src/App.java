import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 460;
        int boardHeight = 740;

        JFrame frame = new JFrame("my Bird game");
        frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true); 
    }
}