import java.util.Hashtable;

public class Encryption {
    char[][] HashTable;
    String message;
    char[] HashedMessage,ArrayOfLetters;

    public void setVariables(char[][] HashTable,String message){
        this.HashTable=HashTable;
        this.message=message;
        HashedMessage=new char[message.length()];
        ArrayOfLetters=new char[message.length()];
    }

    public void process(){
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < HashTable.length; j++) {
                for (int k = 0; k < HashTable[0].length; k++) {
                    if(message.charAt(i)==HashTable[j][k]&&message.charAt(i)!=' '){
                        if(j<4){
                            if(HashTable[j+1][k]==' '){
                                HashedMessage[i]=HashTable[0][k];
                            }else {
                                HashedMessage[i]=HashTable[j+1][k];
                            }
                        }else{
                            HashedMessage[i]=HashTable[0][k];
                        }
                    }else if(message.charAt(i)==' '){
                        HashedMessage[i]=' ';
                    }
                }
            }
        }
    }

    private void transform(){
        for (int i = 0; i < message.length(); i++) {
            ArrayOfLetters[i]=message.charAt(i);
        }
    }
}
