import com.aspose.ocr.core.publicapi.*;
import com.aspose.ocr.core.publicapi.IRecognizedTextPartInfo;
import com.aspose.ocr.core.publicapi.pal.PalFontFamily;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExtractOcrText
 */

public class ExtractOcrText extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ExtractOcrText() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Set the paths
		String imagePath = "Path-to-sample-file\\Sample.bmp";
		String xmlEtalonFileName = "englishStandarts.xml";
		String fontCollectionFileName = "arialAndTimesAndCourierRegular.xml";
		String resourcesFilePath = "Path-to-reources.zip-file\\resources.zip";

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

		// output an HTML page
		response.setContentType("text/html");

		// print extracted text in this HTML
		ServletOutputStream out = response.getOutputStream();
		out.println("<html>");
		out.println("<head><title>Extracted Text</title></head>");
		out.println("<body><h1>Extracted Text</h1>");

		// Perform OCR and get extracted text
		try {
			if (ocr.process()) {
				out.println("answer -> " + ocr.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Get info about each part of the recognized text
		IRecognizedText recognizedText = ocr.getText();
		IRecognizedTextPartInfo[] parts = recognizedText.getPartsInfo();
		for (IRecognizedTextPartInfo part : parts) {
			out.println("</br></br>part.getText() => " + part.getText());
			float[] quality = part.getCharactersQuality();
			out.println("quality : ");
			for (float f : quality) {
				out.println(f + "</br>");
			}
			PalFontFamily palFontFamily = part.getFont();
			out.println(palFontFamily.getFontName());
			out.println("</br></br>part.getItalic()  =>" + part.getItalic());
			out.println("</br>part.getUnderline()  =>" + part.getUnderline());
			out.println("</br>part.getBold() => " + part.getBold());
			com.aspose.ms.publics.Rectangle rectangleBox = part.getBox();
			out.println("</br>part.getFont().getFontName()  => "
					+ part.getFont().getFontName());
			out.println("</br>part.getFontSize()  => " + part.getFontSize());

			out.println("</br>box.getX() =>" + rectangleBox.getX() + " "
					+ rectangleBox.getHeight());
			out.println("</br>part.getItalic() =>" + part.getItalic());
			out.println("</br>part.getLanguage() =>" + part.getLanguage());
		}

		// finish up
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
