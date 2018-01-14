package javacv2;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class DriveArduino{
	static String message=null;
    public DriveArduino(String message){
	super();
    }
    
    int connect ( String portName ) throws Exception{
        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
        if ( portIdentifier.isCurrentlyOwned()){
        }
        else{
              CommPort commPort = portIdentifier.open("a",2000);
            if  (commPort instanceof SerialPort ){
                SerialPort serialPort = (SerialPort) commPort;
                serialPort.setSerialPortParams(9600,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
                
                  OutputStream out = serialPort.getOutputStream();
                  InputStream in=serialPort.getInputStream();
                (new Thread(new SerialWriter(in,out,serialPort))).start();
            }
            else{
                System.out.println("Error: Only serial ports are handled by this code.");
            }
        }     
    return 1;
    }
    
    public static class SerialWriter implements Runnable{
        OutputStream out;
        SerialPort serialPort;
        InputStream in;        
        String  messageString  = "a";
        byte  mess='a';
        public SerialWriter (InputStream in, OutputStream out ,SerialPort serialPort){
            this.out = out;
            this.in=in;
            this.serialPort = serialPort;
        }
        
        public void run (){
            try{                
              out.write(message.getBytes());
                byte[] b=new byte[100];
                in.read(b);
                String s=new String(b);
                char cc=s.charAt(0);
                System.out.println(cc);
                serialPort.close();
            }
            catch ( IOException e )
            {
                e.printStackTrace();
            }            
        }
    }
    }
  