public class CheckerUtil {

    public static void checker(String fileName){
        if (fileName.isBlank() | fileName.isEmpty() | fileName == null){

            throw new OpenFileError("Failed to open file, application stop!");
        }
    }
}
