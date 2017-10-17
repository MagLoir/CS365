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

public class Student {


    private ArrayList<String> answers = new ArrayList<String>();
    private UUID stdID;
    
    public Student(){
        setID(UUID.randomUUID());
    }

    private void setID(UUID randomUUID) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.stdID= randomUUID;
        
    }
   
    public UUID getID(){
        return stdID;
    }
    
    public void setAnswer(String ans){
        this.answers.add(ans);
    }
    public ArrayList<String> getAnswer(){
        return answers;
    }
    public void printStudent(){
        System.out.println(getAnswer());
    }
}
