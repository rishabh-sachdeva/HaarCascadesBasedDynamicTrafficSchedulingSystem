package javacv2;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage; 

import static com.googlecode.javacv.cpp.opencv_highgui.*;
public class CaptureImage { 
	public static void capture(int i)
	{ // 0-default camera, 1 - next...so on 
		final OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(1); 
		try { grabber.start();
		IplImage img = grabber.grab();
		if (img != null) 
		{ 
			cvSaveImage(i+"capturedimage.jpg", img); 
		}
		}
		catch (Exception e) 
		{
			e.printStackTrace(); }
	}
}


