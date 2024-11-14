import java.util.*;
class TrappedWater{
    public static void main(String[] args) {
        int b[] = {4,2,0,6,3,2,5};
        System.out.println(solve(b));
    }
    public static int solve(int b[]){
        int lm[] = new int[b.length];
        lm[0] = b[0];
        for(int i = 1;i<lm.length;i++){
            lm[i] = Math.max(lm[i-1],b[i]);
        }
        int rm[] = new int[b.length];
        rm[rm.length-1] = b[b.length-1];
        for(int i = rm.length-2;i>=0;i--){
            rm[i] = Math.max(rm[i+1],b[i]);
        }
        int sum = 0;
        for(int i = 0;i<b.length;i++){
            sum += (Math.min(lm[i],rm[i])-b[i]);
        }
        return sum;
    }
}