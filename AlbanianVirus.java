
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AlbanianVirus {

    public static void main(String[] args) {
        String text= "Hi, I am an Albanian virus but because of poor technology in my \n" +
            "country unfortunately I am not able to harm your computer. Please be \n" +
            "so kind to delete one of your important files yourself and then forward \n" +
            "me to other users. Many thanks for your cooperation! Best \n" +
            "regards,Albanian virus";
        String[] options= { "Yes", "No", "Sorry, Cancel" };
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        int x= JOptionPane.showOptionDialog(frame, text,
            "Virus Alert !",
            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
        System.out.println(x);

    }

}
