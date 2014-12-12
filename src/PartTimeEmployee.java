/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author conn6070
 */
public class PartTimeEmployee extends Employee 
{
 public PartTimeEmployee()
    {
        super();
    }
    
    public double getPay()
    {
        double emppay = hours * rate;
        totalPay += emppay;
        return emppay;
    }

}
    
