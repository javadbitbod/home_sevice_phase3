package ir.maktab.hwfinal03.entity;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ImageUtil {
    public static byte[] readImageFromFile(String imagePath) {
        byte[] imageData = null;
        try {
            File file = new File(imagePath);
            String fileExtension = getFileExtension(imagePath);
            if (!fileExtension.equals("jpg")) {
                throw new IllegalArgumentException("Only .jpg files are supported.");
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            imageData = new byte[(int) file.length()];
            fileInputStream.read(imageData);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageData;
    }
    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex != -1) {
            return fileName.substring(lastDotIndex + 1);
        }
        return "";
    }
}
