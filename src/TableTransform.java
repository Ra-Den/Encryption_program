public class TableTransform {
    char[][] HashTable;
    char[][] Alphabet;
    char[] key_tmp;
    int count=0;

    public char[][] setNull(){
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                HashTable[i][j]=' ';
            }
        }
        return HashTable;
    }

    public char[][] addKey(){
        for(int i=0,j=0,k=0;i<key_tmp.length;i++){
            if(key_tmp[i]!=0){
                HashTable[k][j]=key_tmp[i];
                j++;
                if(j==6){
                    k++;
                    j=0;
                }
            }
        }
        return HashTable;
    }

    public char[][] calculation(){
        for(int i=0,l=0,k=0;i<5;i++){
            for(int j=0;j<6;j++){
                if(Character.isWhitespace(HashTable[i][j])){
                    for(int t=0;t<5;t++){
                        for(int y=0;y<6;y++){
                            if(Alphabet[l][k]==HashTable[t][y]){
                                count=1;
                            }
                        }
                    }
                    if(count!=1){
                        HashTable[i][j]=Alphabet[l][k];
                    }else {
                        if(j==0){
                            j=5;
                            i--;
                        }else {
                            j--;
                        }
                        count=0;
                    }
                    k++;
                    if (k > 5) {
                        l++;
                        if(l>4){
                            break;
                        }
                        k=0;
                    }
                }
            }
        }
        return HashTable;
    }

    public void setVariable(char[][] HashTable,char[][] Alphabet,char[] key_tmp){
        this.HashTable=HashTable;
        this.Alphabet=Alphabet;
        this.key_tmp=key_tmp;
    }
}
