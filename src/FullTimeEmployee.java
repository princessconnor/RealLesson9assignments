/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author conn6070
 */
public class FullTimeEmployee extends Employee {

     public FullTimeEmployee(){
        super();
    }
   
    public double getPay()
    {
        double emppay;
        if(hours>40)
        {
            emppay = ((hours - 40)*rate) + hours * rate;
        }
            else
        {
            emppay = hours * rate;
            totalPay += emppay;
        }
        return emppay;
    }    
    
}
