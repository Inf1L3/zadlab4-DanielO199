package pl.edu.ur.polab4;


public class Student {
    
    public String imie;
    public String nazwisko;
    public  int nr_indeksu;
    public String nazspec;
    public int rok;
    
    
    
    public Student(String imie, String nazwisko, int nr_indeksu,String nazspec, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazspec=nazspec;
        this.rok=rok;
    }
    
    public Student(String imie){
    
        this.imie=imie;
    }
      public Student(String nazwisko, String imie){
    
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
        public Student(int rok, String imie ){
    
        this.rok=rok;
        this.imie=imie;
    }
          public Student(int rok ){
    
        this.rok=rok;
    }
    
   public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println( this.nr_indeksu);
        System.out.println( this.nazspec);
        System.out.println( this.rok);}
   
   }       
   
   
    

