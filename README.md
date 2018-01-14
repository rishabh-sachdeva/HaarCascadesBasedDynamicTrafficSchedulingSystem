# HaarCascadesBasedDynamicTrafficSchedulingSystem
System detects vehicle density at traffic junctions and allots the required time to traffic lights for vehicle passage dynamically. Classifier is trained using  positive and negative images. Further, Adaptive Boosting is used to combine a number of weak classifiers into a strong one. The outcome of AdaBoost is Trained Cascade, which is finally used to detect vehicles in the images clicked.The system uses webcam to detect vehicles, count them and allow traffic passage according to traffic density of each lanes.

Certain jars (eg. RXTXcomm.jar) which are mentioned in .classpath are required for system to run.
Already trained classifiers are checked-in. Classifier9 is used in code for vehicle detection in code. Others are for user reference.

Classifier training is all together different and complex process. Various references are used to prepare these classifiers and to increase their efficiency.
https://docs.opencv.org/trunk/db/d28/tutorial_cascade_classifier.html can be referred for basic understanding about classifier training. 

Please refer to my research paper(http://www.ijraset.com/fileserve.php?FID=9633) to learn more about classifier training and vehicle detection.
