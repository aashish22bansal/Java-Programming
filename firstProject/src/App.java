public class App {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        int m=6;
        int n=3;
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int[] nums3 = new int[m+n];
        for(a=0,b=0,c=0;a<m && b<n;){
            if(nums1[a] <= nums2[b]){
                nums3[c++] = nums1[a++];
            }
            else{
                nums3[c++] = nums2[b++];
            }
            System.out.println("Nums3: ");
            for(int i=0;i<nums3.length;i++){
                System.out.print(nums3[i]);
            }
            System.out.println();
        }
        if(a>m){
            while(b<=n){
                nums3[c++] = nums2[b++];
            }
        }
        if(b>n){
            while(a<=m){
                nums3[c++] = nums1[a++];
            }
        }
    }
}
