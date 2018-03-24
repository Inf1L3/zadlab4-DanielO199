
package pl.edu.ur.polab4.obliczanieFigur;

public class Kwadrat {
    
    public int bok;
   public int pole;
    public int obwod;
    
    public Kwadrat(int bok){
    this.bok=bok;
    }
    
    public int pole(int bok){
        
    return pole= bok*bok;
   
    }
     
    public int obwod(int bok){
    
    obwod=bok+bok+bok+bok;
    return obwod;
    }
    
    public void Pokadane(){
    
        System.out.println("Bok kwadratu to: "+bok);
        System.out.println("Obwod kwadratu= "+obwod(bok));
        System.out.println("Pole kwadratu= "+pole(bok));
    
    }
    
}
