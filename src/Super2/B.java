/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Super2;



/**
 *
 * @author ESTACION
 */
public class B extends A {

    int i;
    
    public B (int y, int w){
    
        super.i=y;
        i=w;
    }
    
    public String mostrar (){
        
        return ("i es ="+i+ " super.i es =" + super.i); 
    }
}
