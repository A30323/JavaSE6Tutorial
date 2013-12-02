package onlyfun.caterpillar;

import java.awt.*;

public class SystemTrayDemo {
    public static void main(String[] args) {
        if(SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit()
                                 .getImage("musical_note_smile.gif");
            TrayIcon trayIcon = new TrayIcon(image, "JNotePad 1.0");
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("�L�k�[�J�t�Τu��C�ϥ�");
                e.printStackTrace();
            }
        } else {
            System.err.println("�L�k���o�t�Τu��C");
        }
    }
}