package TecnicasDeProgramacion;

public class feb22 {
    public static void main(String[] args){
        int a;
        a=2012;
        if(a % 400 ==0){
            System.out.println("ES BISIESTO");
        }else{
            if(a%4==0 && a%100 !=0){
                System.out.println("ES BISIESTO");
            }else{
                System.out.println("NO ES BISIESTO");
            }
        }
    }
}
