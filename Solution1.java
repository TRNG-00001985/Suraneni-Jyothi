package revday01;

class Solution1 {
    public boolean isAnagram(String s, String t) {
    	
        if(s.length()==t.length()){
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    c++;
                    
                    break;
                }
            }
        }
        if(c==s.length()){
            return true;
        }
        return false;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {
    	String s="jam";
    	String t="jar";
    	Solution1 s1=new Solution1();
    	System.out.println(s1.isAnagram(s, t));
    }
}
