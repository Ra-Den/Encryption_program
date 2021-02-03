import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

class HashCode{
    static final char[][] Alphabet={
            {'a','b','c','d','e','f'},
            {'g','h','i','j','k','l'},
            {'m','n','o','p','q','r'},
            {'s','t','u','v','w','x'},
            {'y','z',' ',' ',' ',' '}};
    static char[][]HashTable=new char[5][6];
    static char[] key_tmp;
    static String key, message;

    public static void main(String[] args){
        var input=new Input();

        System.out.println("Input a key word:");
        key=input.readString();

        System.out.println("Input your message:");
        message=input.readString();

        System.out.println("Encrypted message:");
        System.out.println(messageEncription());

        //System.out.println("Table:");
        //displayHash();
    }
    public static void displayHash(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf(HashTable[i][j]+" ");
            }
            System.out.println();
        }

    }



    public static char[][] getHashTable(){
        var transform=new TableTransform();
        var cutter=new StringCutter();

        key_tmp=cutter.cut(key);
        transform.setVariable(HashTable,Alphabet,key_tmp);
        HashTable=transform.setNull();
        HashTable=transform.addKey();
        HashTable=transform.calculation();
        return HashTable;
    }

    public static char[] messageEncription(){
        var encryption=new Encryption();

        HashTable=getHashTable();
        encryption.setVariables(HashTable,message);
        encryption.process();
        return encryption.HashedMessage;
    }
}