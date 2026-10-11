import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int key=4;
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
}
