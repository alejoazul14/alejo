/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Super;

/**
 *
 * @author ESTACION
 */
public class B extends A {

    private int i;
    
    public B (int y, int w){
    
        super (y);
        i=w;
    }
    
    public int sumar (){
        
        return (i + super.geti()); 
    }
}
