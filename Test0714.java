package Day0714;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-14
 * Time: 22:10
 */
public class Test0714 {
    //满二叉树的子节点与父节点之间的关系为root = child/2
    //利用这个关系 如果a!=b 就让其中较大数除以2 如此循环直到a==b
    //就是原来两个数的最近公共祖先

    public int getLCA(int a ,int b){
//        if (a==b||b/2==a) {//a 和 b 是同一个数 或者a是b的父节点
//            return a;
//        }
//        if(a/2==b) {
//            return b;//b是a的父节点
//        }
//        if (b/2==a/2){
//            return a/2;
//        }
        while(a!=b) {
            if(a<b){
                b/=2;
            }else{
                a/=2;
            }
        }
        return b;
    }
}
