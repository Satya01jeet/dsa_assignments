package first;

public class P11 {
    public void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((i%2 ^ j%2)^1);
            }
            System.out.println();
        }
    }
}
