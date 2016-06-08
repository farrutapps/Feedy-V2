/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.List;

/**
 *
 * @author ratz
 */
public class Question {
    List answers;
    int id;
    QuestionStyle questionstyle;

    public Question(List answers, int id, QuestionStyle questionstyle) {
    this.answers = answers;
    this.id = id;
    this.questionstyle = questionstyle;
    }
    
    
    
}
