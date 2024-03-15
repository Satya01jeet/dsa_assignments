package first;

public class P15 {
    public void print(int n){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
