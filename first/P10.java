package first;

public class P10 {
    public void print(int n){
        int star=1, space=n-1;
        for(int j=0; j<2*n-1; j++){
            for(int i=space; i>0; i--){
                System.out.print(" ");
            }
            for(int i=0; i<star; i++){
                System.out.print("*");
            }
            System.out.println();
            if(j<=n/2) star++;
            else star--;
        }
    }
}
