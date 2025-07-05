import javax.swing.*;

public class App {

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ToDoListGui().setVisible(true);
                //setVisible(true)= sets the visibilty of the JFrame . Pass true to make it visible.
            }
        });
    }
}
