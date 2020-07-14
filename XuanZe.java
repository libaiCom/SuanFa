//选择排序
public class XuanZe {
    int ox = 0;
    int oxx = 0;
    public void xuanze (int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int k=i+1;k<a.length;k++)
            {
                if(a[i]>a[k])
                {
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp; 

                    ox++;

                    System.out.print("当前第"+i+"次轮盘，"+"第"+ox+"次交换，"+"共循环"+oxx+"次，"+"选择排序结果为：");

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
