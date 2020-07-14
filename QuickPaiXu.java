public class QuickPaiXu {

    int oxx = 0;

    public void quickpaixu(int[] a,int left,int right) 
    {

        if(left>right){
            return;
        }

        int x = a[left];
        int i = left;
        int j = right;


        
        while(i < j)
        {
            while(i<j && a[j] >= x)
            {
                j--;
            }
            while(i<j && a[i] <= x)
            {
                i++;
            }

            if(i<j)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                oxx++;
                System.out.print("交换"+oxx+"次，此时i="+i+",J="+j+"------");

                for(int ii=0;ii<a.length;ii++){
                    System.out.print(a[ii]+",");
                }
                System.out.println();
            }

        }

            System.out.print("交换a[left],i，j此时分别为："+a[left]+","+i+","+j+"--------");

            a[left] = a[i];
            a[i] = x;

            for(int ii=0;ii<a.length;ii++){
                System.out.print(a[ii]+",");
            }
            System.out.println();
            
            
            quickpaixu(a, left, i-1);
            quickpaixu(a, i+1, right);

    }
    
}