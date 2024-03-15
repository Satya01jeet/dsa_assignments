package first;

public class P18 {
    public void print(int n){
        for(int i=1; i<=n; i++){
            int v = n-i;
            for(int j=1; j<=i; j++){
                System.out.print((char)('A'+ v++)+" ");
            }
            System.out.println();
        }
    }
}
