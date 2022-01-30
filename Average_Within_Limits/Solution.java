import java.util.*;

class Solution{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[5];

        for(int i=0; i<5; i++){
            ar[i]= sc.nextInt();
        }

        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        sc.close();

        List<Integer> ls = new ArrayList<>(0);
        int sum=0;
        for(int a : ar){
            if(a>limit1 && a<limit2){
                ls.add(a);
                sum+=a;
            }
        }

        if(ls.size()==0){
            System.out.println(0);
        }else{
            System.out.println(sum/ls.size());
        }

    }

}
