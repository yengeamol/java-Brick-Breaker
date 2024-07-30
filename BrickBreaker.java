package p2;
import javax.swing.JFrame;
import p2.GamePlay;
import p2.MapGenerator;
public class BrickBreaker {
        public static void main(String[] args) {
            JFrame obj = new JFrame();
            GamePlay gamePlay = new GamePlay();

            obj.setBounds(10, 10, 700, 600);
            obj.setTitle("Breakout Ball");
            obj.setResizable(false);
            obj.setVisible(true);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.add(gamePlay);
        }
    }