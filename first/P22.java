package first;

public class P22 {
    public void print(int n){
        for(int i=0; i<2*n-1; i++){
            int v=0;
            for(int j=0; j<2*n-1; j++){
                System.out.print(n-v+" ");
                if(v<i && i<n && j<n-1) v++;
                else{
                    if(v>0 && i>=n-1 && j>=n-1) v--;
                }
            }
            System.out.println();
        }
    }
}
