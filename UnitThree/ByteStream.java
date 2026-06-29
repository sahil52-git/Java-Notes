import java.io*;

public class ByteStreamExample{
    public static void main(String[] args){

        //Writing a file using file output stream
        try(FileOutputStream fos = new FileOutputStream(example.txt)){
            String content = "sahil";
            byte[] contentBytes = content.getBytes();
            fos.write (contentByte);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}