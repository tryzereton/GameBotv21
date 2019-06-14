package net.ferhatkurt;




import javax.swing.Timer;
import javafx.application.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionListener;
import java.io.*;



public class Kontroller extends Application {
	
	//TIMER NESNELERI
	
	private Timer [] timer;
	private ActionListener [] a;
	
	//CHOICEBOX NESNELERI
	@FXML
	private ChoiceBox<String>c1 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c2 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c3 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c4 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c5 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c6 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c7 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c8 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c9 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c10 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c11 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c12 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c13 = new ChoiceBox<String>();
	@FXML
	private ChoiceBox<String>c14 = new ChoiceBox<String>();
	

	//TEXTFIELD NESNELERI
	@FXML
	public TextField t1 = new TextField();
	@FXML
	public TextField t2 = new TextField();
	@FXML
	public TextField t3 = new TextField();
	@FXML
	public TextField t4 = new TextField();
	@FXML
	public TextField t5 = new TextField();
	@FXML
	public TextField t6 = new TextField();
	@FXML
	public TextField t7 = new TextField();
	@FXML
	public TextField t8 = new TextField();
	@FXML
	public TextField t9 = new TextField();
	@FXML
	public TextField t10 = new TextField();
	@FXML
	public TextField t11 = new TextField();
	@FXML
	public TextField t12 = new TextField();
	@FXML
	public TextField t13 = new TextField();
	@FXML
	public TextField t14 = new TextField();
	@FXML
	public TextField t15 = new TextField();
	@FXML
	public TextField t16 = new TextField();
	@FXML
	public TextField t17 = new TextField();
	@FXML
	public TextField t18 = new TextField();
	@FXML
	public TextField t19 = new TextField();
	@FXML
	public TextField t20 = new TextField();
	@FXML
	public TextField t21 = new TextField();
	@FXML
	public TextField t22 = new TextField();
	@FXML
	public TextField t23 = new TextField();
	@FXML
	public TextField t24 = new TextField();
	@FXML
	public TextField t25 = new TextField();
	@FXML
	public TextField t26 = new TextField();
	@FXML
	public TextField t27 = new TextField();
	@FXML
	public TextField t28 = new TextField();
	
	//BUTONLAR
	@FXML
	private Button b1 = new Button();
	@FXML
	public Button b2 = new Button();
	@FXML
	private Button b3 = new Button();
	@FXML
	private Button HakkindaKapat = new Button();
	
	
	//LABEL NESNELERI
	@FXML
	private Label lblDurum;
	@FXML
	private Label lblKapat;
	@FXML
	private Label lblYardim;
	@FXML
	private Label lblSimge;
	
	//HYPERLINK NESNELERI
	@FXML
	private Hyperlink webSite;
	@FXML
	private Hyperlink sosyal;
	
	
	public Kontroller() {
		
		
				
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
			
				b1.setText("Botu Baþlat");
				ekle();
				
				

				timer = new Timer[14];
				a = new ActionListener[14];
				a[0] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress(Integer.valueOf(t1.getText().toUpperCase().charAt(0)));
							r.delay(100);
							r.keyRelease(Integer.valueOf(t1.getText().toUpperCase().charAt(0)));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				a[1] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress(Integer.valueOf(t2.getText().toUpperCase().charAt(0)));
							r.delay(100);
							r.keyRelease(Integer.valueOf(t2.getText().toUpperCase().charAt(0)));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};


				a[2] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress((int)t3.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t3.getText().toUpperCase().charAt(0));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};

				a[3] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress((int)t4.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t4.getText().toUpperCase().charAt(0));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				a[4] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress((int)t5.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t5.getText().toUpperCase().charAt(0));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				a[5] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress((int)t6.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t6.getText().toUpperCase().charAt(0));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				a[6] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress((int)t7.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t7.getText().toUpperCase().charAt(0));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				
				a[7] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress((int)t8.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t8.getText().toUpperCase().charAt(0));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				
				a[8] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress((int)t9.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t9.getText().toUpperCase().charAt(0));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				a[9] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							r.keyPress((int)t10.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t10.getText().toUpperCase().charAt(0));
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				
				a[10] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							if(t11.getText().toUpperCase().equals("F1")){
								r.keyPress(112);
								r.setAutoDelay(100);
								r.keyRelease(112);
								
							}
							else if(t11.getText().toUpperCase().equals("F2")) {
								r.keyPress(113);
								r.setAutoDelay(100);
								r.keyPress(113);
							}
							else if(t11.getText().toUpperCase().equals("F3")) {
								r.keyPress(114);
								r.setAutoDelay(100);
								r.keyRelease(114);
							}
							else if(t11.getText().toUpperCase().equals("F4")) {
								r.keyPress(115);
								r.setAutoDelay(100);
								r.keyRelease(115);
							}
							else if(t11.getText().toUpperCase().equals("F5")) {
								r.keyPress(116);
								r.setAutoDelay(100);
								r.keyRelease(116);
							}
							else {
							r.keyPress((int)t11.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t11.getText().toUpperCase().charAt(0));
							}
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				a[11] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							if(t12.getText().toUpperCase().equals("F1")){
								r.keyPress(112);
								r.setAutoDelay(100);
								r.keyRelease(112);
								
							}
							else if(t12.getText().toUpperCase().equals("F2")) {
								r.keyPress(113);
								r.setAutoDelay(100);
								r.keyPress(113);
							}
							else if(t12.getText().toUpperCase().equals("F3")) {
								r.keyPress(114);
								r.setAutoDelay(100);
								r.keyRelease(114);
							}
							else if(t12.getText().toUpperCase().equals("F4")) {
								r.keyPress(115);
								r.setAutoDelay(100);
								r.keyRelease(115);
							}
							else if(t12.getText().toUpperCase().equals("F5")) {
								r.keyPress(116);
								r.setAutoDelay(100);
								r.keyRelease(116);
							}
							else {
							r.keyPress((int)t12.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t12.getText().toUpperCase().charAt(0));
							}
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				a[12] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							if(t13.getText().toUpperCase().equals("F1")){
								r.keyPress(112);
								r.setAutoDelay(100);
								r.keyRelease(112);
								
							}
							else if(t13.getText().toUpperCase().equals("F2")) {
								r.keyPress(113);
								r.setAutoDelay(100);
								r.keyPress(113);
							}
							else if(t13.getText().toUpperCase().equals("F3")) {
								r.keyPress(114);
								r.setAutoDelay(100);
								r.keyRelease(114);
							}
							else if(t13.getText().toUpperCase().equals("F4")) {
								r.keyPress(115);
								r.setAutoDelay(100);
								r.keyRelease(115);
							}
							else if(t13.getText().toUpperCase().equals("F5")) {
								r.keyPress(116);
								r.setAutoDelay(100);
								r.keyRelease(116);
							}
							else {
							r.keyPress((int)t13.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t13.getText().toUpperCase().charAt(0));
							}
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				
				a[13] = new ActionListener() {

					@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						try {
							Robot r = new Robot();	
							if(t14.getText().toUpperCase().equals("F1")){
								r.keyPress(112);
								r.setAutoDelay(100);
								r.keyRelease(112);
								
							}
							else if(t14.getText().toUpperCase().equals("F2")) {
								r.keyPress(113);
								r.setAutoDelay(100);
								r.keyPress(113);
							}
							else if(t14.getText().toUpperCase().equals("F3")) {
								r.keyPress(114);
								r.setAutoDelay(100);
								r.keyRelease(114);
							}
							else if(t14.getText().toUpperCase().equals("F4")) {
								r.keyPress(115);
								r.setAutoDelay(100);
								r.keyRelease(115);
							}
							else if(t14.getText().toUpperCase().equals("F5")) {
								r.keyPress(116);
								r.setAutoDelay(100);
								r.keyRelease(116);
							}
							else {
							r.keyPress((int)t14.getText().toUpperCase().charAt(0));
							r.delay(100);
							r.keyRelease((int)t14.getText().toUpperCase().charAt(0));
							}
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}					
					}
				};
				
				
			}
			
		});
			
	}
	
	
	@FXML
	private void programiKapat(MouseEvent e) {
		
		Alert a = new Alert(AlertType.CONFIRMATION);
		a.setContentText("Program kapatýlacaktýr. Onaylýyor musunuz?");
		a.setHeaderText("Çýkýþ Onayý");
		a.setTitle("Uyarý");
		a.showAndWait();
		
		if(a.getResult() == ButtonType.OK)
			System.exit(0);
	};
	
	@FXML
	private void simgeDurumuna(MouseEvent e) {
		
	    ((Stage)((Label)e.getSource()).getScene().getWindow()).setIconified(true);
		        
	};
	
	@FXML
	private void yardimPenceresi(MouseEvent e) throws IOException {
		Stage s = new Stage();
		Parent root = FXMLLoader.load(this.getClass().getResource("Hakkinda.fxml"));
		
		s.setScene(new Scene(root));
		s.initStyle(StageStyle.UNDECORATED);
		s.showAndWait();
	}
	
	@FXML
	private void hakkindaKapat(MouseEvent e) {
		 ((Stage)((Button)e.getSource()).getScene().getWindow()).close();
	}
	
	
	
	@FXML
	private void webSite(MouseEvent e ) throws IOException {
		
		HostServices h = getHostServices();
		h.showDocument("http://ferhatkurt.net");
		webSite.setVisited(true);
		
		
	}
	

	@FXML
	private void sosyalMedyalar(ActionEvent e) {

		HostServices h = getHostServices();
		h.showDocument("https://facebook.com/ferhatkrtt");
		h.showDocument("https://instagram.com/ferhatkrtt");
		sosyal.setVisited(true);
		
	}
	
	@FXML 
	public void botuBaslat(ActionEvent e) {
	
		for(int i=0; i<timer.length; i++) {
			if(timer[i] != null)
			timer[i] = null;
		}
		if(!t1.getText().isEmpty() && !t15.getText().isEmpty()) {
			
			if(c1.getSelectionModel().getSelectedIndex() == 0) {
			
				timer[0] = new Timer(Integer.valueOf(t15.getText()),a[0]);
				timer[0].start();
				
			}else {
				timer[0] = new Timer(Integer.valueOf(t15.getText())*1000,a[0]);
				timer[0].start();
			}
		
		}
		
		if(!t2.getText().isBlank() && !t16.getText().isEmpty()) {
			
			if(c2.getSelectionModel().getSelectedIndex() == 0) {
			
				timer[1] = new Timer(Integer.valueOf(t16.getText()),a[1]);
				timer[1].start();
			
			}else {
				
				timer[1] = new Timer(Integer.valueOf(t16.getText())*1000,a[1]);
				timer[1].start();
			}
			
		}
		
		if(!t3.getText().isBlank() && !t17.getText().isEmpty()) {
			
			if(c3.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[2] = new Timer(Integer.valueOf(t17.getText()),a[2]);
				timer[2].start();
				
			}else {
				
				timer[2] = new Timer(Integer.valueOf(t17.getText())*1000,a[2]);
				timer[2].start();	
			}
			
		}
		
		if(!t4.getText().isBlank() && !t18.getText().isEmpty()) {
			
			if(c4.getSelectionModel().getSelectedIndex() == 0) {			
				timer[3] = new Timer(Integer.valueOf(t18.getText()),a[3]);
				timer[3].start();
				
			}else {
				
				timer[3] = new Timer(Integer.valueOf(t18.getText())*1000,a[3]);
				timer[3].start();
				
			}
		}
		if(!t5.getText().isBlank() && !t19.getText().isEmpty()) {
			
			if(c5.getSelectionModel().getSelectedIndex() == 0) {
				
			timer[4] = new Timer(Integer.valueOf(t19.getText()),a[4]);
			timer[4].start();
			
			}else {
				
				timer[4] = new Timer(Integer.valueOf(t19.getText())*1000,a[4]);
				timer[4].start();
				
			}
		}
		
		if(!t6.getText().isBlank() && !t20.getText().isEmpty()) {
	
			if(c6.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[5] = new Timer(Integer.valueOf(t20.getText()),a[5]);
				timer[5].start();
				
			}else {
				
				timer[5] = new Timer(Integer.valueOf(t20.getText())*1000,a[5]);
				timer[5].start();
				
			}
		}
		if(!t7.getText().isBlank() && !t21.getText().isEmpty()) {
	
			if(c7.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[6] = new Timer(Integer.valueOf(t21.getText()),a[6]);
				timer[6].start();
				
			}else {
				
				timer[6] = new Timer(Integer.valueOf(t21.getText())*1000,a[6]);
				timer[6].start();
			}
		}
		if(!t8.getText().isBlank() && !t22.getText().isEmpty()) {

			if(c8.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[7] = new Timer(Integer.valueOf(t22.getText()),a[7]);
				timer[7].start();
				
			}else {
				
				timer[7] = new Timer(Integer.valueOf(t22.getText())*1000,a[7]);
				timer[7].start();
			}
		}
		if(!t9.getText().isBlank() && !t23.getText().isEmpty()) {
	
			if(c9.getSelectionModel().getSelectedIndex() == 0) {			
				
				timer[8] = new Timer(Integer.valueOf(t23.getText()),a[8]);
				timer[8].start();
				
			}else{
				
				timer[8] = new Timer(Integer.valueOf(t23.getText())*1000,a[8]);
				timer[8].start();
				
			}
		}
		if(!t10.getText().isBlank() && !t24.getText().isEmpty()) {
	
			if(c10.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[9] = new Timer(Integer.valueOf(t24.getText()),a[9]);
				timer[9].start();
				
			}else {
				
				timer[9] = new Timer(Integer.valueOf(t24.getText())*1000,a[9]);
				timer[9].start();
			}
		}
		if(!t11.getText().isBlank() && !t25.getText().isEmpty()) {
	
			if(c11.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[10] = new Timer(Integer.valueOf(t25.getText()),a[10]);
				timer[10].start();
				
			}else {
				
				timer[10] = new Timer(Integer.valueOf(t25.getText())*1000,a[10]);
				timer[10].start();
			}
		}
		if(!t12.getText().isBlank() && !t26.getText().isEmpty()) {
				
			if(c12.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[11] = new Timer(Integer.valueOf(t26.getText()),a[11]);
				timer[11].start();
				
			}else {
				
				timer[11] = new Timer(Integer.valueOf(t26.getText())*1000,a[11]);
				timer[11].start();
				
			}
		}
		if(!t13.getText().isBlank() && !t27.getText().isEmpty()) {
	
			if(c13.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[12] = new Timer(Integer.valueOf(t27.getText()),a[12]);
				timer[12].start();
				
			}else {
				
				timer[12] = new Timer(Integer.valueOf(t27.getText())*1000,a[12]);
				timer[12].start();
			}
		}
		if(!t14.getText().isBlank() && !t28.getText().isEmpty()) {
	
			if(c14.getSelectionModel().getSelectedIndex() == 0) {
				
				timer[13] = new Timer(Integer.valueOf(t28.getText()),a[13]);
				timer[13].start();
				
			}else {
				
				timer[13] = new Timer(Integer.valueOf(t28.getText())*1000,a[13]);
				timer[13].start();
				
				
			}
		}
		
		lblDurum.setText("Bot baþlatýldý.");
		lblDurum.setTextFill(Paint.valueOf("Lime"));
				
	}
	
	@FXML
	public void botuDurdur(ActionEvent e){

		
		
		try{
			
			for(int i=0; i<timer.length;i++) {
				if(timer[i] != null && timer[i].isRunning()) {
					timer[i].stop();
				}
			}
			
			
			
		}catch(NullPointerException e1) {
			e1.printStackTrace();
		}
		lblDurum.setText("Bot Durduruldu.");
		lblDurum.setTextFill(Paint.valueOf("Orange"));
							
	}
	
	@FXML
	private void alanlariTemizle() {
		
		t1.clear();
		t2.clear();
		t3.clear();
		t4.clear();
		t5.clear();
		t6.clear();
		t7.clear();
		t8.clear();
		t9.clear();
		t10.clear();
		t11.clear();
		t12.clear();
		t13.clear();
		t14.clear();
		t15.clear();
		t16.clear();
		t17.clear();
		t18.clear();
		t19.clear();
		t20.clear();
		t21.clear();
		t22.clear();
		t23.clear();
		t24.clear();
		t25.clear();
		t26.clear();
		t27.clear();
		t28.clear();
	}
	
	private void ekle() {
		
		c1.getItems().addAll("MS","SN");
		c1.getSelectionModel().selectFirst();
				
		c2.getItems().addAll("MS","SN");
		c2.getSelectionModel().selectFirst();
		
		c3.getItems().addAll("MS","SN");
		c3.getSelectionModel().selectFirst();
		
		c4.getItems().addAll("MS","SN");
		c4.getSelectionModel().selectFirst();
		
		c5.getItems().addAll("MS","SN");
		c5.getSelectionModel().selectFirst();
		
		c6.getItems().addAll("MS","SN");
		c6.getSelectionModel().selectFirst();
		
		c7.getItems().addAll("MS","SN");
		c7.getSelectionModel().selectFirst();
		
		c8.getItems().addAll("MS","SN");
		c8.getSelectionModel().selectFirst();
		
		c9.getItems().addAll("MS","SN");
		c9.getSelectionModel().selectFirst();
		
		c10.getItems().addAll("MS","SN");
		c10.getSelectionModel().selectFirst();
		
		c11.getItems().addAll("MS","SN");
		c11.getSelectionModel().selectFirst();
		
		c12.getItems().addAll("MS","SN");
		c12.getSelectionModel().selectFirst();
		
		c13.getItems().addAll("MS","SN");
		c13.getSelectionModel().selectFirst();
		
		c14.getItems().addAll("MS","SN");
		c14.getSelectionModel().selectFirst();
		
		}


	@Override
	public void start(Stage arg0) throws Exception {
		
	}
	
	
}
