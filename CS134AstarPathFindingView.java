/** COPYRIGHT(C). Jonathan Sagabaen. All Rights Reserved.
    Java application that displays the A* path finding algorithm.
    @author Jonathan Sagabaen
    @version 4.0
*/
package cs134astarpathfinding;

import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class CS134AstarPathFindingView extends FrameView {

    public CS134AstarPathFindingView(SingleFrameApplication app) {
        super(app);

        initComponents();

        model = new Model();
        //for loop to attach each CustomBox to the model
        model.attach(cbA1);
        model.attach(cbA10);
        model.attach(cbA11);
        model.attach(cbA12);
        model.attach(cbA13);
        model.attach(cbA14);
        model.attach(cbA15);
        model.attach(cbA16);
        model.attach(cbA2);
        model.attach(cbA3);
        model.attach(cbA4);
        model.attach(cbA5);
        model.attach(cbA6);
        model.attach(cbA7);
        model.attach(cbA8);
        model.attach(cbA9);
        model.attach(cbB1);
        model.attach(cbB10);
        model.attach(cbB11);
        model.attach(cbB12);
        model.attach(cbB13);
        model.attach(cbB14);
        model.attach(cbB15);
        model.attach(cbB16);
        model.attach(cbB2);
        model.attach(cbB3);
        model.attach(cbB4);
        model.attach(cbB5);
        model.attach(cbB6);
        model.attach(cbB7);
        model.attach(cbB8);
        model.attach(cbB9);
        model.attach(cbC1);
        model.attach(cbC10);
        model.attach(cbC11);
        model.attach(cbC12);
        model.attach(cbC13);
        model.attach(cbC14);
        model.attach(cbC15);
        model.attach(cbC16);
        model.attach(cbC2);
        model.attach(cbC3);
        model.attach(cbC4);
        model.attach(cbC5);
        model.attach(cbC6);
        model.attach(cbC7);
        model.attach(cbC8);
        model.attach(cbC9);
        model.attach(cbD1);
        model.attach(cbD10);
        model.attach(cbD11);
        model.attach(cbD12);
        model.attach(cbD13);
        model.attach(cbD14);
        model.attach(cbD15);
        model.attach(cbD16);
        model.attach(cbD2);
        model.attach(cbD3);
        model.attach(cbD4);
        model.attach(cbD5);
        model.attach(cbD6);
        model.attach(cbD7);
        model.attach(cbD8);
        model.attach(cbD9);
        model.attach(cbE1);
        model.attach(cbE10);
        model.attach(cbE11);
        model.attach(cbE12);
        model.attach(cbE13);
        model.attach(cbE14);
        model.attach(cbE15);
        model.attach(cbE16);
        model.attach(cbE2);
        model.attach(cbE3);
        model.attach(cbE4);
        model.attach(cbE5);
        model.attach(cbE6);
        model.attach(cbE7);
        model.attach(cbE8);
        model.attach(cbE9);
        model.attach(cbF1);
        model.attach(cbF10);
        model.attach(cbF11);
        model.attach(cbF12);
        model.attach(cbF13);
        model.attach(cbF14);
        model.attach(cbF15);
        model.attach(cbF16);
        model.attach(cbF2);
        model.attach(cbF3);
        model.attach(cbF4);
        model.attach(cbF5);
        model.attach(cbF6);
        model.attach(cbF7);
        model.attach(cbF8);
        model.attach(cbF9);
        model.attach(cbG1);
        model.attach(cbG10);
        model.attach(cbG11);
        model.attach(cbG12);
        model.attach(cbG13);
        model.attach(cbG14);
        model.attach(cbG15);
        model.attach(cbG16);
        model.attach(cbG2);
        model.attach(cbG3);
        model.attach(cbG4);
        model.attach(cbG5);
        model.attach(cbG6);
        model.attach(cbG7);
        model.attach(cbG8);
        model.attach(cbG9);
        model.attach(cbH1);
        model.attach(cbH10);
        model.attach(cbH11);
        model.attach(cbH12);
        model.attach(cbH13);
        model.attach(cbH14);
        model.attach(cbH15);
        model.attach(cbH16);
        model.attach(cbH2);
        model.attach(cbH3);
        model.attach(cbH4);
        model.attach(cbH5);
        model.attach(cbH6);
        model.attach(cbH7);
        model.attach(cbH8);
        model.attach(cbH9);
        model.attach(cbI1);
        model.attach(cbI10);
        model.attach(cbI11);
        model.attach(cbI12);
        model.attach(cbI13);
        model.attach(cbI14);
        model.attach(cbI15);
        model.attach(cbI16);
        model.attach(cbI2);
        model.attach(cbI3);
        model.attach(cbI4);
        model.attach(cbI5);
        model.attach(cbI6);
        model.attach(cbI7);
        model.attach(cbI8);
        model.attach(cbI9);
        model.attach(cbJ1);
        model.attach(cbJ10);
        model.attach(cbJ11);
        model.attach(cbJ12);
        model.attach(cbJ13);
        model.attach(cbJ14);
        model.attach(cbJ15);
        model.attach(cbJ16);
        model.attach(cbJ2);
        model.attach(cbJ3);
        model.attach(cbJ4);
        model.attach(cbJ5);
        model.attach(cbJ6);
        model.attach(cbJ7);
        model.attach(cbJ8);
        model.attach(cbJ9);
        model.attach(cbK1);
        model.attach(cbK10);
        model.attach(cbK11);
        model.attach(cbK12);
        model.attach(cbK13);
        model.attach(cbK14);
        model.attach(cbK15);
        model.attach(cbK16);
        model.attach(cbK2);
        model.attach(cbK3);
        model.attach(cbK4);
        model.attach(cbK5);
        model.attach(cbK6);
        model.attach(cbK7);
        model.attach(cbK8);
        model.attach(cbK9);
        model.attach(cbL1);
        model.attach(cbL10);
        model.attach(cbL11);
        model.attach(cbL12);
        model.attach(cbL13);
        model.attach(cbL14);
        model.attach(cbL15);
        model.attach(cbL16);
        model.attach(cbL2);
        model.attach(cbL3);
        model.attach(cbL4);
        model.attach(cbL5);
        model.attach(cbL6);
        model.attach(cbL7);
        model.attach(cbL8);
        model.attach(cbL9);
        model.attach(cbM1);
        model.attach(cbM10);
        model.attach(cbM11);
        model.attach(cbM12);
        model.attach(cbM13);
        model.attach(cbM14);
        model.attach(cbM15);
        model.attach(cbM16);
        model.attach(cbM2);
        model.attach(cbM3);
        model.attach(cbM4);
        model.attach(cbM5);
        model.attach(cbM6);
        model.attach(cbM7);
        model.attach(cbM8);
        model.attach(cbM9);
        model.attach(cbN1);
        model.attach(cbN10);
        model.attach(cbN11);
        model.attach(cbN12);
        model.attach(cbN13);
        model.attach(cbN14);
        model.attach(cbN15);
        model.attach(cbN2);
        model.attach(cbN3);
        model.attach(cbN4);
        model.attach(cbN5);
        model.attach(cbN6);
        model.attach(cbN7);
        model.attach(cbN8);
        model.attach(cbN9);
        model.attach(cbO1);
        model.attach(cbO10);
        model.attach(cbO11);
        model.attach(cbO12);
        model.attach(cbO13);
        model.attach(cbO14);
        model.attach(cbO15);
        model.attach(cbO16);
        model.attach(cbO2);
        model.attach(cbO3);
        model.attach(cbO4);
        model.attach(cbO5);
        model.attach(cbO6);
        model.attach(cbO7);
        model.attach(cbO8);
        model.attach(cbO9);
        model.attach(cbP1);
        model.attach(cbP11);
        model.attach(cbP12);
        model.attach(cbP13);
        model.attach(cbP14);
        model.attach(cbP15);
        model.attach(cbP16);
        model.attach(cbP2);
        model.attach(cbP3);
        model.attach(cbP4);
        model.attach(cbP5);
        model.attach(cbP6);
        model.attach(cbP7);
        model.attach(cbP8);
        model.attach(cbP9);
        model.attach(cnP10);
        //Not working because static variables are saved as JPanels and not CustomBox
        cbA1.attach(model);
        cbA10.attach(model);
        cbA11.attach(model);
        cbA12.attach(model);
        cbA13.attach(model);
        cbA14.attach(model);
        cbA15.attach(model);
        cbA16.attach(model);
        cbA2.attach(model);
        cbA3.attach(model);
        cbA4.attach(model);
        cbA5.attach(model);
        cbA6.attach(model);
        cbA7.attach(model);
        cbA8.attach(model);
        cbA9.attach(model);
        cbB1.attach(model);
        cbB10.attach(model);
        cbB11.attach(model);
        cbB12.attach(model);
        cbB13.attach(model);
        cbB14.attach(model);
        cbB15.attach(model);
        cbB16.attach(model);
        cbB2.attach(model);
        cbB3.attach(model);
        cbB4.attach(model);
        cbB5.attach(model);
        cbB6.attach(model);
        cbB7.attach(model);
        cbB8.attach(model);
        cbB9.attach(model);
        cbC1.attach(model);
        cbC10.attach(model);
        cbC11.attach(model);
        cbC12.attach(model);
        cbC13.attach(model);
        cbC14.attach(model);
        cbC15.attach(model);
        cbC16.attach(model);
        cbC2.attach(model);
        cbC3.attach(model);
        cbC4.attach(model);
        cbC5.attach(model);
        cbC6.attach(model);
        cbC7.attach(model);
        cbC8.attach(model);
        cbC9.attach(model);
        cbD1.attach(model);
        cbD10.attach(model);
        cbD11.attach(model);
        cbD12.attach(model);
        cbD13.attach(model);
        cbD14.attach(model);
        cbD15.attach(model);
        cbD16.attach(model);
        cbD2.attach(model);
        cbD3.attach(model);
        cbD4.attach(model);
        cbD5.attach(model);
        cbD6.attach(model);
        cbD7.attach(model);
        cbD8.attach(model);
        cbD9.attach(model);
        cbE1.attach(model);
        cbE10.attach(model);
        cbE11.attach(model);
        cbE12.attach(model);
        cbE13.attach(model);
        cbE14.attach(model);
        cbE15.attach(model);
        cbE16.attach(model);
        cbE2.attach(model);
        cbE3.attach(model);
        cbE4.attach(model);
        cbE5.attach(model);
        cbE6.attach(model);
        cbE7.attach(model);
        cbE8.attach(model);
        cbE9.attach(model);
        cbF1.attach(model);
        cbF10.attach(model);
        cbF11.attach(model);
        cbF12.attach(model);
        cbF13.attach(model);
        cbF14.attach(model);
        cbF15.attach(model);
        cbF16.attach(model);
        cbF2.attach(model);
        cbF3.attach(model);
        cbF4.attach(model);
        cbF5.attach(model);
        cbF6.attach(model);
        cbF7.attach(model);
        cbF8.attach(model);
        cbF9.attach(model);
        cbG1.attach(model);
        cbG10.attach(model);
        cbG11.attach(model);
        cbG12.attach(model);
        cbG13.attach(model);
        cbG14.attach(model);
        cbG15.attach(model);
        cbG16.attach(model);
        cbG2.attach(model);
        cbG3.attach(model);
        cbG4.attach(model);
        cbG5.attach(model);
        cbG6.attach(model);
        cbG7.attach(model);
        cbG8.attach(model);
        cbG9.attach(model);
        cbH1.attach(model);
        cbH10.attach(model);
        cbH11.attach(model);
        cbH12.attach(model);
        cbH13.attach(model);
        cbH14.attach(model);
        cbH15.attach(model);
        cbH16.attach(model);
        cbH2.attach(model);
        cbH3.attach(model);
        cbH4.attach(model);
        cbH5.attach(model);
        cbH6.attach(model);
        cbH7.attach(model);
        cbH8.attach(model);
        cbH9.attach(model);
        cbI1.attach(model);
        cbI10.attach(model);
        cbI11.attach(model);
        cbI12.attach(model);
        cbI13.attach(model);
        cbI14.attach(model);
        cbI15.attach(model);
        cbI16.attach(model);
        cbI2.attach(model);
        cbI3.attach(model);
        cbI4.attach(model);
        cbI5.attach(model);
        cbI6.attach(model);
        cbI7.attach(model);
        cbI8.attach(model);
        cbI9.attach(model);
        cbJ1.attach(model);
        cbJ10.attach(model);
        cbJ11.attach(model);
        cbJ12.attach(model);
        cbJ13.attach(model);
        cbJ14.attach(model);
        cbJ15.attach(model);
        cbJ16.attach(model);
        cbJ2.attach(model);
        cbJ3.attach(model);
        cbJ4.attach(model);
        cbJ5.attach(model);
        cbJ6.attach(model);
        cbJ7.attach(model);
        cbJ8.attach(model);
        cbJ9.attach(model);
        cbK1.attach(model);
        cbK10.attach(model);
        cbK11.attach(model);
        cbK12.attach(model);
        cbK13.attach(model);
        cbK14.attach(model);
        cbK15.attach(model);
        cbK16.attach(model);
        cbK2.attach(model);
        cbK3.attach(model);
        cbK4.attach(model);
        cbK5.attach(model);
        cbK6.attach(model);
        cbK7.attach(model);
        cbK8.attach(model);
        cbK9.attach(model);
        cbL1.attach(model);
        cbL10.attach(model);
        cbL11.attach(model);
        cbL12.attach(model);
        cbL13.attach(model);
        cbL14.attach(model);
        cbL15.attach(model);
        cbL16.attach(model);
        cbL2.attach(model);
        cbL3.attach(model);
        cbL4.attach(model);
        cbL5.attach(model);
        cbL6.attach(model);
        cbL7.attach(model);
        cbL8.attach(model);
        cbL9.attach(model);
        cbM1.attach(model);
        cbM10.attach(model);
        cbM11.attach(model);
        cbM12.attach(model);
        cbM13.attach(model);
        cbM14.attach(model);
        cbM15.attach(model);
        cbM16.attach(model);
        cbM2.attach(model);
        cbM3.attach(model);
        cbM4.attach(model);
        cbM5.attach(model);
        cbM6.attach(model);
        cbM7.attach(model);
        cbM8.attach(model);
        cbM9.attach(model);
        cbN1.attach(model);
        cbN10.attach(model);
        cbN11.attach(model);
        cbN12.attach(model);
        cbN13.attach(model);
        cbN14.attach(model);
        cbN15.attach(model);
        cbN2.attach(model);
        cbN3.attach(model);
        cbN4.attach(model);
        cbN5.attach(model);
        cbN6.attach(model);
        cbN7.attach(model);
        cbN8.attach(model);
        cbN9.attach(model);
        cbO1.attach(model);
        cbO10.attach(model);
        cbO11.attach(model);
        cbO12.attach(model);
        cbO13.attach(model);
        cbO14.attach(model);
        cbO15.attach(model);
        cbO16.attach(model);
        cbO2.attach(model);
        cbO3.attach(model);
        cbO4.attach(model);
        cbO5.attach(model);
        cbO6.attach(model);
        cbO7.attach(model);
        cbO8.attach(model);
        cbO9.attach(model);
        cbP1.attach(model);
        cbP11.attach(model);
        cbP12.attach(model);
        cbP13.attach(model);
        cbP14.attach(model);
        cbP15.attach(model);
        cbP16.attach(model);
        cbP2.attach(model);
        cbP3.attach(model);
        cbP4.attach(model);
        cbP5.attach(model);
        cbP6.attach(model);
        cbP7.attach(model);
        cbP8.attach(model);
        cbP9.attach(model);
        cnP10.attach(model);



        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);
        progressBar.setVisible(false);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String)(evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer)(evt.getNewValue());
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }
        });
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = CS134AstarPathFindingApp.getApplication().getMainFrame();
            aboutBox = new CS134AstarPathFindingAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        CS134AstarPathFindingApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        playerButton = new javax.swing.JButton();
        monsterButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GridPanel = new javax.swing.JPanel();
        cbA1 = new CustomBox("A1");
        cbA2 = new CustomBox("A2");
        cbA3 = new CustomBox("A3");
        cbA4 = new CustomBox("A4");
        cbA5 = new CustomBox("A5");
        cbA6 = new CustomBox("A6");
        cbA7 = new CustomBox("A7");
        cbA8 = new CustomBox("A8");
        cbA9 = new CustomBox("A9");
        cbA10 = new CustomBox("A10");
        cbA11 = new CustomBox("A11");
        cbA12 = new CustomBox("A12");
        cbA13 = new CustomBox("A13");
        cbA14 = new CustomBox("A14");
        cbA15 = new CustomBox("A15");
        cbA16 = new CustomBox("A16");
        cbB1 = new CustomBox("B1");
        cbC1 = new CustomBox("C1");
        cbD1 = new CustomBox("D1");
        cbE1 = new CustomBox("E1");
        cbF1 = new CustomBox("F1");
        cbG1 = new CustomBox("G1");
        cbH1 = new CustomBox("H1");
        cbI1 = new CustomBox("I1");
        cbJ1 = new CustomBox("J1");
        cbK1 = new CustomBox("K1");
        cbL1 = new CustomBox("L1");
        cbM1 = new CustomBox("M1");
        cbN1 = new CustomBox("N1");
        cbO1 = new CustomBox("O1");
        cbP1 = new CustomBox("P1");
        cbB2 = new CustomBox("B2");
        cbC2 = new CustomBox("C2");
        cbD2 = new CustomBox("D2");
        cbE2 = new CustomBox("E2");
        cbF2 = new CustomBox("F2");
        cbG2 = new CustomBox("G2");
        cbH2 = new CustomBox("H2");
        cbI2 = new CustomBox("I2");
        cbJ2 = new CustomBox("J2");
        cbK2 = new CustomBox("K2");
        cbL2 = new CustomBox("L2");
        cbM2 = new CustomBox("M2");
        cbN2 = new CustomBox("N2");
        cbO2 = new CustomBox("O2");
        cbP2 = new CustomBox("P2");
        cbB3 = new CustomBox("B3");
        cbC3 = new CustomBox("C3");
        cbD3 = new CustomBox("D3");
        cbE3 = new CustomBox("E3");
        cbF3 = new CustomBox("F3");
        cbG3 = new CustomBox("G3");
        cbH3 = new CustomBox("H3");
        cbI3 = new CustomBox("I3");
        cbJ3 = new CustomBox("J3");
        cbK3 = new CustomBox("K3");
        cbL3 = new CustomBox("L3");
        cbM3 = new CustomBox("M3");
        cbN3 = new CustomBox("N3");
        cbO3 = new CustomBox("O3");
        cbP3 = new CustomBox("P3");
        cbB4 = new CustomBox("B4");
        cbC4 = new CustomBox("C4");
        cbD4 = new CustomBox("D4");
        cbE4 = new CustomBox("E4");
        cbF4 = new CustomBox("F4");
        cbG4 = new CustomBox("G4");
        cbH4 = new CustomBox("H4");
        cbI4 = new CustomBox("I4");
        cbJ4 = new CustomBox("J4");
        cbK4 = new CustomBox("K4");
        cbL4 = new CustomBox("L4");
        cbM4 = new CustomBox("M4");
        cbN4 = new CustomBox("N4");
        cbO4 = new CustomBox("O4");
        cbP4 = new CustomBox("P4");
        cbB5 = new CustomBox("B5");
        cbC5 = new CustomBox("C5");
        cbD5 = new CustomBox("D5");
        cbE5 = new CustomBox("E5");
        cbF5 = new CustomBox("F5");
        cbG5 = new CustomBox("G5");
        cbH5 = new CustomBox("H5");
        cbI5 = new CustomBox("I5");
        cbJ5 = new CustomBox("J5");
        cbK5 = new CustomBox("K5");
        cbL5 = new CustomBox("L5");
        cbM5 = new CustomBox("M5");
        cbN5 = new CustomBox("N5");
        cbO5 = new CustomBox("O5");
        cbP5 = new CustomBox("P5");
        cbB6 = new CustomBox("B6");
        cbC6 = new CustomBox("C6");
        cbD6 = new CustomBox("D6");
        cbE6 = new CustomBox("E6");
        cbF6 = new CustomBox("F6");
        cbG6 = new CustomBox("G6");
        cbH6 = new CustomBox("H6");
        cbI6 = new CustomBox("I6");
        cbJ6 = new CustomBox("J6");
        cbK6 = new CustomBox("K6");
        cbL6 = new CustomBox("L6");
        cbM6 = new CustomBox("M6");
        cbN6 = new CustomBox("N6");
        cbO6 = new CustomBox("O6");
        cbP6 = new CustomBox("P6");
        cbB7 = new CustomBox("B7");
        cbC7 = new CustomBox("C7");
        cbD7 = new CustomBox("D7");
        cbE7 = new CustomBox("E7");
        cbF7 = new CustomBox("F7");
        cbG7 = new CustomBox("G7");
        cbH7 = new CustomBox("H7");
        cbI7 = new CustomBox("I7");
        cbJ7 = new CustomBox("J7");
        cbK7 = new CustomBox("K7");
        cbL7 = new CustomBox("L7");
        cbM7 = new CustomBox("M7");
        cbN7 = new CustomBox("N7");
        cbO7 = new CustomBox("O7");
        cbP7 = new CustomBox("P7");
        cbB8 = new CustomBox("B8");
        cbC8 = new CustomBox("C8");
        cbD8 = new CustomBox("D8");
        cbE8 = new CustomBox("E8");
        cbF8 = new CustomBox("F8");
        cbG8 = new CustomBox("G8");
        cbH8 = new CustomBox("H8");
        cbI8 = new CustomBox("I8");
        cbJ8 = new CustomBox("J8");
        cbK8 = new CustomBox("K8");
        cbL8 = new CustomBox("L8");
        cbM8 = new CustomBox("M8");
        cbN8 = new CustomBox("N8");
        cbO8 = new CustomBox("O8");
        cbP8 = new CustomBox("P8");
        cbB9 = new CustomBox("B9");
        cbC9 = new CustomBox("C9");
        cbD9 = new CustomBox("D9");
        cbE9 = new CustomBox("E9");
        cbF9 = new CustomBox("F9");
        cbG9 = new CustomBox("G9");
        cbH9 = new CustomBox("H9");
        cbI9 = new CustomBox("I9");
        cbJ9 = new CustomBox("J9");
        cbK9 = new CustomBox("K9");
        cbL9 = new CustomBox("L9");
        cbM9 = new CustomBox("M9");
        cbN9 = new CustomBox("N9");
        cbO9 = new CustomBox("O9");
        cbP9 = new CustomBox("P9");
        cbB10 = new CustomBox("B10");
        cbC10 = new CustomBox("C10");
        cbD10 = new CustomBox("D10");
        cbE10 = new CustomBox("E10");
        cbF10 = new CustomBox("F10");
        cbG10 = new CustomBox("G10");
        cbH10 = new CustomBox("H10");
        cbI10 = new CustomBox("I10");
        cbJ10 = new CustomBox("J10");
        cbK10 = new CustomBox("K10");
        cbL10 = new CustomBox("L10");
        cbM10 = new CustomBox("M10");
        cbN10 = new CustomBox("N10");
        cbO10 = new CustomBox("O10");
        cnP10 = new CustomBox("P10");
        cbB11 = new CustomBox("B11");
        cbC11 = new CustomBox("C11");
        cbD11 = new CustomBox("D11");
        cbE11 = new CustomBox("E11");
        cbF11 = new CustomBox("F11");
        cbG11 = new CustomBox("G11");
        cbH11 = new CustomBox("H11");
        cbI11 = new CustomBox("I11");
        cbJ11 = new CustomBox("J11");
        cbK11 = new CustomBox("K11");
        cbL11 = new CustomBox("L11");
        cbM11 = new CustomBox("M11");
        cbN11 = new CustomBox("N11");
        cbO11 = new CustomBox("O11");
        cbP11 = new CustomBox("P11");
        cbB12 = new CustomBox("B12");
        cbC12 = new CustomBox("C12");
        cbD12 = new CustomBox("D12");
        cbE12 = new CustomBox("E12");
        cbF12 = new CustomBox("F12");
        cbG12 = new CustomBox("G12");
        cbH12 = new CustomBox("H12");
        cbI12 = new CustomBox("I12");
        cbJ12 = new CustomBox("J12");
        cbK12 = new CustomBox("K12");
        cbL12 = new CustomBox("L12");
        cbM12 = new CustomBox("M12");
        cbN12 = new CustomBox("N12");
        cbO12 = new CustomBox("O12");
        cbP12 = new CustomBox("P12");
        cbB13 = new CustomBox("B13");
        cbC13 = new CustomBox("C13");
        cbD13 = new CustomBox("D13");
        cbE13 = new CustomBox("E13");
        cbF13 = new CustomBox("F13");
        cbG13 = new CustomBox("G13");
        cbH13 = new CustomBox("H13");
        cbI13 = new CustomBox("I13");
        cbJ13 = new CustomBox("J13");
        cbK13 = new CustomBox("K13");
        cbL13 = new CustomBox("L13");
        cbM13 = new CustomBox("M13");
        cbN13 = new CustomBox("N13");
        cbO13 = new CustomBox("O13");
        cbP13 = new CustomBox("P13");
        cbB14 = new CustomBox("B14");
        cbC14 = new CustomBox("C14");
        cbD14 = new CustomBox("D14");
        cbE14 = new CustomBox("E14");
        cbF14 = new CustomBox("F14");
        cbG14 = new CustomBox("G14");
        cbH14 = new CustomBox("H14");
        cbI14 = new CustomBox("I14");
        cbJ14 = new CustomBox("J14");
        cbK14 = new CustomBox("K14");
        cbL14 = new CustomBox("L14");
        cbM14 = new CustomBox("M14");
        cbN14 = new CustomBox("N14");
        cbO14 = new CustomBox("O14");
        cbP14 = new CustomBox("P14");
        cbB15 = new CustomBox("B15");
        cbC15 = new CustomBox("C15");
        cbD15 = new CustomBox("D15");
        cbE15 = new CustomBox("E15");
        cbF15 = new CustomBox("F15");
        cbG15 = new CustomBox("G15");
        cbH15 = new CustomBox("H15");
        cbI15 = new CustomBox("I15");
        cbJ15 = new CustomBox("J15");
        cbK15 = new CustomBox("K15");
        cbL15 = new CustomBox("L15");
        cbM15 = new CustomBox("M15");
        cbN15 = new CustomBox("N15");
        cbO15 = new CustomBox("O15");
        cbP15 = new CustomBox("P15");
        cbB16 = new CustomBox("B16");
        cbC16 = new CustomBox("C16");
        cbD16 = new CustomBox("D16");
        cbE16 = new CustomBox("E16");
        cbF16 = new CustomBox("F16");
        cbG16 = new CustomBox("G16");
        cbH16 = new CustomBox("H16");
        cbI16 = new CustomBox("I16");
        cbJ16 = new CustomBox("J16");
        cbK16 = new CustomBox("K16");
        cbL16 = new CustomBox("L16");
        cbM16 = new CustomBox("M16");
        cbN16 = new CustomBox("N16");
        cbO16 = new CustomBox("O16");
        cbP16 = new CustomBox("P16");
        obstaclesButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        ResetMenu = new javax.swing.JMenuItem();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        statusPanel = new javax.swing.JPanel();
        statusAnimationLabel = new javax.swing.JLabel();
        statusMessageLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        stepButton = new javax.swing.JButton();
        fullPathButton = new javax.swing.JButton();

        mainPanel.setName("mainPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cs134astarpathfinding.CS134AstarPathFindingApp.class).getContext().getResourceMap(CS134AstarPathFindingView.class);
        playerButton.setText(resourceMap.getString("playerButton.text")); // NOI18N
        playerButton.setName("playerButton"); // NOI18N
        playerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playerButtonMouseClicked(evt);
            }
        });

        monsterButton.setText(resourceMap.getString("monsterButton.text")); // NOI18N
        monsterButton.setName("monsterButton"); // NOI18N
        monsterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monsterButtonMouseClicked(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        GridPanel.setName("GridPanel"); // NOI18N

        cbA1.setName("cbA1"); // NOI18N

        javax.swing.GroupLayout cbA1Layout = new javax.swing.GroupLayout(cbA1);
        cbA1.setLayout(cbA1Layout);
        cbA1Layout.setHorizontalGroup(
            cbA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA1Layout.setVerticalGroup(
            cbA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA2.setName("cbA2"); // NOI18N

        javax.swing.GroupLayout cbA2Layout = new javax.swing.GroupLayout(cbA2);
        cbA2.setLayout(cbA2Layout);
        cbA2Layout.setHorizontalGroup(
            cbA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA2Layout.setVerticalGroup(
            cbA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA3.setName("cbA3"); // NOI18N

        javax.swing.GroupLayout cbA3Layout = new javax.swing.GroupLayout(cbA3);
        cbA3.setLayout(cbA3Layout);
        cbA3Layout.setHorizontalGroup(
            cbA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA3Layout.setVerticalGroup(
            cbA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA4.setName("cbA4"); // NOI18N

        javax.swing.GroupLayout cbA4Layout = new javax.swing.GroupLayout(cbA4);
        cbA4.setLayout(cbA4Layout);
        cbA4Layout.setHorizontalGroup(
            cbA4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA4Layout.setVerticalGroup(
            cbA4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA5.setName("cbA5"); // NOI18N

        javax.swing.GroupLayout cbA5Layout = new javax.swing.GroupLayout(cbA5);
        cbA5.setLayout(cbA5Layout);
        cbA5Layout.setHorizontalGroup(
            cbA5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA5Layout.setVerticalGroup(
            cbA5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA6.setName("cbA6"); // NOI18N

        javax.swing.GroupLayout cbA6Layout = new javax.swing.GroupLayout(cbA6);
        cbA6.setLayout(cbA6Layout);
        cbA6Layout.setHorizontalGroup(
            cbA6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA6Layout.setVerticalGroup(
            cbA6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA7.setName("cbA7"); // NOI18N

        javax.swing.GroupLayout cbA7Layout = new javax.swing.GroupLayout(cbA7);
        cbA7.setLayout(cbA7Layout);
        cbA7Layout.setHorizontalGroup(
            cbA7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA7Layout.setVerticalGroup(
            cbA7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA8.setName("cbA8"); // NOI18N

        javax.swing.GroupLayout cbA8Layout = new javax.swing.GroupLayout(cbA8);
        cbA8.setLayout(cbA8Layout);
        cbA8Layout.setHorizontalGroup(
            cbA8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA8Layout.setVerticalGroup(
            cbA8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA9.setName("cbA9"); // NOI18N

        javax.swing.GroupLayout cbA9Layout = new javax.swing.GroupLayout(cbA9);
        cbA9.setLayout(cbA9Layout);
        cbA9Layout.setHorizontalGroup(
            cbA9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA9Layout.setVerticalGroup(
            cbA9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA10.setName("cbA10"); // NOI18N

        javax.swing.GroupLayout cbA10Layout = new javax.swing.GroupLayout(cbA10);
        cbA10.setLayout(cbA10Layout);
        cbA10Layout.setHorizontalGroup(
            cbA10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA10Layout.setVerticalGroup(
            cbA10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA11.setName("cbA11"); // NOI18N

        javax.swing.GroupLayout cbA11Layout = new javax.swing.GroupLayout(cbA11);
        cbA11.setLayout(cbA11Layout);
        cbA11Layout.setHorizontalGroup(
            cbA11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA11Layout.setVerticalGroup(
            cbA11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA12.setName("cbA12"); // NOI18N

        javax.swing.GroupLayout cbA12Layout = new javax.swing.GroupLayout(cbA12);
        cbA12.setLayout(cbA12Layout);
        cbA12Layout.setHorizontalGroup(
            cbA12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA12Layout.setVerticalGroup(
            cbA12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA13.setName("cbA13"); // NOI18N

        javax.swing.GroupLayout cbA13Layout = new javax.swing.GroupLayout(cbA13);
        cbA13.setLayout(cbA13Layout);
        cbA13Layout.setHorizontalGroup(
            cbA13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA13Layout.setVerticalGroup(
            cbA13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA14.setName("cbA14"); // NOI18N

        javax.swing.GroupLayout cbA14Layout = new javax.swing.GroupLayout(cbA14);
        cbA14.setLayout(cbA14Layout);
        cbA14Layout.setHorizontalGroup(
            cbA14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA14Layout.setVerticalGroup(
            cbA14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA15.setName("cbA15"); // NOI18N

        javax.swing.GroupLayout cbA15Layout = new javax.swing.GroupLayout(cbA15);
        cbA15.setLayout(cbA15Layout);
        cbA15Layout.setHorizontalGroup(
            cbA15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA15Layout.setVerticalGroup(
            cbA15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbA16.setName("cbA16"); // NOI18N

        javax.swing.GroupLayout cbA16Layout = new javax.swing.GroupLayout(cbA16);
        cbA16.setLayout(cbA16Layout);
        cbA16Layout.setHorizontalGroup(
            cbA16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbA16Layout.setVerticalGroup(
            cbA16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB1.setName("cbB1"); // NOI18N

        javax.swing.GroupLayout cbB1Layout = new javax.swing.GroupLayout(cbB1);
        cbB1.setLayout(cbB1Layout);
        cbB1Layout.setHorizontalGroup(
            cbB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB1Layout.setVerticalGroup(
            cbB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC1.setName("cbC1"); // NOI18N

        javax.swing.GroupLayout cbC1Layout = new javax.swing.GroupLayout(cbC1);
        cbC1.setLayout(cbC1Layout);
        cbC1Layout.setHorizontalGroup(
            cbC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC1Layout.setVerticalGroup(
            cbC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD1.setName("cbD1"); // NOI18N

        javax.swing.GroupLayout cbD1Layout = new javax.swing.GroupLayout(cbD1);
        cbD1.setLayout(cbD1Layout);
        cbD1Layout.setHorizontalGroup(
            cbD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD1Layout.setVerticalGroup(
            cbD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE1.setName("cbE1"); // NOI18N

        javax.swing.GroupLayout cbE1Layout = new javax.swing.GroupLayout(cbE1);
        cbE1.setLayout(cbE1Layout);
        cbE1Layout.setHorizontalGroup(
            cbE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE1Layout.setVerticalGroup(
            cbE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF1.setName("cbF1"); // NOI18N

        javax.swing.GroupLayout cbF1Layout = new javax.swing.GroupLayout(cbF1);
        cbF1.setLayout(cbF1Layout);
        cbF1Layout.setHorizontalGroup(
            cbF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF1Layout.setVerticalGroup(
            cbF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG1.setName("cbG1"); // NOI18N

        javax.swing.GroupLayout cbG1Layout = new javax.swing.GroupLayout(cbG1);
        cbG1.setLayout(cbG1Layout);
        cbG1Layout.setHorizontalGroup(
            cbG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG1Layout.setVerticalGroup(
            cbG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH1.setName("cbH1"); // NOI18N

        javax.swing.GroupLayout cbH1Layout = new javax.swing.GroupLayout(cbH1);
        cbH1.setLayout(cbH1Layout);
        cbH1Layout.setHorizontalGroup(
            cbH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH1Layout.setVerticalGroup(
            cbH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI1.setName("cbI1"); // NOI18N

        javax.swing.GroupLayout cbI1Layout = new javax.swing.GroupLayout(cbI1);
        cbI1.setLayout(cbI1Layout);
        cbI1Layout.setHorizontalGroup(
            cbI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI1Layout.setVerticalGroup(
            cbI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ1.setName("cbJ1"); // NOI18N

        javax.swing.GroupLayout cbJ1Layout = new javax.swing.GroupLayout(cbJ1);
        cbJ1.setLayout(cbJ1Layout);
        cbJ1Layout.setHorizontalGroup(
            cbJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ1Layout.setVerticalGroup(
            cbJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK1.setName("cbK1"); // NOI18N

        javax.swing.GroupLayout cbK1Layout = new javax.swing.GroupLayout(cbK1);
        cbK1.setLayout(cbK1Layout);
        cbK1Layout.setHorizontalGroup(
            cbK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK1Layout.setVerticalGroup(
            cbK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL1.setName("cbL1"); // NOI18N

        javax.swing.GroupLayout cbL1Layout = new javax.swing.GroupLayout(cbL1);
        cbL1.setLayout(cbL1Layout);
        cbL1Layout.setHorizontalGroup(
            cbL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL1Layout.setVerticalGroup(
            cbL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM1.setName("cbM1"); // NOI18N

        javax.swing.GroupLayout cbM1Layout = new javax.swing.GroupLayout(cbM1);
        cbM1.setLayout(cbM1Layout);
        cbM1Layout.setHorizontalGroup(
            cbM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM1Layout.setVerticalGroup(
            cbM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN1.setName("cbN1"); // NOI18N

        javax.swing.GroupLayout cbN1Layout = new javax.swing.GroupLayout(cbN1);
        cbN1.setLayout(cbN1Layout);
        cbN1Layout.setHorizontalGroup(
            cbN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN1Layout.setVerticalGroup(
            cbN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO1.setName("cbO1"); // NOI18N

        javax.swing.GroupLayout cbO1Layout = new javax.swing.GroupLayout(cbO1);
        cbO1.setLayout(cbO1Layout);
        cbO1Layout.setHorizontalGroup(
            cbO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO1Layout.setVerticalGroup(
            cbO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP1.setName("cbP1"); // NOI18N

        javax.swing.GroupLayout cbP1Layout = new javax.swing.GroupLayout(cbP1);
        cbP1.setLayout(cbP1Layout);
        cbP1Layout.setHorizontalGroup(
            cbP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP1Layout.setVerticalGroup(
            cbP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB2.setName("cbB2"); // NOI18N

        javax.swing.GroupLayout cbB2Layout = new javax.swing.GroupLayout(cbB2);
        cbB2.setLayout(cbB2Layout);
        cbB2Layout.setHorizontalGroup(
            cbB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB2Layout.setVerticalGroup(
            cbB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC2.setName("cbC2"); // NOI18N

        javax.swing.GroupLayout cbC2Layout = new javax.swing.GroupLayout(cbC2);
        cbC2.setLayout(cbC2Layout);
        cbC2Layout.setHorizontalGroup(
            cbC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC2Layout.setVerticalGroup(
            cbC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD2.setName("cbD2"); // NOI18N

        javax.swing.GroupLayout cbD2Layout = new javax.swing.GroupLayout(cbD2);
        cbD2.setLayout(cbD2Layout);
        cbD2Layout.setHorizontalGroup(
            cbD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD2Layout.setVerticalGroup(
            cbD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE2.setName("cbE2"); // NOI18N

        javax.swing.GroupLayout cbE2Layout = new javax.swing.GroupLayout(cbE2);
        cbE2.setLayout(cbE2Layout);
        cbE2Layout.setHorizontalGroup(
            cbE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE2Layout.setVerticalGroup(
            cbE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF2.setName("cbF2"); // NOI18N

        javax.swing.GroupLayout cbF2Layout = new javax.swing.GroupLayout(cbF2);
        cbF2.setLayout(cbF2Layout);
        cbF2Layout.setHorizontalGroup(
            cbF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF2Layout.setVerticalGroup(
            cbF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG2.setName("cbG2"); // NOI18N

        javax.swing.GroupLayout cbG2Layout = new javax.swing.GroupLayout(cbG2);
        cbG2.setLayout(cbG2Layout);
        cbG2Layout.setHorizontalGroup(
            cbG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG2Layout.setVerticalGroup(
            cbG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH2.setName("cbH2"); // NOI18N

        javax.swing.GroupLayout cbH2Layout = new javax.swing.GroupLayout(cbH2);
        cbH2.setLayout(cbH2Layout);
        cbH2Layout.setHorizontalGroup(
            cbH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH2Layout.setVerticalGroup(
            cbH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI2.setName("cbI2"); // NOI18N

        javax.swing.GroupLayout cbI2Layout = new javax.swing.GroupLayout(cbI2);
        cbI2.setLayout(cbI2Layout);
        cbI2Layout.setHorizontalGroup(
            cbI2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI2Layout.setVerticalGroup(
            cbI2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ2.setName("cbJ2"); // NOI18N

        javax.swing.GroupLayout cbJ2Layout = new javax.swing.GroupLayout(cbJ2);
        cbJ2.setLayout(cbJ2Layout);
        cbJ2Layout.setHorizontalGroup(
            cbJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ2Layout.setVerticalGroup(
            cbJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK2.setName("cbK2"); // NOI18N

        javax.swing.GroupLayout cbK2Layout = new javax.swing.GroupLayout(cbK2);
        cbK2.setLayout(cbK2Layout);
        cbK2Layout.setHorizontalGroup(
            cbK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK2Layout.setVerticalGroup(
            cbK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL2.setName("cbL2"); // NOI18N

        javax.swing.GroupLayout cbL2Layout = new javax.swing.GroupLayout(cbL2);
        cbL2.setLayout(cbL2Layout);
        cbL2Layout.setHorizontalGroup(
            cbL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL2Layout.setVerticalGroup(
            cbL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM2.setName("cbM2"); // NOI18N

        javax.swing.GroupLayout cbM2Layout = new javax.swing.GroupLayout(cbM2);
        cbM2.setLayout(cbM2Layout);
        cbM2Layout.setHorizontalGroup(
            cbM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM2Layout.setVerticalGroup(
            cbM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN2.setName("cbN2"); // NOI18N

        javax.swing.GroupLayout cbN2Layout = new javax.swing.GroupLayout(cbN2);
        cbN2.setLayout(cbN2Layout);
        cbN2Layout.setHorizontalGroup(
            cbN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN2Layout.setVerticalGroup(
            cbN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO2.setName("cbO2"); // NOI18N

        javax.swing.GroupLayout cbO2Layout = new javax.swing.GroupLayout(cbO2);
        cbO2.setLayout(cbO2Layout);
        cbO2Layout.setHorizontalGroup(
            cbO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO2Layout.setVerticalGroup(
            cbO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP2.setName("cbP2"); // NOI18N

        javax.swing.GroupLayout cbP2Layout = new javax.swing.GroupLayout(cbP2);
        cbP2.setLayout(cbP2Layout);
        cbP2Layout.setHorizontalGroup(
            cbP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP2Layout.setVerticalGroup(
            cbP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB3.setName("cbB3"); // NOI18N

        javax.swing.GroupLayout cbB3Layout = new javax.swing.GroupLayout(cbB3);
        cbB3.setLayout(cbB3Layout);
        cbB3Layout.setHorizontalGroup(
            cbB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB3Layout.setVerticalGroup(
            cbB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC3.setName("cbC3"); // NOI18N

        javax.swing.GroupLayout cbC3Layout = new javax.swing.GroupLayout(cbC3);
        cbC3.setLayout(cbC3Layout);
        cbC3Layout.setHorizontalGroup(
            cbC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC3Layout.setVerticalGroup(
            cbC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD3.setName("cbD3"); // NOI18N

        javax.swing.GroupLayout cbD3Layout = new javax.swing.GroupLayout(cbD3);
        cbD3.setLayout(cbD3Layout);
        cbD3Layout.setHorizontalGroup(
            cbD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD3Layout.setVerticalGroup(
            cbD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE3.setName("cbE3"); // NOI18N

        javax.swing.GroupLayout cbE3Layout = new javax.swing.GroupLayout(cbE3);
        cbE3.setLayout(cbE3Layout);
        cbE3Layout.setHorizontalGroup(
            cbE3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE3Layout.setVerticalGroup(
            cbE3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF3.setName("cbF3"); // NOI18N

        javax.swing.GroupLayout cbF3Layout = new javax.swing.GroupLayout(cbF3);
        cbF3.setLayout(cbF3Layout);
        cbF3Layout.setHorizontalGroup(
            cbF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF3Layout.setVerticalGroup(
            cbF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG3.setName("cbG3"); // NOI18N

        javax.swing.GroupLayout cbG3Layout = new javax.swing.GroupLayout(cbG3);
        cbG3.setLayout(cbG3Layout);
        cbG3Layout.setHorizontalGroup(
            cbG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG3Layout.setVerticalGroup(
            cbG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH3.setName("cbH3"); // NOI18N

        javax.swing.GroupLayout cbH3Layout = new javax.swing.GroupLayout(cbH3);
        cbH3.setLayout(cbH3Layout);
        cbH3Layout.setHorizontalGroup(
            cbH3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH3Layout.setVerticalGroup(
            cbH3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI3.setName("cbI3"); // NOI18N

        javax.swing.GroupLayout cbI3Layout = new javax.swing.GroupLayout(cbI3);
        cbI3.setLayout(cbI3Layout);
        cbI3Layout.setHorizontalGroup(
            cbI3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI3Layout.setVerticalGroup(
            cbI3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ3.setName("cbJ3"); // NOI18N

        javax.swing.GroupLayout cbJ3Layout = new javax.swing.GroupLayout(cbJ3);
        cbJ3.setLayout(cbJ3Layout);
        cbJ3Layout.setHorizontalGroup(
            cbJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ3Layout.setVerticalGroup(
            cbJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK3.setName("cbK3"); // NOI18N

        javax.swing.GroupLayout cbK3Layout = new javax.swing.GroupLayout(cbK3);
        cbK3.setLayout(cbK3Layout);
        cbK3Layout.setHorizontalGroup(
            cbK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK3Layout.setVerticalGroup(
            cbK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL3.setName("cbL3"); // NOI18N

        javax.swing.GroupLayout cbL3Layout = new javax.swing.GroupLayout(cbL3);
        cbL3.setLayout(cbL3Layout);
        cbL3Layout.setHorizontalGroup(
            cbL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL3Layout.setVerticalGroup(
            cbL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM3.setName("cbM3"); // NOI18N

        javax.swing.GroupLayout cbM3Layout = new javax.swing.GroupLayout(cbM3);
        cbM3.setLayout(cbM3Layout);
        cbM3Layout.setHorizontalGroup(
            cbM3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM3Layout.setVerticalGroup(
            cbM3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN3.setName("cbN3"); // NOI18N

        javax.swing.GroupLayout cbN3Layout = new javax.swing.GroupLayout(cbN3);
        cbN3.setLayout(cbN3Layout);
        cbN3Layout.setHorizontalGroup(
            cbN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN3Layout.setVerticalGroup(
            cbN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO3.setName("cbO3"); // NOI18N

        javax.swing.GroupLayout cbO3Layout = new javax.swing.GroupLayout(cbO3);
        cbO3.setLayout(cbO3Layout);
        cbO3Layout.setHorizontalGroup(
            cbO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO3Layout.setVerticalGroup(
            cbO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP3.setName("cbP3"); // NOI18N

        javax.swing.GroupLayout cbP3Layout = new javax.swing.GroupLayout(cbP3);
        cbP3.setLayout(cbP3Layout);
        cbP3Layout.setHorizontalGroup(
            cbP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP3Layout.setVerticalGroup(
            cbP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB4.setName("cbB4"); // NOI18N

        javax.swing.GroupLayout cbB4Layout = new javax.swing.GroupLayout(cbB4);
        cbB4.setLayout(cbB4Layout);
        cbB4Layout.setHorizontalGroup(
            cbB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB4Layout.setVerticalGroup(
            cbB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC4.setName("cbC4"); // NOI18N

        javax.swing.GroupLayout cbC4Layout = new javax.swing.GroupLayout(cbC4);
        cbC4.setLayout(cbC4Layout);
        cbC4Layout.setHorizontalGroup(
            cbC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC4Layout.setVerticalGroup(
            cbC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD4.setName("cbD4"); // NOI18N

        javax.swing.GroupLayout cbD4Layout = new javax.swing.GroupLayout(cbD4);
        cbD4.setLayout(cbD4Layout);
        cbD4Layout.setHorizontalGroup(
            cbD4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD4Layout.setVerticalGroup(
            cbD4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE4.setName("cbE4"); // NOI18N

        javax.swing.GroupLayout cbE4Layout = new javax.swing.GroupLayout(cbE4);
        cbE4.setLayout(cbE4Layout);
        cbE4Layout.setHorizontalGroup(
            cbE4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE4Layout.setVerticalGroup(
            cbE4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF4.setName("cbF4"); // NOI18N

        javax.swing.GroupLayout cbF4Layout = new javax.swing.GroupLayout(cbF4);
        cbF4.setLayout(cbF4Layout);
        cbF4Layout.setHorizontalGroup(
            cbF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF4Layout.setVerticalGroup(
            cbF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG4.setName("cbG4"); // NOI18N

        javax.swing.GroupLayout cbG4Layout = new javax.swing.GroupLayout(cbG4);
        cbG4.setLayout(cbG4Layout);
        cbG4Layout.setHorizontalGroup(
            cbG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG4Layout.setVerticalGroup(
            cbG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH4.setName("cbH4"); // NOI18N

        javax.swing.GroupLayout cbH4Layout = new javax.swing.GroupLayout(cbH4);
        cbH4.setLayout(cbH4Layout);
        cbH4Layout.setHorizontalGroup(
            cbH4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH4Layout.setVerticalGroup(
            cbH4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI4.setName("cbI4"); // NOI18N

        javax.swing.GroupLayout cbI4Layout = new javax.swing.GroupLayout(cbI4);
        cbI4.setLayout(cbI4Layout);
        cbI4Layout.setHorizontalGroup(
            cbI4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI4Layout.setVerticalGroup(
            cbI4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ4.setName("cbJ4"); // NOI18N

        javax.swing.GroupLayout cbJ4Layout = new javax.swing.GroupLayout(cbJ4);
        cbJ4.setLayout(cbJ4Layout);
        cbJ4Layout.setHorizontalGroup(
            cbJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ4Layout.setVerticalGroup(
            cbJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK4.setName("cbK4"); // NOI18N

        javax.swing.GroupLayout cbK4Layout = new javax.swing.GroupLayout(cbK4);
        cbK4.setLayout(cbK4Layout);
        cbK4Layout.setHorizontalGroup(
            cbK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK4Layout.setVerticalGroup(
            cbK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL4.setName("cbL4"); // NOI18N

        javax.swing.GroupLayout cbL4Layout = new javax.swing.GroupLayout(cbL4);
        cbL4.setLayout(cbL4Layout);
        cbL4Layout.setHorizontalGroup(
            cbL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL4Layout.setVerticalGroup(
            cbL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM4.setName("cbM4"); // NOI18N

        javax.swing.GroupLayout cbM4Layout = new javax.swing.GroupLayout(cbM4);
        cbM4.setLayout(cbM4Layout);
        cbM4Layout.setHorizontalGroup(
            cbM4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM4Layout.setVerticalGroup(
            cbM4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN4.setName("cbN4"); // NOI18N

        javax.swing.GroupLayout cbN4Layout = new javax.swing.GroupLayout(cbN4);
        cbN4.setLayout(cbN4Layout);
        cbN4Layout.setHorizontalGroup(
            cbN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN4Layout.setVerticalGroup(
            cbN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO4.setName("cbO4"); // NOI18N

        javax.swing.GroupLayout cbO4Layout = new javax.swing.GroupLayout(cbO4);
        cbO4.setLayout(cbO4Layout);
        cbO4Layout.setHorizontalGroup(
            cbO4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO4Layout.setVerticalGroup(
            cbO4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP4.setName("cbP4"); // NOI18N

        javax.swing.GroupLayout cbP4Layout = new javax.swing.GroupLayout(cbP4);
        cbP4.setLayout(cbP4Layout);
        cbP4Layout.setHorizontalGroup(
            cbP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP4Layout.setVerticalGroup(
            cbP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB5.setName("cbB5"); // NOI18N

        javax.swing.GroupLayout cbB5Layout = new javax.swing.GroupLayout(cbB5);
        cbB5.setLayout(cbB5Layout);
        cbB5Layout.setHorizontalGroup(
            cbB5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB5Layout.setVerticalGroup(
            cbB5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC5.setName("cbC5"); // NOI18N

        javax.swing.GroupLayout cbC5Layout = new javax.swing.GroupLayout(cbC5);
        cbC5.setLayout(cbC5Layout);
        cbC5Layout.setHorizontalGroup(
            cbC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC5Layout.setVerticalGroup(
            cbC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD5.setName("cbD5"); // NOI18N

        javax.swing.GroupLayout cbD5Layout = new javax.swing.GroupLayout(cbD5);
        cbD5.setLayout(cbD5Layout);
        cbD5Layout.setHorizontalGroup(
            cbD5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD5Layout.setVerticalGroup(
            cbD5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE5.setName("cbE5"); // NOI18N

        javax.swing.GroupLayout cbE5Layout = new javax.swing.GroupLayout(cbE5);
        cbE5.setLayout(cbE5Layout);
        cbE5Layout.setHorizontalGroup(
            cbE5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE5Layout.setVerticalGroup(
            cbE5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF5.setName("cbF5"); // NOI18N

        javax.swing.GroupLayout cbF5Layout = new javax.swing.GroupLayout(cbF5);
        cbF5.setLayout(cbF5Layout);
        cbF5Layout.setHorizontalGroup(
            cbF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF5Layout.setVerticalGroup(
            cbF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG5.setName("cbG5"); // NOI18N

        javax.swing.GroupLayout cbG5Layout = new javax.swing.GroupLayout(cbG5);
        cbG5.setLayout(cbG5Layout);
        cbG5Layout.setHorizontalGroup(
            cbG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG5Layout.setVerticalGroup(
            cbG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH5.setName("cbH5"); // NOI18N

        javax.swing.GroupLayout cbH5Layout = new javax.swing.GroupLayout(cbH5);
        cbH5.setLayout(cbH5Layout);
        cbH5Layout.setHorizontalGroup(
            cbH5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH5Layout.setVerticalGroup(
            cbH5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI5.setName("cbI5"); // NOI18N

        javax.swing.GroupLayout cbI5Layout = new javax.swing.GroupLayout(cbI5);
        cbI5.setLayout(cbI5Layout);
        cbI5Layout.setHorizontalGroup(
            cbI5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI5Layout.setVerticalGroup(
            cbI5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ5.setName("cbJ5"); // NOI18N

        javax.swing.GroupLayout cbJ5Layout = new javax.swing.GroupLayout(cbJ5);
        cbJ5.setLayout(cbJ5Layout);
        cbJ5Layout.setHorizontalGroup(
            cbJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ5Layout.setVerticalGroup(
            cbJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK5.setName("cbK5"); // NOI18N

        javax.swing.GroupLayout cbK5Layout = new javax.swing.GroupLayout(cbK5);
        cbK5.setLayout(cbK5Layout);
        cbK5Layout.setHorizontalGroup(
            cbK5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK5Layout.setVerticalGroup(
            cbK5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL5.setName("cbL5"); // NOI18N

        javax.swing.GroupLayout cbL5Layout = new javax.swing.GroupLayout(cbL5);
        cbL5.setLayout(cbL5Layout);
        cbL5Layout.setHorizontalGroup(
            cbL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL5Layout.setVerticalGroup(
            cbL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM5.setName("cbM5"); // NOI18N

        javax.swing.GroupLayout cbM5Layout = new javax.swing.GroupLayout(cbM5);
        cbM5.setLayout(cbM5Layout);
        cbM5Layout.setHorizontalGroup(
            cbM5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM5Layout.setVerticalGroup(
            cbM5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN5.setName("cbN5"); // NOI18N

        javax.swing.GroupLayout cbN5Layout = new javax.swing.GroupLayout(cbN5);
        cbN5.setLayout(cbN5Layout);
        cbN5Layout.setHorizontalGroup(
            cbN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN5Layout.setVerticalGroup(
            cbN5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO5.setName("cbO5"); // NOI18N

        javax.swing.GroupLayout cbO5Layout = new javax.swing.GroupLayout(cbO5);
        cbO5.setLayout(cbO5Layout);
        cbO5Layout.setHorizontalGroup(
            cbO5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO5Layout.setVerticalGroup(
            cbO5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP5.setName("cbP5"); // NOI18N

        javax.swing.GroupLayout cbP5Layout = new javax.swing.GroupLayout(cbP5);
        cbP5.setLayout(cbP5Layout);
        cbP5Layout.setHorizontalGroup(
            cbP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP5Layout.setVerticalGroup(
            cbP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB6.setName("cbB6"); // NOI18N

        javax.swing.GroupLayout cbB6Layout = new javax.swing.GroupLayout(cbB6);
        cbB6.setLayout(cbB6Layout);
        cbB6Layout.setHorizontalGroup(
            cbB6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB6Layout.setVerticalGroup(
            cbB6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC6.setName("cbC6"); // NOI18N

        javax.swing.GroupLayout cbC6Layout = new javax.swing.GroupLayout(cbC6);
        cbC6.setLayout(cbC6Layout);
        cbC6Layout.setHorizontalGroup(
            cbC6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC6Layout.setVerticalGroup(
            cbC6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD6.setName("cbD6"); // NOI18N

        javax.swing.GroupLayout cbD6Layout = new javax.swing.GroupLayout(cbD6);
        cbD6.setLayout(cbD6Layout);
        cbD6Layout.setHorizontalGroup(
            cbD6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD6Layout.setVerticalGroup(
            cbD6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE6.setName("cbE6"); // NOI18N

        javax.swing.GroupLayout cbE6Layout = new javax.swing.GroupLayout(cbE6);
        cbE6.setLayout(cbE6Layout);
        cbE6Layout.setHorizontalGroup(
            cbE6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE6Layout.setVerticalGroup(
            cbE6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF6.setName("cbF6"); // NOI18N

        javax.swing.GroupLayout cbF6Layout = new javax.swing.GroupLayout(cbF6);
        cbF6.setLayout(cbF6Layout);
        cbF6Layout.setHorizontalGroup(
            cbF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF6Layout.setVerticalGroup(
            cbF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG6.setName("cbG6"); // NOI18N

        javax.swing.GroupLayout cbG6Layout = new javax.swing.GroupLayout(cbG6);
        cbG6.setLayout(cbG6Layout);
        cbG6Layout.setHorizontalGroup(
            cbG6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG6Layout.setVerticalGroup(
            cbG6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH6.setName("cbH6"); // NOI18N

        javax.swing.GroupLayout cbH6Layout = new javax.swing.GroupLayout(cbH6);
        cbH6.setLayout(cbH6Layout);
        cbH6Layout.setHorizontalGroup(
            cbH6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH6Layout.setVerticalGroup(
            cbH6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI6.setName("cbI6"); // NOI18N

        javax.swing.GroupLayout cbI6Layout = new javax.swing.GroupLayout(cbI6);
        cbI6.setLayout(cbI6Layout);
        cbI6Layout.setHorizontalGroup(
            cbI6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI6Layout.setVerticalGroup(
            cbI6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ6.setName("cbJ6"); // NOI18N

        javax.swing.GroupLayout cbJ6Layout = new javax.swing.GroupLayout(cbJ6);
        cbJ6.setLayout(cbJ6Layout);
        cbJ6Layout.setHorizontalGroup(
            cbJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ6Layout.setVerticalGroup(
            cbJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK6.setName("cbK6"); // NOI18N

        javax.swing.GroupLayout cbK6Layout = new javax.swing.GroupLayout(cbK6);
        cbK6.setLayout(cbK6Layout);
        cbK6Layout.setHorizontalGroup(
            cbK6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK6Layout.setVerticalGroup(
            cbK6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL6.setName("cbL6"); // NOI18N

        javax.swing.GroupLayout cbL6Layout = new javax.swing.GroupLayout(cbL6);
        cbL6.setLayout(cbL6Layout);
        cbL6Layout.setHorizontalGroup(
            cbL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL6Layout.setVerticalGroup(
            cbL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM6.setName("cbM6"); // NOI18N

        javax.swing.GroupLayout cbM6Layout = new javax.swing.GroupLayout(cbM6);
        cbM6.setLayout(cbM6Layout);
        cbM6Layout.setHorizontalGroup(
            cbM6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM6Layout.setVerticalGroup(
            cbM6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN6.setName("cbN6"); // NOI18N

        javax.swing.GroupLayout cbN6Layout = new javax.swing.GroupLayout(cbN6);
        cbN6.setLayout(cbN6Layout);
        cbN6Layout.setHorizontalGroup(
            cbN6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN6Layout.setVerticalGroup(
            cbN6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO6.setName("cbO6"); // NOI18N

        javax.swing.GroupLayout cbO6Layout = new javax.swing.GroupLayout(cbO6);
        cbO6.setLayout(cbO6Layout);
        cbO6Layout.setHorizontalGroup(
            cbO6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO6Layout.setVerticalGroup(
            cbO6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP6.setName("cbP6"); // NOI18N

        javax.swing.GroupLayout cbP6Layout = new javax.swing.GroupLayout(cbP6);
        cbP6.setLayout(cbP6Layout);
        cbP6Layout.setHorizontalGroup(
            cbP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP6Layout.setVerticalGroup(
            cbP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB7.setName("cbB7"); // NOI18N

        javax.swing.GroupLayout cbB7Layout = new javax.swing.GroupLayout(cbB7);
        cbB7.setLayout(cbB7Layout);
        cbB7Layout.setHorizontalGroup(
            cbB7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB7Layout.setVerticalGroup(
            cbB7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC7.setName("cbC7"); // NOI18N

        javax.swing.GroupLayout cbC7Layout = new javax.swing.GroupLayout(cbC7);
        cbC7.setLayout(cbC7Layout);
        cbC7Layout.setHorizontalGroup(
            cbC7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC7Layout.setVerticalGroup(
            cbC7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD7.setName("cbD7"); // NOI18N

        javax.swing.GroupLayout cbD7Layout = new javax.swing.GroupLayout(cbD7);
        cbD7.setLayout(cbD7Layout);
        cbD7Layout.setHorizontalGroup(
            cbD7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD7Layout.setVerticalGroup(
            cbD7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE7.setName("cbE7"); // NOI18N

        javax.swing.GroupLayout cbE7Layout = new javax.swing.GroupLayout(cbE7);
        cbE7.setLayout(cbE7Layout);
        cbE7Layout.setHorizontalGroup(
            cbE7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE7Layout.setVerticalGroup(
            cbE7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF7.setName("cbF7"); // NOI18N

        javax.swing.GroupLayout cbF7Layout = new javax.swing.GroupLayout(cbF7);
        cbF7.setLayout(cbF7Layout);
        cbF7Layout.setHorizontalGroup(
            cbF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF7Layout.setVerticalGroup(
            cbF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG7.setName("cbG7"); // NOI18N

        javax.swing.GroupLayout cbG7Layout = new javax.swing.GroupLayout(cbG7);
        cbG7.setLayout(cbG7Layout);
        cbG7Layout.setHorizontalGroup(
            cbG7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG7Layout.setVerticalGroup(
            cbG7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH7.setName("cbH7"); // NOI18N

        javax.swing.GroupLayout cbH7Layout = new javax.swing.GroupLayout(cbH7);
        cbH7.setLayout(cbH7Layout);
        cbH7Layout.setHorizontalGroup(
            cbH7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH7Layout.setVerticalGroup(
            cbH7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI7.setName("cbI7"); // NOI18N

        javax.swing.GroupLayout cbI7Layout = new javax.swing.GroupLayout(cbI7);
        cbI7.setLayout(cbI7Layout);
        cbI7Layout.setHorizontalGroup(
            cbI7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI7Layout.setVerticalGroup(
            cbI7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ7.setName("cbJ7"); // NOI18N

        javax.swing.GroupLayout cbJ7Layout = new javax.swing.GroupLayout(cbJ7);
        cbJ7.setLayout(cbJ7Layout);
        cbJ7Layout.setHorizontalGroup(
            cbJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ7Layout.setVerticalGroup(
            cbJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK7.setName("cbK7"); // NOI18N

        javax.swing.GroupLayout cbK7Layout = new javax.swing.GroupLayout(cbK7);
        cbK7.setLayout(cbK7Layout);
        cbK7Layout.setHorizontalGroup(
            cbK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK7Layout.setVerticalGroup(
            cbK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL7.setName("cbL7"); // NOI18N

        javax.swing.GroupLayout cbL7Layout = new javax.swing.GroupLayout(cbL7);
        cbL7.setLayout(cbL7Layout);
        cbL7Layout.setHorizontalGroup(
            cbL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL7Layout.setVerticalGroup(
            cbL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM7.setName("cbM7"); // NOI18N

        javax.swing.GroupLayout cbM7Layout = new javax.swing.GroupLayout(cbM7);
        cbM7.setLayout(cbM7Layout);
        cbM7Layout.setHorizontalGroup(
            cbM7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM7Layout.setVerticalGroup(
            cbM7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN7.setName("cbN7"); // NOI18N

        javax.swing.GroupLayout cbN7Layout = new javax.swing.GroupLayout(cbN7);
        cbN7.setLayout(cbN7Layout);
        cbN7Layout.setHorizontalGroup(
            cbN7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN7Layout.setVerticalGroup(
            cbN7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO7.setName("cbO7"); // NOI18N

        javax.swing.GroupLayout cbO7Layout = new javax.swing.GroupLayout(cbO7);
        cbO7.setLayout(cbO7Layout);
        cbO7Layout.setHorizontalGroup(
            cbO7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO7Layout.setVerticalGroup(
            cbO7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP7.setName("cbP7"); // NOI18N

        javax.swing.GroupLayout cbP7Layout = new javax.swing.GroupLayout(cbP7);
        cbP7.setLayout(cbP7Layout);
        cbP7Layout.setHorizontalGroup(
            cbP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP7Layout.setVerticalGroup(
            cbP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB8.setName("cbB8"); // NOI18N

        javax.swing.GroupLayout cbB8Layout = new javax.swing.GroupLayout(cbB8);
        cbB8.setLayout(cbB8Layout);
        cbB8Layout.setHorizontalGroup(
            cbB8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB8Layout.setVerticalGroup(
            cbB8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC8.setName("cbC8"); // NOI18N

        javax.swing.GroupLayout cbC8Layout = new javax.swing.GroupLayout(cbC8);
        cbC8.setLayout(cbC8Layout);
        cbC8Layout.setHorizontalGroup(
            cbC8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC8Layout.setVerticalGroup(
            cbC8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD8.setName("cbD8"); // NOI18N

        javax.swing.GroupLayout cbD8Layout = new javax.swing.GroupLayout(cbD8);
        cbD8.setLayout(cbD8Layout);
        cbD8Layout.setHorizontalGroup(
            cbD8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD8Layout.setVerticalGroup(
            cbD8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE8.setName("cbE8"); // NOI18N

        javax.swing.GroupLayout cbE8Layout = new javax.swing.GroupLayout(cbE8);
        cbE8.setLayout(cbE8Layout);
        cbE8Layout.setHorizontalGroup(
            cbE8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE8Layout.setVerticalGroup(
            cbE8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF8.setName("cbF8"); // NOI18N

        javax.swing.GroupLayout cbF8Layout = new javax.swing.GroupLayout(cbF8);
        cbF8.setLayout(cbF8Layout);
        cbF8Layout.setHorizontalGroup(
            cbF8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF8Layout.setVerticalGroup(
            cbF8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG8.setName("cbG8"); // NOI18N

        javax.swing.GroupLayout cbG8Layout = new javax.swing.GroupLayout(cbG8);
        cbG8.setLayout(cbG8Layout);
        cbG8Layout.setHorizontalGroup(
            cbG8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG8Layout.setVerticalGroup(
            cbG8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH8.setName("cbH8"); // NOI18N

        javax.swing.GroupLayout cbH8Layout = new javax.swing.GroupLayout(cbH8);
        cbH8.setLayout(cbH8Layout);
        cbH8Layout.setHorizontalGroup(
            cbH8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH8Layout.setVerticalGroup(
            cbH8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI8.setName("cbI8"); // NOI18N

        javax.swing.GroupLayout cbI8Layout = new javax.swing.GroupLayout(cbI8);
        cbI8.setLayout(cbI8Layout);
        cbI8Layout.setHorizontalGroup(
            cbI8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI8Layout.setVerticalGroup(
            cbI8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ8.setName("cbJ8"); // NOI18N

        javax.swing.GroupLayout cbJ8Layout = new javax.swing.GroupLayout(cbJ8);
        cbJ8.setLayout(cbJ8Layout);
        cbJ8Layout.setHorizontalGroup(
            cbJ8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ8Layout.setVerticalGroup(
            cbJ8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK8.setName("cbK8"); // NOI18N

        javax.swing.GroupLayout cbK8Layout = new javax.swing.GroupLayout(cbK8);
        cbK8.setLayout(cbK8Layout);
        cbK8Layout.setHorizontalGroup(
            cbK8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK8Layout.setVerticalGroup(
            cbK8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL8.setName("cbL8"); // NOI18N

        javax.swing.GroupLayout cbL8Layout = new javax.swing.GroupLayout(cbL8);
        cbL8.setLayout(cbL8Layout);
        cbL8Layout.setHorizontalGroup(
            cbL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL8Layout.setVerticalGroup(
            cbL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM8.setName("cbM8"); // NOI18N

        javax.swing.GroupLayout cbM8Layout = new javax.swing.GroupLayout(cbM8);
        cbM8.setLayout(cbM8Layout);
        cbM8Layout.setHorizontalGroup(
            cbM8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM8Layout.setVerticalGroup(
            cbM8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN8.setName("cbN8"); // NOI18N

        javax.swing.GroupLayout cbN8Layout = new javax.swing.GroupLayout(cbN8);
        cbN8.setLayout(cbN8Layout);
        cbN8Layout.setHorizontalGroup(
            cbN8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN8Layout.setVerticalGroup(
            cbN8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO8.setName("cbO8"); // NOI18N

        javax.swing.GroupLayout cbO8Layout = new javax.swing.GroupLayout(cbO8);
        cbO8.setLayout(cbO8Layout);
        cbO8Layout.setHorizontalGroup(
            cbO8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO8Layout.setVerticalGroup(
            cbO8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP8.setName("cbP8"); // NOI18N

        javax.swing.GroupLayout cbP8Layout = new javax.swing.GroupLayout(cbP8);
        cbP8.setLayout(cbP8Layout);
        cbP8Layout.setHorizontalGroup(
            cbP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP8Layout.setVerticalGroup(
            cbP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB9.setName("cbB9"); // NOI18N

        javax.swing.GroupLayout cbB9Layout = new javax.swing.GroupLayout(cbB9);
        cbB9.setLayout(cbB9Layout);
        cbB9Layout.setHorizontalGroup(
            cbB9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB9Layout.setVerticalGroup(
            cbB9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC9.setName("cbC9"); // NOI18N

        javax.swing.GroupLayout cbC9Layout = new javax.swing.GroupLayout(cbC9);
        cbC9.setLayout(cbC9Layout);
        cbC9Layout.setHorizontalGroup(
            cbC9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC9Layout.setVerticalGroup(
            cbC9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD9.setName("cbD9"); // NOI18N

        javax.swing.GroupLayout cbD9Layout = new javax.swing.GroupLayout(cbD9);
        cbD9.setLayout(cbD9Layout);
        cbD9Layout.setHorizontalGroup(
            cbD9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD9Layout.setVerticalGroup(
            cbD9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE9.setName("cbE9"); // NOI18N

        javax.swing.GroupLayout cbE9Layout = new javax.swing.GroupLayout(cbE9);
        cbE9.setLayout(cbE9Layout);
        cbE9Layout.setHorizontalGroup(
            cbE9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE9Layout.setVerticalGroup(
            cbE9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF9.setName("cbF9"); // NOI18N

        javax.swing.GroupLayout cbF9Layout = new javax.swing.GroupLayout(cbF9);
        cbF9.setLayout(cbF9Layout);
        cbF9Layout.setHorizontalGroup(
            cbF9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF9Layout.setVerticalGroup(
            cbF9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG9.setName("cbG9"); // NOI18N

        javax.swing.GroupLayout cbG9Layout = new javax.swing.GroupLayout(cbG9);
        cbG9.setLayout(cbG9Layout);
        cbG9Layout.setHorizontalGroup(
            cbG9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG9Layout.setVerticalGroup(
            cbG9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH9.setName("cbH9"); // NOI18N

        javax.swing.GroupLayout cbH9Layout = new javax.swing.GroupLayout(cbH9);
        cbH9.setLayout(cbH9Layout);
        cbH9Layout.setHorizontalGroup(
            cbH9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH9Layout.setVerticalGroup(
            cbH9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI9.setName("cbI9"); // NOI18N

        javax.swing.GroupLayout cbI9Layout = new javax.swing.GroupLayout(cbI9);
        cbI9.setLayout(cbI9Layout);
        cbI9Layout.setHorizontalGroup(
            cbI9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI9Layout.setVerticalGroup(
            cbI9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ9.setName("cbJ9"); // NOI18N

        javax.swing.GroupLayout cbJ9Layout = new javax.swing.GroupLayout(cbJ9);
        cbJ9.setLayout(cbJ9Layout);
        cbJ9Layout.setHorizontalGroup(
            cbJ9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ9Layout.setVerticalGroup(
            cbJ9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK9.setName("cbK9"); // NOI18N

        javax.swing.GroupLayout cbK9Layout = new javax.swing.GroupLayout(cbK9);
        cbK9.setLayout(cbK9Layout);
        cbK9Layout.setHorizontalGroup(
            cbK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK9Layout.setVerticalGroup(
            cbK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL9.setName("cbL9"); // NOI18N

        javax.swing.GroupLayout cbL9Layout = new javax.swing.GroupLayout(cbL9);
        cbL9.setLayout(cbL9Layout);
        cbL9Layout.setHorizontalGroup(
            cbL9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL9Layout.setVerticalGroup(
            cbL9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM9.setName("cbM9"); // NOI18N

        javax.swing.GroupLayout cbM9Layout = new javax.swing.GroupLayout(cbM9);
        cbM9.setLayout(cbM9Layout);
        cbM9Layout.setHorizontalGroup(
            cbM9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM9Layout.setVerticalGroup(
            cbM9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN9.setName("cbN9"); // NOI18N

        javax.swing.GroupLayout cbN9Layout = new javax.swing.GroupLayout(cbN9);
        cbN9.setLayout(cbN9Layout);
        cbN9Layout.setHorizontalGroup(
            cbN9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN9Layout.setVerticalGroup(
            cbN9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO9.setName("cbO9"); // NOI18N

        javax.swing.GroupLayout cbO9Layout = new javax.swing.GroupLayout(cbO9);
        cbO9.setLayout(cbO9Layout);
        cbO9Layout.setHorizontalGroup(
            cbO9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO9Layout.setVerticalGroup(
            cbO9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP9.setName("cbP9"); // NOI18N

        javax.swing.GroupLayout cbP9Layout = new javax.swing.GroupLayout(cbP9);
        cbP9.setLayout(cbP9Layout);
        cbP9Layout.setHorizontalGroup(
            cbP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP9Layout.setVerticalGroup(
            cbP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB10.setName("cbB10"); // NOI18N

        javax.swing.GroupLayout cbB10Layout = new javax.swing.GroupLayout(cbB10);
        cbB10.setLayout(cbB10Layout);
        cbB10Layout.setHorizontalGroup(
            cbB10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB10Layout.setVerticalGroup(
            cbB10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC10.setName("cbC10"); // NOI18N

        javax.swing.GroupLayout cbC10Layout = new javax.swing.GroupLayout(cbC10);
        cbC10.setLayout(cbC10Layout);
        cbC10Layout.setHorizontalGroup(
            cbC10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC10Layout.setVerticalGroup(
            cbC10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD10.setName("cbD10"); // NOI18N

        javax.swing.GroupLayout cbD10Layout = new javax.swing.GroupLayout(cbD10);
        cbD10.setLayout(cbD10Layout);
        cbD10Layout.setHorizontalGroup(
            cbD10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD10Layout.setVerticalGroup(
            cbD10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE10.setName("cbE10"); // NOI18N

        javax.swing.GroupLayout cbE10Layout = new javax.swing.GroupLayout(cbE10);
        cbE10.setLayout(cbE10Layout);
        cbE10Layout.setHorizontalGroup(
            cbE10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE10Layout.setVerticalGroup(
            cbE10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF10.setName("cbF10"); // NOI18N

        javax.swing.GroupLayout cbF10Layout = new javax.swing.GroupLayout(cbF10);
        cbF10.setLayout(cbF10Layout);
        cbF10Layout.setHorizontalGroup(
            cbF10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF10Layout.setVerticalGroup(
            cbF10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG10.setName("cbG10"); // NOI18N

        javax.swing.GroupLayout cbG10Layout = new javax.swing.GroupLayout(cbG10);
        cbG10.setLayout(cbG10Layout);
        cbG10Layout.setHorizontalGroup(
            cbG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG10Layout.setVerticalGroup(
            cbG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH10.setName("cbH10"); // NOI18N

        javax.swing.GroupLayout cbH10Layout = new javax.swing.GroupLayout(cbH10);
        cbH10.setLayout(cbH10Layout);
        cbH10Layout.setHorizontalGroup(
            cbH10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH10Layout.setVerticalGroup(
            cbH10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI10.setName("cbI10"); // NOI18N

        javax.swing.GroupLayout cbI10Layout = new javax.swing.GroupLayout(cbI10);
        cbI10.setLayout(cbI10Layout);
        cbI10Layout.setHorizontalGroup(
            cbI10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI10Layout.setVerticalGroup(
            cbI10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ10.setName("cbJ10"); // NOI18N

        javax.swing.GroupLayout cbJ10Layout = new javax.swing.GroupLayout(cbJ10);
        cbJ10.setLayout(cbJ10Layout);
        cbJ10Layout.setHorizontalGroup(
            cbJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ10Layout.setVerticalGroup(
            cbJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK10.setName("cbK10"); // NOI18N

        javax.swing.GroupLayout cbK10Layout = new javax.swing.GroupLayout(cbK10);
        cbK10.setLayout(cbK10Layout);
        cbK10Layout.setHorizontalGroup(
            cbK10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK10Layout.setVerticalGroup(
            cbK10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL10.setName("cbL10"); // NOI18N

        javax.swing.GroupLayout cbL10Layout = new javax.swing.GroupLayout(cbL10);
        cbL10.setLayout(cbL10Layout);
        cbL10Layout.setHorizontalGroup(
            cbL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL10Layout.setVerticalGroup(
            cbL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM10.setName("cbM10"); // NOI18N

        javax.swing.GroupLayout cbM10Layout = new javax.swing.GroupLayout(cbM10);
        cbM10.setLayout(cbM10Layout);
        cbM10Layout.setHorizontalGroup(
            cbM10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM10Layout.setVerticalGroup(
            cbM10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN10.setName("cbN10"); // NOI18N

        javax.swing.GroupLayout cbN10Layout = new javax.swing.GroupLayout(cbN10);
        cbN10.setLayout(cbN10Layout);
        cbN10Layout.setHorizontalGroup(
            cbN10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN10Layout.setVerticalGroup(
            cbN10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO10.setName("cbO10"); // NOI18N

        javax.swing.GroupLayout cbO10Layout = new javax.swing.GroupLayout(cbO10);
        cbO10.setLayout(cbO10Layout);
        cbO10Layout.setHorizontalGroup(
            cbO10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO10Layout.setVerticalGroup(
            cbO10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cnP10.setName("cnP10"); // NOI18N

        javax.swing.GroupLayout cnP10Layout = new javax.swing.GroupLayout(cnP10);
        cnP10.setLayout(cnP10Layout);
        cnP10Layout.setHorizontalGroup(
            cnP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cnP10Layout.setVerticalGroup(
            cnP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB11.setName("cbB11"); // NOI18N

        javax.swing.GroupLayout cbB11Layout = new javax.swing.GroupLayout(cbB11);
        cbB11.setLayout(cbB11Layout);
        cbB11Layout.setHorizontalGroup(
            cbB11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB11Layout.setVerticalGroup(
            cbB11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC11.setName("cbC11"); // NOI18N

        javax.swing.GroupLayout cbC11Layout = new javax.swing.GroupLayout(cbC11);
        cbC11.setLayout(cbC11Layout);
        cbC11Layout.setHorizontalGroup(
            cbC11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC11Layout.setVerticalGroup(
            cbC11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD11.setName("cbD11"); // NOI18N

        javax.swing.GroupLayout cbD11Layout = new javax.swing.GroupLayout(cbD11);
        cbD11.setLayout(cbD11Layout);
        cbD11Layout.setHorizontalGroup(
            cbD11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD11Layout.setVerticalGroup(
            cbD11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE11.setName("cbE11"); // NOI18N

        javax.swing.GroupLayout cbE11Layout = new javax.swing.GroupLayout(cbE11);
        cbE11.setLayout(cbE11Layout);
        cbE11Layout.setHorizontalGroup(
            cbE11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE11Layout.setVerticalGroup(
            cbE11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF11.setName("cbF11"); // NOI18N

        javax.swing.GroupLayout cbF11Layout = new javax.swing.GroupLayout(cbF11);
        cbF11.setLayout(cbF11Layout);
        cbF11Layout.setHorizontalGroup(
            cbF11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF11Layout.setVerticalGroup(
            cbF11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG11.setName("cbG11"); // NOI18N

        javax.swing.GroupLayout cbG11Layout = new javax.swing.GroupLayout(cbG11);
        cbG11.setLayout(cbG11Layout);
        cbG11Layout.setHorizontalGroup(
            cbG11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG11Layout.setVerticalGroup(
            cbG11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH11.setName("cbH11"); // NOI18N

        javax.swing.GroupLayout cbH11Layout = new javax.swing.GroupLayout(cbH11);
        cbH11.setLayout(cbH11Layout);
        cbH11Layout.setHorizontalGroup(
            cbH11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH11Layout.setVerticalGroup(
            cbH11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI11.setName("cbI11"); // NOI18N

        javax.swing.GroupLayout cbI11Layout = new javax.swing.GroupLayout(cbI11);
        cbI11.setLayout(cbI11Layout);
        cbI11Layout.setHorizontalGroup(
            cbI11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI11Layout.setVerticalGroup(
            cbI11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ11.setName("cbJ11"); // NOI18N

        javax.swing.GroupLayout cbJ11Layout = new javax.swing.GroupLayout(cbJ11);
        cbJ11.setLayout(cbJ11Layout);
        cbJ11Layout.setHorizontalGroup(
            cbJ11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ11Layout.setVerticalGroup(
            cbJ11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK11.setName("cbK11"); // NOI18N

        javax.swing.GroupLayout cbK11Layout = new javax.swing.GroupLayout(cbK11);
        cbK11.setLayout(cbK11Layout);
        cbK11Layout.setHorizontalGroup(
            cbK11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK11Layout.setVerticalGroup(
            cbK11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL11.setName("cbL11"); // NOI18N

        javax.swing.GroupLayout cbL11Layout = new javax.swing.GroupLayout(cbL11);
        cbL11.setLayout(cbL11Layout);
        cbL11Layout.setHorizontalGroup(
            cbL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL11Layout.setVerticalGroup(
            cbL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM11.setName("cbM11"); // NOI18N

        javax.swing.GroupLayout cbM11Layout = new javax.swing.GroupLayout(cbM11);
        cbM11.setLayout(cbM11Layout);
        cbM11Layout.setHorizontalGroup(
            cbM11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM11Layout.setVerticalGroup(
            cbM11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN11.setName("cbN11"); // NOI18N

        javax.swing.GroupLayout cbN11Layout = new javax.swing.GroupLayout(cbN11);
        cbN11.setLayout(cbN11Layout);
        cbN11Layout.setHorizontalGroup(
            cbN11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN11Layout.setVerticalGroup(
            cbN11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO11.setName("cbO11"); // NOI18N

        javax.swing.GroupLayout cbO11Layout = new javax.swing.GroupLayout(cbO11);
        cbO11.setLayout(cbO11Layout);
        cbO11Layout.setHorizontalGroup(
            cbO11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO11Layout.setVerticalGroup(
            cbO11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP11.setName("cbP11"); // NOI18N

        javax.swing.GroupLayout cbP11Layout = new javax.swing.GroupLayout(cbP11);
        cbP11.setLayout(cbP11Layout);
        cbP11Layout.setHorizontalGroup(
            cbP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP11Layout.setVerticalGroup(
            cbP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB12.setName("cbB12"); // NOI18N

        javax.swing.GroupLayout cbB12Layout = new javax.swing.GroupLayout(cbB12);
        cbB12.setLayout(cbB12Layout);
        cbB12Layout.setHorizontalGroup(
            cbB12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB12Layout.setVerticalGroup(
            cbB12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC12.setName("cbC12"); // NOI18N

        javax.swing.GroupLayout cbC12Layout = new javax.swing.GroupLayout(cbC12);
        cbC12.setLayout(cbC12Layout);
        cbC12Layout.setHorizontalGroup(
            cbC12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC12Layout.setVerticalGroup(
            cbC12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD12.setName("cbD12"); // NOI18N

        javax.swing.GroupLayout cbD12Layout = new javax.swing.GroupLayout(cbD12);
        cbD12.setLayout(cbD12Layout);
        cbD12Layout.setHorizontalGroup(
            cbD12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD12Layout.setVerticalGroup(
            cbD12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE12.setName("cbE12"); // NOI18N

        javax.swing.GroupLayout cbE12Layout = new javax.swing.GroupLayout(cbE12);
        cbE12.setLayout(cbE12Layout);
        cbE12Layout.setHorizontalGroup(
            cbE12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE12Layout.setVerticalGroup(
            cbE12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF12.setName("cbF12"); // NOI18N

        javax.swing.GroupLayout cbF12Layout = new javax.swing.GroupLayout(cbF12);
        cbF12.setLayout(cbF12Layout);
        cbF12Layout.setHorizontalGroup(
            cbF12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF12Layout.setVerticalGroup(
            cbF12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG12.setName("cbG12"); // NOI18N

        javax.swing.GroupLayout cbG12Layout = new javax.swing.GroupLayout(cbG12);
        cbG12.setLayout(cbG12Layout);
        cbG12Layout.setHorizontalGroup(
            cbG12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG12Layout.setVerticalGroup(
            cbG12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH12.setName("cbH12"); // NOI18N

        javax.swing.GroupLayout cbH12Layout = new javax.swing.GroupLayout(cbH12);
        cbH12.setLayout(cbH12Layout);
        cbH12Layout.setHorizontalGroup(
            cbH12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH12Layout.setVerticalGroup(
            cbH12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI12.setName("cbI12"); // NOI18N

        javax.swing.GroupLayout cbI12Layout = new javax.swing.GroupLayout(cbI12);
        cbI12.setLayout(cbI12Layout);
        cbI12Layout.setHorizontalGroup(
            cbI12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI12Layout.setVerticalGroup(
            cbI12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ12.setName("cbJ12"); // NOI18N

        javax.swing.GroupLayout cbJ12Layout = new javax.swing.GroupLayout(cbJ12);
        cbJ12.setLayout(cbJ12Layout);
        cbJ12Layout.setHorizontalGroup(
            cbJ12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ12Layout.setVerticalGroup(
            cbJ12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK12.setName("cbK12"); // NOI18N

        javax.swing.GroupLayout cbK12Layout = new javax.swing.GroupLayout(cbK12);
        cbK12.setLayout(cbK12Layout);
        cbK12Layout.setHorizontalGroup(
            cbK12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK12Layout.setVerticalGroup(
            cbK12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL12.setName("cbL12"); // NOI18N

        javax.swing.GroupLayout cbL12Layout = new javax.swing.GroupLayout(cbL12);
        cbL12.setLayout(cbL12Layout);
        cbL12Layout.setHorizontalGroup(
            cbL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL12Layout.setVerticalGroup(
            cbL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM12.setName("cbM12"); // NOI18N

        javax.swing.GroupLayout cbM12Layout = new javax.swing.GroupLayout(cbM12);
        cbM12.setLayout(cbM12Layout);
        cbM12Layout.setHorizontalGroup(
            cbM12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM12Layout.setVerticalGroup(
            cbM12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN12.setName("cbN12"); // NOI18N

        javax.swing.GroupLayout cbN12Layout = new javax.swing.GroupLayout(cbN12);
        cbN12.setLayout(cbN12Layout);
        cbN12Layout.setHorizontalGroup(
            cbN12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN12Layout.setVerticalGroup(
            cbN12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO12.setName("cbO12"); // NOI18N

        javax.swing.GroupLayout cbO12Layout = new javax.swing.GroupLayout(cbO12);
        cbO12.setLayout(cbO12Layout);
        cbO12Layout.setHorizontalGroup(
            cbO12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO12Layout.setVerticalGroup(
            cbO12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP12.setName("cbP12"); // NOI18N

        javax.swing.GroupLayout cbP12Layout = new javax.swing.GroupLayout(cbP12);
        cbP12.setLayout(cbP12Layout);
        cbP12Layout.setHorizontalGroup(
            cbP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP12Layout.setVerticalGroup(
            cbP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB13.setName("cbB13"); // NOI18N

        javax.swing.GroupLayout cbB13Layout = new javax.swing.GroupLayout(cbB13);
        cbB13.setLayout(cbB13Layout);
        cbB13Layout.setHorizontalGroup(
            cbB13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB13Layout.setVerticalGroup(
            cbB13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC13.setName("cbC13"); // NOI18N

        javax.swing.GroupLayout cbC13Layout = new javax.swing.GroupLayout(cbC13);
        cbC13.setLayout(cbC13Layout);
        cbC13Layout.setHorizontalGroup(
            cbC13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC13Layout.setVerticalGroup(
            cbC13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD13.setName("cbD13"); // NOI18N

        javax.swing.GroupLayout cbD13Layout = new javax.swing.GroupLayout(cbD13);
        cbD13.setLayout(cbD13Layout);
        cbD13Layout.setHorizontalGroup(
            cbD13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD13Layout.setVerticalGroup(
            cbD13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE13.setName("cbE13"); // NOI18N

        javax.swing.GroupLayout cbE13Layout = new javax.swing.GroupLayout(cbE13);
        cbE13.setLayout(cbE13Layout);
        cbE13Layout.setHorizontalGroup(
            cbE13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE13Layout.setVerticalGroup(
            cbE13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF13.setName("cbF13"); // NOI18N

        javax.swing.GroupLayout cbF13Layout = new javax.swing.GroupLayout(cbF13);
        cbF13.setLayout(cbF13Layout);
        cbF13Layout.setHorizontalGroup(
            cbF13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF13Layout.setVerticalGroup(
            cbF13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG13.setName("cbG13"); // NOI18N

        javax.swing.GroupLayout cbG13Layout = new javax.swing.GroupLayout(cbG13);
        cbG13.setLayout(cbG13Layout);
        cbG13Layout.setHorizontalGroup(
            cbG13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG13Layout.setVerticalGroup(
            cbG13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH13.setName("cbH13"); // NOI18N

        javax.swing.GroupLayout cbH13Layout = new javax.swing.GroupLayout(cbH13);
        cbH13.setLayout(cbH13Layout);
        cbH13Layout.setHorizontalGroup(
            cbH13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH13Layout.setVerticalGroup(
            cbH13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI13.setName("cbI13"); // NOI18N

        javax.swing.GroupLayout cbI13Layout = new javax.swing.GroupLayout(cbI13);
        cbI13.setLayout(cbI13Layout);
        cbI13Layout.setHorizontalGroup(
            cbI13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI13Layout.setVerticalGroup(
            cbI13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ13.setName("cbJ13"); // NOI18N

        javax.swing.GroupLayout cbJ13Layout = new javax.swing.GroupLayout(cbJ13);
        cbJ13.setLayout(cbJ13Layout);
        cbJ13Layout.setHorizontalGroup(
            cbJ13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ13Layout.setVerticalGroup(
            cbJ13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK13.setName("cbK13"); // NOI18N

        javax.swing.GroupLayout cbK13Layout = new javax.swing.GroupLayout(cbK13);
        cbK13.setLayout(cbK13Layout);
        cbK13Layout.setHorizontalGroup(
            cbK13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK13Layout.setVerticalGroup(
            cbK13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL13.setName("cbL13"); // NOI18N

        javax.swing.GroupLayout cbL13Layout = new javax.swing.GroupLayout(cbL13);
        cbL13.setLayout(cbL13Layout);
        cbL13Layout.setHorizontalGroup(
            cbL13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL13Layout.setVerticalGroup(
            cbL13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM13.setName("cbM13"); // NOI18N

        javax.swing.GroupLayout cbM13Layout = new javax.swing.GroupLayout(cbM13);
        cbM13.setLayout(cbM13Layout);
        cbM13Layout.setHorizontalGroup(
            cbM13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM13Layout.setVerticalGroup(
            cbM13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN13.setName("cbN13"); // NOI18N

        javax.swing.GroupLayout cbN13Layout = new javax.swing.GroupLayout(cbN13);
        cbN13.setLayout(cbN13Layout);
        cbN13Layout.setHorizontalGroup(
            cbN13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN13Layout.setVerticalGroup(
            cbN13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO13.setName("cbO13"); // NOI18N

        javax.swing.GroupLayout cbO13Layout = new javax.swing.GroupLayout(cbO13);
        cbO13.setLayout(cbO13Layout);
        cbO13Layout.setHorizontalGroup(
            cbO13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO13Layout.setVerticalGroup(
            cbO13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP13.setName("cbP13"); // NOI18N

        javax.swing.GroupLayout cbP13Layout = new javax.swing.GroupLayout(cbP13);
        cbP13.setLayout(cbP13Layout);
        cbP13Layout.setHorizontalGroup(
            cbP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP13Layout.setVerticalGroup(
            cbP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB14.setName("cbB14"); // NOI18N

        javax.swing.GroupLayout cbB14Layout = new javax.swing.GroupLayout(cbB14);
        cbB14.setLayout(cbB14Layout);
        cbB14Layout.setHorizontalGroup(
            cbB14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB14Layout.setVerticalGroup(
            cbB14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC14.setName("cbC14"); // NOI18N

        javax.swing.GroupLayout cbC14Layout = new javax.swing.GroupLayout(cbC14);
        cbC14.setLayout(cbC14Layout);
        cbC14Layout.setHorizontalGroup(
            cbC14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC14Layout.setVerticalGroup(
            cbC14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD14.setName("cbD14"); // NOI18N

        javax.swing.GroupLayout cbD14Layout = new javax.swing.GroupLayout(cbD14);
        cbD14.setLayout(cbD14Layout);
        cbD14Layout.setHorizontalGroup(
            cbD14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD14Layout.setVerticalGroup(
            cbD14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE14.setName("cbE14"); // NOI18N

        javax.swing.GroupLayout cbE14Layout = new javax.swing.GroupLayout(cbE14);
        cbE14.setLayout(cbE14Layout);
        cbE14Layout.setHorizontalGroup(
            cbE14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE14Layout.setVerticalGroup(
            cbE14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF14.setName("cbF14"); // NOI18N

        javax.swing.GroupLayout cbF14Layout = new javax.swing.GroupLayout(cbF14);
        cbF14.setLayout(cbF14Layout);
        cbF14Layout.setHorizontalGroup(
            cbF14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF14Layout.setVerticalGroup(
            cbF14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG14.setName("cbG14"); // NOI18N

        javax.swing.GroupLayout cbG14Layout = new javax.swing.GroupLayout(cbG14);
        cbG14.setLayout(cbG14Layout);
        cbG14Layout.setHorizontalGroup(
            cbG14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG14Layout.setVerticalGroup(
            cbG14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH14.setName("cbH14"); // NOI18N

        javax.swing.GroupLayout cbH14Layout = new javax.swing.GroupLayout(cbH14);
        cbH14.setLayout(cbH14Layout);
        cbH14Layout.setHorizontalGroup(
            cbH14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH14Layout.setVerticalGroup(
            cbH14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI14.setName("cbI14"); // NOI18N

        javax.swing.GroupLayout cbI14Layout = new javax.swing.GroupLayout(cbI14);
        cbI14.setLayout(cbI14Layout);
        cbI14Layout.setHorizontalGroup(
            cbI14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI14Layout.setVerticalGroup(
            cbI14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ14.setName("cbJ14"); // NOI18N

        javax.swing.GroupLayout cbJ14Layout = new javax.swing.GroupLayout(cbJ14);
        cbJ14.setLayout(cbJ14Layout);
        cbJ14Layout.setHorizontalGroup(
            cbJ14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ14Layout.setVerticalGroup(
            cbJ14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK14.setName("cbK14"); // NOI18N

        javax.swing.GroupLayout cbK14Layout = new javax.swing.GroupLayout(cbK14);
        cbK14.setLayout(cbK14Layout);
        cbK14Layout.setHorizontalGroup(
            cbK14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK14Layout.setVerticalGroup(
            cbK14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL14.setName("cbL14"); // NOI18N

        javax.swing.GroupLayout cbL14Layout = new javax.swing.GroupLayout(cbL14);
        cbL14.setLayout(cbL14Layout);
        cbL14Layout.setHorizontalGroup(
            cbL14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL14Layout.setVerticalGroup(
            cbL14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM14.setName("cbM14"); // NOI18N

        javax.swing.GroupLayout cbM14Layout = new javax.swing.GroupLayout(cbM14);
        cbM14.setLayout(cbM14Layout);
        cbM14Layout.setHorizontalGroup(
            cbM14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM14Layout.setVerticalGroup(
            cbM14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN14.setName("cbN14"); // NOI18N

        javax.swing.GroupLayout cbN14Layout = new javax.swing.GroupLayout(cbN14);
        cbN14.setLayout(cbN14Layout);
        cbN14Layout.setHorizontalGroup(
            cbN14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN14Layout.setVerticalGroup(
            cbN14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO14.setName("cbO14"); // NOI18N

        javax.swing.GroupLayout cbO14Layout = new javax.swing.GroupLayout(cbO14);
        cbO14.setLayout(cbO14Layout);
        cbO14Layout.setHorizontalGroup(
            cbO14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO14Layout.setVerticalGroup(
            cbO14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP14.setName("cbP14"); // NOI18N

        javax.swing.GroupLayout cbP14Layout = new javax.swing.GroupLayout(cbP14);
        cbP14.setLayout(cbP14Layout);
        cbP14Layout.setHorizontalGroup(
            cbP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP14Layout.setVerticalGroup(
            cbP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB15.setName("cbB15"); // NOI18N

        javax.swing.GroupLayout cbB15Layout = new javax.swing.GroupLayout(cbB15);
        cbB15.setLayout(cbB15Layout);
        cbB15Layout.setHorizontalGroup(
            cbB15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB15Layout.setVerticalGroup(
            cbB15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC15.setName("cbC15"); // NOI18N

        javax.swing.GroupLayout cbC15Layout = new javax.swing.GroupLayout(cbC15);
        cbC15.setLayout(cbC15Layout);
        cbC15Layout.setHorizontalGroup(
            cbC15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC15Layout.setVerticalGroup(
            cbC15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD15.setName("cbD15"); // NOI18N

        javax.swing.GroupLayout cbD15Layout = new javax.swing.GroupLayout(cbD15);
        cbD15.setLayout(cbD15Layout);
        cbD15Layout.setHorizontalGroup(
            cbD15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD15Layout.setVerticalGroup(
            cbD15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE15.setName("cbE15"); // NOI18N

        javax.swing.GroupLayout cbE15Layout = new javax.swing.GroupLayout(cbE15);
        cbE15.setLayout(cbE15Layout);
        cbE15Layout.setHorizontalGroup(
            cbE15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE15Layout.setVerticalGroup(
            cbE15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF15.setName("cbF15"); // NOI18N

        javax.swing.GroupLayout cbF15Layout = new javax.swing.GroupLayout(cbF15);
        cbF15.setLayout(cbF15Layout);
        cbF15Layout.setHorizontalGroup(
            cbF15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF15Layout.setVerticalGroup(
            cbF15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG15.setName("cbG15"); // NOI18N

        javax.swing.GroupLayout cbG15Layout = new javax.swing.GroupLayout(cbG15);
        cbG15.setLayout(cbG15Layout);
        cbG15Layout.setHorizontalGroup(
            cbG15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG15Layout.setVerticalGroup(
            cbG15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH15.setName("cbH15"); // NOI18N

        javax.swing.GroupLayout cbH15Layout = new javax.swing.GroupLayout(cbH15);
        cbH15.setLayout(cbH15Layout);
        cbH15Layout.setHorizontalGroup(
            cbH15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH15Layout.setVerticalGroup(
            cbH15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI15.setName("cbI15"); // NOI18N

        javax.swing.GroupLayout cbI15Layout = new javax.swing.GroupLayout(cbI15);
        cbI15.setLayout(cbI15Layout);
        cbI15Layout.setHorizontalGroup(
            cbI15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI15Layout.setVerticalGroup(
            cbI15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ15.setName("cbJ15"); // NOI18N

        javax.swing.GroupLayout cbJ15Layout = new javax.swing.GroupLayout(cbJ15);
        cbJ15.setLayout(cbJ15Layout);
        cbJ15Layout.setHorizontalGroup(
            cbJ15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ15Layout.setVerticalGroup(
            cbJ15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK15.setName("cbK15"); // NOI18N

        javax.swing.GroupLayout cbK15Layout = new javax.swing.GroupLayout(cbK15);
        cbK15.setLayout(cbK15Layout);
        cbK15Layout.setHorizontalGroup(
            cbK15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK15Layout.setVerticalGroup(
            cbK15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL15.setName("cbL15"); // NOI18N

        javax.swing.GroupLayout cbL15Layout = new javax.swing.GroupLayout(cbL15);
        cbL15.setLayout(cbL15Layout);
        cbL15Layout.setHorizontalGroup(
            cbL15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL15Layout.setVerticalGroup(
            cbL15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM15.setName("cbM15"); // NOI18N

        javax.swing.GroupLayout cbM15Layout = new javax.swing.GroupLayout(cbM15);
        cbM15.setLayout(cbM15Layout);
        cbM15Layout.setHorizontalGroup(
            cbM15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM15Layout.setVerticalGroup(
            cbM15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN15.setName("cbN15"); // NOI18N

        javax.swing.GroupLayout cbN15Layout = new javax.swing.GroupLayout(cbN15);
        cbN15.setLayout(cbN15Layout);
        cbN15Layout.setHorizontalGroup(
            cbN15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN15Layout.setVerticalGroup(
            cbN15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO15.setName("cbO15"); // NOI18N

        javax.swing.GroupLayout cbO15Layout = new javax.swing.GroupLayout(cbO15);
        cbO15.setLayout(cbO15Layout);
        cbO15Layout.setHorizontalGroup(
            cbO15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO15Layout.setVerticalGroup(
            cbO15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP15.setName("cbP15"); // NOI18N

        javax.swing.GroupLayout cbP15Layout = new javax.swing.GroupLayout(cbP15);
        cbP15.setLayout(cbP15Layout);
        cbP15Layout.setHorizontalGroup(
            cbP15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP15Layout.setVerticalGroup(
            cbP15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbB16.setName("cbB16"); // NOI18N

        javax.swing.GroupLayout cbB16Layout = new javax.swing.GroupLayout(cbB16);
        cbB16.setLayout(cbB16Layout);
        cbB16Layout.setHorizontalGroup(
            cbB16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbB16Layout.setVerticalGroup(
            cbB16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbC16.setName("cbC16"); // NOI18N

        javax.swing.GroupLayout cbC16Layout = new javax.swing.GroupLayout(cbC16);
        cbC16.setLayout(cbC16Layout);
        cbC16Layout.setHorizontalGroup(
            cbC16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbC16Layout.setVerticalGroup(
            cbC16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbD16.setName("cbD16"); // NOI18N

        javax.swing.GroupLayout cbD16Layout = new javax.swing.GroupLayout(cbD16);
        cbD16.setLayout(cbD16Layout);
        cbD16Layout.setHorizontalGroup(
            cbD16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbD16Layout.setVerticalGroup(
            cbD16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbE16.setName("cbE16"); // NOI18N

        javax.swing.GroupLayout cbE16Layout = new javax.swing.GroupLayout(cbE16);
        cbE16.setLayout(cbE16Layout);
        cbE16Layout.setHorizontalGroup(
            cbE16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbE16Layout.setVerticalGroup(
            cbE16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbF16.setName("cbF16"); // NOI18N

        javax.swing.GroupLayout cbF16Layout = new javax.swing.GroupLayout(cbF16);
        cbF16.setLayout(cbF16Layout);
        cbF16Layout.setHorizontalGroup(
            cbF16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbF16Layout.setVerticalGroup(
            cbF16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbG16.setName("cbG16"); // NOI18N

        javax.swing.GroupLayout cbG16Layout = new javax.swing.GroupLayout(cbG16);
        cbG16.setLayout(cbG16Layout);
        cbG16Layout.setHorizontalGroup(
            cbG16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbG16Layout.setVerticalGroup(
            cbG16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbH16.setName("cbH16"); // NOI18N

        javax.swing.GroupLayout cbH16Layout = new javax.swing.GroupLayout(cbH16);
        cbH16.setLayout(cbH16Layout);
        cbH16Layout.setHorizontalGroup(
            cbH16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbH16Layout.setVerticalGroup(
            cbH16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbI16.setName("cbI16"); // NOI18N

        javax.swing.GroupLayout cbI16Layout = new javax.swing.GroupLayout(cbI16);
        cbI16.setLayout(cbI16Layout);
        cbI16Layout.setHorizontalGroup(
            cbI16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbI16Layout.setVerticalGroup(
            cbI16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbJ16.setName("cbJ16"); // NOI18N

        javax.swing.GroupLayout cbJ16Layout = new javax.swing.GroupLayout(cbJ16);
        cbJ16.setLayout(cbJ16Layout);
        cbJ16Layout.setHorizontalGroup(
            cbJ16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbJ16Layout.setVerticalGroup(
            cbJ16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbK16.setName("cbK16"); // NOI18N

        javax.swing.GroupLayout cbK16Layout = new javax.swing.GroupLayout(cbK16);
        cbK16.setLayout(cbK16Layout);
        cbK16Layout.setHorizontalGroup(
            cbK16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbK16Layout.setVerticalGroup(
            cbK16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbL16.setName("cbL16"); // NOI18N

        javax.swing.GroupLayout cbL16Layout = new javax.swing.GroupLayout(cbL16);
        cbL16.setLayout(cbL16Layout);
        cbL16Layout.setHorizontalGroup(
            cbL16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbL16Layout.setVerticalGroup(
            cbL16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbM16.setName("cbM16"); // NOI18N

        javax.swing.GroupLayout cbM16Layout = new javax.swing.GroupLayout(cbM16);
        cbM16.setLayout(cbM16Layout);
        cbM16Layout.setHorizontalGroup(
            cbM16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbM16Layout.setVerticalGroup(
            cbM16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbN16.setName("cbN16"); // NOI18N

        javax.swing.GroupLayout cbN16Layout = new javax.swing.GroupLayout(cbN16);
        cbN16.setLayout(cbN16Layout);
        cbN16Layout.setHorizontalGroup(
            cbN16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbN16Layout.setVerticalGroup(
            cbN16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbO16.setName("cbO16"); // NOI18N

        javax.swing.GroupLayout cbO16Layout = new javax.swing.GroupLayout(cbO16);
        cbO16.setLayout(cbO16Layout);
        cbO16Layout.setHorizontalGroup(
            cbO16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbO16Layout.setVerticalGroup(
            cbO16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbP16.setName("cbP16"); // NOI18N

        javax.swing.GroupLayout cbP16Layout = new javax.swing.GroupLayout(cbP16);
        cbP16.setLayout(cbP16Layout);
        cbP16Layout.setHorizontalGroup(
            cbP16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cbP16Layout.setVerticalGroup(
            cbP16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GridPanelLayout = new javax.swing.GroupLayout(GridPanel);
        GridPanel.setLayout(GridPanelLayout);
        GridPanelLayout.setHorizontalGroup(
            GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GridPanelLayout.createSequentialGroup()
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbA16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbB16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbC16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbF16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbG16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbI16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbK16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbL16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbM16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbN16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GridPanelLayout.setVerticalGroup(
            GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GridPanelLayout.createSequentialGroup()
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbA16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbB16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbC16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbF16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbK16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbL16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbM16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GridPanelLayout.createSequentialGroup()
                        .addComponent(cbN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(GridPanel);

        obstaclesButton.setText(resourceMap.getString("obstaclesButton.text")); // NOI18N
        obstaclesButton.setName("obstaclesButton"); // NOI18N
        obstaclesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obstaclesButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monsterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(obstaclesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(obstaclesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(monsterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N

        ResetMenu.setText(resourceMap.getString("ResetMenu.text")); // NOI18N
        ResetMenu.setName("ResetMenu"); // NOI18N
        ResetMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetMenuActionPerformed(evt);
            }
        });
        fileMenu.add(ResetMenu);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(cs134astarpathfinding.CS134AstarPathFindingApp.class).getContext().getActionMap(CS134AstarPathFindingView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        statusPanel.setName("statusPanel"); // NOI18N

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        stepButton.setText(resourceMap.getString("stepButton.text")); // NOI18N
        stepButton.setName("stepButton"); // NOI18N
        stepButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stepButtonMouseClicked(evt);
            }
        });

        fullPathButton.setText(resourceMap.getString("fullPathButton.text")); // NOI18N
        fullPathButton.setName("fullPathButton"); // NOI18N
        fullPathButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullPathButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullPathButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(statusAnimationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(stepButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fullPathButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setComponent(mainPanel);
        setMenuBar(menuBar);
        setStatusBar(statusPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void playerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerButtonMouseClicked
        model.setCurrentButton(CurrentButton.PLAYER);
        stepButton.setEnabled(true);
        fullPathButton.setEnabled(true);
    }//GEN-LAST:event_playerButtonMouseClicked

    private void monsterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monsterButtonMouseClicked
        model.setCurrentButton(CurrentButton.MONSTER);
        stepButton.setEnabled(true);
        fullPathButton.setEnabled(true);
    }//GEN-LAST:event_monsterButtonMouseClicked

    private void stepButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stepButtonMouseClicked
        model.step();
        playerButton.setEnabled(false);
        monsterButton.setEnabled(false);
        obstaclesButton.setEnabled(false);
    }//GEN-LAST:event_stepButtonMouseClicked

    private void fullPathButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullPathButtonMouseClicked
        model.findFullPath();
        playerButton.setEnabled(false);
        monsterButton.setEnabled(false);
        obstaclesButton.setEnabled(false);
    }//GEN-LAST:event_fullPathButtonMouseClicked

    private void obstaclesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obstaclesButtonMouseClicked
        model.setCurrentButton(CurrentButton.OBSTACLE);
    }//GEN-LAST:event_obstaclesButtonMouseClicked

    private void ResetMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetMenuActionPerformed
        model.reset();
        playerButton.setEnabled(true);
        monsterButton.setEnabled(true);
        obstaclesButton.setEnabled(true);
    }//GEN-LAST:event_ResetMenuActionPerformed

    private Model model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GridPanel;
    private javax.swing.JMenuItem ResetMenu;
    private javax.swing.JPanel cbA1;
    private javax.swing.JPanel cbA10;
    private javax.swing.JPanel cbA11;
    private javax.swing.JPanel cbA12;
    private javax.swing.JPanel cbA13;
    private javax.swing.JPanel cbA14;
    private javax.swing.JPanel cbA15;
    private javax.swing.JPanel cbA16;
    private javax.swing.JPanel cbA2;
    private javax.swing.JPanel cbA3;
    private javax.swing.JPanel cbA4;
    private javax.swing.JPanel cbA5;
    private javax.swing.JPanel cbA6;
    private javax.swing.JPanel cbA7;
    private javax.swing.JPanel cbA8;
    private javax.swing.JPanel cbA9;
    private javax.swing.JPanel cbB1;
    private javax.swing.JPanel cbB10;
    private javax.swing.JPanel cbB11;
    private javax.swing.JPanel cbB12;
    private javax.swing.JPanel cbB13;
    private javax.swing.JPanel cbB14;
    private javax.swing.JPanel cbB15;
    private javax.swing.JPanel cbB16;
    private javax.swing.JPanel cbB2;
    private javax.swing.JPanel cbB3;
    private javax.swing.JPanel cbB4;
    private javax.swing.JPanel cbB5;
    private javax.swing.JPanel cbB6;
    private javax.swing.JPanel cbB7;
    private javax.swing.JPanel cbB8;
    private javax.swing.JPanel cbB9;
    private javax.swing.JPanel cbC1;
    private javax.swing.JPanel cbC10;
    private javax.swing.JPanel cbC11;
    private javax.swing.JPanel cbC12;
    private javax.swing.JPanel cbC13;
    private javax.swing.JPanel cbC14;
    private javax.swing.JPanel cbC15;
    private javax.swing.JPanel cbC16;
    private javax.swing.JPanel cbC2;
    private javax.swing.JPanel cbC3;
    private javax.swing.JPanel cbC4;
    private javax.swing.JPanel cbC5;
    private javax.swing.JPanel cbC6;
    private javax.swing.JPanel cbC7;
    private javax.swing.JPanel cbC8;
    private javax.swing.JPanel cbC9;
    private javax.swing.JPanel cbD1;
    private javax.swing.JPanel cbD10;
    private javax.swing.JPanel cbD11;
    private javax.swing.JPanel cbD12;
    private javax.swing.JPanel cbD13;
    private javax.swing.JPanel cbD14;
    private javax.swing.JPanel cbD15;
    private javax.swing.JPanel cbD16;
    private javax.swing.JPanel cbD2;
    private javax.swing.JPanel cbD3;
    private javax.swing.JPanel cbD4;
    private javax.swing.JPanel cbD5;
    private javax.swing.JPanel cbD6;
    private javax.swing.JPanel cbD7;
    private javax.swing.JPanel cbD8;
    private javax.swing.JPanel cbD9;
    private javax.swing.JPanel cbE1;
    private javax.swing.JPanel cbE10;
    private javax.swing.JPanel cbE11;
    private javax.swing.JPanel cbE12;
    private javax.swing.JPanel cbE13;
    private javax.swing.JPanel cbE14;
    private javax.swing.JPanel cbE15;
    private javax.swing.JPanel cbE16;
    private javax.swing.JPanel cbE2;
    private javax.swing.JPanel cbE3;
    private javax.swing.JPanel cbE4;
    private javax.swing.JPanel cbE5;
    private javax.swing.JPanel cbE6;
    private javax.swing.JPanel cbE7;
    private javax.swing.JPanel cbE8;
    private javax.swing.JPanel cbE9;
    private javax.swing.JPanel cbF1;
    private javax.swing.JPanel cbF10;
    private javax.swing.JPanel cbF11;
    private javax.swing.JPanel cbF12;
    private javax.swing.JPanel cbF13;
    private javax.swing.JPanel cbF14;
    private javax.swing.JPanel cbF15;
    private javax.swing.JPanel cbF16;
    private javax.swing.JPanel cbF2;
    private javax.swing.JPanel cbF3;
    private javax.swing.JPanel cbF4;
    private javax.swing.JPanel cbF5;
    private javax.swing.JPanel cbF6;
    private javax.swing.JPanel cbF7;
    private javax.swing.JPanel cbF8;
    private javax.swing.JPanel cbF9;
    private javax.swing.JPanel cbG1;
    private javax.swing.JPanel cbG10;
    private javax.swing.JPanel cbG11;
    private javax.swing.JPanel cbG12;
    private javax.swing.JPanel cbG13;
    private javax.swing.JPanel cbG14;
    private javax.swing.JPanel cbG15;
    private javax.swing.JPanel cbG16;
    private javax.swing.JPanel cbG2;
    private javax.swing.JPanel cbG3;
    private javax.swing.JPanel cbG4;
    private javax.swing.JPanel cbG5;
    private javax.swing.JPanel cbG6;
    private javax.swing.JPanel cbG7;
    private javax.swing.JPanel cbG8;
    private javax.swing.JPanel cbG9;
    private javax.swing.JPanel cbH1;
    private javax.swing.JPanel cbH10;
    private javax.swing.JPanel cbH11;
    private javax.swing.JPanel cbH12;
    private javax.swing.JPanel cbH13;
    private javax.swing.JPanel cbH14;
    private javax.swing.JPanel cbH15;
    private javax.swing.JPanel cbH16;
    private javax.swing.JPanel cbH2;
    private javax.swing.JPanel cbH3;
    private javax.swing.JPanel cbH4;
    private javax.swing.JPanel cbH5;
    private javax.swing.JPanel cbH6;
    private javax.swing.JPanel cbH7;
    private javax.swing.JPanel cbH8;
    private javax.swing.JPanel cbH9;
    private javax.swing.JPanel cbI1;
    private javax.swing.JPanel cbI10;
    private javax.swing.JPanel cbI11;
    private javax.swing.JPanel cbI12;
    private javax.swing.JPanel cbI13;
    private javax.swing.JPanel cbI14;
    private javax.swing.JPanel cbI15;
    private javax.swing.JPanel cbI16;
    private javax.swing.JPanel cbI2;
    private javax.swing.JPanel cbI3;
    private javax.swing.JPanel cbI4;
    private javax.swing.JPanel cbI5;
    private javax.swing.JPanel cbI6;
    private javax.swing.JPanel cbI7;
    private javax.swing.JPanel cbI8;
    private javax.swing.JPanel cbI9;
    private javax.swing.JPanel cbJ1;
    private javax.swing.JPanel cbJ10;
    private javax.swing.JPanel cbJ11;
    private javax.swing.JPanel cbJ12;
    private javax.swing.JPanel cbJ13;
    private javax.swing.JPanel cbJ14;
    private javax.swing.JPanel cbJ15;
    private javax.swing.JPanel cbJ16;
    private javax.swing.JPanel cbJ2;
    private javax.swing.JPanel cbJ3;
    private javax.swing.JPanel cbJ4;
    private javax.swing.JPanel cbJ5;
    private javax.swing.JPanel cbJ6;
    private javax.swing.JPanel cbJ7;
    private javax.swing.JPanel cbJ8;
    private javax.swing.JPanel cbJ9;
    private javax.swing.JPanel cbK1;
    private javax.swing.JPanel cbK10;
    private javax.swing.JPanel cbK11;
    private javax.swing.JPanel cbK12;
    private javax.swing.JPanel cbK13;
    private javax.swing.JPanel cbK14;
    private javax.swing.JPanel cbK15;
    private javax.swing.JPanel cbK16;
    private javax.swing.JPanel cbK2;
    private javax.swing.JPanel cbK3;
    private javax.swing.JPanel cbK4;
    private javax.swing.JPanel cbK5;
    private javax.swing.JPanel cbK6;
    private javax.swing.JPanel cbK7;
    private javax.swing.JPanel cbK8;
    private javax.swing.JPanel cbK9;
    private javax.swing.JPanel cbL1;
    private javax.swing.JPanel cbL10;
    private javax.swing.JPanel cbL11;
    private javax.swing.JPanel cbL12;
    private javax.swing.JPanel cbL13;
    private javax.swing.JPanel cbL14;
    private javax.swing.JPanel cbL15;
    private javax.swing.JPanel cbL16;
    private javax.swing.JPanel cbL2;
    private javax.swing.JPanel cbL3;
    private javax.swing.JPanel cbL4;
    private javax.swing.JPanel cbL5;
    private javax.swing.JPanel cbL6;
    private javax.swing.JPanel cbL7;
    private javax.swing.JPanel cbL8;
    private javax.swing.JPanel cbL9;
    private javax.swing.JPanel cbM1;
    private javax.swing.JPanel cbM10;
    private javax.swing.JPanel cbM11;
    private javax.swing.JPanel cbM12;
    private javax.swing.JPanel cbM13;
    private javax.swing.JPanel cbM14;
    private javax.swing.JPanel cbM15;
    private javax.swing.JPanel cbM16;
    private javax.swing.JPanel cbM2;
    private javax.swing.JPanel cbM3;
    private javax.swing.JPanel cbM4;
    private javax.swing.JPanel cbM5;
    private javax.swing.JPanel cbM6;
    private javax.swing.JPanel cbM7;
    private javax.swing.JPanel cbM8;
    private javax.swing.JPanel cbM9;
    private javax.swing.JPanel cbN1;
    private javax.swing.JPanel cbN10;
    private javax.swing.JPanel cbN11;
    private javax.swing.JPanel cbN12;
    private javax.swing.JPanel cbN13;
    private javax.swing.JPanel cbN14;
    private javax.swing.JPanel cbN15;
    private javax.swing.JPanel cbN16;
    private javax.swing.JPanel cbN2;
    private javax.swing.JPanel cbN3;
    private javax.swing.JPanel cbN4;
    private javax.swing.JPanel cbN5;
    private javax.swing.JPanel cbN6;
    private javax.swing.JPanel cbN7;
    private javax.swing.JPanel cbN8;
    private javax.swing.JPanel cbN9;
    private javax.swing.JPanel cbO1;
    private javax.swing.JPanel cbO10;
    private javax.swing.JPanel cbO11;
    private javax.swing.JPanel cbO12;
    private javax.swing.JPanel cbO13;
    private javax.swing.JPanel cbO14;
    private javax.swing.JPanel cbO15;
    private javax.swing.JPanel cbO16;
    private javax.swing.JPanel cbO2;
    private javax.swing.JPanel cbO3;
    private javax.swing.JPanel cbO4;
    private javax.swing.JPanel cbO5;
    private javax.swing.JPanel cbO6;
    private javax.swing.JPanel cbO7;
    private javax.swing.JPanel cbO8;
    private javax.swing.JPanel cbO9;
    private javax.swing.JPanel cbP1;
    private javax.swing.JPanel cbP11;
    private javax.swing.JPanel cbP12;
    private javax.swing.JPanel cbP13;
    private javax.swing.JPanel cbP14;
    private javax.swing.JPanel cbP15;
    private javax.swing.JPanel cbP16;
    private javax.swing.JPanel cbP2;
    private javax.swing.JPanel cbP3;
    private javax.swing.JPanel cbP4;
    private javax.swing.JPanel cbP5;
    private javax.swing.JPanel cbP6;
    private javax.swing.JPanel cbP7;
    private javax.swing.JPanel cbP8;
    private javax.swing.JPanel cbP9;
    private javax.swing.JPanel cnP10;
    private javax.swing.JButton fullPathButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton monsterButton;
    private javax.swing.JButton obstaclesButton;
    private javax.swing.JButton playerButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JButton stepButton;
    // End of variables declaration//GEN-END:variables

    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;

    private JDialog aboutBox;
}
