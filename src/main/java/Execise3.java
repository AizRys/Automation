public class Execise3 {

    public static void main(String[]args){
        int[]arr = {1, 5, 10, 100};
        Execise3 e = new Execise3();
        e.increase(arr,2);
        System.out.println(arr);
    }

    public void increase(int[] arr,int n){
        arr[n] = (int)(arr[n] * 1.1);
    }
}
