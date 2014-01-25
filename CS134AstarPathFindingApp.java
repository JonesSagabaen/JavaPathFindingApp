/** COPYRIGHT(C). Jonathan Sagabaen. All Rights Reserved.
    Java application that displays the A* path finding algorithm.
    @author Jonathan Sagabaen
    @version 4.0
*/
package cs134astarpathfinding;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class CS134AstarPathFindingApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new CS134AstarPathFindingView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of CS134AstarPathFindingApp
     */
    public static CS134AstarPathFindingApp getApplication() {
        return Application.getInstance(CS134AstarPathFindingApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(CS134AstarPathFindingApp.class, args);
    }
}
