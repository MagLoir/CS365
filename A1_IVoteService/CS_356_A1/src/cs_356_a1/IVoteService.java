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

public class IVoteService {
   
    //public String question;
    public String type;
    Question question;
    
    ///link the student id witht he anwer throu\w a map and hashmap
    public Map<UUID, List<String>> stdAnswer= new Hashtable<UUID, List<String>>();
    
    public List<String> stdAns= new ArrayList<String>();
    public ArrayList<Student> std = new ArrayList<Student>();
    
    public int[] c;
    public IVoteService(Question q, String t){
        this.question=q;
        this.type=t;
//        this.stdAnswer= (Map<UUID, List<String>>) q.getChoice();
        c= new int[this.stdAnswer.size()];
        this.stdAns = q.getChoice();
    }
       
    public void addStdAnswers(UUID ID, List<String> answers){
        
        if(this.type.equals("Multiple choice question") && answers.size()>1){
            this.stdAnswer.put(ID, answers);
        }
        else if(this.type.equals("Single choice question") && answers.size()<=1){
            this.stdAnswer.put(ID, answers);
        }
    }
    public int poll(){
        return 0;
//        for(int i =0; i<this.std.size(); i++){
//            for(int j = 0; j<this.stdAns.size();j++){
//                for(int h=0; h<this.std.get(i).getAnswer().size();h++){
//                    if(this.std.get(i).getAnswer().get(j).equals(this.stdAns.get(i))){
//                        this.c[i]++;
//                    }
//                }
//            }
//            
//        }
//        return c;

//        List<String> c = this.question.answers;
//        int n=0;
//        for(List<String>sAns:stdAnswer.values()){
//            if(sAns.equals(c)){
//                n++;
//            }
//        }
//        return n;
    }
    
    public void printService(){
        //poll();
        List<String> c = this.question.answers;
        int n=0;
        for(List<String>sAns:stdAnswer.values()){
            if(sAns.equals(c)){
                n++;
            }
        }
        System.out.println("Answers Poll: ");
        for(int i=0; i<this.stdAns.size();i++){
            System.out.println(this.stdAns.get(i) + " "+ n);
        }
        
        System.out.println();
    }   
    
}
