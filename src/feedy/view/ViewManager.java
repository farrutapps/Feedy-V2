/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedy.view;

import feedy.Controller.Controller;
import java.awt.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author ratz
 */
public class ViewManager implements ProgressListener{
    private ArrayList<JPanel> stack;
    
    private Controller controller;
    
    private MainWindow mainWindow;
    
    private WelcomeView welcomeView;
    private DatabaseView databaseView;
    private AddSurveyView addSurveyView;
    
    
    public ViewManager(MainWindow mainWindow,Controller controller) {
        this.mainWindow=mainWindow;
        this.controller=controller;
        initResources();
        
        mainWindow.setPanel(welcomeView);
        mainWindow.setVisible(true);
    }
    
    @Override
    public void nextForm(Destination destinationView) {
        switch(destinationView){
            case WELCOME:
                mainWindow.setPanel(this.welcomeView);
                
                break;
            case DATABASE:
                mainWindow.setPanel(this.databaseView);
                
                break;
            case ADDSURVEY:
                mainWindow.setPanel(this.addSurveyView);
                
                break;
                
            case NEXT_QUESTION_TYPE:
                SetQuestionTypeView newView = new SetQuestionTypeView(controller, this);
                mainWindow.setPanel(newView);
                stack.add(newView);
                break;
                
            case PREVIOUS_QUESTION_TYPE:
        {
            try {
                throw new Exception ("Zurück not implemented");
            } catch (Exception ex) {
                
            }
            break;
        }
                
                
        }
    }

    private void initResources() {
        welcomeView = new WelcomeView(controller,this);
        databaseView = new DatabaseView(controller,this);
        addSurveyView = new AddSurveyView(controller,this);
    }
    
}
