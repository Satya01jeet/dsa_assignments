package first;

public class P17 {
    public void print(int n){
        int sp=n-1, c=1;
        for(int j=0; j<n; j++){
            for(int i=0; i<sp; i++){
                System.out.print(" ");
            }
            sp--;
            int v=0;
            for(int i=0; i<c; i++){
                System.out.print((char)('A'+v));
                if(i<c/2) v++;
                else v--;
            }
            c+=2;
            System.out.println();
        }
    }
}
