public class ReverseString {
    public String reverseString(String s) {
        int in = s.length();
        char[] arr = s.toCharArray();
        char[] newArr = s.toCharArray();
        for(int i=0,j=in-1; i<in; i++,j--){
            // newArr[0] = arr[4];
            // newArr[1] = arr[3];
            // newArr[2] = arr[2];
            // newArr[3] = arr[1];
            // newArr[4] = arr[0];
            newArr[i] = arr[j];
        }
        return new String(newArr);
    }
}