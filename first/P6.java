package first;

public class P6 {
    public void print(int n){
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
