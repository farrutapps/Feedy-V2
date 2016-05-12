/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedy;

import feedy.view.MainWindow;
import feedy.view.WelcomeView;

/**
 *
 * @author Sebastian
 */
public class Feedy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World!!");
        
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.setVisible(true);
        mainWindow.setContentPane(welcomeView);
    }
    
}
