import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actions {

    public static class actionForButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("On me pressed");
        }
    }


}
