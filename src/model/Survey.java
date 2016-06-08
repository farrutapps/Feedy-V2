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
public class Survey {
    List questions;
    String date;
    String place;
    int surveyType;

    public Survey(List questions, String date, String place, int surveyType) {
    this.questions = questions;
    this. date = date;
    this.place = place;
    this.surveyType = surveyType;
    }
    
    
    
}
