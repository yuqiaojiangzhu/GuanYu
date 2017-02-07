package com.guanyu.test;

public class GYTest1 {
	public static void main(String[] args) {
		String testStr="anhskcuasjdiohsaufcdaui";
		System.out.println(lns(testStr));
	}
	
    public static int lns(String string){  
    	if(string==null || string.length()==0)
    		return 0;	
    	
    	byte[] str = string.getBytes();
	    int length, max = 1, temp;  
	    int i, j;  
	    int[] a=new int[26];
	    
	    length = str.length;  
	    i = 0;  
	    while(i < 26)  
	        a[i++] = 0;  
	    a[str[0] - 'a'] = 1;
	    
	    i = 0;  //不同字母序列第一个字母
	    j = 1;  //不同字母序列第二个字母
	    temp = 1;  
	    while((j < length) && (i < length - max)){  
	        if(a[str[j] - 'a'] == 0){  
	            a[str[j] - 'a'] = 1;  
	            temp++;  
	            if(max < temp)  
	                max = temp;  
	            j++;  
	        }  
	        else{  
	            a[str[i] - 'a'] = 0;  
	            i++;  
	            temp--;  
	        }  
	    }  
	    return max;  
	}  
}

