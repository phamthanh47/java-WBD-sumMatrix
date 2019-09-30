package com.company;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("nhap kich thuoc mang: ");
        int row=scanner.nextInt();
        int[][] arr=new int[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print("nhap phan tu thu ["+i+","+j+"]= ");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("cac phan tu cua mang la : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        int result1=sumMainDiagolanMatrix(arr);
        System.out.print("tong duong cheo chinh : "+result1+" ");
        int results2=sumFillerDiagolanMatrix(arr);
        System.out.print("tong duong cheo phu : "+results2);
    }
    public static int sumMainDiagolanMatrix(int[][] arr){
         int sum=0;
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[i].length;j++){
                 if(i==j){
                     sum +=arr[i][j];
                 }
             }
         }
         return sum;
    }
    public static int sumFillerDiagolanMatrix(int[][] arr){
           int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if((i+j)==arr.length-1){
                    sum +=arr[i][j];
                }
            }
        }
        return sum;
   }
}
