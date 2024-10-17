import java.util.Scanner;
public class Sum{
    public static void main(String args[]){
     System.out.println("Enter three numbers");
     Scanner sc=new Scanner(System.in);
     int n1=sc.nextInt(); 
     int n2=sc.nextInt(); 
     int n3=sc.nextInt(); 
      int small;
      int large;
     if(n1>n2 && n1>n3 )
     { 
        if(n2>n3){
         large=n1;
         small=n3;
        }
     else{
       small=n2;
      large=n1;
     }
    }
else if(n2>n1 && n2>n3 )
     { 
        if(n1>n3){
         large=n2;
         small=n3;
        }
     else{
       small=n1;
      large=n2;
     }
      
     
}
else{
    if(n2>n1){
         large=n3;
         small=n1;
        }
     else{
       small=n2;
      large=n3;
     }
      

    

}
System.out.println("Addition of largest and smallest number is :"+ (small+large));
}
}