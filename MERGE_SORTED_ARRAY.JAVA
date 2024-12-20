class MERGE_SORTED_ARRAY{
    public void merge(int[] nums1,int m, int[] nums2, int n) {
        int[] merge = new int[m+n];
        int i = m;
        int j = 0;
        do {
            nums1[m]=nums2[j];
            m++;
            j++;
        } while (j<n);

    } //merge// MERGE_SORTED_ARRAY

    public static void main(String arg[]){
//        String[] abc = "sdfsf";
    }
}