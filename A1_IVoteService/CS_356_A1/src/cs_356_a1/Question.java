/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_356_a1;

/**
 *
 * @author pungi
 */

import java.util.*;
public class Question {
    
    public String question;
    public List<String> answers = new ArrayList<String>();
    public List<String> choice = new ArrayList<String>();
    
    public Question(String q, String[] answer, String[] pick){
        this.question = q;
        Collections.addAll(choice, pick);
        Collections.addAll(answers, answer);
    }

    
    
    public void setChoice(String c, boolean a){
        this.choice.add(c);
        
        //single choice question
        if(a && answers.isEmpty()){
            this.answers.add(c);
        }
        else if (a && !answers.isEmpty()){
            System.out.print("Incorrect input. "
                    + "This is single choice question with only one answer");
        }
        //mutliple choice
        else{
           this.answers.add(c);
        }
    }
    public List<String> getChoice(){
        return this.choice;
    }
    
    public List<String> getAnswers(){
        return this.answers;
    }

    public void printQuestion(){
        System.out.println(question);
    }
    public void printChoices(){
        for(int i =0; i<this.choice.size(); i++){
            System.out.println(this.choice.get(i) );
        }
        System.out.println();
        //System.out.println(choice);
//        int numberOfChoice=1;
//        for(int i =0; i<this.choice.size();i++){
//            System.out.println(numberOfChoice++ + "."+ " "+ this.choice.get(i));
//        }
    }
    
    
    
}
