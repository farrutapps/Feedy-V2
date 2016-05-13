/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedy;

import feedy.Controller.Controller;
import feedy.view.MainWindow;
import feedy.view.WelcomeView;
import feedy.view.*;

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
         
        Controller controller = new Controller();
        controller.setMainWindow(mainWindow);
        //view
       
       WelcomeView welcomeView = new WelcomeView(controller);
       
       mainWindow.setContentPane(welcomeView);
       mainWindow.setVisible(true);
        // controller
        
        
        // model
        
        
        //set references according to MVC
        
        /*
        
       model     .addController(controller);
	  view      .addController(controller);
	  controller.addModel     (model);
	  
	  view.build();
		view.setVisible(true);
        */
        
        
        
        
        
    }
    
}
