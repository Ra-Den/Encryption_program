public class StringCutter {
    int flag=0;

    public char[] cut(
            String key
    ){
        char[] key_tmp=new char[key.length()];
        for(int i=0;i<key.length();i++){
            for(int j=0;j<=i;j++){
                if(key_tmp[j]==key.charAt(i)&&key_tmp[0]!=0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                key_tmp[i]=key.charAt(i);
            }else{
                flag=0;
            }
        }
        return key_tmp;
    }
}
