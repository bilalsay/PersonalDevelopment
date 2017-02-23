import com.aspose.ocr.core.publicapi.*;
import com.aspose.ocr.core.publicapi.pal.PalFontFamily;
import com.sun.javafx.util.Utils;


import java.io.*;

public class ExtractOcrText {

    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(PerformOCROnImage.class) + "WorkingWithOcr/";

        /// Set the paths
        String imagePath = dataDir + "Sampleocr.bmp";

        // Create an instance of OcrEngine
        OcrEngine ocr = new OcrEngine();

        // Set image file
        ocr.setImage(ImageStream.fromFile(imagePath));

        // Perform OCR and get extracted text
        try {
            if (ocr.process()) {
                System.out.println("\ranswer -> " + ocr.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
