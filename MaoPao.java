//冒泡排序
public class MaoPao {
    int ox = 0;
    int oxx = 0;
    public void maopao (int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<a.length-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    int temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;

                    ox++;
                    
                    System.out.print("当前第"+i+"次轮盘，"+"第"+ox+"次交换，"+"共循环"+oxx+"次，"+"冒泡排序结果为：");

                    for(int kk=0;kk<a.length;kk++)
                    {
                        System.out.print(a[kk]+",");
                    }
                    System.out.println("-------"+"i:"+i+","+"k:"+k+"--------");

                }
                oxx++;
            }

            
        }

    }
}