/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedy;

import feedy.Controller.Controller;
import feedy.view.AddSurveyView;

import feedy.view.MainWindow;
import feedy.view.ProgressListener;
import feedy.view.Destination;
import feedy.view.ViewManager;




public class Feedy  {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World!!");
        
        //controller
        Controller controller = new Controller();
        
        //view
        MainWindow mainWindow = new MainWindow();
        ViewManager viewManager = new ViewManager(mainWindow, controller);
        
        //model
        
        
        
        
        
        
    }

    
    

    

   

    

   
    
}
