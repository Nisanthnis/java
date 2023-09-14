public class trimble {
    public static void main(String[] args) {
        int arr[]={5,6,2,1};
        String s[]={"rat","bat","kil","bill"};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            int k=0;
            for(int j=0;j<arr;)
            if(arr[i]>max){
                max=arr[i];
                arr[i]=0;
                k=i;
            }
            System.out.println(s[k]);
        }
    }
}
