import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;

import java.io.IOException;
import java.sql.SQLException;

public class CECS343Project {
    public static void main(String[] args) {
        MyTunesGUI player = new MyTunesGUI();
        player.setVisible(true);
    }
}
