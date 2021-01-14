/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author ka5054d
 */
public class DateController {
    private DateModel model;
    private DateView view;
    
    public DateController(DateModel model, DateView view){
     this.model = model;
     this.view = view;
 
    
    }
    
    public void setTodayDate(String date){
        model.setDate(date);
    }
    
    public String getTodayDate(){
       return model.getDate();
    }
    
    public void updateView(){
    
     view.printDate(model.getDate());
    }
}