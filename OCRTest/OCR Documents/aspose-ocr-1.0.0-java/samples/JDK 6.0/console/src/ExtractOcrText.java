import com.aspose.ocr.core.publicapi.*;
import com.aspose.ocr.core.publicapi.pal.PalFontFamily;
import java.io.*;

public class ExtractOcrText {

	public static void main(String[] args) throws IOException {

		// Set the paths
		String imagePath = "./samples/Sample.bmp";
		String xmlEtalonFileName = "englishStandarts.xml";
		String fontCollectionFileName = "arialAndTimesAndCourierRegular.xml";
		String resourcesFilePath = "./../../../resources/resources.zip";

		// Create an instance of OcrEngine class but providing required
		// parameters
		OcrEngine ocr = new OcrEngine(resourcesFilePath,
				new int[] { 4, 5, 6, 7 }, xmlEtalonFileName,
				fontCollectionFileName);
		ocr.getConfig().setNeedRotationCorrection(false);

		// Set image file
		File image = new File(imagePath);
		ocr.setImage(image);

		// Add language
		ILanguage language = Language.load("english");
		ocr.getLanguages().addLanguage(language);

		// Create a new file to write output
		Writer output = null;
		File file = new File("./output/Output.txt");
		output = new java.io.BufferedWriter(new java.io.FileWriter(file));

		// Perform OCR and get extracted text
		try {
			if (ocr.process()) {
				output.write("\ranswer -> " + ocr.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Get info about each part of the recognized text
		IRecognizedText recognizedText = ocr.getText();
		IRecognizedTextPartInfo[] parts = recognizedText.getPartsInfo();
		for (IRecognizedTextPartInfo part : parts) {
			output.write("\r\n\r\npart.getText() => " + part.getText());
			float[] quality = part.getCharactersQuality();
			output.write("\r\nquality : ");
			for (float f : quality) {
				output.write("\r\n" + f);
			}
			PalFontFamily palFontFamily = part.getFont();
			output.write(palFontFamily.getFontName());
			output.write("\r\npart.getItalic()  =>" + part.getItalic());
			output.write("\r\npart.getUnderline()  =>" + part.getUnderline());
			output.write("\r\npart.getBold() => " + part.getBold());
			com.aspose.ms.publics.Rectangle rectangleBox = part.getBox();
			output.write("\r\npart.getFont().getFontName()  => "
					+ part.getFont().getFontName());
			output.write("\r\npart.getFontSize()  => " + part.getFontSize());

			output.write("\r\nbox.getX() =>" + rectangleBox.getX() + " "
					+ rectangleBox.getHeight());
			output.write("\r\npart.getItalic() =>" + part.getItalic());
			output.write("\r\npart.getLanguage() =>" + part.getLanguage());
		}
		output.close();
		System.out.println("Done");
	}
}
