
package pkgswitch;


public class Switch {

    
    public static void main(String[] args) {
        
        
        String empresas = "GOOGLE";
        
        switch(empresas){ //if(){}
            
            case "google || GOOGLE" :
                System.out.println("SOY GOOGLE");
                break;
            case "sony":
                System.out.println("SOY SONY");
                
                break;
            case "apple":
                System.out.println("SOY APPLE");
                break;
            case "sipply":
                System.out.println("SOY SIPPLY");
                break;
            default:
                System.out.println("OTRAS EMPRESAS");
        
        }
        
    }
    
}
