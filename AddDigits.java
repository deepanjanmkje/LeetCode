public class AddDigits {
    public int addDigits(int num) {
        if(num!=0){
            if(num<10)
                return num;
            
            int sum=0,i=0,div=num/10,rem=num%10;
            int arr[] = new int[100];
            while(div>0){
                arr[i++]=rem;
                if(div<10)
                    arr[i++]=div;
                int temp=div/10;
                rem=div%10;
                div=temp;
            }
            System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
            for(int x=0;x<arr.length;x++){
                sum=sum+arr[x];
            }
            System.out.println(sum);
            if(sum<10)
                return sum;
            else
                return addDigits(sum);
        }
        return num;
    }
}