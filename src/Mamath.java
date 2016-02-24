public class Mamath {
    static  int arr [];
    final static double PI=3.14;

    public static int findMin( int[] arr){
        int min = arr[0];
        for (int element :arr) {if (element< min) min=element; }
        return  min;    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int element :arr) {if (element> max) max=element; }
        return max;    }

    public static double areaOfCircle(int r){
        double area=Math.pow(r,2)*PI;
        return area;}}