import java.io.*;
import java.util.*;

public class ReadFile {
    String[] students;
    int[] days;
    public ReadFile(String fname) throws FileNotFoundException{
        File f= new File(fname);
        Scanner input= new Scanner(f);
        students=new String[25];
        days=new int[25];
        int index=0;
        while(input.hasNextLine()){
            String line=input.nextLine();
            int space=line.indexOf(" ");
            students[index]=line.substring(0, space);
            days[index]=Integer.parseInt(line.substring(space+1));
            index++;

        }
        input.close();

    }
    public String youngest(){
        int maxi=0;
        
        int index=0;
        for(int i=0;i<days.length;i++){
            if(days[i]>maxi){
                index=i;
                maxi=days[i];
            }
        }
        return students[index];
    }
    public static void main(String[] args) {
        try{
            ReadFile r= new ReadFile("name.txt");
            System.out.println(r.youngest());
        }catch(FileNotFoundException e){

        }
        
    }
    
}