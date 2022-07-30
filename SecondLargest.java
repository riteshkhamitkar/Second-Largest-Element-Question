public class joker{
    public static void main(String[] args){
        int arr[] = {2,3,4,5,9,28,18};
        int size = arr.length;
        for(int i =0; i < size; i++){
            for (int j = 0; j < size -i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Second largest is " + arr[size-2]);
    }
}
