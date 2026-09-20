//class Pattern{
    //public static void main(String args[]){
      //  System.out.println("*");
        //System.out.println("**");
        //System.out.println("***");
        //System.out.println("****");
  //  }
//}

//class Pattern{
  //  public static void main(String args[]){
   //     int a=25;
     //   int b=45;
       // int c=a+b;
       // float d=a*b;
       // float e=c/a;
       // float f=c%a;
       // System.out.println(e);
       // System.out.println(c);
       // System.out.println(d);
        //System.out.println(f);
    //}
//}

import java.util.Scanner;
//class Pattern{
  //  public static void main(String args[]){
   //     Scanner sc=new Scanner(System.in);
     //   System.out.println("Enter a no : ");
     //   int a=sc.nextInt();
    //    Float b=sc.nextFloat();
     //   float sum=a+b;
      //  System.out.println(sum);
      //  System.out.println("No is "+a);
      //  System.out.println("No is"+b);
   // }
//}

/* Important  #1
*****
*****
*****
*****
 */
/*
class Pattern{
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
*/
/*Hollow rectangle #2
*****
*   *
*   *
*****
 */
/*
class Pattern{
    public static void main(String args[]){
        for(int i=1;i<=4;i++ ){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/

/* Half pyramid #3
*
**
***
****
 */
/*
class Pattern{
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/* Inverted half pyramid #4
****
***
**
*
 */
/*
class Pattern{
    public static void main(String args[]){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/* rotated by 180 degree inveretd half pyramid #5
   *
  **
 ***
****
 */
/*
class Pattern{
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/* Half pyramid with no #6
1
12
123
1234
12345
 */
/*
class Pattern{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

/* Inverted half pyramid with no #7
12345
1234
123
12
1
 */
/*
class Pattern{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

/* Floyd's triangle #8
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
 */
/*
class Pattern{
    public static void main(String args[]){
        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}*/

/* 0-1 Triangle #9
1
01
101
0101
10101
 */

class Pattern{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

