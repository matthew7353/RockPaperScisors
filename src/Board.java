import javax.swing.*;

public class Board {
    JFrame frame;
    public Board(){
        frame = new JFrame("Rock Paper Scissors");
        setParameters();
    }

    private void setParameters (){
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setVisible(true);
    }
}
