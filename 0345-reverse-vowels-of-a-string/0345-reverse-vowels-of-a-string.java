class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char x=arr[left];
            char y=arr[right];
            if((x=='a'||x=='e'|| x=='i'||x=='o'|| x=='u'||
            x=='A'||x=='E'||x=='I'||x=='O'||x=='U')&&
            (y=='a'||y=='e'|| y=='i'||y=='o'|| y=='u'||
            y=='A'||y=='E'||y=='I'||y=='O'||y=='U')){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(!(x=='a'||x=='e'|| x=='i'||x=='o'|| x=='u'||
            x=='A'||x=='E'||x=='I'||x=='O'||x=='U')){
                left++;
            }
            else if(!(y=='a'||y=='e'|| y=='i'||y=='o'|| y=='u'||
            y=='A'||y=='E'||y=='I'||y=='O'||y=='U'))
                {
                    right--;
            }
        }
        return new String(arr);
}
}