package Day0714;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-14
 * Time: 16:11
 */
public class Test0713 {
    //木棒拼图
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[][] op=new int[n][2];
            for(int i = 0;i<n;i++) {
               op[i][0] =sc.nextInt();
                op[i][1] =sc.nextInt();
            }
            stickPuzzle(n,op);
        }
    }
    public  static void stickPuzzle(int n,int[][]op) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<n;i++) {
            if(op[i][0] == 1) {
                list.add(op[i][1]);
            }else{
                list.remove(new Integer(op[i][1]));
            }
            if (canFormPoly(list)) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            }
        }
        //判断能否构成多边形
    public static boolean canFormPoly(ArrayList<Integer> list) {
        int len = list.size();
        Collections.sort(list);
        int maxNum = list.get(len-1);
        int sum= 0;
        for(int i=0;i<len-1;i++) {
            sum +=list.get(i);
        }
        if (sum<=maxNum) {
            return false;
        }
        return  true;
    }
    public static boolean canFormPoly1(ArrayList<Integer> list) {
        int len = list.size();
        if(len<3) {
            return false;
        }
        for(int i=0;i<len;i++) {
            int tmp = list.remove(i);
            int sum =0;
            for(int j=0;j<len-1;j++) {
                sum +=list.get(j);
            }
            if(sum<=tmp) {
                list.add(i,tmp);
                return false;
            }
            list.add(i,tmp);
        }
        return  true;
    }
    }

