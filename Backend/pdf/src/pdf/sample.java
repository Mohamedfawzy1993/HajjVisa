package pdf;

import java.io.IOException; 
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import com.keepautomation.barcode.BarCode;
import com.keepautomation.barcode.IBarCode;

public class sample {
	static String text;
	static String text1;
	static String text2;
	static String text3;
	static String text4;
	static String text5;
	static String text6;
	static String text7;
	static String text8;
	static String text9;
	static String text10;
	static String text11;
	static String text12;
	static String text13;
	static String text14;
	static String text15;
	static String text16;
	static String text17;
	static String text18;
	static String text19;
	static String text20;
	static String text21;
	static String text22;
	static String text23;
	static String text24;
	static String text25;
	static String text26;
	static String text27;
	sample(String USER_FNAME,String USER_MNAME,String USER_LNAME,String PLACE_OF_BIRTH,String DATE_OF_BIRTH,String EMAIL,String PHONE_NO,String NATIONALITY,String PASSPORT_NO,String PASSPORT_ISSUE_DATE ,String PASSPORT_EXPIRY_DATE,String PASSPORT_TYPE ,String VISA_ID,String VISA_TYPE,String ISSUE_DATE,String VALIDITY,String ISSUE_OFFICE,String PURPOSE,String FEES,String NUMBER_OF_ENTRIES,String COMPANION,String WORK_PERMIT,String VISA_OFFICER ,String STATUES)
	    {
		  text=USER_FNAME;
		  text1=USER_MNAME;
		  text2=USER_FNAME;
		  text3=PLACE_OF_BIRTH;
		  text4=DATE_OF_BIRTH;
		  text5=EMAIL;
		  text6=PHONE_NO;
		  text7=NATIONALITY;
		  text8=PASSPORT_NO;
		  text9=PASSPORT_ISSUE_DATE;
		  text10=PASSPORT_EXPIRY_DATE;
		  text11=PASSPORT_TYPE;
		  text12=VISA_ID;
		  text13=VISA_TYPE;
		  text14=ISSUE_DATE;
		  text15=VALIDITY;
		  text16=ISSUE_OFFICE;
		  text17=PURPOSE;
		  text18=FEES;
		  text19=NUMBER_OF_ENTRIES;
		  text20=COMPANION;
		  text21=WORK_PERMIT;
		  text22=VISA_OFFICER;
		  text23=STATUES;
	    }
	 
	
	
	  public static void main (String args[]) throws IOException {
		  BarCode barcode = new BarCode();
		     barcode.setCodeToEncode("123456789");
		     barcode.setSymbology(IBarCode.PDF417);
		     barcode.setX(2);
		     barcode.setY(50);
		     barcode.setRightMargin(0);
		     barcode.setLeftMargin(0);
		     barcode.setTopMargin(0);
		     barcode.setBottomMargin(0);
		     barcode.setChecksumEnabled(false);
		     barcode.setFnc1(IBarCode.FNC1_NONE);
		     try {
				barcode.draw("\\code128.gif");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
	       
	      //Creating PDF document object 
	      PDDocument document = new PDDocument();    
	      PDPage blankPage = new PDPage();

	         //Adding the blank page to the document
	         document.addPage( blankPage );
	         //Saving the document
	         PDPageContentStream contentStream = new PDPageContentStream(document, blankPage);
	         //Begin the Content stream 
	         PDImageXObject pdImage = PDImageXObject.createFromFile("\\x2030.png",document);
	         PDImageXObject pdImage4 = PDImageXObject.createFromFile("\\code128.gif",document);
	         //PDImageXObject pdImage4 = PDImageXObject.createFromFile("C:\\Users\\hsr99\\Desktop\\hajj\\PdfBox_Examples\\TITLE.png",document);
	         PDImageXObject pdImage2 = PDImageXObject.createFromFile("\\logo.png",document);
	         PDImageXObject pdImage3 = PDImageXObject.createFromFile("\\tabel.png",document);
	         //contentStream.drawImage(pdImage, 30, 30);
	         //contentStream.drawImage(pdImage4, 200, 680, 200, 200);
	         contentStream.drawImage(pdImage, 30, 680, 100, 100);
	         contentStream.drawImage(pdImage2, 450, 630, 180, 180);
	         contentStream.drawImage(pdImage3, 50, 120, 500, 500);
	         contentStream.drawImage(pdImage4, 65, 70, 215, 25);
	         contentStream.beginText(); 
	         contentStream.setFont(PDType1Font.TIMES_ROMAN, 13);
	         contentStream.newLineAtOffset(65, 550);
	         contentStream.showText(text);      
	         contentStream.setFont(PDType1Font.TIMES_ROMAN, 13);
	         contentStream.endText();
	         contentStream.beginText(); 
	         contentStream.setFont(PDType1Font.TIMES_ROMAN, 13);
	         contentStream.newLineAtOffset(220, 720);
	         String TITLE = "KINGDOM OF SAUDI ARABAI";
	         contentStream.showText(TITLE);      
	         contentStream.setFont(PDType1Font.TIMES_ROMAN, 17);
	         contentStream.endText();
	         contentStream.beginText(); 
	         contentStream.setFont(PDType1Font.TIMES_ROMAN, 13);
	         contentStream.newLineAtOffset(250, 690);
	         String TITLE2 = " E-VISA SAMPLE";
	         contentStream.showText(TITLE2);      
	         contentStream.setFont(PDType1Font.TIMES_ROMAN, 13);
	         contentStream.endText();
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(185, 550);
	         contentStream.showText(text1);      
	         contentStream.endText();
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(289, 550);
	         contentStream.showText(text2);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(385, 550);
	         String text3 = "Jeddah";
	         contentStream.showText(text3);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(65, 495);
	         contentStream.showText(text4);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(185, 495);
	         contentStream.setFont(PDType1Font.TIMES_ROMAN, 9);
	         contentStream.showText(text5);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(286, 495);
	         contentStream.setFont(PDType1Font.TIMES_ROMAN, 13);
	         contentStream.showText(text6);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(385, 495);
	         contentStream.showText(text7);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(65, 395);
	         contentStream.showText(text8);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(183, 395);
	         contentStream.showText(text9);      
	         contentStream.endText();
	         System.out.println("Content added");	          	         
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(285, 395);
	         contentStream.showText(text10);      
	         contentStream.endText();
	         System.out.println("Content added");		         
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(385, 395);
	         contentStream.showText(text11);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(70, 280);
	         contentStream.showText(text12);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(180, 280);
	         contentStream.showText(text13);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(285, 280);
	         contentStream.showText(text14);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(385, 280);
	         contentStream.showText(text15);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(70, 200);
	         contentStream.showText(text16);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(180, 200);
	         contentStream.showText(text17);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(285, 200);
	         contentStream.showText(text18);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(385, 200);
	         contentStream.showText(text19);      
	         contentStream.endText();
	         System.out.println("Content added");

	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(70, 140);
	         String text20 = "xxxxxx";
	         contentStream.showText(text20);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(180, 140);
	         String text21 = "Hajj";
	         contentStream.showText(text21);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(285, 140);
	         String text22 = "xxxxx";
	         contentStream.showText(text22);      
	         contentStream.endText();
	         System.out.println("Content added");
	         contentStream.beginText(); 
	         contentStream.newLineAtOffset(385, 140);
	         String text23 = "1";
	         contentStream.showText(text23);      
	         contentStream.endText();
	         System.out.println("Content added");
	         
	         contentStream.close();
	         document.save("\\my_visa.pdf");
	         System.out.println("PDF created");  
	    
	      //Closing the document  
	         document.close();

	   }  

}
