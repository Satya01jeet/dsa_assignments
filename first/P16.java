package first;

public class P16 {
    public void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }
    }
}
