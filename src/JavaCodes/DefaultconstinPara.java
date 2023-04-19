
package JavaCodes;

public class DefaultconstinPara {
    
    DefaultconstinPara(){
        System.out.println("Defualt constructor");
    }
    
    DefaultconstinPara(int a){
        this();
        System.out.println("parameterised constructor");
   
    }
    
    
    
    public static void main(String[] args) {
        
        DefaultconstinPara p=new DefaultconstinPara(10);
        
        
    }
}
