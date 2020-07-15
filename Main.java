public class Main{
    public static void main(String[] args) 
    {

        System.out.println("hello,world");
        int[] a = {5,3,9,2,6,7,1,4,8};
        
        for(int iii=0;iii<a.length;iii++){
            System.out.print(a[iii]+",");
        }
        System.out.println("排序前是");


        /*
        MaoPao maoPao =new MaoPao();
        maoPao.maopao(a);
        System.out.println("最终oxx"+maoPao.oxx);
        */
        

        /*
        XuanZe xuanZe = new XuanZe();
        xuanZe.xuanze(a);
        System.out.println("最终oxx"+xuanZe.oxx);
        */

        /*JiWeiJiu jiWeiJiu = new JiWeiJiu();
        jiWeiJiu.jiWeiJiu(a);
        */



        QuickPaiXu quickPaiXu = new QuickPaiXu();
        quickPaiXu.quickpaixu(a,0,a.length-1);

        System.out.println("-----排序后---------");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
    }
}