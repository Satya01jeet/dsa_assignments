package first;

public class P20 {
    public void print(int n){
        int star=1, sp=2*n-2;
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            for(int j=0; j<sp; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            if(i<=n/2){
                star++;
                sp-=2;
            }
            else{
                star--;
                sp+=2;
            }
            System.out.println();
        }
    }
}
