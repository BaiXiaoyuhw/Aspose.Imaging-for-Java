package com.aspose.imaging.examples.ConvertingImages;

import java.awt.Image;
import com.aspose.imaging.examples.Utils;
import com.aspose.imaging.fileformats.tiff.TiffFrame;
import com.aspose.imaging.fileformats.tiff.TiffImage;

public class AligHorizontalAndVeticalResolutions {
	public static void main(String... args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AligHorizontalAndVeticalResolutions.class) + "ConvertingImages/";
	//ExStart:AligHorizontalAndVeticalResolutions
		
		TiffImage image = (TiffImage) com.aspose.imaging.Image.load(dataDir + "sample.tif");
              
		image.alignResolutions();

		// Save the results to output path.
		image.save(dataDir + "AligHorizontalAndVeticalResolutions_out.tiff");

		int framesCount = image.getFrames().length;
		for (int i = 0; i < framesCount; i++) {
			TiffFrame frame = image.getFrames()[i];
			// All resolutions after aligment must be equal
			System.out.println("Horizontal and vertical resolutions are equal:"
					+ ((int) frame.getVerticalResolution() == (int) frame.getHorizontalResolution()));
		}
		//ExEnd:AligHorizontalAndVeticalResolutions
	}

}
