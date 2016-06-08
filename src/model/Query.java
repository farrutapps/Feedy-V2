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
public class Query {
    List surveys;
    List questionIdsToEvaluate;
    List style;
    
    public Query(List surveys, List questionIdsToEvaluate, List style) {
        this.surveys = surveys;
        this.questionIdsToEvaluate = questionIdsToEvaluate;
        this.style = style;
    }
    
    
    
    
    
    
}
