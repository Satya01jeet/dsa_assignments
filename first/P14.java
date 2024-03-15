package first;

public class P14 {
    public void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
