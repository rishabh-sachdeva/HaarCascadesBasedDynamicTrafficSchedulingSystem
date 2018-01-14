package javacv2;

import static com.googlecode.javacv.cpp.opencv_core.cvLoad;
import static com.googlecode.javacv.cpp.opencv_objdetect.*;

import com.googlecode.javacv.cpp.opencv_core.CvScalar;
import com.googlecode.javacv.cpp.opencv_objdetect.CvHaarClassifierCascade;
import com.googlecode.javacv.cpp.opencv_core.IplImage;

import static com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
public class javacv2 
{
	public static int total_vehicles = 0;
	public static int i = 0;
	public static final String XML_FILE ="classifier9.xml";
	public static void ClickandCall() throws Exception
	{   
		while(true)
		{ 
			int timer=0;
			timer=1000*total_vehicles;

			if(timer<=3000&&timer>=1000)
			{
				Thread.sleep(5000);
			}
			else if(timer>3000&&timer<=5000)
			{
				Thread.sleep(7500);
			}
			else if(timer>5000&&timer<=7000)
			{
				Thread.sleep(10000);
			}
			else if(timer>7000&&timer<=9000)
			{
				Thread.sleep(12500);
			}
			else if(timer>9000&&timer<=11000)
			{
				Thread.sleep(15000);
			}
			else if(timer>11000&&timer<=14000)
			{
				Thread.sleep(17500);
			}
			else if(timer>14000&&timer<=18000)
			{
				Thread.sleep(20000);
			}
			else if(timer>18000&&timer<=21000)
			{
				Thread.sleep(22000);
			}
			else
			{
				Thread.sleep(25000);
			}

			i++;
			CaptureImage.capture(i);

			IplImage img = cvLoadImage(i+"capturedimage.jpg");
			detect(img);

		}
	}
	public static void detect(IplImage src) 
	{
		CvHaarClassifierCascade cascade = new
				CvHaarClassifierCascade(cvLoad(XML_FILE));
		CvMemStorage storage = CvMemStorage.create();
		CvSeq sign = cvHaarDetectObjects(
				src,
				cascade,
				storage,
				1.2,
				6,
				CV_HAAR_DO_CANNY_PRUNING);
		cvClearMemStorage(storage);
		// int p=1;
		total_vehicles = sign.total();
		System.out.println("number of vehicles in present lane:");
		System.out.println(total_vehicles);
		for(int i = 0; i < total_vehicles; i++){
			CvRect r = new CvRect(cvGetSeqElem(sign, i));
			cvRectangle (
					src,cvPoint(r.x(), r.y()),
					cvPoint(r.width() + r.x(), r.height() + r.y()),
					CvScalar.GREEN,
					2,
					CV_AA,
					0);
			if(total_vehicles<3&&total_vehicles>=1)
			{
				try {
					(new DriveArduino("a")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(total_vehicles==0)
			{
				try {
					(new DriveArduino("j")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			else if(total_vehicles>3&&total_vehicles<=5)
			{
				try {
					(new DriveArduino("b")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(total_vehicles>5&&total_vehicles<=7)
			{
				try {
					(new DriveArduino("c")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(total_vehicles>7&&total_vehicles<=9)
			{
				try {
					(new DriveArduino("d")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(total_vehicles>9&&total_vehicles<=11)
			{
				try {
					(new DriveArduino("e")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(total_vehicles>11&&total_vehicles<=14)
			{
				try {
					(new DriveArduino("f")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(total_vehicles>14&&total_vehicles<=18)
			{
				try {
					(new DriveArduino("g")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			else if(total_vehicles>18&&total_vehicles<=21)
			{
				try {
					(new DriveArduino("h")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else 
			{
				try {
					(new DriveArduino("i")).connect("COM1");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		cvShowImage("Result", src);
		cvWaitKey(0);
	}
}




