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

public class SimulationDriver {

    
    public static Random r = new Random();
    public static void singleChoice(){
        String q = "Donald Trump is the 46th president of the United States";
        String t= "single";
        String[] pick={"A. True","B. False"};
        String[] answer={"True"};
        
        System.out.println("Single choice question: ");
        
        Question question = new Question(q,answer,pick);
        IVoteService survey=new IVoteService(question,t); //{
        UUID ID = null;

        studentGenerator(survey,pick, ID);
        question.printQuestion();
        question.printChoices();
        survey.printService();
         
    }
    
    public static void multipleChoice(){
        String q = "What is the capital city of California?";
        String t= "multiple";
        String[] pick={"A. San Francisco","B. Los Angeles", 
                       "C. San Diego", "D. Sacramento"};
        String[] answer = {"D. Sacramento"};
        
        System.out.println("\n" +"Multiple choice question: ");
        
//        List<String>ch= new ArrayList<String>();
//        ch.add("San Francisco");
//        ch.add("Los Angeles");
//        ch.add("San Diego");
//        ch.add("Sacramento");
        
        UUID ID = null;
        
        Question question = new Question(q,answer,pick);
        IVoteService survey=new IVoteService(question,t); 
//        {
//            @Override
//            public int[] poll() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
        
        studentGenerator(survey,pick, ID);
        question.printQuestion();
        question.printChoices();
        survey.printService();
         
    }
    public static void studentGenerator(IVoteService survey, String[] ans, UUID ID) {
        
        //Random r = new Random();
        int rand = r.nextInt();
        List<String> answer = Arrays.asList(ans);
        for(int i = 0; i<rand; i++){
            String[] a = answerGenerator(answer);
            survey.addStdAnswers( ID, answer);
        }
        
          
    }
    
    public static String[] answerGenerator(/*List<String>*/ List<String> ans){
        int rand = r.nextInt(ans.size());
        List<String> picks = new ArrayList<String>();
        for(int i=0; i<rand;i++){
            if(!picks.contains(ans.get(rand))){
                picks.add(ans.get(i));
            }
        }
        return picks.toArray(new String[0]);
    }
    /*List<String>*/    
        
    public static void main(String[] args) {
        // TODO code application logic here
        singleChoice();
        multipleChoice();  
        
    }

    
    
    
    
    
}
