import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the element of an array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target Value ");
        int target =sc.nextInt();
        int left=0, right=n-1;
        boolean found=false;
        while(left<right){
            int sum=arr[left]+arr[right];
                if(sum==target){
                System.out.println(left+ " "+right);
                    found=true;
                    break;
            } 
            else if (sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
        }
        if(!found)
            System.out.println("not found the target value ");
            }
        }
    
