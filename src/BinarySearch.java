public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = new int[]{1,5,6,8,9,11,15};
        int num = 11;
        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(sortedArray,num);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
        int l=0,r=sortedArray.length-1;
        int result2 = bs.binarySearchRecursive(sortedArray,l,r,num);
        System.out.println(result2);
    }

    private int binarySearch(int[] arr, int x){
        int l=0,r=arr.length-1,m;
        for(;l<=r;){
            m=(l+r)/2;
            if(arr[m]==x){
                return m;
            }

            else if(arr[m]<x)
                l=m+1;
            else if(arr[m]>x)
                r=m-1;
        }
        return -1;
    }

    private int binarySearchRecursive(int[] arr, int l,int r, int x){
        if(l<=r){
            int m=(l+r)/2;
            if(arr[m]==x)
                return m;
            else if(arr[m]<x)
                return binarySearchRecursive(arr, m + 1, r, x);
            else if(arr[m]>x)
                return binarySearchRecursive(arr,l,m-1,x);
        }
        return -1;
    }
}
