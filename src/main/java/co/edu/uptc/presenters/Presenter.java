package co.edu.uptc.presenters;

import co.edu.uptc.views.Button;
import co.edu.uptc.views.IoManager;

public class Presenter {
    public static void main(String[] args) {
        
        IoManager ioObject = new IoManager();
        ioObject.setVisible(true);

        Button button = new Button();
        button.setVisible(true);

    }
}
