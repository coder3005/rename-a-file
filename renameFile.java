/* rename a file */
import java.io.File;
class renameFile
{
    public static void main(String[] args) {

        File f=new File("C:\\Users\\Abhi Gupta\\downloads\\AG.txt"); //old file name
        File r=new File("C:\\Users\\Abhi Gupta\\downloads\\UP.txt"); //new file name

        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else
        {
            System.out.println("File doesn't exists");
        }
    }
}
