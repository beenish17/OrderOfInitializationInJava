
package orderofinitialization;

public class Oreder {
    
    public Oreder(){
        System.out.println("Reading a constructor");
    }
    private String name="Torchie";
    {
        System.out.println(name);
    }
    private static int Count=0;
   
    static{
        System.out.println(Count);
    }
    {
        Count++;
        System.out.println(Count);
    }
    
   
}
