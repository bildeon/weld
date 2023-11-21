package com.sveis.sveis;



import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class Welding extends JComponent {
	
  private JFrame frmWeldingProcedureSpesification;  
  private JPanel panelInfo;
  
  private JPanel panelButt;
  
  private JPanel panelFilet;
  
  private JPanel panelCorner;
  
  private JPanel panelOverlap;
  
  private JPanel panelFlanged;
  
  private JPanel panelSave;
  
  private JPanel panelPrint;
  
  private JPanel panelLeft;
  
  private JLabel lblPrint;
  private  JButton btnNewButton;
  private JLabel lblSave;
  
  private JLabel lblFlaggedWeld;
  
  private JLabel lblOverlapWeld;
  
  private JLabel lblCornerWeld;
  
  private JLabel lblFiletWeld;
  
  private JLabel lblButtWeld;
  
  private JLabel lblInfo;
  
  private JButton btnInfo;
  private JRadioButton rdbnInfo21;
  private JRadioButton rdbnInfo11;
  
  private JButton btnButtWeld;
  
  private JButton btnFiletWeld;
  
  private JButton btnCornerWeld;
  
  private JButton btnOverlapWeld;
  
  private JButton btnFlaggedWeld;
  
  private JButton btnSave;
  
  private JButton btnPrint;
  
  private JButton btnGenerateFilet;
  
  private JButton btnNGenerateOverlap;
  
  private JButton btnNewButtonCamSteel;
  
  private JLabel lblLeftDesign;
  
  private JTextField textFieldGap;
  
  private JTextField textFieldDy;
  
  private JTextField textFieldTickness;
  
  private JTextField textFieldTopAngle;
  
  private JTextField textFieldTopRadius;
  
  private JTextField textFieldBottomAngle;
  
  private JTextField textFieldBottomRadius;
  
  private JTextField textFieldFace;
  
  private JTextField textFieldCenter;
  
  private JButton btnLeftDesignValues;
  
  private int intGap;
  
  private int intDy;
  
  private int Right;
  
  private int intTopAngle;
  
  private int intTopRadius;
  
  private int intBottomAngle;
  
  private int intBottomRadius;
  
  private int intFace;
  
  private int intCenter;
  
  private int intComboLeft;
  
  private int intGapRight;
  
  private int intDyRight;
  
  private int intTicknessRight;
  
  private int intTopAngleRight;
  
  private int intTopRadiusRight;
  
  private int intBottomAngleRight;
  
  private int intBottomRadiusRight;
  
  private int intFaceRight;
  
  private int intCenterRight;
  
  private int intComboRight;
  
  private int intGapFilet;
  
  private int intAngleFilet;
  
  private int intBottomFilet;
  
  private int intTopFilet;
  
  private int intTopAngleFilet;
  
  private int intTopRadiusFilet;
  
  private int intBottomAngleFilet;
  
  private int intBottomRadiusFilet;
  
  private int intFaceFilet;
  
  private int intCenterFilet;
  
  private int intBottomasideFilet;
  
  private int intTopasideFilet;
  
  private int intComboFilet;
  
  public int intGapOverlap;
  
  private int intTickness1Overlap;
  
  private int intTickness2Overlap;
  
  private int intAngleCorner;
  
  private int intLeftAngleCorner;
  
  private int intTickness1Corner;
  
  private int intTickness2Corner;
  
  private int intRightAngleCorner;
  
  private int intDx1Corner;
  
  private int intDx2Corner;
  
  private int intGapFlaged;
  
  private int intTicknessFlaged;
  
  private int intTopRadiusFlaged;
  
  private int intcomboBoxDimention;
  
  private int intcomboBoxDimention3;
  
  private int intcomboBoxCam2;
  
  private int intcomboBoxType;
  
  private int intRotate;
  
  private int intScale;
  
  private int intFiletScaler;
  
  private int intFiletRotate;
  
  private int intCornerScaler;
  
  private int intCornerRotate;
  
  private int intOverlapScaler;
  
  private int intOverlapRotate;
  
  private int intFlangedScaler;
  
  private int intFlangedRotate;
  
  private int intButtScaler;
  
  private int intButtRotate;
  
  private int intSteelType;
  
  private int fu;
  
  private int antallSveis;
  
  private double betaw;
  
  private double gammaM2;
  
  private int fd;
  
  private int amal;
  
  private int length;
  
  private int ang;
  
  private int le;
  
  private int ae;
  
  private int sigman;
  
  private int sigmaj;
  
  private int taupar;
  
  private int value1;
  
  private int value2;
  
  private int value3;
  
  private int value4;
  
  private JComboBox<String> comboBoxLeftDesign;
  
  private JPanel panelButt_1;
  
  private JLabel lblChooseRightDesign;
  
  private JComboBox<String> comboBoxRightDesign;
  
  private JComboBox<String> comboBoxType;
  
  private JComboBox<String> comboBoxDimention;
  
  private JComboBox<String>  comboBoxFiletAngle;
  
  private JLabel lblGiveValuesFor;
  
  private JLabel lblGap_1;
  
  private JLabel lblDy_1;
  
  private JLabel lblTickness_1;
  
  private JLabel lblTopAngle_1;
  
  private JLabel lblTopRadius_1;
  
  private JLabel lblBottomAngle_1;
  
  private JLabel lblBottomRadius_1;
  
  private JLabel lblFace_1;
  
  private JLabel lblCenter_1;
  
  private JTextField textFieldGapRight;
  
  private JTextField textFieldDyRight;
  
  private JTextField textFieldTicknessRight;
  
  private JTextField textFieldTopAngleRight;
  
  private JTextField textFieldTopRadiusRight;
  
  private JTextField textFieldBottomAngleRight;
  
  private JTextField textFieldBottomRadiusRight;
  
  private JTextField textFieldFaceRight;
  
  private JTextField textFieldCenterRight;
  
  private JButton btnGenerateRightSideValues;
  
  private JTextField textFieldnew;
  
  private JLabel lblPossibleChoose;
  
  private JTextField textFieldAngleFilet;
  
  private JTextField textFieldTopFilet;
  
  private JTextField textFieldTopAngleFilet;
  
  private JTextField textFieldTopRadiusFilet;
  
  private JTextField textFieldBottomAngleFilet;
  
  private JTextField textFieldBottomRadiusFilet;
  
  private JTextField textFieldFaceFilet;
  
  private JTextField textFieldCenterFilet;
  
  private JTextField textFieldBottomaside;
  
  private JTextField textFieldTopaside;
  
  private JTextField textFieldTicknessBottomFilet;
  
  private JTextField textFieldGapFilet;
  
  private JLabel lblAngleCorner;
  
  private JLabel lblPlate1Corner;
  
  private JLabel lblTickness1Corner;
  
  private JLabel lblLeftAngleCorner;
  
  private JLabel lblDx1Corner;
  
  private JLabel lblPlate2Corner;
  
  private JLabel lblTickness2Corner;
  
  private JLabel lblRightAngleCorner;
  
  private JLabel lblDx2Corner;
  
  private JTextField textFieldAngleCorner;
  
  private JTextField textFieldTickness1Corner;
  
  private JTextField textFieldLeftAngleCorner;
  
  private JTextField textFieldDx1Corner;
  
  private JTextField textFieldTickness2Corner;
  
  private JTextField textFieldRightAngleCorner;
  
  private JTextField textFieldDx2Corner;
  
  private JLabel lblGapOverlap;
  
  private JLabel lblPlate1Overlap;
  
  private JLabel lblTickness1Overlap;
  
  private JLabel lblPlate2Overlap;
  
  private JLabel lblTickness2Overlap;
  
  private JTextField textFieldGapOverlap;
  
  private JTextField textFieldTickness1Overlap;
  
  private JTextField textFieldTickness2Overlap;
  
  private JButton btnGenerateCorner;
  
  private JLabel lblGapFlaged;
  
  private JLabel lblTicknessFlaged;
  
  private JLabel lblTopRadiusFlaged;
  
  private JTextField textFieldGapFlaged;
  
  private JTextField textFieldTicknessFlaged;
  
  private JTextField textFieldTopRadiusFlaged;
  
  private JButton btnGenerateFlaged;
  
  public String plotType = "";
  
  private String[] actualString;
  
  private int rotasjon = 0;
  
  private Graphics g;
  
  private Graphics2D g2;
  
  private JPanel panel;
  
  private JPanel panelOverlapDraw;
  
  private JLabel lblNewLabel;
  
  private JTextField textFieldTest;
  
  private JLabel lblLabelUnsen;
  
  private Point lastPointNew;
  
  private Point firstPointNew;
  
  private Point middelPointNew;
  
  private int xP = 400;
  
  private int yP = 350;
  
  private int s = 25;
  
  private int[] x1;
  
  private int[] y1;
  
  private int[] x2;
  
  private int[] y2;
  
  private int[] vec = new int[35];
  
  private int antall;
  
  private int xcentrumFU;
  
  private int ycentrumFU;
  
  private int xcentrumA;
  
  private int ycentrumA;
  
  private int xcentrumB;
  
  private int ycentrumB;
  
  private int xcentrumC;
  
  private int ycentrumC;
  
  private int xcentrumD;
  
  private int ycentrumD;
  
  private int xcentrumLDU;
  
  private int ycentrumLDU;
  
  private int xRDUcentrum;
  
  private int yRDUcentrum;
  
  private int xRDU1centrum;
  
  private int yRDU1centrum;
  
  private int xcentrumRDU;
  
  private int ycentrumRDU;
  
  private int intComboRightCopy;
  
  private double factor = 3.77952755906D;
  
  private JTextField textFieldCalcFu;
  
  private JTextField textFieldCalcBetaw;
  
  private JTextField textFieldCalcGammaM2;
  
  private JTextField textField_4;
  
  private JTextField textField_5;
  
  private JTextField textField_6;
  
  private JTextField textField_7;
  
  private JTextField textField_8;
  
  private JTextField textField_9;
  
  private JTextField textField_10;
  
  private JTextField textField_11;
  
  private JTextField textField_12;
  
  private JTextField textField_13;
  
  private JTextField textField_14;
  
  private JComboBox<String> comboBox;
  
  private JLabel lblNewLabel_3;
  
  private JLabel lblNewLabel_4;
  
  private JTextField textFieldSteelScaler;
  
  private JTextField textFieldSteelRotate;
  
  private JLabel lblNewLabel_5;
  
  private JLabel lblNewLabel_8;
  
  private JTextField textFieldFlangedScaler;
  
  private JTextField textFieldFlangedRotate;
  
  private JTextField textFieldOverlapScaler;
  
  private JTextField textFieldOverlapRotate;
  
  private JTextField textFieldCornerScaler;
  
  private JTextField textFieldCornerRotate;
  
  private JTextField textFieldFiletScaler;
  
  private JTextField textFieldFiletRotate;
  
  private JTextField textFieldButtScaler;
  
  private JTextField textFieldButtRotate;
  
  private JLabel lblNewLabel_17;
  
  private JLabel lblNewLabel_18;
  
  private JLabel lblNewLabel_19;
  
  private JLabel lblNewLabel_20;
  
  private JTextField textField_16;
  
  private JTextField textField_15;
  
  private JLabel lblNewLabel_31;
  
  private JLabel lblNewLabel_32;
  
  private JLabel lblNewLabel_33;
  
  private JLabel lblNewLabel_34;
  
  private JLabel lblNewLabel_22;
  
  private JTextField textField_17;
  
  private JLabel lblNewLabel_35;
  
  private JLabel lblSpenningNormal_1;
  
  private JLabel lblKraftDim_1;
  
  private JLabel lblNewLabel_36;
  
  private JLabel lblNewLabel_37;
  
  private JTextField textField_25;
  
  private JTextField textField_1;
  
  private JTextField textField_2;
  
  private JTextField textField_3;
  
  private boolean teksting = false;
  
  private boolean tegning = false;
  
  private int maxlengde = 50;
  
  private int[] xcord = new int[3];
  
  private int[] ycord = new int[3];
  
  private int[] corrT = new int[this.maxlengde];
  
  private int[] corrX1 = new int[this.maxlengde];
  
  private int[] corrY1 = new int[this.maxlengde];
  
  private int[] corrX2 = new int[this.maxlengde];
  
  private int[] corrY2 = new int[this.maxlengde];
  
  private int[] corrX3 = new int[this.maxlengde];
  
  private int[] corrY3 = new int[this.maxlengde];
  
  private String[] plott = new String[this.maxlengde];
  
  private String plotSort = "";
  
  private int intButtDraw;
  
  private int intButtText;
  
  private JCheckBox chckbxDawing_1;
  
  private JCheckBox chckbxbutttext;
  
  private JCheckBox chckbxfilettext;
  
  private JCheckBox chckbxfiletdrawing;
  
  private JCheckBox chckbxcornertext;
  
  private JCheckBox chckbxoverlaptext;
  
  private JCheckBox chckbxoverlapdrawing;
  
  private JCheckBox chckbxflangedtext;
  
  private JCheckBox chckbxflangeddrawing;
  
  private int intFlangedText;
  
  private int intFlangedDraw;
  
  private JComboBox<String> comboBoxFiletDesign;
  

  
  private int intFiletText;
  
  private int indeks5;
  
  private int indeks6;
  
  private int intFiletDraw;
  
  private int intCornerText;
  
  private int intCornerDraw;
  
  private int intOverlapText;
  
  private int intOverlapDraw;
  
  private int intTypeButt;
  private int astep = 60;
  
  private JTextArea textArea_Strength;
  
  private JTextArea textArea_Filet;
  
  private JScrollPane scrollPane_Butt;
  
  private JTextArea textArea_Butt;
  
  private JTextArea textArea_Cam;
  
  private Boolean writePart;
  
  private String textA_Butt;
  
  private String textA_Filet;
  
  private String textA_Corner;
  
  private String textA_Overlap;
  
  private String textA_Flanged;
  
  private String textA_Strength;
  
  private String textA_Cam;
  
  private JTextArea textArea_Corner;
  
  private JTextArea textArea_Overlap;
  
  private JTextArea textArea_Flanged;
  
  private String fileName = "vvv.wps";
  
  private String file;
  
  private Boolean generateOnFile = Boolean.valueOf(false);
  
  private String imageName;
  
  private String choosenName;
  
  private String actualPath;
  
  public static String userID;
  
  private JTextField textField_fileName_butt;
  
  private JComboBox<String> comboBox_type_butt;
  
  private JCheckBox chckbx_image_butt_1;
  
  private JComboBox<String> comboBox_size_butt;
  
  private int intSizeButt;
  
  private int intButtImage;
  
  private int intSizeFlanged;
  
  private int intTypeFlanged;
  
  private int intSizeFilet;
  
  private int intTypeFilet;
  
  private int intSizeCorner;
  
  private int intTypeCorner;
  
  private int intSizeOverlap;
  
  private int intTypeOverlap;
  
  private int intSizeCam;
  
  private int intTypeCam;
  
  private int intFiletImage;
  
  private int intCornerImage;
  
  private int intOverlapImage;
  
  private int intFlangedImage;
  
  private int intCamImage;
  
  private int intCamText;
  
  private int intCamDraw;
  
  private int intMouseButt;
  
  private int intMouseOverlap;
  
  private int intMouseFlanged;
  
  private int intMouseCorner;
  
  private int intMouseFilet;
  
  private int intMouseCam;
  
  private String textA_Butt_String;
  
  private String textA_Filet_String;
  
  private String textA_Corner_String;
  
  private String textA_Overlap_String;
  
  private String textA_Flanged_String;
  
  private String textA_Strength_String;
  
  private String textA_Cam_String;
  
  static String pathName;
  
  private JTextField txtC;
  
  private JTextField textField_Filet;
  
  private JTextField textField_18;
  
  private JTextField textField_19;
  
  private JTextField textField_20;
  
  private JTextField textField_21;
  
  private JTextField textField_22;
  
  private JTextField textField_23;
  
  private JTextField textField_24;
  
  private JTextField textField_26;
  
  private JTextField textField_27;
  
  private JCheckBox chckbxcornerdrawing;
  
  private JCheckBox chckbx_image_butt_1_1;
  
  private JCheckBox chckbx_image_butt_1_2;
  
  private JCheckBox chckbx_image_butt_1_3;
  
  private JCheckBox chckbx_image_butt_1_4;
  
  private JCheckBox chckbx_image_butt_1_5;
  
  private JCheckBox chckbxbutttext_1;
  
  private JCheckBox chckbxfiletdrawing_1;
  
  private JComboBox<String> comboBox_type_butt_1;
  
  private JComboBox<String> comboBox_size_butt_1;
  
  private JComboBox<String> comboBox_type_butt_2;
  
  private JComboBox<String> comboBox_size_butt_2;
  
  private JComboBox<String> comboBox_type_butt_2_1;
  
  private JComboBox<String> comboBox_type_butt_2_2;
  
  private JComboBox<String> comboBox_size_butt_4;
  
  private JComboBox<String> comboBox_type_butt_2_3;
  
  private JComboBox<String> comboBox_size_butt_5;
  
  private JComboBox<String> comboBox_size_butt_3;
  
  BufferedImage buffCopy = new BufferedImage(1600, 1144, 2);
  
  private JLabel lblNewLabel_43;
  
  private JLabel lblNewLabel_44;
  
  private JLabel lblNewLabel_45;
  
  private JLabel lblNewLabel_46;
  
  private JLabel lblNewLabel_47;
  
  private JLabel lblNewLabel_48;
  
  private JComboBox<String> comboBox_1_5;
  
  private JComboBox<String> comboBox_1_4;
  
  private JComboBox<String> comboBox_1_3;
  
  private JComboBox<String> comboBox_1_2;
  
  private JComboBox<String> comboBox_1_1;
  
  private JComboBox<String> comboBox_1;
  
  private List<BufferedImage> images = new ArrayList<>();
  
  private Path outPath;
  
  private int testValue = 0;
  
  private WeldPoint punkt = new WeldPoint();
  
  public ArrayList<WeldPoint> weldList = new ArrayList<>();
  
  public ArrayList<WeldPoint> sveiseListe = new ArrayList<>();
  
  public ArrayList<WeldPoint> oldListe = new ArrayList<>();
  
  private WeldData sveis = new WeldData(this.sveiseListe);
  
  private JCheckBox chckbxInstruction_1;
  
  private JCheckBox chckbxWeldString;
  
  private JCheckBox chckbxInstruction_1_1;
  
  private JCheckBox chckbxInstruction_1_2;
  
  private JCheckBox chckbxInstruction_1_3;
  
  private JCheckBox chckbxInstruction_1_4;
  
  private JCheckBox chckbxInstruction_1_5;
  
  private JCheckBox chckbxWeldString_1;
  
  private JCheckBox chckbxWeldString_2;
  
  private JCheckBox chckbxWeldString_3;
  
  private JCheckBox chckbxWeldString_4;
  
  private JCheckBox chckbxWeldString_5;
  
  protected int intInstruction_1_2;
  
  protected int intInstruction_1;
  
  protected int intInstruction_1_1;
  
  protected int intInstruction_1_3;
  
  protected int intInstruction_1_4;
  
  protected int intInstruction_1_5;
  
  protected int intWeldString;
  
  protected int intWeldString_1;
  
  protected int intWeldString_2;
  
  protected int intWeldString_3;
  
  protected int intWeldString_4;
  
  protected int intWeldString_5;
  
  private double x = 0.0D;
  
  private double y = 0.0D;
  
  private double velx = 0.0D;
  
  private double vely = 0.0D;
  
  private JRadioButton rdbtnfour1;
  
  private JRadioButton rdbtnfour2;
  
  private JRadioButton rdbtnfour3;
  
  private JRadioButton rdbtnfour4;
  
  private JRadioButton rdbtntwo1;
  
  private JRadioButton rdbtntwo2;
  
  private JLabel lblfourA_1;
  
  private JLabel lblfourA_2;
  
  private JLabel lblfourA_3;
  
  private JLabel lblfourA_4;
  
  private JLabel lblfourA_5;
  
  private JRadioButton rdbtnfour1_2;
  
  private JRadioButton rdbtnfour1_3;
  
  private JRadioButton rdbtnfour1_4;
  
  private JRadioButton rdbtnfour1_5;
  
  private JRadioButton rdbtnfour3_1;
  
  private JRadioButton rdbtnfour3_2;
  
  private JRadioButton rdbtnfour3_3;
  
  private JRadioButton rdbtnfour3_4;
  
  private JRadioButton rdbtnfour3_5;
  
  private JRadioButton rdbtnfour2_1;
  
  private JRadioButton rdbtnfour2_2;
  
  private JRadioButton rdbtnfour2_4;
  
  private JRadioButton rdbtnfour2_5;
  
  private JRadioButton rdbtnfour4_1;
  
  private JRadioButton rdbtnfour4_2;
  
  private JRadioButton rdbtnfour4_3;
  
  private JRadioButton rdbtnfour4_4;
  
  private JRadioButton rdbtnfour4_5;
  
  private JLabel lblfourB_2;
  
  private JLabel lblfourB_3;
  
  private JLabel lblfourB_4;
  
  private JLabel lblfourB_5;
  
  private JRadioButton rdbtntwo1_1;
  
  private JRadioButton rdbtntwo1_2;
  
  private JRadioButton rdbtntwo1_3;
  
  private JRadioButton rdbtntwo1_4;
  
  private JRadioButton rdbtntwo1_5;
  
  private JRadioButton rdbtntwo2_1;
  
  private JRadioButton rdbtntwo2_2;
  
  private JRadioButton rdbtntwo2_3;
  
  private JRadioButton rdbtntwo2_4;
  
  private JRadioButton rdbtntwo2_5;
  
  private JRadioButton rdbtnfour2_3;
  
  private JRadioButton rdbtnfour1_1;
  
  List<String> actualFiles = new ArrayList<>();
  
  private int intTrans;
  
  private JButton btnfilesButton;
  
  private JButton btnfilesButton_1;
  
  private JButton btnfilesButton_2;
  
  private JButton btnfilesButton_3;
  
  private JButton btnfilesButton_4;
  
  private JButton btnfilesButton_5;
  private JButton btnNewButton_1;
  
  private JLabel file1_1;
  
  private JLabel file1_2;
  
  private JLabel file1_3;
  
  private JLabel file1_4;
  
  private JLabel file1_5;
  
  private JButton btnNewButton_2;
  
  private JButton btnNewButton_3;
  
  private JButton btnNewButton_4;
  
  private JButton btnNewButton_5;
  
  private JButton btnNewButton_6;
  
  private int imageOnLabel = 0;
  
  private JLabel lblPictureOn;
  
  private JRadioButton rdbtnhor1_1;
  
  private JRadioButton rdbtnhor1_2;
  
  private JRadioButton rdbtnhor1_3;
  
  private JRadioButton rdbtnhor1_4;
  
  private JRadioButton rdbtnhor1_5;
  
  private JRadioButton rdbtnNewRadioButton_1;
  
  private JRadioButton rdbtnNewRadioButton_2;
  
  private JRadioButton rdbtnNewRadioButton_3;
  
  private JRadioButton rdbtnNewRadioButton_4;
  
  private JRadioButton rdbtnNewRadioButton_5;
  
  protected AbstractButton rdbtnhor1;
  
  protected AbstractButton rdbtnNewRadioButton;
  
  private JRadioButton rdbtnhor1_6;
  
  private JRadioButton rdbtnNewRadioButton_6;
  
  private String[][] natText = new String[5][100];
  
  private int standardLanguage = 0;
  
  public String resultString = "";
  public boolean plotOK = true;
  public   List<ExtraSymbol> resultListe = new ArrayList<>();
  private int intFilletAngleRoter;
  
  Language langual = new Language();
  Color welditBlue = new Color(55,115,232);
  private int intTickness;
private JRadioButton rdbtnsingle1;
private JRadioButton rdbtnsingle2;
private JRadioButton rdbtnsingle3;
private JRadioButton rdbtnsingle4;
private JRadioButton rdbtnsingle5;
private JRadioButton rdbtnsingle6;
private JRadioButton rdbtnful11;
private JRadioButton rdbtnfull2;
private JRadioButton rdbtnfull3;
private JRadioButton rdbtnfull4;
private JRadioButton rdbtnfull5;
private JRadioButton rdbtnfull6;
private JRadioButton rdbtnfull1;
private JScrollPane scrollPane_fillet;
private JTextArea textArea_fillet;
private JTextField textFieldImage1;
private JTextField textFieldImage2;
private JTextField textFieldImage3;
private JTextField textFieldImage4;
private boolean upperLeft ;
private boolean upperRight;
private boolean lowerLeft ;
private boolean lowerRight;
private JLabel lblImage0On;
private JLabel lblImageF0On;
private JTextField textFieldImageF1;
private JTextField textFieldImageF2;
private JTextField textFieldImageF3;
private JTextField textFieldImageF4;
private Component lblImageC0On;
private JTextField textFieldImageC1;
private JTextField textFieldImageC2;
private JTextField textFieldImageC3;
private JTextField textFieldImageC4;
private JLabel lblImageO0On;
private JTextField textFieldImageO1;
private JTextField textFieldImageO2;
private JTextField textFieldImageO3;
private JTextField textFieldImageO4;
private JLabel lblImageFL0On;
private JTextField textFieldImageFL1;
private JTextField textFieldImageFL2;
private JTextField textFieldImageFL3;
private JTextField textFieldImageFL4;
private JLabel lblImageCA0On;
private JTextField textFieldImageCA1;
private JTextField textFieldImageCA2;
private JTextField textFieldImageCA3;
private JTextField textFieldImageCA4;
public List<ExtraSymbol> symbolListe = new ArrayList<>();
private JScrollPane scrollPane_Help;
private JTextArea textArea_Help;
private Object rdbnInfo1;
private Object rdbnInfo2;
private JRadioButton rdbnInfo31;
private JRadioButton rdbnInfo41;
private JRadioButton rdbnInfo51;
private JRadioButton rdbnInfo61;
private JRadioButton rdbnInfo71;
private JRadioButton rdbnInfo81;
private JRadioButton rdbnInfo91;
private JButton btnInfoP1;
private JButton btnInfoP2;
private JButton btnInfoP3;
private JButton btnInfoP4;
private JButton btnInfoP5;
private JButton btnInfoP6;
private JButton btnInfoP7;
private JButton btnInfoP8;
private JButton btnInfoP9;
private JButton btnInfoP10;
private boolean UL = false;
private boolean UR = false;
private boolean LL = false;
private boolean LR = false;
  
  public static void main(String[] args) {
    Toolkit tk = Toolkit.getDefaultToolkit();
    tk.beep();
    GraphicsEnvironment ge = 
      GraphicsEnvironment.getLocalGraphicsEnvironment();
    userID = "userID";
    if (args.length == 1)
      userID = args[0]; 
    pathName = "C:\\" + userID;
    if (args.length == 2) {
      userID = args[0];
      pathName = args[1];
  
    } 
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              Welding window = new Welding();
              window.frmWeldingProcedureSpesification.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Welding() throws IOException {
	    plotOK = true;
    int i = 0;
    Language lang = new Language();
    String[] textString = lang.getLanguageText(i);
    for (int j = 0; j < textString.length; j++);
    checkLicense();
    initialize();
    action();
    WeldPoint sveisePunkt = new WeldPoint();
  }
  
  private void checkLicense() throws IOException {
    TestCode testCode = new TestCode();
    boolean testcode = true;
    if (!testcode)
      throw new FileNotFoundException("Licese not accepted"); 
  }
  
  private void initialize() {
      Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
      double width = size.getWidth();
      double height = size.getHeight();
 //    System.out.println("1213  " + width + " " + height);

    width = 1570.0D;		//1920  1720 1570
    height = 980.0D;	//1080
    int xmax = (int)width;
    int ymax = (int)height;
    this.imageName = "ID" + userID;
    this.frmWeldingProcedureSpesification = new JFrame();
   this.frmWeldingProcedureSpesification. setIconImage(Toolkit.getDefaultToolkit().getImage(Welding.class.getResource("/images/logo.png")));
    this.frmWeldingProcedureSpesification.setBackground(Color.WHITE);
    this.frmWeldingProcedureSpesification.getContentPane().setBackground(Color.WHITE);

    this.frmWeldingProcedureSpesification.setTitle("Weld IT  -  Joint program");
    this.frmWeldingProcedureSpesification.setBounds(xmax / 2, 0, xmax / 2, ymax);
    this.frmWeldingProcedureSpesification.setDefaultCloseOperation(3);
    this.frmWeldingProcedureSpesification.getContentPane().setLayout((LayoutManager)null);   

    JPanel panelTop = new JPanel();
    panelTop.setBackground(Color.WHITE);
    panelTop.setBounds(0, 0, 770, 27);
    this.frmWeldingProcedureSpesification.getContentPane().add(panelTop);
    this.btnInfo = new JButton("Info");
    this.btnInfo.setBackground(welditBlue);
    this.btnInfo.setForeground(Color.WHITE);
    panelTop.add(this.btnInfo);
    this.btnButtWeld = new JButton("Butt weld");
    this.btnButtWeld.setBackground(welditBlue);
    this.btnButtWeld.setForeground(Color.WHITE);

    panelTop.add(this.btnButtWeld);
    this.btnFiletWeld = new JButton("Fillet weld");
    this.btnFiletWeld.setBackground(welditBlue);
    this.btnFiletWeld.setForeground(Color.WHITE);
    panelTop.add(this.btnFiletWeld);
    this.btnCornerWeld = new JButton("Corner weld");
    this.btnCornerWeld.setBackground(welditBlue);
    this.btnCornerWeld.setForeground(Color.WHITE);
    panelTop.add(this.btnCornerWeld);
    this.btnOverlapWeld = new JButton("Overlap weld");
    this.btnOverlapWeld.setBackground(welditBlue);
    this.btnOverlapWeld.setForeground(Color.WHITE);
    panelTop.add(this.btnOverlapWeld);
    this.btnFlaggedWeld = new JButton("Flanged weld");
    this.btnFlaggedWeld.setBackground(welditBlue);
    this.btnFlaggedWeld.setForeground(Color.WHITE);
    panelTop.add(this.btnFlaggedWeld);
    this.btnSave = new JButton("Strength");
    this.btnSave.setBackground(welditBlue);
    this.btnSave.setForeground(Color.WHITE);
 //   panelTop.add(this.btnSave);
    this.btnPrint = new JButton("Cam steel");
    this.btnPrint.setBackground(welditBlue);
    this.btnPrint.setForeground(Color.WHITE);
    panelTop.add(this.btnPrint);
    JPanel panelBottom = new JPanel();
    panelBottom.setBackground(Color.WHITE);
    panelBottom.setBounds(0, 28, 770, 1020);
    this.frmWeldingProcedureSpesification.getContentPane().add(panelBottom);
    panelBottom.setLayout(new CardLayout(0, 0));
    this.panelButt = new JPanel();
    this.panelButt.setBackground(Color.WHITE);
    ///////////////////////////////// butt spesifications
    panelBottom.add(this.panelButt, "name_300212289546300");
    this.panelButt.setLayout((LayoutManager)null);
    this.lblButtWeld = new JLabel("Butt weld spesifications");
    this.lblButtWeld.setHorizontalAlignment(0);
    this.lblButtWeld.setFont(new Font("Tahoma", 1, 15));
    this.lblButtWeld.setBounds(10, 10, 551, 15);
    this.panelButt.add(this.lblButtWeld);
    this.lblLeftDesign = new JLabel("Choose left design:");
    this.lblLeftDesign.setFont(new Font("Tahoma", 1, 11));
    this.lblLeftDesign.setBounds(10, 65, 117, 14);
    this.panelButt.add(this.lblLeftDesign);
    this.comboBoxLeftDesign = new JComboBox<String>();
    this.comboBoxLeftDesign.setModel(new DefaultComboBoxModel<>(new String[] { "", "I", "Y ", "X", "U ", "DU" }));
    this.comboBoxLeftDesign.setBounds(137, 61, 63, 22);
    this.panelButt.add(this.comboBoxLeftDesign);
    this.comboBoxLeftDesign.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intComboLeft = Welding.this.comboBoxLeftDesign.getSelectedIndex();
            String[] choosenString = { "", "I", "Y", "X", "U", "DU" };
            if (Welding.this.intComboLeft == 0)
              Welding.this.textFieldnew.setText(""); 
            if (Welding.this.intComboLeft == 1) {
              Welding.this.textFieldnew.setText(" I Y X U DU ");
              choosenString = new String[] { "", "I", "Y", "X", "U", "DU" };
            } 
            if (Welding.this.intComboLeft == 2) {
              Welding.this.textFieldnew.setText(" I Y U ");
              choosenString = new String[] { "", "I", "Y", "", "", "", "U", " " };
            } 
            if (Welding.this.intComboLeft == 3) {
              Welding.this.textFieldnew.setText(" I X DU ");
              choosenString = new String[] { "", "I", " ", "X", " ", "DU" };
            } 
            if (Welding.this.intComboLeft == 4) {
              Welding.this.textFieldnew.setText(" I Y U ");
              choosenString = new String[] { "", "I", "Y", " ", "U", "  " };
            } 
            if (Welding.this.intComboLeft == 5) {
              Welding.this.textFieldnew.setText(" I X DU ");
              choosenString = new String[] { "", "I", " ", "X", " ", "DU" };
            } 
            Welding.this.actualString = choosenString;
            Welding.this.textFieldGap.setEditable(true);
            Welding.this.textFieldDy.setEditable(true);
            Welding.this.textFieldTickness.setEditable(true);
            Welding.this.textFieldTopAngle.setEditable(true);
            Welding.this.textFieldTopRadius.setEditable(true);
            Welding.this.textFieldBottomAngle.setEditable(true);
            Welding.this.textFieldBottomRadius.setEditable(true);
            Welding.this.textFieldFace.setEditable(true);
            Welding.this.textFieldCenter.setEditable(true);
            if (Welding.this.intComboLeft == 1) {
              Welding.this.textFieldTopRadius.setEditable(false);
              Welding.this.textFieldBottomAngle.setEditable(false);
              Welding.this.textFieldBottomRadius.setEditable(false);
              Welding.this.textFieldFace.setEditable(false);
              Welding.this.textFieldTopAngle.setEditable(false);
              Welding.this.textFieldCenter.setEditable(false);
            } 
            if (Welding.this.intComboLeft == 2) {
              Welding.this.textFieldTopRadius.setEditable(false);
              Welding.this.textFieldBottomAngle.setEditable(false);
              Welding.this.textFieldBottomRadius.setEditable(false);
              Welding.this.textFieldCenter.setEditable(false);
            } 
            if (Welding.this.intComboLeft == 3) {
              Welding.this.textFieldTopRadius.setEditable(false);
              Welding.this.textFieldBottomRadius.setEditable(false);
            } 
            if (Welding.this.intComboLeft == 4) {
              Welding.this.textFieldBottomAngle.setEditable(false);
              Welding.this.textFieldBottomRadius.setEditable(false);
              Welding.this.textFieldCenter.setEditable(false);
            } 
          }
        });
    JLabel lblVariabels = new JLabel("Give values for variables on left side:");
    lblVariabels.setFont(new Font("Tahoma", 1, 13));
    lblVariabels.setBounds(10, 101, 262, 14);
   // lblVariables.setColor(Color.RED);
    this.panelButt.add(lblVariabels);
    JLabel lblGap = new JLabel("Gap");
    lblGap.setFont(new Font("Tahoma", 1, 11));
    lblGap.setBounds(33, 126, 46, 14);
    this.panelButt.add(lblGap);
    JLabel lblDy = new JLabel("Dy");
    lblDy.setFont(new Font("Tahoma", 1, 11));
    lblDy.setBounds(33, 151, 46, 14);
    this.panelButt.add(lblDy);
    JLabel lblTickness = new JLabel("Tickness");
    lblTickness.setFont(new Font("Tahoma", 1, 11));
    lblTickness.setBounds(33, 176, 94, 14);
    this.panelButt.add(lblTickness);
    JLabel lblTopAngle = new JLabel("Top angle");
    lblTopAngle.setFont(new Font("Tahoma", 1, 11));
    lblTopAngle.setBounds(33, 201, 76, 14);
    this.panelButt.add(lblTopAngle);
    JLabel lblTopRadius = new JLabel("Top radius");
    lblTopRadius.setFont(new Font("Tahoma", 1, 11));
    lblTopRadius.setBounds(33, 226, 76, 14);
    this.panelButt.add(lblTopRadius);
    JLabel lblBottomAngle = new JLabel("Bottom angle");
    lblBottomAngle.setFont(new Font("Tahoma", 1, 11));
    lblBottomAngle.setBounds(33, 251, 94, 14);
    this.panelButt.add(lblBottomAngle);
    JLabel lblBottomRadius = new JLabel("Bottom Radius");
    lblBottomRadius.setFont(new Font("Tahoma", 1, 11));
    lblBottomRadius.setBounds(33, 273, 94, 14);
    this.panelButt.add(lblBottomRadius);
    JLabel lblFace = new JLabel("Face");
    lblFace.setFont(new Font("Tahoma", 1, 11));
    lblFace.setBounds(33, 298, 46, 14);
    this.panelButt.add(lblFace);
    JLabel lblCenter = new JLabel("Center");
    lblCenter.setFont(new Font("Tahoma", 1, 11));
    lblCenter.setBounds(33, 323, 46, 14);
    this.panelButt.add(lblCenter);
    this.textFieldGap = new JTextField();
    this.textFieldGap.setHorizontalAlignment(0);
    this.textFieldGap.setText("4");
    this.textFieldGap.setBounds(137, 126, 86, 20);
    this.panelButt.add(this.textFieldGap);
    this.textFieldGap.setColumns(10);
    this.textFieldDy = new JTextField();
    this.textFieldDy.setHorizontalAlignment(0);
    this.textFieldDy.setText("0");
    this.textFieldDy.setBounds(137, 148, 86, 20);
    this.panelButt.add(this.textFieldDy);
    this.textFieldDy.setColumns(10);
    this.textFieldTickness = new JTextField();
    this.textFieldTickness.setText("40");
    this.textFieldTickness.setHorizontalAlignment(0);
    this.textFieldTickness.setBounds(137, 173, 86, 20);
    this.panelButt.add(this.textFieldTickness);
    this.textFieldTickness.setColumns(10);
    this.textFieldTopAngle = new JTextField();
    this.textFieldTopAngle.setText("25");
    this.textFieldTopAngle.setHorizontalAlignment(0);
    this.textFieldTopAngle.setBounds(137, 198, 86, 20);
    this.panelButt.add(this.textFieldTopAngle);
    this.textFieldTopAngle.setColumns(10);
    this.textFieldTopRadius = new JTextField();
    this.textFieldTopRadius.setHorizontalAlignment(0);
    this.textFieldTopRadius.setText("5");
    this.textFieldTopRadius.setBounds(137, 223, 86, 20);
    this.panelButt.add(this.textFieldTopRadius);
    this.textFieldTopRadius.setColumns(10);
    this.textFieldBottomAngle = new JTextField();
    this.textFieldBottomAngle.setText("25");
    this.textFieldBottomAngle.setHorizontalAlignment(0);
    this.textFieldBottomAngle.setBounds(137, 248, 86, 20);
    this.panelButt.add(this.textFieldBottomAngle);
    this.textFieldBottomAngle.setColumns(10);
    this.textFieldBottomRadius = new JTextField();
    this.textFieldBottomRadius.setText("5");
    this.textFieldBottomRadius.setToolTipText("");
    this.textFieldBottomRadius.setHorizontalAlignment(0);
    this.textFieldBottomRadius.setBounds(137, 270, 86, 20);
    this.panelButt.add(this.textFieldBottomRadius);
    this.textFieldBottomRadius.setColumns(10);
    this.textFieldFace = new JTextField();
    this.textFieldFace.setText("2");
    this.textFieldFace.setHorizontalAlignment(0);
    this.textFieldFace.setBounds(137, 295, 86, 20);
    this.panelButt.add(this.textFieldFace);
    this.textFieldFace.setColumns(10);
    this.textFieldCenter = new JTextField();
    this.textFieldCenter.setBackground(Color.WHITE);
    this.textFieldCenter.setText("20");
    this.textFieldCenter.setHorizontalAlignment(0);
    this.textFieldCenter.setBounds(137, 320, 86, 20);
    this.panelButt.add(this.textFieldCenter);
    this.textFieldCenter.setColumns(10);
    this.btnLeftDesignValues = new JButton("Generate left side");
    this.btnLeftDesignValues.setFont(new Font("Tahoma", 1, 11));
    this.btnLeftDesignValues.setBackground(welditBlue);
    this.btnLeftDesignValues.setForeground(Color.WHITE);
    this.btnLeftDesignValues.setBounds(33, 363, 190, 23);
    this.panelButt.add(this.btnLeftDesignValues);
    this.panelButt_1 = new JPanel();
    this.panelButt_1.setBackground(Color.WHITE);
    this.panelButt_1.setLayout((LayoutManager)null);
    this.panelButt_1.setBounds(306, 0, 273, 386);
    this.panelButt.add(this.panelButt_1);
    this.lblChooseRightDesign = new JLabel("Choose right design:");
    this.lblChooseRightDesign.setFont(new Font("Tahoma", 1, 11));
    this.lblChooseRightDesign.setBounds(10, 65, 117, 20);
    this.panelButt_1.add(this.lblChooseRightDesign);
    String[] test = { "", "I", "Y", "X", "U", "DU" };
    this.comboBoxRightDesign = new JComboBox<String>();
    this.comboBoxRightDesign.setModel(new DefaultComboBoxModel<>(new String[] { "", "I", "Y", "X", "U", "DU" }));
    this.comboBoxRightDesign.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intComboRightCopy = Welding.this.comboBoxRightDesign.getSelectedIndex();
            Welding.this.textFieldGapRight.setEditable(true);
            Welding.this.textFieldDyRight.setEditable(true);
            Welding.this.textFieldTicknessRight.setEditable(true);
            Welding.this.textFieldTopAngleRight.setEditable(true);
            Welding.this.textFieldTopRadiusRight.setEditable(true);
            Welding.this.textFieldBottomAngleRight.setEditable(true);
            Welding.this.textFieldBottomRadiusRight.setEditable(true);
            Welding.this.textFieldFaceRight.setEditable(true);
            Welding.this.textFieldCenterRight.setEditable(true);
            if (Welding.this.intComboRightCopy == 1) {
              Welding.this.textFieldTopAngleRight.setEditable(false);
              Welding.this.textFieldTopRadiusRight.setEditable(false);
              Welding.this.textFieldBottomAngleRight.setEditable(false);
              Welding.this.textFieldBottomRadiusRight.setEditable(false);
              Welding.this.textFieldFaceRight.setEditable(false);
              Welding.this.textFieldCenterRight.setEditable(false);
            } 
            if (Welding.this.intComboRightCopy == 2) {
              Welding.this.textFieldTopRadiusRight.setEditable(false);
              Welding.this.textFieldBottomAngleRight.setEditable(false);
              Welding.this.textFieldBottomRadiusRight.setEditable(false);
              Welding.this.textFieldCenterRight.setEditable(false);
            } 
            if (Welding.this.intComboRightCopy == 3) {
              Welding.this.textFieldTopRadiusRight.setEditable(false);
              Welding.this.textFieldBottomRadiusRight.setEditable(false);
            } 
            if (Welding.this.intComboRightCopy == 4) {
              Welding.this.textFieldBottomAngleRight.setEditable(false);
              Welding.this.textFieldBottomRadiusRight.setEditable(false);
              Welding.this.textFieldCenterRight.setEditable(false);
            } 
          }
        });
    this.comboBoxRightDesign.setBounds(137, 61, 63, 22);
    this.panelButt_1.add(this.comboBoxRightDesign);
    this.lblGiveValuesFor = new JLabel("Give values for variables on right side:");
    this.lblGiveValuesFor.setFont(new Font("Tahoma", 1, 13));
    this.lblGiveValuesFor.setBounds(10, 101, 262, 20);
    this.panelButt_1.add(this.lblGiveValuesFor);
    this.lblGap_1 = new JLabel("Gap");
    this.lblGap_1.setFont(new Font("Tahoma", 1, 11));
    this.lblGap_1.setBounds(33, 126, 46, 20);
    this.panelButt_1.add(this.lblGap_1);
    this.lblDy_1 = new JLabel("Dy");
    this.lblDy_1.setFont(new Font("Tahoma", 1, 11));
    this.lblDy_1.setBounds(33, 151, 46, 20);
    this.panelButt_1.add(this.lblDy_1);
    this.lblTickness_1 = new JLabel("Tickness");
    this.lblTickness_1.setFont(new Font("Tahoma", 1, 11));
    this.lblTickness_1.setBounds(33, 176, 94, 20);
    this.panelButt_1.add(this.lblTickness_1);
    this.lblTopAngle_1 = new JLabel("Top angle");
    this.lblTopAngle_1.setFont(new Font("Tahoma", 1, 11));
    this.lblTopAngle_1.setBounds(33, 201, 76, 20);
    this.panelButt_1.add(this.lblTopAngle_1);
    this.lblTopRadius_1 = new JLabel("Top radius");
    this.lblTopRadius_1.setFont(new Font("Tahoma", 1, 11));
    this.lblTopRadius_1.setBounds(33, 226, 76, 20);
    this.panelButt_1.add(this.lblTopRadius_1);
    this.lblBottomAngle_1 = new JLabel("Bottom angle");
    this.lblBottomAngle_1.setFont(new Font("Tahoma", 1, 11));
    this.lblBottomAngle_1.setBounds(33, 251, 94, 20);
    this.panelButt_1.add(this.lblBottomAngle_1);
    this.lblBottomRadius_1 = new JLabel("Bottom Radius");
    this.lblBottomRadius_1.setFont(new Font("Tahoma", 1, 11));
    this.lblBottomRadius_1.setBounds(33, 273, 94, 20);
    this.panelButt_1.add(this.lblBottomRadius_1);
    this.lblFace_1 = new JLabel("Face");
    this.lblFace_1.setFont(new Font("Tahoma", 1, 11));
    this.lblFace_1.setBounds(33, 298, 46, 20);
    this.panelButt_1.add(this.lblFace_1);
    this.lblCenter_1 = new JLabel("Center");
    this.lblCenter_1.setFont(new Font("Tahoma", 1, 11));
    this.lblCenter_1.setBounds(33, 323, 46, 20);
    this.panelButt_1.add(this.lblCenter_1);
    this.textFieldGapRight = new JTextField();
    this.textFieldGapRight.setText("4");
    this.textFieldGapRight.setHorizontalAlignment(0);
    this.textFieldGapRight.setColumns(10);
    this.textFieldGapRight.setBounds(137, 126, 86, 20);
    this.panelButt_1.add(this.textFieldGapRight);
    this.textFieldDyRight = new JTextField();
    this.textFieldDyRight.setText("0");
    this.textFieldDyRight.setHorizontalAlignment(0);
    this.textFieldDyRight.setColumns(10);
    this.textFieldDyRight.setBounds(137, 148, 86, 20);
    this.panelButt_1.add(this.textFieldDyRight);
    this.textFieldTicknessRight = new JTextField();
    this.textFieldTicknessRight.setText("40");
    this.textFieldTicknessRight.setHorizontalAlignment(0);
    this.textFieldTicknessRight.setColumns(10);
    this.textFieldTicknessRight.setBounds(137, 173, 86, 20);
    this.panelButt_1.add(this.textFieldTicknessRight);
    this.textFieldTopAngleRight = new JTextField();
    this.textFieldTopAngleRight.setText("25");
    this.textFieldTopAngleRight.setHorizontalAlignment(0);
    this.textFieldTopAngleRight.setColumns(10);
    this.textFieldTopAngleRight.setBounds(137, 198, 86, 20);
    this.panelButt_1.add(this.textFieldTopAngleRight);
    this.textFieldTopRadiusRight = new JTextField();
    this.textFieldTopRadiusRight.setText("5");
    this.textFieldTopRadiusRight.setHorizontalAlignment(0);
    this.textFieldTopRadiusRight.setColumns(10);
    this.textFieldTopRadiusRight.setBounds(137, 223, 86, 20);
    this.panelButt_1.add(this.textFieldTopRadiusRight);
    this.textFieldBottomAngleRight = new JTextField();
    this.textFieldBottomAngleRight.setText("25");
    this.textFieldBottomAngleRight.setHorizontalAlignment(0);
    this.textFieldBottomAngleRight.setColumns(10);
    this.textFieldBottomAngleRight.setBounds(137, 248, 86, 20);
    this.panelButt_1.add(this.textFieldBottomAngleRight);
    this.textFieldBottomRadiusRight = new JTextField();
    this.textFieldBottomRadiusRight.setToolTipText("5");
    this.textFieldBottomRadiusRight.setText("5");
    this.textFieldBottomRadiusRight.setHorizontalAlignment(0);
    this.textFieldBottomRadiusRight.setColumns(10);
    this.textFieldBottomRadiusRight.setBounds(137, 270, 86, 20);
    this.panelButt_1.add(this.textFieldBottomRadiusRight);
    this.textFieldFaceRight = new JTextField();
    this.textFieldFaceRight.setText("2");
    this.textFieldFaceRight.setHorizontalAlignment(0);
    this.textFieldFaceRight.setColumns(10);
    this.textFieldFaceRight.setBounds(137, 295, 86, 20);
    this.panelButt_1.add(this.textFieldFaceRight);
    this.textFieldCenterRight = new JTextField();
    this.textFieldCenterRight.setText("20");
    this.textFieldCenterRight.setHorizontalAlignment(0);
    this.textFieldCenterRight.setColumns(10);
    this.textFieldCenterRight.setBounds(137, 320, 86, 20);
    this.panelButt_1.add(this.textFieldCenterRight);
    this.btnGenerateRightSideValues = new JButton("Generate right side");
    this.btnGenerateRightSideValues.setFont(new Font("Tahoma", 1, 11));
    this.btnGenerateRightSideValues.setBounds(33, 363, 190, 23);
    this.btnGenerateRightSideValues.setBackground(welditBlue);
    this.btnGenerateRightSideValues.setForeground(Color.WHITE);
    this.panelButt_1.add(this.btnGenerateRightSideValues);
    this.textFieldnew = new JTextField();
    this.textFieldnew.setBounds(145, 28, 76, 20);
    this.panelButt_1.add(this.textFieldnew);
    this.textFieldnew.setColumns(10);
    this.lblPossibleChoose = new JLabel("Recommended choice");
    this.lblPossibleChoose.setFont(new Font("Tahoma", 1, 11));
    this.lblPossibleChoose.setBounds(15, 28, 130, 17);
    this.panelButt_1.add(this.lblPossibleChoose);
    this.textFieldGapRight.setText("4");
    this.textFieldDyRight.setText("0");
    this.textFieldTicknessRight.setText("40");
    this.textFieldTopAngleRight.setText("25");
    this.textFieldTopRadiusRight.setText("5");
    this.textFieldBottomAngleRight.setText("25");
    this.textFieldBottomRadiusRight.setText("5");
    this.textFieldFaceRight.setText("2");
    this.textFieldCenterRight.setText("20");
    JLabel lblNewLabel_15 = new JLabel("Scaler %");
    lblNewLabel_15.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_15.setBounds(601, 24, 63, 20);
 //   this.panelButt.add(lblNewLabel_15);
    JLabel lblNewLabel_16 = new JLabel("Rotate");
    lblNewLabel_16.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_16.setBounds(601, 49, 56, 20);
//    this.panelButt.add(lblNewLabel_16);
    this.textFieldButtScaler = new JTextField();
    this.textFieldButtScaler.setHorizontalAlignment(0);
    this.textFieldButtScaler.setText("100");
    this.textFieldButtScaler.setBounds(674, 24, 86, 20);
//    this.panelButt.add(this.textFieldButtScaler);
    this.textFieldButtScaler.setColumns(10);
    this.textFieldButtRotate = new JTextField();
    this.textFieldButtRotate.setHorizontalAlignment(0);
    this.textFieldButtRotate.setText("0");
    this.textFieldButtRotate.setBounds(674, 48, 86, 20);
//    this.panelButt.add(this.textFieldButtRotate);
    this.textFieldButtRotate.setColumns(10);
    JTextArea textArea = new JTextArea();
    textArea.setBounds(575, 675, 141, -16);
//    this.panelButt.add(textArea);
    JTextPane textPane = new JTextPane();
    textPane.setBounds(89, 497, 7, 20);
 //   this.panelButt.add(textPane);
    JTextPane textPane_1 = new JTextPane();
    textPane_1.setBounds(115, 849, 117, 20);
//    this.panelButt.add(textPane_1);
    this.chckbxbutttext = new JCheckBox("With value text on page");
    this.chckbxbutttext.setBackground(Color.WHITE);
    this.chckbxbutttext.setFont(new Font("Tahoma", 1, 11));
    this.chckbxbutttext.setBounds(601, 98, 163, 23);
 //   this.panelButt.add(this.chckbxbutttext);
    this.chckbxDawing_1 = new JCheckBox("With values on drawing");
    this.chckbxDawing_1.setBackground(Color.WHITE);
    this.chckbxDawing_1.setSelected(true);
    this.chckbxDawing_1.setFont(new Font("Tahoma", 1, 11));
    this.chckbxDawing_1.setBounds(601, 122, 161, 23);
    this.panelButt.add(this.chckbxDawing_1);
    JLabel lblbuttspin = new JLabel("Comments:");
    lblbuttspin.setBackground(Color.WHITE);
    lblbuttspin.setFont(new Font("Tahoma", 1, 11));
    lblbuttspin.setBounds(10, 419, 117, 14);
    this.panelButt.add(lblbuttspin);

    this.scrollPane_Butt = new JScrollPane();
    this.scrollPane_Butt.setBounds(20, 444, 725, 60);
    this.panelButt.add(this.scrollPane_Butt);
    this.textArea_Butt = new JTextArea();
    this.textArea_Butt.setToolTipText("");
    this.scrollPane_Butt.setViewportView(this.textArea_Butt);
    
    JLabel lblNewLabel_38 = new JLabel("File Name:");
    lblNewLabel_38.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_38.setBounds(589, 226, 70, 14);
//    this.panelButt.add(lblNewLabel_38);
    this.textField_fileName_butt = new JTextField();
    this.textField_fileName_butt.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.choosenName = Welding.this.textField_fileName_butt.getText();
          }
        });
    this.textField_fileName_butt.setBounds(601, 248, 159, 20);
 //   this.panelButt.add(this.textField_fileName_butt);
    this.textField_fileName_butt.setColumns(10);
    JLabel lblNewLabel_39 = new JLabel("File Extension:");
    lblNewLabel_39.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_39.setBounds(589, 295, 86, 20);
//  this.panelButt.add(lblNewLabel_39);
    JLabel lblNewLabel_40 = new JLabel("Screen size:");
    lblNewLabel_40.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_40.setBounds(599, 320, 86, 20);
 //   this.panelButt.add(lblNewLabel_40);
    this.comboBox_type_butt = new JComboBox<String>();
    this.comboBox_type_butt.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTypeButt = Welding.this.comboBox_type_butt.getSelectedIndex();
          }
        });
    this.comboBox_type_butt.setBackground(Color.WHITE);
    this.comboBox_type_butt.setModel(new DefaultComboBoxModel<>(new String[] { "png", "gif" }));
    this.comboBox_type_butt.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_type_butt.setBounds(684, 290, 76, 22);
//    this.panelButt.add(this.comboBox_type_butt);
    this.comboBox_size_butt = new JComboBox<String>();
    this.comboBox_size_butt.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intSizeButt = Welding.this.comboBox_size_butt.getSelectedIndex();
          }
        });
    this.comboBox_size_butt.setBackground(Color.WHITE);
    this.comboBox_size_butt.setModel(new DefaultComboBoxModel<>(new String[] { "Standard size", "Full screen" }));
    this.comboBox_size_butt.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_size_butt.setBounds(601, 345, 159, 22);
//    this.panelButt.add(this.comboBox_size_butt);
    this.chckbx_image_butt_1 = new JCheckBox("Generate image on page");
    this.chckbx_image_butt_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {}
        });
    this.chckbx_image_butt_1.setSelected(true);
    this.chckbx_image_butt_1.setBackground(Color.WHITE);
    this.chckbx_image_butt_1.setFont(new Font("Tahoma", 1, 11));
    this.chckbx_image_butt_1.setBounds(601, 147, 169, 23);
//    this.panelButt.add(this.chckbx_image_butt_1);
    JLabel lblNewLabel_41 = new JLabel("Path Name:");
    lblNewLabel_41.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_41.setBounds(588, 176, 76, 11);
//    this.panelButt.add(lblNewLabel_41);
    this.txtC = new JTextField();
    this.txtC.setText(pathName);
    this.txtC.setBackground(Color.WHITE);
    this.txtC.setBounds(601, 198, 159, 20);
//    this.panelButt.add(this.txtC);
    this.txtC.setColumns(10);
    this.lblNewLabel_43 = new JLabel("Mouse move enabled");
    this.lblNewLabel_43.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_43.setBounds(455, 419, 134, 14);
//    this.panelButt.add(this.lblNewLabel_43);
    this.comboBox_1 = new JComboBox<String>();
    this.comboBox_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intMouseButt = Welding.this.comboBox_1.getSelectedIndex();
          }
        });
    this.comboBox_1.setBackground(Color.WHITE);
    this.comboBox_1.setForeground(Color.BLACK);
    this.comboBox_1.setModel(new DefaultComboBoxModel<>(new String[] { "", "String drawing", "String drawing with menu" }));
    this.comboBox_1.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_1.setBounds(601, 411, 159, 22);
//    this.panelButt.add(this.comboBox_1);
    this.chckbxInstruction_1 = new JCheckBox("Witn comments on page");
    this.chckbxInstruction_1.setFont(new Font("Tahoma", 1, 11));
    this.chckbxInstruction_1.setBackground(Color.WHITE);
    this.chckbxInstruction_1.setBounds(601, 72, 163, 23);
 //   this.panelButt.add(this.chckbxInstruction_1);
    this.chckbxWeldString = new JCheckBox("Max size for weldstring");
    this.chckbxWeldString.setFont(new Font("Tahoma", 1, 11));
    this.chckbxWeldString.setBackground(Color.WHITE);
    this.chckbxWeldString.setBounds(601, 381, 159, 23);
  //  this.panelButt.add(this.chckbxWeldString);
    JLabel lblfourA = new JLabel("Number of pictures on same screen");
    lblfourA.setFont(new Font("Tahoma", 1, 14));
    lblfourA.setBounds(30, 515, 300, 20);
    this.panelButt.add(lblfourA);
    
    this.rdbtnsingle1 = new JRadioButton("Single");
    this.rdbtnsingle1.setBackground(Color.WHITE);
    Welding.this.rdbtnsingle1.setSelected(true);
    this.rdbtnsingle1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnsingle1.isSelected()) {
            	Welding.this.rdbtnfour1.setSelected(false);
              	Welding.this.rdbtnfour2.setSelected(false);
              	Welding.this.rdbtnfour3.setSelected(false);
              	Welding.this.rdbtnfour4.setSelected(false);
             	Welding.this.rdbtntwo1.setSelected(false);
              	Welding.this.rdbtntwo2.setSelected(false);
              	Welding.this.rdbtnhor1_6.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_6.setSelected(false);
                Welding.this.rdbtnfull1.setSelected(false);
            } 
          }
        });
    this.rdbtnsingle1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnsingle1.setBounds(600, 561, 109, 23);
    this.panelButt.add(this.rdbtnsingle1);

    this.rdbtnfull1 = new JRadioButton("Entire screen");    // Entire screen
    this.rdbtnfull1.setBackground(Color.WHITE);
    Welding.this.rdbtnfull1.setSelected(false);
    this.rdbtnfull1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfull1.isSelected()) {
            	Welding.this.rdbtnfour1.setSelected(false);
              	Welding.this.rdbtnfour2.setSelected(false);
              	Welding.this.rdbtnfour3.setSelected(false);
              	Welding.this.rdbtnfour4.setSelected(false);
             	Welding.this.rdbtntwo1.setSelected(false);
              	Welding.this.rdbtntwo2.setSelected(false);
              	Welding.this.rdbtnhor1_6.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_6.setSelected(false);
              	Welding.this.rdbtnsingle1.setSelected(false);
            } 
          }
        });
    this.rdbtnfull1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfull1.setBounds(600, 587, 109, 23);
    this.panelButt.add(this.rdbtnfull1);                    //

    this.rdbtnfour1 = new JRadioButton("Upper left");
    this.rdbtnfour1.setBackground(Color.WHITE);
    this.rdbtnfour1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour1.isSelected()) {
              Welding.this.rdbtnfour2.setSelected(false);
              Welding.this.rdbtnfour3.setSelected(false);
              Welding.this.rdbtnfour4.setSelected(false);
              Welding.this.rdbtntwo1.setSelected(false);
              Welding.this.rdbtntwo2.setSelected(false);
              Welding.this.rdbtnhor1_6.setSelected(false);
              Welding.this.rdbtnNewRadioButton_6.setSelected(false);
              Welding.this.rdbtnsingle1.setSelected(false);
              Welding.this.rdbtnfull1.setSelected(false);
              upperLeft = true;
            } 
          }
        });
    this.rdbtnfour1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour1.setBounds(33, 561, 109, 23);
    this.panelButt.add(this.rdbtnfour1);
    this.rdbtnfour3 = new JRadioButton("Lower left");
    this.rdbtnfour3.setBackground(Color.WHITE);
    this.rdbtnfour3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour3.isSelected()) {
              Welding.this.rdbtnfour2.setSelected(false);
              Welding.this.rdbtnfour1.setSelected(false);
              Welding.this.rdbtnfour4.setSelected(false);
              Welding.this.rdbtntwo1.setSelected(false);
              Welding.this.rdbtntwo2.setSelected(false);
              Welding.this.rdbtnhor1_6.setSelected(false);
              Welding.this.rdbtnNewRadioButton_6.setSelected(false);
              Welding.this.rdbtnsingle1.setSelected(false);
              Welding.this.rdbtnfull1.setSelected(false);
              lowerLeft = true;
            } 
          }
        });
    this.rdbtnfour3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour3.setBounds(33, 587, 109, 23);
    this.panelButt.add(this.rdbtnfour3);
    this.rdbtnfour2 = new JRadioButton("Upper right");
    this.rdbtnfour2.setBackground(Color.WHITE);
    this.rdbtnfour2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour2.isSelected()) {
              Welding.this.rdbtnfour1.setSelected(false);
              Welding.this.rdbtnfour3.setSelected(false);
              Welding.this.rdbtnfour4.setSelected(false);
              Welding.this.rdbtntwo1.setSelected(false);
              Welding.this.rdbtntwo2.setSelected(false);
              Welding.this.rdbtnhor1_6.setSelected(false);
              Welding.this.rdbtnNewRadioButton_6.setSelected(false);
              Welding.this.rdbtnsingle1.setSelected(false);
              Welding.this.rdbtnfull1.setSelected(false);
              upperRight = true;
            } 
          }
        });
    this.rdbtnfour2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour2.setBounds(137, 561, 109, 23);
    this.panelButt.add(this.rdbtnfour2);
    this.rdbtnfour4 = new JRadioButton("Lower right & finishing");
    this.rdbtnfour4.setBackground(Color.WHITE);
    this.rdbtnfour4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour4.isSelected()) {
              Welding.this.rdbtnfour2.setSelected(false);
              Welding.this.rdbtnfour3.setSelected(false);
              Welding.this.rdbtnfour1.setSelected(false);
              Welding.this.rdbtntwo1.setSelected(false);
              Welding.this.rdbtntwo2.setSelected(false);
              Welding.this.rdbtnhor1_6.setSelected(false);
              Welding.this.rdbtnNewRadioButton_6.setSelected(false);
              Welding.this.rdbtnsingle1.setSelected(false);
              Welding.this.rdbtnfull1.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnfour4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour4.setBounds(137, 587, 180, 23);
    this.panelButt.add(this.rdbtnfour4);
    JLabel lblfourB = new JLabel("");
    lblfourB.setFont(new Font("Tahoma", 1, 14));
    lblfourB.setBounds(285, 515, 146, 14);
    this.panelButt.add(lblfourB);
    this.rdbtntwo1 = new JRadioButton("Upper");
    this.rdbtntwo1.setBackground(Color.WHITE);
    this.rdbtntwo1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo1.isSelected()) {
              Welding.this.rdbtntwo2.setSelected(false);
              Welding.this.rdbtnfour2.setSelected(false);
              Welding.this.rdbtnfour1.setSelected(false);
              Welding.this.rdbtnfour4.setSelected(false);
              Welding.this.rdbtnfour3.setSelected(false);
              Welding.this.rdbtnhor1_6.setSelected(false);
              Welding.this.rdbtnNewRadioButton_6.setSelected(false);
              Welding.this.rdbtnsingle1.setSelected(false);
              Welding.this.rdbtnfull1.setSelected(false);
              upperLeft = true;
              upperRight = true;
            } 
          }
        });
    this.rdbtntwo1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo1.setBounds(314, 561, 109, 23);
    this.panelButt.add(this.rdbtntwo1);
    this.rdbtntwo2 = new JRadioButton("Lower & finishing");
    this.rdbtntwo2.setBackground(Color.WHITE);
    this.rdbtntwo2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo2.isSelected()) {
              Welding.this.rdbtntwo1.setSelected(false);
              Welding.this.rdbtnfour2.setSelected(false);
              Welding.this.rdbtnfour1.setSelected(false);
              Welding.this.rdbtnfour4.setSelected(false);
              Welding.this.rdbtnfour3.setSelected(false);
              Welding.this.rdbtnhor1_6.setSelected(false);
              Welding.this.rdbtnNewRadioButton_6.setSelected(false);
              Welding.this.rdbtnsingle1.setSelected(false);
              Welding.this.rdbtnfull1.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtntwo2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo2.setBounds(314, 587, 127, 25);
    this.panelButt.add(this.rdbtntwo2);
    JLabel file1 = new JLabel("");
    file1.setIcon((Icon)null);
    file1.setBounds(10, 610, 750, 400);
    this.panelButt.add(file1);
    this.btnfilesButton = new JButton("Look at images");
    this.btnfilesButton.setBackground(welditBlue);
    this.btnfilesButton.setForeground(Color.WHITE);
    btnfilesButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
      		
            Welding.this.intTrans = 2;
            Welding.this.lookAtImages();
          }
        });
    btnfilesButton.setFont(new Font("Tahoma", 1, 11));
    btnfilesButton.setBounds(33, 630, 127, 28);    //  (589, 537, 127, 28);
    this.panelButt.add(btnfilesButton);
    this.btnNewButton_2 = new JButton("Picture under");
    this.btnNewButton_2.setBackground(welditBlue);
    this.btnNewButton_2.setForeground(Color.WHITE);
    this.btnNewButton_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.imageOnLabel++;
            Welding.this.lookAtPicture();
          }
        });



    this.btnNewButton_2.setFont(new Font("Tahoma", 1, 11));
    this.btnNewButton_2.setBounds(589, 576, 127, 28);
//    this.panelButt.add(this.btnNewButton_2);
    this.lblPictureOn = new JLabel("");
    this.lblPictureOn.setFont(new Font("Tahoma", 1, 14));
    this.lblPictureOn.setBounds(427, 515, 146, 14);
    this.panelButt.add(this.lblPictureOn);
    this.rdbtnhor1_6 = new JRadioButton("Left");
    this.rdbtnhor1_6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnhor1_6.isSelected()) {
              Welding.this.rdbtntwo1.setSelected(false);
              Welding.this.rdbtnfour2.setSelected(false);
              Welding.this.rdbtnfour1.setSelected(false);
              Welding.this.rdbtnfour4.setSelected(false);
              Welding.this.rdbtnfour3.setSelected(false);
              Welding.this.rdbtntwo2.setSelected(false);
              Welding.this.rdbtnNewRadioButton_6.setSelected(false);
              Welding.this.rdbtnsingle1.setSelected(false);
              Welding.this.rdbtnfull1.setSelected(false);
              upperLeft = true;
              lowerLeft = true;
            } 
          }
        });
    this.rdbtnhor1_6.setBackground(Color.WHITE);
    this.rdbtnhor1_6.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnhor1_6.setBounds(447, 561, 109, 23);
    this.panelButt.add(this.rdbtnhor1_6);
    this.rdbtnNewRadioButton_6 = new JRadioButton("Right & finishing");
    this.rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnNewRadioButton_6.isSelected()) {
              Welding.this.rdbtntwo1.setSelected(false);
              Welding.this.rdbtnfour2.setSelected(false);
              Welding.this.rdbtnfour1.setSelected(false);
              Welding.this.rdbtnfour4.setSelected(false);
              Welding.this.rdbtnfour3.setSelected(false);
              Welding.this.rdbtntwo2.setSelected(false);
              Welding.this.rdbtnhor1_6.setSelected(false);
              Welding.this.rdbtnsingle1.setSelected(false);
              Welding.this.rdbtnfull1.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnNewRadioButton_6.setBackground(Color.WHITE);
    this.rdbtnNewRadioButton_6.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnNewRadioButton_6.setBounds(447, 587, 120, 23);
    this.panelButt.add(this.rdbtnNewRadioButton_6);
    
    JLabel lblNewLabel_42 = new JLabel("2 horisontal parts");
    lblNewLabel_42.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_42.setBounds(316, 542, 126, 14);
    this.panelButt.add(lblNewLabel_42);
    JLabel lblNewLabel_49 = new JLabel("2 vertical parts");
    lblNewLabel_49.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_49.setBounds(455, 542, 106, 14);
    this.panelButt.add(lblNewLabel_49);
    JLabel lblNewLabel_50 = new JLabel("4 parts");
    lblNewLabel_50.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_50.setBounds(40, 540, 46, 14);
    this.panelButt.add(lblNewLabel_50);
    JLabel lblNewLabel_510 = new JLabel("1 picture");
    lblNewLabel_510.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_510.setBounds(595, 542,106,14);
    this.panelButt.add(lblNewLabel_510);
    
	lblImage0On = new JLabel("Indication of images in buffer");
	lblImage0On.setFont(new Font("Tahoma", 1, 14));
	lblImage0On.setBounds(50, 670, 400, 20);
	this.panelButt.add(lblImage0On);
	
	textFieldImage1 = new JTextField();
   	textFieldImage1.setHorizontalAlignment(0);
	textFieldImage1.setText("1");
	textFieldImage1.setBounds(150, 700, 30, 30);
 	textFieldImage1.setForeground(Color.RED);
	textFieldImage1.setBackground(Color.WHITE);

 	panelButt.add(this.textFieldImage1);

	textFieldImage2 = new JTextField();
   	textFieldImage2.setHorizontalAlignment(0);
	textFieldImage2.setText("2");
	textFieldImage2.setBounds(180, 700, 30, 30);
 	textFieldImage2.setForeground(Color.RED);
	textFieldImage2.setBackground(Color.WHITE);
 	panelButt.add(this.textFieldImage2);

	textFieldImage3 = new JTextField();
   	textFieldImage3.setHorizontalAlignment(0);
	textFieldImage3.setText("3");
	textFieldImage3.setBounds(150, 730, 30, 30);
 	textFieldImage3.setForeground(Color.RED);
	textFieldImage3.setBackground(Color.WHITE);
 	panelButt.add(this.textFieldImage3);

	textFieldImage4 = new JTextField();
   	textFieldImage4.setHorizontalAlignment(0);
	textFieldImage4.setText("4");
	textFieldImage4.setBounds(180, 730, 30, 30);
 	textFieldImage4.setForeground(Color.RED);
	textFieldImage4.setBackground(Color.WHITE);
 	panelButt.add(this.textFieldImage4);
    ///////////////////////////////////////////////////////////////////Fillet    /////////////Filet
    this.panelFilet = new JPanel();
    this.panelFilet.setBackground(Color.WHITE);
    panelBottom.add(this.panelFilet, "name_300234215952300");
    this.panelFilet.setLayout((LayoutManager)null);
    this.lblFiletWeld = new JLabel("Fillet weld spesification");
    this.lblFiletWeld.setHorizontalAlignment(0);
    this.lblFiletWeld.setFont(new Font("Tahoma", 1, 15));
    this.lblFiletWeld.setBounds(10, 10, 293, 15);
    this.panelFilet.add(this.lblFiletWeld);
    JPanel panelButtBottomA = new JPanel();
    panelButtBottomA.setBackground(Color.WHITE);
    panelButtBottomA.setLayout((LayoutManager)null);
    panelButtBottomA.setBounds(20, 36, 276, 409);
    this.panelFilet.add(panelButtBottomA);
    JLabel lbFiletDesign = new JLabel("Choose fillet design:");
    lbFiletDesign.setFont(new Font("Tahoma", 1, 11));
    lbFiletDesign.setBounds(10, 15, 117, 14);
    panelButtBottomA.add(lbFiletDesign);
    final JComboBox<String> comboBoxFiletDesign = new JComboBox<String>();
    comboBoxFiletDesign.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intComboFilet = comboBoxFiletDesign.getSelectedIndex();
            Welding.this.textFieldGapFilet.setEditable(true);
            Welding.this.textFieldAngleFilet.setEditable(true);
            Welding.this.textFieldBottomaside.setEditable(true);
            Welding.this.textFieldTopaside.setEditable(true);
            Welding.this.textFieldTicknessBottomFilet.setEditable(true);
            Welding.this.textFieldTopFilet.setEditable(true);
            Welding.this.textFieldTopAngleFilet.setEditable(true);
            Welding.this.textFieldTopRadiusFilet.setEditable(true);
            Welding.this.textFieldBottomAngleFilet.setEditable(true);
            Welding.this.textFieldBottomRadiusFilet.setEditable(true);
            Welding.this.textFieldFaceFilet.setEditable(true);
            Welding.this.textFieldCenterFilet.setEditable(true);
            if (Welding.this.intComboFilet == 1) {
              Welding.this.textFieldTopAngleFilet.setEditable(false);
              Welding.this.textFieldTopRadiusFilet.setEditable(false);
              Welding.this.textFieldBottomAngleFilet.setEditable(false);
              Welding.this.textFieldBottomRadiusFilet.setEditable(false);
              Welding.this.textFieldFaceFilet.setEditable(false);
              Welding.this.textFieldCenterFilet.setEditable(false);
            } 
            if (Welding.this.intComboFilet == 2) {
              Welding.this.textFieldTopRadiusFilet.setEditable(false);
              Welding.this.textFieldBottomAngleFilet.setEditable(false);
              Welding.this.textFieldBottomRadiusFilet.setEditable(false);
              Welding.this.textFieldCenterFilet.setEditable(false);
            } 
            if (Welding.this.intComboFilet == 3) {
              Welding.this.textFieldTopRadiusFilet.setEditable(false);
              Welding.this.textFieldBottomRadiusFilet.setEditable(false);
            } 
            if (Welding.this.intComboFilet == 4) {
              Welding.this.textFieldBottomAngleFilet.setEditable(false);
              Welding.this.textFieldBottomRadiusFilet.setEditable(false);
              Welding.this.textFieldCenterFilet.setEditable(false);
            } 
          }
        });
    comboBoxFiletDesign.setModel(new DefaultComboBoxModel<>(new String[] { "", "I", "Y", "X", "U", "DU" }));
    comboBoxFiletDesign.setBounds(148, 7, 63, 22);
    panelButtBottomA.add(comboBoxFiletDesign);
    comboBoxFiletAngle =   new JComboBox<String>(); 
    comboBoxFiletAngle.setModel(new DefaultComboBoxModel<>(new String[] { "90", "80", "70", "60", "50" }));
    comboBoxFiletAngle.setBounds(137, 91, 86, 20);
    panelButtBottomA.add(comboBoxFiletAngle);
    
    comboBoxFiletAngle.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          intFilletAngleRoter = comboBoxFiletAngle.getSelectedIndex();
          if (intFilletAngleRoter == 0) {
            textFieldAngleFilet.setText("90");
            intAngleFilet = 90;
          } 
          if (intFilletAngleRoter == 1) {
            textFieldAngleFilet.setText("80");
            intAngleFilet = 0;
          } 
          if (intFilletAngleRoter == 2) {
            textFieldAngleFilet.setText("70");
            intAngleFilet = 70;
          } 
          if (intFilletAngleRoter == 3) {
            textFieldAngleFilet.setText("60");
            intAngleFilet = 60;
          } 
          if (intFilletAngleRoter == 4) {
            textFieldAngleFilet.setText("50");
            intAngleFilet = 50;
          }  
        }
      });
    
    JLabel lblGiveValuesForFilet = new JLabel("Give values for variables:");
    lblGiveValuesForFilet.setFont(new Font("Tahoma", 1, 13));
    lblGiveValuesForFilet.setBounds(10, 41, 262, 14);
    panelButtBottomA.add(lblGiveValuesForFilet);
    JLabel lblGapFilet = new JLabel("Gap");
    lblGapFilet.setFont(new Font("Tahoma", 1, 11));
    lblGapFilet.setBounds(33, 66, 46, 14);
    panelButtBottomA.add(lblGapFilet);
    JLabel lblAngleFilet = new JLabel("Angle");
    lblAngleFilet.setFont(new Font("Tahoma", 1, 11));
    lblAngleFilet.setBounds(33, 91, 46, 14);
    panelButtBottomA.add(lblAngleFilet);
    JLabel lblBottomasideA = new JLabel("Left a-side");
    lblBottomasideA.setFont(new Font("Tahoma", 1, 11));
    lblBottomasideA.setBounds(33, 116, 94, 14);
    panelButtBottomA.add(lblBottomasideA);
    JLabel lblTopaside = new JLabel("Right a-side");
    lblTopaside.setFont(new Font("Tahoma", 1, 11));
    lblTopaside.setBounds(33, 141, 76, 14);
    panelButtBottomA.add(lblTopaside);
    JLabel lblTicknessBottomFilet = new JLabel("Tickness bottom");
    lblTicknessBottomFilet.setFont(new Font("Tahoma", 1, 11));
    lblTicknessBottomFilet.setBounds(33, 166, 107, 14);
    panelButtBottomA.add(lblTicknessBottomFilet);
    JLabel lblTicknessTopFilet = new JLabel("Tickness Top");
    lblTicknessTopFilet.setFont(new Font("Tahoma", 1, 11));
    lblTicknessTopFilet.setBounds(33, 191, 94, 14);
    panelButtBottomA.add(lblTicknessTopFilet);
    JLabel lblTopAngleFilet = new JLabel("Top angle");
    lblTopAngleFilet.setFont(new Font("Tahoma", 1, 11));
    lblTopAngleFilet.setBounds(33, 216, 76, 14);
    panelButtBottomA.add(lblTopAngleFilet);
    JLabel lblTopRadiusFilet = new JLabel("Right radius");
    lblTopRadiusFilet.setFont(new Font("Tahoma", 1, 11));
    lblTopRadiusFilet.setBounds(33, 241, 76, 14);
    panelButtBottomA.add(lblTopRadiusFilet);
    JLabel lblBottomAngleFilet = new JLabel("Bottom angle");
    lblBottomAngleFilet.setFont(new Font("Tahoma", 1, 11));
    lblBottomAngleFilet.setBounds(33, 266, 94, 14);
    panelButtBottomA.add(lblBottomAngleFilet);
    JLabel lblBottomRadiusFilet = new JLabel("Left Radius");
    lblBottomRadiusFilet.setFont(new Font("Tahoma", 1, 11));
    lblBottomRadiusFilet.setBounds(33, 291, 94, 14);
    panelButtBottomA.add(lblBottomRadiusFilet);
    JLabel lblFaceFilet = new JLabel("Face");
    lblFaceFilet.setFont(new Font("Tahoma", 1, 11));
    lblFaceFilet.setBounds(33, 316, 46, 14);
    panelButtBottomA.add(lblFaceFilet);
    JLabel lblCenterFilet = new JLabel("Center");
    lblCenterFilet.setFont(new Font("Tahoma", 1, 11));
    lblCenterFilet.setBounds(33, 341, 46, 14);
    panelButtBottomA.add(lblCenterFilet);
    this.textFieldGapFilet = new JTextField();
    this.textFieldGapFilet.setText("0");
    this.textFieldGapFilet.setBackground(new Color(255, 255, 255));
    this.textFieldGapFilet.setHorizontalAlignment(0);
    this.textFieldGapFilet.setBounds(137, 66, 86, 20);
    panelButtBottomA.add(this.textFieldGapFilet);
    this.textFieldGapFilet.setColumns(10);
    this.textFieldAngleFilet = new JTextField();
    this.textFieldAngleFilet.setText("90");
    this.textFieldAngleFilet.setHorizontalAlignment(0);
    this.textFieldAngleFilet.setColumns(10);
    this.textFieldAngleFilet.setBounds(137, 91, 86, 20);
//    panelButtBottomA.add(this.textFieldAngleFilet);
    this.textFieldBottomaside = new JTextField();
    this.textFieldBottomaside.setText("0");
    this.textFieldBottomaside.setFont(new Font("Tahoma", 0, 11));
    this.textFieldBottomaside.setHorizontalAlignment(0);
    this.textFieldBottomaside.setBounds(137, 116, 86, 20);
    panelButtBottomA.add(this.textFieldBottomaside);
    this.textFieldBottomaside.setColumns(10);
    this.textFieldTopaside = new JTextField();
    this.textFieldTopaside.setText("0");
    this.textFieldTopaside.setFont(new Font("Tahoma", 0, 11));
    this.textFieldTopaside.setHorizontalAlignment(0);
    this.textFieldTopaside.setBounds(137, 141, 86, 20);
    panelButtBottomA.add(this.textFieldTopaside);
    this.textFieldTopaside.setColumns(10);
    this.textFieldTicknessBottomFilet = new JTextField();
    this.textFieldTicknessBottomFilet.setFont(new Font("Tahoma", 0, 11));
    this.textFieldTicknessBottomFilet.setHorizontalAlignment(0);
    this.textFieldTicknessBottomFilet.setText("10");
    this.textFieldTicknessBottomFilet.setBounds(137, 166, 86, 20);
    panelButtBottomA.add(this.textFieldTicknessBottomFilet);
    this.textFieldTicknessBottomFilet.setColumns(10);
    this.textFieldTopFilet = new JTextField();
    this.textFieldTopFilet.setText("40");
    this.textFieldTopFilet.setHorizontalAlignment(0);
    this.textFieldTopFilet.setColumns(10);
    this.textFieldTopFilet.setBounds(137, 191, 86, 20);
    panelButtBottomA.add(this.textFieldTopFilet);
    this.textFieldTopAngleFilet = new JTextField();
    this.textFieldTopAngleFilet.setText("30");
    this.textFieldTopAngleFilet.setHorizontalAlignment(0);
    this.textFieldTopAngleFilet.setColumns(10);
    this.textFieldTopAngleFilet.setBounds(137, 216, 86, 20);
    panelButtBottomA.add(this.textFieldTopAngleFilet);
    this.textFieldTopRadiusFilet = new JTextField();
    this.textFieldTopRadiusFilet.setText("5");
    this.textFieldTopRadiusFilet.setHorizontalAlignment(0);
    this.textFieldTopRadiusFilet.setColumns(10);
    this.textFieldTopRadiusFilet.setBounds(137, 241, 86, 20);
    panelButtBottomA.add(this.textFieldTopRadiusFilet);
    this.textFieldBottomAngleFilet = new JTextField();
    this.textFieldBottomAngleFilet.setText("25");
    this.textFieldBottomAngleFilet.setHorizontalAlignment(0);
    this.textFieldBottomAngleFilet.setColumns(10);
    this.textFieldBottomAngleFilet.setBounds(137, 266, 86, 20);
    panelButtBottomA.add(this.textFieldBottomAngleFilet);
    this.textFieldBottomRadiusFilet = new JTextField();
    this.textFieldBottomRadiusFilet.setToolTipText("");
    this.textFieldBottomRadiusFilet.setText("5");
    this.textFieldBottomRadiusFilet.setHorizontalAlignment(0);
    this.textFieldBottomRadiusFilet.setColumns(10);
    this.textFieldBottomRadiusFilet.setBounds(137, 291, 86, 20);
    panelButtBottomA.add(this.textFieldBottomRadiusFilet);
    this.textFieldFaceFilet = new JTextField();
    this.textFieldFaceFilet.setText("2");
    this.textFieldFaceFilet.setHorizontalAlignment(0);
    this.textFieldFaceFilet.setColumns(10);
    this.textFieldFaceFilet.setBounds(137, 316, 86, 20);
    panelButtBottomA.add(this.textFieldFaceFilet);
    this.textFieldCenterFilet = new JTextField();
    this.textFieldCenterFilet.setText("20");
    this.textFieldCenterFilet.setHorizontalAlignment(0);
    this.textFieldCenterFilet.setColumns(10);
    this.textFieldCenterFilet.setBounds(137, 341, 86, 20);
    panelButtBottomA.add(this.textFieldCenterFilet);
    this.btnGenerateFilet = new JButton("Generate drawing");
    this.btnGenerateFilet.setBackground(welditBlue);
    this.btnGenerateFilet.setForeground(Color.WHITE);
    this.btnGenerateFilet.setFont(new Font("Tahoma", 1, 11));
    this.btnGenerateFilet.setBounds(21, 379, 190, 23);
    panelButtBottomA.add(this.btnGenerateFilet);
    JLabel lblNewLabel_13 = new JLabel("Scaler %");
    lblNewLabel_13.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_13.setBounds(325, 44, 73, 20);
//   this.panelFilet.add(lblNewLabel_13);
    JLabel lblNewLabel_14 = new JLabel("Rotate");
    lblNewLabel_14.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_14.setBounds(325, 75, 46, 20);
//    this.panelFilet.add(lblNewLabel_14);
    this.textFieldFiletScaler = new JTextField();
    this.textFieldFiletScaler.setHorizontalAlignment(0);
    this.textFieldFiletScaler.setBackground(Color.WHITE);
    this.textFieldFiletScaler.setText("100");
    this.textFieldFiletScaler.setEditable(true);
    this.textFieldFiletScaler.setBounds(518, 44, 159, 20);
//    this.panelFilet.add(this.textFieldFiletScaler);
    this.textFieldFiletScaler.setColumns(10);
    this.textFieldFiletRotate = new JTextField();
    this.textFieldFiletRotate.setHorizontalAlignment(0);
    this.textFieldFiletRotate.setBackground(Color.WHITE);
    this.textFieldFiletRotate.setText("0");
    this.textFieldFiletRotate.setEditable(true);
    this.textFieldFiletRotate.setBounds(518, 75, 159, 20);
 //  this.panelFilet.add(this.textFieldFiletRotate);
    this.textFieldFiletRotate.setColumns(10);
    this.chckbxfilettext = new JCheckBox("With value  text on page");
    this.chckbxfilettext.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {}
        });
    this.chckbxfilettext.setBackground(Color.WHITE);
    this.chckbxfilettext.setFont(new Font("Tahoma", 1, 11));
    this.chckbxfilettext.setBounds(325, 128, 163, 23);
//    this.panelFilet.add(this.chckbxfilettext);
    this.chckbxfiletdrawing = new JCheckBox("With values on drawing");
    this.chckbxfiletdrawing.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {}
        });
    this.chckbxfiletdrawing.setBackground(Color.WHITE);
    this.chckbxfiletdrawing.setFont(new Font("Tahoma", 1, 11));
    this.chckbxfiletdrawing.setSelected(true);
    this.chckbxfiletdrawing.setBounds(326, 154, 162, 23);
    this.panelFilet.add(this.chckbxfiletdrawing);
    JLabel lblbuttspin_1 = new JLabel("Comments:");
    lblbuttspin_1.setFont(new Font("Tahoma", 1, 11));
    lblbuttspin_1.setBackground(Color.WHITE);
    lblbuttspin_1.setBounds(30, 457, 117, 14);
    this.panelFilet.add(lblbuttspin_1);
    
    scrollPane_fillet = new JScrollPane();
    scrollPane_fillet.setBounds(20, 471, 744, 51);
    panelFilet.add(this.scrollPane_fillet);
    this.textArea_Filet = new JTextArea();
    this.textArea_Filet.setWrapStyleWord(true);
    this.textArea_Filet.setBounds(20, 471, 744, 51);
 //   this.panelFilet.add(this.textArea_Filet);

    this.scrollPane_fillet.setViewportView(this.textArea_Filet);
  
    this.chckbx_image_butt_1_1 = new JCheckBox("Generate image on page");
    this.chckbx_image_butt_1_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {}
        });
    this.chckbx_image_butt_1_1.setSelected(true);
    this.chckbx_image_butt_1_1.setFont(new Font("Tahoma", 1, 11));
    this.chckbx_image_butt_1_1.setBackground(Color.WHITE);
    this.chckbx_image_butt_1_1.setBounds(325, 180, 197, 23);
//    this.panelFilet.add(this.chckbx_image_butt_1_1);
    JLabel lblNewLabel_41_1 = new JLabel("Path Name:");
    lblNewLabel_41_1.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_41_1.setBounds(325, 224, 76, 11);
 //   this.panelFilet.add(lblNewLabel_41_1);
    this.textField_Filet = new JTextField();
    this.textField_Filet.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {}
        });
    this.textField_Filet.setText(pathName);
    this.textField_Filet.setColumns(10);
    this.textField_Filet.setBackground(Color.WHITE);
    this.textField_Filet.setBounds(502, 219, 159, 20);
 //   this.panelFilet.add(this.textField_Filet);
    JLabel lblNewLabel_38_1 = new JLabel("File Name:");
    lblNewLabel_38_1.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_38_1.setBounds(325, 246, 70, 14);
//    this.panelFilet.add(lblNewLabel_38_1);
    this.textField_22 = new JTextField();
    this.textField_22.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.choosenName = Welding.this.textField_22.getText();
          }
        });
    this.textField_22.setColumns(10);
    this.textField_22.setBounds(502, 243, 159, 20);
//    this.panelFilet.add(this.textField_22);
    JLabel lblNewLabel_39_1 = new JLabel("File Extension:");
    lblNewLabel_39_1.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_39_1.setBounds(325, 271, 86, 20);
//    this.panelFilet.add(lblNewLabel_39_1);
    this.comboBox_type_butt_1 = new JComboBox<String>();
    this.comboBox_type_butt_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTypeFilet = Welding.this.comboBox_type_butt_1.getSelectedIndex();
          }
        });
    this.comboBox_type_butt_1.setModel(new DefaultComboBoxModel<>(new String[] { "png", "gif" }));
    this.comboBox_type_butt_1.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_type_butt_1.setBackground(Color.WHITE);
    this.comboBox_type_butt_1.setBounds(502, 274, 159, 22);
 //   this.panelFilet.add(this.comboBox_type_butt_1);
    JLabel lblNewLabel_40_1 = new JLabel("Screen size:");
    lblNewLabel_40_1.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_40_1.setBounds(325, 302, 86, 20);
 //   this.panelFilet.add(lblNewLabel_40_1);
    this.comboBox_size_butt_1 = new JComboBox<String>();
    this.comboBox_size_butt_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intSizeFilet = Welding.this.comboBox_size_butt_1.getSelectedIndex();
          }
        });
    this.comboBox_size_butt_1.setModel(new DefaultComboBoxModel<>(new String[] { "Standard size", "Full screen" }));
    this.comboBox_size_butt_1.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_size_butt_1.setBackground(Color.WHITE);
    this.comboBox_size_butt_1.setBounds(502, 307, 159, 22);
//    this.panelFilet.add(this.comboBox_size_butt_1);
    this.lblNewLabel_44 = new JLabel("Mouse move  enabled");
    this.lblNewLabel_44.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_44.setBounds(337, 379, 171, 14);
 //   this.panelFilet.add(this.lblNewLabel_44);
    this.comboBox_1_1 = new JComboBox<String>();
    this.comboBox_1_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intMouseFilet = Welding.this.comboBox_1_1.getSelectedIndex();
          }
        });
    this.comboBox_1_1.setBackground(Color.WHITE);
    this.comboBox_1_1.setModel(new DefaultComboBoxModel<>(new String[] { "", "String drawing", "String drawing with menu" }));
    this.comboBox_1_1.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_1_1.setBounds(518, 375, 159, 22);
//    this.panelFilet.add(this.comboBox_1_1);
    this.chckbxInstruction_1_1 = new JCheckBox("With comments on page");
    this.chckbxInstruction_1_1.setFont(new Font("Tahoma", 1, 11));
    this.chckbxInstruction_1_1.setBackground(Color.WHITE);
    this.chckbxInstruction_1_1.setBounds(325, 102, 163, 23);
//    this.panelFilet.add(this.chckbxInstruction_1_1);
    this.chckbxWeldString_1 = new JCheckBox("Max size for weldstring");
    this.chckbxWeldString_1.setFont(new Font("Tahoma", 1, 11));
    this.chckbxWeldString_1.setBackground(Color.WHITE);
    this.chckbxWeldString_1.setBounds(329, 345, 159, 23);
//    this.panelFilet.add(this.chckbxWeldString_1);
    this.lblfourA_1 = new JLabel("Number of pictures on same screen");
    this.lblfourA_1.setFont(new Font("Tahoma", 1, 14));
    this.lblfourA_1.setBounds(10, 533, 300, 20);
    this.panelFilet.add(this.lblfourA_1);
    
    this.rdbtnsingle2 = new JRadioButton("Single");
    this.rdbtnsingle2.setBackground(Color.WHITE);
    this.rdbtnsingle2.setSelected(true);
    this.rdbtnsingle2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnsingle2.isSelected()) {
     		    Welding.this.rdbtnfour1_1.setSelected(false);
              	Welding.this.rdbtnfour2_1.setSelected(false);
              	Welding.this.rdbtnfour3_1.setSelected(false);
              	Welding.this.rdbtnfour4_1.setSelected(false);
             	Welding.this.rdbtntwo1_1.setSelected(false);
              	Welding.this.rdbtntwo2_1.setSelected(false);
              	Welding.this.rdbtnhor1_1.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_1.setSelected(false);
                Welding.this.rdbtnfull2.setSelected(false);
            } 
          }
        });
    this.rdbtnsingle2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnsingle2.setBounds(600, 561, 109, 23);
    this.panelFilet.add(this.rdbtnsingle2);
    
    this.rdbtnfull2 = new JRadioButton("Entire screen");    // Entire screen
    this.rdbtnfull2.setBackground(Color.WHITE);
    Welding.this.rdbtnfull2.setSelected(false);
    this.rdbtnfull2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfull2.isSelected()) {
            	 Welding.this.rdbtnfour1_1.setSelected(false);
               	Welding.this.rdbtnfour2_1.setSelected(false);
               	Welding.this.rdbtnfour3_1.setSelected(false);
               	Welding.this.rdbtnfour4_1.setSelected(false);
              	Welding.this.rdbtntwo1_1.setSelected(false);
               	Welding.this.rdbtntwo2_1.setSelected(false);
               	Welding.this.rdbtnhor1_1.setSelected(false);
               	Welding.this.rdbtnNewRadioButton_1.setSelected(false);
                 Welding.this.rdbtnsingle2.setSelected(false);
            } 
          }
        });
    this.rdbtnfull2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfull2.setBounds(600, 587, 109, 23);
    this.panelFilet.add(this.rdbtnfull2);                    //
    
    
    this.rdbtnfour1_1 = new JRadioButton("Upper left");
    this.rdbtnfour1_1.setBackground(Color.WHITE);
    this.rdbtnfour1_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour1_1.isSelected()) {
              Welding.this.rdbtnfour2_1.setSelected(false);
              Welding.this.rdbtnfour3_1.setSelected(false);
              Welding.this.rdbtnfour4_1.setSelected(false);
              Welding.this.rdbtntwo1_1.setSelected(false);
              Welding.this.rdbtntwo2_1.setSelected(false);
              Welding.this.rdbtnNewRadioButton_1.setSelected(false);
              Welding.this.rdbtnhor1_1.setSelected(false);
              Welding.this.rdbtnsingle2.setSelected(false);
              Welding.this.rdbtnfull2.setSelected(false);
              upperLeft = true;
            } 
          }
        });
    this.rdbtnfour1_1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour1_1.setBounds(30, 562, 86, 23);
    this.panelFilet.add(this.rdbtnfour1_1);
    this.rdbtnfour3_1 = new JRadioButton("Lower left");
    this.rdbtnfour3_1.setBackground(Color.WHITE);
    this.rdbtnfour3_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour3_1.isSelected()) {
              Welding.this.rdbtnfour2_1.setSelected(false);
              Welding.this.rdbtnfour1_1.setSelected(false);
              Welding.this.rdbtnfour4_1.setSelected(false);
              Welding.this.rdbtntwo1_1.setSelected(false);
              Welding.this.rdbtntwo2_1.setSelected(false);
              Welding.this.rdbtnNewRadioButton_1.setSelected(false);
              Welding.this.rdbtnhor1_1.setSelected(false);
              Welding.this.rdbtnsingle2.setSelected(false);
              Welding.this.rdbtnfull2.setSelected(false);
              lowerLeft = true;
            } 
          }
        });
    this.rdbtnfour3_1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour3_1.setBounds(30, 588, 86, 23);
    this.panelFilet.add(this.rdbtnfour3_1);
    this.rdbtnfour2_1 = new JRadioButton("Upper right");
    this.rdbtnfour2_1.setBackground(Color.WHITE);
    this.rdbtnfour2_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour2_1.isSelected()) {
              Welding.this.rdbtnfour1_1.setSelected(false);
              Welding.this.rdbtnfour3_1.setSelected(false);
              Welding.this.rdbtnfour4_1.setSelected(false);
              Welding.this.rdbtntwo1_1.setSelected(false);
              Welding.this.rdbtntwo2_1.setSelected(false);
              Welding.this.rdbtnNewRadioButton_1.setSelected(false);
              Welding.this.rdbtnhor1_1.setSelected(false);
              Welding.this.rdbtnsingle2.setSelected(false);
              Welding.this.rdbtnfull2.setSelected(false);
              upperRight = true;
            } 
          }
        });
    this.rdbtnfour2_1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour2_1.setBounds(128, 562, 109, 23);
    this.panelFilet.add(this.rdbtnfour2_1);
    this.rdbtnfour4_1 = new JRadioButton("Lower right & finishing");
    this.rdbtnfour4_1.setBackground(Color.WHITE);
    this.rdbtnfour4_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour4_1.isSelected()) {
              Welding.this.rdbtnfour2_1.setSelected(false);
              Welding.this.rdbtnfour3_1.setSelected(false);
              Welding.this.rdbtnfour1_1.setSelected(false);
              Welding.this.rdbtntwo1_1.setSelected(false);
              Welding.this.rdbtntwo2_1.setSelected(false);
              Welding.this.rdbtnNewRadioButton_1.setSelected(false);
              Welding.this.rdbtnhor1_1.setSelected(false);
              Welding.this.rdbtnsingle2.setSelected(false);
              Welding.this.rdbtnfull2.setSelected(false);

      		upperLeft = false;
      		upperRight = false;
      		lowerLeft = false;
      		lowerRight = false;
            } 
          }
        });
    this.rdbtnfour4_1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour4_1.setBounds(128, 588, 151, 23);
    this.panelFilet.add(this.rdbtnfour4_1);
    this.rdbtntwo1_1 = new JRadioButton("Upper");
    this.rdbtntwo1_1.setBackground(Color.WHITE);
    this.rdbtntwo1_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo1_1.isSelected()) {
              Welding.this.rdbtnfour2_1.setSelected(false);
              Welding.this.rdbtnfour3_1.setSelected(false);
              Welding.this.rdbtnfour4_1.setSelected(false);
              Welding.this.rdbtnfour1_1.setSelected(false);
              Welding.this.rdbtntwo2_1.setSelected(false);
              Welding.this.rdbtnNewRadioButton_1.setSelected(false);
              Welding.this.rdbtnhor1_1.setSelected(false);
              Welding.this.rdbtnsingle2.setSelected(false);
              Welding.this.rdbtnfull2.setSelected(false);
      		upperLeft = true;
    		upperRight = true;
            } 
          }
        });
    this.rdbtntwo1_1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo1_1.setBounds(281, 562, 109, 23);
    this.panelFilet.add(this.rdbtntwo1_1);
    this.rdbtntwo2_1 = new JRadioButton("Lower & finishing");
    this.rdbtntwo2_1.setBackground(Color.WHITE);
    this.rdbtntwo2_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo2_1.isSelected()) {
              Welding.this.rdbtnfour2_1.setSelected(false);
              Welding.this.rdbtnfour3_1.setSelected(false);
              Welding.this.rdbtnfour4_1.setSelected(false);
              Welding.this.rdbtnfour1_1.setSelected(false);
              Welding.this.rdbtntwo1_1.setSelected(false);
              Welding.this.rdbtnNewRadioButton_1.setSelected(false);
              Welding.this.rdbtnhor1_1.setSelected(false);
              Welding.this.rdbtnsingle2.setSelected(false);
              Welding.this.rdbtnfull2.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtntwo2_1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo2_1.setBounds(281, 588, 167, 23);
    this.panelFilet.add(this.rdbtntwo2_1);
    this.btnfilesButton_1 = new JButton("Look at files");
    this.btnfilesButton_1.setBackground(welditBlue);
    this.btnfilesButton_1.setForeground(Color.WHITE);
    this.btnfilesButton_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTrans = 2;
            Welding.this.lookAtImages();
          }
        });
    this.btnfilesButton_1.setFont(new Font("Tahoma", 1, 11));
    this.btnfilesButton_1.setBounds(33, 630, 127, 28);    //  (604, 541, 127, 28)
    this.panelFilet.add(this.btnfilesButton_1);
    this.file1_1 = new JLabel("");
    this.file1_1.setBackground(Color.WHITE);
    this.file1_1.setBounds(10, 610, 750, 400);
    this.panelFilet.add(this.file1_1);
    

    this.btnNewButton_3 = new JButton("Picture under");
    this.btnNewButton_3.setBackground(welditBlue);
    this.btnNewButton_3.setForeground(Color.WHITE);
    this.btnNewButton_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.lookAtPicture();
          }
        });
    this.btnNewButton_3.setFont(new Font("Tahoma", 1, 11));
    this.btnNewButton_3.setBounds(604, 585, 127, 28);
//    this.panelFilet.add(this.btnNewButton_3);
    this.rdbtnhor1_1 = new JRadioButton("Left");
    this.rdbtnhor1_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnhor1_1.isSelected()) {
              Welding.this.rdbtnfour2_1.setSelected(false);
              Welding.this.rdbtnfour3_1.setSelected(false);
              Welding.this.rdbtnfour4_1.setSelected(false);
              Welding.this.rdbtnfour1_1.setSelected(false);
              Welding.this.rdbtntwo1_1.setSelected(false);
              Welding.this.rdbtntwo2_1.setSelected(false);
              Welding.this.rdbtnNewRadioButton_1.setSelected(false);
              Welding.this.rdbtnsingle2.setSelected(false);
              Welding.this.rdbtnfull2.setSelected(false);
      		upperLeft = true;
    		lowerLeft = true;
            } 
          }
        });
    this.rdbtnhor1_1.setBackground(Color.WHITE);
    this.rdbtnhor1_1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnhor1_1.setBounds(453, 562, 109, 23);
    this.panelFilet.add(this.rdbtnhor1_1);
    this.rdbtnNewRadioButton_1 = new JRadioButton("Right & finishing");
    this.rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnNewRadioButton_1.isSelected()) {
              Welding.this.rdbtnfour2_1.setSelected(false);
              Welding.this.rdbtnfour3_1.setSelected(false);
              Welding.this.rdbtnfour4_1.setSelected(false);
              Welding.this.rdbtnfour1_1.setSelected(false);
              Welding.this.rdbtntwo1_1.setSelected(false);
              Welding.this.rdbtntwo2_1.setSelected(false);
              Welding.this.rdbtnhor1_1.setSelected(false);
              Welding.this.rdbtnsingle2.setSelected(false);
              Welding.this.rdbtnfull2.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnNewRadioButton_1.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnNewRadioButton_1.setBackground(Color.WHITE);
    this.rdbtnNewRadioButton_1.setBounds(450, 588, 120, 23);
    this.panelFilet.add(this.rdbtnNewRadioButton_1);
    JEditorPane editorPane = new JEditorPane();
    editorPane.setBounds(87, 667, 107, 20);
    this.panelFilet.add(editorPane);
    JLabel lblNewLabel_63 = new JLabel("4 parts");
    lblNewLabel_63.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_63.setBounds(34, 551, 46, 14);
    this.panelFilet.add(lblNewLabel_63);
    JLabel lblNewLabel_64 = new JLabel("2 horisontal parts");
    lblNewLabel_64.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_64.setBounds(281, 548, 120, 14);
    this.panelFilet.add(lblNewLabel_64);
    JLabel lblNewLabel_65 = new JLabel("2 vertical parts");
    lblNewLabel_65.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_65.setBounds(453, 548, 100, 15);
    this.panelFilet.add(lblNewLabel_65);
    JLabel lblNewLabel_650 = new JLabel("1 picture");
    lblNewLabel_650.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_650.setBounds(595, 548, 100, 15);
    this.panelFilet.add(lblNewLabel_650);
    
	lblImageF0On = new JLabel("Indication of images in buffer");
	lblImageF0On.setFont(new Font("Tahoma", 1, 14));
	lblImageF0On.setBounds(50, 700, 400, 20);
	panelFilet.add(lblImageF0On);
textFieldImageF1 = new JTextField();
	textFieldImageF1.setHorizontalAlignment(0);
textFieldImageF1.setText("1");
textFieldImageF1.setBounds(150, 730, 30, 30);
	textFieldImageF1.setForeground(Color.RED);
textFieldImageF1.setBackground(Color.WHITE);
	panelFilet.add(this.textFieldImageF1);

textFieldImageF2 = new JTextField();
	textFieldImageF2.setHorizontalAlignment(0);
textFieldImageF2.setText("2");
textFieldImageF2.setBounds(180, 730, 30, 30);
	textFieldImageF2.setForeground(Color.RED);
textFieldImageF2.setBackground(Color.WHITE);
	panelFilet.add(this.textFieldImageF2);

textFieldImageF3 = new JTextField();
	textFieldImageF3.setHorizontalAlignment(0);
textFieldImageF3.setText("3");
textFieldImageF3.setBounds(150, 760, 30, 30);
	textFieldImageF3.setForeground(Color.RED);
textFieldImageF3.setBackground(Color.WHITE);
	panelFilet.add(this.textFieldImageF3);

textFieldImageF4 = new JTextField();
	textFieldImageF4.setHorizontalAlignment(0);
textFieldImageF4.setText("4");
textFieldImageF4.setBounds(180, 760, 30, 30);
	textFieldImageF4.setForeground(Color.RED);
textFieldImageF4.setBackground(Color.WHITE);
	panelFilet.add(this.textFieldImageF4);

    
    ////////////////////////////////////////////////////////Corner
    this.panelCorner = new JPanel();
    this.panelCorner.setBackground(Color.WHITE);
    panelBottom.add(this.panelCorner, "name_300255114463500");
    this.panelCorner.setLayout((LayoutManager)null);
    this.lblCornerWeld = new JLabel("Corner weld spesifikasjon");
    this.lblCornerWeld.setHorizontalAlignment(0);
    this.lblCornerWeld.setFont(new Font("Tahoma", 1, 15));
    this.lblCornerWeld.setBounds(10, 10, 382, 15);
    this.panelCorner.add(this.lblCornerWeld);
    this.lblAngleCorner = new JLabel("Angle");
    this.lblAngleCorner.setFont(new Font("Tahoma", 1, 11));
    this.lblAngleCorner.setBounds(10, 62, 46, 14);
    this.panelCorner.add(this.lblAngleCorner);
    this.lblPlate1Corner = new JLabel("Plate 1");
    this.lblPlate1Corner.setFont(new Font("Tahoma", 1, 11));
    this.lblPlate1Corner.setBounds(10, 97, 46, 14);
    this.panelCorner.add(this.lblPlate1Corner);
    this.lblTickness1Corner = new JLabel("Tickness");
    this.lblTickness1Corner.setFont(new Font("Tahoma", 1, 11));
    this.lblTickness1Corner.setBounds(10, 142, 71, 14);
    this.panelCorner.add(this.lblTickness1Corner);
    this.lblLeftAngleCorner = new JLabel("Left angle");
    this.lblLeftAngleCorner.setFont(new Font("Tahoma", 1, 11));
    this.lblLeftAngleCorner.setBounds(10, 167, 71, 14);
    this.panelCorner.add(this.lblLeftAngleCorner);
    this.lblDx1Corner = new JLabel("Dx");
    this.lblDx1Corner.setFont(new Font("Tahoma", 1, 11));
    this.lblDx1Corner.setBounds(10, 192, 46, 14);
    this.panelCorner.add(this.lblDx1Corner);
    this.lblPlate2Corner = new JLabel("Plate 2");
    this.lblPlate2Corner.setFont(new Font("Tahoma", 1, 11));
    this.lblPlate2Corner.setBounds(257, 97, 46, 14);
    this.panelCorner.add(this.lblPlate2Corner);
    this.lblTickness2Corner = new JLabel("Tickness");
    this.lblTickness2Corner.setFont(new Font("Tahoma", 1, 11));
    this.lblTickness2Corner.setBounds(257, 142, 78, 14);
    this.panelCorner.add(this.lblTickness2Corner);
    this.lblRightAngleCorner = new JLabel("Right angle");
    this.lblRightAngleCorner.setFont(new Font("Tahoma", 1, 11));
    this.lblRightAngleCorner.setBounds(257, 167, 78, 14);
    this.panelCorner.add(this.lblRightAngleCorner);
    this.lblDx2Corner = new JLabel("Dx");
    this.lblDx2Corner.setFont(new Font("Tahoma", 1, 11));
    this.lblDx2Corner.setBounds(257, 192, 46, 14);
    this.panelCorner.add(this.lblDx2Corner);
    this.textFieldAngleCorner = new JTextField();
    this.textFieldAngleCorner.setFont(new Font("Tahoma", 0, 11));
    this.textFieldAngleCorner.setHorizontalAlignment(0);
    this.textFieldAngleCorner.setText("90");
    this.textFieldAngleCorner.setBounds(101, 59, 86, 20);
    this.panelCorner.add(this.textFieldAngleCorner);
    this.textFieldAngleCorner.setColumns(10);
    this.textFieldTickness1Corner = new JTextField();
    this.textFieldTickness1Corner.setText("10");
    this.textFieldTickness1Corner.setHorizontalAlignment(0);
    this.textFieldTickness1Corner.setBounds(101, 142, 86, 20);
    this.panelCorner.add(this.textFieldTickness1Corner);
    this.textFieldTickness1Corner.setColumns(10);
    this.textFieldLeftAngleCorner = new JTextField();
    this.textFieldLeftAngleCorner.setText("0");
    this.textFieldLeftAngleCorner.setHorizontalAlignment(0);
    this.textFieldLeftAngleCorner.setBounds(101, 167, 86, 20);
    this.panelCorner.add(this.textFieldLeftAngleCorner);
    this.textFieldLeftAngleCorner.setColumns(10);
    this.textFieldDx1Corner = new JTextField();
    this.textFieldDx1Corner.setText("0");
    this.textFieldDx1Corner.setHorizontalAlignment(0);
    this.textFieldDx1Corner.setBounds(101, 192, 86, 20);
    this.panelCorner.add(this.textFieldDx1Corner);
    this.textFieldDx1Corner.setColumns(10);
    this.textFieldTickness2Corner = new JTextField();
    this.textFieldTickness2Corner.setText("10");
    this.textFieldTickness2Corner.setHorizontalAlignment(0);
    this.textFieldTickness2Corner.setBounds(354, 142, 86, 20);
    this.panelCorner.add(this.textFieldTickness2Corner);
    this.textFieldTickness2Corner.setColumns(10);
    this.textFieldRightAngleCorner = new JTextField();
    this.textFieldRightAngleCorner.setText("0");
    this.textFieldRightAngleCorner.setHorizontalAlignment(0);
    this.textFieldRightAngleCorner.setBounds(354, 167, 86, 20);
    this.panelCorner.add(this.textFieldRightAngleCorner);
    this.textFieldRightAngleCorner.setColumns(10);
    this.textFieldDx2Corner = new JTextField();
    this.textFieldDx2Corner.setText("0");
    this.textFieldDx2Corner.setHorizontalAlignment(0);
    this.textFieldDx2Corner.setBounds(354, 192, 86, 20);
    this.panelCorner.add(this.textFieldDx2Corner);
    this.textFieldDx2Corner.setColumns(10);
    this.btnGenerateCorner = new JButton("Generate drawing");
    this.btnGenerateCorner.setBackground(welditBlue);
    this.btnGenerateCorner.setForeground(Color.WHITE);
    this.btnGenerateCorner.setFont(new Font("Tahoma", 1, 11));
    this.btnGenerateCorner.setBounds(10, 300, 430, 23);
    this.panelCorner.add(this.btnGenerateCorner);
    JLabel lblNewLabel_11 = new JLabel("Scaler %");
    lblNewLabel_11.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_11.setBounds(482, 25, 71, 14);
//    this.panelCorner.add(lblNewLabel_11);
    JLabel lblNewLabel_12 = new JLabel("Rotate");
    lblNewLabel_12.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_12.setBounds(482, 50, 46, 14);
 //   this.panelCorner.add(lblNewLabel_12);
    this.textFieldCornerScaler = new JTextField();
    this.textFieldCornerScaler.setHorizontalAlignment(0);
    this.textFieldCornerScaler.setText("100");
    this.textFieldCornerScaler.setBounds(587, 22, 159, 20);
//    this.panelCorner.add(this.textFieldCornerScaler);
    this.textFieldCornerScaler.setColumns(10);
    this.textFieldCornerRotate = new JTextField();
    this.textFieldCornerRotate.setHorizontalAlignment(0);
    this.textFieldCornerRotate.setText("0");
    this.textFieldCornerRotate.setBounds(587, 47, 159, 20);
//    this.panelCorner.add(this.textFieldCornerRotate);
    this.textFieldCornerRotate.setColumns(10);
    this.chckbxcornertext = new JCheckBox("With data text on page");
    this.chckbxcornertext.setBackground(Color.WHITE);
    this.chckbxcornertext.setFont(new Font("Tahoma", 1, 11));
    this.chckbxcornertext.setBounds(482, 93, 171, 23);
//    this.panelCorner.add(this.chckbxcornertext);
    JScrollPane scrollPane_3 = new JScrollPane();
    scrollPane_3.setBounds(20, 359, 750, 60);
    this.panelCorner.add(scrollPane_3);
    this.textArea_Corner = new JTextArea();
    scrollPane_3.setViewportView(this.textArea_Corner);
    
    JLabel lblbuttspin_2 = new JLabel("Comments:");
    lblbuttspin_2.setHorizontalAlignment(11);
    lblbuttspin_2.setFont(new Font("Tahoma", 1, 11));
    lblbuttspin_2.setBackground(Color.WHITE);
    lblbuttspin_2.setBounds(10, 334, 117, 14);
    this.panelCorner.add(lblbuttspin_2);
    this.chckbx_image_butt_1_2 = new JCheckBox("Generate image on page");
    this.chckbx_image_butt_1_2.setSelected(true);
    this.chckbx_image_butt_1_2.setFont(new Font("Tahoma", 1, 11));
    this.chckbx_image_butt_1_2.setBackground(Color.WHITE);
    this.chckbx_image_butt_1_2.setBounds(482, 142, 191, 23);
 //   this.panelCorner.add(this.chckbx_image_butt_1_2);
    JLabel lblNewLabel_41_2 = new JLabel("Path Name:");
    lblNewLabel_41_2.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_41_2.setBounds(477, 194, 76, 11);
//    this.panelCorner.add(lblNewLabel_41_2);
    this.textField_18 = new JTextField();
    this.textField_18.setText(pathName);
    this.textField_18.setColumns(10);
    this.textField_18.setBackground(Color.WHITE);
    this.textField_18.setBounds(587, 189, 159, 20);
 //   this.panelCorner.add(this.textField_18);
    JLabel lblNewLabel_38_2 = new JLabel("File Name:");
    lblNewLabel_38_2.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_38_2.setBounds(482, 214, 70, 14);
//    this.panelCorner.add(lblNewLabel_38_2);
    this.chckbxcornerdrawing = new JCheckBox("With values on drawing");
    this.chckbxcornerdrawing.setSelected(true);
    this.chckbxcornerdrawing.setFont(new Font("Tahoma", 1, 11));
    this.chckbxcornerdrawing.setBackground(Color.WHITE);
    this.chckbxcornerdrawing.setBounds(482, 116, 162, 23);
    this.panelCorner.add(this.chckbxcornerdrawing);
    this.textField_23 = new JTextField();
    this.textField_23.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.choosenName = Welding.this.textField_23.getText();
          }
        });
    this.textField_23.setColumns(10);
    this.textField_23.setBounds(587, 211, 159, 20);
//    this.panelCorner.add(this.textField_23);
    JLabel lblNewLabel_39_2 = new JLabel("File Extension:");
    lblNewLabel_39_2.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_39_2.setBounds(482, 243, 86, 20);
 //   this.panelCorner.add(lblNewLabel_39_2);
    this.comboBox_type_butt_2 = new JComboBox<String>();
    this.comboBox_type_butt_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTypeCorner = Welding.this.comboBox_type_butt_2.getSelectedIndex();
          }
        });
    this.comboBox_type_butt_2.setModel(new DefaultComboBoxModel<>(new String[] { "png", "gif" }));
    this.comboBox_type_butt_2.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_type_butt_2.setBackground(Color.WHITE);
    this.comboBox_type_butt_2.setBounds(587, 242, 159, 22);
//    this.panelCorner.add(this.comboBox_type_butt_2);
    JLabel lblNewLabel_40_2 = new JLabel("Screen size:");
    lblNewLabel_40_2.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_40_2.setBounds(482, 276, 86, 20);
//    this.panelCorner.add(lblNewLabel_40_2);
    this.comboBox_size_butt_2 = new JComboBox<String>();
    this.comboBox_size_butt_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intSizeCorner = Welding.this.comboBox_size_butt_2.getSelectedIndex();
          }
        });
    this.comboBox_size_butt_2.setModel(new DefaultComboBoxModel<>(new String[] { "Standard size", "Full screen" }));
    this.comboBox_size_butt_2.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_size_butt_2.setBackground(Color.WHITE);
    this.comboBox_size_butt_2.setBounds(587, 275, 159, 22);
 //   this.panelCorner.add(this.comboBox_size_butt_2);
    this.lblNewLabel_45 = new JLabel("Mouse move enabled");
    this.lblNewLabel_45.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_45.setBounds(459, 334, 140, 15);
//    this.panelCorner.add(this.lblNewLabel_45);
    this.comboBox_1_2 = new JComboBox<String>();
    this.comboBox_1_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intMouseCorner = Welding.this.comboBox_1_2.getSelectedIndex();
          }
        });
    this.comboBox_1_2.setBackground(Color.WHITE);
    this.comboBox_1_2.setModel(new DefaultComboBoxModel<>(new String[] { "", "String drawing", "String drawing with menu" }));
    this.comboBox_1_2.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_1_2.setBounds(587, 326, 159, 22);
 //   this.panelCorner.add(this.comboBox_1_2);
    this.chckbxInstruction_1_2 = new JCheckBox("Witn comments on page");
    this.chckbxInstruction_1_2.setFont(new Font("Tahoma", 1, 11));
    this.chckbxInstruction_1_2.setBackground(Color.WHITE);
    this.chckbxInstruction_1_2.setBounds(482, 67, 163, 23);
//    this.panelCorner.add(this.chckbxInstruction_1_2);
    this.chckbxWeldString_2 = new JCheckBox("Max size for weldstring");
    this.chckbxWeldString_2.setFont(new Font("Tahoma", 1, 11));
    this.chckbxWeldString_2.setBackground(Color.WHITE);
    this.chckbxWeldString_2.setBounds(482, 304, 159, 23);
//    this.panelCorner.add(this.chckbxWeldString_2);
    this.lblfourA_2 = new JLabel("Number of pictures on same screen");
    this.lblfourA_2.setFont(new Font("Tahoma", 1, 14));
    this.lblfourA_2.setBounds(10, 444, 300, 20);
    this.panelCorner.add(this.lblfourA_2);
    

    this.rdbtnfull3 = new JRadioButton("Entire screen");    // Entire screen
    this.rdbtnfull3.setBackground(Color.WHITE);
    Welding.this.rdbtnfull3.setSelected(false);
    this.rdbtnfull3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfull3.isSelected()) {
     		    Welding.this.rdbtnfour1_2.setSelected(false);
              	Welding.this.rdbtnfour2_2.setSelected(false);
              	Welding.this.rdbtnfour3_2.setSelected(false);
              	Welding.this.rdbtnfour4_4.setSelected(false);
             	Welding.this.rdbtntwo1_2.setSelected(false);
              	Welding.this.rdbtntwo2_2.setSelected(false);
              	Welding.this.rdbtnhor1_2.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_2.setSelected(false);
              	Welding.this.rdbtnsingle3.setSelected(false);
            } 
          }
        });
    this.rdbtnfull3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfull3.setBounds(600, 509, 109, 23);
    this.panelCorner.add(this.rdbtnfull3);                    //
    
    this.rdbtnsingle3 = new JRadioButton("Single");
    this.rdbtnsingle3.setBackground(Color.WHITE);
    this.rdbtnsingle3.setSelected(true);
    this.rdbtnsingle3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnsingle3.isSelected()) {
     		    Welding.this.rdbtnfour1_2.setSelected(false);
              	Welding.this.rdbtnfour2_2.setSelected(false);
              	Welding.this.rdbtnfour3_2.setSelected(false);
              	Welding.this.rdbtnfour4_4.setSelected(false);
             	Welding.this.rdbtntwo1_2.setSelected(false);
              	Welding.this.rdbtntwo2_2.setSelected(false);
              	Welding.this.rdbtnhor1_2.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_2.setSelected(false);
                Welding.this.rdbtnfull3.setSelected(false);
            } 
          }
        });
    this.rdbtnsingle3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnsingle3.setBounds(600, 483, 109, 23);
    this.panelCorner.add(this.rdbtnsingle3);

    this.rdbtnfour1_2 = new JRadioButton("Upper left");
    this.rdbtnfour1_2.setBackground(Color.WHITE);
    this.rdbtnfour1_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour1_2.isSelected()) {
              Welding.this.rdbtnfour2_2.setSelected(false);
              Welding.this.rdbtnfour3_2.setSelected(false);
              Welding.this.rdbtnfour4_2.setSelected(false);
              Welding.this.rdbtntwo1_2.setSelected(false);
              Welding.this.rdbtntwo2_2.setSelected(false);
              Welding.this.rdbtnNewRadioButton_2.setSelected(false);
              Welding.this.rdbtnhor1_2.setSelected(false);
              Welding.this.rdbtnsingle3.setSelected(false);
              Welding.this.rdbtnfull3.setSelected(false);
      		upperLeft = true;
            } 
          }
        });
    this.rdbtnfour1_2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour1_2.setBounds(6, 483, 93, 23);
    this.panelCorner.add(this.rdbtnfour1_2);
    this.rdbtnfour3_2 = new JRadioButton("Lower left");
    this.rdbtnfour3_2.setBackground(Color.WHITE);
    this.rdbtnfour3_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour3_2.isSelected()) {
              Welding.this.rdbtnfour2_2.setSelected(false);
              Welding.this.rdbtnfour1_2.setSelected(false);
              Welding.this.rdbtnfour4_2.setSelected(false);
              Welding.this.rdbtntwo1_2.setSelected(false);
              Welding.this.rdbtntwo2_2.setSelected(false);
              Welding.this.rdbtnNewRadioButton_2.setSelected(false);
              Welding.this.rdbtnhor1_2.setSelected(false);
              Welding.this.rdbtnsingle3.setSelected(false);
              Welding.this.rdbtnfull3.setSelected(false);
      		lowerLeft = true;
            } 
          }
        });
    this.rdbtnfour3_2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour3_2.setBounds(10, 509, 89, 23);
    this.panelCorner.add(this.rdbtnfour3_2);
    this.rdbtnfour2_2 = new JRadioButton("Upper right");
    this.rdbtnfour2_2.setBackground(Color.WHITE);
    this.rdbtnfour2_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour2_2.isSelected()) {
              Welding.this.rdbtnfour1_2.setSelected(false);
              Welding.this.rdbtnfour3_2.setSelected(false);
              Welding.this.rdbtnfour4_2.setSelected(false);
              Welding.this.rdbtntwo1_2.setSelected(false);
              Welding.this.rdbtntwo2_2.setSelected(false);
              Welding.this.rdbtnNewRadioButton_2.setSelected(false);
              Welding.this.rdbtnhor1_2.setSelected(false);
              Welding.this.rdbtnsingle3.setSelected(false);
              Welding.this.rdbtnfull3.setSelected(false);
      		upperRight = true;
            } 
          }
        });
    this.rdbtnfour2_2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour2_2.setBounds(101, 483, 109, 23);
    this.panelCorner.add(this.rdbtnfour2_2);
    this.rdbtnfour4_2 = new JRadioButton("Lower right & finishing");
    this.rdbtnfour4_2.setBackground(Color.WHITE);
    this.rdbtnfour4_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour4_2.isSelected()) {
              Welding.this.rdbtnfour2_2.setSelected(false);
              Welding.this.rdbtnfour3_2.setSelected(false);
              Welding.this.rdbtnfour1_2.setSelected(false);
              Welding.this.rdbtntwo1_2.setSelected(false);
              Welding.this.rdbtntwo2_2.setSelected(false);
              Welding.this.rdbtnNewRadioButton_2.setSelected(false);
              Welding.this.rdbtnhor1_2.setSelected(false);
              Welding.this.rdbtnsingle3.setSelected(false);
              Welding.this.rdbtnfull3.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnfour4_2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour4_2.setBounds(101, 509, 180, 23);
    this.panelCorner.add(this.rdbtnfour4_2);
    this.lblfourB_2 = new JLabel("");
    this.lblfourB_2.setFont(new Font("Tahoma", 1, 14));
    this.lblfourB_2.setBounds(275, 444, 253, 14);
    this.panelCorner.add(this.lblfourB_2);
    this.rdbtntwo1_2 = new JRadioButton("Upper");
    this.rdbtntwo1_2.setBackground(Color.WHITE);
    this.rdbtntwo1_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo1_2.isSelected()) {
              Welding.this.rdbtnfour2_2.setSelected(false);
              Welding.this.rdbtnfour3_2.setSelected(false);
              Welding.this.rdbtnfour4_2.setSelected(false);
              Welding.this.rdbtnfour1_2.setSelected(false);
              Welding.this.rdbtntwo2_2.setSelected(false);
              Welding.this.rdbtnNewRadioButton_2.setSelected(false);
              Welding.this.rdbtnhor1_2.setSelected(false);
              Welding.this.rdbtnsingle3.setSelected(false);
              Welding.this.rdbtnfull3.setSelected(false);
      		upperLeft = true;
    		upperRight = true;
            } 
          }
        });
    this.rdbtntwo1_2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo1_2.setBounds(283, 483, 109, 23);
    this.panelCorner.add(this.rdbtntwo1_2);
    this.rdbtntwo2_2 = new JRadioButton("Lower & finishing");
    this.rdbtntwo2_2.setBackground(Color.WHITE);
    this.rdbtntwo2_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo2_2.isSelected()) {
              Welding.this.rdbtnfour2_2.setSelected(false);
              Welding.this.rdbtnfour3_2.setSelected(false);
              Welding.this.rdbtnfour4_2.setSelected(false);
              Welding.this.rdbtnfour1_2.setSelected(false);
              Welding.this.rdbtntwo1_2.setSelected(false);
              Welding.this.rdbtnNewRadioButton_2.setSelected(false);
              Welding.this.rdbtnhor1_2.setSelected(false);
              Welding.this.rdbtnsingle3.setSelected(false);
              Welding.this.rdbtnfull3.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtntwo2_2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo2_2.setBounds(283, 509, 140, 23);
    this.panelCorner.add(this.rdbtntwo2_2);
    this.btnfilesButton_2 = new JButton("Look at images");
    this.btnfilesButton_2.setBackground(welditBlue);
    this.btnfilesButton_2.setForeground(Color.WHITE);
    this.btnfilesButton_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTrans = 2;
            Welding.this.lookAtImages();
          }
        });
    this.btnfilesButton_2.setFont(new Font("Tahoma", 1, 11));
    this.btnfilesButton_2.setBounds(33, 535, 127, 28);   //  (587, 444, 127, 28)
    this.panelCorner.add(this.btnfilesButton_2);
    this.file1_2 = new JLabel("");
    this.file1_2.setBounds(10, 6101, 750, 400);
    this.panelCorner.add(this.file1_2);
    this.btnNewButton_4 = new JButton("Picture under");
    this.btnNewButton_4.setBackground(welditBlue);
    this.btnNewButton_4.setForeground(Color.WHITE);
    this.btnNewButton_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.lookAtPicture();
          }
        });
    this.btnNewButton_4.setFont(new Font("Tahoma", 1, 11));
    this.btnNewButton_4.setBounds(587, 483, 127, 28);
 //   this.panelCorner.add(this.btnNewButton_4);
    JLabel file1_1_1 = new JLabel("");
    file1_1_1.setBackground(Color.WHITE);
    file1_1_1.setBounds(-4, 530, 750, 400);
    this.panelCorner.add(file1_1_1);
    this.rdbtnhor1_2 = new JRadioButton("Left");
    this.rdbtnhor1_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnhor1_2.isSelected()) {
              Welding.this.rdbtnfour2_2.setSelected(false);
              Welding.this.rdbtnfour3_2.setSelected(false);
              Welding.this.rdbtnfour4_2.setSelected(false);
              Welding.this.rdbtnfour1_2.setSelected(false);
              Welding.this.rdbtntwo1_2.setSelected(false);
              Welding.this.rdbtntwo2_2.setSelected(false);
              Welding.this.rdbtnNewRadioButton_2.setSelected(false);
              Welding.this.rdbtnsingle3.setSelected(false);
              Welding.this.rdbtnfull3.setSelected(false);
      		upperLeft = true;
    		lowerLeft = true;
            } 
          }
        });
    this.rdbtnhor1_2.setBackground(Color.WHITE);
    this.rdbtnhor1_2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnhor1_2.setBounds(444, 483, 109, 23);
    this.panelCorner.add(this.rdbtnhor1_2);
    this.rdbtnNewRadioButton_2 = new JRadioButton("Right & finishing");
    this.rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnNewRadioButton_2.isSelected()) {
              Welding.this.rdbtnfour2_2.setSelected(false);
              Welding.this.rdbtnfour3_2.setSelected(false);
              Welding.this.rdbtnfour4_2.setSelected(false);
              Welding.this.rdbtnfour1_2.setSelected(false);
              Welding.this.rdbtntwo1_2.setSelected(false);
              Welding.this.rdbtntwo2_2.setSelected(false);
              Welding.this.rdbtnhor1_2.setSelected(false);
              Welding.this.rdbtnsingle3.setSelected(false);
              Welding.this.rdbtnfull3.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnNewRadioButton_2.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnNewRadioButton_2.setBackground(Color.WHITE);
    this.rdbtnNewRadioButton_2.setBounds(444, 509, 120, 23);
    this.panelCorner.add(this.rdbtnNewRadioButton_2);
    JLabel lblNewLabel_60 = new JLabel("4 parts");
    lblNewLabel_60.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_60.setBounds(10, 469, 46, 14);
    this.panelCorner.add(lblNewLabel_60);
    JLabel lblNewLabel_61 = new JLabel("2 horisotal parts");
    lblNewLabel_61.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_61.setBounds(285, 462, 107, 14);
    this.panelCorner.add(lblNewLabel_61);
    JLabel lblNewLabel_62 = new JLabel("2 vertical parts");
    lblNewLabel_62.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_62.setBounds(444, 469, 109, 14);
    this.panelCorner.add(lblNewLabel_62);
    JLabel lblNewLabel_620 = new JLabel("1 picture");
    lblNewLabel_620.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_620.setBounds(595, 469, 109, 14);
    this.panelCorner.add(lblNewLabel_620);
    
	lblImageC0On = new JLabel("Indication of images in buffer");
	lblImageC0On.setFont(new Font("Tahoma", 1, 14));
	lblImageC0On.setBounds(50, 670, 400, 20);
	panelCorner.add(lblImageC0On);
textFieldImageC1 = new JTextField();
	textFieldImageC1.setHorizontalAlignment(0);
textFieldImageC1.setText("1");
textFieldImageC1.setBounds(150, 700, 30, 30);
	textFieldImageC1.setForeground(Color.RED);
textFieldImageC1.setBackground(Color.WHITE);
	panelCorner.add(this.textFieldImageC1);

textFieldImageC2 = new JTextField();
	textFieldImageC2.setHorizontalAlignment(0);
textFieldImageC2.setText("2");
textFieldImageC2.setBounds(180, 700, 30, 30);
	textFieldImageC2.setForeground(Color.RED);
textFieldImageC2.setBackground(Color.WHITE);
	panelCorner.add(this.textFieldImageC2);

textFieldImageC3 = new JTextField();
	textFieldImageC3.setHorizontalAlignment(0);
textFieldImageC3.setText("3");
textFieldImageC3.setBounds(150, 730, 30, 30);
	textFieldImageC3.setForeground(Color.RED);
textFieldImageC3.setBackground(Color.WHITE);
	panelCorner.add(this.textFieldImageC3);

textFieldImageC4 = new JTextField();
	textFieldImageC4.setHorizontalAlignment(0);
textFieldImageC4.setText("4");
textFieldImageC4.setBounds(180, 730, 30, 30);
	textFieldImageC4.setForeground(Color.RED);
textFieldImageC4.setBackground(Color.WHITE);
	panelCorner.add(this.textFieldImageC4);
 //  System.out.println( upperLeft); 
	if(upperLeft) {
		textFieldImageC1.setBackground(Color.GRAY);
	} else {
	textFieldImageC1.setBackground(Color.WHITE);
}
	if(upperRight) {
		textFieldImageC2.setBackground(Color.GRAY);
	        		} else {
	textFieldImageC2.setBackground(Color.WHITE);
}
	if(lowerLeft) {
		textFieldImageC3.setBackground(Color.GRAY);
	        		} else {
	textFieldImageC3.setBackground(Color.WHITE);
}
	if(lowerRight) {
		textFieldImageC4.setBackground(Color.GRAY);
	        		} else {
	textFieldImageC4.setBackground(Color.WHITE);
}
    ///////////////////////////////////////////Overlap
    this.panelOverlap = new JPanel();
    this.panelOverlap.setBackground(Color.WHITE);
    panelBottom.add(this.panelOverlap, "name_300277616453500");
    this.panelOverlap.setLayout((LayoutManager)null);
    this.lblOverlapWeld = new JLabel("Overlap weld spesifikasjoner");
    this.lblOverlapWeld.setHorizontalAlignment(0);
    this.lblOverlapWeld.setFont(new Font("Tahoma", 1, 15));
    this.lblOverlapWeld.setBounds(10, 10, 454, 15);
    this.panelOverlap.add(this.lblOverlapWeld);
    this.lblGapOverlap = new JLabel("Gap");
    this.lblGapOverlap.setFont(new Font("Tahoma", 1, 11));
    this.lblGapOverlap.setHorizontalAlignment(0);
    this.lblGapOverlap.setBounds(23, 68, 46, 14);
    this.panelOverlap.add(this.lblGapOverlap);
    this.lblPlate1Overlap = new JLabel("Plate 1");
    this.lblPlate1Overlap.setFont(new Font("Tahoma", 1, 11));
    this.lblPlate1Overlap.setBounds(10, 115, 46, 14);
    this.panelOverlap.add(this.lblPlate1Overlap);
    this.lblTickness1Overlap = new JLabel("Tickness");
    this.lblTickness1Overlap.setFont(new Font("Tahoma", 1, 11));
    this.lblTickness1Overlap.setBounds(23, 140, 88, 14);
    this.panelOverlap.add(this.lblTickness1Overlap);
    this.lblPlate2Overlap = new JLabel("Plate 2");
    this.lblPlate2Overlap.setFont(new Font("Tahoma", 1, 11));
    this.lblPlate2Overlap.setBounds(284, 115, 46, 14);
    this.panelOverlap.add(this.lblPlate2Overlap);
    this.lblTickness2Overlap = new JLabel("Tickness");
    this.lblTickness2Overlap.setFont(new Font("Tahoma", 1, 11));
    this.lblTickness2Overlap.setBounds(294, 140, 63, 15);
    this.panelOverlap.add(this.lblTickness2Overlap);
    this.textFieldGapOverlap = new JTextField();
    this.textFieldGapOverlap.setHorizontalAlignment(0);
    this.textFieldGapOverlap.setText("0");
    this.textFieldGapOverlap.setBounds(121, 65, 86, 20);
    this.panelOverlap.add(this.textFieldGapOverlap);
    this.textFieldGapOverlap.setColumns(10);
    this.textFieldTickness1Overlap = new JTextField();
    this.textFieldTickness1Overlap.setText("10");
    this.textFieldTickness1Overlap.setHorizontalAlignment(0);
    this.textFieldTickness1Overlap.setBounds(121, 137, 86, 20);
    this.panelOverlap.add(this.textFieldTickness1Overlap);
    this.textFieldTickness1Overlap.setColumns(10);
    this.textFieldTickness2Overlap = new JTextField();
    this.textFieldTickness2Overlap.setText("10");
    this.textFieldTickness2Overlap.setHorizontalAlignment(0);
    this.textFieldTickness2Overlap.setBounds(367, 134, 86, 20);
    this.panelOverlap.add(this.textFieldTickness2Overlap);
    this.textFieldTickness2Overlap.setColumns(10);
    this.btnNGenerateOverlap = new JButton("Generate drawing");
    this.btnNGenerateOverlap.setBackground(welditBlue);
    this.btnNGenerateOverlap.setForeground(Color.WHITE);
    this.btnNGenerateOverlap.setFont(new Font("Tahoma", 1, 11));
    this.btnNGenerateOverlap.setBounds(136, 289, 317, 23);
    this.panelOverlap.add(this.btnNGenerateOverlap);
    JLabel lblNewLabel_9 = new JLabel("Scaler %");
    lblNewLabel_9.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_9.setBounds(491, 32, 75, 14);
 //   this.panelOverlap.add(lblNewLabel_9);
    JLabel lblNewLabel_10 = new JLabel("Roter");
    lblNewLabel_10.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_10.setBounds(491, 57, 46, 14);
 //   this.panelOverlap.add(lblNewLabel_10);
    this.textFieldOverlapScaler = new JTextField();
    this.textFieldOverlapScaler.setText("100");
    this.textFieldOverlapScaler.setBounds(583, 29, 86, 20);
 //   this.panelOverlap.add(this.textFieldOverlapScaler);
    this.textFieldOverlapScaler.setColumns(10);
    this.textFieldOverlapRotate = new JTextField();
    this.textFieldOverlapRotate.setText("0");
    this.textFieldOverlapRotate.setBounds(583, 54, 86, 20);
 //   this.panelOverlap.add(this.textFieldOverlapRotate);
    this.textFieldOverlapRotate.setColumns(10);
    this.chckbxoverlaptext = new JCheckBox("With data text on page");
    this.chckbxoverlaptext.setFont(new Font("Tahoma", 1, 11));
    this.chckbxoverlaptext.setBackground(Color.WHITE);
    this.chckbxoverlaptext.setBounds(491, 111, 178, 23);
//    this.panelOverlap.add(this.chckbxoverlaptext);
    this.chckbxoverlapdrawing = new JCheckBox("With values on drawing");
    this.chckbxoverlapdrawing.setSelected(true);
    this.chckbxoverlapdrawing.setFont(new Font("Tahoma", 1, 11));
    this.chckbxoverlapdrawing.setBackground(Color.WHITE);
    this.chckbxoverlapdrawing.setBounds(491, 131, 178, 23);
    this.panelOverlap.add(this.chckbxoverlapdrawing);
    JScrollPane scrollPane_4 = new JScrollPane();
    scrollPane_4.setBounds(20, 359, 750, 60);
    this.panelOverlap.add(scrollPane_4);
    this.textArea_Overlap = new JTextArea();
    scrollPane_4.setViewportView(this.textArea_Overlap);
    JLabel lblbuttspin_3 = new JLabel("Comments:");
    lblbuttspin_3.setFont(new Font("Tahoma", 1, 11));
    lblbuttspin_3.setBackground(Color.WHITE);
    lblbuttspin_3.setBounds(10, 334, 117, 14);
    this.panelOverlap.add(lblbuttspin_3);
    this.chckbx_image_butt_1_3 = new JCheckBox("Generate image on page");
    this.chckbx_image_butt_1_3.setSelected(true);
    this.chckbx_image_butt_1_3.setFont(new Font("Tahoma", 1, 11));
    this.chckbx_image_butt_1_3.setBackground(Color.WHITE);
    this.chckbx_image_butt_1_3.setBounds(491, 152, 194, 23);
 //   this.panelOverlap.add(this.chckbx_image_butt_1_3);
    JLabel lblNewLabel_41_3 = new JLabel("Path Name:");
    lblNewLabel_41_3.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_41_3.setBounds(491, 182, 76, 20);
//   this.panelOverlap.add(lblNewLabel_41_3);
    this.textField_19 = new JTextField();
    this.textField_19.setText(pathName);
    this.textField_19.setColumns(10);
    this.textField_19.setBackground(Color.WHITE);
    this.textField_19.setBounds(583, 182, 159, 20);
 //   this.panelOverlap.add(this.textField_19);
    JLabel lblNewLabel_38_2_1 = new JLabel("File Name:");
    lblNewLabel_38_2_1.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_38_2_1.setBounds(491, 219, 70, 14);
//    this.panelOverlap.add(lblNewLabel_38_2_1);
    this.textField_24 = new JTextField();
    this.textField_24.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.choosenName = Welding.this.textField_24.getText();
          }
        });
    this.textField_24.setColumns(10);
    this.textField_24.setBounds(583, 213, 159, 20);
 //   this.panelOverlap.add(this.textField_24);
    JLabel lblNewLabel_39_3 = new JLabel("File Extension:");
    lblNewLabel_39_3.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_39_3.setBounds(491, 245, 86, 20);
 //   this.panelOverlap.add(lblNewLabel_39_3);
    this.comboBox_type_butt_2_1 = new JComboBox<String>();
    this.comboBox_type_butt_2_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTypeOverlap = Welding.this.comboBox_type_butt_2_1.getSelectedIndex();
          }
        });
    this.comboBox_type_butt_2_1.setModel(new DefaultComboBoxModel<>(new String[] { "png", "gif" }));
    this.comboBox_type_butt_2_1.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_type_butt_2_1.setBackground(Color.WHITE);
    this.comboBox_type_butt_2_1.setBounds(583, 244, 159, 22);
//    this.panelOverlap.add(this.comboBox_type_butt_2_1);
    JLabel lblNewLabel_40_3 = new JLabel("Screen size:");
    lblNewLabel_40_3.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_40_3.setBounds(491, 278, 86, 20);
 //   this.panelOverlap.add(lblNewLabel_40_3);
    this.comboBox_size_butt_3 = new JComboBox<String>();
    this.comboBox_size_butt_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intSizeOverlap = Welding.this.comboBox_size_butt_3.getSelectedIndex();
          }
        });
    this.comboBox_size_butt_3.setModel(new DefaultComboBoxModel<>(new String[] { "Standard size", "Full screen" }));
    this.comboBox_size_butt_3.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_size_butt_3.setBackground(Color.WHITE);
    this.comboBox_size_butt_3.setBounds(583, 277, 159, 22);
 //   this.panelOverlap.add(this.comboBox_size_butt_3);
    this.lblNewLabel_46 = new JLabel("Mouse move enabled");
    this.lblNewLabel_46.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_46.setBounds(449, 334, 127, 14);
//    this.panelOverlap.add(this.lblNewLabel_46);
    this.comboBox_1_3 = new JComboBox<String>();
    this.comboBox_1_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intMouseOverlap = Welding.this.comboBox_1_3.getSelectedIndex();
          }
        });
    this.comboBox_1_3.setBackground(Color.WHITE);
    this.comboBox_1_3.setModel(new DefaultComboBoxModel<>(new String[] { "", "String drawing", "String drawing with menu" }));
    this.comboBox_1_3.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_1_3.setBounds(583, 326, 159, 22);
//    this.panelOverlap.add(this.comboBox_1_3);
    this.chckbxInstruction_1_3 = new JCheckBox("Witn comments on page");
    this.chckbxInstruction_1_3.setFont(new Font("Tahoma", 1, 11));
    this.chckbxInstruction_1_3.setBackground(Color.WHITE);
    this.chckbxInstruction_1_3.setBounds(491, 85, 163, 23);
//    this.panelOverlap.add(this.chckbxInstruction_1_3);
    this.chckbxWeldString_3 = new JCheckBox("Max size for weldstring");
    this.chckbxWeldString_3.setFont(new Font("Tahoma", 1, 11));
    this.chckbxWeldString_3.setBackground(Color.WHITE);
    this.chckbxWeldString_3.setBounds(491, 304, 159, 23);
//   this.panelOverlap.add(this.chckbxWeldString_3);
    this.lblfourA_3 = new JLabel("Number of pictures on same screen");
    this.lblfourA_3.setFont(new Font("Tahoma", 1, 14));
    this.lblfourA_3.setBounds(10, 444, 300, 20);
    this.panelOverlap.add(this.lblfourA_3);
    this.rdbtnfull4 = new JRadioButton("Entire screen");    // Entire screen
    this.rdbtnfull4.setBackground(Color.WHITE);
    Welding.this.rdbtnfull4.setSelected(false);
    this.rdbtnfull4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfull4.isSelected()) {
              	Welding.this.rdbtnfour2_3.setSelected(false);
              	Welding.this.rdbtnfour3_3.setSelected(false);
              	Welding.this.rdbtnfour4_3.setSelected(false);
             	Welding.this.rdbtntwo1_3.setSelected(false);
              	Welding.this.rdbtntwo2_3.setSelected(false);
              	Welding.this.rdbtnhor1_3.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_3.setSelected(false);
              	Welding.this.rdbtnsingle4.setSelected(false);
            } 
          }
        });
    this.rdbtnfull4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfull4.setBounds(600, 504, 109, 23);
    this.panelOverlap.add(this.rdbtnfull4);                    //
    
    this.rdbtnsingle4 = new JRadioButton("Single");
    this.rdbtnsingle4.setBackground(Color.WHITE);
    this.rdbtnsingle4.setSelected(true);
    this.rdbtnsingle4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnsingle4.isSelected()) {
     		Welding.this.rdbtnfour1_3.setSelected(false);
              	Welding.this.rdbtnfour2_3.setSelected(false);
              	Welding.this.rdbtnfour3_3.setSelected(false);
              	Welding.this.rdbtnfour4_3.setSelected(false);
             	Welding.this.rdbtntwo1_3.setSelected(false);
              	Welding.this.rdbtntwo2_3.setSelected(false);
              	Welding.this.rdbtnhor1_3.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_3.setSelected(false);
                Welding.this.rdbtnfull4.setSelected(false);
            } 
          }
        });
    this.rdbtnsingle4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnsingle4.setBounds(600, 478, 109, 23);
    this.panelOverlap.add(this.rdbtnsingle4);

    
    this.rdbtnfour1_3 = new JRadioButton("Upper left");
    this.rdbtnfour1_3.setBackground(Color.WHITE);
    this.rdbtnfour1_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour1_3.isSelected()) {
              Welding.this.rdbtnfour2_3.setSelected(false);
              Welding.this.rdbtnfour3_3.setSelected(false);
              Welding.this.rdbtnfour4_3.setSelected(false);
              Welding.this.rdbtntwo1_3.setSelected(false);
              Welding.this.rdbtntwo2_3.setSelected(false);
              Welding.this.rdbtnhor1_3.setSelected(false);
              Welding.this.rdbtnNewRadioButton_3.setSelected(false);
              Welding.this.rdbtnsingle4.setSelected(false);
              Welding.this.rdbtnfull4.setSelected(false);
              upperLeft = true;
            } 
          }
        });
    this.rdbtnfour1_3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour1_3.setBounds(10, 478, 88, 23);
    this.panelOverlap.add(this.rdbtnfour1_3);
    this.rdbtnfour3_3 = new JRadioButton("Lower left");
    this.rdbtnfour3_3.setBackground(Color.WHITE);
    this.rdbtnfour3_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour3_3.isSelected()) {
              Welding.this.rdbtnfour2_3.setSelected(false);
              Welding.this.rdbtnfour1_3.setSelected(false);
              Welding.this.rdbtnfour4_3.setSelected(false);
              Welding.this.rdbtntwo1_3.setSelected(false);
              Welding.this.rdbtntwo2_3.setSelected(false);
              Welding.this.rdbtnhor1_3.setSelected(false);
              Welding.this.rdbtnNewRadioButton_3.setSelected(false);
              Welding.this.rdbtnsingle4.setSelected(false);
              Welding.this.rdbtnfull4.setSelected(false);
          	lowerLeft = true;
            } 
          }
        });
    this.rdbtnfour3_3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour3_3.setBounds(10, 504, 91, 23);
    this.panelOverlap.add(this.rdbtnfour3_3);
    this.rdbtnfour4_3 = new JRadioButton("Lower right & finishing");
    this.rdbtnfour4_3.setBackground(Color.WHITE);
    this.rdbtnfour4_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour4_3.isSelected()) {
              Welding.this.rdbtnfour2_3.setSelected(false);
              Welding.this.rdbtnfour3_3.setSelected(false);
              Welding.this.rdbtnfour1_3.setSelected(false);
              Welding.this.rdbtntwo1_3.setSelected(false);
              Welding.this.rdbtntwo2_3.setSelected(false);
              Welding.this.rdbtnhor1_3.setSelected(false);
              Welding.this.rdbtnNewRadioButton_3.setSelected(false);
              Welding.this.rdbtnsingle4.setSelected(false);
              Welding.this.rdbtnfull4.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnfour4_3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour4_3.setBounds(103, 504, 180, 23);
    this.panelOverlap.add(this.rdbtnfour4_3);
    this.lblfourB_3 = new JLabel("");
    this.lblfourB_3.setFont(new Font("Tahoma", 1, 14));
    this.lblfourB_3.setBounds(253, 444, 253, 14);
    this.panelOverlap.add(this.lblfourB_3);
    this.rdbtntwo1_3 = new JRadioButton("Upper");
    this.rdbtntwo1_3.setBackground(Color.WHITE);
    this.rdbtntwo1_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo1_3.isSelected()) {
              Welding.this.rdbtnfour2_3.setSelected(false);
              Welding.this.rdbtnfour3_3.setSelected(false);
              Welding.this.rdbtnfour4_3.setSelected(false);
              Welding.this.rdbtnfour1_3.setSelected(false);
              Welding.this.rdbtntwo2_3.setSelected(false);
              Welding.this.rdbtnhor1_3.setSelected(false);
              Welding.this.rdbtnNewRadioButton_3.setSelected(false);
              Welding.this.rdbtnsingle4.setSelected(false);
              Welding.this.rdbtnfull4.setSelected(false);
      		upperLeft = true;
    		upperRight = true;
            } 
          }
        });
    this.rdbtntwo1_3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo1_3.setBounds(284, 478, 109, 23);
    this.panelOverlap.add(this.rdbtntwo1_3);
    this.rdbtntwo2_3 = new JRadioButton("Lower & finishing");
    this.rdbtntwo2_3.setBackground(Color.WHITE);
    this.rdbtntwo2_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo2_3.isSelected()) {
              Welding.this.rdbtnfour2_3.setSelected(false);
              Welding.this.rdbtnfour3_3.setSelected(false);
              Welding.this.rdbtnfour4_3.setSelected(false);
              Welding.this.rdbtnfour1_3.setSelected(false);
              Welding.this.rdbtntwo1_3.setSelected(false);
              Welding.this.rdbtnhor1_3.setSelected(false);
              Welding.this.rdbtnNewRadioButton_3.setSelected(false);
              Welding.this.rdbtnsingle4.setSelected(false);
              Welding.this.rdbtnfull4.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtntwo2_3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo2_3.setBounds(284, 504, 167, 23);
    this.panelOverlap.add(this.rdbtntwo2_3);
    this.rdbtnfour2_3 = new JRadioButton("Upper right");
    this.rdbtnfour2_3.setBackground(Color.WHITE);
    this.rdbtnfour2_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour2_3.isSelected()) {
              Welding.this.rdbtnfour1_3.setSelected(false);
              Welding.this.rdbtnfour3_3.setSelected(false);
              Welding.this.rdbtnfour4_3.setSelected(false);
              Welding.this.rdbtntwo1_3.setSelected(false);
              Welding.this.rdbtntwo2_3.setSelected(false);
              Welding.this.rdbtnhor1_3.setSelected(false);
              Welding.this.rdbtnNewRadioButton_3.setSelected(false);
              Welding.this.rdbtnsingle4.setSelected(false);
              Welding.this.rdbtnfull4.setSelected(false);
      		upperRight = true;
            } 
          }
        });
    this.rdbtnfour2_3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour2_3.setBounds(103, 478, 109, 23);
    this.panelOverlap.add(this.rdbtnfour2_3);
    this.btnfilesButton_3 = new JButton("Look at images");
    this.btnfilesButton_3.setBackground(welditBlue);
    this.btnfilesButton_3.setForeground(Color.WHITE);
    this.btnfilesButton_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTrans = 2;
            Welding.this.lookAtImages();
          }
        });
    this.btnfilesButton_3.setFont(new Font("Tahoma", 1, 11));
    this.btnfilesButton_3.setBounds(33, 530, 127, 28);   // (596, 430, 127, 28)
    this.panelOverlap.add(this.btnfilesButton_3);
    this.file1_3 = new JLabel("");
    this.file1_3.setBounds(10, 559, 750, 450);
    this.panelOverlap.add(this.file1_3);
    this.btnNewButton_6 = new JButton("Picture under");
    this.btnNewButton_6.setBackground(welditBlue);
    this.btnNewButton_6.setForeground(Color.WHITE);
    this.btnNewButton_6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.lookAtPicture();
          }
        });
    this.btnNewButton_6.setFont(new Font("Tahoma", 1, 11));
    this.btnNewButton_6.setBounds(596, 465, 127, 28);
 //   this.panelOverlap.add(this.btnNewButton_6);
    this.rdbtnhor1_3 = new JRadioButton("Left");
    this.rdbtnhor1_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnhor1_3.isSelected()) {
              Welding.this.rdbtnfour1_3.setSelected(false);
              Welding.this.rdbtnfour3_3.setSelected(false);
              Welding.this.rdbtnfour4_3.setSelected(false);
              Welding.this.rdbtntwo1_3.setSelected(false);
              Welding.this.rdbtntwo2_3.setSelected(false);
              Welding.this.rdbtnfour2_3.setSelected(false);
              Welding.this.rdbtnNewRadioButton_3.setSelected(false);
              Welding.this.rdbtnsingle4.setSelected(false);
              Welding.this.rdbtnfull4.setSelected(false);
      		upperLeft = true;
    		lowerLeft = true;
            } 
          }
        });
    this.rdbtnhor1_3.setBackground(Color.WHITE);
    this.rdbtnhor1_3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnhor1_3.setBounds(449, 478, 109, 23);
    this.panelOverlap.add(this.rdbtnhor1_3);
    this.rdbtnNewRadioButton_3 = new JRadioButton("Right & finishing");
    this.rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnNewRadioButton_3.isSelected()) {
              Welding.this.rdbtnfour1_3.setSelected(false);
              Welding.this.rdbtnfour3_3.setSelected(false);
              Welding.this.rdbtnfour4_3.setSelected(false);
              Welding.this.rdbtntwo1_3.setSelected(false);
              Welding.this.rdbtntwo2_3.setSelected(false);
              Welding.this.rdbtnfour2_3.setSelected(false);
              Welding.this.rdbtnhor1_3.setSelected(false);
              Welding.this.rdbtnsingle4.setSelected(false);
              Welding.this.rdbtnfull4.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnNewRadioButton_3.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnNewRadioButton_3.setBackground(Color.WHITE);
    this.rdbtnNewRadioButton_3.setBounds(446, 504, 120, 23);
    this.panelOverlap.add(this.rdbtnNewRadioButton_3);
    JLabel lblNewLabel_57 = new JLabel("4 parts");
    lblNewLabel_57.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_57.setBounds(23, 465, 46, 14);
    this.panelOverlap.add(lblNewLabel_57);
    JLabel lblNewLabel_58 = new JLabel("2 horisontal parts");
    lblNewLabel_58.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_58.setBounds(284, 465, 109, 14);
    this.panelOverlap.add(lblNewLabel_58);
    JLabel lblNewLabel_59 = new JLabel("2 vertical parts");
    lblNewLabel_59.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_59.setBounds(449, 465, 117, 14);
    this.panelOverlap.add(lblNewLabel_59);
    JLabel lblNewLabel_590 = new JLabel("1 picture");
    lblNewLabel_590.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_590.setBounds(595, 465, 117, 14);
    this.panelOverlap.add(lblNewLabel_590);
    
	lblImageO0On = new JLabel("Indication of images in buffer");
	lblImageO0On.setFont(new Font("Tahoma", 1, 14));
	lblImageO0On.setBounds(50, 670, 400, 20);
	panelOverlap.add(lblImageO0On);
textFieldImageO1 = new JTextField();
	textFieldImageO1.setHorizontalAlignment(0);
textFieldImageO1.setText("1");
textFieldImageO1.setBounds(150, 700, 30, 30);
	textFieldImageO1.setForeground(Color.RED);
textFieldImageO1.setBackground(Color.WHITE);
	panelOverlap.add(this.textFieldImageO1);

textFieldImageO2 = new JTextField();
	textFieldImageO2.setHorizontalAlignment(0);
textFieldImageO2.setText("2");
textFieldImageO2.setBounds(180, 700, 30, 30);
	textFieldImageO2.setForeground(Color.RED);
textFieldImageO2.setBackground(Color.WHITE);
	panelOverlap.add(this.textFieldImageO2);

textFieldImageO3 = new JTextField();
	textFieldImageO3.setHorizontalAlignment(0);
textFieldImageO3.setText("3");
textFieldImageO3.setBounds(150, 730, 30, 30);
	textFieldImageO3.setForeground(Color.RED);
textFieldImageO3.setBackground(Color.WHITE);
	panelOverlap.add(this.textFieldImageO3);

textFieldImageO4 = new JTextField();
	textFieldImageO4.setHorizontalAlignment(0);
textFieldImageO4.setText("4");
textFieldImageO4.setBounds(180, 730, 30, 30);
	textFieldImageO4.setForeground(Color.RED);
textFieldImageO4.setBackground(Color.WHITE);
	panelOverlap.add(this.textFieldImageO4);
    
    //////////////////////////////////////////////////7Flange
    this.panelFlanged = new JPanel();
    this.panelFlanged.setBackground(Color.WHITE);
    panelBottom.add(this.panelFlanged, "name_300305484892200");
    this.panelFlanged.setLayout((LayoutManager)null);
    this.lblFlaggedWeld = new JLabel("Flanged weld spesifikasjon");
    this.lblFlaggedWeld.setHorizontalAlignment(0);
    this.lblFlaggedWeld.setFont(new Font("Tahoma", 1, 15));
    this.lblFlaggedWeld.setBounds(10, 10, 474, 15);
    this.panelFlanged.add(this.lblFlaggedWeld);
    this.lblGapFlaged = new JLabel("Gap");
    this.lblGapFlaged.setFont(new Font("Tahoma", 1, 11));
    this.lblGapFlaged.setBounds(10, 61, 46, 14);
    this.panelFlanged.add(this.lblGapFlaged);
    this.lblTicknessFlaged = new JLabel("Tickness");
    this.lblTicknessFlaged.setFont(new Font("Tahoma", 1, 11));
    this.lblTicknessFlaged.setBounds(10, 104, 96, 14);
    this.panelFlanged.add(this.lblTicknessFlaged);
    this.lblTopRadiusFlaged = new JLabel("Top radius");
    this.lblTopRadiusFlaged.setFont(new Font("Tahoma", 1, 11));
    this.lblTopRadiusFlaged.setBounds(10, 146, 96, 14);
    this.panelFlanged.add(this.lblTopRadiusFlaged);
    this.textFieldGapFlaged = new JTextField();
    this.textFieldGapFlaged.setText("0");
    this.textFieldGapFlaged.setHorizontalAlignment(0);
    this.textFieldGapFlaged.setBounds(136, 58, 86, 20);
    this.panelFlanged.add(this.textFieldGapFlaged);
    this.textFieldGapFlaged.setColumns(10);
    this.textFieldTicknessFlaged = new JTextField();
    this.textFieldTicknessFlaged.setText("10");
    this.textFieldTicknessFlaged.setHorizontalAlignment(0);
    this.textFieldTicknessFlaged.setBounds(136, 101, 86, 20);
    this.panelFlanged.add(this.textFieldTicknessFlaged);
    this.textFieldTicknessFlaged.setColumns(10);
    this.textFieldTopRadiusFlaged = new JTextField();
    this.textFieldTopRadiusFlaged.setText("10");
    this.textFieldTopRadiusFlaged.setHorizontalAlignment(0);
    this.textFieldTopRadiusFlaged.setBounds(136, 143, 86, 20);
    this.panelFlanged.add(this.textFieldTopRadiusFlaged);
    this.textFieldTopRadiusFlaged.setColumns(10);
    this.btnGenerateFlaged = new JButton("Generate drawing");
    this.btnGenerateFlaged.setBackground(welditBlue);
    this.btnGenerateFlaged.setForeground(Color.WHITE);
    this.btnGenerateFlaged.setFont(new Font("Tahoma", 1, 11));
    this.btnGenerateFlaged.setBounds(38, 300, 240, 23);
    this.panelFlanged.add(this.btnGenerateFlaged);
    JLabel lblNewLabel_6 = new JLabel("Scaler %");
    lblNewLabel_6.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_6.setBounds(319, 39, 69, 14);
//    this.panelFlanged.add(lblNewLabel_6);
    JLabel lblNewLabel_7 = new JLabel("New label");
    lblNewLabel_7.setBounds(322, 125, 32, -35);
//    this.panelFlanged.add(lblNewLabel_7);
    this.lblNewLabel_8 = new JLabel("Rotate");
    this.lblNewLabel_8.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_8.setBounds(319, 58, 46, 20);
//    this.panelFlanged.add(this.lblNewLabel_8);
    this.textFieldFlangedScaler = new JTextField();
    this.textFieldFlangedScaler.setHorizontalAlignment(0);
    this.textFieldFlangedScaler.setText("100");
    this.textFieldFlangedScaler.setBounds(519, 36, 159, 20);
//    this.panelFlanged.add(this.textFieldFlangedScaler);
    this.textFieldFlangedScaler.setColumns(10);
    this.textFieldFlangedRotate = new JTextField();
    this.textFieldFlangedRotate.setHorizontalAlignment(0);
    this.textFieldFlangedRotate.setText("0");
    this.textFieldFlangedRotate.setBounds(519, 61, 159, 20);
 //   this.panelFlanged.add(this.textFieldFlangedRotate);
    this.textFieldFlangedRotate.setColumns(10);
    this.chckbxflangedtext = new JCheckBox("With data text on page");
    this.chckbxflangedtext.setFont(new Font("Tahoma", 1, 11));
    this.chckbxflangedtext.setBackground(Color.WHITE);
    this.chckbxflangedtext.setBounds(319, 100, 165, 23);
 //   this.panelFlanged.add(this.chckbxflangedtext);
    this.chckbxflangeddrawing = new JCheckBox("With values on drawing");
    this.chckbxflangeddrawing.setSelected(true);
    this.chckbxflangeddrawing.setFont(new Font("Tahoma", 1, 11));
    this.chckbxflangeddrawing.setBackground(Color.WHITE);
    this.chckbxflangeddrawing.setBounds(319, 125, 160, 23);
    this.panelFlanged.add(this.chckbxflangeddrawing);
    JScrollPane scrollPane_Flanged = new JScrollPane();
    scrollPane_Flanged.setBounds(20, 359, 750, 60);
    this.panelFlanged.add(scrollPane_Flanged);
    this.textArea_Flanged = new JTextArea();
    this.textArea_Flanged.setText("");
    scrollPane_Flanged.setViewportView(this.textArea_Flanged);
    JLabel lblbuttspin_4 = new JLabel("Comments:");
    lblbuttspin_4.setFont(new Font("Tahoma", 1, 11));
    lblbuttspin_4.setBackground(Color.WHITE);
    lblbuttspin_4.setBounds(10, 334, 117, 14);
    this.panelFlanged.add(lblbuttspin_4);
    this.chckbx_image_butt_1_4 = new JCheckBox("Generate image on page");
    this.chckbx_image_butt_1_4.setSelected(true);
    this.chckbx_image_butt_1_4.setFont(new Font("Tahoma", 1, 11));
    this.chckbx_image_butt_1_4.setBackground(Color.WHITE);
    this.chckbx_image_butt_1_4.setBounds(319, 146, 199, 23);
//    this.panelFlanged.add(this.chckbx_image_butt_1_4);
    JLabel lblNewLabel_41_3_1 = new JLabel("Path Name:");
    lblNewLabel_41_3_1.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_41_3_1.setBounds(319, 187, 76, 11);
//    this.panelFlanged.add(lblNewLabel_41_3_1);
    this.textField_20 = new JTextField();
    this.textField_20.setText(pathName);
    this.textField_20.setColumns(10);
    this.textField_20.setBackground(Color.WHITE);
    this.textField_20.setBounds(519, 182, 159, 20);
//    this.panelFlanged.add(this.textField_20);
    JLabel lblNewLabel_38_2_2 = new JLabel("File Name:");
    lblNewLabel_38_2_2.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_38_2_2.setBounds(319, 209, 70, 14);
//    this.panelFlanged.add(lblNewLabel_38_2_2);
    this.textField_26 = new JTextField();
    this.textField_26.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.choosenName = Welding.this.textField_26.getText();
          }
        });
    this.textField_26.setColumns(10);
    this.textField_26.setBounds(519, 213, 159, 20);
 //   this.panelFlanged.add(this.textField_26);
    JLabel lblNewLabel_39_4 = new JLabel("File Extension:");
    lblNewLabel_39_4.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_39_4.setBounds(319, 234, 86, 20);
 //   this.panelFlanged.add(lblNewLabel_39_4);
    this.comboBox_type_butt_2_2 = new JComboBox<String>();
    this.comboBox_type_butt_2_2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTypeFlanged = Welding.this.comboBox_type_butt_2_2.getSelectedIndex();
          }
        });
    this.comboBox_type_butt_2_2.setModel(new DefaultComboBoxModel<>(new String[] { "png", "gif" }));
    this.comboBox_type_butt_2_2.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_type_butt_2_2.setBackground(Color.WHITE);
    this.comboBox_type_butt_2_2.setBounds(519, 233, 159, 22);
 //   this.panelFlanged.add(this.comboBox_type_butt_2_2);
    JLabel lblNewLabel_40_4 = new JLabel("Screen size:");
    lblNewLabel_40_4.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_40_4.setBounds(319, 265, 86, 20);
//   this.panelFlanged.add(lblNewLabel_40_4);
    this.comboBox_size_butt_4 = new JComboBox<String>();
    this.comboBox_size_butt_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intSizeFlanged = Welding.this.comboBox_size_butt_4.getSelectedIndex();
          }
        });
    this.comboBox_size_butt_4.setModel(new DefaultComboBoxModel<>(new String[] { "Standard size", "Full screen" }));
    this.comboBox_size_butt_4.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_size_butt_4.setBackground(Color.WHITE);
    this.comboBox_size_butt_4.setBounds(519, 266, 159, 22);
 //   this.panelFlanged.add(this.comboBox_size_butt_4);
    this.lblNewLabel_47 = new JLabel("Mouse move enabled");
    this.lblNewLabel_47.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_47.setBounds(319, 330, 171, 14);
//    this.panelFlanged.add(this.lblNewLabel_47);
    this.comboBox_1_4 = new JComboBox<String>();
    this.comboBox_1_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intMouseFlanged = Welding.this.comboBox_1_4.getSelectedIndex();
          }
        });
    this.comboBox_1_4.setBackground(Color.WHITE);
    this.comboBox_1_4.setModel(new DefaultComboBoxModel<>(new String[] { "", "String drawing", "String drawing with menu" }));
    this.comboBox_1_4.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_1_4.setBounds(519, 326, 159, 22);
 //   this.panelFlanged.add(this.comboBox_1_4);
    this.chckbxInstruction_1_4 = new JCheckBox("Witn comments on page");
    this.chckbxInstruction_1_4.setFont(new Font("Tahoma", 1, 11));
    this.chckbxInstruction_1_4.setBackground(Color.WHITE);
    this.chckbxInstruction_1_4.setBounds(319, 78, 163, 23);
 //   this.panelFlanged.add(this.chckbxInstruction_1_4);
    this.chckbxWeldString_4 = new JCheckBox("Max size for weldstring");
    this.chckbxWeldString_4.setFont(new Font("Tahoma", 1, 11));
    this.chckbxWeldString_4.setBackground(Color.WHITE);
    this.chckbxWeldString_4.setBounds(319, 292, 159, 23);
//    this.panelFlanged.add(this.chckbxWeldString_4);
    this.lblfourA_4 = new JLabel("Number of pictures on same screen");
    this.lblfourA_4.setFont(new Font("Tahoma", 1, 14));
    this.lblfourA_4.setBounds(10, 430, 300, 20);
    this.panelFlanged.add(this.lblfourA_4);
    
    this.rdbtnfull5 = new JRadioButton("Entire screen");    // Entire screen
    this.rdbtnfull5.setBackground(Color.WHITE);
    Welding.this.rdbtnfull5.setSelected(false);
    this.rdbtnfull5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfull5.isSelected()) {
     		    Welding.this.rdbtnfour1_4.setSelected(false);
              	Welding.this.rdbtnfour2_4.setSelected(false);
              	Welding.this.rdbtnfour3_4.setSelected(false);
              	Welding.this.rdbtnfour4_4.setSelected(false);
             	Welding.this.rdbtntwo1_4.setSelected(false);
              	Welding.this.rdbtntwo2_4.setSelected(false);
              	Welding.this.rdbtnhor1_4.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_4.setSelected(false);
              	Welding.this.rdbtnsingle5.setSelected(false);
            } 
          }
        });
    this.rdbtnfull5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfull5.setBounds(600, 499, 109, 23);
    this.panelFlanged.add(this.rdbtnfull5);                    //
    
    this.rdbtnsingle5 = new JRadioButton("Single");
    this.rdbtnsingle5.setBackground(Color.WHITE);
    this.rdbtnsingle5.setSelected(true);
    this.rdbtnsingle5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnsingle5.isSelected()) {
     		    Welding.this.rdbtnfour1_4.setSelected(false);
              	Welding.this.rdbtnfour2_4.setSelected(false);
              	Welding.this.rdbtnfour3_4.setSelected(false);
              	Welding.this.rdbtnfour4_4.setSelected(false);
             	Welding.this.rdbtntwo1_4.setSelected(false);
              	Welding.this.rdbtntwo2_4.setSelected(false);
              	Welding.this.rdbtnhor1_4.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_4.setSelected(false);
                Welding.this.rdbtnfull5.setSelected(false);
            } 
          }
        });
    this.rdbtnsingle5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnsingle5.setBounds(600, 473, 109, 23);
    this.panelFlanged.add(this.rdbtnsingle5);


    
    this.rdbtnfour1_4 = new JRadioButton("Upper left");
    this.rdbtnfour1_4.setBackground(Color.WHITE);
    this.rdbtnfour1_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour1_4.isSelected()) {
              Welding.this.rdbtnfour2_4.setSelected(false);
              Welding.this.rdbtnfour3_4.setSelected(false);
              Welding.this.rdbtnfour4_4.setSelected(false);
              Welding.this.rdbtntwo1_4.setSelected(false);
              Welding.this.rdbtntwo2_4.setSelected(false);
              Welding.this.rdbtnhor1_4.setSelected(false);
              Welding.this.rdbtnNewRadioButton_4.setSelected(false);
              Welding.this.rdbtnsingle5.setSelected(false);
              Welding.this.rdbtnfull5.setSelected(false);
              upperLeft = true;
            } 
          }
        });
    this.rdbtnfour1_4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour1_4.setBounds(10, 473, 86, 23);
    this.panelFlanged.add(this.rdbtnfour1_4);
    this.rdbtnfour3_4 = new JRadioButton("Lower left");
    this.rdbtnfour3_4.setBackground(Color.WHITE);
    this.rdbtnfour3_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour3_4.isSelected()) {
              Welding.this.rdbtnfour2_4.setSelected(false);
              Welding.this.rdbtnfour1_4.setSelected(false);
              Welding.this.rdbtnfour4_4.setSelected(false);
              Welding.this.rdbtntwo1_4.setSelected(false);
              Welding.this.rdbtntwo2_4.setSelected(false);
              Welding.this.rdbtnhor1_4.setSelected(false);
              Welding.this.rdbtnNewRadioButton_4.setSelected(false);
              Welding.this.rdbtnsingle5.setSelected(false);
              Welding.this.rdbtnfull5.setSelected(false);
              lowerLeft = true;
            } 
          }
        });
    this.rdbtnfour3_4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour3_4.setBounds(10, 499, 86, 23);
    this.panelFlanged.add(this.rdbtnfour3_4);
    this.rdbtnfour2_4 = new JRadioButton("Upper right");
    this.rdbtnfour2_4.setBackground(Color.WHITE);
    this.rdbtnfour2_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour2_4.isSelected()) {
              Welding.this.rdbtnfour1_4.setSelected(false);
              Welding.this.rdbtnfour3_4.setSelected(false);
              Welding.this.rdbtnfour4_4.setSelected(false);
              Welding.this.rdbtntwo1_4.setSelected(false);
              Welding.this.rdbtntwo2_4.setSelected(false);
              Welding.this.rdbtnhor1_4.setSelected(false);
              Welding.this.rdbtnNewRadioButton_4.setSelected(false);
              Welding.this.rdbtnsingle5.setSelected(false);
              Welding.this.rdbtnfull5.setSelected(false);
              upperRight = true;
            } 
          }
        });
    this.rdbtnfour2_4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour2_4.setBounds(105, 473, 109, 23);
    this.panelFlanged.add(this.rdbtnfour2_4);
    this.rdbtnfour4_4 = new JRadioButton("Lower right & finishing");
    this.rdbtnfour4_4.setBackground(Color.WHITE);
    this.rdbtnfour4_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour4_4.isSelected()) {
              Welding.this.rdbtnfour2_4.setSelected(false);
              Welding.this.rdbtnfour3_4.setSelected(false);
              Welding.this.rdbtnfour1_4.setSelected(false);
              Welding.this.rdbtntwo1_4.setSelected(false);
              Welding.this.rdbtntwo2_4.setSelected(false);
              Welding.this.rdbtnhor1_4.setSelected(false);
              Welding.this.rdbtnNewRadioButton_4.setSelected(false);
              Welding.this.rdbtnsingle5.setSelected(false);
              Welding.this.rdbtnfull5.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnfour4_4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour4_4.setBounds(105, 499, 159, 23);
    this.panelFlanged.add(this.rdbtnfour4_4);
    this.lblfourB_4 = new JLabel("");
    this.lblfourB_4.setFont(new Font("Tahoma", 1, 14));
    this.lblfourB_4.setBounds(246, 441, 159, 14);
    this.panelFlanged.add(this.lblfourB_4);
    this.rdbtntwo1_4 = new JRadioButton("Upper");
    this.rdbtntwo1_4.setBackground(Color.WHITE);
    this.rdbtntwo1_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo1_4.isSelected()) {
              Welding.this.rdbtnfour2_4.setSelected(false);
              Welding.this.rdbtnfour3_4.setSelected(false);
              Welding.this.rdbtnfour4_4.setSelected(false);
              Welding.this.rdbtnfour1_4.setSelected(false);
              Welding.this.rdbtntwo2_4.setSelected(false);
              Welding.this.rdbtnhor1_4.setSelected(false);
              Welding.this.rdbtnNewRadioButton_4.setSelected(false);
              Welding.this.rdbtnsingle5.setSelected(false);
              Welding.this.rdbtnfull5.setSelected(false);
      		upperLeft = true;
    		upperRight = true;
            } 
          }
        });
    this.rdbtntwo1_4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo1_4.setBounds(273, 473, 109, 23);
    this.panelFlanged.add(this.rdbtntwo1_4);
    this.rdbtntwo2_4 = new JRadioButton("Lower & finishing");
    this.rdbtntwo2_4.setBackground(Color.WHITE);
    this.rdbtntwo2_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo2_4.isSelected()) {
              Welding.this.rdbtnfour2_4.setSelected(false);
              Welding.this.rdbtnfour3_4.setSelected(false);
              Welding.this.rdbtnfour4_4.setSelected(false);
              Welding.this.rdbtnfour1_4.setSelected(false);
              Welding.this.rdbtntwo1_4.setSelected(false);
              Welding.this.rdbtnhor1_4.setSelected(false);
              Welding.this.rdbtnNewRadioButton_4.setSelected(false);
              Welding.this.rdbtnsingle5.setSelected(false);
              Welding.this.rdbtnfull5.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtntwo2_4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo2_4.setBounds(273, 499, 167, 23);
    this.panelFlanged.add(this.rdbtntwo2_4);
    this.btnfilesButton_4 = new JButton("Look at images");
    this.btnfilesButton_4.setBackground(welditBlue);
    this.btnfilesButton_4.setForeground(Color.WHITE);
    this.btnfilesButton_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTrans = 2;
            Welding.this.lookAtImages();
          }
        });
    this.btnfilesButton_4.setFont(new Font("Tahoma", 1, 11));
    this.btnfilesButton_4.setBounds(33, 547, 127, 28);  //   573, 457, 127, 28
    this.panelFlanged.add(this.btnfilesButton_4);
    this.file1_4 = new JLabel("");
    this.file1_4.setBounds(10, 610, 750, 400);
    this.panelFlanged.add(this.file1_4);
    this.btnNewButton_5 = new JButton("Picture under");
    this.btnNewButton_5.setBackground(welditBlue);
    this.btnNewButton_5.setForeground(Color.WHITE);
    this.btnNewButton_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.lookAtPicture();
          }
        });
    this.btnNewButton_5.setFont(new Font("Tahoma", 1, 11));
    this.btnNewButton_5.setBounds(573, 499, 127, 28);
//    this.panelFlanged.add(this.btnNewButton_5);
    this.rdbtnhor1_4 = new JRadioButton("Left");
    this.rdbtnhor1_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnhor1_4.isSelected()) {
              Welding.this.rdbtnfour2_4.setSelected(false);
              Welding.this.rdbtnfour3_4.setSelected(false);
              Welding.this.rdbtnfour4_4.setSelected(false);
              Welding.this.rdbtnfour1_4.setSelected(false);
              Welding.this.rdbtntwo1_4.setSelected(false);
              Welding.this.rdbtntwo2_4.setSelected(false);
              Welding.this.rdbtnNewRadioButton_4.setSelected(false);
              Welding.this.rdbtnsingle5.setSelected(false);
              Welding.this.rdbtnfull5.setSelected(false);
      		upperLeft = true;
    		lowerLeft = true;
            } 
          }
        });
    this.rdbtnhor1_4.setBackground(Color.WHITE);
    this.rdbtnhor1_4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnhor1_4.setBounds(440, 473, 109, 23);
    this.panelFlanged.add(this.rdbtnhor1_4);
    this.rdbtnNewRadioButton_4 = new JRadioButton("Right & finishing");
    this.rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnNewRadioButton_4.isSelected()) {
              Welding.this.rdbtnfour2_4.setSelected(false);
              Welding.this.rdbtnfour3_4.setSelected(false);
              Welding.this.rdbtnfour4_4.setSelected(false);
              Welding.this.rdbtnfour1_4.setSelected(false);
              Welding.this.rdbtntwo1_4.setSelected(false);
              Welding.this.rdbtntwo2_4.setSelected(false);
              Welding.this.rdbtnhor1_4.setSelected(false);
              Welding.this.rdbtnsingle5.setSelected(false);
              Welding.this.rdbtnfull5.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnNewRadioButton_4.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnNewRadioButton_4.setBackground(Color.WHITE);
    this.rdbtnNewRadioButton_4.setBounds(442, 499, 120, 23);
    this.panelFlanged.add(this.rdbtnNewRadioButton_4);
    JLabel lblNewLabel_54 = new JLabel("4 parts");
    lblNewLabel_54.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_54.setBounds(20, 441, 76, 23);
    this.panelFlanged.add(lblNewLabel_54);
    JLabel lblNewLabel_55 = new JLabel("2 horisontal parts");
    lblNewLabel_55.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_55.setBounds(273, 441, 115, 23);
    this.panelFlanged.add(lblNewLabel_55);
    JLabel lblNewLabel_56 = new JLabel("2 vertical parts");
    lblNewLabel_56.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_56.setBounds(440, 441, 109, 14);
    this.panelFlanged.add(lblNewLabel_56);
    JLabel lblNewLabel_560 = new JLabel("1 picture");
    lblNewLabel_560.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_560.setBounds(595, 441, 109, 14);
    this.panelFlanged.add(lblNewLabel_560);
    
	lblImageFL0On = new JLabel("Indication of images in buffer");
	lblImageFL0On.setFont(new Font("Tahoma", 1, 14));
	lblImageFL0On.setBounds(50, 670, 400, 20);
	panelFlanged.add(lblImageFL0On);
textFieldImageFL1 = new JTextField();
	textFieldImageFL1.setHorizontalAlignment(0);
textFieldImageFL1.setText("1");
textFieldImageFL1.setBounds(150, 700, 30, 30);
	textFieldImageFL1.setForeground(Color.RED);
textFieldImageFL1.setBackground(Color.WHITE);
	panelFlanged.add(this.textFieldImageFL1);

textFieldImageFL2 = new JTextField();
	textFieldImageFL2.setHorizontalAlignment(0);
textFieldImageFL2.setText("2");
textFieldImageFL2.setBounds(180, 700, 30, 30);
	textFieldImageFL2.setForeground(Color.RED);
textFieldImageFL2.setBackground(Color.WHITE);
	panelFlanged.add(this.textFieldImageFL2);

textFieldImageFL3 = new JTextField();
	textFieldImageFL3.setHorizontalAlignment(0);
textFieldImageFL3.setText("3");
textFieldImageFL3.setBounds(150, 730, 30, 30);
	textFieldImageFL3.setForeground(Color.RED);
textFieldImageFL3.setBackground(Color.WHITE);
	panelFlanged.add(this.textFieldImageFL3);

textFieldImageFL4 = new JTextField();
	textFieldImageFL4.setHorizontalAlignment(0);
textFieldImageFL4.setText("4");
textFieldImageFL4.setBounds(180, 730, 30, 30);
	textFieldImageFL4.setForeground(Color.RED);
textFieldImageFL4.setBackground(Color.WHITE);
	panelFlanged.add(this.textFieldImageFL4);

    ////////////////////////////////////////////////Save         /////////////Calculate
    this.panelSave = new JPanel();
    this.panelSave.setBackground(Color.WHITE);
    panelBottom.add(this.panelSave, "name_300355128363300");
    this.panelSave.setLayout((LayoutManager)null);
    this.lblSave = new JLabel("Calculation for weld strength");
    this.lblSave.setBackground(Color.WHITE);
    this.lblSave.setFont(new Font("Tahoma", 1, 20));
    this.lblSave.setBounds(10, 11, 403, 20);
    this.panelSave.add(this.lblSave);
    JLabel lblCalcMaterial = new JLabel("Grunnmateriale");
    lblCalcMaterial.setFont(new Font("Tahoma", 1, 11));
    lblCalcMaterial.setBounds(34, 60, 135, 20);
    this.panelSave.add(lblCalcMaterial);
    JLabel lblFu = new JLabel("fu - kaakteristisk fasthet");
    lblFu.setFont(new Font("Tahoma", 1, 11));
    lblFu.setBounds(34, 91, 156, 20);
    this.panelSave.add(lblFu);
    JLabel lblBeta = new JLabel("Betaw - korrelasjonsfaktor");
    lblBeta.setFont(new Font("Tahoma", 1, 11));
    lblBeta.setBounds(34, 116, 156, 20);
    this.panelSave.add(lblBeta);
    JLabel lblGammeM2 = new JLabel("Materialfaktor GammaM2");
    lblGammeM2.setFont(new Font("Tahoma", 1, 11));
    lblGammeM2.setBounds(34, 144, 146, 20);
    this.panelSave.add(lblGammeM2);
    JLabel lblDimensjonKraft = new JLabel("Dimensjonerende Kraft");
    lblDimensjonKraft.setFont(new Font("Tahoma", 1, 11));
    lblDimensjonKraft.setBounds(34, 202, 135, 20);
    this.panelSave.add(lblDimensjonKraft);
    JLabel lblRotmaal = new JLabel("Rotmål");      // error
    lblRotmaal.setFont(new Font("Tahoma", 1, 11));
    lblRotmaal.setBounds(34, 227, 46, 20);
    this.panelSave.add(lblRotmaal);
    JLabel lblSveiselengde = new JLabel("Sveiselengde");
    lblSveiselengde.setFont(new Font("Tahoma", 1, 11));
    lblSveiselengde.setBounds(34, 252, 93, 20);
    this.panelSave.add(lblSveiselengde);
    JLabel lblKraftvinkel = new JLabel("Kraftvinkel");
    lblKraftvinkel.setFont(new Font("Tahoma", 1, 11));
    lblKraftvinkel.setBounds(34, 277, 63, 20);
    this.panelSave.add(lblKraftvinkel);
    JLabel lblEffektivsveis = new JLabel("Effektiv sveiselengde");
    lblEffektivsveis.setFont(new Font("Tahoma", 1, 11));
    lblEffektivsveis.setBounds(33, 363, 157, 20);
    this.panelSave.add(lblEffektivsveis);
    JLabel lblEffektivAreal = new JLabel("Effektivt sveiseareal");
    lblEffektivAreal.setFont(new Font("Tahoma", 1, 11));
    lblEffektivAreal.setBounds(34, 386, 117, 20);
    this.panelSave.add(lblEffektivAreal);
    JLabel lblSigmaNormal = new JLabel("Sveisespenning");
    lblSigmaNormal.setFont(new Font("Tahoma", 1, 11));
    lblSigmaNormal.setBounds(34, 410, 93, 20);
    this.panelSave.add(lblSigmaNormal);
    JLabel lblSpenningNormal = new JLabel("Jamførspenning normal");
    lblSpenningNormal.setFont(new Font("Tahoma", 1, 11));
    lblSpenningNormal.setBounds(31, 528, 159, 20);
    this.panelSave.add(lblSpenningNormal);
    JLabel lblSveisespenningjamf = new JLabel("Jamførspenning");   // error
    lblSveisespenningjamf.setFont(new Font("Tahoma", 1, 11));
    lblSveisespenningjamf.setBounds(34, 441, 117, 20);
    this.panelSave.add(lblSveisespenningjamf);
    JLabel lblKraftDim = new JLabel("Sveisespenning normal");
    lblKraftDim.setFont(new Font("Tahoma", 1, 11));
    lblKraftDim.setBounds(34, 553, 135, 20);
    this.panelSave.add(lblKraftDim);
    JLabel lblSpenningSkjer = new JLabel("Skjærspenning");  // error
    lblSpenningSkjer.setFont(new Font("Tahoma", 1, 11));
    lblSpenningSkjer.setBounds(34, 472, 113, 20);
    this.panelSave.add(lblSpenningSkjer);
    this.textFieldCalcFu = new JTextField();
    this.textFieldCalcFu.setHorizontalAlignment(0);
    this.textFieldCalcFu.setEditable(false);
    this.textFieldCalcFu.setText("0");
    this.textFieldCalcFu.setBounds(200, 88, 86, 20);
    this.panelSave.add(this.textFieldCalcFu);
    this.textFieldCalcFu.setColumns(10);
    this.textFieldCalcBetaw = new JTextField();
    this.textFieldCalcBetaw.setHorizontalAlignment(0);
    this.textFieldCalcBetaw.setEditable(false);
    this.textFieldCalcBetaw.setText("0");
    this.textFieldCalcBetaw.setBounds(200, 113, 86, 20);
    this.panelSave.add(this.textFieldCalcBetaw);
    this.textFieldCalcBetaw.setColumns(10);
    this.textFieldCalcGammaM2 = new JTextField();
    this.textFieldCalcGammaM2.setHorizontalAlignment(0);
    this.textFieldCalcGammaM2.setEditable(false);
    this.textFieldCalcGammaM2.setText("1.25");
    this.textFieldCalcGammaM2.setBounds(200, 144, 86, 20);
    this.panelSave.add(this.textFieldCalcGammaM2);
    this.textFieldCalcGammaM2.setColumns(10);
    this.textField_4 = new JTextField();
    this.textField_4.setHorizontalAlignment(0);
    this.textField_4.setText("300");
    this.textField_4.setBounds(200, 202, 86, 20);
    this.panelSave.add(this.textField_4);
    this.textField_4.setColumns(10);
    this.textField_5 = new JTextField();
    this.textField_5.setHorizontalAlignment(0);
    this.textField_5.setText("7");
    this.textField_5.setBounds(200, 227, 86, 20);
    this.panelSave.add(this.textField_5);
    this.textField_5.setColumns(10);
    this.textField_6 = new JTextField();
    this.textField_6.setHorizontalAlignment(0);
    this.textField_6.setText("100");
    this.textField_6.setBounds(200, 252, 86, 20);
    this.panelSave.add(this.textField_6);
    this.textField_6.setColumns(10);
    this.textField_7 = new JTextField();
    this.textField_7.setHorizontalAlignment(0);
    this.textField_7.setText("45");
    this.textField_7.setBounds(200, 277, 86, 20);
    this.panelSave.add(this.textField_7);
    this.textField_7.setColumns(10);
    this.textField_8 = new JTextField();
    this.textField_8.setEditable(false);
    this.textField_8.setHorizontalAlignment(0);
    this.textField_8.setBounds(200, 363, 86, 20);
    this.panelSave.add(this.textField_8);
    this.textField_8.setColumns(10);
    this.textField_9 = new JTextField();
    this.textField_9.setEditable(false);
    this.textField_9.setHorizontalAlignment(0);
    this.textField_9.setBounds(200, 386, 86, 20);
    this.panelSave.add(this.textField_9);
    this.textField_9.setColumns(10);
    this.textField_10 = new JTextField();
    this.textField_10.setEditable(false);
    this.textField_10.setHorizontalAlignment(0);
    this.textField_10.setBounds(200, 410, 86, 20);
    this.panelSave.add(this.textField_10);
    this.textField_10.setColumns(10);
    this.textField_11 = new JTextField();
    this.textField_11.setEditable(false);
    this.textField_11.setHorizontalAlignment(0);
    this.textField_11.setBounds(200, 528, 86, 20);
    this.panelSave.add(this.textField_11);
    this.textField_11.setColumns(10);
    this.textField_12 = new JTextField();
    this.textField_12.setEditable(false);
    this.textField_12.setHorizontalAlignment(0);
    this.textField_12.setBounds(200, 441, 86, 20);
    this.panelSave.add(this.textField_12);
    this.textField_12.setColumns(10);
    this.textField_13 = new JTextField();
    this.textField_13.setEditable(false);
    this.textField_13.setHorizontalAlignment(0);
    this.textField_13.setBounds(200, 553, 86, 20);
    this.panelSave.add(this.textField_13);
    this.textField_13.setColumns(10);
    this.textField_14 = new JTextField();
    this.textField_14.setEditable(false);
    this.textField_14.setHorizontalAlignment(0);
    this.textField_14.setBounds(200, 472, 86, 20);
    this.panelSave.add(this.textField_14);
    this.textField_14.setColumns(10);
    this.comboBox = new JComboBox<String>();
    this.comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "", "S235", "S275", "S355", "S420", "S460" }));
    this.comboBox.setBounds(190, 56, 96, 22);
    this.panelSave.add(this.comboBox);
    this.comboBox.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intSteelType = Welding.this.comboBox.getSelectedIndex();
            if (Welding.this.intSteelType == 1) {
              Welding.this.textFieldCalcFu.setText("360");
              Welding.this.textFieldCalcBetaw.setText("0.8");
              Welding.this.textFieldCalcGammaM2.setText("1.25");
              Welding.this.fu = 360;
              Welding.this.betaw = 0.8D;
              Welding.this.gammaM2 = 1.25D;
            } 
            if (Welding.this.intSteelType == 2) {
              Welding.this.textFieldCalcFu.setText("430");
              Welding.this.textFieldCalcBetaw.setText("0.85");
              Welding.this.textFieldCalcGammaM2.setText("1.25");
              Welding.this.fu = 430;
              Welding.this.betaw = 0.85D;
            } 
            if (Welding.this.intSteelType == 3) {
              Welding.this.textFieldCalcFu.setText("510");
              Welding.this.textFieldCalcBetaw.setText("0.9");
              Welding.this.textFieldCalcGammaM2.setText("1.25");
              Welding.this.fu = 510;
              Welding.this.betaw = 0.9D;
              Welding.this.gammaM2 = 1.25D;
            } 
            if (Welding.this.intSteelType == 4) {
              Welding.this.textFieldCalcFu.setText("520");
              Welding.this.textFieldCalcBetaw.setText("1.0");
              Welding.this.textFieldCalcGammaM2.setText("1.25");
              Welding.this.fu = 520;
              Welding.this.betaw = 1.0D;
              Welding.this.gammaM2 = 1.25D;
            } 
            if (Welding.this.intSteelType == 5) {
              Welding.this.textFieldCalcFu.setText("550");
              Welding.this.textFieldCalcBetaw.setText("1.0");
              Welding.this.textFieldCalcGammaM2.setText("1.25");
              Welding.this.fu = 550;
              Welding.this.betaw = 1.0D;
              Welding.this.gammaM2 = 1.25D;
            } 
            if (Welding.this.intSteelType == 0) {
              Welding.this.textFieldCalcFu.setText("0");
              Welding.this.textFieldCalcBetaw.setText("0");
              Welding.this.textFieldCalcGammaM2.setText("1.25");
            } 
          }
        });
    this.lblNewLabel_3 = new JLabel("Strength");
    this.lblNewLabel_3.setFont(new Font("Tahoma", 1, 12));
    this.lblNewLabel_3.setBounds(10, 36, 117, 14);
    this.panelSave.add(this.lblNewLabel_3);
    this.lblNewLabel_4 = new JLabel("Strain");
    this.lblNewLabel_4.setFont(new Font("Tahoma", 1, 12));
    this.lblNewLabel_4.setBounds(10, 177, 70, 14);
    this.panelSave.add(this.lblNewLabel_4);
    this.lblNewLabel_17 = new JLabel("kN");
    this.lblNewLabel_17.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_17.setBounds(296, 202, 46, 14);
    this.panelSave.add(this.lblNewLabel_17);
    this.lblNewLabel_18 = new JLabel("mm");
    this.lblNewLabel_18.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_18.setBounds(296, 227, 46, 14);
    this.panelSave.add(this.lblNewLabel_18);
    this.lblNewLabel_19 = new JLabel("N / mm2");
    this.lblNewLabel_19.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_19.setBounds(296, 91, 63, 14);
    this.panelSave.add(this.lblNewLabel_19);
    this.lblNewLabel_20 = new JLabel("mm");
    this.lblNewLabel_20.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_20.setBounds(296, 252, 46, 14);
    this.panelSave.add(this.lblNewLabel_20);
    JLabel lblNewLabel_21 = new JLabel("grader");
    lblNewLabel_21.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_21.setBounds(296, 277, 46, 14);
    this.panelSave.add(lblNewLabel_21);
    JLabel lblNewLabel_23 = new JLabel("mm");
    lblNewLabel_23.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_23.setBounds(296, 366, 46, 14);
    this.panelSave.add(lblNewLabel_23);
    JLabel lblNewLabel_24 = new JLabel("mm2");
    lblNewLabel_24.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_24.setBounds(296, 389, 46, 14);
    this.panelSave.add(lblNewLabel_24);
    JLabel lblNewLabel_25 = new JLabel("N  /mm2");
    lblNewLabel_25.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_25.setBounds(296, 413, 63, 14);
    this.panelSave.add(lblNewLabel_25);
    JLabel lblNewLabel_26 = new JLabel("N / mm2");
    lblNewLabel_26.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_26.setBounds(296, 444, 63, 14);
    this.panelSave.add(lblNewLabel_26);
    JLabel lblNewLabel_27 = new JLabel("N / mm2");
    lblNewLabel_27.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_27.setBounds(296, 475, 63, 14);
    this.panelSave.add(lblNewLabel_27);
    JLabel lblNewLabel_28 = new JLabel("Control");
    lblNewLabel_28.setFont(new Font("Tahoma", 1, 12));
    lblNewLabel_28.setBounds(10, 503, 46, 14);
    this.panelSave.add(lblNewLabel_28);
    JLabel lblNewLabel_29 = new JLabel("Skjærspenning normal");
    lblNewLabel_29.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_29.setBounds(34, 578, 156, 14);
    this.panelSave.add(lblNewLabel_29);
    JLabel lblNewLabel_30 = new JLabel("Skjærspenning parallelt");
    lblNewLabel_30.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_30.setBounds(34, 603, 156, 14);
    this.panelSave.add(lblNewLabel_30);
    this.textField_16 = new JTextField();
    this.textField_16.setEditable(false);
    this.textField_16.setHorizontalAlignment(0);
    this.textField_16.setBounds(200, 575, 86, 20);
    this.panelSave.add(this.textField_16);
    this.textField_16.setColumns(10);
    this.textField_15 = new JTextField();
    this.textField_15.setEditable(false);
    this.textField_15.setHorizontalAlignment(0);
    this.textField_15.setBounds(200, 600, 86, 20);
    this.panelSave.add(this.textField_15);
    this.textField_15.setColumns(10);
    this.lblNewLabel_31 = new JLabel("N / mm2");
    this.lblNewLabel_31.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_31.setBounds(296, 531, 63, 14);
    this.panelSave.add(this.lblNewLabel_31);
    this.lblNewLabel_32 = new JLabel("N / mm2");
    this.lblNewLabel_32.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_32.setBounds(296, 556, 63, 14);
    this.panelSave.add(this.lblNewLabel_32);
    this.lblNewLabel_33 = new JLabel("N / mm2");
    this.lblNewLabel_33.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_33.setBounds(296, 578, 63, 14);
    this.panelSave.add(this.lblNewLabel_33);
    this.lblNewLabel_34 = new JLabel("N / mm2");
    this.lblNewLabel_34.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_34.setBounds(296, 603, 63, 14);
    this.panelSave.add(this.lblNewLabel_34);
    this.btnNewButton = new JButton("Calculate");
    this.btnNewButton.setBackground(welditBlue);
    this.btnNewButton.setForeground(Color.WHITE);
    btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.fd = Integer.parseInt(Welding.this.textField_4.getText());
            Welding.this.amal = Integer.parseInt(Welding.this.textField_5.getText());
            Welding.this.length = Integer.parseInt(Welding.this.textField_6.getText());
            Welding.this.ang = Integer.parseInt(Welding.this.textField_7.getText());
            Welding.this.antallSveis = Integer.parseInt(Welding.this.textField_17.getText());
            Welding.this.le = (Welding.this.length - 2 * Welding.this.amal) * Welding.this.antallSveis;
            Welding.this.ae = Welding.this.amal * Welding.this.le;
            Welding.this.value4 = 0;
            double sigmannew = 1000.0D * Welding.this.fd * Math.cos(Math.PI * Welding.this.ang / 180.0D) / Welding.this.ae;
            Welding.this.sigman = (int)sigmannew;
            double sigmajnew = Math.sqrt((Welding.this.sigman * Welding.this.sigman + 3 * Welding.this.sigman * Welding.this.sigman + 3 * Welding.this.value4 * Welding.this.value4));
            Welding.this.sigmaj = (int)sigmajnew;
            double tauparnew = Welding.this.fd * 1000.0D / Welding.this.ae;
            Welding.this.taupar = (int)tauparnew;
            double value1new = Welding.this.fu * 1.0D / Welding.this.gammaM2;
            Welding.this.value1 = (int)value1new;
            double value2new = Welding.this.fu * 1.0D / Welding.this.betaw * Welding.this.gammaM2;
            Welding.this.value2 = (int)value2new;
            double value3new = Welding.this.fu * 1.0D / Welding.this.betaw * Welding.this.gammaM2 * 1.4142D;
            Welding.this.value3 = (int)value3new;
            Welding.this.value4 = Welding.this.value3;
            String t1 = " " + Welding.this.le;

            String t2 = " " +   Welding.this.ae      ;
            String t3 = " " +    Welding.this.sigman     ;
            String t4 = " " +   Welding.this.sigmaj      ;
            String t5 = " " +   Welding.this.taupar      ;
            String t6 = " " +    Welding.this.value2     ;
            String t7 = " " +     Welding.this.value1    ;
            String t8 = " " +     Welding.this.value3    ;
            String t9 = " " +     Welding.this.value4    ;
            Welding.this.textField_8.setText(t1);
            Welding.this.textField_9.setText(t2);
            Welding.this.textField_10.setText(t3);
            Welding.this.textField_12.setText(t4);
            Welding.this.textField_14.setText(t5);
            Welding.this.textField_11.setText(t6);
            Welding.this.textField_13.setText(t7);
            Welding.this.textField_16.setText(t8);
            Welding.this.textField_15.setText(t9);
            Welding.this.textA_Strength_String = Welding.this.textArea_Strength.getText();
            if (Welding.this.sigmaj <= Welding.this.value2) {
               	Welding.this.textField_25.setForeground(Color.GREEN);
              Welding.this.textField_25.setText("OK");
            } else {
            	Welding.this.textField_25.setForeground(Color.RED);
              Welding.this.textField_25.setText("NOT OK");
            } 
            if (Welding.this.sigman <= Welding.this.value1) {
               	Welding.this.textField_1.setForeground(Color.GREEN);
              Welding.this.textField_1.setText("OK");
            } else {
            	Welding.this.textField_1.setForeground(Color.RED);
              Welding.this.textField_1.setText("NOT OK");
            } 
            if (Welding.this.sigman <= Welding.this.value3) {
            	Welding.this.textField_2.setForeground(Color.GREEN);
              Welding.this.textField_2.setText("OK");
            } else {
            	Welding.this.textField_2.setForeground(Color.RED);
  
              Welding.this.textField_2.setText("NOT OK");
            } 
            if (Welding.this.sigman <= Welding.this.value4) {
             	Welding.this.textField_3.setForeground(Color.GREEN);
              Welding.this.textField_3.setText("OK");
            } else {
            	Welding.this.textField_3.setForeground(Color.RED);
              Welding.this.textField_3.setText("NOT OK");
            } 
          }
        });
    btnNewButton.setFont(new Font("Tahoma", 1, 12));
    btnNewButton.setBounds(20, 329, 253, 23);
    this.panelSave.add(btnNewButton);
    this.lblNewLabel_22 = new JLabel("Antall sveis");
    this.lblNewLabel_22.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_22.setBounds(34, 308, 117, 14);
    this.panelSave.add(this.lblNewLabel_22);
    this.textField_17 = new JTextField();
    this.textField_17.setText("2");
    this.textField_17.setHorizontalAlignment(0);
    this.textField_17.setBounds(200, 305, 86, 20);
    this.panelSave.add(this.textField_17);
    this.textField_17.setColumns(10);
    this.lblNewLabel_35 = new JLabel("Testresultat");
    this.lblNewLabel_35.setFont(new Font("Tahoma", 1, 12));
    this.lblNewLabel_35.setBounds(10, 656, 180, 14);
    this.panelSave.add(this.lblNewLabel_35);
    this.lblSpenningNormal_1 = new JLabel("Jamførspenning normal");
    this.lblSpenningNormal_1.setFont(new Font("Tahoma", 1, 11));
    this.lblSpenningNormal_1.setBounds(31, 681, 159, 20);
    this.panelSave.add(this.lblSpenningNormal_1);
    this.lblKraftDim_1 = new JLabel("Sveisespenning normal");
    this.lblKraftDim_1.setFont(new Font("Tahoma", 1, 11));
    this.lblKraftDim_1.setBounds(34, 712, 135, 20);
    this.panelSave.add(this.lblKraftDim_1);
    this.lblNewLabel_36 = new JLabel("Skjærspenning normal");
    this.lblNewLabel_36.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_36.setBounds(34, 743, 156, 14);
    this.panelSave.add(this.lblNewLabel_36);
    this.lblNewLabel_37 = new JLabel("Skjærspenning parallelt");
    this.lblNewLabel_37.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_37.setBounds(34, 777, 156, 14);
    this.panelSave.add(this.lblNewLabel_37);
    this.textField_25 = new JTextField();
    this.textField_25.setEditable(false);
    this.textField_25.setHorizontalAlignment(0);
    this.textField_25.setBounds(200, 681, 86, 20);
    this.panelSave.add(this.textField_25);
    this.textField_25.setColumns(10);
    this.textField_1 = new JTextField();
    this.textField_1.setEditable(false);
    this.textField_1.setHorizontalAlignment(0);
    this.textField_1.setBounds(200, 712, 86, 20);
    this.panelSave.add(this.textField_1);
    this.textField_1.setColumns(10);
    this.textField_2 = new JTextField();
    this.textField_2.setEditable(false);
    this.textField_2.setHorizontalAlignment(0);
    this.textField_2.setBounds(200, 740, 86, 20);
    this.panelSave.add(this.textField_2);
    this.textField_2.setColumns(10);
    this.textField_3 = new JTextField();
    this.textField_3.setEditable(false);
    this.textField_3.setHorizontalAlignment(0);
    this.textField_3.setBounds(200, 774, 86, 20);
    this.panelSave.add(this.textField_3);
    this.textField_3.setColumns(10);
    JScrollPane scrollPane_Calculation = new JScrollPane();
    scrollPane_Calculation.setBounds(384, 84, 360, 464);
    this.panelSave.add(scrollPane_Calculation);
    this.textArea_Strength = new JTextArea();
    scrollPane_Calculation.setViewportView(this.textArea_Strength);
    JLabel lblbuttspin_5 = new JLabel("Special Instruction:");
    lblbuttspin_5.setFont(new Font("Tahoma", 1, 11));
    lblbuttspin_5.setBackground(Color.WHITE);
    lblbuttspin_5.setBounds(384, 42, 117, 14);
    this.panelSave.add(lblbuttspin_5);
    ////////////////////////////////////////////////////////////Print              ///////////////////////Calm
    this.panelPrint = new JPanel();
    this.panelPrint.setBackground(Color.WHITE);
    panelBottom.add(this.panelPrint, "name_300372506230300");
    this.panelPrint.setLayout((LayoutManager)null);
    this.lblPrint = new JLabel("Spesification for cam steel");
    this.lblPrint.setBounds(49, 11, 234, 20);
    this.lblPrint.setFont(new Font("Tahoma", 1, 14));
    this.panelPrint.add(this.lblPrint);
    JLabel lblNewLabel_1 = new JLabel("Dimention 1");
    lblNewLabel_1.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_1.setBounds(10, 117, 83, 22);
    this.panelPrint.add(lblNewLabel_1);
    JLabel lblNewLabel_2 = new JLabel("Joint type");
    lblNewLabel_2.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_2.setBounds(10, 62, 83, 14);
    this.panelPrint.add(lblNewLabel_2);
    final JComboBox<String> comboBoxDimention = new JComboBox<String>();
    comboBoxDimention.setBackground(Color.WHITE);
    comboBoxDimention.setFont(new Font("Tahoma", 1, 11));
    comboBoxDimention.setMaximumRowCount(10);
    comboBoxDimention.setModel(new DefaultComboBoxModel<>(new String[] { "  ", "  8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm" }));
    comboBoxDimention.setBounds(130, 113, 117, 22);
    this.panelPrint.add(comboBoxDimention);
    final JComboBox<String> comboBoxCam2 = new JComboBox<String>();
    comboBoxCam2.setBackground(Color.WHITE);
    comboBoxCam2.setModel(new DefaultComboBoxModel<>(new String[] { "", "  8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm" }));
    comboBoxCam2.setBounds(130, 160, 117, 22);
    this.panelPrint.add(comboBoxCam2);
    final JComboBox<String> comboBoxType = new JComboBox<String>();
    comboBoxType.setBackground(Color.WHITE);
    comboBoxType.setModel(new DefaultComboBoxModel<>(new String[] { "", "Cross joint", "Lap joint", "On plate", "Strap joint" }));
    comboBoxType.setFont(new Font("Tahoma", 1, 11));
    comboBoxType.setBounds(130, 58, 117, 22);
    this.panelPrint.add(comboBoxType);
    JLabel lblSteelScaler = new JLabel("Scaler %");
    lblSteelScaler.setFont(new Font("Tahoma", 1, 11));
    lblSteelScaler.setBounds(321, 27, 58, 14);
//    this.panelPrint.add(lblSteelScaler);
    JLabel lblSteelRtate = new JLabel("Rotate");
    lblSteelRtate.setFont(new Font("Tahoma", 1, 11));
    lblSteelRtate.setBounds(321, 52, 46, 14);
//    this.panelPrint.add(lblSteelRtate);
    this.textFieldSteelScaler = new JTextField();
    this.textFieldSteelScaler.setHorizontalAlignment(0);
    this.textFieldSteelScaler.setText("100");
    this.textFieldSteelScaler.setBounds(502, 13, 159, 20);
//    this.panelPrint.add(this.textFieldSteelScaler);
    this.textFieldSteelScaler.setColumns(10);
    this.textFieldSteelRotate = new JTextField();
    this.textFieldSteelRotate.setHorizontalAlignment(0);
    this.textFieldSteelRotate.setText("0");
    this.textFieldSteelRotate.setBounds(502, 44, 159, 20);
//    this.panelPrint.add(this.textFieldSteelRotate);
    this.textFieldSteelRotate.setColumns(10);
    this.btnNewButtonCamSteel = new JButton("Generate drawing");
    this.btnNewButtonCamSteel.setBackground(welditBlue);
    this.btnNewButtonCamSteel.setForeground(Color.WHITE);
    btnNewButtonCamSteel.setFont(new Font("Tahoma", 1, 11));
    btnNewButtonCamSteel.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intcomboBoxDimention = comboBoxDimention.getSelectedIndex();
            Welding.this.intcomboBoxCam2 = comboBoxCam2.getSelectedIndex();
            Welding.this.intcomboBoxType = comboBoxType.getSelectedIndex();
            Welding.this.intRotate = Integer.parseInt(Welding.this.textFieldSteelRotate.getText());
            Welding.this.intScale = Integer.parseInt(Welding.this.textFieldSteelScaler.getText());
            Welding.this.plotType = (String)comboBoxType.getSelectedItem();
            Welding.this.textA_Cam_String = Welding.this.textArea_Cam.getText();
            if (Welding.this.chckbxWeldString_5.isSelected()) {
              Welding.this.intWeldString_5 = 1;
            } else {
              Welding.this.intWeldString_5 = 0;
            } 
            if (Welding.this.chckbxInstruction_1_5.isSelected()) {
              Welding.this.intInstruction_1_5 = 1;
            } else {
              Welding.this.intInstruction_1_5 = 0;
            } 
            if (Welding.this.chckbxbutttext_1.isSelected()) {
              Welding.this.intCamText = 1;
            } else {
              Welding.this.intCamText = 0;
            } 
            if (Welding.this.chckbxfiletdrawing_1.isSelected()) {
              Welding.this.intCamDraw = 1;
            } else {
              Welding.this.intCamDraw = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_5.isSelected()) {
              Welding.this.intCamImage = 1;
            } else {
              Welding.this.intCamImage = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_5.isSelected()) {
              Welding.this.generateOnFile = Boolean.valueOf(true);
            } else {
              Welding.this.generateOnFile = Boolean.valueOf(false);
            } 
            Welding.this.intTypeCam = Welding.this.comboBox_type_butt_2_3.getSelectedIndex();
            Welding.this.intSizeCam = Welding.this.comboBox_size_butt_5.getSelectedIndex();
            Welding.this.choosenName = Welding.this.textField_27.getText();
            Welding.this.actualPath = Welding.this.textField_21.getText();
      //      System.out.println("test " + intComboLeft + " " + intFace + "  " +intTickness + "  " + plotOK);
    		if(upperLeft) {
    			textFieldImageCA1.setBackground(Color.GRAY);
    		} else {
			textFieldImageCA1.setBackground(Color.WHITE);
		}
    		if(upperRight) {
    			textFieldImageCA2.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageCA2.setBackground(Color.WHITE);
		}
    		if(lowerLeft) {
    			textFieldImageCA3.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageCA3.setBackground(Color.WHITE);
		}
    		if(lowerRight) {
    			textFieldImageCA4.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageCA4.setBackground(Color.WHITE);
		}
            Welding.this.transParametre(Welding.this.plotType);
            Welding.this.createAndShowGUI(Welding.this.antall, Welding.this.vec);
          }
        });
    btnNewButtonCamSteel.setBounds(32, 286, 251, 23);
    this.panelPrint.add(btnNewButtonCamSteel);
    this.lblNewLabel_5 = new JLabel("Dimention 2/plate");
    this.lblNewLabel_5.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_5.setBounds(10, 160, 103, 22);
    this.panelPrint.add(this.lblNewLabel_5);
    JLabel lblNewLabel_Dimension3 = new JLabel("Dimention 3");
    lblNewLabel_Dimension3.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_Dimension3.setBackground(Color.WHITE);
    lblNewLabel_Dimension3.setBounds(10, 221, 83, 22);
    this.panelPrint.add(lblNewLabel_Dimension3);
    final JComboBox<String> comboBoxDimention3 = new JComboBox<String>();
    comboBoxDimention3.setBackground(Color.WHITE);
    comboBoxDimention3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intcomboBoxDimention3 = comboBoxDimention3.getSelectedIndex();
          }
        });
    comboBoxDimention3.setModel(new DefaultComboBoxModel<>(new String[] { "  ", "  8 mm", "10 mm", "12 mm", "16 mm", "20 mm", "25 mm", "32 mm" }));
    comboBoxDimention3.setBounds(130, 217, 117, 22);
    this.panelPrint.add(comboBoxDimention3);
    JScrollPane scrollPaneCam = new JScrollPane();
    scrollPaneCam.setBounds(20, 359, 750, 60);
    this.panelPrint.add(scrollPaneCam);
    this.textArea_Cam = new JTextArea();
    scrollPaneCam.setViewportView(this.textArea_Cam);
    JLabel lblbuttspin_6 = new JLabel("Comments:");
    lblbuttspin_6.setFont(new Font("Tahoma", 1, 11));
    lblbuttspin_6.setBackground(Color.WHITE);
    lblbuttspin_6.setBounds(10, 334, 117, 14);
    this.panelPrint.add(lblbuttspin_6);
    this.chckbx_image_butt_1_5 = new JCheckBox("Generate image on page");
    this.chckbx_image_butt_1_5.setSelected(true);
    this.chckbx_image_butt_1_5.setFont(new Font("Tahoma", 1, 11));
    this.chckbx_image_butt_1_5.setBackground(Color.WHITE);
    this.chckbx_image_butt_1_5.setBounds(321, 160, 171, 23);
//    this.panelPrint.add(this.chckbx_image_butt_1_5);
    JLabel lblNewLabel_41_3_1_1 = new JLabel("Path Name:");
    lblNewLabel_41_3_1_1.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_41_3_1_1.setBounds(321, 189, 76, 11);
//    this.panelPrint.add(lblNewLabel_41_3_1_1);
    this.textField_21 = new JTextField();
    this.textField_21.setText(pathName);
    this.textField_21.setColumns(10);
    this.textField_21.setBackground(Color.WHITE);
    this.textField_21.setBounds(502, 184, 159, 20);
 //   this.panelPrint.add(this.textField_21);
    JLabel lblNewLabel_38_2_3 = new JLabel("File Name:");
    lblNewLabel_38_2_3.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_38_2_3.setBounds(321, 218, 70, 14);
//    this.panelPrint.add(lblNewLabel_38_2_3);
    this.chckbxfiletdrawing_1 = new JCheckBox("With values on drawing");
    this.chckbxfiletdrawing_1.setSelected(true);
    this.chckbxfiletdrawing_1.setFont(new Font("Tahoma", 1, 11));
    this.chckbxfiletdrawing_1.setBackground(Color.WHITE);
    this.chckbxfiletdrawing_1.setBounds(321, 134, 162, 23);
    this.panelPrint.add(this.chckbxfiletdrawing_1);
    this.chckbxbutttext_1 = new JCheckBox("With data  text on page");
    this.chckbxbutttext_1.setFont(new Font("Tahoma", 1, 11));
    this.chckbxbutttext_1.setBackground(Color.WHITE);
    this.chckbxbutttext_1.setBounds(321, 113, 163, 23);
//    this.panelPrint.add(this.chckbxbutttext_1);
    this.textField_27 = new JTextField();
    this.textField_27.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.choosenName = Welding.this.textField_27.getText();
          }
        });
    this.textField_27.setColumns(10);
    this.textField_27.setBounds(502, 215, 159, 20);
 //   this.panelPrint.add(this.textField_27);
    JLabel lblNewLabel_39_5 = new JLabel("File Extension:");
    lblNewLabel_39_5.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_39_5.setBounds(321, 241, 86, 20);
//   this.panelPrint.add(lblNewLabel_39_5);
    this.comboBox_type_butt_2_3 = new JComboBox<String>();
    this.comboBox_type_butt_2_3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTypeCam = Welding.this.comboBox_type_butt_2_3.getSelectedIndex();
          }
        });
    this.comboBox_type_butt_2_3.setModel(new DefaultComboBoxModel<>(new String[] { "png", "gif" }));
    this.comboBox_type_butt_2_3.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_type_butt_2_3.setBackground(Color.WHITE);
    this.comboBox_type_butt_2_3.setBounds(502, 240, 159, 22);
//    this.panelPrint.add(this.comboBox_type_butt_2_3);
    JLabel lblNewLabel_40_5 = new JLabel("Screen  size:");
    lblNewLabel_40_5.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_40_5.setBounds(321, 274, 86, 20);
 //   this.panelPrint.add(lblNewLabel_40_5);
    this.comboBox_size_butt_5 = new JComboBox<String>();
    this.comboBox_size_butt_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intSizeCam = Welding.this.comboBox_size_butt_5.getSelectedIndex();
          }
        });
    this.comboBox_size_butt_5.setModel(new DefaultComboBoxModel<>(new String[] { "Standard size", "Full screen" }));
    this.comboBox_size_butt_5.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_size_butt_5.setBackground(Color.WHITE);
    this.comboBox_size_butt_5.setBounds(502, 273, 159, 22);
//    this.panelPrint.add(this.comboBox_size_butt_5);
    this.lblNewLabel_48 = new JLabel("Mouse move enabled");
    this.lblNewLabel_48.setFont(new Font("Tahoma", 1, 11));
    this.lblNewLabel_48.setBounds(321, 334, 171, 14);
//    this.panelPrint.add(this.lblNewLabel_48);
    this.comboBox_1_5 = new JComboBox<String>();
    this.comboBox_1_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intMouseCam = Welding.this.comboBox_1_5.getSelectedIndex();
          }
        });
    this.comboBox_1_5.setBackground(Color.WHITE);
    this.comboBox_1_5.setModel(new DefaultComboBoxModel<>(new String[] { "", "String drawing", "String drawing with menu" }));
    this.comboBox_1_5.setFont(new Font("Tahoma", 1, 11));
    this.comboBox_1_5.setBounds(502, 326, 159, 22);
//    this.panelPrint.add(this.comboBox_1_5);
    this.chckbxInstruction_1_5 = new JCheckBox("Witn comments on page");
    this.chckbxInstruction_1_5.setFont(new Font("Tahoma", 1, 11));
    this.chckbxInstruction_1_5.setBackground(Color.WHITE);
    this.chckbxInstruction_1_5.setBounds(320, 87, 163, 23);
 //   this.panelPrint.add(this.chckbxInstruction_1_5);
    this.chckbxWeldString_5 = new JCheckBox("Max size for weldstring");
    this.chckbxWeldString_5.setFont(new Font("Tahoma", 1, 11));
    this.chckbxWeldString_5.setBackground(Color.WHITE);
    this.chckbxWeldString_5.setBounds(321, 301, 159, 23);
//    this.panelPrint.add(this.chckbxWeldString_5);
    this.lblfourA_5 = new JLabel("Number of pictures on same screen");
    this.lblfourA_5.setFont(new Font("Tahoma", 1, 14));
    this.lblfourA_5.setBounds(10, 430, 300, 20);
    this.panelPrint.add(this.lblfourA_5);
   
    this.rdbtnfull6 = new JRadioButton("Entire screen");    // Entire screen
    this.rdbtnfull6.setBackground(Color.WHITE);
    Welding.this.rdbtnfull6.setSelected(false);
    this.rdbtnfull6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfull6.isSelected()) {
         		Welding.this.rdbtnfour1_5.setSelected(false);
              	Welding.this.rdbtnfour2_5.setSelected(false);
              	Welding.this.rdbtnfour3_5.setSelected(false);
              	Welding.this.rdbtnfour4_5.setSelected(false);
             	Welding.this.rdbtntwo1_5.setSelected(false);
              	Welding.this.rdbtntwo2_5.setSelected(false);
              	Welding.this.rdbtnhor1_5.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_5.setSelected(false);
              	Welding.this.rdbtnsingle6.setSelected(false);
            } 
          }
        });
    this.rdbtnfull6.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfull6.setBounds(600, 487, 109, 23);
    this.panelPrint.add(this.rdbtnfull6);                    //
    
    this.rdbtnsingle6 = new JRadioButton("Single");
    this.rdbtnsingle6.setBackground(Color.WHITE);
    this.rdbtnsingle6.setSelected(true);
    this.rdbtnsingle6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnsingle6.isSelected()) {
     		Welding.this.rdbtnfour1_5.setSelected(false);
              	Welding.this.rdbtnfour2_5.setSelected(false);
              	Welding.this.rdbtnfour3_5.setSelected(false);
              	Welding.this.rdbtnfour4_5.setSelected(false);
             	Welding.this.rdbtntwo1_5.setSelected(false);
              	Welding.this.rdbtntwo2_5.setSelected(false);
              	Welding.this.rdbtnhor1_5.setSelected(false);
              	Welding.this.rdbtnNewRadioButton_5.setSelected(false);
                Welding.this.rdbtnfull6.setSelected(false);
            } 
          }
        });
    this.rdbtnsingle6.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnsingle6.setBounds(600, 461, 109, 23);
    this.panelPrint.add(this.rdbtnsingle6);

    
    this.rdbtnfour1_5 = new JRadioButton("Upper left");
    this.rdbtnfour1_5.setBackground(Color.WHITE);
    this.rdbtnfour1_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour1_5.isSelected()) {
              Welding.this.rdbtnfour2_5.setSelected(false);
              Welding.this.rdbtnfour3_5.setSelected(false);
              Welding.this.rdbtnfour4_5.setSelected(false);
              Welding.this.rdbtntwo1_5.setSelected(false);
              Welding.this.rdbtntwo2_5.setSelected(false);
              Welding.this.rdbtnNewRadioButton_5.setSelected(false);
              Welding.this.rdbtnhor1_5.setSelected(false);
              Welding.this.rdbtnsingle6.setSelected(false);
              Welding.this.rdbtnfull6.setSelected(false);
      		upperLeft = true;
            } 
          }
        });
    this.rdbtnfour1_5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour1_5.setBounds(10, 461, 83, 23);
    this.panelPrint.add(this.rdbtnfour1_5);
    this.rdbtnfour3_5 = new JRadioButton("Lower left");
    this.rdbtnfour3_5.setBackground(Color.WHITE);
    this.rdbtnfour3_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour3_5.isSelected()) {
              Welding.this.rdbtnfour2_5.setSelected(false);
              Welding.this.rdbtnfour1_5.setSelected(false);
              Welding.this.rdbtnfour4_5.setSelected(false);
              Welding.this.rdbtntwo1_5.setSelected(false);
              Welding.this.rdbtntwo2_5.setSelected(false);
              Welding.this.rdbtnNewRadioButton_5.setSelected(false);
              Welding.this.rdbtnhor1_5.setSelected(false);
              Welding.this.rdbtnsingle6.setSelected(false);
              Welding.this.rdbtnfull6.setSelected(false);
      		lowerLeft = true;
            } 
          }
        });
    this.rdbtnfour3_5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour3_5.setBounds(10, 487, 83, 23);
    this.panelPrint.add(this.rdbtnfour3_5);
    this.rdbtnfour2_5 = new JRadioButton("Upper right");
    this.rdbtnfour2_5.setBackground(Color.WHITE);
    this.rdbtnfour2_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour2_5.isSelected()) {
              Welding.this.rdbtnfour1_5.setSelected(false);
              Welding.this.rdbtnfour3_5.setSelected(false);
              Welding.this.rdbtnfour4_5.setSelected(false);
              Welding.this.rdbtntwo1_5.setSelected(false);
              Welding.this.rdbtntwo2_5.setSelected(false);
              Welding.this.rdbtnNewRadioButton_5.setSelected(false);
              Welding.this.rdbtnhor1_5.setSelected(false);
              Welding.this.rdbtnsingle6.setSelected(false);
              Welding.this.rdbtnfull6.setSelected(false);
          	upperRight = true;
            } 
          }
        });
    this.rdbtnfour2_5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour2_5.setBounds(103, 461, 109, 23);
    this.panelPrint.add(this.rdbtnfour2_5);
    this.rdbtnfour4_5 = new JRadioButton("Lower right & finishing");
    this.rdbtnfour4_5.setBackground(Color.WHITE);
    this.rdbtnfour4_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnfour4_5.isSelected()) {
              Welding.this.rdbtnfour2_5.setSelected(false);
              Welding.this.rdbtnfour3_5.setSelected(false);
              Welding.this.rdbtnfour1_5.setSelected(false);
              Welding.this.rdbtntwo1_5.setSelected(false);
              Welding.this.rdbtntwo2_5.setSelected(false);
              Welding.this.rdbtnNewRadioButton_5.setSelected(false);
              Welding.this.rdbtnhor1_5.setSelected(false);
              Welding.this.rdbtnsingle6.setSelected(false);
              Welding.this.rdbtnfull6.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false; 
            } 
          }
        });
    this.rdbtnfour4_5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnfour4_5.setBounds(103, 487, 180, 23);
    this.panelPrint.add(this.rdbtnfour4_5);
    this.lblfourB_5 = new JLabel("");
    this.lblfourB_5.setFont(new Font("Tahoma", 1, 14));
    this.lblfourB_5.setBounds(262, 430, 253, 14);
    this.panelPrint.add(this.lblfourB_5);
    this.rdbtntwo1_5 = new JRadioButton("Upper");
    this.rdbtntwo1_5.setBackground(Color.WHITE);
    this.rdbtntwo1_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo1_5.isSelected()) {
              Welding.this.rdbtnfour2_5.setSelected(false);
              Welding.this.rdbtnfour3_5.setSelected(false);
              Welding.this.rdbtnfour4_5.setSelected(false);
              Welding.this.rdbtnfour1_5.setSelected(false);
              Welding.this.rdbtntwo2_5.setSelected(false);
              Welding.this.rdbtnNewRadioButton_5.setSelected(false);
              Welding.this.rdbtnhor1_5.setSelected(false);
              Welding.this.rdbtnsingle6.setSelected(false);
              Welding.this.rdbtnfull6.setSelected(false);
      		upperLeft = true;
    		upperRight = true;
            } 
          }
        });
    this.rdbtntwo1_5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo1_5.setBounds(278, 461, 109, 23);
    this.panelPrint.add(this.rdbtntwo1_5);
    this.rdbtntwo2_5 = new JRadioButton("Lower & finishing");
    this.rdbtntwo2_5.setBackground(Color.WHITE);
    this.rdbtntwo2_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtntwo2_5.isSelected()) {
              Welding.this.rdbtnfour2_5.setSelected(false);
              Welding.this.rdbtnfour3_5.setSelected(false);
              Welding.this.rdbtnfour4_5.setSelected(false);
              Welding.this.rdbtnfour1_5.setSelected(false);
              Welding.this.rdbtntwo1_5.setSelected(false);
              Welding.this.rdbtnNewRadioButton_5.setSelected(false);
              Welding.this.rdbtnhor1_5.setSelected(false);
              Welding.this.rdbtnsingle6.setSelected(false);
              Welding.this.rdbtnfull6.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtntwo2_5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtntwo2_5.setBounds(278, 487, 146, 23);
    this.panelPrint.add(this.rdbtntwo2_5);
    this.btnfilesButton_5 = new JButton("Look at images");
    this.btnfilesButton_5.setBackground(welditBlue);
    this.btnfilesButton_5.setForeground(Color.WHITE);
    this.btnfilesButton_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.intTrans = 2;
            Welding.this.lookAtImages();
          }
        });
    this.btnfilesButton_5.setFont(new Font("Tahoma", 1, 11));
    this.btnfilesButton_5.setBounds(33, 520, 127, 28);  //  598, 430, 127, 28
    this.panelPrint.add(this.btnfilesButton_5);
    this.file1_5 = new JLabel("");
    this.file1_5.setBounds(10, 609, 750, 400);
    this.panelPrint.add(this.file1_5);
    this.btnNewButton_1 = new JButton("Picture under");
    this.btnNewButton_1.setBackground(welditBlue);
    this.btnNewButton_1.setForeground(Color.WHITE);
    btnNewButton_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.lookAtPicture();
          }
        });
    btnNewButton_1.setFont(new Font("Tahoma", 1, 11));
    btnNewButton_1.setBounds(598, 469, 127, 28);
//    this.panelPrint.add(btnNewButton_1);
    this.rdbtnhor1_5 = new JRadioButton("Left");
    this.rdbtnhor1_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnhor1_5.isSelected()) {
              Welding.this.rdbtnfour2_5.setSelected(false);
              Welding.this.rdbtnfour3_5.setSelected(false);
              Welding.this.rdbtnfour4_5.setSelected(false);
              Welding.this.rdbtnfour1_5.setSelected(false);
              Welding.this.rdbtntwo1_5.setSelected(false);
              Welding.this.rdbtntwo2_5.setSelected(false);
              Welding.this.rdbtnNewRadioButton_5.setSelected(false);
              Welding.this.rdbtnsingle6.setSelected(false);
              Welding.this.rdbtnfull6.setSelected(false);
      		upperLeft = true;
    		lowerLeft = true;
            } 
          }
        });
    this.rdbtnhor1_5.setBackground(Color.WHITE);
    this.rdbtnhor1_5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnhor1_5.setBounds(451, 461, 109, 23);
    this.panelPrint.add(this.rdbtnhor1_5);
    this.rdbtnNewRadioButton_5 = new JRadioButton("Right & finishing");
    this.rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbtnNewRadioButton_5.isSelected()) {
              Welding.this.rdbtnfour2_5.setSelected(false);
              Welding.this.rdbtnfour3_5.setSelected(false);
              Welding.this.rdbtnfour4_5.setSelected(false);
              Welding.this.rdbtnfour1_5.setSelected(false);
              Welding.this.rdbtntwo1_5.setSelected(false);
              Welding.this.rdbtntwo2_5.setSelected(false);
              Welding.this.rdbtnhor1_5.setSelected(false);
              Welding.this.rdbtnsingle6.setSelected(false);
              Welding.this.rdbtnfull6.setSelected(false);
      		upperLeft = false;
    		upperRight = false;
    		lowerLeft = false;
    		lowerRight = false;
            } 
          }
        });
    this.rdbtnNewRadioButton_5.setFont(new Font("Tahoma", 1, 11));
    this.rdbtnNewRadioButton_5.setBackground(Color.WHITE);
    this.rdbtnNewRadioButton_5.setBounds(451, 487, 120, 23);
    this.panelPrint.add(this.rdbtnNewRadioButton_5);
    JLabel lblNewLabel_51 = new JLabel("4 parts");
    lblNewLabel_51.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_51.setBounds(10, 444, 46, 14);
    this.panelPrint.add(lblNewLabel_51);
    JLabel lblNewLabel_52 = new JLabel("2 horisontal parts");
    lblNewLabel_52.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_52.setBounds(278, 444, 129, 14);
    this.panelPrint.add(lblNewLabel_52);
    JLabel lblNewLabel_53 = new JLabel("2 vertical parts");
    lblNewLabel_53.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_53.setBounds(451, 444, 109, 14);
    this.panelPrint.add(lblNewLabel_53);
    JLabel lblNewLabel_530 = new JLabel("1 picture");
    lblNewLabel_530.setFont(new Font("Tahoma", 1, 11));
    lblNewLabel_530.setBounds(595, 444, 109, 14);
    this.panelPrint.add(lblNewLabel_530);
    
	lblImageCA0On = new JLabel("Indication of images in buffer");
	lblImageCA0On.setFont(new Font("Tahoma", 1, 14));
	lblImageCA0On.setBounds(50, 670, 400, 20);
	panelPrint.add(lblImageCA0On);
textFieldImageCA1 = new JTextField();
	textFieldImageCA1.setHorizontalAlignment(0);
textFieldImageCA1.setText("1");
textFieldImageCA1.setBounds(150, 700, 30, 30);
	textFieldImageCA1.setForeground(Color.RED);
textFieldImageCA1.setBackground(Color.WHITE);
	panelPrint.add(this.textFieldImageCA1);

textFieldImageCA2 = new JTextField();
	textFieldImageCA2.setHorizontalAlignment(0);
textFieldImageCA2.setText("2");
textFieldImageCA2.setBounds(180, 700, 30, 30);
	textFieldImageCA2.setForeground(Color.RED);
textFieldImageCA2.setBackground(Color.WHITE);
	panelPrint.add(this.textFieldImageCA2);

textFieldImageCA3 = new JTextField();
	textFieldImageCA3.setHorizontalAlignment(0);
textFieldImageCA3.setText("3");
textFieldImageCA3.setBounds(150, 730, 30, 30);
	textFieldImageCA3.setForeground(Color.RED);
textFieldImageCA3.setBackground(Color.WHITE);
	panelPrint.add(this.textFieldImageCA3);

textFieldImageCA4 = new JTextField();
	textFieldImageCA4.setHorizontalAlignment(0);
textFieldImageCA4.setText("4");
textFieldImageCA4.setBounds(180, 730, 30, 30);
	textFieldImageCA4.setForeground(Color.RED);
textFieldImageCA4.setBackground(Color.WHITE);
	panelPrint.add(this.textFieldImageCA4);
    
    /////////////////////////////////////////////////////////////////////////////////
    this.panelInfo = new JPanel();
    this.panelInfo.setBackground(Color.WHITE);
    this.panelInfo.setBounds(311, -249, 762, 887);
    panelBottom.add(this.panelInfo, "name_300372506230379");
    this.panelInfo.setLayout((LayoutManager)null);
 
    JLabel bilde = new JLabel("");
    Image img = new ImageIcon(this.getClass().getResource("/images/Snag_d734effny.png")).getImage();
    bilde.setIcon(new ImageIcon(img));
    bilde.setBounds(300, 10, 600, 60);  
    this.panelInfo.add(bilde);
 
    JLabel bildemenu = new JLabel("");
    Image imgmenu = new ImageIcon(this.getClass().getResource("/images/menu.png")).getImage();
    bildemenu.setIcon(new ImageIcon(imgmenu));
    bildemenu.setBounds(250, 610, 600, 20);  
  //  this.panelInfo.add(bildemenu);
    
    JLabel bilde1 = new JLabel();
    bilde1.setBounds(350, 10, 100, 30);
    
    JLabel bildeInfo = new JLabel("");
    Image imgInfo = new ImageIcon(this.getClass().getResource("/images/inf2.png")).getImage();
   bildeInfo.setIcon(new ImageIcon(imgInfo));
    bildeInfo.setBounds(0, 190, 680, 690);  
 //   this.panelInfo.add(bildeInfo);
//////////////////////////////////////////Info
   /* 
    scrollPane_Help = new JScrollPane();
    scrollPane_Help.setBounds(20, 70, 700, 600);
    panelInfo.add(scrollPane_Help);

    textArea_Help = new JTextArea();
    textArea_Help.setToolTipText("her");
    scrollPane_Help.setViewportView(textArea_Help);
  
    
   
    this.lblInfo = new JLabel("Information");
    this.lblInfo.setBackground(Color.WHITE);
    this.lblInfo.setBounds(10, 50, 100, 15);
    this.panelInfo.add(this.lblInfo);
  
    JLabel lblInfo2 = new JLabel("A Welding Procedure Specification, or WPS, is a document that serves as a guide for the effective creation of a weld that meets");
    lblInfo2.setBackground(Color.WHITE);
    lblInfo2.setBounds(10, 70, 800, 15);
    this.panelInfo.add(lblInfo2);
    JLabel lblInfo3 = new JLabel("all applicable code requirements and production standards. Think of a WPS as a recipe for welders.");
    lblInfo3.setBackground(Color.WHITE);
    lblInfo3.setBounds(10, 90, 800, 15);
    this.panelInfo.add(lblInfo3);
    JLabel lblInfo4 = new JLabel("WeldIT AS presents here a help program for generating the necessary drawing sketches of welding which can be used as ");
    lblInfo4.setBackground(Color.WHITE);
    lblInfo4.setBounds(10, 110, 800, 15);
    this.panelInfo.add(lblInfo4);
    JLabel lblInfo5 = new JLabel("documentation that the requirements of the standard have been met.  ");
    lblInfo5.setBackground(Color.WHITE);
    lblInfo5.setBounds(10, 130, 800, 15);
    this.panelInfo.add(lblInfo5);
      */
    
    
	this.btnInfoP1 = new JButton("Page 2");
	this.btnInfoP1.setBackground(welditBlue);
	this.btnInfoP1.setForeground(Color.WHITE);  

	btnInfoP1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde2a.png");
      }
    });

	btnInfoP1.setFont(new Font("Tahoma", 1, 11));
	btnInfoP1.setBounds(10, 500, 100, 30);
	this.panelInfo.add(btnInfoP1); 
	this.btnInfoP2 = new JButton("Page 3");
	this.btnInfoP2.setBackground(welditBlue);
	this.btnInfoP2.setForeground(Color.WHITE);  

	btnInfoP2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde3a.png");
      }
    });

	btnInfoP2.setFont(new Font("Tahoma", 1, 11));
	btnInfoP2.setBounds(10, 540, 100, 30);
	this.panelInfo.add(btnInfoP2); 
	
	this.btnInfoP3 = new JButton("Page 4");
	this.btnInfoP3.setBackground(welditBlue);
	this.btnInfoP3.setForeground(Color.WHITE);  

	btnInfoP3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde4a.png");
      }
    });

	btnInfoP3.setFont(new Font("Tahoma", 1, 11));
	btnInfoP3.setBounds(10, 580, 100, 30);
	this.panelInfo.add(btnInfoP3); 
	
	this.btnInfoP4 = new JButton("Page 5");
	this.btnInfoP4.setBackground(welditBlue);
	this.btnInfoP4.setForeground(Color.WHITE);  

	btnInfoP4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde5a.png");
      }
    });

	btnInfoP4.setFont(new Font("Tahoma", 1, 11));
	btnInfoP4.setBounds(10, 620, 100, 30);
	this.panelInfo.add(btnInfoP4); 
	this.btnInfoP5 = new JButton("Page 6");
	this.btnInfoP5.setBackground(welditBlue);
	this.btnInfoP5.setForeground(Color.WHITE);  

	btnInfoP5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde6a.png");
      }
    });

	btnInfoP5.setFont(new Font("Tahoma", 1, 11));
	btnInfoP5.setBounds(10, 660, 100, 30);
	this.panelInfo.add(btnInfoP5); 
	
	this.btnInfoP6 = new JButton("Page 7");
	this.btnInfoP6.setBackground(welditBlue);
	this.btnInfoP6.setForeground(Color.WHITE);  

	btnInfoP6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde7a.png");
      }
    });

	btnInfoP6.setFont(new Font("Tahoma", 1, 11));
	btnInfoP6.setBounds(10, 700, 100, 30);
	this.panelInfo.add(btnInfoP6); 
	
	this.btnInfoP7 = new JButton("Page 8");
	this.btnInfoP7.setBackground(welditBlue);
	this.btnInfoP7.setForeground(Color.WHITE);  

	btnInfoP7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde8a.png");
      }
    });

	btnInfoP7.setFont(new Font("Tahoma", 1, 11));
	btnInfoP7.setBounds(10, 740, 100, 30);
	this.panelInfo.add(btnInfoP7); 
	
	this.btnInfoP8 = new JButton("Page 9");
	this.btnInfoP8.setBackground(welditBlue);
	this.btnInfoP8.setForeground(Color.WHITE);  

	btnInfoP8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde9a.png");
      }
    });

	btnInfoP8.setFont(new Font("Tahoma", 1, 11));
	btnInfoP8.setBounds(10, 780, 100, 30);
	this.panelInfo.add(btnInfoP8); 
	
	this.btnInfoP9 = new JButton("Page 10");
	this.btnInfoP9.setBackground(welditBlue);
	this.btnInfoP9.setForeground(Color.WHITE);  

	btnInfoP9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde10a.png");
      }
    });

	btnInfoP9.setFont(new Font("Tahoma", 1, 11));
	btnInfoP9.setBounds(10, 820, 100, 30);
	this.panelInfo.add(btnInfoP9); 
	
	this.btnInfoP10 = new JButton("Page 11");
	this.btnInfoP10.setBackground(welditBlue);
	this.btnInfoP10.setForeground(Color.WHITE);  

	btnInfoP10.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
  		new Help("/images/bilde11a.png");
      }
    });

	btnInfoP10.setFont(new Font("Tahoma", 1, 11));
	btnInfoP10.setBounds(10, 860, 100, 30);
	this.panelInfo.add(btnInfoP10); 
	
    JLabel descriptionP1 = new JLabel("Description of how the program works.");
   descriptionP1.setFont(new Font("Tahoma", 1, 11));
   descriptionP1.setBounds(120, 500, 600, 30);
    this.panelInfo.add(descriptionP1);
    JLabel descriptionP2 = new JLabel("Drawing window. ");
   descriptionP2.setFont(new Font("Tahoma", 1, 11));
   descriptionP2.setBounds(120, 540, 600, 30);
    this.panelInfo.add(descriptionP2);
    JLabel descriptionP3 = new JLabel("Sting buildup.");
   descriptionP3.setFont(new Font("Tahoma", 1, 11));
   descriptionP3.setBounds(120, 580, 600, 30);
    this.panelInfo.add(descriptionP3);
    JLabel descriptionP4 = new JLabel("Delete welding string.");
   descriptionP4.setFont(new Font("Tahoma", 1, 11));
   descriptionP4.setBounds(120, 620, 600, 30);
    this.panelInfo.add(descriptionP4);
    JLabel descriptionP5 = new JLabel("Final picture on screen");
   descriptionP5.setFont(new Font("Tahoma", 1, 11));
   descriptionP5.setBounds(120, 660, 600, 30);
    this.panelInfo.add(descriptionP5);
    JLabel descriptionP6 = new JLabel("Final picture on file/paper");
   descriptionP6.setFont(new Font("Tahoma", 1, 11));
   descriptionP6.setBounds(120, 700, 600, 30);
    this.panelInfo.add(descriptionP6);
    JLabel descriptionP7 = new JLabel("Two picturs in one frame. First picture.");
   descriptionP7.setFont(new Font("Tahoma", 1, 11));
   descriptionP7.setBounds(120, 740, 600, 30);
    this.panelInfo.add(descriptionP7);
    JLabel descriptionP8 = new JLabel("Two picturs in one frame. Second picture.");
   descriptionP8.setFont(new Font("Tahoma", 1, 11));
   descriptionP8.setBounds(120, 780, 600, 30);
    this.panelInfo.add(descriptionP8);
    JLabel descriptionP9 = new JLabel("Two picturs in one frame. Both pictures.");
   descriptionP9.setFont(new Font("Tahoma", 1, 11));
   descriptionP9.setBounds(120, 820, 600, 30);
    this.panelInfo.add(descriptionP9);
    JLabel descriptionP10 = new JLabel("Four picturs in one frame.");
   descriptionP10.setFont(new Font("Tahoma", 1, 11));
   descriptionP10.setBounds(120, 860, 600, 30);
    this.panelInfo.add(descriptionP10);
    
    
    JLabel bildeInfo1 = new JLabel("");
    Image imgInfo1 = new ImageIcon(this.getClass().getResource("/images/bilde1b.png")).getImage();
    bildeInfo1.setIcon(new ImageIcon(imgInfo1));
    bildeInfo1.setBounds(100, 70, 700, 430);  
    this.panelInfo.add(bildeInfo1);
/*
    this.rdbnInfo11 = new JRadioButton(" 1");
    this.rdbnInfo11.setBackground(Color.WHITE);
    this.rdbnInfo11.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo11.setBounds(0, 170, 60, 30);
    this.panelInfo.add(this.rdbnInfo11);
    Welding.this.rdbnInfo11.setSelected(true);
    this.rdbnInfo11.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo11.isSelected()) {
                Welding.this.rdbnInfo21.setSelected(false);
                Welding.this.rdbnInfo31.setSelected(false);
                Welding.this.rdbnInfo41.setSelected(false);
                Welding.this.rdbnInfo51.setSelected(false);
                Welding.this.rdbnInfo61.setSelected(false);
                Welding.this.rdbnInfo71.setSelected(false);
                Welding.this.rdbnInfo81.setSelected(false);
                Welding.this.rdbnInfo91.setSelected(false);
            } 
          }
        });   
    this.rdbnInfo21 = new JRadioButton(" 2");
    this.rdbnInfo21.setBackground(Color.WHITE);
    this.rdbnInfo21.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo21.setBounds(70, 170, 130, 30);
    this.panelInfo.add(this.rdbnInfo21);
    this.rdbnInfo21.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo21.isSelected()) {
              Welding.this.rdbnInfo11.setSelected(false);
              Welding.this.rdbnInfo31.setSelected(false);
              Welding.this.rdbnInfo41.setSelected(false);
              Welding.this.rdbnInfo51.setSelected(false);
              Welding.this.rdbnInfo61.setSelected(false);
              Welding.this.rdbnInfo71.setSelected(false);
              Welding.this.rdbnInfo81.setSelected(false);
              Welding.this.rdbnInfo91.setSelected(false);


            } 
          }
        });
    
    this.rdbnInfo31 = new JRadioButton(" 3");
    this.rdbnInfo31.setBackground(Color.WHITE);
    this.rdbnInfo31.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo31.setBounds(140, 170, 200, 30);
    this.panelInfo.add(this.rdbnInfo31);
    this.rdbnInfo31.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo31.isSelected()) {
              Welding.this.rdbnInfo11.setSelected(false);
              Welding.this.rdbnInfo21.setSelected(false);
              Welding.this.rdbnInfo41.setSelected(false);
              Welding.this.rdbnInfo51.setSelected(false);
              Welding.this.rdbnInfo61.setSelected(false);
              Welding.this.rdbnInfo71.setSelected(false);
              Welding.this.rdbnInfo81.setSelected(false);
              Welding.this.rdbnInfo91.setSelected(false);

            } 
          }
        });
    

    this.rdbnInfo41 = new JRadioButton(" 4");
    this.rdbnInfo41.setBackground(Color.WHITE);
    this.rdbnInfo41.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo41.setBounds(210, 170, 270, 30);
    this.panelInfo.add(this.rdbnInfo41);
    this.rdbnInfo41.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo41.isSelected()) {
              Welding.this.rdbnInfo11.setSelected(false);
              Welding.this.rdbnInfo21.setSelected(false);
              Welding.this.rdbnInfo31.setSelected(false);
              Welding.this.rdbnInfo51.setSelected(false);
              Welding.this.rdbnInfo61.setSelected(false);
              Welding.this.rdbnInfo71.setSelected(false);
              Welding.this.rdbnInfo81.setSelected(false);
              Welding.this.rdbnInfo91.setSelected(false);

            } 
          }
        });
    
    this.rdbnInfo51 = new JRadioButton(" 5");
    this.rdbnInfo51.setBackground(Color.WHITE);
    this.rdbnInfo51.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo51.setBounds(280, 170, 340, 30);
    this.panelInfo.add(this.rdbnInfo51);
    this.rdbnInfo51.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo51.isSelected()) {
              Welding.this.rdbnInfo11.setSelected(false);
              Welding.this.rdbnInfo21.setSelected(false);
              Welding.this.rdbnInfo31.setSelected(false);
              Welding.this.rdbnInfo41.setSelected(false);
              Welding.this.rdbnInfo61.setSelected(false);
              Welding.this.rdbnInfo71.setSelected(false);
              Welding.this.rdbnInfo81.setSelected(false);
              Welding.this.rdbnInfo91.setSelected(false);

            } 
          }
        });
    
    this.rdbnInfo61 = new JRadioButton(" 6");
    this.rdbnInfo61.setBackground(Color.WHITE);
    this.rdbnInfo61.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo61.setBounds(350, 170, 410, 30);
    this.panelInfo.add(this.rdbnInfo61);
    this.rdbnInfo61.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo61.isSelected()) {
              Welding.this.rdbnInfo11.setSelected(false);
              Welding.this.rdbnInfo21.setSelected(false);
              Welding.this.rdbnInfo31.setSelected(false);
              Welding.this.rdbnInfo41.setSelected(false);
              Welding.this.rdbnInfo51.setSelected(false);
              Welding.this.rdbnInfo71.setSelected(false);
              Welding.this.rdbnInfo81.setSelected(false);
              Welding.this.rdbnInfo91.setSelected(false);

            } 
          }
        });
    
    this.rdbnInfo71 = new JRadioButton(" 7");
    this.rdbnInfo71.setBackground(Color.WHITE);
    this.rdbnInfo71.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo71.setBounds(420, 170, 480, 30);
    this.panelInfo.add(this.rdbnInfo71);
    this.rdbnInfo71.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo71.isSelected()) {
              Welding.this.rdbnInfo11.setSelected(false);
              Welding.this.rdbnInfo21.setSelected(false);
              Welding.this.rdbnInfo31.setSelected(false);
              Welding.this.rdbnInfo41.setSelected(false);
              Welding.this.rdbnInfo51.setSelected(false);
              Welding.this.rdbnInfo61.setSelected(false);
              Welding.this.rdbnInfo81.setSelected(false);
              Welding.this.rdbnInfo91.setSelected(false);

            } 
          }
        });
    
    this.rdbnInfo81 = new JRadioButton(" 8");
    this.rdbnInfo81.setBackground(Color.WHITE);
    this.rdbnInfo81.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo81.setBounds(490, 170, 550, 30);
    this.panelInfo.add(this.rdbnInfo81);
    this.rdbnInfo81.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo81.isSelected()) {
              Welding.this.rdbnInfo11.setSelected(false);
              Welding.this.rdbnInfo21.setSelected(false);
              Welding.this.rdbnInfo31.setSelected(false);
              Welding.this.rdbnInfo41.setSelected(false);
              Welding.this.rdbnInfo51.setSelected(false);
              Welding.this.rdbnInfo61.setSelected(false);
              Welding.this.rdbnInfo71.setSelected(false);
              Welding.this.rdbnInfo91.setSelected(false);

            } 
          }
        });

    this.rdbnInfo91 = new JRadioButton(" 9");
    this.rdbnInfo91.setBackground(Color.WHITE);
    this.rdbnInfo91.setFont(new Font("Tahoma", 1, 11));
    this.rdbnInfo91.setBounds(560, 170, 620, 30);
    this.panelInfo.add(this.rdbnInfo91);
    this.rdbnInfo91.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (Welding.this.rdbnInfo91.isSelected()) {
              Welding.this.rdbnInfo11.setSelected(false);
              Welding.this.rdbnInfo21.setSelected(false);
              Welding.this.rdbnInfo31.setSelected(false);
              Welding.this.rdbnInfo41.setSelected(false);
              Welding.this.rdbnInfo51.setSelected(false);
              Welding.this.rdbnInfo61.setSelected(false);
              Welding.this.rdbnInfo71.setSelected(false);
              Welding.this.rdbnInfo81.setSelected(false);

            } 
          }
        });
    
    if (  Welding.this.rdbnInfo11.isSelected()) {
    	System.out.println("første valgt");
    	new Help("inf2.png");
    	
    }
   */ 
 //   JLabel lblInfo6 = new JLabel("At the start of the program, the type of welding is selected by pressing the appropriate tab at the top of the page. ");
    JLabel lblInfo6 = new JLabel("Under is an introduction to the program given. Choose one of the buttons to choose actual page number:");
    lblInfo6.setBackground(Color.WHITE);
    lblInfo6.setBounds(10, 150, 800, 15);
 //   this.panelInfo.add(lblInfo6);
    /*
    JLabel lblInfo7 = new JLabel("Then the actual parameters for the weld must be selected. There are also some options where you can choose whether text  ");
    lblInfo7.setBackground(Color.WHITE);
    lblInfo7.setBounds(10, 200, 800, 15);
    this.panelInfo.add(lblInfo7);
    JLabel lblInfo8 = new JLabel("should be generated on the drawing."
    		+ ".  ");
    lblInfo8.setBackground(Color.WHITE);
    lblInfo8.setBounds(10, 220, 800, 15);
    this.panelInfo.add(lblInfo8);
    JLabel lblInfo9 = new JLabel("The file name consists of path name and file name as well as extension.  ");
    lblInfo9.setBackground(Color.WHITE);
    lblInfo9.setBounds(10, 250, 800, 15);
   // this.panelInfo.add(lblInfo9);
    JLabel lblInfo10 = new JLabel("The name of the path will depend on which operating system is used.  ");
    lblInfo10.setBackground(Color.WHITE);
    lblInfo10.setBounds(10, 270, 800, 15);
 //   this.panelInfo.add(lblInfo10);
    JLabel lblInfo11 = new JLabel("The screen size is also given as an option, with Standard size as standard. ");
    lblInfo11.setBackground(Color.WHITE);
    lblInfo11.setBounds(10, 300, 800, 15);
    this.panelInfo.add(lblInfo11);
    JLabel lblInfo12 = new JLabel("There is also an option to be able to generate 2 or 4 images on the same sheet. These images have png as file extension ");
    lblInfo12.setBackground(Color.WHITE);
    lblInfo12.setBounds(10, 330, 800, 15);
    this.panelInfo.add(lblInfo12);
    JLabel lblInfo13 = new JLabel("since transparency is required, and they are generated together.");
    lblInfo13.setBackground(Color.WHITE);
    lblInfo13.setBounds(10, 350, 800, 15);
    this.panelInfo.add(lblInfo13);
    JLabel lblInfo14 = new JLabel("It will be possible to draw in welding strings with the help of the mouse. ");
    lblInfo14.setBackground(Color.WHITE);
    lblInfo14.setBounds(10, 380, 800, 15);
    this.panelInfo.add(lblInfo14);
    JLabel lblInfo15 = new JLabel(" NB! Left mouse button, middle and right mouse button have different functions. ");
    lblInfo15.setBackground(Color.WHITE);
    lblInfo15.setBounds(10, 400, 800, 15);
    this.panelInfo.add(lblInfo15);
    JLabel lblInfo16 = new JLabel(" Right mouse button : Clicking the right mouse button three times gives points to be able to generate a Bezier curve ");
    lblInfo16.setBackground(Color.WHITE);
    lblInfo16.setBounds(30, 420, 800, 15);
    this.panelInfo.add(lblInfo16);
    JLabel lblInfo17 = new JLabel("start point, bezier point and end point  ");
    lblInfo17.setBackground(Color.WHITE);
    lblInfo17.setBounds(100, 440, 800, 15);
    this.panelInfo.add(lblInfo17);
    JLabel lblInfo18 = new JLabel(" The three points are marked by small circles and act as activation points for the welding curve (the object) ");
    lblInfo18.setBackground(Color.WHITE);
    lblInfo18.setBounds(100, 460, 800, 15);
    this.panelInfo.add(lblInfo18);
    JLabel lblInfo19 = new JLabel(" Middle mouse button (or mouse wheel): Clicking the middle mouse button when the mouse is in one of the activation  ");
    lblInfo19.setBackground(Color.WHITE);
    lblInfo19.setBounds(30, 480, 800, 15);
    this.panelInfo.add(lblInfo19);
    JLabel lblInfo20 = new JLabel("points deletes the object (welding curve) ");
    lblInfo20.setBackground(Color.WHITE);
    lblInfo20.setBounds(100, 500, 800, 15);
    this.panelInfo.add(lblInfo20);
    JLabel lblInfo21 = new JLabel("Left mouse button : By placing the mouse in an activation point and dragging the mouse with the left button down,  ");
    lblInfo21.setBackground(Color.WHITE);
    lblInfo21.setBounds(30, 520, 800, 15);
    this.panelInfo.add(lblInfo21);
    JLabel lblInfo22 = new JLabel("the welding curve will move (change shape)");
    lblInfo22.setBackground(Color.WHITE);
    lblInfo22.setBounds(100, 540, 800, 15);
    this.panelInfo.add(lblInfo22);
    JLabel lblInfo36 = new JLabel("Take care! Don't move activation circles over other activation circles. (Will change activation)");
    lblInfo36.setBackground(Color.WHITE);
    lblInfo36.setBounds(100, 560, 800, 15);
    this.panelInfo.add(lblInfo36);
    JLabel lblInfo23 = new JLabel("Files that are generated will automatically be placed in the default file path. ");
    lblInfo23.setBackground(Color.WHITE);
    lblInfo23.setBounds(10, 590, 800, 15);
    this.panelInfo.add(lblInfo23);
    JLabel lblInfo24 = new JLabel("The default for Windows is C:/userID/userID_.png ");
    lblInfo24.setBackground(Color.WHITE);
    lblInfo24.setBounds(10, 610, 800, 15);
//  this.panelInfo.add(lblInfo24);
    JLabel lblInfo25 = new JLabel("The default is set by starting parameters in the program. ");
    lblInfo25.setBackground(Color.WHITE);
    lblInfo25.setBounds(10, 630, 800, 15);
    this.panelInfo.add(lblInfo25);
  
 //   JLabel lblInfo26 = new JLabel("(weld.jar arg1 arg2 ) where arg1 = userID and arg2 = C:/ or /tmp for Unix and Mac ");
    JLabel lblInfo26 = new JLabel("You can switch mode of the mouse by clicking in the field D, E and M");
    lblInfo26.setBackground(Color.WHITE);
    lblInfo26.setBounds(10, 650, 800, 15);
   this.panelInfo.add(lblInfo26);
//    JLabel lblInfo27 = new JLabel("If the file does not exist it will be created, if it exists it will be overwritten. ");
    JLabel lblInfo27 = new JLabel("D for Draw, E for Erase and M for move. Standard is D ");
    lblInfo27.setBackground(Color.WHITE);
    lblInfo27.setBounds(10, 670, 800, 15);
    this.panelInfo.add(lblInfo27);
    JLabel lblInfo28 = new JLabel("It is possible to go into the file system and look at the file or to click on the tab 'Look at images'  ");
    lblInfo28.setBackground(Color.WHITE);
    lblInfo28.setBounds(10, 690, 800, 15);
    this.panelInfo.add(lblInfo28);
    JLabel lblInfo29 = new JLabel("where you can see the last four files that have been generated. ");
    lblInfo29.setBackground(Color.WHITE);
    lblInfo29.setBounds(10, 710, 800, 15);
    this.panelInfo.add(lblInfo29);
    JLabel lblInfo30 = new JLabel("The file name and file content appear on the screen.");
    lblInfo30.setBackground(Color.WHITE);
    lblInfo30.setBounds(10, 730, 800, 15);
    this.panelInfo.add(lblInfo30);
    JLabel lblInfo31 = new JLabel(" By selecting the 'Transfer image' button, information about the file will integrated in the documetation.  ");
    lblInfo31.setBackground(Color.WHITE);
    lblInfo31.setBounds(10, 750, 800, 15);
    this.panelInfo.add(lblInfo31);
//    JLabel lblInfo32 = new JLabel("Sending 'POST' request to URL : http://weldit.weldit.no/NewfileAPI  ");
    JLabel lblInfo32 = new JLabel("This web page will automtic pick up the message and place the file in the right place. ");
    lblInfo32.setBackground(Color.WHITE);
    lblInfo32.setBounds(30, 770, 800, 15);
   this.panelInfo.add(lblInfo32);
 //   JLabel lblInfo33 = new JLabel("Post parameters : name=C:\\userID\\IDuserID_a1.png&password=userID&_token=null ");
   JLabel lblInfo33 = new JLabel(""); 
   lblInfo33.setBackground(Color.WHITE);
    lblInfo33.setBounds(30, 790, 800, 15);
  //  this.panelInfo.add(lblInfo33);
 //   JLabel lblInfo34 = new JLabel("Response Code : 301 ");
    JLabel lblInfo34 = new JLabel("The field marked F indikate finish drawing ang that you can change the");
    lblInfo34.setBackground(Color.WHITE);
    lblInfo34.setBounds(30, 810, 800, 15);
    this.panelInfo.add(lblInfo34);
    JLabel lblInfo35 = new JLabel("indikators on the welding string you have generated. ");
    lblInfo35.setBackground(Color.WHITE);
    lblInfo35.setBounds(10, 830, 800, 15);
    this.panelInfo.add(lblInfo35);
    */
  }
  
  private void setIconImage(Image icon) {
	// TODO Auto-generated method stub
	
}

private void action() {
    this.btnInfo.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.panelInfo.setVisible(true);
            Welding.this.panelButt.setVisible(false);
            Welding.this.panelFilet.setVisible(false);
            Welding.this.panelCorner.setVisible(false);
            Welding.this.panelOverlap.setVisible(false);
            Welding.this.panelFlanged.setVisible(false);
            Welding.this.panelSave.setVisible(false);
            Welding.this.panelPrint.setVisible(false);
          }
        });
    this.btnButtWeld.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.panelInfo.setVisible(false);
            Welding.this.panelButt.setVisible(true);
            Welding.this.panelFilet.setVisible(false);
            Welding.this.panelCorner.setVisible(false);
            Welding.this.panelOverlap.setVisible(false);
            Welding.this.panelFlanged.setVisible(false);
            Welding.this.panelSave.setVisible(false);
            Welding.this.panelPrint.setVisible(false);
          }
          
          private void action() {
            Welding.this.btnInfo.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
          			panelInfo.setVisible(true);
        			panelButt.setVisible(false);
        			panelFilet.setVisible(false);
        			panelCorner.setVisible(false);
        			panelOverlap.setVisible(false);
        			panelFlanged.setVisible(false);
        			panelSave.setVisible(false);
        			panelPrint.setVisible(false);
                  }
                });
            Welding.this.btnButtWeld.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
          			panelInfo.setVisible(false);
        			panelButt.setVisible(true);
        			panelFilet.setVisible(false);
        			panelCorner.setVisible(false);
        			panelOverlap.setVisible(false);
        			panelFlanged.setVisible(false);
        			panelSave.setVisible(false);
        			panelPrint.setVisible(false);
                  }
                });
            Welding.this.btnFiletWeld.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
  					panelInfo.setVisible(false);
  					panelButt.setVisible(false);
  					panelFilet.setVisible(true);
  					panelCorner.setVisible(false);
  					panelOverlap.setVisible(false);
  					panelFlanged.setVisible(false);
  					panelSave.setVisible(false);
  					panelPrint.setVisible(false);
                  }
                });
            Welding.this.btnCornerWeld.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
  					panelInfo.setVisible(false);
  					panelButt.setVisible(false);
  					panelFilet.setVisible(false);
  					panelCorner.setVisible(true);
  					panelOverlap.setVisible(false);
  					panelFlanged.setVisible(false);
  					panelSave.setVisible(false);
  					panelPrint.setVisible(false);
                  }
                });
            Welding.this.btnOverlapWeld.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
  					panelInfo.setVisible(false);
  					panelButt.setVisible(false);
  					panelFilet.setVisible(false);
  					panelCorner.setVisible(false);
  					panelOverlap.setVisible(true);
  					panelFlanged.setVisible(false);
  					panelSave.setVisible(false);
  					panelPrint.setVisible(false);
                  }
                });
            Welding.this.btnFlaggedWeld.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
  					panelInfo.setVisible(false);
  					panelButt.setVisible(false);
  					panelFilet.setVisible(false);
  					panelCorner.setVisible(false);
  					panelOverlap.setVisible(false);
  					panelFlanged.setVisible(true);
  					panelSave.setVisible(false);
  					panelPrint.setVisible(false);
                  }
                });
            Welding.this.btnSave.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
  					panelInfo.setVisible(false);
  					panelButt.setVisible(false);
  					panelFilet.setVisible(false);
  					panelCorner.setVisible(false);
  					panelOverlap.setVisible(false);
  					panelFlanged.setVisible(false);
  					panelSave.setVisible(true);
  					panelPrint.setVisible(false);
                  }
                });
            Welding.this.btnPrint.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
  					panelInfo.setVisible(false);
  					panelButt.setVisible(false);
  					panelFilet.setVisible(false);
  					panelCorner.setVisible(false);
  					panelOverlap.setVisible(false);
  					panelFlanged.setVisible(false);
  					panelSave.setVisible(false);
  					panelPrint.setVisible(true);
                  }
                });
            Welding.this.btnLeftDesignValues.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
  					
  					intGap = Integer.parseInt(textFieldGap.getText( ));
  					intDy = Integer.parseInt(textFieldDy.getText( ));
  					intTickness = Integer.parseInt(textFieldTickness.getText( ));
  					intTopAngle = Integer.parseInt(textFieldTopAngle.getText( ));
  					intTopRadius = Integer.parseInt(textFieldTopRadius.getText( ));
  					intBottomAngle = Integer.parseInt(textFieldBottomAngle.getText( ));
  					intBottomRadius = Integer.parseInt(textFieldBottomRadius.getText( ));
  					intFace = Integer.parseInt(textFieldFace.getText( ));
  					intCenter = Integer.parseInt(textFieldCenter.getText( ));
  					intMouseCam       = comboBox_1_5.getSelectedIndex();
  					choosenName = textField_27.getText();
  				  	actualPath = textField_18.getText( );
  					transParametre(plotType);
  					createAndShowGUI(antall, vec); // plotter in new frame
                  }
                });
          }
        });
    this.btnFiletWeld.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.panelInfo.setVisible(false);
            Welding.this.panelButt.setVisible(false);
            Welding.this.panelFilet.setVisible(true);
            Welding.this.panelCorner.setVisible(false);
            Welding.this.panelOverlap.setVisible(false);
            Welding.this.panelFlanged.setVisible(false);
            Welding.this.panelSave.setVisible(false);
            Welding.this.panelPrint.setVisible(false);
          }
        });
    this.btnCornerWeld.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.panelInfo.setVisible(false);
            Welding.this.panelButt.setVisible(false);
            Welding.this.panelFilet.setVisible(false);
            Welding.this.panelCorner.setVisible(true);
            Welding.this.panelOverlap.setVisible(false);
            Welding.this.panelFlanged.setVisible(false);
            Welding.this.panelSave.setVisible(false);
            Welding.this.panelPrint.setVisible(false);
          }
        });
    this.btnOverlapWeld.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.panelInfo.setVisible(false);
            Welding.this.panelButt.setVisible(false);
            Welding.this.panelFilet.setVisible(false);
            Welding.this.panelCorner.setVisible(false);
            Welding.this.panelOverlap.setVisible(true);
            Welding.this.panelFlanged.setVisible(false);
            Welding.this.panelSave.setVisible(false);
            Welding.this.panelPrint.setVisible(false);
          }
        });
    this.btnFlaggedWeld.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.panelInfo.setVisible(false);
            Welding.this.panelButt.setVisible(false);
            Welding.this.panelFilet.setVisible(false);
            Welding.this.panelCorner.setVisible(false);
            Welding.this.panelOverlap.setVisible(false);
            Welding.this.panelFlanged.setVisible(true);
            Welding.this.panelSave.setVisible(false);
            Welding.this.panelPrint.setVisible(false);
          }
        });
    this.btnSave.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.panelInfo.setVisible(false);
            Welding.this.panelButt.setVisible(false);
            Welding.this.panelFilet.setVisible(false);
            Welding.this.panelCorner.setVisible(false);
            Welding.this.panelOverlap.setVisible(false);
            Welding.this.panelFlanged.setVisible(false);
            Welding.this.panelSave.setVisible(true);
            Welding.this.panelPrint.setVisible(false);
          }
        });
    this.btnPrint.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.panelInfo.setVisible(false);
            Welding.this.panelButt.setVisible(false);
            Welding.this.panelFilet.setVisible(false);
            Welding.this.panelCorner.setVisible(false);
            Welding.this.panelOverlap.setVisible(false);
            Welding.this.panelFlanged.setVisible(false);
            Welding.this.panelSave.setVisible(false);
            Welding.this.panelPrint.setVisible(true);
          }
        });
    this.btnLeftDesignValues.addActionListener(new ActionListener() {
          private AbstractButton chckbx_image_butt;
          
          public void actionPerformed(ActionEvent e) {
            Welding.this.plotType = "Butt";
            Welding.this.intGap = Integer.parseInt(Welding.this.textFieldGap.getText());
            Welding.this.intDy = Integer.parseInt(Welding.this.textFieldDy.getText());
            Welding.this.intTickness = Integer.parseInt(Welding.this.textFieldTickness.getText());
            Welding.this.intTopAngle = Integer.parseInt(Welding.this.textFieldTopAngle.getText());
            Welding.this.intTopRadius = Integer.parseInt(Welding.this.textFieldTopRadius.getText());
            Welding.this.intBottomAngle = Integer.parseInt(Welding.this.textFieldBottomAngle.getText());
            Welding.this.intBottomRadius = Integer.parseInt(Welding.this.textFieldBottomRadius.getText());
            Welding.this.intFace = Integer.parseInt(Welding.this.textFieldFace.getText());
            Welding.this.intCenter = Integer.parseInt(Welding.this.textFieldCenter.getText());
            Welding.this.intComboLeft = Welding.this.comboBoxLeftDesign.getSelectedIndex();
            Welding.this.intButtScaler = Integer.parseInt(Welding.this.textFieldButtScaler.getText());
            Welding.this.intButtRotate = Integer.parseInt(Welding.this.textFieldButtRotate.getText());
            if (Welding.this.intCenter > Welding.this.intTickness)
              Welding.this.intCenter = Welding.this.intTickness; 
            if (Welding.this.chckbxInstruction_1.isSelected()) {
              Welding.this.intInstruction_1 = 1;
            } else {
              Welding.this.intInstruction_1 = 0;
            } 
            if (Welding.this.chckbxWeldString.isSelected()) {
              Welding.this.intWeldString = 1;
            } else {
              Welding.this.intWeldString = 0;
            } 
            if (Welding.this.chckbxbutttext.isSelected()) {
              Welding.this.intButtText = 1;
            } else {
              Welding.this.intButtText = 0;
            } 
            if (Welding.this.chckbxDawing_1.isSelected()) {
              Welding.this.intButtDraw = 1;
            } else {
              Welding.this.intButtDraw = 0;
            } 
            if (Welding.this.chckbx_image_butt_1.isSelected()) {
              Welding.this.intButtImage = 1;
            } else {
              Welding.this.intButtImage = 0;
            } 
            if (Welding.this.chckbx_image_butt_1.isSelected()) {
              Welding.this.generateOnFile = Boolean.valueOf(true);
            } else {
              Welding.this.generateOnFile = Boolean.valueOf(false);
            } 
            Welding.this.intTypeButt = Welding.this.comboBox_type_butt.getSelectedIndex();
            Welding.this.intSizeButt = Welding.this.comboBox_size_butt.getSelectedIndex();
            Welding.this.actualPath = Welding.this.txtC.getText();
            if (Welding.this.intSizeButt == 1)
              Welding.this.intSizeButt = 14; 
            Welding.this.choosenName = Welding.this.textField_fileName_butt.getText();
            Welding.this.textA_Butt_String = Welding.this.textArea_Butt.getText();
            Welding.this.textA_Butt = Welding.this.textArea_Butt.getText();
            if (Welding.this.rdbtnfour1.isSelected())
              Welding.this.intSizeButt = 7; 
            if (Welding.this.rdbtnfour2.isSelected())
              Welding.this.intSizeButt = 8; 
            if (Welding.this.rdbtnfour3.isSelected())
              Welding.this.intSizeButt = 9; 
            if (Welding.this.rdbtnfour4.isSelected())
              Welding.this.intSizeButt = 10; 
            if (Welding.this.rdbtntwo1.isSelected())
              Welding.this.intSizeButt = 11; 
            if (Welding.this.rdbtntwo2.isSelected())
              Welding.this.intSizeButt = 12; 
            if (Welding.this.rdbtnNewRadioButton_6.isSelected())
              Welding.this.intSizeButt = 16; 
            if (Welding.this.rdbtnhor1_6.isSelected())
              Welding.this.intSizeButt = 15; 
            if (Welding.this.rdbtnfull1.isSelected())
                Welding.this.intSizeButt = 14; 

            Welding.this.transParametre(Welding.this.plotType);
            Welding.this.createAndShowGUI(Welding.this.antall, Welding.this.vec);
          }
        });
    this.btnGenerateRightSideValues.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.plotType = "butt";
            Welding.this.intGapRight = Integer.parseInt(Welding.this.textFieldGapRight.getText());
            Welding.this.intDyRight = Integer.parseInt(Welding.this.textFieldDyRight.getText());
            Welding.this.intTicknessRight = Integer.parseInt(Welding.this.textFieldTicknessRight.getText());
            Welding.this.intTopAngleRight = Integer.parseInt(Welding.this.textFieldTopAngleRight.getText());
            Welding.this.intTopRadiusRight = Integer.parseInt(Welding.this.textFieldTopRadiusRight.getText());
            Welding.this.intBottomAngleRight = Integer.parseInt(Welding.this.textFieldBottomAngleRight.getText());
            Welding.this.intBottomRadiusRight = Integer.parseInt(Welding.this.textFieldBottomRadiusRight.getText());
            Welding.this.intFaceRight = Integer.parseInt(Welding.this.textFieldFaceRight.getText());
            Welding.this.intCenterRight = Integer.parseInt(Welding.this.textFieldCenterRight.getText());
            Welding.this.intComboRight = Welding.this.comboBoxRightDesign.getSelectedIndex();
            Welding.this.intButtScaler = Integer.parseInt(Welding.this.textFieldButtScaler.getText());
            Welding.this.intButtRotate = Integer.parseInt(Welding.this.textFieldButtRotate.getText());
            Welding.this.intTypeButt = Welding.this.comboBox_type_butt.getSelectedIndex();
            Welding.this.intSizeButt = Welding.this.comboBox_size_butt.getSelectedIndex();
            if (Welding.this.intCenterRight > Welding.this.intTicknessRight)
              Welding.this.intCenterRight = Welding.this.intTicknessRight; 
            if (Welding.this.chckbxInstruction_1.isSelected()) {
              Welding.this.intInstruction_1 = 1;
            } else {
              Welding.this.intInstruction_1 = 0;
            } 
            if (Welding.this.chckbxWeldString.isSelected()) {
              Welding.this.intWeldString = 1;
            } else {
              Welding.this.intWeldString = 0;
            } 
            if (Welding.this.chckbxbutttext.isSelected()) {
              Welding.this.intButtText = 1;
            } else {
              Welding.this.intButtText = 0;
            } 
            if (Welding.this.chckbxDawing_1.isSelected()) {
              Welding.this.intButtDraw = 1;
            } else {
              Welding.this.intButtDraw = 0;
            } 
            if (Welding.this.chckbx_image_butt_1.isSelected()) {
              Welding.this.intButtImage = 1;
            } else {
              Welding.this.intButtImage = 0;
            } 
            if (Welding.this.chckbx_image_butt_1.isSelected()) {
              Welding.this.generateOnFile = Boolean.valueOf(true);
            } else {
              Welding.this.generateOnFile = Boolean.valueOf(false);
            } 
            Welding.this.intTypeButt = Welding.this.comboBox_type_butt.getSelectedIndex();
            Welding.this.intSizeButt = Welding.this.comboBox_size_butt.getSelectedIndex();
            Welding.this.textA_Butt_String = Welding.this.textArea_Butt.getText();
            Welding.this.choosenName = Welding.this.textField_fileName_butt.getText();
            Welding.this.actualPath = Welding.this.txtC.getText();
            if (Welding.this.intSizeButt == 1)
              Welding.this.intSizeButt = 14; 
            if (Welding.this.rdbtnfour1.isSelected())
              Welding.this.intSizeButt = 7; 
            if (Welding.this.rdbtnfour2.isSelected())
              Welding.this.intSizeButt = 8; 
            if (Welding.this.rdbtnfour3.isSelected())
              Welding.this.intSizeButt = 9; 
            if (Welding.this.rdbtnfour4.isSelected())
              Welding.this.intSizeButt = 10; 
            if (Welding.this.rdbtntwo1.isSelected())
              Welding.this.intSizeButt = 11; 
            if (Welding.this.rdbtntwo2.isSelected())
              Welding.this.intSizeButt = 12; 
            if (Welding.this.rdbtnNewRadioButton_6.isSelected())
              Welding.this.intSizeButt = 16; 
            if (Welding.this.rdbtnhor1_6.isSelected())
              Welding.this.intSizeButt = 15; 
            if (Welding.this.rdbtnfull1.isSelected())
                Welding.this.intSizeButt = 14; 

    		if(upperLeft) {
    			textFieldImage1.setBackground(Color.GRAY);
    		} else {
    			textFieldImage1.setBackground(Color.WHITE);
    		}
    		if(upperRight) {
    			textFieldImage2.setBackground(Color.GRAY);
    		} else {
    		       textFieldImage2.setBackground(Color.WHITE);
		}
    		if(lowerLeft) {
    			textFieldImage3.setBackground(Color.GRAY);
    		 } else {
    			 textFieldImage3.setBackground(Color.WHITE);
		}
    		if(lowerRight) {
    			textFieldImage4.setBackground(Color.GRAY);
    		  } else {
			textFieldImage4.setBackground(Color.WHITE);
		}
            Welding.this.transParametre(Welding.this.plotType);     
            
            Welding.this.createAndShowGUI(Welding.this.antall, Welding.this.vec);
          }
        });
    this.btnGenerateFilet.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.plotType = "filet";
    //        intAngleFilet = 90;

            
            Welding.this.intGapFilet = Integer.parseInt(Welding.this.textFieldGapFilet.getText());
            Welding.this.intAngleFilet = Integer.parseInt(Welding.this.textFieldAngleFilet.getText());
            Welding.this.intBottomasideFilet = Integer.parseInt(Welding.this.textFieldBottomaside.getText());
            Welding.this.intTopasideFilet = Integer.parseInt(Welding.this.textFieldTopaside.getText());
            Welding.this.intBottomFilet = Integer.parseInt(Welding.this.textFieldTicknessBottomFilet.getText());
            Welding.this.intTopFilet = Integer.parseInt(Welding.this.textFieldTopFilet.getText());
            Welding.this.intTopAngleFilet = Integer.parseInt(Welding.this.textFieldTopAngleFilet.getText());
            Welding.this.intTopRadiusFilet = Integer.parseInt(Welding.this.textFieldTopRadiusFilet.getText());
            Welding.this.intBottomAngleFilet = Integer.parseInt(Welding.this.textFieldBottomAngleFilet.getText());
            Welding.this.intBottomRadiusFilet = Integer.parseInt(Welding.this.textFieldBottomRadiusFilet.getText());
            Welding.this.intFaceFilet = Integer.parseInt(Welding.this.textFieldFaceFilet.getText());
            Welding.this.intCenterFilet = Integer.parseInt(Welding.this.textFieldCenterFilet.getText());
            Welding.this.intFiletScaler = Integer.parseInt(Welding.this.textFieldFiletScaler.getText());
            Welding.this.intFiletRotate = Integer.parseInt(Welding.this.textFieldFiletRotate.getText());
            Welding.this.choosenName = Welding.this.textField_22.getText();
            if (Welding.this.intCenterFilet > Welding.this.intTopFilet)
              Welding.this.intCenterFilet = Welding.this.intTopFilet; 
            if (Welding.this.chckbxInstruction_1_1.isSelected()) {
              Welding.this.intInstruction_1_1 = 1;
            } else {
              Welding.this.intInstruction_1_1 = 0;
            } 
            if (Welding.this.chckbxWeldString_1.isSelected()) {
              Welding.this.intWeldString_1 = 1;
            } else {
              Welding.this.intWeldString_1 = 0;
            } 
            if (Welding.this.chckbxfilettext.isSelected()) {
              Welding.this.intFiletText = 1;
            } else {
              Welding.this.intFiletText = 0;
            } 
            if (Welding.this.chckbxfiletdrawing.isSelected()) {
              Welding.this.intFiletDraw = 1;
            } else {
              Welding.this.intFiletDraw = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_1.isSelected()) {
              Welding.this.intFiletImage = 1;
            } else {
              Welding.this.intFiletImage = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_1.isSelected()) {
              Welding.this.generateOnFile = Boolean.valueOf(true);
            } else {
              Welding.this.generateOnFile = Boolean.valueOf(false);
            } 
            Welding.this.intTypeFilet = Welding.this.comboBox_type_butt_1.getSelectedIndex();
            Welding.this.intSizeFilet = Welding.this.comboBox_size_butt_1.getSelectedIndex();
            Welding.this.actualPath = Welding.this.textField_Filet.getText();
            Welding.this.intMouseFilet = Welding.this.comboBox_1_1.getSelectedIndex();
            Welding.this.textA_Filet_String = Welding.this.textArea_Filet.getText();
            if (Welding.this.intSizeFilet == 1)
              Welding.this.intSizeFilet = 14; 
            if (Welding.this.rdbtnfour1_1.isSelected())
              Welding.this.intSizeFilet = 7; 
            if (Welding.this.rdbtnfour2_1.isSelected())
              Welding.this.intSizeFilet = 8; 
            if (Welding.this.rdbtnfour3_1.isSelected())
              Welding.this.intSizeFilet = 9; 
            if (Welding.this.rdbtnfour4_1.isSelected())
              Welding.this.intSizeFilet = 10; 
            if (Welding.this.rdbtntwo1_1.isSelected())
              Welding.this.intSizeFilet = 11; 
            if (Welding.this.rdbtntwo2_1.isSelected())
              Welding.this.intSizeFilet = 12; 
            if (Welding.this.rdbtnNewRadioButton_1.isSelected())
              Welding.this.intSizeFilet = 16; 
            if (Welding.this.rdbtnhor1_1.isSelected())
              Welding.this.intSizeFilet = 15; 
            if (Welding.this.rdbtnfull2.isSelected())
                Welding.this.intSizeFilet = 14; 
            if(upperLeft) {
    			textFieldImageF1.setBackground(Color.GRAY);
    		} else {
			textFieldImageF1.setBackground(Color.WHITE);
		}
    		if(upperRight) {
    			textFieldImageF2.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageF2.setBackground(Color.WHITE);
		}
    		if(lowerLeft) {
    			textFieldImageF3.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageF3.setBackground(Color.WHITE);
		}
    		if(lowerRight) {
    			textFieldImageF4.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageF4.setBackground(Color.WHITE);
		}
            
            Welding.this.transParametre(Welding.this.plotType);
            Welding.this.createAndShowGUI(Welding.this.antall, Welding.this.vec);
          }
        });
    this.btnGenerateCorner.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.plotType = "corner";
            Welding.this.intAngleCorner = Integer.parseInt(Welding.this.textFieldAngleCorner.getText());
            Welding.this.intTickness1Corner = Integer.parseInt(Welding.this.textFieldTickness1Corner.getText());
            Welding.this.intTickness2Corner = Integer.parseInt(Welding.this.textFieldTickness2Corner.getText());
            Welding.this.intLeftAngleCorner = Integer.parseInt(Welding.this.textFieldLeftAngleCorner.getText());
            Welding.this.intRightAngleCorner = Integer.parseInt(Welding.this.textFieldRightAngleCorner.getText());
            Welding.this.intDx1Corner = Integer.parseInt(Welding.this.textFieldDx1Corner.getText());
            Welding.this.intDx2Corner = Integer.parseInt(Welding.this.textFieldDx2Corner.getText());
            Welding.this.intCornerScaler = Integer.parseInt(Welding.this.textFieldCornerScaler.getText());
            Welding.this.intCornerRotate = Integer.parseInt(Welding.this.textFieldCornerRotate.getText());
            if (Welding.this.chckbxInstruction_1_2.isSelected()) {
              Welding.this.intInstruction_1_2 = 1;
            } else {
              Welding.this.intInstruction_1_2 = 0;
            } 
            if (Welding.this.chckbxWeldString_2.isSelected()) {
              Welding.this.intWeldString_2 = 1;
            } else {
              Welding.this.intWeldString_2 = 0;
            } 
            if (Welding.this.chckbxcornertext.isSelected()) {
              Welding.this.intCornerText = 1;
            } else {
              Welding.this.intCornerText = 0;
            } 
            if (Welding.this.chckbxcornerdrawing.isSelected()) {
              Welding.this.intCornerDraw = 1;
            } else {
              Welding.this.intCornerDraw = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_2.isSelected()) {
              Welding.this.intCornerImage = 1;
            } else {
              Welding.this.intCornerImage = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_2.isSelected()) {
              Welding.this.generateOnFile = Boolean.valueOf(true);
            } else {
              Welding.this.generateOnFile = Boolean.valueOf(false);
            } 
            Welding.this.intTypeCorner = Welding.this.comboBox_type_butt_2.getSelectedIndex();
            Welding.this.intSizeCorner = Welding.this.comboBox_size_butt_2.getSelectedIndex();
            Welding.this.choosenName = Welding.this.textField_23.getText();
            Welding.this.actualPath = Welding.this.textField_18.getText();
            Welding.this.textA_Corner_String = Welding.this.textArea_Corner.getText();
            if (Welding.this.intSizeCorner == 1)
              Welding.this.intSizeCorner = 14; 
            if (Welding.this.rdbtnfour1_2.isSelected())
              Welding.this.intSizeCorner = 7; 
            if (Welding.this.rdbtnfour2_2.isSelected())
              Welding.this.intSizeCorner = 8; 
            if (Welding.this.rdbtnfour3_2.isSelected())
              Welding.this.intSizeCorner = 9; 
            if (Welding.this.rdbtnfour4_2.isSelected())
              Welding.this.intSizeCorner = 10; 
            if (Welding.this.rdbtntwo1_2.isSelected())
              Welding.this.intSizeCorner = 11; 
            if (Welding.this.rdbtntwo2_2.isSelected())
              Welding.this.intSizeCorner = 12; 
            if (Welding.this.rdbtnNewRadioButton_2.isSelected())
              Welding.this.intSizeCorner = 16; 
            if (Welding.this.rdbtnhor1_2.isSelected())
              Welding.this.intSizeCorner = 15; 
            if (Welding.this.rdbtnfull3.isSelected())
                Welding.this.intSizeCorner = 14; 
           
    		if(upperLeft) {
    			textFieldImageC1.setBackground(Color.GRAY);
    		} else {
			textFieldImageC1.setBackground(Color.WHITE);
		}
    		if(upperRight) {
    			textFieldImageC2.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageC2.setBackground(Color.WHITE);
		}
    		if(lowerLeft) {
    			textFieldImageC3.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageC3.setBackground(Color.WHITE);
		}
    		if(lowerRight) {
    			textFieldImageC4.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageC4.setBackground(Color.WHITE);
		}
    	/*	
            if(upperLeft) {
            	textFieldImageC1.setBackground(Color.GRAY);
            	UL = true;
            }
     		if(upperRight) {
    			textFieldImageC2.setBackground(Color.GRAY);
    			UR = true;
     		}
     		if(lowerLeft) {
    			textFieldImageC3.setBackground(Color.GRAY);
    			LL = true;
     		}
      		if(lowerRight) {
    			textFieldImageC4.setBackground(Color.GRAY);
    			LR = true;
      		}
      		
      		*/
            Welding.this.transParametre(Welding.this.plotType);
            Welding.this.createAndShowGUI(Welding.this.antall, Welding.this.vec);
          }
        });
    this.btnNGenerateOverlap.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.plotType = "overlap";
            Welding.this.intGapOverlap = Integer.parseInt(Welding.this.textFieldGapOverlap.getText());
            Welding.this.intTickness1Overlap = Integer.parseInt(Welding.this.textFieldTickness1Overlap.getText());
            Welding.this.intTickness2Overlap = Integer.parseInt(Welding.this.textFieldTickness2Overlap.getText());
            Welding.this.intOverlapScaler = Integer.parseInt(Welding.this.textFieldOverlapScaler.getText());
            Welding.this.intOverlapRotate = Integer.parseInt(Welding.this.textFieldOverlapRotate.getText());
            if (Welding.this.chckbxInstruction_1_3.isSelected()) {
              Welding.this.intInstruction_1_3 = 1;
            } else {
              Welding.this.intInstruction_1_3 = 0;
            } 
            if (Welding.this.chckbxWeldString_3.isSelected()) {
              Welding.this.intWeldString_3 = 1;
            } else {
              Welding.this.intWeldString_3 = 0;
            } 
            if (Welding.this.chckbxoverlaptext.isSelected()) {
              Welding.this.intOverlapText = 1;
            } else {
              Welding.this.intOverlapText = 0;
            } 
            if (Welding.this.chckbxoverlapdrawing.isSelected()) {
              Welding.this.intOverlapDraw = 1;
            } else {
              Welding.this.intOverlapDraw = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_3.isSelected()) {
              Welding.this.intOverlapImage = 1;
            } else {
              Welding.this.intOverlapImage = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_3.isSelected()) {
              Welding.this.generateOnFile = Boolean.valueOf(true);
            } else {
              Welding.this.generateOnFile = Boolean.valueOf(false);
            } 
            Welding.this.intTypeOverlap = Welding.this.comboBox_type_butt_2_2.getSelectedIndex();
            Welding.this.intSizeOverlap = Welding.this.comboBox_size_butt_3.getSelectedIndex();
            Welding.this.choosenName = Welding.this.textField_24.getText();
            Welding.this.actualPath = Welding.this.textField_19.getText();
            Welding.this.textA_Overlap_String = Welding.this.textArea_Overlap.getText();
            if (Welding.this.intSizeOverlap == 1)
              Welding.this.intSizeOverlap = 14; 
            if (Welding.this.rdbtnfour1_3.isSelected())
              Welding.this.intSizeOverlap = 7; 
            if (Welding.this.rdbtnfour2_3.isSelected())
              Welding.this.intSizeOverlap = 8; 
            if (Welding.this.rdbtnfour3_3.isSelected())
              Welding.this.intSizeOverlap = 9; 
            if (Welding.this.rdbtnfour4_3.isSelected())
              Welding.this.intSizeOverlap = 10; 
            if (Welding.this.rdbtntwo1_3.isSelected())
              Welding.this.intSizeOverlap = 11; 
            if (Welding.this.rdbtntwo2_3.isSelected())
              Welding.this.intSizeOverlap = 12; 
            if (Welding.this.rdbtnNewRadioButton_3.isSelected())
              Welding.this.intSizeOverlap = 16; 
            if (Welding.this.rdbtnhor1_3.isSelected())
              Welding.this.intSizeOverlap = 15; 
            if (Welding.this.rdbtnfull4.isSelected())
                Welding.this.intSizeOverlap = 14; 

    		if(upperLeft) {
    			textFieldImageO1.setBackground(Color.GRAY);
    		} else {
			textFieldImageO1.setBackground(Color.WHITE);
		}
    		if(upperRight) {
    			textFieldImageO2.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageO2.setBackground(Color.WHITE);
		}
    		if(lowerLeft) {
    			textFieldImageO3.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageO3.setBackground(Color.WHITE);
		}
    		if(lowerRight) {
    			textFieldImageO4.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageO4.setBackground(Color.WHITE);
		}
            
            Welding.this.transParametre(Welding.this.plotType);
            Welding.this.createAndShowGUI(Welding.this.antall, Welding.this.vec);
          }
        });
    this.btnGenerateFlaged.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Welding.this.plotType = "flanged";
            Welding.this.intGapFlaged = Integer.parseInt(Welding.this.textFieldGapFlaged.getText());
            Welding.this.intTicknessFlaged = Integer.parseInt(Welding.this.textFieldTicknessFlaged.getText());
            Welding.this.intTopRadiusFlaged = Integer.parseInt(Welding.this.textFieldTopRadiusFlaged.getText());
            Welding.this.intFlangedScaler = Integer.parseInt(Welding.this.textFieldFlangedScaler.getText());
            Welding.this.intFlangedRotate = Integer.parseInt(Welding.this.textFieldFlangedRotate.getText());
            if (Welding.this.chckbxInstruction_1_4.isSelected()) {
              Welding.this.intInstruction_1_4 = 1;
            } else {
              Welding.this.intInstruction_1_4 = 0;
            } 
            if (Welding.this.chckbxWeldString_4.isSelected()) {
              Welding.this.intWeldString_4 = 1;
            } else {
              Welding.this.intWeldString_4 = 0;
            } 
            if (Welding.this.chckbxflangedtext.isSelected()) {
              Welding.this.intFlangedText = 1;
            } else {
              Welding.this.intFlangedText = 0;
            } 
            if (Welding.this.chckbxflangeddrawing.isSelected()) {
              Welding.this.intFlangedDraw = 1;
            } else {
              Welding.this.intFlangedDraw = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_4.isSelected()) {
              Welding.this.intFlangedImage = 1;
            } else {
              Welding.this.intFlangedImage = 0;
            } 
            if (Welding.this.chckbx_image_butt_1_4.isSelected()) {
              Welding.this.generateOnFile = Boolean.valueOf(true);
            } else {
              Welding.this.generateOnFile = Boolean.valueOf(false);
            } 
            Welding.this.intTypeFlanged = Welding.this.comboBox_type_butt_2_3.getSelectedIndex();
            Welding.this.intSizeFlanged = Welding.this.comboBox_size_butt_4.getSelectedIndex();
            Welding.this.choosenName = Welding.this.textField_26.getText();
            Welding.this.actualPath = Welding.this.textField_20.getText();
            Welding.this.textA_Flanged_String = Welding.this.textArea_Flanged.getText();
            if (Welding.this.intSizeFlanged == 1)
              Welding.this.intSizeFlanged = 14; 
            if (Welding.this.rdbtnfour1_4.isSelected())
              Welding.this.intSizeFlanged = 7; 
            if (Welding.this.rdbtnfour2_4.isSelected())
              Welding.this.intSizeFlanged = 8; 
            if (Welding.this.rdbtnfour3_4.isSelected())
              Welding.this.intSizeFlanged = 9; 
            if (Welding.this.rdbtnfour4_4.isSelected())
              Welding.this.intSizeFlanged = 10; 
            if (Welding.this.rdbtntwo1_4.isSelected())
              Welding.this.intSizeFlanged = 11; 
            if (Welding.this.rdbtntwo2_4.isSelected())
              Welding.this.intSizeFlanged = 12; 
            if (Welding.this.rdbtnNewRadioButton_4.isSelected())
              Welding.this.intSizeFlanged = 16; 
            if (Welding.this.rdbtnhor1_4.isSelected())
              Welding.this.intSizeFlanged = 15; 
            if (Welding.this.rdbtnfull5.isSelected())
                Welding.this.intSizeFlanged = 14; 

    		if(upperLeft) {
    			textFieldImageFL1.setBackground(Color.GRAY);
    		} else {
			textFieldImageFL1.setBackground(Color.WHITE);
		}
    		if(upperRight) {
    			textFieldImageFL2.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageFL2.setBackground(Color.WHITE);
		}
    		if(lowerLeft) {
    			textFieldImageFL3.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageFL3.setBackground(Color.WHITE);
		}
    		if(lowerRight) {
    			textFieldImageFL4.setBackground(Color.GRAY);
    		        		} else {
			textFieldImageFL4.setBackground(Color.WHITE);
		}
            
            Welding.this.transParametre(Welding.this.plotType);
            Welding.this.createAndShowGUI(Welding.this.antall, Welding.this.vec);
          }
        });
  }
  
  private void transParametre(String plotTypeActual) {
    if (plotTypeActual.equals("overlap")) {
      this.antall = 13;
      this.vec[0] = this.intGapOverlap;
      this.vec[1] = this.intTickness1Overlap;
      this.vec[2] = this.intTickness2Overlap;
      this.vec[3] = this.intOverlapScaler;
      this.vec[4] = this.intOverlapRotate;
      this.vec[5] = this.intOverlapText;
      this.vec[6] = this.intOverlapDraw;
      this.vec[7] = this.intSizeOverlap;
      this.vec[8] = this.intTypeOverlap;
      this.vec[9] = this.intOverlapImage;
      this.vec[10] = this.intMouseOverlap;
      this.vec[11] = this.intInstruction_1_3;
      this.vec[12] = this.intWeldString_3;
    } 
    if (plotTypeActual.equals("flanged")) {
      this.antall = 13;
      this.vec[0] = this.intGapFlaged;
      this.vec[1] = this.intTicknessFlaged;
      this.vec[2] = this.intTopRadiusFlaged;
      this.vec[3] = this.intFlangedScaler;
      this.vec[4] = this.intFlangedRotate;
      this.vec[5] = this.intFlangedText;
      this.vec[6] = this.intFlangedDraw;
      this.vec[7] = this.intSizeFlanged;
      this.vec[8] = this.intTypeFlanged;
      this.vec[9] = this.intFlangedImage;
      this.vec[10] = this.intMouseFlanged;
      this.vec[11] = this.intInstruction_1_4;
      this.vec[12] = this.intWeldString_4;
    } 
    if (plotTypeActual.equals("corner")) {
      this.antall = 17;
      this.vec[0] = this.intAngleCorner;
      this.vec[1] = this.intTickness1Corner;
      this.vec[2] = this.intTickness2Corner;
      this.vec[3] = this.intLeftAngleCorner;
      this.vec[4] = this.intRightAngleCorner;
      this.vec[5] = this.intDx1Corner;
      this.vec[6] = this.intDx2Corner;
      this.vec[7] = this.intCornerScaler;
      this.vec[8] = this.intCornerRotate;
      this.vec[9] = this.intCornerText;
      this.vec[10] = this.intCornerDraw;
      this.vec[11] = this.intSizeCorner;
      this.vec[12] = this.intTypeCorner;
      this.vec[13] = this.intCornerImage;
      this.vec[14] = this.intMouseCorner;
      this.vec[15] = this.intInstruction_1_2;
      this.vec[16] = this.intWeldString_2;
    } 
    if (plotTypeActual.equals("filet")) {
      this.antall = 23;
      this.vec[0] = this.intGapFilet;
      this.vec[1] = this.intAngleFilet;
      this.vec[2] = this.intBottomasideFilet;
      this.vec[3] = this.intTopasideFilet;
      this.vec[4] = this.intBottomFilet;
      this.vec[5] = this.intTopFilet;
      this.vec[6] = this.intTopAngleFilet;
      this.vec[7] = this.intTopRadiusFilet;
      this.vec[8] = this.intBottomAngleFilet;
      this.vec[9] = this.intBottomRadiusFilet;
      this.vec[10] = this.intFaceFilet;
      this.vec[11] = this.intCenterFilet;
      this.vec[12] = this.intComboFilet;
      this.vec[13] = this.intFiletScaler;
      this.vec[14] = this.intFiletRotate;
      this.vec[15] = this.intFiletText;
      this.vec[16] = this.intFiletDraw;
      this.vec[17] = this.intSizeFilet;
      this.vec[18] = this.intTypeFilet;
      this.vec[19] = this.intFiletImage;
      this.vec[20] = this.intMouseFilet;
      this.vec[21] = this.intInstruction_1_1;
      this.vec[22] = this.intWeldString_1;
      if ( intComboFilet == 2) {
      	if ( intFaceFilet > intTopFilet) 
      		plotOK = false; 	
    }

    if ( intComboFilet == 3) {
    	if ( intFaceFilet > intTopFilet) 
    		plotOK = false; 
    	if ( intFaceFilet/2 + intCenterFilet > intTopFilet)
    		plotOK = false;
    	if ( intFaceFilet/2  > intCenterFilet )
    		plotOK = false;
  }

  if ( intComboFilet == 4) {
    	if ( intFaceFilet > intTopFilet) 
    		plotOK = false; 
    	if ( intFaceFilet + intTopRadiusFilet > intTopFilet)
    		plotOK = false;
  }

  if ( intComboFilet == 5) {
    	if ( intFaceFilet > intTopFilet) 
    		plotOK = false; 
    	if ( intFaceFilet/2 + intCenterFilet > intTopFilet)
    		plotOK = false;
    	if ( intFaceFilet/2 + intBottomRadiusFilet  > intCenterFilet )
    		plotOK = false;
    	if ( intFaceFilet + intTopRadiusFilet + intBottomRadiusFilet  > intTopFilet )
    		plotOK = false;
  }
    } 
    if (plotTypeActual.equals("butt")) {
      this.antall = 20;
      this.antall = 32;
      this.vec[0] = this.intGap;
      this.vec[1] = this.intDy;
      this.vec[2] = this.intTickness;
      this.vec[3] = this.intTopAngle;
      this.vec[4] = this.intTopRadius;
      this.vec[5] = this.intBottomAngle;
      this.vec[6] = this.intBottomRadius;
      this.vec[7] = this.intFace;
      this.vec[8] = this.intCenter;
      this.vec[9] = this.intComboLeft;
      this.vec[10] = this.intButtScaler;
      this.vec[11] = this.intButtRotate;
      this.vec[12] = this.intGapRight;
      this.vec[13] = this.intDyRight;
      this.vec[14] = this.intTicknessRight;
      this.vec[15] = this.intTopAngleRight;
      this.vec[16] = this.intTopRadiusRight;
      this.vec[17] = this.intBottomAngleRight;
      this.vec[18] = this.intBottomRadiusRight;
      this.vec[19] = this.intFaceRight;
      this.vec[20] = this.intCenterRight;
      this.vec[21] = this.intComboRight;
      this.vec[22] = this.intButtScaler;
      this.vec[23] = this.intButtRotate;
      this.vec[24] = this.intButtText;
      this.vec[25] = this.intButtDraw;
      this.vec[26] = this.intSizeButt;
      this.vec[27] = this.intTypeButt;
      this.vec[28] = this.intButtImage;
      this.vec[29] = this.intMouseButt;
      this.vec[30] = this.intInstruction_1;
      this.vec[31] = this.intWeldString;
      if ( intComboLeft == 2) {
        	if ( intFace > intTickness) 
        		plotOK = false; 	
      }
      if ( intComboRight == 2) {
      	if ( intFaceRight > intTicknessRight) 
      		plotOK = false; 
    }
      
      if ( intComboLeft == 3) {
      	if ( intFace > intTickness) 
      		plotOK = false; 
      	if ( intFace/2 + intCenter > intTickness)
      		plotOK = false;
      	if ( intFace/2  > intCenter )
      		plotOK = false;
    }
    if ( intComboRight == 3) {
    	if ( intFaceRight > intTicknessRight) 
    		plotOK = false; 
      	if ( intFaceRight/2 + intCenterRight > intTicknessRight)
      		plotOK = false;
      	if ( intFaceRight/2  > intCenterRight )
      		plotOK = false;
  }
    
    if ( intComboLeft == 4) {
      	if ( intFace > intTickness) 
      		plotOK = false; 
      	if ( intFace + intTopRadius > intTickness)
      		plotOK = false;
    }
    if ( intComboRight == 4) {
      	if ( intFaceRight > intTicknessRight) 
      		plotOK = false; 
      	if ( intFaceRight + intTopRadiusRight > intTicknessRight)
      		plotOK = false;
    }
    if ( intComboLeft == 5) {
      	if ( intFace > intTickness) 
      		plotOK = false; 
      	if ( intFace/2 + intCenter > intTickness)
      		plotOK = false;
      	if ( intFace/2 + intBottomRadius  > intCenter )
      		plotOK = false;
      	if ( intFace + intTopRadius + intBottomRadius  > intTickness )
      		plotOK = false;
    }
    if ( intComboRight == 5) {
      	if ( intFaceRight > intTicknessRight) 
      		plotOK = false; 
      	if ( intFaceRight/2 + intCenterRight > intTicknessRight)
      		plotOK = false;
      	if ( intFaceRight/2 + intBottomRadiusRight > intCenterRight )
      		plotOK = false;
      	if ( intFaceRight + intTopRadiusRight + intBottomRadiusRight  > intTicknessRight )
      		plotOK = false;
    }

    } 
    if (plotTypeActual.equals("Butt")) {
      this.antall = 20;
      this.vec[0] = this.intGap;
      this.vec[1] = this.intDy;
      this.vec[2] = this.intTickness;
      this.vec[3] = this.intTopAngle;
      this.vec[4] = this.intTopRadius;
      this.vec[5] = this.intBottomAngle;
      this.vec[6] = this.intBottomRadius;
      this.vec[7] = this.intFace;
      this.vec[8] = this.intCenter;
      this.vec[9] = this.intComboLeft;
      this.vec[10] = this.intButtScaler;
      this.vec[11] = this.intButtRotate;
      this.vec[12] = this.intButtText;
      this.vec[13] = this.intButtDraw;
      this.vec[14] = this.intSizeButt;
      this.vec[15] = this.intTypeButt;
      this.vec[16] = this.intButtImage;
      this.vec[17] = this.intMouseButt;
      this.vec[18] = this.intInstruction_1;
      this.vec[19] = this.intWeldString;

    } 
    if (plotTypeActual.equals("Cross joint")) {
      this.antall = 14;
      if (this.intSizeCam == 1)
        this.intSizeCam = 14; 
      if (this.rdbtnfour1_5.isSelected())
        this.intSizeCam = 7; 
      if (this.rdbtnfour2_5.isSelected())
        this.intSizeCam = 8; 
      if (this.rdbtnfour3_5.isSelected())
        this.intSizeCam = 9; 
      if (this.rdbtnfour4_5.isSelected())
        this.intSizeCam = 10; 
      if (this.rdbtntwo1_5.isSelected())
        this.intSizeCam = 11; 
      if (this.rdbtntwo2_5.isSelected())
        this.intSizeCam = 12; 
      if (this.rdbtnNewRadioButton_5.isSelected())
        this.intSizeCam = 16; 
      if (this.rdbtnhor1_5.isSelected())
        this.intSizeCam = 15; 
      if (this.rdbtnfull6.isSelected())
          Welding.this.intSizeCam = 14; 
      this.vec[0] = this.intcomboBoxDimention;
      this.vec[1] = this.intcomboBoxType;
      this.vec[2] = this.intcomboBoxCam2;
      this.vec[3] = this.intRotate;
      this.vec[4] = this.intScale;
      this.vec[5] = this.intcomboBoxDimention3;
      this.vec[6] = this.intCamText;
      this.vec[7] = this.intCamDraw;
      this.vec[8] = this.intSizeCam;
      this.vec[9] = this.intTypeCam;
      this.vec[10] = this.intCamImage;
      this.vec[11] = this.intMouseCam;
      this.vec[12] = this.intInstruction_1_5;
      this.vec[13] = this.intWeldString_5;
    } 
    if (plotTypeActual.equals("Lap joint")) {
      this.antall = 15;
      if (this.intSizeCam == 1)
        this.intSizeCam = 14; 
      if (this.rdbtnfour1_5.isSelected())
        this.intSizeCam = 7; 
      if (this.rdbtnfour2_5.isSelected())
        this.intSizeCam = 8; 
      if (this.rdbtnfour3_5.isSelected())
        this.intSizeCam = 9; 
      if (this.rdbtnfour4_5.isSelected())
        this.intSizeCam = 10; 
      if (this.rdbtntwo1_5.isSelected())
        this.intSizeCam = 11; 
      if (this.rdbtntwo2_5.isSelected())
        this.intSizeCam = 12; 
      if (this.rdbtnNewRadioButton_5.isSelected())
        this.intSizeCam = 16; 
      if (this.rdbtnhor1_5.isSelected())
        this.intSizeCam = 15; 
      if (this.rdbtnfull6.isSelected())
          Welding.this.intSizeCam = 14; 
      this.vec[0] = this.intcomboBoxDimention;
      this.vec[1] = this.intcomboBoxType;
      this.vec[2] = this.intcomboBoxCam2;
      this.vec[3] = this.intRotate;
      this.vec[4] = this.intScale;
      this.vec[5] = this.intcomboBoxDimention3;
      this.vec[6] = this.intCamText;
      this.vec[7] = this.intCamDraw;
      this.vec[8] = this.intSizeCam;
      this.vec[9] = this.intTypeCam;
      this.vec[10] = this.intCamImage;
      this.vec[11] = this.intMouseCam;
      this.vec[12] = this.intInstruction_1_5;
      this.vec[13] = this.intWeldString_5;
    } 
    if (plotTypeActual.equals("On plate")) {
      this.antall = 15;
      if (this.intSizeCam == 1)
        this.intSizeCam = 14; 
      if (this.rdbtnfour1_5.isSelected())
        this.intSizeCam = 7; 
      if (this.rdbtnfour2_5.isSelected())
        this.intSizeCam = 8; 
      if (this.rdbtnfour3_5.isSelected())
        this.intSizeCam = 9; 
      if (this.rdbtnfour4_5.isSelected())
        this.intSizeCam = 10; 
      if (this.rdbtntwo1_5.isSelected())
        this.intSizeCam = 11; 
      if (this.rdbtntwo2_5.isSelected())
        this.intSizeCam = 12; 
      if (this.rdbtnNewRadioButton_5.isSelected())
        this.intSizeCam = 16; 
      if (this.rdbtnhor1_5.isSelected())
        this.intSizeCam = 15; 
      if (this.rdbtnfull6.isSelected())
          Welding.this.intSizeCam = 14; 
      this.vec[0] = this.intcomboBoxDimention;
      this.vec[1] = this.intcomboBoxType;
      this.vec[2] = this.intcomboBoxCam2;
      this.vec[3] = this.intRotate;
      this.vec[4] = this.intScale;
      this.vec[5] = this.intcomboBoxDimention3;
      this.vec[6] = this.intCamText;
      this.vec[7] = this.intCamDraw;
      this.vec[8] = this.intSizeCam;
      this.vec[9] = this.intTypeCam;
      this.vec[10] = this.intCamImage;
      this.vec[11] = this.intMouseCam;
      this.vec[12] = this.intInstruction_1_5;
      this.vec[13] = this.intWeldString_5;
    } 
    if (plotTypeActual.equals("Strap joint")) {
      this.antall = 15;
      if (this.intSizeCam == 1)
        this.intSizeCam = 14; 
      if (this.rdbtnfour1_5.isSelected())
        this.intSizeCam = 7; 
      if (this.rdbtnfour2_5.isSelected())
        this.intSizeCam = 8; 
      if (this.rdbtnfour3_5.isSelected())
        this.intSizeCam = 9; 
      if (this.rdbtnfour4_5.isSelected())
        this.intSizeCam = 10; 
      if (this.rdbtntwo1_5.isSelected())
        this.intSizeCam = 11; 
      if (this.rdbtntwo2_5.isSelected())
        this.intSizeCam = 12; 
      if (this.rdbtnNewRadioButton_5.isSelected())
        this.intSizeCam = 16; 
      if (this.rdbtnhor1_5.isSelected())
        this.intSizeCam = 15; 
      if (this.rdbtnfull6.isSelected())
          Welding.this.intSizeCam = 14; 
      this.vec[0] = this.intcomboBoxDimention;
      this.vec[1] = this.intcomboBoxType;
      this.vec[2] = this.intcomboBoxCam2;
      this.vec[3] = this.intRotate;
      this.vec[4] = this.intScale;
      this.vec[5] = this.intcomboBoxDimention3;
      this.vec[6] = this.intCamText;
      this.vec[7] = this.intCamDraw;
      this.vec[8] = this.intSizeCam;
      this.vec[9] = this.intTypeCam;
      this.vec[10] = this.intCamImage;
      this.vec[11] = this.intMouseCam;
      this.vec[12] = this.intInstruction_1_5;
      this.vec[13] = this.intWeldString_5;
    } 
  }
  
  private void writeParametre(String plotTypeActual, Boolean writePart) {
    Boolean writeAll = writePart;
    Boolean utvid = Boolean.valueOf(false);
    String xx = String.valueOf(this.actualPath) + "\\" + this.imageName + "_" + this.choosenName + "." + "wps";
    try {
      FileWriter tekstFilSkriver = new FileWriter(xx, utvid.booleanValue());
      PrintWriter tekstSkriver = new PrintWriter(tekstFilSkriver);
      if (plotTypeActual.equals("overlap") || writeAll.booleanValue()) {
        this.antall = 11;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("overlap");
        tekstSkriver.println(this.intGapOverlap);
        tekstSkriver.println(this.intTickness1Overlap);
        tekstSkriver.println(this.intTickness2Overlap);
        tekstSkriver.println(this.intOverlapScaler);
        tekstSkriver.println(this.intOverlapRotate);
        tekstSkriver.println(this.intOverlapText);
        tekstSkriver.println(this.intOverlapDraw);
        tekstSkriver.println(this.intSizeOverlap);
        tekstSkriver.println(this.intTypeOverlap);
        tekstSkriver.println(this.intOverlapImage);
        tekstSkriver.println(this.intMouseOverlap);
        tekstSkriver.println(this.textA_Overlap);
      } 
      if (plotTypeActual.equals("flanged") || writeAll.booleanValue()) {
        this.antall = 11;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("flanged");
        tekstSkriver.println(this.intGapFlaged);
        tekstSkriver.println(this.intTicknessFlaged);
        tekstSkriver.println(this.intTopRadiusFlaged);
        tekstSkriver.println(this.intFlangedScaler);
        tekstSkriver.println(this.intFlangedRotate);
        tekstSkriver.println(this.intFlangedText);
        tekstSkriver.println(this.intFlangedDraw);
        tekstSkriver.println(this.intSizeFlanged);
        tekstSkriver.println(this.intTypeFlanged);
        tekstSkriver.println(this.intFlangedImage);
        tekstSkriver.println(this.intMouseFlanged);
        tekstSkriver.println(this.textA_Flanged);
      } 
      if (plotTypeActual.equals("corner") || writeAll.booleanValue()) {
        this.antall = 15;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("corner");
        tekstSkriver.println(this.intAngleCorner);
        tekstSkriver.println(this.intTickness1Corner);
        tekstSkriver.println(this.intTickness2Corner);
        tekstSkriver.println(this.intLeftAngleCorner);
        tekstSkriver.println(this.intRightAngleCorner);
        tekstSkriver.println(this.intDx1Corner);
        tekstSkriver.println(this.intDx2Corner);
        tekstSkriver.println(this.intCornerScaler);
        tekstSkriver.println(this.intCornerText);
        tekstSkriver.println(this.intCornerDraw);
        tekstSkriver.println(this.intSizeCorner);
        tekstSkriver.println(this.intTypeCorner);
        tekstSkriver.println(this.intCornerImage);
        tekstSkriver.println(this.intMouseCorner);
        tekstSkriver.println(this.textA_Corner);
      } 
      if (plotTypeActual.equals("filet") || writeAll.booleanValue()) {
        this.antall = 22;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("filet");
        tekstSkriver.println(this.intGapFilet);
        tekstSkriver.println(this.intAngleFilet);
        tekstSkriver.println(this.intBottomasideFilet);
        tekstSkriver.println(this.intTopasideFilet);
        tekstSkriver.println(this.intBottomFilet);
        tekstSkriver.println(this.intTopFilet);
        tekstSkriver.println(this.intTopAngleFilet);
        tekstSkriver.println(this.intTopRadiusFilet);
        tekstSkriver.println(this.intBottomAngleFilet);
        tekstSkriver.println(this.intBottomRadiusFilet);
        tekstSkriver.println(this.intFaceFilet);
        tekstSkriver.println(this.intCenterFilet);
        tekstSkriver.println(this.intComboFilet);
        tekstSkriver.println(this.intFiletScaler);
        tekstSkriver.println(this.intFiletRotate);
        tekstSkriver.println(this.intFiletText);
        tekstSkriver.println(this.intFiletDraw);
        tekstSkriver.println(this.intSizeFilet);
        tekstSkriver.println(this.intTypeFilet);
        tekstSkriver.println(this.intFiletImage);
        tekstSkriver.println(this.intMouseFilet);
        tekstSkriver.println(this.textA_Filet);
      } 
      if (plotTypeActual.equals("butt") || writeAll.booleanValue()) {
        this.antall = 30;
        tekstSkriver.println("butt");
        tekstSkriver.println(this.antall);
        tekstSkriver.println("butt");
        tekstSkriver.println(this.intGap);
        tekstSkriver.println(this.intDy);
        tekstSkriver.println(this.intTickness);
        tekstSkriver.println(this.intTopAngle);
        tekstSkriver.println(this.intTopRadius);
        tekstSkriver.println(this.intBottomAngle);
        tekstSkriver.println(this.intBottomRadius);
        tekstSkriver.println(this.intFace);
        tekstSkriver.println(this.intCenter);
        tekstSkriver.println(this.intComboLeft);
        tekstSkriver.println(this.intButtScaler);
        tekstSkriver.println(this.intButtRotate);
        tekstSkriver.println(this.intGapRight);
        tekstSkriver.println(this.intDyRight);
        tekstSkriver.println(this.intTicknessRight);
        tekstSkriver.println(this.intTopAngleRight);
        tekstSkriver.println(this.intTopRadiusRight);
        tekstSkriver.println(this.intBottomAngleRight);
        tekstSkriver.println(this.intBottomRadiusRight);
        tekstSkriver.println(this.intFaceRight);
        tekstSkriver.println(this.intCenterRight);
        tekstSkriver.println(this.intComboRight);
        tekstSkriver.println(this.intButtScaler);
        tekstSkriver.println(this.intButtRotate);
        tekstSkriver.println(this.intButtText);
        tekstSkriver.println(this.intButtDraw);
        tekstSkriver.println(this.intSizeButt);
        tekstSkriver.println(this.intTypeButt);
        tekstSkriver.println(this.intButtImage);
        tekstSkriver.println(this.intMouseButt);
        tekstSkriver.println(this.textA_Butt);
      } 
      if (plotTypeActual.equals("Butt") || writeAll.booleanValue()) {
        this.antall = 18;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("Butt");
        tekstSkriver.println(this.intGap);
        tekstSkriver.println(this.intDy);
        tekstSkriver.println(this.intTickness);
        tekstSkriver.println(this.intTopAngle);
        tekstSkriver.println(this.intTopRadius);
        tekstSkriver.println(this.intBottomAngle);
        tekstSkriver.println(this.intBottomRadius);
        tekstSkriver.println(this.intFace);
        tekstSkriver.println(this.intCenter);
        tekstSkriver.println(this.intComboLeft);
        tekstSkriver.println(this.intButtScaler);
        tekstSkriver.println(this.intButtRotate);
        tekstSkriver.println(this.intButtText);
        tekstSkriver.println(this.intButtDraw);
        tekstSkriver.println(this.intSizeButt);
        tekstSkriver.println(this.intTypeButt);
        tekstSkriver.println(this.intButtImage);
        tekstSkriver.println(this.intMouseButt);
        tekstSkriver.println(this.textA_Butt);
      } 
      if (plotTypeActual.equals("Cross joint") || writeAll.booleanValue()) {
        this.antall = 12;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("Cross joint");
        tekstSkriver.println(this.intcomboBoxDimention);
        tekstSkriver.println(this.intcomboBoxType);
        tekstSkriver.println(this.intcomboBoxCam2);
        tekstSkriver.println(this.intRotate);
        tekstSkriver.println(this.intScale);
        tekstSkriver.println(this.intcomboBoxDimention3);
        tekstSkriver.println(this.intCamText);
        tekstSkriver.println(this.intCamDraw);
        tekstSkriver.println(this.intSizeCam);
        tekstSkriver.println(this.intTypeCam);
        tekstSkriver.println(this.intCamImage);
        tekstSkriver.println(this.intMouseCam);
        tekstSkriver.println(this.textA_Cam);
      } 
      if (plotTypeActual.equals("Lap joint") || writeAll.booleanValue()) {
        this.antall = 12;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("Lap joint");
        tekstSkriver.println(this.intcomboBoxDimention);
        tekstSkriver.println(this.intcomboBoxType);
        tekstSkriver.println(this.intcomboBoxCam2);
        tekstSkriver.println(this.intRotate);
        tekstSkriver.println(this.intScale);
        tekstSkriver.println(this.intcomboBoxDimention3);
        tekstSkriver.println(this.intCamText);
        tekstSkriver.println(this.intCamDraw);
        tekstSkriver.println(this.intSizeCam);
        tekstSkriver.println(this.intTypeCam);
        tekstSkriver.println(this.intCamImage);
        tekstSkriver.println(this.intMouseCam);
        tekstSkriver.println(this.textA_Cam);
      } 
      if (plotTypeActual.equals("On plate") || writeAll.booleanValue()) {
        this.antall = 12;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("On plate");
        tekstSkriver.println(this.intcomboBoxDimention);
        tekstSkriver.println(this.intcomboBoxType);
        tekstSkriver.println(this.intcomboBoxCam2);
        tekstSkriver.println(this.intRotate);
        tekstSkriver.println(this.intScale);
        tekstSkriver.println(this.intcomboBoxDimention3);
        tekstSkriver.println(this.intCamText);
        tekstSkriver.println(this.intCamDraw);
        tekstSkriver.println(this.intSizeCam);
        tekstSkriver.println(this.intTypeCam);
        tekstSkriver.println(this.intCamImage);
        tekstSkriver.println(this.intMouseCam);
        tekstSkriver.println(this.textA_Cam);
      } 
      if (plotTypeActual.equals("Strap joint") || writeAll.booleanValue()) {
        this.antall = 12;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("Strap joint");
        tekstSkriver.println(this.intcomboBoxDimention);
        tekstSkriver.println(this.intcomboBoxType);
        tekstSkriver.println(this.intcomboBoxCam2);
        tekstSkriver.println(this.intRotate);
        tekstSkriver.println(this.intScale);
        tekstSkriver.println(this.intcomboBoxDimention3);
        tekstSkriver.println(this.intCamText);
        tekstSkriver.println(this.intCamDraw);
        tekstSkriver.println(this.intSizeCam);
        tekstSkriver.println(this.intTypeCam);
        tekstSkriver.println(this.intCamImage);
        tekstSkriver.println(this.intMouseCam);
        tekstSkriver.println(this.textA_Cam);
      } 
      if (this.plotSort.equals("Strength") || writeAll.booleanValue()) {
        this.antall = 6;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("Strength");
        tekstSkriver.println(this.intSteelType);
        tekstSkriver.println(this.fd);
        tekstSkriver.println(this.amal);
        tekstSkriver.println(this.length);
        tekstSkriver.println(this.ang);
        tekstSkriver.println(this.antallSveis);
        tekstSkriver.println(this.textA_Strength);
      } 
      if (this.plotSort.equals("Mouse") || writeAll.booleanValue()) {
        this.antall = 7 * this.maxlengde;
        tekstSkriver.println(this.antall);
        tekstSkriver.println("Mouse");
        for (int i = 0; i < this.maxlengde; i++) {
          tekstSkriver.println(this.plott[i]);
          tekstSkriver.println(this.corrX1[i]);
          tekstSkriver.println(this.corrX2[i]);
          tekstSkriver.println(this.corrY1[i]);
          tekstSkriver.println(this.corrY2[i]);
          tekstSkriver.println(this.corrX3[i]);
          tekstSkriver.println(this.corrY3[i]);
        } 
      } 
      tekstSkriver.close();
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
  
  public void lookAtImages() {
    Transfer tegn = new Transfer(this.actualFiles);
    tegn.setDefaultCloseOperation(1);
    tegn.setVisible(true);
    this.intTrans = 0;
  }
  
  public void lookAtPicture() {
    this.panelInfo.setVisible(false);
    this.panelButt.setVisible(false);
    this.panelFilet.setVisible(false);
    this.panelCorner.setVisible(false);
    this.panelOverlap.setVisible(false);
    this.panelFlanged.setVisible(false);
    this.panelSave.setVisible(false);
    this.panelPrint.setVisible(false);
    if (this.actualFiles.size() > 0) {
      int index = this.actualFiles.size();
      ImageIcon imag = new ImageIcon(this.actualFiles.get(index - 1));

      int imagw = imag.getIconWidth();
      int imagh = imag.getIconHeight();
      int maxHeight = 380;
      int maxWidth = imagw/imagh*maxHeight;
      imag.setImage(imag.getImage().getScaledInstance(maxWidth,maxHeight,java.awt.Image.SCALE_DEFAULT));
      if (imagh > maxHeight) {
        double ww = (imagw * maxHeight / imagh);
        int w = (int)ww;
        int h = maxHeight;
      } else {
        int w = imagw;
        int h = imagh;
      } 
      int imagwny = imag.getIconWidth();
      int imaghny = imag.getIconHeight();
      if (this.plotType.equals("butt")) {
        this.panelButt.setVisible(true);
        JLabel file1a = new JLabel(imag);
        file1a.setBounds(10, 610, 750, 386);
        JLabel file1b = new JLabel(imag);
        file1b.setBounds(10, 610, 750, 386);
        if (this.imageOnLabel > 1) {
          file1b.setVisible(false);
          this.panelButt.add(file1a);
          this.panelButt.add(this.lblButtWeld);
          file1a.setVisible(true);
        } else {
          this.panelButt.add(file1b);
          this.panelButt.add(this.lblButtWeld);
          file1b.setVisible(true);
        } 
      } 
      if (this.plotType.equals("filet")) {
        this.panelFilet.setVisible(true);
        JLabel file1a = new JLabel(imag);
        file1a.setBounds(10, 610, 750, 386);
        JLabel file1b = new JLabel(imag);
        file1b.setBounds(10, 610, 750, 540);
        if (this.imageOnLabel > 1) {
          file1b.setVisible(false);
          this.panelFilet.add(file1a);
          this.panelFilet.add(this.lblFiletWeld);
          file1a.setVisible(true);
        } else {
          this.panelFilet.add(file1b);
          this.panelFilet.add(this.lblFiletWeld);
          file1b.setVisible(true);
        } 
      } 
      if (this.plotType.equals("corner")) {
        this.panelCorner.setVisible(true);
        JLabel file1a = new JLabel(imag);
        file1a.setBounds(10, 610, 750, 386);
        JLabel file1b = new JLabel(imag);
        file1b.setBounds(10, 610, 750, 540);
        if (this.imageOnLabel > 1) {
          file1b.setVisible(false);
          this.panelCorner.add(file1a);
          this.panelCorner.add(this.lblCornerWeld);
          file1a.setVisible(true);
        } else {
          this.panelCorner.add(file1b);
          this.panelCorner.add(this.lblCornerWeld);
          file1b.setVisible(true);
        } 
      } 
      if (this.plotType.equals("overlap")) {
        this.panelOverlap.setVisible(true);
        JLabel file1a = new JLabel(imag);
        file1a.setBounds(10, 610, 750, 386);
        JLabel file1b = new JLabel(imag);
        file1b.setBounds(10, 610, 750, 386);
        if (this.imageOnLabel > 1) {
          file1b.setVisible(false);
          this.panelOverlap.add(file1a);
          this.panelOverlap.add(this.lblOverlapWeld);
          file1a.setVisible(true);
        } else {
          this.panelOverlap.add(file1b);
          this.panelOverlap.add(this.lblOverlapWeld);
          file1b.setVisible(true);
        } 
      } 
      if (this.plotType.equals("flanged")) {
        this.panelFlanged.setVisible(true);
        JLabel file1a = new JLabel(imag);
        file1a.setBounds(10, 610, 750, 386);
        JLabel file1b = new JLabel(imag);
        file1b.setBounds(10, 610, 750, 386);
        if (this.imageOnLabel > 1) {
          file1b.setVisible(false);
          this.panelFlanged.add(file1a);
          this.panelFlanged.add(this.lblFlaggedWeld);
          file1a.setVisible(true);
        } else {
          this.panelFlanged.add(file1b);
          this.panelFlanged.add(this.lblFlaggedWeld);
          file1b.setVisible(true);
        } 
      } 
      if (this.plotType.equals("Lap joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Cross joint") || this.plotType.equals("On plate")) {
        this.panelPrint.setVisible(true);
        JLabel file1a = new JLabel(imag);
        file1a.setBounds(10, 610, 750, 386);
        JLabel file1b = new JLabel(imag);
        file1b.setBounds(10, 610, 750, 386);
        if (this.imageOnLabel > 1) {
          file1b.setVisible(false);
          this.panelPrint.add(file1a);
          this.panelPrint.add(this.lblPrint);
          file1a.setVisible(true);
        } else {
          this.panelPrint.add(file1b);
          this.panelPrint.add(this.lblPrint);
          file1b.setVisible(true);
        } 
      } 
    } 
  }
  
  public void createAndShowGUI(int antall, int[] vec ) {
    String type = this.plotType;
    int heigh = this.intGapOverlap;
    if (this.plotType.equals("Butt"))
        return; 
    SwingUtilities.isEventDispatchThread();
    String mess = " Weld IT   -  Joint drawing";
    JFrame f = new JFrame(mess);
    f.setDefaultCloseOperation(1);
    f.setIconImage(Toolkit.getDefaultToolkit().getImage(Welding.class.getResource("/images/logo.png")));
    f.getContentPane().setLayout(new FlowLayout());
    f.getContentPane().add(new MyPanel(type, antall, vec));
    f.pack();
    f.setVisible(true);
  }
  
  public void blankAll() {
    this.panelInfo.setVisible(false);
    this.panelButt.setVisible(false);
    this.panelFilet.setVisible(false);
    this.panelCorner.setVisible(false);
    this.panelOverlap.setVisible(false);
    this.panelFlanged.setVisible(false);
    this.panelSave.setVisible(false);
    this.panelPrint.setVisible(false);
  }
  
  public void showFile(String datafilnavn) {
    try {
      FileReader tekstFilLeser = new FileReader(datafilnavn);
      BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
      int totaltAntallPoster = Integer.parseInt(tekstLeser.readLine());
      this.plotType = tekstLeser.readLine();
  //    System.out.println(this.plotType);
      for (int i = 0; i < totaltAntallPoster; i++) {
        this.vec[i] = Integer.parseInt(tekstLeser.readLine());
        System.out.println(this.vec[i]);
      } 
      createAndShowGUI(this.antall, this.vec );
      tekstLeser.close();
    } catch (IOException unntak) {
      System.out.print("Error with reading: " + unntak);
      System.exit(1);
    } 
  }

  ////////////////////////////////////////////////////////////////////////////////////////////
  class MyPanel extends JComponent implements ActionListener {
    String plotType;
    
    int xP = 400;
    
    int yP = 350;
    
    int[] vector = new int[20];
    
    int nx1;
    
    int nx2;
    
    boolean original;
    
    double factor = 3.77952755906D;
    
    
    int[] x1 = new int[15];
    
    int[] y1 = new int[15];
    
    int[] x2 = new int[15];
    
    int[] y2 = new int[15];
    
    int[] x3 = new int[15];
    
    int[] y3 = new int[15];
    
    int[] x4 = new int[15];
    
    int[] y4 = new int[15];
    
    int[] x5 = new int[15];
    
    int[] y5 = new int[15];
    
    int[] x6 = new int[15];
    
    int[] y6 = new int[15];
    
    int[] x7 = new int[15];
    
    int[] y7 = new int[15];
    
    int[] x8 = new int[15];
    
    int[] y8 = new int[15];
    
    int[] x9 = new int[15];
    
    int[] y9 = new int[15];
    
    int[] x10 = new int[15];
    
    int[] y10 = new int[15];
    
    int[] x11 = new int[15];
    
    int[] y11 = new int[15];
    
    int[] vec = new int[35];
    
    int[] gang = new int[25];
    
    int listImage = 1;
    int filetVinkel = 90;
    int pointType;
    
    int pointIndex;
    
    String resultat = "Standard";
    
    char valgtChar = 'S';
    
    int r1;
    
    int r2;
    
    int t1 = 2;
    
    int t2 = 2;
    
    int t3 = 2;
    
    int gap1 = 1;
    
    int fac = 2;
    int facN;
    
    int face;
    
    int c;
    
    int angle;
    
    int angle1;
    
    int dxl;
    
    int dxr;
    
    int angle2;
    
    int angle3;
    
    int bottombs;
    
    int topbs;
    
    int tp1 = this.t1 * 4;
    
    int tp2 = this.t2 * 4;
    
    int tp3 = this.t3 * 4;
    
    int gap = this.gap1 * 4;
    
    int nr;
    
    int gapR;
    
    int tp1R;
    
    int tp2R;
    
    int angleR1;
    
    int angleR2;
    
    int r3;
    
    int r4;
    
    int faceR;
    
    int cR;
    
    int index2;
    
    int teller;
    
    int kurveteller;
    
    double scale = 1.0D;
    
    boolean bue = false;
    
    int xcentrum;
    
    int ycentrum;
    
    int x1centrum;
    
    int y1centrum;
    
    int x2centrum;
    
    int y2centrum;
    
    int xRUcentrum;
    
    int yRUcentrum;
    
    private int xmax;
    
    int ymax;
    int xradio;
    int yradio;
    
    private char typedChar;
    
    public Component scrollPane_Tegn;
    
    public JTextArea textArea_Tegn;
    
    private Container panelTegn;
    
    String stringCopy;
    
    private boolean dragAllowed;
    
    private boolean pressAllowed;
    
    private boolean clickAllowed;
    
    private boolean moveAllowed;
    
    boolean activated = false;
    
    boolean funnetE;
    
    boolean funnetD;
    
    boolean funnetM;
    
    boolean funnetF;
    
    private int forvs;
    
    private int forhs;
    
    List<ExtraLine> extraLine = new ArrayList<>();
    
    List<ExtraBase> extraBase = new ArrayList<>();
    List<ExtraBue> extraBue = new ArrayList<>();
    
    List<ExtraTall> extraTall = new ArrayList<>();
    
    List<ExtraEllipse> extraEllipse = new ArrayList<>();
    
    List<ExtraLine> extraLineTegn = new ArrayList<>();
    List<ExtraLine> extraLineTabell = new ArrayList<>();
    List<ExtraBue> extraBueTegn = new ArrayList<>();
    
    List<ExtraTall> extraTallTegn = new ArrayList<>();

//	List<ExtraTall> extraTallTegn = new ArrayList<>();
    List<ExtraTall> extraTallBase = new ArrayList<>();
    
    List<ExtraEllipse> extraEllipseTegn = new ArrayList<>();
    
    List<ExtraArray> extraArrayTegn = new ArrayList<>();
    
    List<ExtraOval> extraOval = new ArrayList<>();
    List<ExtraText> extraText = new ArrayList<>();
    List<ExtraComment> extraComment = new ArrayList<>();

    
    JMenuBar menuBar;
    
    JMenu fileMenu;
    
    JMenu editMenu;
    
    JMenu helpMenu;
    
    JMenuItem loadItem;
    
    JMenuItem saveItem;
    
    JMenuItem exitItem;
    boolean callCopy = true;
    
    private int xfac;
    private int yfac;

    private int digIntx;
    private int digInty;
    private int finy;
    public ArrayList<WeldPoint> resultListe = new ArrayList<>();
    
    public MyPanel() {
    	
    }
    
    public MyPanel(String plotType, int antall, int[] vec) {
      this.plotType = plotType;

      for (int i = 0; i < antall; i++) {
        this.vec[i] = vec[i];
        /*
        this.menuBar = new JMenuBar();
        this.fileMenu = new JMenu("File");
        this.editMenu = new JMenu("Edit");
        this.helpMenu = new JMenu("Help");
        this.loadItem = new JMenuItem("Load");
        this.saveItem = new JMenuItem("Save");
        this.exitItem = new JMenuItem("Exit");
        this.loadItem.addActionListener(this);
        this.saveItem.addActionListener(this);
        this.exitItem.addActionListener(this);
        this.fileMenu.setMnemonic(70);
        this.editMenu.setMnemonic(69);
        this.helpMenu.setMnemonic(72);
        this.loadItem.setMnemonic(76);
        this.saveItem.setMnemonic(83);
        this.exitItem.setMnemonic(69);
        this.fileMenu.add(this.loadItem);
        this.fileMenu.add(this.saveItem);
        this.fileMenu.add(this.exitItem);
        this.menuBar.add(this.fileMenu);
        this.menuBar.add(this.editMenu);
        this.menuBar.add(this.helpMenu);
        setVisible(true);
        */
      } 
      
      ExtraLine extraLine = new ExtraLine();
      this.nr = antall;
      transformParametre(plotType);
      Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
      double width = size.getWidth();
      double height = size.getHeight();
  //    System.out.println("6414  " + width + " " + height);
      this.xmax = (int)width;
      this.ymax = (int)height;
      this.xmax = 1600;   // 1680   // setting av størrelse
      this.ymax = 1144;				// setting av størrelse'
  
    }
    @Override
    public Dimension getPreferredSize() {
      if (this.gang[2] == 11 ||  this.gang[2] == 12 )      // 13
        return new Dimension(this.xmax, this.ymax/2); 
      if (this.gang[2] == 15 ||  this.gang[2] == 16 )      // 13
          return new Dimension(this.xmax/2, this.ymax);
      if (this.gang[2] == 13 )      // 13
          return new Dimension(this.xmax, this.ymax/2);
      if (this.gang[2] == 14)
        return new Dimension(this.xmax, this.ymax); 
      return new Dimension(this.xmax / 2, this.ymax/2);
    }
    
    public void transformParametre(String plott) {
      if (this.plotType.equals("overlap")) {
        this.listImage = 1;
        this.gap = this.fac * this.vec[0];
        this.tp1 = this.fac * this.vec[1];
        this.tp2 = this.fac * this.vec[2];
        this.y1[14] = this.vec[3];
        this.x1[13] = this.vec[4];
        this.gang[0] = this.vec[5];
        this.gang[1] = this.vec[6];
        this.gang[2] = this.vec[7];
        this.gang[3] = this.vec[8];
        this.gang[4] = this.vec[9];
        this.gang[5] = this.vec[10];
        this.gang[6] = this.vec[11];
        this.gang[7] = this.vec[12];
        this.x1[0] = 3 * Welding.this.s - this.tp1 / 3;
        this.x1[1] = -3 * Welding.this.s;
        this.x1[2] = -3 * Welding.this.s;
        this.x1[3] = 3 * Welding.this.s;
        this.x1[4] = 3 * Welding.this.s - this.tp1 / 3;
        this.x1[5] = 3 * Welding.this.s;
        this.x1[6] = 3 * Welding.this.s - this.tp1 / 3;
        this.x1[7] = 3 * Welding.this.s - this.tp1 / 3;
        this.nx1 = 6;
        this.y1[0] = 0;
        this.y1[1] = 0;
        this.y1[2] = -this.tp1;
        this.y1[3] = -this.tp1;
        this.y1[4] = -this.tp1 + this.tp1 / 3;
        this.y1[5] = -this.tp1 + 2 * this.tp1 / 3;
        this.y1[6] = -this.tp1 + 3 * this.tp1 / 3;
        this.y1[7] = 0;
        this.x2[0] = 0;
        this.x2[1] = 0;
        this.x2[2] = -6 * Welding.this.s;
        this.x2[3] = -6 * Welding.this.s - this.tp2 / 3;
        this.x2[4] = -6 * Welding.this.s;
        this.x2[5] = -6 * Welding.this.s - this.tp2 / 3;
        this.x2[6] = -6 * Welding.this.s;
        this.x2[7] = 0;
        this.nx2 = 5;
        this.y2[0] = this.gap;
        this.y2[1] = this.gap + this.tp2;
        this.y2[2] = this.gap + this.tp2;
        this.y2[3] = this.gap + this.tp2 - 1 * this.tp2 / 4;
        this.y2[4] = this.gap + this.tp2 - 2 * this.tp2 / 4;
        this.y2[5] = this.gap + this.tp2 - 3 * this.tp2 / 4;
        this.y2[6] = this.gap;
        this.y2[7] = this.gap;
        this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
        this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
        this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
        this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
        this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
        this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
        this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
        this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
        this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
        this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
        this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
        this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
        this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
      } 
      if (this.plotType.equals("filet")) {
        this.listImage = 1;
        
        int div = this.vec[5];
        facN = fac;
        if ( this.vec[5] != 0  && this.vec[5] <= 40 ) {
            double facND = 40*fac/div;
            facN = (int) facND;
        }
        facN = fac;  // nullstiller endring
//        System.out.println(facN + " "+ div);
        this.gap = facN * this.vec[0];
        this.angle = this.vec[1];
        this.filetVinkel = this.vec[1];
        this.bottombs = facN * this.vec[2];
        this.topbs = facN * this.vec[3];
        this.tp3 = facN * this.vec[4];
        this.tp2 = facN * this.vec[5];
        this.angle2 = this.vec[6];
        this.r1 = facN * this.vec[7];
        this.angle3 = this.vec[8];
        this.r2 = facN * this.vec[9];
        this.face = facN * this.vec[10];
        this.c = facN * this.vec[11];
        this.y1[14] = this.vec[13];
        this.x1[13] = this.vec[14];
        this.gang[0] = this.vec[15];
        this.gang[1] = this.vec[16];
        this.gang[2] = this.vec[17];
        this.gang[3] = this.vec[18];
        this.gang[4] = this.vec[19];
        this.gang[5] = this.vec[20];
        this.gang[6] = this.vec[21];
        this.gang[7] = this.vec[22];
        this.gang[19] = this.angle;
        if (this.angle != 90)
          this.x1[13] = this.x1[13] + 1; 
        this.x1[0] = 5 * Welding.this.s;
        this.x1[1] = -5 * Welding.this.s;
        this.x1[2] = -5 * Welding.this.s + this.tp3 / 2;
        this.x1[3] = -5 * Welding.this.s;
        this.x1[4] = 5 * Welding.this.s;
        this.x1[5] = 5 * Welding.this.s - this.tp3 / 2;
        this.x1[6] = 5 * Welding.this.s;
        this.x1[7] = -5 * Welding.this.s;
        this.nx1 = 6;
        this.y1[0] = this.tp3;
        this.y1[1] = this.tp3;
        this.y1[2] = this.tp3 / 2;
        this.y1[3] = 0;
        this.y1[4] = 0;
        this.y1[5] = this.tp3 / 2;
        this.y1[6] = this.tp3;
        this.y1[7] = this.tp3;
        this.x1[11] = 0;
        this.y1[11] = 0;
        
     /*  
        this.extraBase.add(0, new ExtraBase(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
        this.extraBase.add(0, new ExtraBase(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
        this.extraBase.add(0, new ExtraBase(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
        this.extraBase.add(0, new ExtraBase(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
        this.extraBase.add(0, new ExtraBase(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
        this.extraBase.add(0, new ExtraBase(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
        this.extraBase.add(0, new ExtraBase(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        
      
        */
        
        if (this.vec[12] == 1) {
          this.x2[0] = -this.tp2;
          this.x2[1] = -this.tp2;
          this.x2[2] = 0;
          this.x2[3] = 0;
          this.x2[4] = -this.tp2 / 4;
          this.x2[5] = -this.tp2 / 2;
          this.x2[6] = -3 * this.tp2 / 4;
          this.x2[7] = -this.tp2;
          this.nx2 = 5;
          this.y2[0] = -4 * Welding.this.s - this.gap;
          this.y2[1] = -this.gap;
          this.y2[2] = -this.gap;
          this.y2[3] = -4 * Welding.this.s - this.gap;
          this.y2[4] = -4 * Welding.this.s - this.gap + this.tp2 / 4;
          this.y2[5] = -4 * Welding.this.s - this.gap;
          this.y2[6] = -4 * Welding.this.s - this.gap + this.tp2 / 4;
          this.y2[7] = -4 * Welding.this.s - this.gap;
         
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
  //        System.out.println(" " + y2[3] + "  "  + y1[4]);
  //        if ( y2[3]  > y1[4] ) {
  //      	  plotOK = false;
  //        }
        } 
        for ( int j = 0; j < 7; j++) {
        	if ( y2[j] > 0 )
        		plotOK = false;
        }
        if (this.vec[12] == 2) {
          double y1 = (this.tp2 - this.face) * Math.tan(Math.PI * this.angle2 / 180.0D);
          int y1i = (int)y1;
          this.x2[0] = -this.face + this.tp2 / 4;
          this.x2[1] = -this.face;
          this.x2[2] = -this.face;
          this.x2[3] = 0;
          this.x2[4] = this.tp2 - this.face;
          this.x2[5] = this.tp2 - this.face;
          this.x2[6] = this.tp2 - this.face - this.tp2 / 4;
          this.x2[7] = this.tp2 - this.face - this.tp2 / 2;
          this.nx2 = 5;
          this.y2[0] = -4 * Welding.this.s - this.gap + this.tp2 / 4;
          this.y2[1] = -4 * Welding.this.s - this.gap;
          this.y2[2] = -this.gap;
          this.y2[3] = -this.gap;
          this.y2[4] = -y1i - this.gap;
          this.y2[5] = -4 * Welding.this.s - this.gap;
          this.y2[6] = -4 * Welding.this.s - this.gap + this.tp2 / 4;
          this.y2[7] = -4 * Welding.this.s - this.gap;
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
          for ( int j = 0; j < 7; j++) {
          	if ( y2[j] > 0 )
          		plotOK = false;
          }
        } 
        if (this.vec[12] == 3) {
          if (this.face > this.tp2)
            this.face = this.tp2; 
          if (this.c > this.tp2 - this.face)
            this.c = this.tp2 - this.face; 
          int ff = this.tp2 - this.c - this.face / 2;
          if (ff < 0)
            ff = 0; 
          double y2d = ff * Math.tan(Math.PI * this.angle2 / 180.0D);
          int y2i = (int)y2d;
          int gg = this.c - this.face / 2;
          if (gg < 0)
            gg = 0; 
          double y3d = gg * Math.tan(Math.PI * this.angle3 / 180.0D);
          int y3i = (int)y3d;
          this.x2[0] = -this.tp2 + this.c;
          this.x2[1] = -this.tp2 + this.c;
          this.x2[2] = -this.tp2 + this.c;
          this.x2[3] = -this.face / 2;
          this.x2[4] = this.face / 2;
          this.x2[5] = this.c;
          this.x2[6] = this.c;
          this.x2[7] = this.c;
          this.nx2 = 5;
          this.y2[0] = -4 * Welding.this.s - this.gap;
          this.y2[1] = -4 * Welding.this.s - this.gap;
          this.y2[2] = -y3i - this.gap;
          this.y2[3] = -this.gap;
          this.y2[4] = -this.gap;
          this.y2[5] = -y2i - this.gap;
          this.y2[6] = -4 * Welding.this.s - this.gap;
          this.y2[7] = -4 * Welding.this.s - this.gap;
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
          for ( int j = 0; j < 7; j++) {
          	if ( y2[j] > 0 )
          		plotOK = false;
          }
        } 
        if (this.vec[12] == 4) {
          double r1dU = this.r1 / 1.4142D;
          int r1iU = (int)r1dU;
          r1iU = this.r1;
          int ff = this.tp2 - this.face - r1iU;
          if (ff < 0)
            ff = 0; 
          double y4d = ff * Math.tan(Math.PI * this.angle2 / 180.0D);
          int y4i = (int)y4d;
          if (r1iU > this.tp2 - this.face)
            r1iU = this.tp2 - this.face; 
          if (this.face > this.tp2)
            this.face = this.tp2; 
          this.x2[0] = -this.face;
          this.x2[1] = -this.face;
          this.x2[2] = -this.face;
          this.x2[3] = 0;
          this.x2[4] = 0;
          this.x2[5] = 0;
          this.x2[6] = 0;
          this.x2[7] = 0;
          this.nx2 = 5;
          this.y2[0] = -4 * Welding.this.s - this.gap;
          this.y2[1] = -4 * Welding.this.s - this.gap;
          this.y2[2] = -this.gap;
          this.y2[3] = -this.gap;
          this.y2[4] = -this.gap;
          this.y2[5] = -this.gap;
          this.y2[6] = -this.gap;
          this.y2[7] = -this.gap;
          this.x3[0] = r1iU;
          this.x3[1] = this.tp2 - this.face;
          this.x3[2] = this.tp2 - this.face;
          this.x3[3] = this.tp2 - this.face;
          this.x3[4] = this.tp2 - this.face;
          this.x3[5] = this.tp2 - this.face;
          this.x3[6] = this.tp2 - this.face;
          this.x3[7] = this.tp2 - this.face;
          this.y3[0] = -r1iU - this.gap;
          this.y3[1] = -y4i - r1iU - this.gap;
          this.y3[2] = -4 * Welding.this.s - this.gap;
          this.y3[3] = -4 * Welding.this.s - this.gap;
          this.y3[4] = -4 * Welding.this.s - this.gap;
          this.y3[5] = -4 * Welding.this.s - this.gap;
          this.y3[6] = -4 * Welding.this.s - this.gap;
          this.y3[7] = -4 * Welding.this.s - this.gap;
          Welding.this.xcentrumFU = 0;
          Welding.this.ycentrumFU = -this.gap - r1iU / 2;
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
          this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
          this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
          this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
          this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
          this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
          this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
          this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
          for ( int j = 0; j < 7; j++) {
          	if ( y2[j] > 0 )
          		plotOK = false;
          	if ( y3[j] > 0 )
          		plotOK = false;
          }
        } 
        if (this.vec[12] == 5) {
          int lenLeft = this.tp2 - this.c - this.face / 2;
          double y5d = (lenLeft - this.r2) / Math.tan(Math.PI * (90 - this.angle3) / 180.0D);
          int hLeft = (int)y5d;
          double leftHypd = hLeft / Math.cos(Math.PI * (90 - this.angle3) / 180.0D);
          int leftHyp = (int)leftHypd;
          double lld = (2 * this.r1) * Math.sin(Math.PI * (90 - this.angle3) / 180.0D);
          int ll = (int)lld;
          double id = this.r1 * 1.0D;
          ll = (int)id;
          double lhd = (2 * this.r1) * Math.cos(Math.PI * (90 - this.angle3) / 180.0D);
          int lh = (int)lhd;
          double ld = this.r2 * 1.0D;
          lh = (int)ld;
          int lenRight = this.c - this.face / 2;
          double y6d = (lenRight - this.r1) / Math.tan(Math.PI * (90 - this.angle2) / 180.0D);
          int hRight = (int)y6d;
          double rightHypd = hRight / Math.cos(Math.PI * (90 - this.angle2) / 180.0D);
          int rightHyp = (int)rightHypd;
          double hld = (2 * this.r2) * Math.sin(Math.PI * (90 - this.angle2) / 180.0D);
          int hl = (int)hld;
          hl = this.r1;
          double hhd = (2 * this.r2) * Math.cos(Math.PI * (90 - this.angle2) / 180.0D);
          int hh = (int)hhd;
          hh = this.r1;
          if (ll > lenLeft + this.face / 2)
            ll = lenLeft; 
          if (hl > lenRight + this.face / 2)
            hl = lenRight + this.face / 2; 
          if (ll > lenLeft)
            ll = lenLeft; 
          if (hl > lenRight)
            hl = lenRight; 
          if (lh > hLeft)
            lh = hLeft; 
          if (hh > hRight)
            hh = hRight; 
          this.x2[0] = -lenLeft - this.face / 2;
          this.x2[1] = -lenLeft - this.face / 2;
          this.x2[2] = -lenLeft - this.face / 2;
          this.x2[3] = -ll - this.face / 2;
          this.x2[4] = -ll - this.face / 2;
          this.x2[5] = -ll - this.face / 2;
          this.x2[6] = -ll - this.face / 2;
          this.x2[7] = -ll - this.face / 2;
          this.nx2 = 5;
          this.y2[0] = -4 * Welding.this.s - this.gap;
          this.y2[1] = -4 * Welding.this.s - this.gap;
          this.y2[2] = -hLeft - this.gap - this.r2;
          this.y2[3] = -lh - this.gap;
          this.y2[4] = -lh - this.gap;
          this.y2[5] = -lh - this.gap;
          this.y2[6] = -lh - this.gap;
          this.y2[7] = -lh - this.gap;
          this.x3[0] = lenRight + this.face / 2;
          this.x3[1] = lenRight + this.face / 2;
          this.x3[2] = lenRight + this.face / 2;
          this.x3[3] = hl + this.face / 2;
          this.x3[4] = hl + this.face / 2;
          this.x3[5] = hl + this.face / 2;
          this.x3[6] = hl + this.face / 2;
          this.x3[7] = hl + this.face / 2;
          this.y3[0] = -4 * Welding.this.s - this.gap;
          this.y3[1] = -4 * Welding.this.s - this.gap;
          this.y3[2] = -hRight - this.gap - this.r1;
          this.y3[3] = -hh - this.gap;
          this.y3[4] = -hh - this.gap;
          this.y3[5] = -hh - this.gap;
          this.y3[6] = -hh - this.gap;
          this.y3[7] = -hh - this.gap;
          this.x4[0] = -this.face / 2;
          this.x4[1] = this.face / 2;
          this.x4[2] = this.face / 2;
          this.x4[3] = this.face / 2;
          this.x4[4] = this.face / 2;
          this.x4[5] = this.face / 2;
          this.x4[6] = this.face / 2;
          this.x4[7] = this.face / 2;
          this.y4[0] = -this.gap;
          this.y4[1] = -this.gap;
          this.y4[2] = -this.gap;
          this.y4[3] = -this.gap;
          this.y4[4] = -this.gap;
          this.y4[5] = -this.gap;
          this.y4[6] = -this.gap;
          this.y4[7] = -this.gap;
          Welding.this.xcentrumLDU = -this.face / 2 - ll / 4;
          Welding.this.ycentrumLDU = -lh / 2 - this.gap;
          Welding.this.xcentrumRDU = this.face / 2 + hl / 4;
          Welding.this.ycentrumRDU = -hh / 2 - this.gap;
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
          this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
          this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
          this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
          this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
          this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
          this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
          this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
          this.extraLine.add(0, new ExtraLine(this.x4[0], this.y4[0], this.x4[1], this.y4[1]));
          this.extraLine.add(0, new ExtraLine(this.x4[1], this.y4[1], this.x4[2], this.y4[2]));
          this.extraLine.add(0, new ExtraLine(this.x4[2], this.y4[2], this.x4[3], this.y4[3]));
          this.extraLine.add(0, new ExtraLine(this.x4[3], this.y4[3], this.x4[4], this.y4[4]));
          this.extraLine.add(0, new ExtraLine(this.x4[4], this.y4[4], this.x4[5], this.y4[5]));
          this.extraLine.add(0, new ExtraLine(this.x4[5], this.y4[5], this.x4[6], this.y4[6]));
          this.extraLine.add(0, new ExtraLine(this.x4[6], this.y4[6], this.x4[7], this.y4[7]));
          for ( int j = 0; j < 7; j++) {
            	if ( y2[j] > 0 )
            		plotOK = false;
            	if ( y3[j] > 0 )
            		plotOK = false;
            	if ( y3[j] > 0 )
            		plotOK = false;
            }
        } 
      } 
      if (this.plotType.equals("corner")) {
    	 
        this.listImage = 1;
        int div = this.vec[1];
        facN = fac;
        if ( this.vec[1] != 0  && this.vec[1] <= 10 ) {
            double facND = 10*fac/div;
            facN = (int) facND;
        }
        facN = fac;  // nullstiller endring
        this.angle = this.vec[0];
        this.angle1 = this.vec[3];
        this.angle2 = this.vec[4];
        this.tp1 = this.facN * this.vec[1];
        this.tp2 = this.facN * this.vec[2];
        this.dxl = this.facN * this.vec[5];
        this.dxr = this.facN * this.vec[6];
        this.y1[14] = this.vec[7];
        this.x1[13] = this.vec[8];
        this.gang[0] = this.vec[9];
        this.gang[1] = this.vec[10];
        this.gang[2] = this.vec[11];
        this.gang[3] = this.vec[12];
        this.gang[4] = this.vec[13];
        this.gang[5] = this.vec[14];
        this.gang[6] = this.vec[15];
        int length = 6 * Welding.this.s;
        double x0d = length * Math.sin(Math.PI * (this.angle / 2) / 360.0D);
        int x0i = (int)x0d;
        double y0d = length * Math.cos(Math.PI * (this.angle / 2) / 360.0D);
        int y0i = (int)y0d;
        double zc5 = (5 * Welding.this.s) / Math.tan(Math.PI * this.angle / 360.0D);
        int zc0 = (int)zc5;
        double zzc2 = (5 * Welding.this.s) / Math.cos(Math.PI * this.angle / 360.0D);
        int zc2 = (int)zzc2;
        double zzc1 = this.dxl / Math.cos(Math.PI * this.angle / 360.0D);
        int zc1 = (int)zzc1;
        double zzc3 = this.dxl / Math.sin(Math.PI * this.angle / 360.0D);
        int zc3 = (int)zzc3;
        double zzc4 = this.tp1 / Math.cos(Math.PI * this.angle1 / 180.0D);
        int zc4 = (int)zzc4;
        double zzc5 = zzc4 * Math.cos(Math.PI * (90 + this.angle1 - this.angle / 2) / 180.0D);
        int zc6 = (int)zzc5;
        double zzc9 = zzc4 * Math.sin(Math.PI * (90 + this.angle1 - this.angle / 2) / 180.0D);
        int zc9 = (int)zzc9;
        double zzc10 = this.tp1 * Math.cos(Math.PI * this.angle / 360.0D);
        int zc10 = (int)zzc10;
        double zzc7 = this.tp1 * Math.sin(Math.PI * this.angle / 360.0D);
        int zc7 = (int)zzc7;
        double ff = (zc10 / 4);
        int ffi = (int)ff;
        double ff2 = 2.0D * ff;
        int ffi2 = (int)ff2;
        double ff3 = 3.0D * ff;
        int ffi3 = (int)ff3;
        double fff = (zc6 / 4);
        int fffi = (int)fff;
        double ff4 = 2.0D * fff;
        int ffi4 = (int)ff4;
        double ff5 = 3.0D * fff;
        int ffi5 = (int)ff5;
        int yjuster = -110;
        this.x1[0] = -5 * Welding.this.s;
        this.x1[1] = zc3;
        this.x1[2] = zc3 - zc9;
        this.x1[3] = -5 * Welding.this.s - zc10;
        this.x1[4] = -5 * Welding.this.s + ffi3 - zc10;
        this.x1[5] = -5 * Welding.this.s + ffi2 - zc10;
        this.x1[6] = -5 * Welding.this.s + ffi - zc10;
        this.x1[7] = -5 * Welding.this.s;
        this.nx1 = 6;
        this.y1[0] = zc0 + yjuster;
        this.y1[1] = -zc1+ yjuster;
        this.y1[2] = -zc1 - zc6+ yjuster;
        this.y1[3] = zc0 - zc7+ yjuster;
        this.y1[4] = zc0 + ffi - zc7+ yjuster;
        this.y1[5] = zc0 + ffi4 - zc7+ yjuster;
        this.y1[6] = zc0 + ffi5 - zc7+ yjuster;
        this.y1[7] = zc0+ yjuster;
        zzc1 = this.dxr / Math.cos(Math.PI * this.angle / 360.0D);
        zc1 = (int)zzc1;
        zzc3 = this.dxr / Math.sin(Math.PI * this.angle / 360.0D);
        zc3 = (int)zzc3;
        zzc4 = this.tp2 / Math.cos(Math.PI * this.angle2 / 180.0D);
        zc4 = (int)zzc4;
        zzc5 = zzc4 * Math.cos(Math.PI * (90 + this.angle2 - this.angle / 2) / 180.0D);
        zc6 = (int)zzc5;
        zzc9 = zzc4 * Math.sin(Math.PI * (90 + this.angle2 - this.angle / 2) / 180.0D);
        zc9 = (int)zzc9;
        double y112d = this.tp2 * Math.sin(Math.PI * (this.angle / 2) / 360.0D);
        double x112d = this.tp2 * Math.cos(Math.PI * (this.angle / 2) / 360.0D);
        int y112 = (int)y112d;
        int x112 = (int)x112d;
        this.x2[0] = 5 * Welding.this.s;
        this.x2[1] = -zc3;
        this.x2[2] = -zc3 + zc9;
        this.x2[3] = 5 * Welding.this.s + x112;
        this.x2[4] = 5 * Welding.this.s;
        this.x2[5] = 5 * Welding.this.s;
        this.x2[6] = 5 * Welding.this.s;
        this.x2[7] = 5 * Welding.this.s;
        this.nx2 = 5;
        this.y2[0] = zc0+ yjuster;
        this.y2[1] = -zc1+ yjuster;
        this.y2[2] = -zc1 - zc6+ yjuster;
        this.y2[3] = zc0 - y112+ yjuster;
        this.y2[4] = zc0+ yjuster;
        this.y2[5] = zc0+ yjuster;
        this.y2[6] = zc0+ yjuster;
        this.y2[7] = zc0+ yjuster;
        
        this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
        this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
        this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
        this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
        this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
        this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
        this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
        this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
        this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
        this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
        this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
        this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
        this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));

      } 
      if (this.plotType.equals("flanged")) {
        this.listImage = 1;
        int div = this.vec[1];
        facN = fac;
        if ( this.vec[1] != 0  && this.vec[1] <= 10 ) {
            double facND = 10*fac/div;
            facN = (int) facND;
        }
        facN = fac;  // nullstiller endring
        this.gap = this.facN * this.vec[0];
        this.tp1 = this.facN * this.vec[1];
        this.r1 = this.facN * this.vec[2];
        double r1dFL = this.r1 * 1.4142D;
        int r1iFL = (int)r1dFL;
        this.y1[14] = this.vec[3];
        this.x1[13] = this.vec[4];
        this.gang[0] = this.vec[5];
        this.gang[1] = this.vec[6];
        this.gang[2] = this.vec[7];
        this.gang[3] = this.vec[8];
        this.gang[4] = this.vec[9];
        this.gang[5] = this.vec[10];
        this.gang[6] = this.vec[11];
        this.gang[7] = this.vec[12];
        this.x1[0] = -this.gap / 2 - this.tp1 - r1iFL;
        this.x1[1] = -4 * Welding.this.s - this.gap / 2;
        this.x1[2] = -4 * Welding.this.s - this.gap / 2 + this.tp1 / 2;
        this.x1[3] = -4 * Welding.this.s - this.gap / 2;
        this.x1[4] = -this.gap / 2 - this.tp1 - r1iFL;
        this.x1[5] = -this.gap / 2 - this.tp1 - r1iFL;
        this.x1[6] = -this.gap / 2 - this.tp1 - r1iFL;
        this.x1[7] = -this.gap / 2 - this.tp1 - r1iFL;
        this.nx1 = 6;
        this.y1[0] = r1iFL;
        this.y1[1] = r1iFL;
        this.y1[2] = r1iFL + this.tp1 / 2;
        this.y1[3] = r1iFL + this.tp1;
        this.y1[4] = r1iFL + this.tp1;
        this.y1[5] = r1iFL + this.tp1;
        this.y1[6] = r1iFL + this.tp1;
        this.y1[7] = r1iFL + this.tp1;
        this.x2[0] = this.gap / 2 + this.tp1 + r1iFL;
        this.x2[1] = 4 * Welding.this.s + this.gap / 2;
        this.x2[2] = 4 * Welding.this.s + this.gap / 2 - this.tp1 / 2;
        this.x2[3] = 4 * Welding.this.s + this.gap / 2;
        this.x2[4] = this.gap / 2 + this.tp1 + r1iFL;
        this.x2[5] = this.gap / 2 + this.tp1 + r1iFL;
        this.x2[6] = this.gap / 2 + this.tp1 + r1iFL;
        this.x2[7] = this.gap / 2 + this.tp1 + r1iFL;
        this.nx2 = 5;
        this.y2[0] = r1iFL;
        this.y2[1] = r1iFL;
        this.y2[2] = r1iFL + this.tp1 / 2;
        this.y2[3] = r1iFL + this.tp1;
        this.y2[4] = r1iFL + this.tp1;
        this.y2[5] = r1iFL + this.tp1;
        this.y2[6] = r1iFL + this.tp1;
        this.y2[7] = r1iFL + this.tp1;
        this.x3[0] = -this.gap / 2;
        this.x3[1] = -this.gap / 2 - this.tp1;
        this.x3[2] = -this.gap / 2 - this.tp1;
        this.x3[3] = -this.gap / 2 - this.tp1;
        this.x3[4] = -this.gap / 2 - this.tp1;
        this.x3[5] = -this.gap / 2 - this.tp1;
        this.x3[6] = -this.gap / 2 - this.tp1;
        this.x3[7] = -this.gap / 2 - this.tp1;
        this.y3[0] = 0;
        this.y3[1] = 0;
        this.y3[2] = 0;
        this.y3[3] = 0;
        this.y3[4] = 0;
        this.y3[5] = 0;
        this.y3[6] = 0;
        this.y3[7] = 0;
        this.x4[0] = this.gap / 2;
        this.x4[1] = this.gap / 2 + this.tp1;
        this.x4[2] = this.gap / 2 + this.tp1;
        this.x4[3] = this.gap / 2 + this.tp1;
        this.x4[4] = this.gap / 2 + this.tp1;
        this.x4[5] = this.gap / 2 + this.tp1;
        this.x4[6] = this.gap / 2 + this.tp1;
        this.x4[7] = this.gap / 2 + this.tp1;
        this.y4[0] = 0;
        this.y4[1] = 0;
        this.y4[2] = 0;
        this.y4[3] = 0;
        this.y4[4] = 0;
        this.y4[5] = 0;
        this.y4[6] = 0;
        this.y4[7] = 0;
        Welding.this.xcentrumA = -this.gap / 2 - this.tp1;
        Welding.this.ycentrumA = r1iFL;
        Welding.this.xcentrumB = -this.gap / 2;
        Welding.this.ycentrumB = r1iFL + this.tp1;
        Welding.this.xcentrumC = this.gap / 2;
        Welding.this.ycentrumC = r1iFL + this.tp1;
        Welding.this.xcentrumD = this.gap / 2 + this.tp1;
        Welding.this.ycentrumD = r1iFL;
        this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
        this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
        this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
        this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
        this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
        this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
        this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
        this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
        this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
        this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
        this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
        this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
        this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
        this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
        this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
        this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
        this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
        this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
        this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
        this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
        this.extraLine.add(0, new ExtraLine(this.x4[0], this.y4[0], this.x4[1], this.y4[1]));
        this.extraLine.add(0, new ExtraLine(this.x4[1], this.y4[1], this.x4[2], this.y4[2]));
        this.extraLine.add(0, new ExtraLine(this.x4[2], this.y4[2], this.x4[3], this.y4[3]));
        this.extraLine.add(0, new ExtraLine(this.x4[3], this.y4[3], this.x4[4], this.y4[4]));
        this.extraLine.add(0, new ExtraLine(this.x4[4], this.y4[4], this.x4[5], this.y4[5]));
        this.extraLine.add(0, new ExtraLine(this.x4[5], this.y4[5], this.x4[6], this.y4[6]));
        this.extraLine.add(0, new ExtraLine(this.x4[6], this.y4[6], this.x4[7], this.y4[7]));
      } 
      if (this.plotType.equals("Butt")) {
        this.listImage = 0;
        int div = this.vec[1];
        facN = fac;
        if ( this.vec[1] != 0  && this.vec[1] <= 40 ) {
            double facND = 40*fac/div;
            facN = (int) facND;
        }
        facN = fac;    // nullstiller endring
//        System.out.println(facN + " "+ div);
        this.gap = this.facN * this.vec[0];
        this.tp1 = this.facN * this.vec[1];
        this.forvs = this.facN * this.vec[1];
        this.tp1 = 0;
        this.tp2 = this.facN * this.vec[2];
        this.angle = this.vec[3];
        this.r1 = this.facN * this.vec[4];
        this.angle2 = this.vec[5];
        this.r2 = this.facN * this.vec[6];
        this.face = this.facN * this.vec[7];
        this.c = this.facN * this.vec[8];
        this.y1[14] = this.vec[10];
        this.x1[13] = this.vec[11];
        this.gang[0] = this.vec[12];
        this.gang[1] = this.vec[13];
        this.gang[2] = this.vec[14];
        this.gang[3] = this.vec[15];
        this.gang[4] = this.vec[16];
        this.gang[5] = this.vec[17];
        this.gang[6] = this.vec[18];
        this.gang[7] = this.vec[19];
        if (this.vec[9] == 1) {
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2;
          this.x1[2] = -this.gap / 2;
          this.x1[3] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[4] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[5] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[6] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[7] = -this.gap / 2 - 5 * Welding.this.s;
          this.y1[0] = -this.tp1 / 2 - this.tp2 / 2;
          this.y1[1] = -this.tp1 / 2 - this.tp2 / 2;
          this.y1[2] = -this.tp1 / 2 + this.tp2 / 2;
          this.y1[3] = -this.tp1 / 2 + this.tp2 / 2;
          this.y1[4] = -this.tp1 / 2 + this.tp2 / 2;
          this.y1[5] = -this.tp1 / 2 + this.tp2 / 2;
          this.y1[6] = -this.tp1 / 2 + this.tp2 / 2;
          this.y1[7] = -this.tp1 / 2 + this.tp2 / 2;
          this.nx1 = 4;
          this.nx2 = 0;
          this.x10[0] = -this.gap / 2 - 4 * Welding.this.s;
          this.y10[0] = -this.tp1 / 2;
          this.x10[1] = this.tp2;
          
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
          
        } 
        if (this.vec[9] == 2) {
          int z4 = this.tp2 - this.face;
          double z5 = z4 * Math.tan(Math.PI * this.angle / 180.0D);
          int zz2 = (int)z5;
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2;
          this.x1[2] = -this.gap / 2;
          this.x1[3] = -this.gap / 2 - zz2;
          this.x1[4] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[5] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[6] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[7] = -this.gap / 2 - 5 * Welding.this.s;
          this.y1[0] = this.tp1 + this.face / 2;
          this.y1[1] = this.tp1 + this.face / 2;
          this.y1[2] = this.tp1 - this.face / 2;
          this.y1[3] = this.tp1 - z4 - this.face / 2;
          this.y1[4] = this.tp1 - z4 - this.face / 2;
          this.y1[5] = this.tp1 - z4 - this.face / 2;
          this.y1[6] = this.tp1 - z4 - this.face / 2;
          this.y1[7] = this.tp1 - z4 - this.face / 2;
          this.nx1 = 5;
          this.nx2 = 0;
          this.x9[0] = this.x1[3];
          this.y9[0] = this.y1[3];
          this.x9[1] = this.x1[3] - zz2;
          this.y9[1] = this.y1[3] - z4;
          this.x9[2] = -this.gap / 2;
          this.y9[2] = this.y1[2];
          this.x9[3] = -this.gap / 2;
          this.y9[3] = -this.tp1 - this.face / 2 - 2 * z4;
          double x77 = (this.x9[0] + this.x1[2]) / 2.0D;
          double y77 = (this.y9[1] + this.y9[3]) / 3.0D;
          this.x9[4] = (int)x77;
          this.y9[4] = (int)y77;
          this.x10[0] = -this.gap / 2;
          this.y10[0] = this.tp1;
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        } 
        if (this.vec[9] == 3) {
          int z1 = this.tp2 - this.c - this.face / 2;
          int z3 = this.c - this.face / 2;
          if (z1 < 0)
            z1 = 0; 
          if (z3 < 0)
            z3 = 0; 
          if (this.c > this.tp2)
            this.c = this.tp2; 
          double z2 = z1 * Math.tan(Math.PI * this.angle2 / 180.0D);
          int zz = (int)z2;
          double z4 = z3 * Math.tan(Math.PI * this.angle / 180.0D);
          int zz1 = (int)z4;
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2 - zz;
          this.x1[2] = -this.gap / 2;
          this.x1[3] = -this.gap / 2;
          this.x1[4] = -this.gap / 2 - zz1;
          this.x1[5] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[6] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[7] = -this.gap / 2 - 5 * Welding.this.s;
          this.y1[0] = this.tp2 - this.c;
          this.y1[1] = this.tp2 - this.c;
          this.y1[2] = this.tp2 - this.c - z1;
          this.y1[3] = this.tp2 - this.c - z1 - this.face;
          this.y1[4] = -this.c;
          this.y1[5] = -this.c;
          this.y1[6] = -this.c;
          this.y1[7] = -this.c;
          this.nx1 = 6;
          this.nx2 = 0;
          this.x9[0] = this.x1[4];
          this.y9[0] = this.y1[4];
          this.x9[1] = this.x1[4] - zz1;
          this.y9[1] = this.y1[4] - z3;
          this.x9[2] = this.x1[1];
          this.y9[2] = this.y1[1];
          this.x9[3] = this.x1[1] - zz;
          this.y9[3] = this.y1[1] + z1;
          this.x9[4] = this.x1[3];
          this.y9[4] = this.y1[3];
          this.x9[5] = this.x1[3];
          this.y9[5] = this.y1[3] - 2 * z3;
          this.x9[6] = this.x1[2];
          this.y9[6] = this.y1[2];
          this.x9[7] = this.x1[2];
          this.y9[7] = this.y1[2] + 2 * z1;
          this.x9[9] = this.x9[2];
          this.y9[9] = this.y9[1];
          this.x9[10] = this.x1[2];
          this.y9[10] = this.y9[1];
          double x77 = (this.x9[0] + this.x1[3]) / 2.0D;
          double y77 = (this.y9[0] - z3);
          this.x9[8] = (int)x77;
          this.y9[8] = (int)y77;
          double x78 = (this.x9[2] + this.x9[6]) / 2.0D;
          double y78 = (this.y1[1] + z3);
          this.x9[11] = (int)x78;
          this.y9[11] = (int)y78;
          this.x10[0] = -this.gap / 2 - 4 * Welding.this.s;
          this.y10[0] = 0;
          this.x10[1] = this.tp2;
          this.x10[2] = -this.gap / 2;
          this.y10[2] = 0;
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        } 
        if (this.vec[9] == 4) {
          this.bue = true;
          int z4 = this.tp2 - this.face;
          double z5 = (z4 - this.r1) * Math.tan(Math.PI * this.angle / 180.0D);
          int zz2 = (int)z5;
          double zzr1 = (2 * this.r1) * Math.sin(Math.PI * this.angle / 180.0D);
          int zzr1i = (int)zzr1;
          zzr1i = this.r1;
          double zzr2 = (2 * this.r1) * Math.cos(Math.PI * this.angle / 180.0D);
          int zzr2i = (int)zzr2;
          zzr2i = this.r1;
          if (zzr2i > zz2)
            zzr2i = zz2; 
          if (zzr1i > z4)
            zzr1i = z4; 
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2;
          this.x1[2] = -this.gap / 2;
          this.x1[3] = -this.gap / 2;
          this.x1[4] = -this.gap / 2;
          this.x1[5] = -this.gap / 2;
          this.x1[6] = -this.gap / 2;
          this.x1[7] = -this.gap / 2;
          this.y1[0] = this.tp1 + this.face / 2;
          this.y1[1] = this.tp1 + this.face / 2;
          this.y1[2] = this.tp1 - this.face / 2;
          this.y1[3] = this.tp1 - this.face / 2;
          this.y1[4] = this.tp1 - this.face / 2;
          this.y1[5] = this.tp1 - this.face / 2;
          this.y1[6] = this.tp1 - this.face / 2;
          this.y1[7] = this.tp1 - this.face / 2;
          this.xcentrum = -this.gap / 2 - this.r1;
          this.ycentrum = -this.face / 2;
          this.x2[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x2[1] = -this.gap / 2 - zz2 - this.r1;
          this.x2[2] = -this.gap / 2 - zzr2i;
          this.x2[3] = -this.gap / 2 - zzr2i;
          this.x2[4] = -this.gap / 2 - zzr2i;
          this.x2[5] = -this.gap / 2 - zzr2i;
          this.x2[6] = -this.gap / 2 - zzr2i;
          this.x2[7] = -this.gap / 2 - zzr2i;
          this.y2[0] = this.tp1 - this.tp2 + this.face / 2;
          this.y2[1] = this.tp1 - this.tp2 + this.face / 2;
          this.y2[2] = this.tp1 - zzr1i - this.face / 2;
          this.y2[3] = this.tp1 - zzr1i - this.face / 2;
          this.y2[4] = this.tp1 - zzr1i - this.face / 2;
          this.y2[5] = this.tp1 - zzr1i - this.face / 2;
          this.y2[6] = this.tp1 - zzr1i - this.face / 2;
          this.y2[7] = this.tp1 - zzr1i - this.face / 2;
          this.nx1 = 4;
          this.nx2 = 0;
          this.x9[0] = this.x2[1];
          this.y9[0] = this.y2[1];
          this.x9[1] = this.x2[1] - -this.x2[1] + this.x2[2];
          this.y9[1] = this.y2[1] - -this.y2[1] + this.y2[2];
          this.x9[2] = this.x1[2];
          this.y9[2] = this.y1[2];
          this.x9[3] = this.x9[2];
          this.y9[3] = this.y1[2] - z4 - 2 * zzr2i;
          this.x9[4] = this.x9[0];
          this.y9[4] = this.y9[0];
          this.x9[5] = this.x1[2];
          this.y9[5] = this.y9[0];
          double x79 = (this.x9[0] + this.x1[2]) / 2.0D;
          double y79 = (this.y9[0] - 2 * zzr2i);
          this.x9[6] = (int)x79;
          this.y9[6] = (int)y79;
          this.x10[0] = -this.gap / 2 - 4 * Welding.this.s;
          this.y10[0] = -this.tp1 / 2;
          this.x10[1] = this.tp2;
          this.x10[2] = -this.gap / 2;
          this.y10[2] = this.tp1;
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
        } 
        if (this.vec[9] == 5) {
          this.bue = true;
          int z4 = this.c - this.face / 2;
          double z5 = (z4 - this.r2) * Math.tan(Math.PI * this.angle / 180.0D);
          int zz2 = (int)z5;
          int z9i = this.tp2 - this.c - this.face / 2;
          double zd55 = (z9i - this.r1) * Math.tan(Math.PI * this.angle2 / 180.0D);
          int zi5 = (int)zd55;
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[2] = -this.gap / 2 - zz2 - this.r2;
          this.x1[3] = -this.gap / 2 - this.r2;
          this.x1[4] = -this.gap / 2 - this.r2;
          this.x1[5] = -this.gap / 2 - this.r2;
          this.x1[6] = -this.gap / 2 - this.r2;
          this.x1[7] = -this.gap / 2 - this.r2;
          this.y1[0] = this.tp1 + this.c - this.tp2;
          this.y1[1] = this.tp1 + this.c - this.tp2;
          this.y1[2] = this.tp1 + this.c - this.tp2;
          this.y1[3] = this.tp1 - this.face / 2 - this.r2;
          this.y1[4] = this.tp1 - this.face / 2 - this.r2;
          this.y1[5] = this.tp1 - this.face / 2 - this.r2;
          this.y1[6] = this.tp1 - this.face / 2 - this.r2;
          this.y1[7] = this.tp1 - this.face / 2 - this.r2;
          this.x1centrum = -this.gap / 2 - this.r2 / 2;
          this.y1centrum = this.face / 2 - this.r2 / 2;
          this.x2[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x2[1] = -this.gap / 2 - 5 * Welding.this.s;
          this.x2[2] = -this.gap / 2 - zi5 - this.r1;
          this.x2[3] = -this.gap / 2 - this.r1;
          this.x2[4] = -this.gap / 2 - this.r1;
          this.x2[5] = -this.gap / 2 - this.r1;
          this.x2[6] = -this.gap / 2 - this.r1;
          this.x2[7] = -this.gap / 2 - this.r1;
          this.y2[0] = this.tp1 + this.c;
          this.y2[1] = this.tp1 + this.c;
          this.y2[2] = this.tp1 + this.c;
          this.y2[3] = this.tp1 + this.face / 2 + this.r1;
          this.y2[4] = this.tp1 + this.face / 2 + this.r1;
          this.y2[5] = this.tp1 + this.face / 2 + this.r1;
          this.y2[6] = this.tp1 + this.face / 2 + this.r1;
          this.y2[7] = this.tp1 + this.face / 2 + this.r1;
          this.nx1 = 4;
          this.nx2 = 0;
          this.x3[0] = -this.gap / 2;
          this.x3[1] = -this.gap / 2;
          this.x3[2] = -this.gap / 2;
          this.x3[3] = -this.gap / 2;
          this.x3[4] = -this.gap / 2;
          this.x3[5] = -this.gap / 2;
          this.x3[6] = -this.gap / 2;
          this.x3[7] = -this.gap / 2;
          this.y3[0] = this.tp1 - this.face / 2;
          this.y3[1] = this.tp1 + this.face / 2;
          this.y3[2] = this.tp1 + this.face / 2;
          this.y3[3] = this.tp1 + this.face / 2;
          this.y3[4] = this.tp1 + this.face / 2;
          this.y3[5] = this.tp1 + this.face / 2;
          this.y3[6] = this.tp1 + this.face / 2;
          this.y3[7] = this.tp1 + this.face / 2;
          this.x2centrum = -this.gap / 2 - this.r1 / 2;
          this.y2centrum = -this.face / 2 + this.r1 / 2;
          this.x9[0] = this.x1[3];
          this.y9[0] = this.y1[3];
          this.x9[1] = this.x1[3];
          this.x9[2] = this.x1[2];
          this.y9[2] = this.y1[2];
          this.x9[3] = this.x1[2] - -this.x1[2] + this.x1[3];
          this.y9[3] = this.y1[2] - -this.y1[2] + this.y1[3];
          this.x9[4] = this.x1[2];
          this.y9[4] = this.y1[2];
          this.x9[5] = this.x1[3];
          this.y9[5] = this.y1[2];
          this.y9[1] = this.y9[3];
          double x71 = (this.x1[3] + this.x1[2]) / 2.0D;
          double y71 = (this.y1[2] - 10);
          this.x9[6] = (int)x71;
          this.y9[6] = (int)y71;
          this.x10[0] = -this.gap / 2 - 4 * Welding.this.s;
          this.y10[0] = -this.tp1 / 2;
          this.x10[1] = this.tp2;
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
          this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
          this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
          this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
          this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
          this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
          this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
          this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
        } 
      } 
      if (this.plotType.equals("butt")) {
        this.listImage = 1;
        
        int div = this.vec[2];
        facN = fac;
        if ( this.vec[2] != 0  && this.vec[2] <= 40 ) {
            double facND = 40*fac/div;
            facN = (int) facND;
        }
        facN = fac;    // nullstiller endring
//        System.out.println(facN + " "+ div);
        this.gap = facN * this.vec[0];
        this.tp1 = facN * this.vec[1];
        this.forvs = facN * this.vec[1];
        this.tp1 = 0;
        this.tp2 = facN * this.vec[2];
        this.angle = this.vec[3];
        this.r1 = facN * this.vec[4];
        this.angle2 = this.vec[5];
        this.r2 = facN * this.vec[6];
        this.face = facN * this.vec[7];
        this.c = facN * this.vec[8];
        this.y1[14] = this.vec[10];
        this.x1[13] = this.vec[11];
        this.gapR = facN * this.vec[12];
        this.forhs = facN * this.vec[13];
        this.tp1R = 0;
        this.tp2R = facN * this.vec[14];
        this.angleR1 = this.vec[15];
        this.r3 = facN * this.vec[16];
        this.angleR2 = this.vec[17];
        this.r4 = facN * this.vec[18];
        this.faceR = facN * this.vec[19];
        this.cR = facN * this.vec[20];
        this.index2 = this.vec[21];
        this.y1[14] = this.vec[22];
        this.x1[13] = this.vec[23];
        this.gang[0] = this.vec[24];
        this.gang[1] = this.vec[25];
        this.gang[2] = this.vec[26];
        this.gang[3] = this.vec[27];
        this.gang[4] = this.vec[28];
        this.gang[5] = this.vec[29];
        this.gang[6] = this.vec[30];
        this.gang[7] = this.vec[31];
        if (this.vec[9] == 1) {
          int forskyvI = -this.tp2 / 2 - this.forvs + this.forhs;
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2;
          this.x1[2] = -this.gap / 2;
          this.x1[3] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[4] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[5] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[6] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[7] = -this.gap / 2 - 5 * Welding.this.s;
          this.y1[0] = -this.tp1 / 2 - this.tp2 / 2 + forskyvI;
          this.y1[1] = -this.tp1 / 2 - this.tp2 / 2 + forskyvI;
          this.y1[2] = -this.tp1 / 2 + this.tp2 / 2 + forskyvI;
          this.y1[3] = -this.tp1 / 2 + this.tp2 / 2 + forskyvI;
          this.y1[4] = -this.tp1 / 2 + this.tp2 / 2 + forskyvI;
          this.y1[5] = -this.tp1 / 2 + this.tp2 / 2 + forskyvI;
          this.y1[6] = -this.tp1 / 2 + this.tp2 / 2 + forskyvI;
          this.y1[7] = -this.tp1 / 2 + this.tp2 / 2 + forskyvI;
          this.nx1 = 4;
          this.nx2 = 0;
          
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
          
        } 
        if (this.vec[9] == 2) {
          int z4 = this.tp2 - this.face;
          double z5 = z4 * Math.tan(Math.PI * this.angle / 180.0D);
          int zz2 = (int)z5;
          int forskyvY = -this.face / 2 - this.forvs + this.forhs;
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2;
          this.x1[2] = -this.gap / 2;
          this.x1[3] = -this.gap / 2 - zz2;
          this.x1[4] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[5] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[6] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[7] = -this.gap / 2 - 5 * Welding.this.s;
          this.y1[0] = this.tp1 + this.face / 2 + forskyvY;
          this.y1[1] = this.tp1 + this.face / 2 + forskyvY;
          this.y1[2] = this.tp1 - this.face / 2 + forskyvY;
          this.y1[3] = this.tp1 - z4 - this.face / 2 + forskyvY;
          this.y1[4] = this.tp1 - z4 - this.face / 2 + forskyvY;
          this.y1[5] = this.tp1 - z4 - this.face / 2 + forskyvY;
          this.y1[6] = this.tp1 - z4 - this.face / 2 + forskyvY;
          this.y1[7] = this.tp1 - z4 - this.face / 2 + forskyvY;
          this.nx1 = 5;
          this.nx2 = 0;
          this.x9[0] = this.x1[3];
          this.y9[0] = this.y1[3];
          this.x9[1] = this.x1[3] - zz2;
          this.y9[1] = this.y1[3] - z4;
          this.x9[2] = -this.gap / 2;
          this.y9[2] = this.y1[2];
          this.x9[3] = -this.gap / 2;
          this.y9[3] = -this.tp1 - this.face / 2 - 2 * z4;
          double x77 = (this.x9[0] + this.x1[2]) / 2.0D;
          double y77 = (this.y9[1] + this.y9[3]) / 3.0D;
          this.x9[4] = (int)x77;
          this.y9[4] = (int)y77;
          this.x10[2] = -this.gap / 2;
          this.y10[2] = this.tp1 + forskyvY;
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        } 
        if (this.vec[9] == 3) {
          int z1 = this.tp2 - this.c - this.face / 2;
          int z3 = this.c - this.face / 2;
          double z2 = z1 * Math.tan(Math.PI * this.angle2 / 180.0D);
          int zz = (int)z2;
          int forskyvX = -this.c - this.forvs + this.forhs;
          double z4 = z3 * Math.tan(Math.PI * this.angle / 180.0D);
          int zz1 = (int)z4;
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2 - zz;
          this.x1[2] = -this.gap / 2;
          this.x1[3] = -this.gap / 2;
          this.x1[4] = -this.gap / 2 - zz1;
          this.x1[5] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[6] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[7] = -this.gap / 2 - 5 * Welding.this.s;
          this.y1[0] = this.tp2 - this.c + forskyvX;
          this.y1[1] = this.tp2 - this.c + forskyvX;
          this.y1[2] = this.tp2 - this.c + forskyvX - z1;
          this.y1[3] = this.tp2 - this.c + forskyvX - z1 - this.face;
          this.y1[4] = -this.c + forskyvX;
          this.y1[5] = -this.c + forskyvX;
          this.y1[6] = -this.c + forskyvX;
          this.y1[7] = -this.c + forskyvX;
          this.nx1 = 6;
          this.nx2 = 0;
          this.x9[0] = this.x1[4];
          this.y9[0] = this.y1[4];
          this.x9[1] = this.x1[4] - zz1;
          this.y9[1] = this.y1[4] - z3;
          this.x9[2] = this.x1[1];
          this.y9[2] = this.y1[1];
          this.x9[3] = this.x1[1] - zz;
          this.y9[3] = this.y1[1] + z1;
          this.x9[4] = this.x1[3];
          this.y9[4] = this.y1[3];
          this.x9[5] = this.x1[3];
          this.y9[5] = this.y1[3] - 2 * z3;
          this.x9[6] = this.x1[2];
          this.y9[6] = this.y1[2];
          this.x9[7] = this.x1[2];
          this.y9[7] = this.y1[2] + 2 * z1;
          this.x9[9] = this.x9[2];
          this.y9[9] = this.y9[1];
          this.x9[10] = this.x1[2];
          this.y9[10] = this.y9[1];
          double x77 = (this.x9[0] + this.x1[3]) / 2.0D;
          double y77 = (this.y9[0] - z3);
          this.x9[8] = (int)x77;
          this.y9[8] = (int)y77;
          double x78 = (this.x9[2] + this.x9[6]) / 2.0D;
          double y78 = (this.y1[1] + z3);
          this.x9[11] = (int)x78;
          this.y9[11] = (int)y78;
          this.x10[0] = -this.gap / 2 - 4 * Welding.this.s;
          this.y10[0] = this.tp1 + forskyvX;
          this.x10[1] = this.tp2;
          this.x10[2] = -this.gap / 2;
          this.y10[2] = this.tp1 + forskyvX;
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        } 
        if (this.vec[9] == 4) {
          this.bue = true;
          int z4 = this.tp2 - this.face;
          double z5 = (z4 - this.r1) * Math.tan(Math.PI * this.angle / 180.0D);
          int zz2 = (int)z5;
          double zzr1 = (2 * this.r1) * Math.sin(Math.PI * this.angle / 180.0D);
          int zzr1i = (int)zzr1;
          zzr1i = this.r1;
          double zzr2 = (2 * this.r1) * Math.cos(Math.PI * this.angle / 180.0D);
          int zzr2i = (int)zzr2;
          zzr2i = this.r1;
          int forskyvU = -this.face / 2 - this.forvs + this.forhs;
          if (zzr2i > zz2)
            zzr2i = zz2; 
          if (zzr1i > z4)
            zzr1i = z4; 
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2;
          this.x1[2] = -this.gap / 2;
          this.x1[3] = -this.gap / 2;
          this.x1[4] = -this.gap / 2;
          this.x1[5] = -this.gap / 2;
          this.x1[6] = -this.gap / 2;
          this.x1[7] = -this.gap / 2;
          this.y1[0] = this.tp1 + this.face / 2 + forskyvU;
          this.y1[1] = this.tp1 + this.face / 2 + forskyvU;
          this.y1[2] = this.tp1 - this.face / 2 + forskyvU;
          this.y1[3] = this.tp1 - this.face / 2 + forskyvU;
          this.y1[4] = this.tp1 - this.face / 2 + forskyvU;
          this.y1[5] = this.tp1 - this.face / 2 + forskyvU;
          this.y1[6] = this.tp1 - this.face / 2 + forskyvU;
          this.y1[7] = this.tp1 - this.face / 2 + forskyvU;
          this.xcentrum = -this.gap / 2 - this.r1 / 2;
          this.ycentrum = -this.face / 2 + forskyvU;
          this.x2[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x2[1] = -this.gap / 2 - zz2 - this.r1;
          this.x2[2] = -this.gap / 2 - zzr2i;
          this.x2[3] = -this.gap / 2 - zzr2i;
          this.x2[4] = -this.gap / 2 - zzr2i;
          this.x2[5] = -this.gap / 2 - zzr2i;
          this.x2[6] = -this.gap / 2 - zzr2i;
          this.x2[7] = -this.gap / 2 - zzr2i;
          this.y2[0] = this.tp1 - this.tp2 + this.face / 2 + forskyvU;
          this.y2[1] = this.tp1 - this.tp2 + this.face / 2 + forskyvU;
          this.y2[2] = this.tp1 - zzr1i - this.face / 2 + forskyvU;
          this.y2[3] = this.tp1 - zzr1i - this.face / 2 + forskyvU;
          this.y2[4] = this.tp1 - zzr1i - this.face / 2 + forskyvU;
          this.y2[5] = this.tp1 - zzr1i - this.face / 2 + forskyvU;
          this.y2[6] = this.tp1 - zzr1i - this.face / 2 + forskyvU;
          this.y2[7] = this.tp1 - zzr1i - this.face / 2 + forskyvU;
          this.nx1 = 4;
          this.nx2 = 0;
          this.x9[0] = this.x2[1];
          this.y9[0] = this.y2[1];
          this.x9[1] = this.x2[1] - -this.x2[1] + this.x2[2];
          this.y9[1] = this.y2[1] - -this.y2[1] + this.y2[2];
          this.x9[2] = this.x1[2];
          this.y9[2] = this.y1[2];
          this.x9[3] = this.x9[2];
          this.y9[3] = this.y1[2] - z4 - 2 * zzr2i;
          this.x9[4] = this.x9[0];
          this.y9[4] = this.y9[0];
          this.x9[5] = this.x1[2];
          this.y9[5] = this.y9[0];
          double x79 = (this.x9[0] + this.x1[2]) / 2.0D;
          double y79 = (this.y9[0] - 2 * zzr2i);
          this.x9[6] = (int)x79;
          this.y9[6] = (int)y79;
          this.x10[0] = -this.gap / 2 - 4 * Welding.this.s;
          this.y10[0] = -this.tp1 / 2;
          this.x10[1] = this.tp2;
          this.x10[2] = -this.gap / 2;
          this.y10[2] = this.tp1 - this.face / 2;
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
        } 
        if (this.vec[9] == 5) {
          this.bue = true;
          int z4 = this.c - this.face / 2;
          double z5 = (z4 - this.r2) * Math.tan(Math.PI * this.angle / 180.0D);
          int zz2 = (int)z5;
          int forskyvDU = -this.c - this.forvs + this.forhs;
          int zzr1i = this.r1;
          int zzr2i = this.r2;
          int z8i = this.tp2 - this.c - this.face / 2;
          double zd5 = (z8i - this.r1) * Math.tan(Math.PI * this.angle2 / 180.0D);
          int zi5 = (int)zd5;
          this.x1[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[1] = -this.gap / 2 - 5 * Welding.this.s;
          this.x1[2] = -this.gap / 2 - zz2 - this.r2;
          this.x1[3] = -this.gap / 2 - this.r2;
          this.x1[4] = -this.gap / 2 - this.r2;
          this.x1[5] = -this.gap / 2 - this.r2;
          this.x1[6] = -this.gap / 2 - this.r2;
          this.x1[7] = -this.gap / 2 - this.r2;
          this.y1[0] = this.tp1 + this.c - this.tp2 + forskyvDU;
          this.y1[1] = this.tp1 + this.c - this.tp2 + forskyvDU;
          this.y1[2] = this.tp1 + this.c - this.tp2 + forskyvDU;
          this.y1[3] = this.tp1 - this.face / 2 - this.r2 + forskyvDU;
          this.y1[4] = this.tp1 - this.face / 2 - this.r2 + forskyvDU;
          this.y1[5] = this.tp1 - this.face / 2 - this.r2 + forskyvDU;
          this.y1[6] = this.tp1 - this.face / 2 - this.r2 + forskyvDU;
          this.y1[7] = this.tp1 - this.face / 2 - this.r2 + forskyvDU;
          this.x1centrum = -this.gap / 2 - this.r2 / 2;
          this.y1centrum = this.face / 2 - this.r2 / 2 + forskyvDU;
          this.x2[0] = -this.gap / 2 - 5 * Welding.this.s;
          this.x2[1] = -this.gap / 2 - 5 * Welding.this.s;
          this.x2[2] = -this.gap / 2 - zi5 - this.r1;
          this.x2[3] = -this.gap / 2 - this.r1;
          this.x2[4] = -this.gap / 2 - this.r1;
          this.x2[5] = -this.gap / 2 - this.r1;
          this.x2[6] = -this.gap / 2 - this.r1;
          this.x2[7] = -this.gap / 2 - this.r1;
          this.y2[0] = this.tp1 + this.c + forskyvDU;
          this.y2[1] = this.tp1 + this.c + forskyvDU;
          this.y2[2] = this.tp1 + this.c + forskyvDU;
          this.y2[3] = this.tp1 + this.face / 2 + this.r1 + forskyvDU;
          this.y2[4] = this.tp1 + this.face / 2 + this.r1 + forskyvDU;
          this.y2[5] = this.tp1 + this.face / 2 + this.r1 + forskyvDU;
          this.y2[6] = this.tp1 + this.face / 2 + this.r1 + forskyvDU;
          this.y2[7] = this.tp1 + this.face / 2 + this.r1 + forskyvDU;
          this.nx1 = 4;
          this.nx2 = 0;
          this.x3[0] = -this.gap / 2;
          this.x3[1] = -this.gap / 2;
          this.x3[2] = -this.gap / 2;
          this.x3[3] = -this.gap / 2;
          this.x3[4] = -this.gap / 2;
          this.x3[5] = -this.gap / 2;
          this.x3[6] = -this.gap / 2;
          this.x3[7] = -this.gap / 2;
          this.y3[0] = this.tp1 - this.face / 2 + forskyvDU;
          this.y3[1] = this.tp1 + this.face / 2 + forskyvDU;
          this.y3[2] = this.tp1 + this.face / 2 + forskyvDU;
          this.y3[3] = this.tp1 + this.face / 2 + forskyvDU;
          this.y3[4] = this.tp1 + this.face / 2 + forskyvDU;
          this.y3[5] = this.tp1 + this.face / 2 + forskyvDU;
          this.y3[6] = this.tp1 + this.face / 2 + forskyvDU;
          this.y3[7] = this.tp1 + this.face / 2 + forskyvDU;
          this.x2centrum = -this.gap / 2 - this.r1 / 2;
          this.y2centrum = -this.face / 2 + this.r1 / 2 + forskyvDU;
          this.x9[0] = this.x2[1];
          this.y9[0] = this.y2[1] + forskyvDU;
          this.x9[1] = this.x2[1] - -this.x2[1] + this.x2[2];
          this.y9[1] = this.y2[1] - -this.y2[1] + this.y2[2] + forskyvDU;
          this.x9[2] = this.x1[2];
          this.y9[2] = this.y1[2] + forskyvDU;
          this.x9[3] = this.x9[2];
          this.y9[3] = this.y1[2] - z4 - 2 * zzr2i + forskyvDU;
          this.x9[4] = this.x9[0];
          this.y9[4] = this.y9[0] + forskyvDU;
          this.x9[5] = this.x1[2];
          this.y9[5] = this.y9[0] + forskyvDU;
          double x79 = (this.x9[0] + this.x1[2]) / 2.0D;
          double y79 = (this.y9[0] - 2 * zzr2i + forskyvDU);
          this.x9[6] = (int)x79;
          this.y9[6] = (int)y79;
          this.x10[0] = -this.gap / 2 - 4 * Welding.this.s;
          this.y10[0] = -this.tp1 / 2 + forskyvDU;
          this.x10[1] = this.tp2;
          this.x10[2] = -this.gap / 2;
          this.y10[2] = this.tp1 + forskyvDU;
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
          this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
          this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
          this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
          this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
          this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
          this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
          this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
          this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
          this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
          this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
          this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
          this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
          this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
          this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
          this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
          this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
          this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
          this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
        } 
      } 
      if (this.index2 == 1) {
        int forskyvII = -this.tp2R / 2;
        this.x5[0] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[1] = this.gapR / 2;
        this.x5[2] = this.gapR / 2;
        this.x5[3] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[4] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[5] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[6] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[7] = this.gapR / 2 + 5 * Welding.this.s;
        this.y5[0] = this.tp2R / 2 + this.tp1R + forskyvII;
        this.y5[1] = this.tp2R / 2 + this.tp1R + forskyvII;
        this.y5[2] = -this.tp2R / 2 + this.tp1R + forskyvII;
        this.y5[3] = -this.tp2R / 2 + this.tp1R + forskyvII;
        this.y5[4] = -this.tp2R / 2 + this.tp1R + forskyvII;
        this.y5[5] = -this.tp2R / 2 + this.tp1R + forskyvII;
        this.y5[6] = -this.tp2R / 2 + this.tp1R + forskyvII;
        this.y5[7] = -this.tp2R / 2 + this.tp1R + forskyvII;
        
        this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[1], this.y5[1]));
        this.extraLine.add(0, new ExtraLine(this.x5[1], this.y5[1], this.x5[2], this.y5[2]));
        this.extraLine.add(0, new ExtraLine(this.x5[2], this.y5[2], this.x5[3], this.y5[3]));
        this.extraLine.add(0, new ExtraLine(this.x5[3], this.y5[3], this.x5[4], this.y5[4]));
        this.extraLine.add(0, new ExtraLine(this.x5[4], this.y5[4], this.x5[5], this.y5[5]));
        this.extraLine.add(0, new ExtraLine(this.x5[5], this.y5[5], this.x5[6], this.y5[6]));
        this.extraLine.add(0, new ExtraLine(this.x5[6], this.y5[6], this.x5[7], this.y5[7]));
        
      } 
      if (this.index2 == 2) {
        double xxc = (this.tp2R - this.faceR) / Math.tan(Math.PI * (90 - this.angleR1) / 180.0D);
        int xxci = (int)xxc;
        int forskyvYY = -this.faceR / 2;
        this.x5[0] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[1] = this.gapR / 2;
        this.x5[2] = this.gapR / 2;
        this.x5[3] = this.gapR / 2 + xxci;
        this.x5[4] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[5] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[6] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[7] = this.gapR / 2 + 5 * Welding.this.s;
        this.y5[0] = this.tp1R + this.faceR / 2 + forskyvYY;
        this.y5[1] = this.tp1R + this.faceR / 2 + forskyvYY;
        this.y5[2] = this.tp1R - this.faceR / 2 + forskyvYY;
        this.y5[3] = this.tp1R + this.faceR / 2 - this.tp2R + forskyvYY;
        this.y5[4] = this.tp1R + this.faceR / 2 - this.tp2R + forskyvYY;
        this.y5[5] = this.tp1R + this.faceR / 2 - this.tp2R + forskyvYY;
        this.y5[6] = this.tp1R + this.faceR / 2 - this.tp2R + forskyvYY;
        this.y5[7] = this.tp1R + this.faceR / 2 - this.tp2R + forskyvYY;
        this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[1], this.y5[1]));
        this.extraLine.add(0, new ExtraLine(this.x5[1], this.y5[1], this.x5[2], this.y5[2]));
        this.extraLine.add(0, new ExtraLine(this.x5[2], this.y5[2], this.x5[3], this.y5[3]));
        this.extraLine.add(0, new ExtraLine(this.x5[3], this.y5[3], this.x5[4], this.y5[4]));
        this.extraLine.add(0, new ExtraLine(this.x5[4], this.y5[4], this.x5[5], this.y5[5]));
        this.extraLine.add(0, new ExtraLine(this.x5[5], this.y5[5], this.x5[6], this.y5[6]));
        this.extraLine.add(0, new ExtraLine(this.x5[6], this.y5[6], this.x5[7], this.y5[7]));
      } 
      if (this.index2 == 3) {
        double xx2d = (this.c - this.faceR / 2) * Math.tan(Math.PI * this.angleR2 / 180.0D);
        int xx2i = (int)xx2d;
        double xx3d = (this.tp2R - this.cR - this.faceR / 2) * Math.tan(Math.PI * this.angleR1 / 180.0D);
        int xx3i = (int)xx3d;
        int forskyvXX = -this.cR;
        this.x5[0] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[1] = this.gapR / 2 + xx2i;
        this.x5[2] = this.gapR / 2;
        this.x5[3] = this.gapR / 2;
        this.x5[4] = this.gapR / 2 + xx3i;
        this.x5[5] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[6] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[7] = this.gapR / 2 + 5 * Welding.this.s;
        this.y5[0] = this.tp1R + this.cR + forskyvXX;
        this.y5[1] = this.tp1R + this.cR + forskyvXX;
        this.y5[2] = this.tp1R + this.faceR / 2 + forskyvXX;
        this.y5[3] = this.tp1R - this.faceR / 2 + forskyvXX;
        this.y5[4] = this.tp1R + this.cR - this.tp2R + forskyvXX;
        this.y5[5] = this.tp1R + this.cR - this.tp2R + forskyvXX;
        this.y5[6] = this.tp1R + this.cR - this.tp2R + forskyvXX;
        this.y5[7] = this.tp1R + this.cR - this.tp2R + forskyvXX;
        this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[1], this.y5[1]));
        this.extraLine.add(0, new ExtraLine(this.x5[1], this.y5[1], this.x5[2], this.y5[2]));
        this.extraLine.add(0, new ExtraLine(this.x5[2], this.y5[2], this.x5[3], this.y5[3]));
        this.extraLine.add(0, new ExtraLine(this.x5[3], this.y5[3], this.x5[4], this.y5[4]));
        this.extraLine.add(0, new ExtraLine(this.x5[4], this.y5[4], this.x5[5], this.y5[5]));
        this.extraLine.add(0, new ExtraLine(this.x5[5], this.y5[5], this.x5[6], this.y5[6]));
        this.extraLine.add(0, new ExtraLine(this.x5[6], this.y5[6], this.x5[7], this.y5[7]));
      } 
      if (this.index2 == 4) {
        int z4R = this.tp2R - this.faceR;
        double z5R = z4R * Math.tan(Math.PI * this.angleR1 / 180.0D);
        int zz2R = (int)z5R;
        double zzr1R = (2 * this.r3) * Math.sin(Math.PI * this.angleR1 / 180.0D);
        int zzr1iR = (int)zzr1R;
        double zzr2R = (2 * this.r3) * Math.cos(Math.PI * this.angleR1 / 180.0D);
        int zzr2iR = (int)zzr2R;
        int forskyvUU = -this.faceR / 2;
        if (zzr2iR > zz2R)
          zzr2iR = zz2R; 
        if (zzr1iR > z4R)
          zzr1iR = z4R; 
        zzr2iR = this.r3;
        zzr2iR = this.r2;
        this.x5[0] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[1] = this.gapR / 2;
        this.x5[2] = this.gapR / 2;
        this.x5[3] = this.gapR / 2;
        this.x5[4] = this.gapR / 2;
        this.x5[5] = this.gapR / 2;
        this.x5[6] = this.gapR / 2;
        this.x5[7] = this.gapR / 2;
        this.y5[0] = this.tp1R + this.faceR / 2 + forskyvUU;
        this.y5[1] = this.tp1R + this.faceR / 2 + forskyvUU;
        this.y5[2] = this.tp1R - this.faceR / 2 + forskyvUU;
        this.y5[3] = this.tp1R - this.faceR / 2 + forskyvUU;
        this.y5[4] = this.tp1R - this.faceR / 2 + forskyvUU;
        this.y5[5] = this.tp1R - this.faceR / 2 + forskyvUU;
        this.y5[6] = this.tp1R - this.faceR / 2 + forskyvUU;
        this.y5[7] = this.tp1R - this.faceR / 2 + forskyvUU;
        this.x6[0] = this.gapR / 2 + 5 * Welding.this.s;
        this.x6[1] = this.gapR / 2 + zz2R;
        this.x6[2] = this.gapR / 2 + zzr2iR;
        this.x6[3] = this.gapR / 2 + zzr2iR;
        this.x6[4] = this.gapR / 2 + zzr2iR;
        this.x6[5] = this.gapR / 2 + zzr2iR;
        this.x6[6] = this.gapR / 2 + zzr2iR;
        this.x6[7] = this.gapR / 2 + zzr2iR;
        this.y6[0] = this.tp1R + this.faceR / 2 - this.tp2R + forskyvUU;
        this.y6[1] = this.tp1R + this.faceR / 2 - this.tp2R + forskyvUU;
        this.y6[2] = this.tp1R - this.faceR / 2 - zzr1iR + forskyvUU;
        this.y6[3] = this.tp1R - this.faceR / 2 - zzr1iR + forskyvUU;
        this.y6[4] = this.tp1R - this.faceR / 2 - zzr1iR + forskyvUU;
        this.y6[5] = this.tp1R - this.faceR / 2 - zzr1iR + forskyvUU;
        this.y6[6] = this.tp1R - this.faceR / 2 - zzr1iR + forskyvUU;
        this.y6[7] = this.tp1R - this.faceR / 2 - zzr1iR + forskyvUU;
        this.xRUcentrum = this.gapR / 2 + zzr2iR / 2;
        this.yRUcentrum = -this.faceR / 2 + forskyvUU;
        this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[1], this.y5[1]));
        this.extraLine.add(0, new ExtraLine(this.x5[1], this.y5[1], this.x5[2], this.y5[2]));
        this.extraLine.add(0, new ExtraLine(this.x5[2], this.y5[2], this.x5[3], this.y5[3]));
        this.extraLine.add(0, new ExtraLine(this.x5[3], this.y5[3], this.x5[4], this.y5[4]));
        this.extraLine.add(0, new ExtraLine(this.x5[4], this.y5[4], this.x5[5], this.y5[5]));
        this.extraLine.add(0, new ExtraLine(this.x5[5], this.y5[5], this.x5[6], this.y5[6]));
        this.extraLine.add(0, new ExtraLine(this.x5[6], this.y5[6], this.x5[7], this.y5[7]));
        this.extraLine.add(0, new ExtraLine(this.x6[0], this.y6[0], this.x6[1], this.y6[1]));
        this.extraLine.add(0, new ExtraLine(this.x6[1], this.y6[1], this.x6[2], this.y6[2]));
        this.extraLine.add(0, new ExtraLine(this.x6[2], this.y6[2], this.x6[3], this.y6[3]));
        this.extraLine.add(0, new ExtraLine(this.x6[3], this.y6[3], this.x6[4], this.y6[4]));
        this.extraLine.add(0, new ExtraLine(this.x6[4], this.y6[4], this.x6[5], this.y6[5]));
        this.extraLine.add(0, new ExtraLine(this.x6[5], this.y6[5], this.x6[6], this.y6[6]));
        this.extraLine.add(0, new ExtraLine(this.x6[6], this.y6[6], this.x6[7], this.y6[7]));
      } 
      if (this.index2 == 5) {
        int z4R = this.tp2R - this.cR - this.faceR / 2;
        double z5R = (z4R - this.r3) * Math.tan(Math.PI * this.angleR1 / 180.0D);
        int zz2R = (int)z5R;
        int z8R = this.cR - this.faceR / 2;
        double z6R = (this.cR - this.faceR / 2 - this.r4) * Math.tan(Math.PI * this.angleR2 / 180.0D);
        int zz6R = (int)z6R;
        int forskyvDUDU = -this.cR;
        this.x5[0] = this.gapR / 2 + 5 * Welding.this.s;
        this.x5[1] = this.gapR / 2 + zz6R + this.r4;
        this.x5[2] = this.gapR / 2 + this.r4;
        this.x5[3] = this.gapR / 2 + this.r4;
        this.x5[4] = this.gapR / 2 + this.r4;
        this.x5[5] = this.gapR / 2 + this.r4;
        this.x5[6] = this.gapR / 2 + this.r4;
        this.x5[7] = this.gapR / 2 + this.r4;
        this.y5[0] = this.tp1R + this.cR + forskyvDUDU;
        this.y5[1] = this.tp1R + this.cR + forskyvDUDU;
        this.y5[2] = this.tp1R + this.faceR / 2 + this.r4 + forskyvDUDU;
        this.y5[3] = this.tp1R + this.faceR / 2 + this.r4 + forskyvDUDU;
        this.y5[4] = this.tp1R + this.faceR / 2 + this.r4 + forskyvDUDU;
        this.y5[5] = this.tp1R + this.faceR / 2 + this.r4 + forskyvDUDU;
        this.y5[6] = this.tp1R + this.faceR / 2 + this.r4 + forskyvDUDU;
        this.y5[7] = this.tp1R + this.faceR / 2 + this.r4 + forskyvDUDU;
        Welding.this.xRDU1centrum = this.gapR / 2 + this.r4 / 2;
        Welding.this.yRDU1centrum = this.faceR / 2 + forskyvDUDU;
        this.x6[0] = this.gapR / 2 + 5 * Welding.this.s;
        this.x6[1] = this.gapR / 2 + zz2R + this.r3;
        this.x6[2] = this.gapR / 2 + this.r3;
        this.x6[3] = this.gapR / 2 + this.r3;
        this.x6[4] = this.gapR / 2 + this.r3;
        this.x6[5] = this.gapR / 2 + this.r3;
        this.x6[6] = this.gapR / 2 + this.r3;
        this.x6[7] = this.gapR / 2 + this.r3;
        this.y6[0] = this.tp1R + this.cR - this.tp2R + forskyvDUDU;
        this.y6[1] = this.tp1R + this.cR - this.tp2R + forskyvDUDU;
        this.y6[2] = this.tp1R - this.faceR / 2 - this.r3 + forskyvDUDU;
        this.y6[3] = this.tp1R - this.faceR / 2 - this.r3 + forskyvDUDU;
        this.y6[4] = this.tp1R - this.faceR / 2 - this.r3 + forskyvDUDU;
        this.y6[5] = this.tp1R - this.faceR / 2 - this.r3 + forskyvDUDU;
        this.y6[6] = this.tp1R - this.faceR / 2 - this.r3 + forskyvDUDU;
        this.y6[7] = this.tp1R - this.faceR / 2 - this.r3 + forskyvDUDU;
        Welding.this.xRDUcentrum = this.gapR / 2 + this.r3 / 2;
        Welding.this.yRDUcentrum = -this.faceR / 2 + forskyvDUDU;
        this.x7[0] = this.gapR / 2;
        this.x7[1] = this.gapR / 2;
        this.x7[2] = this.gapR / 2;
        this.x7[3] = this.gapR / 2;
        this.x7[4] = this.gapR / 2;
        this.x7[5] = this.gapR / 2;
        this.x7[6] = this.gapR / 2;
        this.x7[7] = this.gapR / 2;
        this.y7[0] = this.tp1R - this.faceR / 2 + forskyvDUDU;
        this.y7[1] = this.tp1R + this.faceR / 2 + forskyvDUDU;
        this.y7[2] = this.tp1R + this.faceR / 2 + forskyvDUDU;
        this.y7[3] = this.tp1R + this.faceR / 2 + forskyvDUDU;
        this.y7[4] = this.tp1R + this.faceR / 2 + forskyvDUDU;
        this.y7[5] = this.tp1R + this.faceR / 2 + forskyvDUDU;
        this.y7[6] = this.tp1R + this.faceR / 2 + forskyvDUDU;
        this.y7[7] = this.tp1R + this.faceR / 2 + forskyvDUDU;
        this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[1], this.y5[1]));
        this.extraLine.add(0, new ExtraLine(this.x5[1], this.y5[1], this.x5[2], this.y5[2]));
        this.extraLine.add(0, new ExtraLine(this.x5[2], this.y5[2], this.x5[3], this.y5[3]));
        this.extraLine.add(0, new ExtraLine(this.x5[3], this.y5[3], this.x5[4], this.y5[4]));
        this.extraLine.add(0, new ExtraLine(this.x5[4], this.y5[4], this.x5[5], this.y5[5]));
        this.extraLine.add(0, new ExtraLine(this.x5[5], this.y5[5], this.x5[6], this.y5[6]));
        this.extraLine.add(0, new ExtraLine(this.x5[6], this.y5[6], this.x5[7], this.y5[7]));
        this.extraLine.add(0, new ExtraLine(this.x6[0], this.y6[0], this.x6[1], this.y6[1]));
        this.extraLine.add(0, new ExtraLine(this.x6[1], this.y6[1], this.x6[2], this.y6[2]));
        this.extraLine.add(0, new ExtraLine(this.x6[2], this.y6[2], this.x6[3], this.y6[3]));
        this.extraLine.add(0, new ExtraLine(this.x6[3], this.y6[3], this.x6[4], this.y6[4]));
        this.extraLine.add(0, new ExtraLine(this.x6[4], this.y6[4], this.x6[5], this.y6[5]));
        this.extraLine.add(0, new ExtraLine(this.x6[5], this.y6[5], this.x6[6], this.y6[6]));
        this.extraLine.add(0, new ExtraLine(this.x6[6], this.y6[6], this.x6[7], this.y6[7]));
        this.extraLine.add(0, new ExtraLine(this.x7[0], this.y7[0], this.x7[1], this.y7[1]));
        this.extraLine.add(0, new ExtraLine(this.x7[1], this.y7[1], this.x7[2], this.y7[2]));
        this.extraLine.add(0, new ExtraLine(this.x7[2], this.y7[2], this.x7[3], this.y7[3]));
        this.extraLine.add(0, new ExtraLine(this.x7[3], this.y7[3], this.x7[4], this.y7[4]));
        this.extraLine.add(0, new ExtraLine(this.x7[4], this.y7[4], this.x7[5], this.y7[5]));
        this.extraLine.add(0, new ExtraLine(this.x7[5], this.y7[5], this.x7[6], this.y7[6]));
        this.extraLine.add(0, new ExtraLine(this.x7[6], this.y7[6], this.x7[7], this.y7[7]));
      } 
      if (this.plotType.equals("Cross joint")) {
        if (this.vec[0] == 0)
          this.vec[20] = 0; 
        if (this.vec[0] == 1)
          this.vec[20] = 8; 
        if (this.vec[0] == 2)
          this.vec[20] = 10; 
        if (this.vec[0] == 3)
          this.vec[20] = 12; 
        if (this.vec[0] == 4)
          this.vec[20] = 16; 
        if (this.vec[0] == 5)
          this.vec[20] = 20; 
        if (this.vec[0] == 6)
          this.vec[20] = 25; 
        if (this.vec[0] == 7)
          this.vec[20] = 32; 
        if (this.vec[2] == 0)
          this.vec[21] = 0; 
        if (this.vec[2] == 1)
          this.vec[21] = 8; 
        if (this.vec[2] == 2)
          this.vec[21] = 10; 
        if (this.vec[2] == 3)
          this.vec[21] = 12; 
        if (this.vec[2] == 4)
          this.vec[21] = 16; 
        if (this.vec[2] == 5)
          this.vec[21] = 20; 
        if (this.vec[2] == 6)
          this.vec[21] = 25; 
        if (this.vec[2] == 7)
          this.vec[21] = 32; 
        int dim = this.fac * this.vec[20];
        int dim2 = this.fac * this.vec[21];
        this.gang[0] = this.vec[6];
        this.gang[1] = this.vec[7];
        this.gang[2] = this.vec[8];
        this.gang[3] = this.vec[9];
        this.gang[4] = this.vec[10];
        this.gang[5] = this.vec[11];
        this.gang[6] = this.vec[12];
        this.gang[7] = this.vec[13];
        this.x1[13] = this.vec[3];
        this.y1[14] = this.vec[4];
        this.x1[0] = -4 * Welding.this.s;
        this.x1[1] = -dim2 / 2;
        this.x1[2] = -dim2 / 2;
        this.x1[3] = -4 * Welding.this.s;
        this.x1[4] = -4 * Welding.this.s;
        this.x1[5] = -dim2 / 2;
        this.x1[6] = -dim2 / 2;
        this.x1[7] = -4 * Welding.this.s;
        this.nx2 = 5;
        this.y1[0] = dim / 2;
        this.y1[1] = dim / 2;
        this.y1[2] = -dim / 2;
        this.y1[3] = -dim / 2;
        this.y1[4] = 1;
        this.y1[5] = 1;
        this.y1[6] = -1;
        this.y1[7] = -1;
        this.x4[0] = dim2 / 2;
        this.x4[1] = 4 * Welding.this.s;
        this.x4[2] = 4 * Welding.this.s;
        this.x4[3] = dim2 / 2;
        this.x4[4] = dim2 / 2;
        this.x4[5] = 4 * Welding.this.s;
        this.x4[6] = 4 * Welding.this.s;
        this.x4[7] = dim2 / 2;
        this.nx2 = 5;
        this.y4[0] = dim / 2;
        this.y4[1] = dim / 2;
        this.y4[2] = -dim / 2;
        this.y4[3] = -dim / 2;
        this.y4[4] = 1;
        this.y4[5] = 1;
        this.y4[6] = -1;
        this.y4[7] = -1;
        this.x2[0] = -dim2 / 2;
        this.x2[1] = -dim2 / 2;
        this.x2[2] = -1;
        this.x2[3] = -1;
        this.x2[4] = 1;
        this.x2[5] = 1;
        this.x2[6] = dim2 / 2;
        this.x2[7] = dim2 / 2;
        this.nx2 = 5;
        this.y2[0] = 3 * Welding.this.s;
        this.y2[1] = -3 * Welding.this.s;
        this.y2[2] = -3 * Welding.this.s;
        this.y2[3] = 3 * Welding.this.s;
        this.y2[4] = 3 * Welding.this.s;
        this.y2[5] = -3 * Welding.this.s;
        this.y2[6] = -3 * Welding.this.s;
        this.y2[7] = 3 * Welding.this.s;
        this.x3[0] = -4 * Welding.this.s;
        this.x3[1] = 4 * Welding.this.s;
        this.x3[2] = 4 * Welding.this.s;
        this.x3[3] = -4 * Welding.this.s;
        this.x3[4] = -4 * Welding.this.s;
        this.x3[5] = 4 * Welding.this.s;
        this.x3[6] = 4 * Welding.this.s;
        this.x3[7] = -4 * Welding.this.s;
        this.nx2 = 5;
        this.y3[0] = -5 * Welding.this.s + dim / 2;
        this.y3[1] = -5 * Welding.this.s + dim / 2;
        this.y3[2] = -5 * Welding.this.s - dim / 2;
        this.y3[3] = -5 * Welding.this.s - dim / 2;
        this.y3[4] = -5 * Welding.this.s + 1;
        this.y3[5] = -5 * Welding.this.s + 1;
        this.y3[6] = -5 * Welding.this.s - 1;
        this.y3[7] = -5 * Welding.this.s - 1;
        this.x8[0] = -dim2 / 2;
        this.x8[1] = dim2 / 2;
        this.x8[2] = 0;
        this.x8[3] = 0;
        this.x8[4] = 0;
        this.x8[5] = 0;
        this.x8[6] = 0;
        this.x8[7] = 0;
        this.nx2 = 5;
        this.y8[0] = -5 * Welding.this.s - dim2;
        this.y8[1] = -5 * Welding.this.s - dim2;
        this.y8[2] = -5 * Welding.this.s - dim / 2 - dim2;
        this.y8[3] = -5 * Welding.this.s - dim / 2 - dim2 / 2;
        this.y8[4] = -5 * Welding.this.s;
        this.y8[5] = -5 * Welding.this.s + 1;
        this.y8[6] = -5 * Welding.this.s - 1;
        this.y8[7] = -5 * Welding.this.s - 1;
        this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
        this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
        this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
        this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
        this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
        this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
        this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
        this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
        this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
        this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
        this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
        this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
        this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
        this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
        this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
        this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
        this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
        this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
        this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
        this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
        this.extraLine.add(0, new ExtraLine(this.x4[0], this.y4[0], this.x4[1], this.y4[1]));
        this.extraLine.add(0, new ExtraLine(this.x4[1], this.y4[1], this.x4[2], this.y4[2]));
        this.extraLine.add(0, new ExtraLine(this.x4[2], this.y4[2], this.x4[3], this.y4[3]));
        this.extraLine.add(0, new ExtraLine(this.x4[3], this.y4[3], this.x4[4], this.y4[4]));
        this.extraLine.add(0, new ExtraLine(this.x4[4], this.y4[4], this.x4[5], this.y4[5]));
        this.extraLine.add(0, new ExtraLine(this.x4[5], this.y4[5], this.x4[6], this.y4[6]));
        this.extraLine.add(0, new ExtraLine(this.x4[6], this.y4[6], this.x4[7], this.y4[7]));
      } 
      if (this.plotType.equals("Lap joint")) {
        this.listImage = 1;
        if (this.vec[0] == 0)
          this.vec[20] = 0; 
        if (this.vec[0] == 1)
          this.vec[20] = 8; 
        if (this.vec[0] == 2)
          this.vec[20] = 10; 
        if (this.vec[0] == 3)
          this.vec[20] = 12; 
        if (this.vec[0] == 4)
          this.vec[20] = 16; 
        if (this.vec[0] == 5)
          this.vec[20] = 20; 
        if (this.vec[0] == 6)
          this.vec[20] = 25; 
        if (this.vec[0] == 7)
          this.vec[20] = 32; 
        if (this.vec[2] == 0)
          this.vec[21] = 0; 
        if (this.vec[2] == 1)
          this.vec[21] = 8; 
        if (this.vec[2] == 2)
          this.vec[21] = 10; 
        if (this.vec[2] == 3)
          this.vec[21] = 12; 
        if (this.vec[2] == 4)
          this.vec[21] = 16; 
        if (this.vec[2] == 5)
          this.vec[21] = 20; 
        if (this.vec[2] == 6)
          this.vec[21] = 25; 
        if (this.vec[2] == 7)
          this.vec[21] = 32; 
        int dim = this.fac * this.vec[20];
        int dim2 = this.fac * this.vec[21];
        this.gang[0] = this.vec[6];
        this.gang[1] = this.vec[7];
        this.gang[2] = this.vec[8];
        this.gang[3] = this.vec[9];
        this.gang[4] = this.vec[10];
        this.gang[5] = this.vec[11];
        this.gang[6] = this.vec[12];
        this.gang[7] = this.vec[13];
        double dimd = 0.3D * (this.vec[10] + this.vec[11]) / 2.0D + 1.0D;
        int dimi = (int)dimd;
        this.vec[12] = dimi;
        dimi = this.fac * dimi;
        dimi = 0;
        this.x1[13] = this.vec[3];
        this.y1[14] = this.vec[4];
        this.x1[0] = -4 * Welding.this.s;
        this.x1[1] = 4 * Welding.this.s;
        this.x1[2] = 4 * Welding.this.s;
        this.x1[3] = -4 * Welding.this.s;
        this.x1[4] = -4 * Welding.this.s;
        this.x1[5] = 4 * Welding.this.s;
        this.x1[6] = 4 * Welding.this.s;
        this.x1[7] = -4 * Welding.this.s;
        this.nx2 = 5;
        this.y1[0] = dim / 2;
        this.y1[1] = dim / 2;
        this.y1[2] = -dim / 2;
        this.y1[3] = -dim / 2;
        this.y1[4] = 1;
        this.y1[5] = 1;
        this.y1[6] = -1;
        this.y1[7] = -1;
        this.x2[0] = -6 * Welding.this.s;
        this.x2[1] = 2 * Welding.this.s;
        this.x2[2] = 2 * Welding.this.s;
        this.x2[3] = -6 * Welding.this.s;
        this.x2[4] = -6 * Welding.this.s;
        this.x2[5] = 2 * Welding.this.s;
        this.x2[6] = 2 * Welding.this.s;
        this.x2[7] = -6 * Welding.this.s;
        this.nx2 = 5;
        this.y2[0] = dim2 + dim / 2 + dimi;
        this.y2[1] = dim2 + dim / 2 + dimi;
        this.y2[2] = dim / 2 + dimi;
        this.y2[3] = dim / 2 + dimi;
        this.y2[4] = dim2 / 2 + dim / 2 + dimi - 1;
        this.y2[5] = dim2 / 2 + dim / 2 + dimi - 1;
        this.y2[6] = dim2 / 2 + dim / 2 + dimi + 1;
        this.y2[7] = dim2 / 2 + dim / 2 + dimi + 1;
        this.x8[0] = -dim2 / 2;
        this.x8[1] = dim2 / 2;
        this.x8[2] = 0;
        this.x8[3] = -dim / 2;
        this.x8[4] = dim / 2;
        this.x8[5] = 0;
        this.x8[6] = 0;
        this.x8[7] = 0;
        this.nx2 = 5;
        this.y8[0] = -4 * Welding.this.s;
        this.y8[1] = -4 * Welding.this.s;
        this.y8[2] = -4 * Welding.this.s - dim / 2;
        this.y8[3] = -4 * Welding.this.s - dim / 2 - dim + dim / 2;
        this.y8[4] = -4 * Welding.this.s - dim - dim;
        this.y8[5] = -4 * Welding.this.s + 1;
        this.y8[6] = -4 * Welding.this.s - 1;
        this.y8[7] = -4 * Welding.this.s + dim2 / 2;
        this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
        this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
        this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
        this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
        this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
        this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
        this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
        this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
        this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
        this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
        this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
        this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
        this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
      } 
      if (this.plotType.equals("On plate")) {
        this.listImage = 1;
        if (this.vec[0] == 0)
          this.vec[20] = 0; 
        if (this.vec[0] == 1)
          this.vec[20] = 8; 
        if (this.vec[0] == 2)
          this.vec[20] = 10; 
        if (this.vec[0] == 3)
          this.vec[20] = 12; 
        if (this.vec[0] == 4)
          this.vec[20] = 16; 
        if (this.vec[0] == 5)
          this.vec[20] = 20; 
        if (this.vec[0] == 6)
          this.vec[20] = 25; 
        if (this.vec[0] == 7)
          this.vec[20] = 32; 
        if (this.vec[2] == 0)
          this.vec[21] = 0; 
        if (this.vec[2] == 1)
          this.vec[21] = 8; 
        if (this.vec[2] == 2)
          this.vec[21] = 10; 
        if (this.vec[2] == 3)
          this.vec[21] = 12; 
        if (this.vec[2] == 4)
          this.vec[21] = 16; 
        if (this.vec[2] == 5)
          this.vec[21] = 20; 
        if (this.vec[2] == 6)
          this.vec[21] = 25; 
        if (this.vec[2] == 7)
          this.vec[21] = 32; 
        int dim = this.fac * this.vec[20];
        int dim2 = this.fac * this.vec[21];
        this.gang[0] = this.vec[6];
        this.gang[1] = this.vec[7];
        this.gang[2] = this.vec[8];
        this.gang[3] = this.vec[9];
        this.gang[4] = this.vec[10];
        this.gang[5] = this.vec[11];
        this.gang[6] = this.vec[12];
        this.gang[7] = this.vec[13];
        this.x1[13] = this.vec[3];
        this.y1[14] = this.vec[4];
        this.x1[0] = -4 * Welding.this.s;
        this.x1[1] = 4 * Welding.this.s;
        this.x1[2] = 4 * Welding.this.s;
        this.x1[3] = -4 * Welding.this.s;
        this.x1[4] = -4 * Welding.this.s;
        this.x1[5] = -4 * Welding.this.s;
        this.x1[6] = -4 * Welding.this.s;
        this.x1[7] = -4 * Welding.this.s;
        this.nx2 = 5;
        this.y1[0] = 2 * Welding.this.s + dim2;
        this.y1[1] = 2 * Welding.this.s + dim2;
        this.y1[2] = 2 * Welding.this.s;
        this.y1[3] = 2 * Welding.this.s;
        this.y1[4] = 2 * Welding.this.s + dim2;
        this.y1[5] = 2 * Welding.this.s + dim2;
        this.y1[6] = 2 * Welding.this.s + dim2;
        this.y1[7] = 2 * Welding.this.s + dim2;
        this.x2[0] = -dim / 2;
        this.x2[1] = -dim / 2;
        this.x2[2] = -1;
        this.x2[3] = -1;
        this.x2[4] = 1;
        this.x2[5] = 1;
        this.x2[6] = dim / 2;
        this.x2[7] = dim / 2;
        this.nx2 = 5;
        this.y2[0] = 2 * Welding.this.s;
        this.y2[1] = -4 * Welding.this.s;
        this.y2[2] = -4 * Welding.this.s;
        this.y2[3] = 2 * Welding.this.s;
        this.y2[4] = 2 * Welding.this.s;
        this.y2[5] = -4 * Welding.this.s;
        this.y2[6] = -4 * Welding.this.s;
        this.y2[7] = 2 * Welding.this.s;
        this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
        this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
        this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
        this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
        this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
        this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
        this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
        this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
        this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
        this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
        this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
        this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
        this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
        this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
      } 
      if (this.plotType.equals("Strap joint")) {
        this.listImage = 1;
        if (this.vec[0] == 0)
          this.vec[20] = 0; 
        if (this.vec[0] == 1)
          this.vec[20] = 8; 
        if (this.vec[0] == 2)
          this.vec[20] = 10; 
        if (this.vec[0] == 3)
          this.vec[20] = 12; 
        if (this.vec[0] == 4)
          this.vec[20] = 16; 
        if (this.vec[0] == 5)
          this.vec[20] = 20; 
        if (this.vec[0] == 6)
          this.vec[20] = 25; 
        if (this.vec[0] == 7)
          this.vec[20] = 32; 
        if (this.vec[2] == 0)
          this.vec[21] = 0; 
        if (this.vec[2] == 1)
          this.vec[21] = 8; 
        if (this.vec[2] == 2)
          this.vec[21] = 10; 
        if (this.vec[2] == 3)
          this.vec[21] = 12; 
        if (this.vec[2] == 4)
          this.vec[21] = 16; 
        if (this.vec[2] == 5)
          this.vec[21] = 20; 
        if (this.vec[2] == 6)
          this.vec[21] = 25; 
        if (this.vec[2] == 7)
          this.vec[21] = 32; 
        if (this.vec[5] == 0)
          this.vec[23] = 0; 
        if (this.vec[5] == 1)
          this.vec[23] = 8; 
        if (this.vec[5] == 2)
          this.vec[23] = 10; 
        if (this.vec[5] == 3)
          this.vec[23] = 12; 
        if (this.vec[5] == 4)
          this.vec[23] = 16; 
        if (this.vec[5] == 5)
          this.vec[23] = 20; 
        if (this.vec[5] == 6)
          this.vec[23] = 25; 
        if (this.vec[5] == 7)
          this.vec[23] = 32; 
        int dim = this.fac * this.vec[20];
        int dim2 = this.fac * this.vec[21];
        this.gang[0] = this.vec[6];
        this.gang[1] = this.vec[7];
        this.gang[2] = this.vec[8];
        this.gang[3] = this.vec[9];
        this.gang[4] = this.vec[10];
        this.gang[5] = this.vec[11];
        this.gang[6] = this.vec[12];
        this.gang[7] = this.vec[13];
        int dim3 = this.fac * this.vec[23];
        double dimd = 0.3D * (this.vec[20] + this.vec[21] + this.vec[23]) / 3.0D + 1.0D;
        int dimi = (int)dimd;
        this.vec[22] = dimi;
        dimi = this.fac * dimi;
        dimi = 0;
        this.x1[13] = this.vec[3];
        this.y1[14] = this.vec[4];
        this.x1[0] = -4 * Welding.this.s;
        this.x1[1] = 4 * Welding.this.s;
        this.x1[2] = 4 * Welding.this.s;
        this.x1[3] = -4 * Welding.this.s;
        this.x1[4] = -4 * Welding.this.s;
        this.x1[5] = 4 * Welding.this.s;
        this.x1[6] = 4 * Welding.this.s;
        this.x1[7] = -4 * Welding.this.s;
        this.nx2 = 5;
        this.y1[0] = dim / 2;
        this.y1[1] = dim / 2;
        this.y1[2] = -dim / 2;
        this.y1[3] = -dim / 2;
        this.y1[4] = 1;
        this.y1[5] = 1;
        this.y1[6] = -1;
        this.y1[7] = -1;
        this.x2[0] = -5 * Welding.this.s;
        this.x2[1] = 5 * Welding.this.s;
        this.x2[2] = 5 * Welding.this.s;
        this.x2[3] = -5 * Welding.this.s;
        this.x2[4] = -5 * Welding.this.s;
        this.x2[5] = 5 * Welding.this.s;
        this.x2[6] = 5 * Welding.this.s;
        this.x2[7] = -5 * Welding.this.s;
        this.nx2 = 5;
        this.y2[0] = dim2 + dim / 2 + dimi;
        this.y2[1] = dim2 + dim / 2 + dimi;
        this.y2[2] = dim / 2 + dimi;
        this.y2[3] = dim / 2 + dimi;
        this.y2[4] = dim2 / 2 + dim / 2 + dimi - 1;
        this.y2[5] = dim2 / 2 + dim / 2 + dimi - 1;
        this.y2[6] = dim2 / 2 + dim / 2 + dimi + 1;
        this.y2[7] = dim2 / 2 + dim / 2 + dimi + 1;
        this.x3[0] = -4 * Welding.this.s;
        this.x3[1] = 4 * Welding.this.s;
        this.x3[2] = 4 * Welding.this.s;
        this.x3[3] = -4 * Welding.this.s;
        this.x3[4] = -4 * Welding.this.s;
        this.x3[5] = 4 * Welding.this.s;
        this.x3[6] = 4 * Welding.this.s;
        this.x3[7] = -4 * Welding.this.s;
        this.nx2 = 5;
        this.y3[0] = dim2 + dim / 2 + dim3 + 2 * dimi;
        this.y3[1] = dim2 + dim / 2 + dim3 + 2 * dimi;
        this.y3[2] = dim2 + dim / 2 + 2 * dimi;
        this.y3[3] = dim2 + dim / 2 + 2 * dimi;
        this.y3[4] = dim2 + dim / 2 + dim3 / 2 + 2 * dimi - 1;
        this.y3[5] = dim2 + dim / 2 + dim3 / 2 + 2 * dimi - 1;
        this.y3[6] = dim2 + dim / 2 + dim3 / 2 + 2 * dimi + 1;
        this.y3[7] = dim2 + dim / 2 + dim3 / 2 + 2 * dimi + 1;
        this.x8[0] = -dim2 / 2;
        this.x8[1] = dim2 / 2;
        this.x8[2] = 0;
        this.x8[3] = -dim / 2;
        this.x8[4] = dim / 2;
        this.x8[5] = 0;
        this.x8[6] = -dim3 / 2;
        this.x8[7] = dim3 / 2;
        this.nx2 = 5;
        this.y8[0] = -5 * Welding.this.s - dim / 2;
        this.y8[1] = -5 * Welding.this.s - dim / 2;
        this.y8[2] = -5 * Welding.this.s - dim / 2 - dim / 2;
        this.y8[3] = -5 * Welding.this.s - dim / 2 - dim + dim / 2 - dim / 2;
        this.y8[4] = -5 * Welding.this.s - dim - dim - dim / 2;
        this.y8[5] = -5 * Welding.this.s + dim2 + dim3 / 2 + dimi - dim / 2;
        this.y8[6] = -5 * Welding.this.s + dim2 - dim / 2;
        this.y8[7] = -5 * Welding.this.s + dim2 / 2 - dim / 2;
        this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[1], this.y1[1]));
        this.extraLine.add(0, new ExtraLine(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
        this.extraLine.add(0, new ExtraLine(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
        this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
        this.extraLine.add(0, new ExtraLine(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
        this.extraLine.add(0, new ExtraLine(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
        this.extraLine.add(0, new ExtraLine(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
        this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
        this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
        this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
        this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
        this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
        this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
        this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
        this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
        this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
        this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
        this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
        this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
        this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
        this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
      } 
    }

    public void drawArrowLine(Graphics2D g2d, int x1, int y1, int x2, int y2, int d, int h) {
      int dx = x2 - x1, dy = y2 - y1;
      double D = Math.sqrt((dx * dx + dy * dy));
      double xm = D - d, xn = xm, ym = h, yn = -h;
      double sin = dy / D, cos = dx / D;
      double x = xm * cos - ym * sin + x1;
      ym = xm * sin + ym * cos + y1;
      xm = x;
      x = xn * cos - yn * sin + x1;
      yn = xn * sin + yn * cos + y1;
      xn = x;
      int[] xpoints = { x2, (int)xm, (int)xn };
      int[] ypoints = { y2, (int)ym, (int)yn };
      g2d.drawLine(x1, y1, x2, y2);
      g2d.fillPolygon(xpoints, ypoints, 3);
    }
    
    public void drawElement(Graphics g) {
      Graphics2D g2d = (Graphics2D)g;
      gang[21] = this.y1[14];
      gang[22] = this.x1[13];
      gang[23] = xP;
      gang[24] = yP;
      int scaler = this.y1[14];
      int roter = this.x1[13];
      if (roter <= 0) {
        if (scaler > 0) {
          if (scaler < 1000) {
            g2d.scale(scaler / 100.0D, scaler / 100.0D);
          } else {
            g2d.scale(scaler / 100.0D, scaler / 100.0D);
          } 
          double factor = scaler / 100.0D;
          double deltaXD = this.xP / factor;
          double deltaYD = this.yP / factor;
          int facx = (int)deltaXD;
          int facy = (int)deltaYD;
          if (this.gang[2] == 13) {
            facx += this.xP / 13;
            facy += this.yP / 12;
          } 
          if (this.gang[2] == 14) {
            facx += 105 * this.xP / 256;
            facy += 31 * this.yP / 128;
          } 
          if (this.gang[2] == 7 || this.gang[2] == 8 || this.gang[2] == 9 || this.gang[2] == 10) {
           // facx = facx;
           // facy = facy;
          } 
          g2d.translate(-this.xP + facx, -this.yP + facy);
        } 
		if (gang[19] != 90 ) {
//			System.out.println("Hei" + gang[19]);
	}
		
		
        if (roter > 0) {
          g2d.rotate(Math.PI * roter / 180.0D);
          double factor = roter / 180.0D;
          double deltaXD = this.xP * factor;
          double deltaYD = this.yP * factor;
          int facx = (int)deltaXD;
          int n = (int)deltaYD;
        } 
        ExtraLine hline = new ExtraLine();
        g2d.setColor(Color.BLACK);

        for (int i = 0; i < this.extraLine.size(); i++) {
          hline = this.extraLine.get(i);
          int i1 = hline.getFirstX() + this.xP;
          int j1 = hline.getFirstY() + this.yP;
          int i2 = hline.getLastX() + this.xP;
          int j2 = hline.getLastY() + this.yP;
          g2d.drawLine(i1, j1, i2, j2);
        } 
        ExtraEllipse hellips = new ExtraEllipse();
        g2d.setColor(Color.BLACK);
        for (int j = 0; j < this.extraEllipse.size(); j++) {
          hellips = this.extraEllipse.get(j);
          int i1 = hellips.getFirstX() + this.xP;
          int j1 = hellips.getFirstY() + this.yP;
          int i2 = Math.abs(hellips.getLastX());
          int j2 = Math.abs(hellips.getLastY());
          Ellipse2D.Double e23 = new Ellipse2D.Double(i1, j1, i2, j2);
          g2d.draw(e23);
        } 
        g2d.setColor(Color.BLACK);
        ExtraBue hbue = new ExtraBue();
        Path2D.Double curvYG39 = new Path2D.Double();
        for (int k = 0; k < this.extraBue.size(); k++) {
          hbue = this.extraBue.get(k);
          int i1 = hbue.getFirstX() + this.xP;
          int j1 = hbue.getFirstY() + this.yP;
          int i2 = hbue.getLastX() + this.xP;
          int j2 = hbue.getLastY() + this.yP;
          int k2 = hbue.getFirstZ() + this.xP;
          int k3 = hbue.getLastZ() + this.yP;
          Path2D.Double curveYG39 = new Path2D.Double();
          QuadCurve2D.Double curveYG391 = new QuadCurve2D.Double(i1, j1, i2, j2, k2, k3);
          g2d.draw(curveYG391);
        } 
        g2d.setColor(Color.BLACK);
        ExtraTall htall = new ExtraTall();
        for (int m = 0; m < this.extraTall.size(); m++) {
          htall = this.extraTall.get(m);
          int i1 = htall.getFirstX() + this.xP;
          int j1 = htall.getFirstY() + this.yP;
          String testTall = htall.getLastString();
          g2d.drawString(testTall, i1, j1);
        } 
      	Color back = new Color(240,240,240); 		
      	g2d.setColor(back);
 //     	g2d.fillOval(-1, -1, 20, 20);
      } 
      if ( plotType.equals("filet") ) {
  	if (gang[19] != 90 ) {
  		//	System.out.println("Hei" + gang[19]);
  			int rotMot =  ( gang[19] - 90);
     		g2d.drawLine( 0,  0,  0, 0);
  			 g2d.rotate(Math.PI * rotMot / 180.0D);
  	}
  	    ExtraBase bline = new ExtraBase();
  	    g2d.setColor(Color.BLACK);
 // 	    System.out.println("94  " + extraBase.size());
  	    for (int i = 0; i < this.extraBase.size(); i++) {
  	      bline = this.extraBase.get(i);
  	      int i1 = bline.getFirstX() ; // + this.xP;
  	      int j1 = bline.getFirstY(); // + this.yP;
  	      int i2 = bline.getLastX() ; // + this.xP;
  	      int j2 = bline.getLastY(); // + this.yP;
  	      g2d.drawLine(i1, j1, i2, j2);
  	    } 
  	  	if (gang[19] != 90 ) {
  	  		//	System.out.println("Hei" + gang[19]);
  	  			int rotMot =  -( gang[19] - 90);
  	     		g2d.drawLine( 0,  0,  0, 0);
  	  			 g2d.rotate(Math.PI * rotMot / 180.0D);
  	  	}
      }
    }
    
    private void drawTegning(Graphics g) {
      Graphics2D g2d = (Graphics2D)g;
      gang[21] = this.y1[14];
      gang[22] = this.x1[13];
      gang[23] = xP;
      gang[24] = yP;
      if (this.gang[1] == 1) {
        int scaler = this.y1[14];
        int roter = this.x1[13];
        if (roter >= 0) {
          if (scaler < 0) {
            g2d.scale(scaler / 100.0D, scaler / 100.0D);
            double factor = scaler / 100.0D;
            double deltaXD = this.xP / factor;
            double deltaYD = this.yP / factor;
            int facx = (int)deltaXD;
            int facy = (int)deltaYD;
            if (this.gang[2] == 13) {
              facx += this.xP / 13;
              facy += this.yP / 12;
            } 
            if (this.gang[2] == 14) {
              facx += 105 * this.xP / 256;
              facy += 31 * this.yP / 128;
            } 
            g2d.translate(-this.xP + facx, -this.yP + facy);
          } 
  		if (gang[19] != 90 ) {
//			System.out.println("Hei" + gang[19]);
	}
          if (roter > 0) {
            g2d.rotate(Math.PI * roter / 180.0D);
            double factor = roter / 180.0D;
            double deltaXD = this.xP * factor;
            double deltaYD = this.yP * factor;
            int facx = (int)deltaXD;
            int n = (int)deltaYD;
          } 
          ExtraLine hline = new ExtraLine();
          g2d.setColor(Color.BLUE);
          for (int i = 0; i < this.extraLineTegn.size(); i++) {
            hline = this.extraLineTegn.get(i);
            int i1 = hline.getFirstX() + this.xP;
            int j1 = hline.getFirstY() + this.yP;
            int i2 = hline.getLastX() + this.xP;
            int j2 = hline.getLastY() + this.yP;
            g2d.drawLine(i1, j1, i2, j2);
          } 
          ExtraArray aline = new ExtraArray();
          g2d.setColor(Color.BLUE);
          for (int j = 0; j < this.extraArrayTegn.size(); j++) {
            aline = this.extraArrayTegn.get(j);
            int i1 = aline.getFirstX() + this.xP;
            int j1 = aline.getFirstY() + this.yP;
            int i2 = aline.getLastX() + this.xP;
            int j2 = aline.getLastY() + this.yP;
            int k1 = aline.getFirstZ();
            int k2 = aline.getLastZ();
            drawArrowLine(g2d, i1, j1, i2, j2, k1, k2);
          } 
          g2d.setColor(Color.BLUE);
          ExtraBue hbue = new ExtraBue();
          Path2D.Double curvYG39 = new Path2D.Double();
          for (int k = 0; k < this.extraBueTegn.size(); k++) {
            hbue = this.extraBueTegn.get(k);
            int i1 = hbue.getFirstX() + this.xP;
            int j1 = hbue.getFirstY() + this.yP;
            int i2 = hbue.getLastX() + this.xP;
            int j2 = hbue.getLastY() + this.yP;
            int k2 = hbue.getFirstZ() + this.xP;
            int k3 = hbue.getLastZ() + this.yP;
            Path2D.Double curveYG39 = new Path2D.Double();
            QuadCurve2D.Double curveYG391 = new QuadCurve2D.Double(i1, j1, i2, j2, k2, k3);
            g2d.draw(curveYG391);
          } 
          g2d.setColor(Color.BLUE);
          ExtraTall htall = new ExtraTall();
          for (int m = 0; m < this.extraTallTegn.size(); m++) {
            htall = this.extraTallTegn.get(m);
            int i1 = htall.getFirstX() + this.xP;
            int j1 = htall.getFirstY() + this.yP;
            String testTall = htall.getLastString();
            g2d.drawString(testTall, i1, j1);
          } 
        } 
      } 
    }
 
    public List<ExtraLine> getExtraLine() {
   	 List<ExtraLine> eLine = new ArrayList<>(); 
   	 int i = extraLine.size();
   	 for ( int j=0 ; j < i ; i++) {
   		 eLine.add(i,extraLine.get(i));
   	 }
   	return eLine;
   }
    private void radio(int xradio, int yradio) {
    	int x;
    	int y;
    	x = xradio;
    	y = yradio;
    	
        JRadioButton rbEr;
        rbEr = new JRadioButton("Erase");
    //    rbE.setBackground(Color.WHITE);
        rbEr.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                if (rbEr.isSelected()) {
                  rbEr.setSelected(true);

                } 
              }
            });
        rbEr.setFont(new Font("Tahoma", 1, 11));
        rbEr.setBounds(x, y, 20, 20);
        add(rbEr);
    }
    private void musDemoNew(String pt, final Graphics g) {
        int scaler = this.y1[14];
        int roter = this.x1[13];
      	 xradio = 0;
    	 yradio = 0;
    
      String plotT = pt; 
      this.plotType = pt;
      this.dragAllowed = false;
      this.pressAllowed = false;
      this.clickAllowed = false;
      this.moveAllowed = false;
      if (this.resultat.equals("Standard")) {
        this.resultat = "D"; 
      }
     if ( y1[4] == 160) {
    	 xradio = 150 -xP;
    	 yradio = 130-yP;
    	 radio(xradio, yradio);
     	 radio(10, 10);
     }
    /*
      JRadioButton rbE;
      rbE = new JRadioButton("Erase");
  //    rbE.setBackground(Color.WHITE);
      rbE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if (rbE.isSelected()) {
                rbE.setSelected(true);

              } 
            }
          });
      rbE.setFont(new Font("Tahoma", 1, 11));
      rbE.setBounds(xradio, yradio, 91, 23);
      add(rbE);
     */
      final Cursor cursor = Cursor.getDefaultCursor();
      final Cursor cursorHand = new Cursor(12);
      final Cursor cursorCross = new Cursor(1);
      final Cursor cursorMove = new Cursor(13);
      Cursor cursorWait = new Cursor(3);
      
//  	Color transColor = new Color(51, 204,255);  // lys blå
//		Color transColor = new Color(51, 204,255,80);  // lys blå transparent
//		Color transColor = new Color(102,255,102,80);  // lys grønn transparent
//		Color transColor = new Color(255,102,102,80);  // lys rød transparent
      final Color transColor = new Color(139, 0, 0);   // mørk rød
      int bigger = 5;
      final int big = 7;
      List<Integer> listeX = new ArrayList<>();
      List<Integer> listeY = new ArrayList<>();
      Boolean movingCell = Boolean.valueOf(false);
      WeldPoint weldpoint = new WeldPoint();
      WeldData wliste = new WeldData(Welding.this.sveiseListe);
      int elementnr = 0;
      Point testPoint = new Point();
      Graphics2D g2 = (Graphics2D)g;

      final List<Integer> listeXX = new ArrayList<>();
      final List<Integer> listeYY = new ArrayList<>();
      ExtraOval strok = new ExtraOval();
      this.funnetE = false;
      this.funnetD = false;
      this.funnetM = false;
      this.funnetF = false;
      double xCentre = 0.0D;
      double yCentre = 250.0D;
      double xp1 = xCentre - 350.0D;
      double xp2 = xCentre - 250.0D;
      double xp3 = xCentre - 150.0D;
      double xp4 = xCentre - 50.0D;
      double yp1 = yCentre - 300.0D;
      double dia = 10.0D;
      Ellipse2D moveE = new Ellipse2D.Double(xp2, yp1, dia, dia);
      Ellipse2D drawE = new Ellipse2D.Double(xp1, yp1, dia, dia);
      Ellipse2D eraseE = new Ellipse2D.Double(xp3, yp1, dia, dia);
      Ellipse2D finitE = new Ellipse2D.Double(xp4, yp1, dia, dia);
      
      if ( plotType.equals("filet") && gang[19] != 90  ) {
        	int rotMot =  ( gang[19] - 90);
    		g2.drawLine( 0,  0,  0, 0);
         		g2.rotate(Math.PI * rotMot / 180.0D);	
        	}
      ///////////////   menu
//      g2d.scale(scaler/100.0 ,  scaler/100.0);
  //    radio(150- xP,130 - yP);
      yfac = 0;
      xfac = -450;
      finy = 70 ;  // 150 * this.y1[14] / 100;
      
      digIntx = 45 ;  //45 * this.y1[14] / 100;
      digInty = 15;   //15 * this.y1[14] / 100;
      int xStart = -490  + xP; // * this.y1[14]) / 100;
      int deltaDigIntx = 0;
      int deltaDigInty = 0;
      
      ///////////////////////justeringer
	  if (gang[2] == 12 && y1[14] == 500) {
		    deltaDigIntx += 0;
		    deltaDigInty += 0;
    	  if ( plotType.equals("Butt") ||  plotType.equals("butt")) {

    		xfac  += 130;    //  95
		    yfac  += -175;   // -70 
    	  }
    	  if ( plotType.equals("filet")) {
      		xfac  += 65;   
  		    yfac  += -50; 
    	  }
    	  if ( plotType.equals("corner")) {
      		xfac  += 95;   
  		    yfac  += -230;  
    	  }
    	  if ( plotType.equals("overlap")) {
      		xfac  += 45;   
  		    yfac  += -20;  
    	  }
    	  if ( plotType.equals("flanged")) {
    		  xfac  += 0;   
    		  yfac  += 0;   
    	  }
    	  if ( plotType.equals("Cross joint")) {
      		xfac  += 95;   
  		    yfac  += -300;  
    	  }
    	  if ( plotType.equals("Strap joint")) {
      		xfac  += 105;   
  		    yfac  += -255; 
    	  }
    	  if ( plotType.equals("Lap joint")) {
        		xfac  += 105;   
      		    yfac  += -140; 
    	  }
    	  if ( plotType.equals("On plate")) {
    		  xfac  += 0;   
    		  yfac  +=     0;   
    	  }
      }
      if (gang[2] == 16 && y1[14] == 500) {
	//	deltaDigIntx = 130;
	//	deltaDigInty = 45;
    	  if ( plotType.equals("Butt") ||  plotType.equals("butt")) {
        		xfac  += 0;   
      		    yfac  += -195;   	//	  xfac  = 200;   // 70
      		    					//  yfac  =     200;   // 280
    	  }
    	  if ( plotType.equals("filet")) {
        		xfac  += 0;   
      		    yfac  += -50; 
    	  }
    	  if ( plotType.equals("corner")) {
        		xfac  += 0;   
      		    yfac  += -70;  
    	  }
    	  if ( plotType.equals("overlap")) {
        		xfac  += -40;   
      		    yfac  += -20;  
    	  }
    	  if ( plotType.equals("flanged")) {
        		xfac  += -5;   
      		    yfac  += 30;   
    	  }
    	  if ( plotType.equals("Cross joint")) {
        		xfac  += 0;   
      		    yfac  += -160;   
    	  }
    	  if ( plotType.equals("Strap joint")) {
        		xfac  += 0;   
      		    yfac  += -300;  
    	  }
    	  if ( plotType.equals("Lap joint")) {
        		xfac  += 0;   
      		    yfac  += -250;  
    	  }
    	  if ( plotType.equals("On plate")) {
        		xfac  += 0;   
      		    yfac  += 10;  
    	  }
      }
      
      if ( y1[14] == 160) {
    	  xfac += 160;
    	  yfac += +63 -yP;
      }
      if ( y1[14] == 400) {
    	  xfac += 140;
    	  yfac += -230;
      }
 //     System.out.println(" test " + y1[14] + "  "  + gang[2]);
      if ( y1[14] == 500 && gang[2] == 16) {
  //  	  xfac += 0;
  //  	  yfac += -155;
      }
      ////////////////////////////////////////////////////////////////////////////
      finy = finy + yfac; 
      digInty = digInty + deltaDigInty;
      digIntx = digIntx + deltaDigIntx;
      final int yStart = finy  ;
       int xStart1 = xStart + xP + xfac + digIntx ;
       int xStart2 = xStart1 + digIntx;
       int xStart3 = xStart2 + digIntx;
       int xStart4 = xStart3 + digIntx;
       int xStart5 = xStart4 + digIntx;
      
 //    System.out.println( "9244  :  1= " + xStart1 + "  2= " + xStart2 + "  3= " + xStart3 + "  4= " + xStart4 + " starty  " + yStart + " digIntX " + digIntx + " digInty " + digInty);
  //    System.out.println("xP " + xP + " yP " + yP);
 //     System.out.println("rot " + x1[13] + " scal " + y1[14]);
 //     System.out.println("xfac  " + xfac + " " + yfac);
      JButton draw = new JButton("D");
      draw.setFont(new Font("Tahoma", 1, 6));
      draw.setBounds(xStart1, yStart, digIntx, digInty);
      JButton erase = new JButton("E");
      erase.setFont(new Font("Tahoma", 1, 6));
      erase.setBounds(xStart2, yStart, digIntx, digInty);
      JButton standard = new JButton("M");
      standard.setFont(new Font("Tahoma", 1, 6));
      standard.setBounds(xStart3, yStart, digIntx, digInty);
      JButton finit = new JButton("F");
      finit.setFont(new Font("Tahoma", 1, 6));
      finit.setBounds(xStart4, yStart, digIntx, digInty);
      
      listeXX.add(0, Integer.valueOf(0));
      listeYY.add(0, Integer.valueOf(0));
      setCursor(cursorHand);
      if ( plotType.equals("filet") && gang[19] != 90  ) {
      	int rotMot =  ( gang[19] - 90);
  		g2.drawLine( 0,  0,  0, 0);
 //      		g2.rotate(Math.PI * rotMot / 180.0D);	
      	}
      if (!this.original) {
        add(draw);
        add(standard);
        add(erase);
        add(finit);
  /* 
        if (this.resultat.equals("Standard")) {
          g2.setColor(Color.GREEN);
          g2.draw(drawE);
          g2.setColor(Color.RED);
          g2.draw(moveE);
          g2.draw(eraseE);
          g2.draw(finitE);
        } 
        if (this.resultat.equals("Draw")) {
          g2.setColor(Color.GREEN);
          g2.fill(drawE);
          g2.setColor(Color.RED);
          g2.fill(moveE);
          g2.fill(eraseE);
          g2.fill(finitE);
        } 
        if (this.resultat.equals("Move")) {
          g2.setColor(Color.GREEN);
          g2.fill(moveE);
          g2.setColor(Color.RED);
          g2.fill(drawE);
          g2.fill(eraseE);
          g2.fill(finitE);
        } 
        if (this.resultat.equals("Erase")) {
          g2.setColor(Color.GREEN);
          g2.fill(eraseE);
          g2.setColor(Color.RED);
          g2.fill(moveE);
          g2.fill(drawE);
          g2.fill(finitE);
        } 
        if (this.resultat.equals("Finite")) {
          g2.setColor(Color.GREEN);
          g2.fill(finitE);
          g2.setColor(Color.RED);
          g2.fill(moveE);
          g2.fill(drawE);
          g2.fill(eraseE);
        } 
            */
      } 
  
      if ( plotType.equals("filet") && gang[19] != 90  ) {
      	int rotMot =  ( gang[19] - 90);
  		g2.drawLine( 0,  0,  0, 0);
 //      		g2.rotate(-Math.PI * rotMot / 180.0D);	
      	} 
  	Color back = new Color(240,240,240); 		
  	g2.setColor(back);
//  	g2.fillOval(-1, -1, 20, 20);
  	
      addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
            	new RenewString(g, sveiseListe, big);
            	  ////
            	
            	/*
                Graphics g = Welding.MyPanel.this.getGraphics();
                Graphics2D g2d = (Graphics2D)g;
                WeldPoint testerNew = new WeldPoint();
                Point textPointNew = new Point();
                String indNew;
            	boolean punktPlottes;
            	boolean textPlottes;
            	boolean punktPlottesNew;
            	boolean textPlottesNew;

            for ( int j=0; j<weldList.size(); j++ ) {
            		
            		testerNew = weldList.get(j);

            		indNew = testerNew.getWeldPointText();
            		System.out.println("new " + j + " " + indNew);
            		textPointNew= testerNew.getWeldPointTextPoint();
            		punktPlottesNew = testerNew.getWeldPointPlottes();
            		textPlottesNew = testerNew.getWeldTextPlottes();
            		System.out.println("new " + j + " " + indNew);
            		  g2d.setColor(Color.BLUE);
            	  		if (textPlottesNew) {

            	  			g2d.drawString(indNew, textPointNew.x ,  textPointNew.y );

            	  			g2d.drawOval(textPointNew.x , textPointNew.y, big, big);
            	  		} 
            }
                ////
                 
                 */
               
            }
            
            public void mouseDragged(MouseEvent e) {
              if (Welding.MyPanel.this.resultat.equals("M") || Welding.MyPanel.this.original) {
            	  Welding.MyPanel.this.setCursor(cursorMove);
                Point firstPoint = new Point();
                Point middelPoint = new Point();
                Point lastPoint = new Point();
                Boolean entered ;
                Graphics g = Welding.MyPanel.this.getGraphics();
                Graphics2D g2d = (Graphics2D)g;
                g2d.setColor(Color.blue);
                Color back = new Color(240, 240, 240);
                int enterTypeOldOld = 0;
                Welding.MyPanel.this.dragAllowed = false;
                Welding.MyPanel.this.pressAllowed = false;
                Welding.MyPanel.this.clickAllowed = false;
                Welding.MyPanel.this.moveAllowed = false;
                WeldPoint tester = new WeldPoint();
                int innlestAntall = 0;
                Point point = new Point();
                Point textPoint = new Point();
                boolean lesFirst = true;
                List<Integer> enterTypeOldNew = new ArrayList<>();
                enterTypeOldNew.add(0, Integer.valueOf(0));
                List<Integer> enterTypeOldIndeks = new ArrayList<>();
                enterTypeOldIndeks.add(0, Integer.valueOf(0));
                List<Integer> enterTypeIndeks = new ArrayList<>();
                enterTypeIndeks.add(0, Integer.valueOf(0));
                
                int numberEl = weldList.size();
				if (numberEl >= 1 ) {                   // kan ikke flytte element i tom liste
					
				if (e.getButton() == 0   ) {


					g2d.setColor(Color.blue);
					int enterType = 0;
					entered = false;
					int foundIndex = 0;
//					if(!activated) {
					for ( int  i=0; i<weldList.size() ; i++) {
						
						if (!entered) {
							tester = weldList.get(i);
							point = tester.getWeldPointFirst();
							if((e.getX() <= point.x+big) && (e.getX() >= point.x)){
								if((e.getY() <= point.y+big) && (e.getY() >= point.y)){ 
									enterType = 1;
									entered = true;
									foundIndex = i;
									
									dragAllowed = true;
									activated = true;
								}
							}
			    		}
					}
						//////////////////////////////////
						entered = false;
						for ( int  j=0; j<weldList.size() ; j++) {
							if (!entered) {
								tester = weldList.get(j);
								point = tester.getWeldPointLast();
								if((e.getX() <= point.x+big) && (e.getX() >= point.x)){
									if((e.getY() <= point.y+big) && (e.getY() >= point.y)){ 
										enterType = 3;
										entered = true;
										foundIndex = j;
										dragAllowed = true;
										activated = true;
									}
								}
				    		}
						}
						
							//////////////////////////////////////////
						entered = false;
						for ( int  l=0; l<weldList.size() ; l++) {
							if (!entered) {
								tester = weldList.get(l);
								point = tester.getWeldPointMiddel();
								if((e.getX() <= point.x+big) && (e.getX() >= point.x)){
									if((e.getY() <= point.y+big) && (e.getY() >= point.y)){ 
										enterType = 2;
										entered = true;
										foundIndex = l;
										if(activated) {
			//							System.out.println(" 8757 test " + dragAllowed + "  " + activated);
										}
										dragAllowed = true;
										activated = true;
									}
								}
				    		}
						}
						
							//////////////////////////////////////////
						entered = false;
						for ( int  m=0; m<weldList.size() ; m++) {
							if (!entered) {
								tester = weldList.get(m);
								point = tester.getWeldPointTextPoint();
								if((e.getX() <= point.x+big) && (e.getX() >= point.x)){
									if((e.getY() <= point.y+big) && (e.getY() >= point.y)){ 
										enterType = 4;
										entered = true;
										foundIndex = m;
										dragAllowed = true;
										activated = true;
									}
								}
				    		}
						}
						
						if(enterType != 0 ) {
							enterTypeOldNew.add(0,enterType);
						}
						if (foundIndex != 0 ) {
							enterTypeOldIndeks.add(0,foundIndex);

						}
//				}
							//////////////////////////////////////////
	//				}
	//				System.out.println(activated);

////////////////////////////////////////////////////////////////////////ny flyttet kurve genereres her

//						if ( dragAllowed ) {
						if ( dragAllowed) {
			//				setCursor(cursorCross);
						}
		      		int enterTypeOld = enterType ;

					Point flyttePointNew = new Point();					

					int pointTeller = 0;
					if ( pointTeller <= 1) {
						flyttePointNew.x = e.getX();
						flyttePointNew.y = e.getY();
						pointTeller++;
					}

						enterTypeOldOld = enterTypeOldNew.get(0);
				
						if(!(enterTypeOldOld >0 )){
					//		enterTypeOldOld = enterTypeOldOld;
						}

						Point malPoint = new Point();
						int indeks = 0 ;
						int indeks2 = 0 ;

						if (enterTypeOldIndeks.size() == 2) {
							indeks5 = enterTypeOldIndeks.get(0);
							foundIndex = enterTypeOldIndeks.get(0);	

							
							enterTypeIndeks.add(0,foundIndex);

						}
						if (enterTypeOldIndeks.size() == 1) {


						}
						if (enterTypeOldNew.size() == 2) {
							indeks6 = enterTypeOldNew.get(0);
							indeks2 = 0;


						}
						if (enterTypeOldNew.size() == 1) {
							indeks = enterTypeOldNew.get(0);
							indeks2 = 0;


						}
						/////////////////////////////////////////////////////////////////

				g2d.setColor(back);
				// skriv ut gammel
				if ( dragAllowed) {
					indeks5 = foundIndex;
				}


	//  test for tom sveiseliste
				int numb = weldList.size();

				String ident;
				boolean punktPlottes;
				boolean textPlottes;

				if (indeks5 < weldList.size()) {
				tester = weldList.get(indeks5);
				firstPoint = tester.getWeldPointFirst();
				middelPoint = tester.getWeldPointMiddel();
				lastPoint = tester.getWeldPointLast();
				textPoint = tester.getWeldPointTextPoint();
				ident = tester.getWeldPointText();
				punktPlottes = tester.getWeldPointPlottes();
				textPlottes = tester.getWeldTextPlottes();

				// overskriver eksisterende kurve
				g2d.setColor(back);

	      		Path2D.Double curvCJ3Mus = new Path2D.Double();
	      		QuadCurve2D.Double curveCJ3Mus = new QuadCurve2D.Double(firstPoint.x, firstPoint.y, middelPoint.x,  middelPoint.y, lastPoint.x, lastPoint.y );
	      		if ( indeks > 0) {
	      		g2d.draw(curveCJ3Mus);
	      		
	      		if (punktPlottes) {
	      			g2d.setColor(back);
	      			g2d.drawOval(firstPoint.x, firstPoint.y,big, big);
	      			g2d.drawOval(lastPoint.x, lastPoint.y,big, big);
	      			g2d.drawOval(middelPoint.x, middelPoint.y,big, big);

	      		}
	      		if (textPlottes) {

	      			g2d.drawString(ident, textPoint.x ,  textPoint.y );
	      			g2d.setColor(back);
	      			g2d.drawOval(textPoint.x , textPoint.y, big, big);
	      		}

	      		}
				/////////////////////???
				// hente ut aktuelt punkt
				if (enterTypeOldNew.size() == 1) {
					indeks2 = 1;
					malPoint.x = flyttePointNew.x;
					malPoint.y = flyttePointNew.y;

				}
	
				/////////////////////////////////////////////////////////////////		
//genererer verdier for ny kurve					
				
				if (malPoint.x > 0 && malPoint.y > 0) {

					g2d.setColor(back);
		      		Path2D.Double curvCJ8Mus = new Path2D.Double();
		      		QuadCurve2D.Double curveCJ8Mus = new QuadCurve2D.Double(firstPoint.x, firstPoint.y, middelPoint.x,  middelPoint.y, lastPoint.x, lastPoint.y );
		      		g2d.draw(curveCJ8Mus);
		      		if (punktPlottes) {
		      			g2d.setColor(back);
		      			g2d.drawOval(firstPoint.x, firstPoint.y,big, big);
		      			g2d.drawOval(lastPoint.x, lastPoint.y,big, big);
		      			g2d.drawOval(middelPoint.x, middelPoint.y,big, big);
		
		     			g2d.drawOval(textPoint.x, textPoint.y, big, big);
		      		}
		      		if (textPlottes) {
	
		      			g2d.drawString(ident, textPoint.x ,  textPoint.y );
		      		}

		      		////////////////////////////////////////////////////////////// generere ny kutve og punkter
					if (indeks6 == 1 ) {
						tester.setWeldPointFirst(flyttePointNew); 
						firstPoint.x  = flyttePointNew.x;
						firstPoint.y  = flyttePointNew.y;
		
					}
					if (indeks6 == 2 ) {
						tester.setWeldPointMiddel(flyttePointNew);
						middelPoint.x  = flyttePointNew.x;
						middelPoint.y  = flyttePointNew.y;
	
					}
					if (indeks6 == 3 ) {
						tester.setWeldPointLast(flyttePointNew);
						lastPoint.x  = flyttePointNew.x;
						lastPoint.y  = flyttePointNew.y;
	
					}
					if (indeks6 == 4 ) {
						tester.setWeldPointTextPoint(flyttePointNew);
						textPoint.x  = flyttePointNew.x;
						textPoint.y  = flyttePointNew.y;
	
					}

					g2d.drawLine(0,0,100,100);
//ny kurve genereres	
					g2d.setColor(Color.RED);
			//		g2d.drawLine(firstPoint.x, firstPoint.y,100,100);
					g2d.setColor(transColor);
		      		Path2D.Double curvCJ9Mus = new Path2D.Double();
		      		QuadCurve2D.Double curveCJ9Mus = new QuadCurve2D.Double(firstPoint.x, firstPoint.y, middelPoint.x,  middelPoint.y, lastPoint.x, lastPoint.y );
		      		g2d.draw(curveCJ9Mus);
		      		if (punktPlottes) {
		      			g2d.setColor(Color.BLUE);
		      			g2d.drawOval(firstPoint.x, firstPoint.y,big, big);
		      			g2d.drawOval(lastPoint.x, lastPoint.y,big, big);
		      			g2d.drawOval(middelPoint.x, middelPoint.y,big, big);

		      		}
		      		if (textPlottes) {
		      			g2d.setColor(Color.BLUE);
		      			g2d.drawString(ident, textPoint.x ,  textPoint.y );
		      			g2d.setColor(back);
		      			g2d.drawOval(textPoint.x, textPoint.y, big, big);
		      	
		      		
		      		}
		      				setCursor(cursorHand);
		  		}
		  		}
				int ytrans = 0;
				int xtrans = 0;
				
				if ((gang[2]== 13 || gang[2] == 14  )) {    // korreksjon for ikke visking
					ytrans = 250;
					xtrans = 490;	
					/*
					if (plotType.equals("corner")) {
						ytrans = 100;
					}
					if ( gang[2]== 13 ) {
						ytrans = ytrans - 100;
						xtrans = xtrans - 340;
				        if (plotType.equals("Cross joint") || plotType.equals("Strap joint") || plotType.equals("Lap joint") ) {
							scale = 250;
							ytrans = ytrans + 200;
						}
				        if ( plotType.equals("On plate")) {
							scale = 250;
							ytrans = ytrans ;
						}
					}
					*/
	
					if ( gang[2] == 14 && y1[14] == 400)
					{
						xtrans = 300;
						ytrans = 300;
					}

					g2d.translate(xP+xtrans, yP+ytrans );
					g2d.scale(scaler/100.0, scaler/100.0);
		     		g2d.drawLine( 0,  0,  0, 0);
					g2d.rotate(Math.PI * roter / 180.0D);	
			
					new MenuElement(g, gang, extraLine, extraBue, extraEllipse, extraTall, extraBase, plotType, extraTallBase);
					new MenuTegning(g, gang, extraLineTegn, extraBueTegn, extraArrayTegn, extraTallTegn, extraBase, plotType); 
			      	if ( teksting) {
			      		new MenuText(g, gang, extraText,extraLineTabell );
			      	}
			      	if ( gang[6] == 1)  {
			  		new MenuComment(g, gang, extraComment);
			  	}
				} else {
						if (callCopy) {
					//	drawElement(g);
					//	drawTegning(g);
						}
		
				if ( callCopy ) {
///////////////////////////////////////////////////// flytting av store bilder
					  if (gang[2] == 12 && y1[14] == 500) {
				    	  if ( plotType.equals("Butt") ||  plotType.equals("butt")) {
				    		xtrans = 150;   
						ytrans =     180;   
				    	  }
				    	  if ( plotType.equals("filet")) {
				    		  xtrans = 250;   
						ytrans =     50;   
				    	  }
				    	  if ( plotType.equals("corner")) {
				    		  xtrans = 150;   
						ytrans =     500;   
				    	  }
				    	  if ( plotType.equals("overlap")) {
				    		  xtrans = 500;   
						ytrans =     -100;   
				    	  }
				    	  if ( plotType.equals("flanged")) {
				    		  xtrans = 250;   
						ytrans =     -200;   
				    	  }
				    	  if ( plotType.equals("Cross joint")) {
				    		  xtrans = 250;   
						ytrans =     850;   
				    	  }
				    	  if ( plotType.equals("Strap joint")) {
				    		  xtrans = 250;   
						ytrans =     700;   
				    	  }
				    	  if ( plotType.equals("Lap joint")) {
				    		  xtrans = 250;   
						ytrans =     500;   
				    	  }
				    	  if ( plotType.equals("On plate")) {
				    		  xtrans = 250;   
						ytrans =     -200;   
				    	  }
				      }
				      if (gang[2] == 16 && y1[14] == 500) {
				    	  if ( plotType.equals("Butt") ||  plotType.equals("butt")) {
				    		  xtrans = 70;   
						ytrans =     280;   
				    	  }
				    	  if ( plotType.equals("filet")) {
				    		  xtrans = 70;   
						ytrans =     100;   
				    	  }
				    	  if ( plotType.equals("corner")) {
				    		  xtrans = 70;   
						ytrans =     550;   
				    	  }
				    	  if ( plotType.equals("overlap")) {
				    		  xtrans = 250;   
						ytrans =     0;   
				    	  }
				    	  if ( plotType.equals("flanged")) {
				    		  xtrans = 70;   
						ytrans =     -200;   
				    	  }
				    	  if ( plotType.equals("Cross joint")) {
				    		  xtrans = 50;   
						ytrans =     1000;   
				    	  }
				    	  if ( plotType.equals("Strap joint")) {
				    		  xtrans = 50;   
						ytrans =     1000;   
				    	  }
				    	  if ( plotType.equals("Lap joint")) {
				    		  xtrans = 50;   
						ytrans =     700;   
				    	  }
				    	  if ( plotType.equals("On plate")) {
				    		  xtrans = 50;   
						ytrans =     0;   
				    	  }
				      }
				///////////////////////////////////////
					g2d.translate(xP + xtrans, yP + ytrans);
					g2d.scale(scaler/100.0, scaler/100.0);
					g2d.rotate(Math.PI * roter / 180.0D);
					/*
					if (plotType.equals("filet") && gang[19] != 90 ) {
						int rotMot =  -( gang[19] - 90);
				 		g2d.rotate(Math.PI * rotMot / 180.0D);
						}
						*/
					new MenuElement(g, gang, extraLine, extraBue, extraEllipse, extraTall, extraBase, plotType, extraTallBase);
					new MenuTegning(g, gang, extraLineTegn, extraBueTegn, extraArrayTegn, extraTallTegn, extraBase, plotType); 
			      	if ( teksting) {
			      		new MenuText(g, gang, extraText,extraLineTabell );
			      	}
			  	if ( gang[6] == 1)  {
			  		new MenuComment(g, gang, extraComment);
			  	}
		
				
				}
				}
				g2d.dispose();	
				dragAllowed = false;
				moveAllowed = false;
			   	  Welding.MyPanel.this.setCursor(cursorMove);
	//			System.out.println("slutt musdragging  " + activated);
	//			activated = false;
				///////////////////////////////////////////siste
			}
	//			}
				}	
              }
            } 
		});
      	   
      addMouseListener(new MouseAdapter() {
            private ActionListener ActionListener;
            
            public void mouseExited(MouseEvent e) {
              if (!Welding.MyPanel.this.resultat.equals("F"));
              Welding.MyPanel.this.setCursor(cursor);
       //       new DrawNewMark(g, weldList, big); 
		      if (generateOnFile) {
		    	  paintImage(g) ; 
		      }
            }
            
            public void mouseEntered(MouseEvent e) {
              Welding.MyPanel.this.dragAllowed = false;
              Welding.MyPanel.this.pressAllowed = false;
              Welding.MyPanel.this.clickAllowed = false;
              Welding.MyPanel.this.moveAllowed = false;
              Welding.MyPanel.this.pointType = 0;
              Welding.MyPanel.this.pointIndex = 0;
              Welding.MyPanel.this.setCursor(cursorHand);
            }
            
            public void mouseReleased(MouseEvent e) {
              if (Welding.MyPanel.this.resultat.equals("E") || Welding.MyPanel.this.original) {
                Welding.MyPanel.this.setCursor(cursorCross);
                Welding.MyPanel.this.dragAllowed = false;
                Welding.MyPanel.this.pressAllowed = false;
                Welding.MyPanel.this.clickAllowed = false;
                Welding.MyPanel.this.moveAllowed = false;
                Point firstPoint = new Point();
                Point middelPoint = new Point();
                Point lastPoint = new Point();
                int enterTypeOldOld = 0;
                WeldPoint tester = new WeldPoint();
                Point point = new Point();
                if (e.getButton() == 2) {
    //            if (e.getButton() == 1) {
                  Graphics g = Welding.MyPanel.this.getGraphics();
                  Graphics2D g2d = (Graphics2D)g;
                  g2d.setColor(Color.blue);
                  int enterType = 0;
                  Boolean entered = Boolean.valueOf(false);
                  int foundIndex = 0;
                  boolean lesFirst = true;
                  List<Integer> enterTypeOldNew = new ArrayList<>();
                  enterTypeOldNew.add(0, Integer.valueOf(0));
                  List<Integer> enterTypeOldIndeks = new ArrayList<>();
                  enterTypeOldIndeks.add(0, Integer.valueOf(0));
                  List<Integer> enterTypeIndeks = new ArrayList<>();
                  enterTypeIndeks.add(0, Integer.valueOf(0));
                  int numberEl = weldList.size();
                  if (numberEl >= 1) {
                    g2d.setColor(Color.blue);
                    entered = Boolean.valueOf(false);
                    for ( int  i=0; i<weldList.size() ; i++) {
                      if (!entered.booleanValue()) {
                     	  tester = weldList.get(i);
                        point = tester.getWeldPointFirst();
                        if (e.getX() <= point.x + big && e.getX() >= point.x && 
                          e.getY() <= point.y + big && e.getY() >= point.y) {
                          enterType = 1;
                          entered = Boolean.valueOf(true);
                          foundIndex = i;
                          Welding.MyPanel.this.moveAllowed = true;
                        } 
                      } 
                    } 
                    entered = Boolean.valueOf(false);
                    for ( int  j=0; j<weldList.size() ; j++) {
                      if (!entered.booleanValue()) {
                    	  tester = weldList.get(j);
                        point = tester.getWeldPointLast();
                        if (e.getX() <= point.x + big && e.getX() >= point.x && 
                          e.getY() <= point.y + big && e.getY() >= point.y) {
                          enterType = 3;
                          entered = Boolean.valueOf(true);
                          foundIndex = j;
                          Welding.MyPanel.this.moveAllowed = true;
                        } 
                      } 
                    } 
                    entered = Boolean.valueOf(false);
                    for ( int  l=0; l<weldList.size() ; l++) {
                      if (!entered.booleanValue()) {
                    	  tester = weldList.get(l);
                        point = tester.getWeldPointMiddel();
                        if (e.getX() <= point.x + big && e.getX() >= point.x && 
                          e.getY() <= point.y + big && e.getY() >= point.y) {
                          enterType = 2;
                          entered = Boolean.valueOf(true);
                          foundIndex = l;
                          Welding.MyPanel.this.moveAllowed = true;
                        } 
                      } 
                    } 
                    entered = Boolean.valueOf(false);
                    for ( int  m=0; m<weldList.size() ; m++) {
                      if (!entered.booleanValue()) {
                    	  tester = weldList.get(m);
                        point = tester.getWeldPointTextPoint();
                        if (e.getX() <= point.x + big && e.getX() >= point.x && 
                          e.getY() <= point.y + big && e.getY() >= point.y) {
                          enterType = 4;
                          entered = Boolean.valueOf(true);
                          foundIndex = m;
                          Welding.MyPanel.this.moveAllowed = true;
                        } 
                      } 
                    } 
                    if (enterType != 0)
                      enterTypeOldNew.add(0, Integer.valueOf(enterType)); 
                    if (foundIndex != 0)
                      enterTypeOldIndeks.add(0, Integer.valueOf(foundIndex)); 
                    if (Welding.MyPanel.this.moveAllowed) {
                      int enterTypeOld = enterType;
                      Point flyttePointNew = new Point();
                      int pointTeller = 0;
                      if (pointTeller <= 1) {
                        flyttePointNew.x = e.getX();
                        flyttePointNew.y = e.getY();
                        pointTeller++;
                      } 
                      enterTypeOldOld = ((Integer)enterTypeOldNew.get(0)).intValue();
                      if (enterTypeOldOld <= 0) {
                  //      enterTypeOldOld = enterTypeOldOld; 
                      }
                      Point malPoint = new Point();
                      int indeks = 0;
                      int indeks2 = 0;
                      if (enterTypeOldIndeks.size() == 2) {
                    	  indeks5 = enterTypeOldIndeks.get(0);
                        foundIndex = ((Integer)enterTypeOldIndeks.get(0)).intValue();
                        enterTypeIndeks.add(0, Integer.valueOf(foundIndex));
                      } 
                      enterTypeOldIndeks.size();
                      if (enterTypeOldNew.size() == 2) {
                    	  indeks6 = enterTypeOldNew.get(0);
                        indeks2 = 0;
                      } 
                      if (enterTypeOldNew.size() == 1) {
                        indeks = ((Integer)enterTypeOldNew.get(0)).intValue();
                        indeks2 = 0;
                      } 
                      Color back = new Color(240, 240, 240);
                      g2d.setColor(back);
                      if (Welding.MyPanel.this.moveAllowed)
                    	  indeks5 = foundIndex; 
                      g2d.setColor(back);
                      Point textPoint = new Point();
                      tester = weldList.get(indeks5);
                      firstPoint = tester.getWeldPointFirst();
                      middelPoint = tester.getWeldPointMiddel();
                      lastPoint = tester.getWeldPointLast();
                      textPoint = tester.getWeldPointTextPoint();
                      String ident = tester.getWeldPointText();
                      boolean punktPlottes = tester.getWeldPointPlottes();
                      boolean textPlottes = tester.getWeldTextPlottes();
  					weldList.remove(indeks5);
  					sveiseListe.remove(indeks5);
                      g2d.setColor(back);
                      WeldPoint punkt2 = new WeldPoint(firstPoint, middelPoint, lastPoint, textPoint, ident, punktPlottes, textPlottes);
                      Path2D.Double curvCJ3Mus = new Path2D.Double();
                      QuadCurve2D.Double curveCJ3Mus = new QuadCurve2D.Double(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
                      g2d.draw(curveCJ3Mus);
                      if (punktPlottes) {
                        g2d.setColor(back);
                        g2d.drawOval(firstPoint.x, firstPoint.y, big, big);
                        g2d.drawOval(lastPoint.x, lastPoint.y, big, big);
                        g2d.drawOval(middelPoint.x, middelPoint.y, big, big);
                        g2d.setColor(back);
                      } 
                      if (textPlottes) {
                        g2d.drawOval(textPoint.x, textPoint.y, big, big);
                        g2d.drawString(ident, textPoint.x, textPoint.y);
                      } 
                      g2d.setColor(back);
                      Path2D.Double curvCJ4Mus = new Path2D.Double();
                      QuadCurve2D.Double curveCJ4Mus = new QuadCurve2D.Double(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
                      g2d.draw(curveCJ4Mus);
                      Point flyttePoint = new Point();
                      flyttePoint.x = e.getX();
                      flyttePoint.y = e.getY();
                      if (enterType == 1) {
                        firstPoint.x = flyttePoint.x;
                        firstPoint.y = flyttePoint.y;
                      } 
                      if (enterType == 2) {
                        middelPoint.x = flyttePoint.x;
                        middelPoint.y = flyttePoint.y;
                      } 
                      if (enterType == 3) {
                        lastPoint.x = flyttePoint.x;
                        lastPoint.y = flyttePoint.y;
                      } 
                      if (enterType == 2) {
                        textPoint.x = flyttePoint.x;
                        textPoint.y = flyttePoint.y;
                      } 
                      g2d.setColor(Color.red);
                      g2d.setColor(transColor);
                      Path2D.Double curvCJ5Mus = new Path2D.Double();
                      QuadCurve2D.Double curveCJ5Mus = new QuadCurve2D.Double(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
                      if (!punktPlottes) {
                        g2d.setColor(Color.BLUE);
                        g2d.drawOval(firstPoint.x, firstPoint.y, big, big);
                        g2d.drawOval(lastPoint.x, lastPoint.y, big, big);
                        g2d.drawOval(middelPoint.x, middelPoint.y, big, big);
                        g2d.setColor(Color.RED);
                        g2d.setColor(transColor);
                        g2d.drawOval(textPoint.x, textPoint.y, big, big);
                      } 
                      if (!textPlottes) {
                        g2d.setColor(Color.BLUE);
                        g2d.drawOval(textPoint.x, textPoint.y, big, big);
                        g2d.drawString(ident, textPoint.x, textPoint.y);
                      } 
                    } 
                    g2d.dispose();
                  } 
                } 
              } 
            }
            
            public void mouseClicked(MouseEvent e) {
              Graphics g = Welding.MyPanel.this.getGraphics();
              Graphics2D g2d = (Graphics2D)g;
              Color col = Color.RED;
              g2d.setColor(Color.RED);
              if (e.getButton() == 1) {
// korreksjonene gjelde søkning getX og getY
                listeXX.add(0, Integer.valueOf(e.getX()));
                listeYY.add(0, Integer.valueOf(e.getY()));
                if ( y1[14] == 100 ) {
                yfac = 0;
                xfac = 0;  // -65
                digIntx = 0;  // 45
                digInty = 0;  // 15
                }
                if ( y1[14] == 160 ) {
              	  xfac =  -55 -249 ;  // -505;
              	  yfac =  43 -485 ;  // -40;
              	  digIntx =  66;  //70;
              	  digInty =  22 ; //20;
                }
                if ( y1[14] == 250 ) {
              	  xfac =  -140 ; //  -595;
              	  yfac = 105 ;  //  -260;
              	  digIntx = 65;  // 50
              	  digInty = 35;
                }
                if ( y1[14] == 600 ) {
                	  xfac =  -140 ; //  -595;
                	  yfac = 105 ;  //  -260;
                	  digIntx = 65;  // 50
                	  digInty = 35;
                  }

                ///////////////////////justeringer
                int xfacNew = 0;
                int yfacNew =  0;
   
                if (gang[2] == 14 && y1[14] == 500) {
            		  digIntx = 225;
              		  digInty = 65;
              		  xfacNew = 0;  // 275
              		  yfacNew = 0;  // -140
                }
          	  if (gang[2] == 12 && y1[14] == 500) {
          		  digIntx = 225;
          		  digInty = 65; 
              	  if ( plotType.equals("Butt") ||  plotType.equals("butt")) {
              		  xfacNew  =  614;     
              		  yfacNew   =  -62 ;   
              	  }
              	  if ( plotType.equals("filet")) {
                		xfacNew   =  515;   
            		    yfacNew   =  180; 
              	  }
              	  if ( plotType.equals("corner")) {
                		xfacNew   =  510;   
            		    yfacNew   =  96;  
              	  }
              	  if ( plotType.equals("overlap")) {
                		xfacNew   =  710;   
            		    yfacNew   =  126;  
              	  }
              	  if ( plotType.equals("flanged")) {
              		  xfacNew   =  326;   
              		  yfacNew   =  86;   
              	  }
              	  if ( plotType.equals("Cross joint")) {
                		xfacNew   =  610;   
            		    yfacNew   =  230;  
              	  }
              	  if ( plotType.equals("Strap joint")) {
                		xfacNew   =  640;   
            		    yfacNew   =  600; 
              	  }
              	  if ( plotType.equals("Lap joint")) {
                  		xfacNew   =  640;   
                		yfacNew   =  360; 
              	  }
              	  if ( plotType.equals("On plate")) {
              		  xfacNew   =  325;     
              		  yfacNew   =  80 ;  
              	  }
                }
                if (gang[2] == 16 && y1[14] == 500) {
            		  digIntx = 225;
              		  digInty = 65; 
              	  if ( plotType.equals("Butt") ||  plotType.equals("butt")) {
                  		xfacNew   =  145;   
                		    yfacNew   =  445;   
              	  }
              	  if ( plotType.equals("filet")) {
                  		xfacNew   =  145;   
                		    yfacNew   =  230; 
              	  }
              	  if ( plotType.equals("corner")) {
                  		xfacNew   =  145;   
                		    yfacNew   =  625;  
              	  }
              	  if ( plotType.equals("overlap")) {
                  		xfacNew   =  225;   
                		    yfacNew   =  225;  
              	  }
              	  if ( plotType.equals("flanged")) {
                  		xfacNew   =  155;   
                		    yfacNew   =  175;   
              	  }
              	  if ( plotType.equals("Cross joint")) {
                  		xfacNew   =  145;   
                		    yfacNew   =  800;   
              	  }
              	  if ( plotType.equals("Strap joint")) {
                  		xfacNew   =  145;   
                		    yfacNew   =  385;  
              	  }
              	  if ( plotType.equals("Lap joint")) {
                  		xfacNew   =  145;   
                		    yfacNew   =  230;  
              	  }
              	  if ( plotType.equals("On plate")) {
                  		xfacNew   =  145;   
                		    yfacNew   =  317;  
              	  }
                }
        /*        
  //        if ( y1[14] == 500 ) {
          	int digIntxNew = 210;
          	int digIntyNew = 60;
          	xStart1 = xStart1 + xfacNew;
          	yStart = yStart ;
          	xStart2 = xStart1 + digIntxNew;
          	xStart3 = xStart2 + digIntxNew;
          	xStart4 = xStart3 + digIntxNew;
          	xStart5 = xStart4 + digIntxNew;
    //      }
         */ 
                
                if (gang[2] == 14 && y1[14] == 400) {
            		  digIntx = 180;
              		  digInty = 65;
              		  xfacNew = 745;  // 275
              		  yfacNew = 40;  // -140
                }
                if (gang[2] == 16 && y1[14] == 500) {
            		  digIntx = 220;
              		  digInty = 75;
              		  xfacNew = 145;  // 275
              		  yfacNew = -30;  // -140
                }
                if ( y1[14] == 160) {
            		  digIntx = 66;
              		  digInty = 22;
              		  xfacNew = 346;  // 275
              		  yfacNew = 310;  // -140
                }
     /*          
                System.out.println(" verdier " + gang[2] + "  " + y1[14]);
                System.out.println(" digIntx   " + digIntx + " digInty " + digInty + "xfacNew" + xfacNew + " yfacNew " + yfacNew);
                System.out.println(" grense  " + xStart1+ " " + xP + " "+ xfac + " "+ digIntx + " " + xStart2);
                System.out.println("9825 gir  " + e.getX() + "  "  + e.getY());
                System.out.println("D " +( xStart1 + xP + xfac + 0*digIntx + xfacNew) + " <= " + e.getX() + " <= " + (xStart1 + xP + xfac + 1*digIntx + xfacNew));
                System.out.println("E " + (xStart1 + xP + xfac + 1*digIntx + xfacNew ) + " <= " + e.getX() + " <= " + (xStart1 + xP + xfac + 2*digIntx + xfacNew ));
                System.out.println("M " + (xStart1 + xP + xfac + 2*digIntx + xfacNew ) + " <= " + e.getX() + " <= " + (xStart1 + xP + xfac + 3*digIntx + xfacNew));
                System.out.println("F " + (xStart1 + xP + xfac + 3*digIntx + xfacNew ) + " <= " + e.getX() + " <= " + (xStart1 + xP + xfac + 4*digIntx + xfacNew));
                System.out.println((yStart + yP + yfac + yfacNew ) + " <= " + e.getY() + " <= " + (yStart +  digInty + yP + yfac + yfacNew));
                System.out.println("  " + (xP + xfac) );
              System.out.println();
           
    //        System.out.println("10190 gir  " + e.getX() + "  "  + e.getY());
              
       */     
                if (e.getX() <= (xStart1 + xP + xfac + 1*digIntx + xfacNew)      && e.getX() >= ( xStart1 + xP + xfac + 0*digIntx + xfacNew )  && 
                		e.getY() <= (yStart +  digInty + yP + yfac + yfacNew)  && e.getY() >= (yStart + yP + yfac + yfacNew )  ) {
                  Welding.MyPanel.this.resultat = "D";
                  Welding.MyPanel.this.funnetD = true;
                  Welding.MyPanel.this.setCursor(cursorHand);
         //     					System.out.println("D " + e.getX() + "  " + e.getY());
                } 
                
                if (e.getX() <= (xStart1 + xP + xfac + 2*digIntx + xfacNew)      && e.getX() >= ( xStart1 + xP + xfac + 1*digIntx + xfacNew)  && 
                		e.getY() <= (yStart +  digInty + yP + yfac + yfacNew)  && e.getY() >= (yStart + yP + yfac + yfacNew )  ) {
                
                  Welding.MyPanel.this.resultat = "E";
                  Welding.MyPanel.this.funnetE = true;
                  Welding.MyPanel.this.setCursor(cursorCross);
         //     					System.out.println("E " + e.getX() + "  " + e.getY());
                } 
                if (e.getX() <= (xStart1 + xP + xfac + 3*digIntx + xfacNew)      && e.getX() >= ( xStart1 + xP + xfac + 2*digIntx + xfacNew)  && 
                		e.getY() <= (yStart +  digInty + yP + yfac + yfacNew)  && e.getY() >= (yStart + yP + yfac + yfacNew)  ) {
                  Welding.MyPanel.this.resultat = "M";
                  Welding.MyPanel.this.funnetM = true;
                  Welding.MyPanel.this.setCursor(cursorMove);
       //       					System.out.println("M " + e.getX() + "  " + e.getY());
                } 
                if (e.getX() <= (xStart1 + xP + xfac + 4*digIntx + xfacNew)      && e.getX() >= ( xStart1 + xP + xfac + 3*digIntx + xfacNew)  && 
                		e.getY() <= (yStart +  digInty + yP + yfac + yfacNew)  && e.getY() >= (yStart + yP + yfac + yfacNew )  ) {
                  Welding.MyPanel.this.resultat = "F";
                  Welding.MyPanel.this.funnetF = true;
                  Welding.MyPanel.this.setCursor(cursor);
       //       					System.out.println("F " + e.getX() + "  " + e.getY());
  
            oldListe = sveiseListe;
            
                  try {
                	NewString newstring =  	new NewString(oldListe);
           //    	resultListe = newstring.getListe();
                	resultListe = newstring.resultListe;
            //    	 System.out.println("call last " + resultListe.size());
                	
                	 oldListe = newstring.resultListe;
            //    	 System.out.println("res1 " + oldListe.size());
                	oldListe = weldList;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
 
                  DeleteMark deleteMark = new DeleteMark(g,  oldListe, weldList, big);
   //              new DrawNewMark(g, sveiseListe, big);   // generate error
        
 
              		/////////////////
                  

                  
       //           System.out.println("call " + sveiseListe.size());
                  
                } 
                if ( e.getX() <= (xStart1 + xP + xfac + 4*digIntx + xfacNew)   && e.getX() >= ( xStart1 + xP + xfac + 0*digIntx + xfacNew ) && 
                	(e.getY() <= (yStart +  digInty + yP + yfac + yfacNew)  && e.getY() >= (yStart + yP + yfac + yfacNew )  ))	{
                	
                	
                } else {
                	Point point = new Point();
                	String symbolType = "";
                	point.x = e.getX();
                	point.y = e.getY();
       //         	new ExtraHelp();
                	
                	if(!true) {
                	 System.out.println(" før " +symbolListe.size());
                	 WeldingSymbol symb;
					try {
						symb = new WeldingSymbol(point);
				     	 Thread myThread = new Thread(symb);
	                	 myThread.start();
	                  	 System.out.println( "  dd " + symb.getLastString());
	                	 try {
							myThread.join();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
           

                	 
      
                	 System.out.println(" etter dd " +symbolListe.size());
                	/* 
         		    try {
        				wait();
        			} catch (InterruptedException f) {
        				// TODO Auto-generated catch block
        				f.printStackTrace();
        			}
                	 System.out.println(symb.actualSymbol);
               // 	 notify();
                	 */
            //    	 System.out.println(" etter " +symbolListe.size());
                	}
                	
                	/*
                	 try {
						Welding weld = new Welding();
				//		System.out.println( weld.resultListe.size());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					*/
                }
              } 
            }
 @Override           
public void mousePressed(MouseEvent e) {
				
				dragAllowed = false;
				clickAllowed = false;			
				pressAllowed = false;
			if(e.getButton() == e.BUTTON3) {
//				  if (e.getButton() == 1) {
				plotSort = "Mouse";
				pressAllowed = true;
				lastPointNew = new Point(e.getX(),e.getY());
				Graphics g = getGraphics();
		        Graphics2D g2d = (Graphics2D) g;
		     	Stroke oldStroke = g2d.getStroke();
		      	Stroke stroke = oldStroke; 
		      	Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);   
		      	stroke = dashed;

				teller++;

				if (teller == 1 ) {
					firstPointNew = lastPointNew;

					g2d.draw(new Ellipse2D.Double(firstPointNew.x,firstPointNew.y,5,5)); 
				}
				if ( teller == 2 ) {
					middelPointNew = lastPointNew;

					g2d.drawLine(firstPointNew.x,firstPointNew.y,middelPointNew.x,middelPointNew.y );
				}	
				if (teller == 3 ) {
					kurveteller++;

					Color back = new Color(240,240,240);
					g2d.setColor(back);
					g2d.drawLine(firstPointNew.x,firstPointNew.y,middelPointNew.x,middelPointNew.y );
					g2d.draw(new Ellipse2D.Double(firstPointNew.x,firstPointNew.y,5,5)); 
					g2d.setColor(Color.RED);
			  		g2d.setColor(transColor);
					Point textPoint = new Point((firstPointNew.x + lastPointNew.x )/2 ,  (firstPointNew.y + lastPointNew.y )/2);
					boolean punktPlottes = true;
					boolean textPlottes = true; 
					String ident = "" + kurveteller;
		 	        WeldPoint punkt1 = new WeldPoint(firstPointNew, middelPointNew, lastPointNew, textPoint, ident, punktPlottes, textPlottes );

		      		Path2D.Double curvCJMus = new Path2D.Double();
		      		QuadCurve2D.Double curveCJMus = new QuadCurve2D.Double(firstPointNew.x, firstPointNew.y, middelPointNew.x,  middelPointNew.y, lastPointNew.x, lastPointNew.y );
		      		g2d.draw(curveCJMus);

		      		if (punktPlottes) {
		      			g2d.setColor(Color.BLUE);
		    
		      			g2d.drawOval(middelPointNew.x, middelPointNew.y,big, big);
		      			
		      			g2d.drawOval(firstPointNew.x, firstPointNew.y,big, big);
		      			g2d.drawOval(lastPointNew.x, lastPointNew.y,big, big);
		      		}
		      		if (textPlottes) {
		      			g2d.setColor(Color.BLUE);
	
		      			g2d.drawString(ident, textPoint.x ,  textPoint.y );
		      			g2d.setColor(back);
		      			g2d.drawOval(textPoint.x, textPoint.y, big+0, big+0);
		      		}
 		
		 	        weldList.add(punkt1);
		 	        sveiseListe.add(punkt1);
		 	        teller = 0;	 	   
				}
			}}
		});	

/////////////////////////////////


		
      } 
    @Override 
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D)g;
      Stroke oldStroke = g2d.getStroke();
      Stroke thichness05 = new BasicStroke(0.5F);
      Stroke thichness005 = new BasicStroke(0.05F);
      Stroke thichness1 = new BasicStroke(1.0F);
      Stroke thichness3 = new BasicStroke(3.0F);
      Stroke thichness6 = new BasicStroke(6.0F);
      Stroke dashed = new BasicStroke(3.0F, 0, 2, 0.0F, new float[] { 9.0F }, 0.0F);
      Stroke stroke = new BasicStroke(3.0F, 0, 2, 0.0F, new float[] { 1.0F }, 0.0F);
      float[] dashingPattern1 = { 2.0F, 2.0F };
      Stroke stroke1 = new BasicStroke(2.0F, 0, 2, 1.0F, dashingPattern1, 2.0F);
      float[] dashingPattern2 = { 10.0F, 4.0F };
      Stroke stroke2 = new BasicStroke(4.0F, 0, 2, 1.0F, dashingPattern1, 0.0F);
      float[] dashingPattern3 = { 10.0F, 10.0F, 1.0F, 10.0F };
      Stroke stroke3 = new BasicStroke(4.0F, 0, 2, 1.0F, dashingPattern1, 0.0F);
      stroke = oldStroke;
      dashed = thichness005;
      g2d.setStroke(stroke);
      g2d.setFont(new Font("Serif", Font.BOLD,25));
      int indeks8 = Welding.this.sveiseListe.size();
      if (indeks8 >= 1) {
        for (int ii = indeks8 - 1; ii >= 0; ii--) {
          Welding.this.weldList.remove(ii);
          Welding.this.sveiseListe.remove(ii);
        }  
      }
      RenderingHints rh = new RenderingHints(
          RenderingHints.KEY_ANTIALIASING, 
          RenderingHints.VALUE_ANTIALIAS_ON);
      g2d.setRenderingHints(rh);
      // stopping for errorkode

//      if ( gang[2] == 0 ) 
 //  	  gang[2] = 14;
      
      if ( gang[2] == 0  ) {
    	  
    	  gang[0] = 0;  // ikke tabell
    //	  gang[1] = 1;  // strektegning
    	  gang[5] = 2;  // mus brukes
    	  gang[6] = 1;  // kommentar
    	  y1[14] = 160;  // standard størrelse
    	  x1[13] = 0;  // rotering ikke tillatt
    	  
      }
      if ( gang[2] == 7 ||  gang[2] == 8 ||gang[2] == 9 ||  gang[2] == 10 ) {
    	  
    	  gang[0] = 0;  // ikke tabell
    	//  gang[1] = 1;  // strektegning
    	  gang[5] = 2;  // mus brukes
    	  gang[6] = 1;  // kommentar
    	  y1[14] = 160;  // standard størrelse
    	  x1[13] = 0;  // rotering ikke tillatt
    	  
      }
      if (  gang[2] == 11  ) {
    	  
    	  gang[0] = 1;  // med tabell
    	  gang[1] = 1;  // strektegning
    	  gang[5] = 2;  // mus brukes
    	  gang[6] = 1;  // kommentar
    	  y1[14] = 160;  // standard størrelse
    	  x1[13] = 0;  // rotering ikke tillatt
    	  
      }
      if (  gang[2] == 12  ) {
    	  
    	  gang[0] = 0;  // ikke tabell
    	  gang[1] = 0;  // strektegning
    	  gang[5] = 2;  // mus brukes
    	  gang[6] = 1;  // kommentar
    	  y1[14] = 500;  // standard størrelse   //  250
    	  x1[13] = 0;  // rotering ikke tillatt
    	  
      }
      if ( gang[2] == 15 ) {
    	  
    	  gang[0] = 1;  // ikke tabell
    	  gang[1] = 1;  // strektegning
    	  gang[5] = 2;  // mus brukes
    	  gang[6] = 1;  // kommentar
    	  y1[14] = 160;  // standard størrelse
    	  x1[13] = 0;  // rotering ikke tillatt
    	  
      }
      if ( gang[2] == 16 ) {
    	  
    	  gang[0] = 0;  // ikke tabell
    	  gang[1] = 0;  // strektegning
    	  gang[5] = 2;  // mus brukes
    	  gang[6] = 1;  // kommentar
    	  y1[14] = 500;  // standard størrelse  // 250
    	  x1[13] = 0;  // rotering ikke tillatt
    	  
      }
     if ( gang[2] == 14) {
    	  
    	  gang[0] = 0;  // ikke tabell
    //	  gang[1] = 1;  // strektegning
    	  gang[5] = 2;  // mus brukes
    	  gang[6] = 1;  // kommentar
    	  y1[14] = 400;  // standard størrelse  // 250
    	  x1[13] = 0;  // rotering ikke tillatt
    	  
      }
     
     if ( plotType.equals("filet") && gang[19] != 90  ) {
 //   	 gang[5] = 1;  // mus brukes
     }
      if (this.gang[7] == 1) {
        this.gang[0] = 0;
        this.gang[1] = 0;
        this.gang[2] = 13;
   	    if ( this.gang[5] == 0 ) {
   	//	   this.gang[5] = 1; // bruk av mus for tegning  // korrigert 
   	  	   }
        
   //     this.gang[6] = 1;
        /*
        if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Lap joint") || this.plotType.equals("On plate")) {
          this.y1[14] = 250;    // korrigert 300
        } else {
        //	g2d.translate(100.0 , 350.0);
        	this.y1[14] = 500;
        } 
        
        if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Lap joint")) {
          g2d.translate(150, 350);     // korrigert 150, 750
        } else {
          g2d.translate(150, 150);
        } 
        */
      } 
      if (gang[2] == 14 && y1[14] == 400) {
    	  g2d.translate(300,  300);
      }
      if (gang[2] == 16 && y1[14] == 250) {
    	  g2d.translate(0,  200);
      }
      if (gang[2] == 12 && y1[14] == 250) {
    	  g2d.translate(0,  200);
      }
      if (gang[2] == 12 && y1[14] == 500) {
    	  if (this.plotType.equals("Butt") || this.plotType.equals("butt")) {
    		  g2d.translate(150,  180);
    	  }
    	  if (this.plotType.equals("filet")) {
    		  g2d.translate(250,  50);
    	  }
    	  if (this.plotType.equals("corner")) {
    		  g2d.translate(150,  500);
    	  }
    	  if (this.plotType.equals("overlap")) {
    		  g2d.translate(500,  -100);
    	  }
    	  if (this.plotType.equals("flanged")) {
    		  g2d.translate(250,  -200);
    	  }
    	  if (this.plotType.equals("Cross joint")) {
    		  g2d.translate(250,  850);
    	  }
    	  if (this.plotType.equals("Strap joint")) {
    		  g2d.translate(250,  580);
    	  }
    	  if (this.plotType.equals("Lap joint")) {
    		  g2d.translate(250,  500);
    	  }
    	  if (this.plotType.equals("On plate")) {
    		  g2d.translate(250,  -200);
    	  }
      }
      if (gang[2] == 16 && y1[14] == 500) {
    	  if (this.plotType.equals("Butt") || this.plotType.equals("butt")) {
    		  g2d.translate(70,  280);
    	  }
    	  if (this.plotType.equals("filet")) {
    		  g2d.translate(70,  100);
    	  }
    	  if (this.plotType.equals("corner")) {
    		  g2d.translate(70,  550);
    	  }
    	  if (this.plotType.equals("overlap")) {
    		  g2d.translate(250,  0);
    	  }
    	  if (this.plotType.equals("flanged")) {
    		  g2d.translate(70,  -200);
    	  }
    	  if (this.plotType.equals("Cross joint")) {
    		  g2d.translate(50,  1000);
    	  }
    	  if (this.plotType.equals("Strap joint")) {
    		  g2d.translate(50,  1000);
    	  }
    	  if (this.plotType.equals("Lap joint")) {
    		  g2d.translate(50,  700);
    	  }
    	  if (this.plotType.equals("On plate")) {
    		  g2d.translate(50,  0);
    	  }
      }
      if ( gang[2] == 12 && y1[14] == 250 ) {
    	  if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Lap joint") || this.plotType.equals("On plate")) {
    	  y1[14] = 160;
    	  }
      }
      if (this.gang[1] == 1) {
        Welding.this.tegning = true;
      } else {
        Welding.this.tegning = false;
      } 
      if (this.gang[0] == 1) {
        Welding.this.teksting = true;
      } else {
        Welding.this.teksting = false;
      } 
      g2d.setColor(Color.BLACK);
      if (Welding.this.teksting) {
        String v00 = "Graphic panel for " + this.plotType + " weld. ";
   //     g2d.drawString(v00, 250, 20);
      } 
      //////////////////////////////////////////////////////////////////////////////
      if (this.gang[6] == 1) {
        int start = 0;
        int slutt = 0;
        int yvalue = 110;
        int xvalue = -xP +200;
        this.stringCopy = " ";
        if (this.plotType.equals("butt") || this.plotType.equals("Butt"))
          this.stringCopy = String.valueOf(Welding.this.textA_Butt_String) + " "; 
        if (this.plotType.equals("overlap"))
          this.stringCopy = String.valueOf(Welding.this.textA_Overlap_String) + " "; 
        if (this.plotType.equals("filet"))
          this.stringCopy = String.valueOf(Welding.this.textA_Filet_String) + " "; 
        if (this.plotType.equals("corner")) {
          this.stringCopy = String.valueOf(Welding.this.textA_Corner_String) + " ";
          yvalue = 90;
        } 
        if (this.plotType.equals("flanged"))
          this.stringCopy = String.valueOf(Welding.this.textA_Flanged_String) + " "; 
        if (this.plotType.equals("Lap joint"))
          this.stringCopy = String.valueOf(Welding.this.textA_Cam_String) + " "; 
        if (this.plotType.equals("Strap joint")) {
          this.stringCopy = String.valueOf(Welding.this.textA_Cam_String) + " ";
          yvalue = 100;
        } 
        if (this.plotType.equals("On plate")) {
          this.stringCopy = String.valueOf(Welding.this.textA_Cam_String) + " ";
          yvalue = 100;
        } 
        if (this.plotType.equals("Cross joint")) {
          this.stringCopy = String.valueOf(Welding.this.textA_Cam_String) + " ";
          yvalue = 100;
        } 
        if (this.gang[2] == 13) {
  //      	System.out.println("9832  " + xvalue + "  " + yvalue + "  " + gang[6]);
          yvalue = 10;
          xvalue = 250;
        } 
        if (this.gang[2] == 14) {
          yvalue = 100;
          xvalue = -200;
        } 
        if (this.gang[2] == 13 && this.plotType.equals("On plate")) {
          yvalue = 700;
          xvalue = 200;
        } 
        if (this.gang[2] == 13 && (this.plotType.equals("Cross joint") || this.plotType.equals("Lap joint") || this.plotType.equals("Strap joint"))) {
          yvalue = -700;
          xvalue = 100;
        } 
        /////////////////////////////////////////////////////////////////////////////////////////////////
        int length = this.stringCopy.length();
        int inumber = length / 100;
        int jnumber = length % 100;
        for (int ninumber = 0; ninumber < inumber; ninumber++) {
          if (inumber >= ninumber) {
            slutt = start + 99;
            yvalue += 20;
            if (slutt > length)
              slutt = length; 
            for (int i = 0; i < 15; i++) {
              if (slutt + i + 1 < length && 
                this.stringCopy.substring(slutt + i, slutt + i + 1).equals(" "))
                slutt += i; 
            } 
    //        g2d.drawString(String.valueOf(this.stringCopy.substring(start, slutt)) + "  ", xvalue, yvalue);

            extraComment.add(0, new ExtraComment(String.valueOf(this.stringCopy.substring(start, slutt)) + "  ", xvalue, yvalue ));
            start = 0 + slutt;
          } 
          if (start >= length)
            break; 
        } 
        yvalue += 15;
        if (start < length)
  //        g2d.drawString(this.stringCopy.substring(start, length - 1), xvalue, yvalue); 
        extraComment.add(0, new ExtraComment(this.stringCopy.substring(start, length - 1), xvalue, yvalue));
      } 
      //////////////////////////////////////////////////////////////////////////////////////////////////////
      if (Welding.this.teksting) {
    	   int tranX = 0;
    	   int tranY = 0;
    	    if ( gang[2] == 11 ) {
    	    	tranX = 600;
    	    	tranY = 100;
    	    }
    	    if ( gang[2] == 15 ) {
    	    	tranX = 100;
    	    	tranY = 500;   
    	    }
    	
    	  int xst = -xP + 120 + tranX;
    	  int yst = -yP + 90 + tranY;
    	  int ystep = 30;
    	  int xstep = 80;  // 60
    	  int hstep = 30;
    	  int tsteg = 15;
      	
    	  int xBase1 = xst-2;
    	  int xBase2 = xBase1 + xstep + tsteg;
    	  int xBase3 = xBase2 + ystep;
    	  int xBase4 = xBase3 + 2*ystep;
    	  int xBase5 = xBase4 + 2*ystep;
    	  int xBase6 = xBase5 + 2*ystep;
    	  int xBase7 = xBase6 + 2*ystep;
    	  int xBase8 = xBase7 + 2*ystep;
    	  int xBase9 = xBase8 + 2*ystep;
    	  int yBase0 = yst-12 ;
    	  int yBase1 = yBase0 + hstep;
    	  int yBase2 = yBase1 + hstep;
    	  int yBase3 = yBase2 + hstep;
    	  int yBase4 = yBase3 + hstep;
    	  int yBase5 = yBase4 + hstep;
    	  int yBase6 = yBase5 + hstep;
    	  int yBase7 = yBase6 + hstep;
    	  int yBase8 = yBase7 + hstep;
    	  int yBase9 = yBase8 + hstep;
    	  int yBase10 = yBase9 + hstep;
    			  
    	



        if (this.plotType.equals("overlap")) {
        	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));  
        	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
        	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
        	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));
        	  
        	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
        	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
        	  
          String v2 = "Gap = " + this.vec[0] + ""	+ "  mm  ";
    //      g2d.drawString(v2, 10, 60);
          v2 = "Plate 1 = " + this.vec[1] + "  mm ";
    //      g2d.drawString(v2, 10, 80);
          v2 = "Plate 2=" + this.vec[2] + "  mm ";
    //      g2d.drawString(v2, 10, 100);
          this.extraText.add(0, new ExtraText("Gap "     , xst, yst+ tsteg ));
          this.extraText.add(0, new ExtraText("Plate 1 " , xst, yst + ystep + tsteg));
          this.extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 2*ystep+ tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[0]))).toString(), xst + xstep + tsteg, yst + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + tsteg          ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep+ tsteg ));

        } 
        if (this.plotType.equals("butt") || this.plotType.equals("Butt")) {
        	 String v3 = "Left side: ";
       
       	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));  
       	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
       	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
       	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));
       	  
       	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
          this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
          this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
       	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
      
   
         
          //g2d.drawString(v3, 10, 40);
          v3 = "Gap      = " + this.vec[0] + " mm   ";
          //g2d.drawString(v3, 10, 60);
          v3 = "Dy     =  " + this.vec[1] + " mm     ";
         // g2d.drawString(v3, 10, 80);
          v3 = "Plate 1 = " + this.vec[2] + " mm ";
       //   g2d.drawString(v3, 10, 100);
          this.extraText.add(0, new ExtraText("Left side: "     , xst, yst-ystep+ tsteg ));
          this.extraText.add(0, new ExtraText("Gap "     , xst, yst+ tsteg ));
          this.extraText.add(0, new ExtraText("Dy " , xst, yst + ystep + tsteg ));
          this.extraText.add(0, new ExtraText("Plate 1 " , xst, yst + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst  + tsteg         ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg  ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));
          if (this.vec[9] == 1) {
       //    	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4 ,  yBase2  ));
          }
          if (this.vec[9] == 2) {
        

 
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
            v3 = "Angle  =  " + this.vec[3] + "° ";
       //     g2d.drawString(v3, 10, 120);
            v3 = "Face   =  " + this.vec[7] + " mm ";
            
       //     g2d.drawString(v3, 10, 140);
            this.extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Face " , xst, yst + 4*ystep + tsteg ));
 
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[7]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));

            this.extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
          } 
        
          if (this.vec[9] == 3) {
        	  
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
            v3 = "Angle  =  " + this.vec[3] + "° ";
         //   g2d.drawString(v3, 10, 120);
            v3 = "Angle2 =  " + this.vec[5] + "° ";
        //    g2d.drawString(v3, 10, 140);
            v3 = "Face   =  " + this.vec[7] + " mm ";
        //    g2d.drawString(v3, 10, 160);
            v3 = "Center =  " + this.vec[8] + " mm ";
        //    g2d.drawString(v3, 10, 180);
            this.extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle2 " , xst, yst + 4*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Face "     , xst, yst + 5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Center " , xst, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[5]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[8]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
          } 
          if (this.vec[9] == 4) {
        	  
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase6   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase6   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase6  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase6  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
      //   	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
            v3 = "Angle  =  " + this.vec[3] + "° ";
        //    g2d.drawString(v3, 10, 120);
            v3 = "Radius 1 =" + this.vec[4] + " mm ";
        //    g2d.drawString(v3, 10, 140);
            v3 = "Face   =  " + this.vec[7] + " mm ";
        //    g2d.drawString(v3, 10, 160);
            this.extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Radius 1 " , xst, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Face "     , xst, yst + 5*ystep + tsteg));
       
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
      
            this.extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));
         
          } 
          if (this.vec[9] == 5) {
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase9   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase9   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase9  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase9  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));
            v3 = "Angle  =  " + this.vec[3] + "° ";
        //    g2d.drawString(v3, 10, 120);
            v3 = "Radius 1 =" + this.vec[4] + " mm ";
         //   g2d.drawString(v3, 10, 140);
            v3 = "Angle2 =  " + this.vec[5] + "° ";
       //    g2d.drawString(v3, 10, 160);
            v3 = "Radius 2 =" + this.vec[6] + " mm ";
       //    g2d.drawString(v3, 10, 180);
            v3 = "Face   =  " + this.vec[7] + " mm ";
       //    g2d.drawString(v3, 10, 200);
            v3 = "Center =  " + this.vec[8] + " mm ";
       //    g2d.drawString(v3, 10, 220);
            this.extraText.add(0, new ExtraText("Angle "     , xst, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Radius 1 " , xst, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Radius 2 "     , xst, yst + 6*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Face" , xst, yst + 7*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Center "     , xst, yst + 8*ystep + tsteg ));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[5]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[6]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[7]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[8]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
            this.extraText.add(0, new ExtraText("° " , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("° ", xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm", xst + xstep+ystep+ tsteg, yst + 8*ystep + tsteg ));
          } 
        } 
        if (this.plotType.equals("filet")) {
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase4   ));  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase4    ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase4  ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase4  ));
           	  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          String v3 = "Gap = " + this.vec[0] + " mm  ";
       //   g2d.drawString(v3, 10, 60);
          v3 = "Angle  =  " + this.vec[1] + "°  ";
       //   g2d.drawString(v3, 10, 80);
          v3 = "Plate 1 = " + this.vec[4] + " mm ";
       //  g2d.drawString(v3, 10, 100);
          v3 = "Plate 2=  " + this.vec[5] + " mm ";
       //  g2d.drawString(v3, 10, 120);
          this.extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
          this.extraText.add(0, new ExtraText("Angle " , xst, yst + ystep + tsteg ));
          this.extraText.add(0, new ExtraText("Plate 1 " , xst, yst + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 3*ystep + tsteg ));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[4]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[5]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst     + tsteg      ));
          this.extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
          
          if (this.vec[12] == 2) {
        	  
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase1,   yBase6   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase4,   xBase2,   yBase6   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase4,   xBase3,   yBase6  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase4,   xBase4,   yBase6  ));

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
        	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
            v3 = "Angle2 =  " + this.vec[6] + "°  ";
     //       g2d.drawString(v3, 10, 140);
            v3 = "Face   =  " + this.vec[10] + " mm ";
      //      g2d.drawString(v3, 10, 160);
            this.extraText.add(0, new ExtraText("Angle 2 "     , xst, yst +4*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));
     
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[6]))).toString(), xst + xstep+ tsteg, yst +4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[10]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));

            this.extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst   +4*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg ));

          } 
          if (this.vec[12] == 3) {
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase8   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase8   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase8  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase8  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  )); 
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  )); 
            v3 = "Face   =  " + this.vec[10] + " mm ";
     //       g2d.drawString(v3, 10, 140);
            v3 = "Angle2 =  " + this.vec[6] + "°  ";
       //     g2d.drawString(v3, 10, 160);
            v3 = "Angle3 =  " + this.vec[8] + "°  ";
      //      g2d.drawString(v3, 10, 180);
            v3 = "Center =  " + this.vec[11] + " mm ";
      //      g2d.drawString(v3, 10, 200);
            this.extraText.add(0, new ExtraText("Face "     , xst, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle 2" , xst, yst + 5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Angle 3 " , xst, yst + 6*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Center " , xst, yst + 7*ystep + tsteg ));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[10]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[6]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[8]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[11]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg));
          } 
          if (this.vec[12] == 4) {
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
            v3 = "Angle2 =  " + this.vec[6] + "°  ";
       //     g2d.drawString(v3, 10, 140);
            v3 = "Radius 1 =" + this.vec[7] + " mm ";
       //     g2d.drawString(v3, 10, 180);
            v3 = "Face   =  " + this.vec[10] + " mm ";
         //   g2d.drawString(v3, 10, 200);
            this.extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Radius 1" , xst, yst + 5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Face " , xst, yst + 6*ystep + tsteg));
 
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[6]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[7]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[10]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));

            this.extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
   
          } 
          if (this.vec[12] == 5) {
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase10   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase10   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase10  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase10  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));
        	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase10,   xBase4 ,  yBase10  ));
            v3 = "Angle2 =  " + this.vec[6] + "°  ";
       //     g2d.drawString(v3, 10, 140);
            v3 = "Angle3 =  " + this.vec[8] + "°  ";
        //    g2d.drawString(v3, 10, 180);
            v3 = "Radius 1 =" + this.vec[7] + " mm ";
        //    g2d.drawString(v3, 10, 200);
            v3 = "Radius 2 =" + this.vec[9] + " mm ";
        //    g2d.drawString(v3, 10, 220);
            v3 = "Face   =  " + this.vec[10] + " mm ";
        //    g2d.drawString(v3, 10, 240);
            v3 = "Center =  " + this.vec[11] + " mm ";
        //  g2d.drawString(v3, 10, 260);
            this.extraText.add(0, new ExtraText("Angle 2 "     , xst, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle 3" , xst, yst + 5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Radius 1" , xst, yst + 6*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Radius 2 "     , xst, yst + 7*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Face" , xst, yst + 8*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Center " , xst, yst + 9*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[6]))).toString(), xst + xstep+ tsteg, yst  + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[8]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[7]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[9]))).toString(), xst + xstep+ tsteg, yst  + 7*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[10]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[11]))).toString(), xst + xstep+ tsteg, yst + 9*ystep + tsteg));
            this.extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst    + 4*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst +  5*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm"   , xst + xstep+ystep+ tsteg, yst    + 7*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  8*ystep + tsteg  ));
            this.extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 9*ystep + tsteg));
          } 
        } 
        if (this.plotType.equals("corner")) {
        	int yjuster = -110;
        	yjuster =0;
        	
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0 + yjuster,   xBase1,   yBase7 + yjuster  ));  
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase2 ,    yBase0+ yjuster,   xBase2,   yBase7 + yjuster    ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0+ yjuster,   xBase3,   yBase7 + yjuster ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0+ yjuster,   xBase4,   yBase7 + yjuster ));
      	  
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,   yBase0+ yjuster,   xBase4 ,  yBase0 + yjuster));     	  
          this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,    yBase1+ yjuster,   xBase4,   yBase1 + yjuster  ));
          this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase2+ yjuster,   xBase4,   yBase2 + yjuster  ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3+ yjuster,   xBase4 ,  yBase3 + yjuster ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,    yBase4+ yjuster,   xBase4 ,  yBase4 + yjuster ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5+ yjuster,   xBase4 ,  yBase5 + yjuster ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6+ yjuster,   xBase4 ,  yBase6 + yjuster ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7+ yjuster,   xBase4 ,  yBase7 + yjuster ));
      	  
          String v7 = "Plate 1 =      " + this.vec[1] + " mm      ";
   //       g2d.drawString(v7, 10, 40);
          v7 = "Plate 2 =      " + this.vec[2] + " mm      ";
   //      g2d.drawString(v7, 10, 60);
          v7 = "Angle   =      " + this.vec[0] + "° ";
   //      g2d.drawString(v7, 10, 80);
          v7 = "Angle Left =       " + this.vec[3] + "°  ";
    //      g2d.drawString(v7, 10, 100);
          v7 = "Angle Right =  " + this.vec[4] + "° ";
    //      g2d.drawString(v7, 10, 120);
          v7 = "dx Left =      " + this.vec[5] + " mm      ";
    //     g2d.drawString(v7, 10, 140);
          v7 = "dx Right=      " + this.vec[6] + " mm      ";
    //      g2d.drawString(v7, 10, 160);
          yjuster = 0;   // -110;
          this.extraText.add(0, new ExtraText("Plate 1 "     , xst, yst + yjuster + tsteg ));
          this.extraText.add(0, new ExtraText("Plate 2 " , xst, yst + yjuster + ystep + tsteg ));
          this.extraText.add(0, new ExtraText("Angle " , xst, yst + yjuster + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText("Angle L "     , xst, yst + yjuster + 3*ystep + tsteg));
          this.extraText.add(0, new ExtraText("Angle R " , xst, yst + yjuster + 4*ystep + tsteg));
          this.extraText.add(0, new ExtraText("dx Left " , xst, yst + yjuster + 5*ystep + tsteg ));
          this.extraText.add(0, new ExtraText("dx Right " , xst, yst + yjuster + 6*ystep + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[1]))).toString(), xst + xstep+ tsteg, yst + yjuster + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[2]))).toString(), xst + xstep+ tsteg, yst + ystep + yjuster + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[0]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + yjuster + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[3]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + yjuster + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[4]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + yjuster + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[5]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + yjuster + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[6]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + yjuster + tsteg));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster    + tsteg       ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + yjuster  + tsteg));
          this.extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster   + 3*ystep     + tsteg   ));
          this.extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + yjuster +  4*ystep  + tsteg));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster + 5*ystep + tsteg)); 
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + yjuster + 6*ystep + tsteg));
          
        } 
 
        
        
        
        if (this.plotType.equals("butt")) {
        	xst = -xP + 300 + tranX + tsteg/2;      // 560
        	yst = -yP +90 + tranY;
        	  xBase1 = xst-2;
        	  xBase2 = xBase1 + xstep + tsteg;
        	  xBase3 = xBase2 + ystep;
        	  xBase4 = xBase3 + 2*ystep;
        	  xBase5 = xBase4 + 2*ystep;
        	  xBase6 = xBase5 + 2*ystep;
        	  xBase7 = xBase6 + 2*ystep;
        	  xBase8 = xBase7 + 2*ystep;
        	  xBase9 = xBase8 + 2*ystep;

          String v5 = "";
          if (this.vec[21] == 1) {
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));
           	  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
        	  
      //      g2d.drawString(v5, 600, 40);
            String v4 = "Gap      = " + this.vec[12] + " mm   ";
       //     g2d.drawString(v4, 600, 60);
            v4 = "Dy     =  " + this.vec[13] + " mm     ";
       //     g2d.drawString(v4, 600, 80);
            v4 = "Plate 2 = " + this.vec[14] + " mm ";
       //     g2d.drawString(v4, 600, 100);
            this.extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
            this.extraText.add(0, new ExtraText("Dy " , xst, yst + ystep + tsteg));
            this.extraText.add(0, new ExtraText("Plate 2 " , xst, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[12]))).toString(), xst + xstep+ tsteg, yst + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[13]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst     + tsteg      ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg));
          } 
          if (this.vec[21] == 2) {
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));
           	  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
        	  
     //       g2d.drawString(v5, 600, 40);
            String v4 = "Gap      = " + this.vec[12] + " mm   ";
       //     g2d.drawString(v4, 600, 60);
            v4 = "Dy     =  " + this.vec[13] + " mm     ";
       //     g2d.drawString(v4, 600, 80);
            v4 = "Plate 2 = " + this.vec[14] + " mm ";
       //     g2d.drawString(v4, 600, 100);
            v4 = "Angle  =  " + this.vec[15] + "° ";
       //     g2d.drawString(v4, 600, 120);
            v4 = "Face   =  " + this.vec[19] + " mm ";
       //     g2d.drawString(v4, 600, 140);
            this.extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg));
            this.extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Face " , xst, yst + 4*ystep + tsteg ));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[19]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep  + tsteg));
            this.extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
          } 
          if (this.vec[21] == 3) {
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));
           	  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase7   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase7   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase7  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase7  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));

        	  
            g2d.drawString(v5, 600, 40);
            String v4 = "Gap      = " + this.vec[12] + " mm   ";
      //      g2d.drawString(v4, 600, 60);
            v4 = "Dy     =  " + this.vec[13] + " mm     ";
       //     g2d.drawString(v4, 600, 80);
            v4 = "Plate 2 = " + this.vec[14] + " mm ";
       //     g2d.drawString(v4, 600, 100);
            v4 = "Angle  =  " + this.vec[15] + "° ";
      //      g2d.drawString(v4, 600, 120);
            v4 = "Angle 2=  " + this.vec[17] + "° ";
       //     g2d.drawString(v4, 600, 140);
            v4 = "Face   =  " + this.vec[19] + " mm ";
        //    g2d.drawString(v4, 600, 160);
            v4 = "Center =  " + this.vec[20] + " mm ";
       //     g2d.drawString(v4, 600, 180);
            this.extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle 2 " , xst, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Center " , xst, yst + 6*ystep + tsteg));  
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[17]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[19]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[20]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep   + tsteg     ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep  + tsteg));
            this.extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText("°  " , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg));
          } 
          if (this.vec[21] == 4) {
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));
           	  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase6   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase6   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase6  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase6  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
      //   	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
     //       g2d.drawString(v5, 600, 40);
            String v4 = "Gap      = " + this.vec[12] + " mm   ";
       //     g2d.drawString(v4, 600, 60);
            v4 = "Dy     =  " + this.vec[13] + " mm     ";
       //     g2d.drawString(v4, 600, 80);
            v4 = "Plate 2 = " + this.vec[14] + " mm ";
       //     g2d.drawString(v4, 600, 100);
            v4 = "Angle  =  " + this.vec[15] + "° ";
       //     g2d.drawString(v4, 600, 120);
            v4 = "Radius =  " + this.vec[16] + " mm ";
      //      g2d.drawString(v4, 600, 140);
            v4 = "Face   =  " + this.vec[19] + " mm ";
      //     g2d.drawString(v4, 600, 160);
            this.extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg));
            this.extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Radius " , xst, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Face " , xst, yst + 5*ystep + tsteg));
     //       this.extraText.add(0, new ExtraText("Center " , xst, yst + 9*ystep ));  
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[16]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[19]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
     //       this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[20]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep  + tsteg      ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
     //       this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg ));
          } 
          if (this.vec[21] == 5) {
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));
           	  
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
              this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
           	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase1,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase3,   xBase2,   yBase5   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase3,   xBase3,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase3,   xBase4,   yBase5  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase1,   yBase9   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase5,   xBase2,   yBase9   ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase5,   xBase3,   yBase9  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase5,   xBase4,   yBase9  ));
          

          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));  // bunn linje avslutning
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase4,   xBase4 ,  yBase4  ));
          	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase5,   xBase4 ,  yBase5  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase6,   xBase4 ,  yBase6  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase7,   xBase4 ,  yBase7  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase8,   xBase4 ,  yBase8  ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase9,   xBase4 ,  yBase9  ));
     //       g2d.drawString(v5, 600, 40);
            String v4 = "Gap      = " + this.vec[12] + " mm   ";
     //       g2d.drawString(v4, 600, 60);
            v4 = "Dy     =  " + this.vec[13] + " mm     ";
    //       g2d.drawString(v4, 600, 80);
            v4 = "Plate 2 = " + this.vec[14] + " mm ";
     //       g2d.drawString(v4, 600, 100);
            v4 = "Angle  =  " + this.vec[15] + "° ";
     //      g2d.drawString(v4, 600, 120);
            v4 = "Radius =  " + this.vec[16] + " mm ";
     //       g2d.drawString(v4, 600, 140);
            v4 = "Angle 2=  " + this.vec[17] + "° ";
      //      g2d.drawString(v4, 600, 160);
            v4 = "Radius2=  " + this.vec[18] + " mm ";
    //        g2d.drawString(v4, 600, 180);
            v4 = "Face   =  " + this.vec[19] + " mm ";
     //       g2d.drawString(v4, 600, 200);
            v4 = "Center =  " + this.vec[20] + " mm ";
      //      g2d.drawString(v4, 600, 220);
            this.extraText.add(0, new ExtraText("Right side: "     , xst, yst-ystep + tsteg));
            this.extraText.add(0, new ExtraText("Gap "     , xst, yst + 0*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Dy "     , xst, yst + 1*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Plate 2" , xst, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle " , xst, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Radius " , xst, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Angle 2 " , xst, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Radius 2 " , xst, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText("Face " , xst, yst + 7*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("Center " , xst, yst + 8*ystep + tsteg));  
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[12]))).toString(), xst + xstep+ tsteg, yst  + 0*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[13]))).toString(), xst + xstep+ tsteg, yst  + 1*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[14]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[15]))).toString(), xst + xstep+ tsteg, yst + 3*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[16]))).toString(), xst + xstep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[17]))).toString(), xst + xstep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[18]))).toString(), xst + xstep+ tsteg, yst + 6*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[19]))).toString(), xst + xstep+ tsteg, yst + 7*ystep + tsteg));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[20]))).toString(), xst + xstep+ tsteg, yst + 8*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 0*ystep   + tsteg     ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + 1*ystep    + tsteg    ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  2*ystep + tsteg ));
            this.extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 3*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 4*ystep + tsteg));
            this.extraText.add(0, new ExtraText("°  "  , xst + xstep+ystep+ tsteg, yst + 5*ystep + tsteg));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 6*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm"  , xst + xstep+ystep+ tsteg, yst + 7*ystep + tsteg ));
            this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 8*ystep + tsteg ));
          } 
        } 
        if (this.plotType.equals("flanged")) {
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase0,   xBase1,   yBase3   ));  
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase2,    yBase0,   xBase2,   yBase3    ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase3,    yBase0,   xBase3,   yBase3  ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase4,    yBase0,   xBase4,   yBase3  ));
      	  
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1 ,   yBase0,   xBase4 ,  yBase0 ));     	  
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase1,   xBase4,   yBase1   ));
         	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase2,   xBase4,   yBase2   ));
      	  this.extraLineTabell.add(0, new ExtraLine(   xBase1,    yBase3,   xBase4 ,  yBase3  ));
          String v3 = "Gap = " + this.vec[0] + " mm  ";
     //     g2d.drawString(v3, 10, 60);
          v3 = "Plate 1 = " + this.vec[1] + " mm ";
     //     g2d.drawString(v3, 10, 80);
          v3 = "Radius =  " + this.vec[2] + " mm ";
      //   g2d.drawString(v3, 10, 100);
          this.extraText.add(0, new ExtraText("Gap "     , xst, yst + tsteg ));
          this.extraText.add(0, new ExtraText("Plate 1 " , xst, yst + ystep + tsteg ));
          this.extraText.add(0, new ExtraText("Radius " , xst, yst + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[0]))).toString(), xst + xstep+ tsteg, yst + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[1]))).toString(), xst + xstep+ tsteg, yst + ystep + tsteg));
          this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[2]))).toString(), xst + xstep+ tsteg, yst + 2*ystep + tsteg));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst    + tsteg       ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst +  ystep + tsteg ));
          this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep+ tsteg, yst + 2*ystep + tsteg ));
        } 
      } 
 //     g2d.setFont(new Font("Serif", Font.BOLD,11));
      ///////////////////////////////////////////////////////////////////////////////////////////
      /*
      if (this.gang[2] == 14) {
        this.y1[14] = 300;
        if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Lap joint") || this.plotType.equals("On plate"))
          this.y1[14] = 200; 
        if (this.plotType.equals("corner")) {
          g2d.translate(490, 100);
        } else {
          g2d.translate(490, 250);
        } 
      } 
      */
      if (this.gang[7] == 1) {
        g2d.translate(this.xP, this.yP);
      } else {
        g2d.translate(this.xP, this.yP);
      } 
      double scaler = this.y1[14] / 100.0D;
      if (scaler > 0.0D)
        g2d.scale(scaler, scaler); 
      g2d.rotate(Math.PI * this.x1[13] / 180.0D);
      Path2D.Double p = new Path2D.Double();
      
      /////////////////////////////////////////////////////////////////////////////////////////////////
      if (this.vec[9] == 5)
        this.x1[0] = this.x1[1]; 
     
      p.moveTo(this.x1[0], this.y1[0]);
      p.lineTo(this.x1[1], this.y1[1]);
      p.lineTo(this.x1[2], this.y1[2]);
      p.lineTo(this.x1[3], this.y1[3]);
      p.lineTo(this.x1[4], this.y1[4]);
      p.lineTo(this.x1[5], this.y1[5]);
      p.lineTo(this.x1[6], this.y1[6]);
      p.lineTo(this.x1[7], this.y1[7]);
     // g2d.draw(p);   // hs 
//    System.out.println(" filettest " + y1[0] + "  " + y1[1]+ "  " + y1[2]+ "  " + y1[3]+ "  " + y1[4]+ "  " + y1[5]+ "  " + y1[6]+ "  " + y1[7]+ "  " );
//      System.out.println(" filettest " + x1[0] + "  " + x1[1]+ "  " + x1[2]+ "  " + x1[3]+ "  " + x1[4]+ "  " + x1[5]+ "  " + x1[6]+ "  " + x1[7]+ "  " );
      this.extraBase.add(0, new ExtraBase(this.x1[1], this.y1[1], this.x1[2], this.y1[2]));
      this.extraBase.add(0, new ExtraBase(this.x1[2], this.y1[2], this.x1[3], this.y1[3]));
      this.extraBase.add(0, new ExtraBase(this.x1[3], this.y1[3], this.x1[4], this.y1[4]));
      this.extraBase.add(0, new ExtraBase(this.x1[4], this.y1[4], this.x1[5], this.y1[5]));
      this.extraBase.add(0, new ExtraBase(this.x1[5], this.y1[5], this.x1[6], this.y1[6]));
      this.extraBase.add(0, new ExtraBase(this.x1[6], this.y1[6], this.x1[7], this.y1[7]));
       
      Path2D.Double q = new Path2D.Double();
      Path2D.Double qqr = new Path2D.Double();
      Path2D.Double qqs = new Path2D.Double();
   
      if (this.plotType.equals("overlap") && 
        Welding.this.tegning) {
        g2d.setColor(Color.BLUE);
        g2d.setStroke(stroke);
        int dd = this.vec[1];
        g2d.setStroke(dashed);
        g2d.setColor(Color.BLUE);
        if (this.gap > 0) {
    //      g2d.drawLine(this.x1[0] + dd, this.y1[0], this.x1[0] + 6 * dd, this.y1[0]);
    //    g2d.drawLine(this.x1[0] + dd, this.y1[0] + this.gap, this.x1[0] + 6 * dd, this.y1[0] + this.gap);
        	//      g2d.drawString((new StringBuilder(String.valueOf(this.vec[0]))).toString(), this.x1[0] + 7 * dd, this.y1[0] + 2 * this.gap / 3);
        	//      drawArrowLine(g2d, this.x1[0] + 3 * dd, this.y1[0] - 3 * dd, this.x1[0] + 3 * dd, this.y1[0], 4, 4);
        	//     drawArrowLine(g2d, this.x1[0] + 3 * dd, this.y1[0] + this.gap + 3 * dd, this.x1[0] + 3 * dd, this.y1[0] + this.gap, 4, 4);
          this.extraLineTegn.add(0, new ExtraLine(this.x1[0] + dd, this.y1[0], this.x1[0] + 6 * dd, this.y1[0]));
          this.extraLineTegn.add(0, new ExtraLine(this.x1[0] + dd, this.y1[0] + this.gap, this.x1[0] + 6 * dd, this.y1[0] + this.gap));
          this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.vec[0]))).toString(), this.x1[0] + 7 * dd, this.y1[0] + 2 * this.gap / 3));
          this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] + 3 * dd, this.y1[0] - 3 * dd, this.x1[0] + 3 * dd, this.y1[0], 4, 4));
          this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] + 3 * dd, this.y1[0] + this.gap + 3 * dd, this.x1[0] + 3 * dd, this.y1[0] + this.gap, 4, 4));
        } 
        g2d.setStroke(stroke);
        g2d.setColor(Color.BLACK);
      } 
      if (this.plotType.equals("corner")) {
    	 
        if (Welding.this.tegning) {
          g2d.setColor(Color.BLUE);
          g2d.setStroke(thichness05);
          int dd = this.vec[1];
          int yjuster = -110;
         
          
          //      	g2d.drawString(   vec[0]+"°",(x1[0] + x2[0])/2, y1[0]  );	
          //   	g2d.drawString(   (vec[0]+ vec[3] + vec[4])+"°",x2[1], y1[1] - 4*dd  );
          //    	g2d.drawString(   vec[3]+"°",(x1[2]- x1[1])*2, (y1[2] - y1[1])*2  );
          // 		g2d.drawString(   vec[4]+"°",(x2[2]- x2[1])*2, (y1[2] - y1[1])*2);
        	extraTallTegn.add(0,new ExtraTall(  vec[0]+"°",(x1[0] + x2[0])/2, y1[0] + yjuster +10*dd ));
	 		extraTallTegn.add(0,new ExtraTall(  (vec[0]+ vec[3] + vec[4])+"°",x2[1], y1[1] - 4*dd + yjuster + 9*dd ));
	 		extraTallTegn.add(0,new ExtraTall(  vec[3]+"°",(x1[2]- x1[1])*2, (y1[2] - y1[1])*2  + yjuster ));
	 		extraTallTegn.add(0,new ExtraTall(   vec[4]+"°",(x2[2]- x2[1])*2, (y1[2] - y1[1])*2 + yjuster ));
	 		
	 	  		
          g2d.setStroke(thichness05);
          g2d.setColor(Color.BLUE);
          g2d.setStroke(stroke);
          double pod1 = (4 * dd) * Math.sin(Math.PI * ((90 - this.vec[1]) / 2) / 180.0D);
          int poi1 = (int)pod1;
          double pod3 = (4 * dd) * Math.cos(Math.PI * ((90 - this.vec[1]) / 2) / 180.0D);
          int poi3 = (int)pod3;
          double pod1x = dd * Math.sin(Math.PI * ((90 - this.vec[1]) / 2) / 180.0D);
          int poi1x = (int)pod1x;
          double pod3x = dd * Math.cos(Math.PI * ((90 - this.vec[1]) / 2) / 180.0D);
          int poi3x = (int)pod3x;
          //       g2d.drawLine(this.x1[0] - poi1x, this.y1[0] + poi3x, this.x1[0] - poi1, this.y1[0] + poi3);
          //      g2d.drawLine(this.x2[0] + poi1x, this.y2[0] + poi3x, this.x2[0] + poi1, this.y2[0] + poi3);
          this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - poi1x, this.y1[0] + poi3x , this.x1[0] - poi1, this.y1[0] + poi3));
          this.extraLineTegn.add(0, new ExtraLine(this.x2[0] + poi1x, this.y2[0] + poi3x , this.x2[0] + poi1, this.y2[0]  + poi3));
          this.x11[12] = this.x1[0] - poi3;
          this.y11[12] = this.y1[0] + poi3 ;
          this.x11[13] = this.x2[0] + poi3;
          this.y11[13] = this.y2[0] + poi3 ;
          int ddd = 2 * poi3;
          QuadCurve2D.Double curve40 = new QuadCurve2D.Double(this.x11[12], (this.y11[12] + ddd / 8), ((this.x11[12] + this.x11[13]) / 2), (this.y11[12] + ddd), this.x11[13], (this.y11[13] + ddd / 8));
          //      g2d.draw(curve40);
          this.extraBueTegn.add(0, new ExtraBue(this.x11[12], this.y11[12] + ddd / 8, (this.x11[12] + this.x11[13]) / 2, this.y11[12] + ddd, this.x11[13], this.y11[13] + ddd / 8));
          this.x11[14] = (this.x1[2] - this.x1[1]) * 4;
          this.y11[14] = (this.y1[2] - this.y1[1]) * 4 + yjuster;
          this.x11[13] = (this.x2[2] - this.x2[1]) * 4;
          this.y11[13] = (this.y2[2] - this.y2[1]) * 4  + yjuster;
          QuadCurve2D.Double curve41 = new QuadCurve2D.Double(this.x11[14], (this.y11[14] - ddd / 8), ((this.x11[14] + this.x11[13]) / 2), (this.y11[14] - ddd), this.x11[13], (this.y11[13] - ddd / 8));
          //     g2d.draw(curve41);
          this.extraBueTegn.add(0, new ExtraBue(this.x11[14], this.y11[14] - ddd / 8, (this.x11[14] + this.x11[13]) / 2, this.y11[14] - ddd, this.x11[13], this.y11[13] - ddd / 8));
          double dxld = (this.fac * this.vec[5]) * Math.sin(Math.PI * (this.vec[0] / 2) / 180.0D);
          double dyld = (this.fac * this.vec[5]) * Math.cos(Math.PI * (this.vec[0] / 2) / 180.0D);
          int dxli = (int)dxld;
          int dyli = (int)dyld;
      //          g2d.drawLine((this.x1[2] - this.x1[1]) * 2, (this.y1[2] + this.y1[1]) * 2, (this.x1[2] - this.x1[1]) * 4, (this.y1[2] - this.y1[1]) * 4);
          this.extraLineTegn.add(0, new ExtraLine((this.x1[2] - this.x1[1]) * 2, (this.y1[2] - this.y1[1]) * 2  + yjuster, (this.x1[2] - this.x1[1]) * 4, (this.y1[2] - this.y1[1]) * 4  + yjuster));
          //        g2d.drawLine((this.x2[2] - this.x2[1]) * 2, (this.y2[2] - this.y2[1]) * 2, (this.x2[2] - this.x2[1]) * 4, (this.y2[2] - this.y2[1]) * 4);
          this.extraLineTegn.add(0, new ExtraLine((this.x2[2] - this.x2[1]) * 2, (this.y2[2] - this.y2[1]) * 2  + yjuster, (this.x2[2] - this.x2[1]) * 4, (this.y2[2] - this.y2[1]) * 4  + yjuster));
        } 
        g2d.setColor(Color.BLACK);
        
      } 
      if (this.plotType.equals("flanged")) {
        if (Welding.this.tegning) {
        	
          g2d.setColor(Color.BLUE);
   //       g2d.drawString("R" + this.vec[2], this.x4[0] + 3 * this.vec[1], this.y4[0] + 2 * this.vec[1]);
          this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[2], this.x4[0] + 3 * this.vec[1], this.y4[0] + 2 * this.vec[1]));
          g2d.setStroke(stroke);
          int dd = this.vec[1];
          g2d.setStroke(thichness05);
          g2d.setColor(Color.BLUE);
          if (this.gap > 0) {
       	   	  //           g2d.drawLine(this.x3[0], this.y3[0] - dd, this.x3[0], this.y3[0] - 6 * dd);
        	  // g2d.drawLine(this.x4[0], this.y4[0] - dd, this.x4[0], this.y4[0] - 6 * dd);
        	  //       g2d.drawString((new StringBuilder(String.valueOf(this.vec[0]))).toString(), this.x3[0] + this.gap / 2, this.y3[0] - 7 * dd);
        	  //        drawArrowLine(g2d, this.x3[0] - 3 * dd, this.y3[0] - 4 * dd, this.x3[0], this.y3[0] - 4 * dd, 4, 4);
        	  //        drawArrowLine(g2d, this.x4[0] + 3 * dd, this.y4[0] - 4 * dd, this.x4[0], this.y4[0] - 4 * dd, 4, 4);
            this.extraLineTegn.add(0, new ExtraLine(this.x3[0], this.y3[0] - dd, this.x3[0], this.y3[0] - 6 * dd));
            this.extraLineTegn.add(0, new ExtraLine(this.x4[0], this.y4[0] - dd, this.x4[0], this.y4[0] - 6 * dd));
            this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.vec[0]))).toString(), this.x3[0] + this.gap / 2, this.y3[0] - 7 * dd));
            this.extraArrayTegn.add(0, new ExtraArray(this.x3[0] - 3 * dd, this.y3[0] - 4 * dd, this.x3[0], this.y3[0] - 4 * dd, 4, 4));
            this.extraArrayTegn.add(0, new ExtraArray(this.x4[0] + 3 * dd, this.y4[0] - 4 * dd, this.x4[0], this.y4[0] - 4 * dd, 4, 4));
          } 
          g2d.setStroke(stroke);
          g2d.setColor(Color.BLACK);
        } 
        Color back = new Color(240, 240, 240);
        g2d.setColor(back);
        //    g2d.drawLine(0, 0, 0, 0);
        g2d.setColor(Color.BLACK);
      } 
      
      if (this.plotType.equals("filet")) {
        int angle = this.vec[1];
        int ddd = this.fac * this.vec[5];
        double xc = ddd * Math.cos(Math.PI * angle / 180.0D);
        double yc = ddd * Math.sin(Math.PI * angle / 180.0D);
        int xci = (int)xc;
        int yci = (int)yc;
        if ( !plotOK) {
        	g2d.setColor(Color.RED);
        	g2d.drawString("Impossible value combination", -110, 30);
        	g2d.setColor(Color.BLACK);
        	plotOK =  true;
        }
        String v1 = "1   ";
               g2d.drawString(v1, this.x1[2] + 30, this.y1[2]);
        this.extraTallBase.add(0, new ExtraTall(v1, this.x1[2] + 30, this.y1[2]));
 		g2d.drawLine( 0,  0,  0, 0);
        g2d.rotate(Math.PI * (90 - this.vec[1]) / 180.0D);
        
        if (this.vec[12] == 1) {
          int dd = this.fac * this.vec[5];
          v1 = "2   ";
          //         g2d.drawString(v1, this.x2[5], this.y2[6] + 20);
          this.extraTall.add(0, new ExtraTall(v1, this.x2[5], this.y2[6] + 20));
          if (Welding.this.tegning) {
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLUE);
            Path2D.Double curvYG2 = new Path2D.Double();
            QuadCurve2D.Double curveYG2 = new QuadCurve2D.Double(this.x2[3], (this.y2[3] - dd / 8), (this.x2[2] + dd), (-(this.y2[2] - this.y2[3]) / 2), (this.x2[2] - this.y2[3] / 2), this.y2[2]);
     //       g2d.drawString(   vec[1]+"°"  , x2[3]+ dd/2 ,  y2[3]- dd/2);
	      		extraTallTegn.add(0,new ExtraTall(  vec[1]+"°"  , x2[3]+ dd/2 ,  y2[3]- dd/2  )); 
	      		g2d.setStroke(thichness05);
            if (this.gap > 0) {
            	 //          g2d.drawLine(this.x2[1] - dd, this.y2[2], this.x2[1] - 2 * dd, this.y2[2]);
            	 // .drawLine(this.x2[1] - dd, this.y2[1] + this.gap, this.x2[1] - 2 * dd, this.y2[1] + this.gap);
            	 //           g2d.drawString((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x2[1] - dd - 4 * Welding.this.s, this.y2[1] + dd / 3);
            	 //            drawArrowLine(g2d, this.x2[1] - 3 * dd / 2, this.y2[1] - dd / 2, this.x2[1] - 3 * dd / 2, this.y2[1], 4, 4);
            	 //            drawArrowLine(g2d, this.x2[1] - 3 * dd / 2, this.y2[1] + this.gap + dd / 2, this.x2[1] - 3 * dd / 2, this.y2[1] + this.gap, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[1] - dd, this.y2[2], this.x2[1] - 2 * dd, this.y2[2]));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[1] - dd, this.y2[1] + this.gap, this.x2[1] - 2 * dd, this.y2[1] + this.gap));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x2[1] + dd/8 - 4 * Welding.this.s, this.y2[1] + dd / 3));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[1] - 3 * dd / 2, this.y2[1] - dd / 2, this.x2[1] - 3 * dd / 2, this.y2[1], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[1] - 3 * dd / 2, this.y2[1] + this.gap + dd / 2, this.x2[1] - 3 * dd / 2, this.y2[1] + this.gap, 4, 4));
            } 
            if (angle != 90 && angle != 0) {
              double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi = (int)pod;
              double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi0 = (int)pod0;
                //         g2d.drawLine(this.x2[3] + dd / 4, this.y2[3] - dd / 4, this.x2[3] + dd / 4, this.y2[3] - dd);
                //         g2d.drawLine(this.x2[3] + dd / 4, this.y2[3] - dd / 4, this.x2[3] + dd, this.y2[3] - poi);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[3] + dd / 4, this.y2[3] - dd / 4, this.x2[3] + dd / 4, this.y2[3] - dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[3] + dd / 4, this.y2[3] - dd / 4, this.x2[3] + dd, this.y2[3] - poi));
            } else {
            	 //              g2d.drawLine(this.x2[3] + dd / 4, this.y2[3] - dd / 4, this.x2[3] + dd, this.y2[3] - dd / 4);
            	 //         g2d.drawLine(this.x2[3] + dd / 4, this.y2[3] - dd / 4, this.x2[3] + dd / 4, this.y2[3] - dd);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[3] + dd / 4, this.y2[3] - dd / 4, this.x2[3] + dd, this.y2[3] - dd / 4));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[3] + dd / 4, this.y2[3] - dd / 4, this.x2[3] + dd / 4, this.y2[3] - dd));
            } 
            if (this.vec[2] > 0) {
            	 //            g2d.drawString("a" + this.vec[2], this.x2[1] - dd / 2, this.y2[2] - dd / 4);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[2], this.x2[1] - dd / 2, this.y2[2] - dd / 4));
            } 
            if (this.vec[3] > 0) {
            	 //            g2d.drawString("a" + this.vec[3], this.x2[3] + dd / 2, this.y2[2] - dd / 4);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[3], this.x2[3] + dd / 2, this.y2[2] - dd / 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[12] == 2) {
          int dd = this.fac * this.vec[5];
          v1 = "2   ";
          //       g2d.drawString(v1, this.x2[7], this.y2[6] + 20);
          this.extraTall.add(0, new ExtraTall(v1, this.x2[7], this.y2[6] + 20));
          //           g2d.drawLine(this.x2[0], this.y2[0], this.x2[7] + 5, this.y2[7]);
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[7] + 5, this.y2[7]));
          if (Welding.this.tegning) {
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLUE);
            double xnede = (this.x2[4] - this.y2[5] / 2);
            int xnedei = (int)xnede;
            Path2D.Double curvYG2 = new Path2D.Double();
            QuadCurve2D.Double curveYG2 = new QuadCurve2D.Double(this.x2[5], this.y2[5], (this.x2[4] + dd), (-(this.y2[4] - this.y2[5]) / 2), (this.x2[4] - this.y2[5] / 2), this.y2[3]);
            Path2D.Double curvYG3 = new Path2D.Double();
            QuadCurve2D.Double curveYG3 = new QuadCurve2D.Double(this.x2[4], this.y2[4], (this.x2[4] + dd / 4), ((this.y2[2] + this.y2[3]) / 2 - dd / 4), (this.x2[4] + dd / 4), this.y2[3]);
            //        g2d.drawString(String.valueOf(this.vec[6]) + "°", this.x2[4] + dd / 16, this.y2[4] - dd / 4);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[6]) + "°", this.x2[4] + dd / 16, this.y2[4] - dd / 4));
            g2d.setStroke(dashed);
            //          g2d.drawString(String.valueOf(this.vec[1]) + "°", this.x2[5] + dd / 2, this.y2[5] - dd / 2);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[1]) + "°", this.x2[5] + dd / 2, this.y2[5] - dd / 2));
            g2d.setStroke(thichness05);
            if (this.gap > 0) {
            	 //         g2d.drawLine(this.x2[2] - 2 * dd, this.y2[3], this.x2[1] - 4 * dd, this.y2[3]);
            	 //         g2d.drawLine(this.x2[2] - 2 * dd, this.y2[3] + this.gap, this.x2[2] - 4 * dd, this.y2[3] + this.gap);
            	 //           g2d.drawString((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x2[2] - 4 * dd - dd / 8, this.y2[3] + dd / 4);
            	 //          drawArrowLine(g2d, this.x2[2] - 3 * dd, this.y2[3] - dd / 2, this.x2[1] - 3 * dd, this.y2[3], 4, 4);
            	 //          drawArrowLine(g2d, this.x2[2] - 3 * dd, this.y2[3] + this.gap + dd / 2, this.x2[2] - 3 * dd, this.y2[3] + this.gap, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - 2 * dd, this.y2[3], this.x2[1] - 4 * dd, this.y2[3]));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - 2 * dd, this.y2[3] + this.gap, this.x2[2] - 4 * dd, this.y2[3] + this.gap));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x2[2] - 2 * dd , this.y2[3] + dd / 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[2] - 3 * dd, this.y2[3] - dd / 2, this.x2[1] - 3 * dd, this.y2[3], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[2] - 3 * dd, this.y2[3] + this.gap + dd / 2, this.x2[2] - 3 * dd, this.y2[3] + this.gap, 4, 4));
            } 
            double pod1 = dd * Math.tan(Math.PI * this.vec[6] / 180.0D);
            int poi1 = (int)pod1;
            double pod10 = (dd / 4) * Math.tan(Math.PI * this.vec[6] / 180.0D);
            int poi10 = (int)pod10;
            //        g2d.drawLine(this.x2[4] + dd / 4, this.y2[4] - poi10, this.x2[4] + dd, this.y2[4] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x2[4] + dd / 4, this.y2[4] - poi10, this.x2[4] + dd, this.y2[4] - poi1));
            if (angle != 90 && angle != 0) {
              double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi = (int)pod;
              double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi0 = (int)pod0;
              //          g2d.drawLine(this.x2[5] + dd / 4, this.y2[5] - dd / 4, this.x2[5] + dd / 4, this.y2[5] - dd);
              //          g2d.drawLine(this.x2[5] + dd / 4, this.y2[5] - dd / 4, this.x2[5] + dd, this.y2[5] - poi);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[5] + dd / 4, this.y2[5] - dd / 4, this.x2[5] + dd / 4, this.y2[5] - dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[5] + dd / 4, this.y2[5] - dd / 4, this.x2[5] + dd, this.y2[5] - poi));
            } else {
            	 //          g2d.drawLine(this.x2[5] + dd / 4, this.y2[5] - dd / 4, this.x2[5] + dd, this.y2[5] - dd / 4);
            	 //           g2d.drawLine(this.x2[5] + dd / 4, this.y2[5] - dd / 4, this.x2[5] + dd / 4, this.y2[5] - dd);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[5] + dd / 4, this.y2[5] - dd / 4, this.x2[5] + dd, this.y2[5] - dd / 4));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[5] + dd / 4, this.y2[5] - dd / 4, this.x2[5] + dd / 4, this.y2[5] - dd));
            } 
            if (this.face > 0) {
            	 //          g2d.drawLine(this.x2[3], this.y2[3] + this.gap + this.tp1 + dd / 2, this.x2[3], this.y2[3] + this.gap + this.tp1 + dd);
            	 //          g2d.drawLine(this.x2[2], this.y2[2] + this.gap + this.tp1 + dd / 2, this.x2[2], this.y2[2] + this.gap + this.tp1 + dd);
            	 //          g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x2[3] + dd / 16, this.y2[3] + this.gap + this.tp1 + dd);
            	 //           drawArrowLine(g2d, this.x2[2] - dd / 2, this.y2[2] + this.gap + this.tp1 + 3 * dd / 4, this.x2[2], this.y2[2] + this.gap + this.tp1 + 3 * dd / 4, 4, 4);
              //          drawArrowLine(g2d, this.x2[3] + dd / 2, this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, this.x2[3], this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[3], this.y2[3] + this.gap + this.tp1 + dd / 2, this.x2[3], this.y2[3] + this.gap + this.tp1 + dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[2], this.y2[2] + this.gap + this.tp1 + dd / 2, this.x2[2], this.y2[2] + this.gap + this.tp1 + dd));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x2[3] + dd / 16, this.y2[3] + this.gap + this.tp1 + 5*dd/4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[2] - dd / 2, this.y2[2] + this.gap + this.tp1 + 3 * dd / 4, this.x2[2], this.y2[2] + this.gap + this.tp1 + 3 * dd / 4, 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[3] + dd / 2, this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, this.x2[3], this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, 4, 4));
            } 
            if (this.vec[2] > 0) {
            	 //         g2d.drawString("a" + this.vec[2], this.x2[1] - dd / 2, this.y2[5] + dd);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[2], this.x2[1] - dd / 2, this.y2[5] + dd));
            } 
            if (this.vec[3] > 0) {
            	 //           g2d.drawString("a" + this.vec[3], this.x2[3] + 3 * dd / 2, this.y2[5] + dd);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[3], this.x2[3] + 3 * dd / 2, this.y2[5] + dd));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[12] == 3) {
          v1 = "2   ";
          int dd = this.fac * this.vec[5];
          //      g2d.drawString(v1, this.x2[4], this.y2[5] - 1 * dd / 2);
          //       g2d.drawLine(this.x2[7], this.y2[7], this.x2[7] - dd / 4, this.y2[7] + dd / 4);
          //.drawLine(this.x2[7] - dd / 4, this.y2[7] + dd / 4, this.x2[7] - dd / 2, this.y2[7]);
          //      g2d.drawLine(this.x2[7] - dd / 2, this.y2[7], this.x2[7] - 3 * dd / 4, this.y2[7] + dd / 4);
          //      g2d.drawLine(this.x2[7] - 3 * dd / 4, this.y2[7] + dd / 4, this.x2[0], this.y2[0]);
          this.extraTall.add(0, new ExtraTall(v1, this.x2[4], this.y2[5] - 1 * dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x2[7], this.y2[7], this.x2[7] - dd / 4, this.y2[7] + dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x2[7] - dd / 4, this.y2[7] + dd / 4, this.x2[7] - dd / 2, this.y2[7]));
          this.extraLine.add(0, new ExtraLine(this.x2[7] - dd / 2, this.y2[7], this.x2[7] - 3 * dd / 4, this.y2[7] + dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x2[7] - 3 * dd / 4, this.y2[7] + dd / 4, this.x2[0], this.y2[0]));
          if (Welding.this.tegning) {
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLUE);
            double xnede = (this.x2[6] - this.y2[6] / 2);
            int xnedei = (int)xnede;
            Path2D.Double curvYG2 = new Path2D.Double();
            QuadCurve2D.Double curveYG2 = new QuadCurve2D.Double(this.x2[6], this.y2[6], (this.x2[5] + dd), (this.y2[4] - dd), xnedei, this.y2[4]);
            Path2D.Double curvYG3 = new Path2D.Double();
            QuadCurve2D.Double curveYG3 = new QuadCurve2D.Double(this.x2[5], this.y2[5], ((this.x2[5] + this.x2[4]) / 2 + dd / 2), ((this.y2[5] + this.y2[4]) / 2), this.x2[5], this.y2[4]);
            //       g2d.drawString(String.valueOf(this.vec[8]) + "°", this.x2[2] - dd / 2, this.y2[4] - dd / 2);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[8]) + "°", this.x2[2] - dd / 2, this.y2[4] - dd / 2));
            Path2D.Double curvYG4 = new Path2D.Double();
            QuadCurve2D.Double curveYG4 = new QuadCurve2D.Double(this.x2[2], this.y2[2], ((this.x2[2] + this.x2[3]) / 2 - dd / 2), ((this.y2[2] + this.y2[3]) / 2), this.x2[2], this.y2[3]);
            //         g2d.drawString(String.valueOf(this.vec[6]) + "°", this.x2[5] + dd / 4, this.y2[5] - dd / 4);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[6]) + "°", this.x2[5] + dd / 4, this.y2[5] - dd / 4));
            g2d.setStroke(dashed);
            //        g2d.drawString(String.valueOf(this.vec[1]) + "°", this.x2[6] + dd / 2, this.y2[6] - dd / 2);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[1]) + "°", this.x2[6] + dd / 2, this.y2[6] - dd / 2));
            g2d.setStroke(thichness05);
            if (this.gap > 0) {
            	//         g2d.drawLine(this.x2[2] - 2 * dd, this.y2[3], this.x2[1] - 3 * dd, this.y2[3]);
            	//          g2d.drawLine(this.x2[2] - 2 * dd, this.y2[3] + this.gap, this.x2[2] - 3 * dd, this.y2[3] + this.gap);
            	//          g2d.drawString((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x2[2] - 3 * dd - dd / 8, this.y2[3] + dd / 3);
            	//         drawArrowLine(g2d, this.x2[2] - 5 * dd / 2, this.y2[3] - dd / 2, this.x2[1] - 5 * dd / 2, this.y2[3], 4, 4);
            	//        drawArrowLine(g2d, this.x2[2] - 5 * dd / 2, this.y2[3] + this.gap + dd / 2, this.x2[2] - 5 * dd / 2, this.y2[3] + this.gap, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - 2 * dd, this.y2[3], this.x2[1] - 3 * dd, this.y2[3]));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - 2 * dd, this.y2[3] + this.gap, this.x2[2] - 3 * dd, this.y2[3] + this.gap));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x2[2] - 2 * dd , this.y2[3] + dd / 3));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[2] - 5 * dd / 2, this.y2[3] - dd / 2, this.x2[1] - 5 * dd / 2, this.y2[3], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[2] - 5 * dd / 2, this.y2[3] + this.gap + dd / 2, this.x2[2] - 5 * dd / 2, this.y2[3] + this.gap, 4, 4));
            } 
            double pod1 = (dd / 2) * Math.tan(Math.PI * this.vec[6] / 180.0D);
            int poi1 = (int)pod1;
            double pod11 = (dd / 8) * Math.tan(Math.PI * this.vec[6] / 180.0D);
            int poi11 = (int)pod11;
            //        g2d.drawLine(this.x2[5] + dd / 8, this.y2[5] - poi11, this.x2[5] + dd / 2, this.y2[5] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x2[5] + dd / 8, this.y2[5] - poi11, this.x2[5] + dd / 2, this.y2[5] - poi1));
            double pod2 = (dd / 2) * Math.tan(Math.PI * this.vec[8] / 180.0D);
            int poi2 = (int)pod2;
            double pod22 = (dd / 8) * Math.tan(Math.PI * this.vec[8] / 180.0D);
            int poi22 = (int)pod22;
            //        g2d.drawLine(this.x2[2] - dd / 8, this.y2[2] - poi22, this.x2[2] - dd / 2, this.y2[2] - poi2);
            this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - dd / 8, this.y2[2] - poi22, this.x2[2] - dd / 2, this.y2[2] - poi2));
            //         g2d.drawLine(this.x2[3] + this.face / 2, this.y2[3], this.x2[3] + this.face / 2, this.y2[7] + dd / 16);
            this.extraLineTegn.add(0, new ExtraLine(this.x2[3] + this.face / 2, this.y2[3], this.x2[3] + this.face / 2, this.y2[7] + dd / 16));
            if (angle != 90 && angle != 0) {
              double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi = (int)pod;
              double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi0 = (int)pod0;
              //         g2d.drawLine(this.x2[6] + dd / 4, this.y2[6] - dd / 4, this.x2[6] + dd / 4, this.y2[6] - dd);
              //         g2d.drawLine(this.x2[6] + dd / 4, this.y2[6] - dd / 4, this.x2[6] + dd, this.y2[6] - poi);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[6] + dd / 4, this.y2[6] - dd / 4, this.x2[6] + dd / 4, this.y2[6] - dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[6] + dd / 4, this.y2[6] - dd / 4, this.x2[6] + dd, this.y2[6] - poi));
            } else {
            	//        g2d.drawLine(this.x2[6] + dd / 4, this.y2[6] - dd / 4, this.x2[6] + dd, this.y2[6] - dd / 4);
            	//        g2d.drawLine(this.x2[6] + dd / 4, this.y2[6] - dd / 4, this.x2[6] + dd / 4, this.y2[6] - dd);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[6] + dd / 4, this.y2[6] - dd / 4, this.x2[6] + dd, this.y2[6] - dd / 4));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[6] + dd / 4, this.y2[6] - dd / 4, this.x2[6] + dd / 4, this.y2[6] - dd));
            } 
            if (this.face > 0) {
            	//       g2d.drawLine(this.x2[3], this.y2[3] + this.gap + this.tp1 + dd / 2, this.x2[3], this.y2[3] + this.gap + this.tp1 + dd);
            	//       g2d.drawLine(this.x2[4], this.y2[4] + this.gap + this.tp1 + dd / 2, this.x2[4], this.y2[4] + this.gap + this.tp1 + dd);
            	//       g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x2[3] + dd / 16, this.y2[3] + this.gap + this.tp1 + dd);
            	//       drawArrowLine(g2d, this.x2[3] - dd / 2, this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, this.x2[3], this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, 4, 4);
            	//       drawArrowLine(g2d, this.x2[4] + dd / 2, this.y2[4] + this.gap + this.tp1 + 3 * dd / 4, this.x2[4], this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[3], this.y2[3] + this.gap + this.tp1 + dd / 2, this.x2[3], this.y2[3] + this.gap + this.tp1 + dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[4], this.y2[4] + this.gap + this.tp1 + dd / 2, this.x2[4], this.y2[4] + this.gap + this.tp1 + dd));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x2[3] + dd / 16, this.y2[3] + this.gap + this.tp1 + 5*dd/4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[3] - dd / 2, this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, this.x2[3], this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[4] + dd / 2, this.y2[4] + this.gap + this.tp1 + 3 * dd / 4, this.x2[4], this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, 4, 4));
            } 
            if (this.vec[2] > 0) {
            	//        g2d.drawString("a" + this.vec[2], this.x2[1] - dd, this.y2[5] - dd / 4);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[2], this.x2[1] - dd, this.y2[5] - dd / 4));
            } 
            if (this.vec[3] > 0) {
            	//        g2d.drawString("a" + this.vec[3], this.x2[5] + dd, this.y2[5] - dd / 4);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[3], this.x2[5] + dd, this.y2[5] - dd / 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[12] == 4) {
          v1 = "2   ";
          int dd = this.fac * this.vec[5];
          //     g2d.drawString(v1, this.x3[4] - dd / 2, this.y3[4] + dd);
          //     g2d.drawLine(this.x3[3], this.y3[3], this.x3[3] - dd / 4, this.y3[3] + dd / 4);
          //      g2d.drawLine(this.x3[3] - dd / 4, this.y3[3] + dd / 4, this.x3[3] - dd / 2, this.y3[2]);
          //      g2d.drawLine(this.x3[3] - dd / 2, this.y3[3], this.x3[3] - 3 * dd / 4, this.y3[3] + dd / 4);
          //      g2d.drawLine(this.x3[3] - 3 * dd / 4, this.y3[3] + dd / 4, this.x2[0], this.y2[0]);
          this.extraTall.add(0, new ExtraTall(v1, this.x3[4] - dd / 2, this.y3[4] + dd/4));
          this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[3] - dd / 4, this.y3[3] + dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x3[3] - dd / 4, this.y3[3] + dd / 4, this.x3[3] - dd / 2, this.y3[2]));
          this.extraLine.add(0, new ExtraLine(this.x3[3] - dd / 2, this.y3[3], this.x3[3] - 3 * dd / 4, this.y3[3] + dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x3[3] - 3 * dd / 4, this.y3[3] + dd / 4, this.x2[0], this.y2[0]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(stroke);
            double xnede = (this.x3[1] - this.y3[2] / 2);
            int xnedei = (int)xnede;
            Path2D.Double curvYG2 = new Path2D.Double();
            QuadCurve2D.Double curveYG2 = new QuadCurve2D.Double(this.x3[2], (this.y3[2] - dd / 3), (this.x3[1] + dd), (this.y2[2] - dd), (this.x2[3] + 2 * dd), this.y2[3]);
            //       g2d.drawString(String.valueOf(this.vec[1]) + "°", this.x3[3] + dd / 2, this.y3[3] - dd / 2);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[1]) + "°", this.x3[3] + dd / 2, this.y3[3] - dd / 2));
            //      g2d.drawString("R" + this.vec[7], this.x2[3] + dd / 8, this.y2[2] - dd / 4);
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[7], this.x2[3] + dd / 16, this.y2[2] - dd / 4));
            Path2D.Double curvYG7 = new Path2D.Double();
            QuadCurve2D.Double curveYG7 = new QuadCurve2D.Double((this.x3[1] + dd / 2), this.y3[1], (this.x3[1] + dd / 1), (this.y3[1] + dd / 8), (this.x3[1] + dd / 2), this.y3[0]);
            //       g2d.drawString(String.valueOf(this.vec[6]) + "°", this.x3[1] + dd / 16, this.y3[1] - dd / 8);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[6]) + "°", this.x3[1] + dd / 16, this.y3[1] - dd / 8));
            g2d.setStroke(dashed);
            g2d.setStroke(thichness05);
            double pod1 = (dd / 2) * Math.tan(Math.PI * this.vec[6] / 180.0D);
            int poi1 = (int)pod1;
            double pod13 = (dd / 8) * Math.tan(Math.PI * this.vec[6] / 180.0D);
            int poi13 = (int)pod13;
            //       g2d.drawLine(this.x3[1] + dd / 8, this.y3[1] - poi13, this.x3[1] + dd / 2, this.y3[1] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x3[1] + dd / 8, this.y3[1] - poi13, this.x3[1] + dd / 2, this.y3[1] - poi1));
            if (this.gap > 0) {
            	//.drawLine(this.x2[2] - 3 * dd, this.y2[2], this.x2[2] - 2 * dd, this.y2[2]);
            	//         g2d.drawLine(this.x2[2] - 3 * dd, this.y2[2] + this.gap, this.x2[2] - 2 * dd, this.y2[2] + this.gap);
            	//.drawString((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x2[2] - 7 * dd / 2, this.y2[2] + dd / 3);
            	//       drawArrowLine(g2d, this.x2[2] - 5 * dd / 2, this.y2[2] - dd / 2, this.x2[2] - 5 * dd / 2, this.y2[2], 4, 4);
            	//       drawArrowLine(g2d, this.x2[2] - 5 * dd / 2, this.y2[2] + this.gap + dd / 2, this.x2[2] - 5 * dd / 2, this.y2[2] + this.gap, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - 3 * dd, this.y2[2], this.x2[2] - 2 * dd, this.y2[2]));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - 3 * dd, this.y2[2] + this.gap, this.x2[2] - 2 * dd, this.y2[2] + this.gap));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x2[2] - 4 * dd / 2, this.y2[2] + dd / 3));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[2] - 5 * dd / 2, this.y2[2] - dd / 2, this.x2[2] - 5 * dd / 2, this.y2[2], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[2] - 5 * dd / 2, this.y2[2] + this.gap + dd / 2, this.x2[2] - 5 * dd / 2, this.y2[2] + this.gap, 4, 4));
            } 
            if (angle != 90 && angle != 0) {
              double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi = (int)pod;
              double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi0 = (int)pod0;
              //        g2d.drawLine(this.x3[3] + dd / 4, this.y3[3] - dd / 4, this.x3[3] + dd / 4, this.y3[3] - dd);
              //  g2d.drawLine(this.x3[3] + dd / 4, this.y3[3] - dd / 4, this.x3[3] + dd, this.y3[3] - poi);
              this.extraLineTegn.add(0, new ExtraLine(this.x3[3] + dd / 4, this.y3[3] - dd / 4, this.x3[3] + dd / 4, this.y3[3] - dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x3[3] + dd / 4, this.y3[3] - dd / 4, this.x3[3] + dd, this.y3[3] - poi));
            } else {
            	//       g2d.drawLine(this.x3[3] + dd / 4, this.y3[3] - dd / 4, this.x3[3] + dd, this.y3[3] - dd / 4);
            	//      g2d.drawLine(this.x3[3] + dd / 4, this.y3[3] - dd / 4, this.x3[3] + dd / 4, this.y3[3] - dd);
              this.extraLineTegn.add(0, new ExtraLine(this.x3[3] + dd / 4, this.y3[3] - dd / 4, this.x3[3] + dd, this.y3[3] - dd / 4));
              this.extraLineTegn.add(0, new ExtraLine(this.x3[3] + dd / 4, this.y3[3] - dd / 4, this.x3[3] + dd / 4, this.y3[3] - dd));
            } 
            if (this.face > 0) {
            	//      g2d.drawLine(this.x2[3], this.y2[3] + this.gap + this.tp1 + dd / 2, this.x2[3], this.y2[3] + this.gap + this.tp1 + dd);
            	//       g2d.drawLine(this.x2[2], this.y2[2] + this.gap + this.tp1 + dd / 2, this.x2[2], this.y2[2] + this.gap + this.tp1 + dd);
            	//     g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x2[3] + dd / 16, this.y2[3] + this.gap + this.tp1 + dd);
            	//      drawArrowLine(g2d, this.x2[2] - dd / 2, this.y2[2] + this.gap + this.tp1 + 3 * dd / 4, this.x2[2], this.y2[2] + this.gap + this.tp1 + 3 * dd / 4, 4, 4);
            	//     drawArrowLine(g2d, this.x2[3] + dd / 2, this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, this.x2[3], this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x2[3], this.y2[3] + this.gap + this.tp1 + dd / 2, this.x2[3], this.y2[3] + this.gap + this.tp1 + dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x2[2], this.y2[2] + this.gap + this.tp1 + dd / 2, this.x2[2], this.y2[2] + this.gap + this.tp1 + dd));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x2[3] + dd / 16, this.y2[3] + this.gap + this.tp1 + 5*dd/4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[2] - dd / 2, this.y2[2] + this.gap + this.tp1 + 3 * dd / 4, this.x2[2], this.y2[2] + this.gap + this.tp1 + 3 * dd / 4, 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x2[3] + dd / 2, this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, this.x2[3], this.y2[3] + this.gap + this.tp1 + 3 * dd / 4, 4, 4));
            } 
            if (this.vec[2] > 0) {
            	//       g2d.drawString("a" + this.vec[2], this.x2[1] - dd / 2, this.y2[2] - dd / 4);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[2], this.x2[1] - dd / 2, this.y2[2] - dd / 4));
            } 
            if (this.vec[3] > 0) {
            	//        g2d.drawString("a" + this.vec[3], this.x2[5] + 3 * dd / 2, this.y2[2] - dd / 4);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[3], this.x2[5] + 3 * dd / 2, this.y2[2] - dd / 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[12] == 5) {
          v1 = "2   ";
          int dd = this.fac * this.vec[5];
          // g2d.drawString(v1, dd / 4, this.y3[0] + dd);
          //      g2d.drawLine(this.x3[0], this.y3[0], this.x3[0] - dd / 4, this.y3[0] + dd / 4);
          //     g2d.drawLine(this.x3[0] - dd / 4, this.y3[0] + dd / 4, this.x3[0] - dd / 2, this.y3[0]);
          //       g2d.drawLine(this.x3[0] - dd / 2, this.y3[0], this.x3[0] - 3 * dd / 4, this.y3[0] + dd / 4);
          //      g2d.drawLine(this.x3[0] - 3 * dd / 4, this.y3[0] + dd / 4, this.x2[0], this.y2[0]);
          this.extraTall.add(0, new ExtraTall(v1, dd / 4, this.y3[0] + dd/4));
          this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[0] - dd / 4, this.y3[0] + dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x3[0] - dd / 4, this.y3[0] + dd / 4, this.x3[0] - dd / 2, this.y3[0]));
          this.extraLine.add(0, new ExtraLine(this.x3[0] - dd / 2, this.y3[0], this.x3[0] - 3 * dd / 4, this.y3[0] + dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x3[0] - 3 * dd / 4, this.y3[0] + dd / 4, this.x2[0], this.y2[0]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(stroke);
            double xnede = (this.x3[2] - this.y3[1] / 2);
            int xnedei = (int)xnede;
            Path2D.Double curvYG2 = new Path2D.Double();
            QuadCurve2D.Double curveYG2 = new QuadCurve2D.Double(this.x3[1], this.y3[1], (this.x3[1] + dd), (this.y3[1] / 2), xnedei, this.y4[1]);
            //       g2d.drawString(String.valueOf(this.vec[1]) + "°", this.x3[1] + dd / 2, this.y3[1] - dd / 2);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[1]) + "°", this.x3[1] + dd / 2, this.y3[1] - dd / 2));
            Path2D.Double curvYG70 = new Path2D.Double();
            QuadCurve2D.Double curveYG70 = new QuadCurve2D.Double(this.x3[2], this.y3[2], (this.x3[2] + dd / 16), (this.y3[2] + dd / 16), this.x3[2], this.y3[3]);
            //      g2d.drawString(String.valueOf(this.vec[8]) + "°", this.x2[2] - dd / 4, this.y2[3] - dd / 2);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[8]) + "°", this.x2[2] - dd / 2, this.y3[2] - dd / 2));
            Path2D.Double curvYG9 = new Path2D.Double();
            QuadCurve2D.Double curveYG9 = new QuadCurve2D.Double(this.x2[2], this.y2[2], (this.x2[2] - dd / 16), (this.y2[2] + dd / 16), this.x2[2], this.y2[3]);
            // g2d.drawString(String.valueOf(this.vec[6]) + "°", this.x3[2] + dd / 8, this.y3[2] - dd / 2);
            //       g2d.drawString("R" + this.vec[9], this.x4[1] + dd / 8, this.y4[1] - dd / 4);
            //      g2d.drawString("R" + this.vec[7], this.x4[0] - dd / 4, this.y4[0] - dd / 4);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[6]) + "°", this.x3[2] + dd / 8, this.y3[2] - dd / 2));
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[9], this.x4[1] + dd / 8, this.y4[1] - dd / 4));
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[7], this.x4[0] - dd / 4, this.y4[0] - dd / 4));
            g2d.setStroke(dashed);
            g2d.setStroke(thichness05);
            double pod1 = (dd / 2) * Math.tan(Math.PI * this.vec[6] / 180.0D);
            int poi1 = (int)pod1;
            double pod14 = (dd / 8) * Math.tan(Math.PI * this.vec[6] / 180.0D);
            int poi14 = (int)pod14;
            //       g2d.drawLine(this.x3[2] + dd / 8, this.y3[2] - poi14, this.x3[2] + dd / 2, this.y3[2] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x3[2] + dd / 8, this.y3[2] - poi14, this.x3[2] + dd / 2, this.y3[2] - poi1));
            double pod2 = (dd / 2) * Math.tan(Math.PI * this.vec[8] / 180.0D);
            int poi2 = (int)pod2;
            double pod24 = (dd / 8) * Math.tan(Math.PI * this.vec[8] / 180.0D);
            int poi24 = (int)pod24;
            //       g2d.drawLine(this.x2[2] - dd / 8, this.y2[2] - poi24, this.x2[2] - dd / 2, this.y2[2] - poi2);
            this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - dd / 8, this.y2[2] - poi24, this.x2[2] - dd / 2, this.y2[2] - poi2));
            //       g2d.drawLine(this.x4[0] + this.face / 2, this.y4[0], this.x4[0] + this.face / 2, this.y4[0] - dd);
            this.extraLineTegn.add(0, new ExtraLine(this.x4[0] + this.face / 2, this.y4[0], this.x4[0] + this.face / 2, this.y4[0] - dd));
            if (this.gap > 0) {
            	//        g2d.drawLine(this.x4[0] - 3 * dd, this.y4[0], this.x4[0] - 2 * dd, this.y4[0]);
            	//       g2d.drawLine(this.x4[0] - 3 * dd, this.y4[0] + this.gap, this.x4[0] - 2 * dd, this.y4[0] + this.gap);
            	//       g2d.drawString((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x4[0] - 3 * dd - dd / 4, this.y4[0] + dd / 3);
            	//       drawArrowLine(g2d, this.x4[0] - 5 * dd / 2, this.y4[0] - dd / 2, this.x4[0] - 5 * dd / 2, this.y4[0], 4, 4);
            	//       drawArrowLine(g2d, this.x4[1] - 5 * dd / 2, this.y4[1] + this.gap + dd / 2, this.x4[1] - 5 * dd / 2, this.y4[1] + this.gap, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x4[0] - 3 * dd, this.y4[0], this.x4[0] - 2 * dd, this.y4[0]));
              this.extraLineTegn.add(0, new ExtraLine(this.x4[0] - 3 * dd, this.y4[0] + this.gap, this.x4[0] - 2 * dd, this.y4[0] + this.gap));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap / 2))).toString(), this.x4[0] - 2 * dd , this.y4[0] + dd / 3));
              this.extraArrayTegn.add(0, new ExtraArray(this.x4[0] - 5 * dd / 2, this.y4[0] - dd / 2, this.x4[0] - 5 * dd / 2, this.y4[0], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x4[1] - 5 * dd / 2, this.y4[1] + this.gap + dd / 2, this.x4[1] - 5 * dd / 2, this.y4[1] + this.gap, 4, 4));
            } 
            if (angle != 90 && angle != 0) {
              double pod = dd * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi = (int)pod;
              double pod0 = (dd / 4) * Math.tan(Math.PI * (90 - angle) / 180.0D);
              int poi0 = (int)pod0;
              //      g2d.drawLine(this.x3[1] + dd / 4, this.y3[1] - dd / 4, this.x3[1] + dd / 4, this.y3[1] - dd);
              //     g2d.drawLine(this.x3[1] + dd / 4, this.y3[1] - dd / 4, this.x3[1] + dd, this.y3[1] - poi);
              this.extraLineTegn.add(0, new ExtraLine(this.x3[1] + dd / 4, this.y3[1] - dd / 4, this.x3[1] + dd / 4, this.y3[1] - dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x3[1] + dd / 4, this.y3[1] - dd / 4, this.x3[1] + dd, this.y3[1] - poi));
            } else {
            	//     g2d.drawLine(this.x3[1] + dd / 4, this.y3[1] - dd / 4, this.x3[1] + dd, this.y3[1] - dd / 4);
            	//      g2d.drawLine(this.x3[1] + dd / 4, this.y3[1] - dd / 4, this.x3[1] + dd / 4, this.y3[1] - dd);
              this.extraLineTegn.add(0, new ExtraLine(this.x3[1] + dd / 4, this.y3[1] - dd / 4, this.x3[1] + dd, this.y3[1] - dd / 4));
              this.extraLineTegn.add(0, new ExtraLine(this.x3[1] + dd / 4, this.y3[1] - dd / 4, this.x3[1] + dd / 4, this.y3[1] - dd));
            } 
            if (this.face > 0) {
            	//     g2d.drawLine(this.x4[0], this.y4[0] + this.gap + this.tp1 + dd / 2, this.x4[0], this.y4[0] + this.gap + this.tp1 + dd);
            	//      g2d.drawLine(this.x4[1], this.y4[1] + this.gap + this.tp1 + dd / 2, this.x4[1], this.y4[1] + this.gap + this.tp1 + dd);
            	//        g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x4[0] + dd / 16, this.y4[0] + this.gap + this.tp1 + dd);
            	//       drawArrowLine(g2d, this.x4[0] - dd / 2, this.y4[0] + this.gap + this.tp1 + 3 * dd / 4, this.x4[0], this.y4[0] + this.gap + this.tp1 + 3 * dd / 4, 4, 4);
            	//       drawArrowLine(g2d, this.x4[1] + dd / 2, this.y4[1] + this.gap + this.tp1 + 3 * dd / 4, this.x4[1], this.y4[1] + this.gap + this.tp1 + 3 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x4[0], this.y4[0] + this.gap + this.tp1 + dd / 2, this.x4[0], this.y4[0] + this.gap + this.tp1 + dd));
              this.extraLineTegn.add(0, new ExtraLine(this.x4[1], this.y4[1] + this.gap + this.tp1 + dd / 2, this.x4[1], this.y4[1] + this.gap + this.tp1 + dd));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x4[0] + dd / 16, this.y4[0] + this.gap + this.tp1 + 5*dd/4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x4[0] - dd / 2, this.y4[0] + this.gap + this.tp1 + 3 * dd / 4, this.x4[0], this.y4[0] + this.gap + this.tp1 + 3 * dd / 4, 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x4[1] + dd / 2, this.y4[1] + this.gap + this.tp1 + 3 * dd / 4, this.x4[1], this.y4[1] + this.gap + this.tp1 + 3 * dd / 4, 4, 4));
            } 
            if (this.vec[2] > 0) {
            	//     g2d.drawString("a" + this.vec[2], this.x2[1] - dd, this.y2[2] - dd / 4);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[2], this.x2[1] - dd, this.y2[2] - dd / 4));
            } 
            if (this.vec[3] > 0) {
            	//   g2d.drawString("a" + this.vec[3], this.x2[5] + 3 * dd / 2, this.y2[5] - dd / 4);
              this.extraTallTegn.add(0, new ExtraTall("a" + this.vec[3], this.x2[5] + 3 * dd / 2, this.y2[5] - dd / 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
      } 
      
      if (this.plotType.equals("Butt") || this.plotType.equals("butt")) {
        int dd = this.fac * this.vec[2];
        String v1 = "1   ";
        if ( !plotOK) {
        	g2d.setColor(Color.RED);
        	g2d.drawString("Impossible value combination", -110, 30);
        	g2d.setColor(Color.BLACK);
         	plotOK =  true;
        }
        if (this.vec[9] == 1) {
        	 //        g2d.drawString(v1, this.x1[3] + dd / 4, this.y1[3] - dd / 2);
        	 //         g2d.drawLine(this.x1[3], this.y1[3], this.x1[3] + dd / 4, this.y1[3] - dd / 4);
        	 //         g2d.drawLine(this.x1[3] + dd / 4, this.y1[3] - dd / 4, this.x1[3], this.y1[3] - dd / 2);
        	 //        g2d.drawLine(this.x1[3], this.y1[3] - dd / 2, this.x1[3] + dd / 4, this.y1[3] - 3 * dd / 4);
        	 //        g2d.drawLine(this.x1[3] + dd / 4, this.y1[3] - 3 * dd / 4, this.x1[0], this.y1[0]);
          this.extraTall.add(0, new ExtraTall(v1, this.x1[3] + dd / 4, this.y1[3] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3], this.x1[3] + dd / 4, this.y1[3] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x1[3] + dd / 4, this.y1[3] - dd / 4, this.x1[3], this.y1[3] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x1[3], this.y1[3] - dd / 2, this.x1[3] + dd / 4, this.y1[3] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x1[3] + dd / 4, this.y1[3] - 3 * dd / 4, this.x1[0], this.y1[0]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(thichness05);
            if (this.gap > 0) {
            	 //         g2d.drawLine(this.x1[1], this.y1[1] + 3 * dd / 2, this.x1[1], this.y1[1] + 2 * dd);
            	 //          drawArrowLine(g2d, this.x1[1] - dd / 2, this.y1[1] + 7 * dd / 4, this.x1[1], this.y1[1] + 7 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x1[1], this.y1[1] + 3 * dd / 2, this.x1[1], this.y1[1] + 2 * dd));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[1] - dd / 2, this.y1[1] + 7 * dd / 4, this.x1[1], this.y1[1] + 7 * dd / 4, 4, 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[9] == 2) {
        	 //       g2d.drawString(v1, this.x1[0] + dd / 4, this.y1[0] - dd / 2);
        	 //      g2d.drawLine(this.x1[0], this.y1[0], this.x1[0] + dd / 4, this.y1[0] - dd / 4);
        	 //       g2d.drawLine(this.x1[0] + dd / 4, this.y1[0] - dd / 4, this.x1[0], this.y1[0] - dd / 2);
        	 //       g2d.drawLine(this.x1[0], this.y1[0] - dd / 2, this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4);
        	 //       g2d.drawLine(this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4, this.x1[7], this.y1[7]);
          this.extraTall.add(0, new ExtraTall(v1, this.x1[0] + dd / 4, this.y1[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[0] + dd / 4, this.y1[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x1[0] + dd / 4, this.y1[0] - dd / 4, this.x1[0], this.y1[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0] - dd / 2, this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4, this.x1[7], this.y1[7]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(stroke);
                    
       //     g2d.drawString(String.valueOf(this.vec[3]) + "°", this.x1[3] - dd / 2, this.y1[3] - dd / 4);
            this.extraTallTegn.add(0, new ExtraTall(String.valueOf(this.vec[3]) + "°", this.x1[3] - dd / 1, this.y1[3] - dd / 4));
            Path2D.Double curvYG = new Path2D.Double();
            QuadCurve2D.Double curveYG = new QuadCurve2D.Double(this.x9[0], this.y9[0], this.x9[4], this.y9[4], this.x9[3], this.y9[0]);
            g2d.setStroke(thichness05);
            double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi1 = (int)pod1;
            double pod0 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi0 = (int)pod0;
            //        g2d.drawLine(this.x1[3] - dd / 8, this.y1[3] - poi0, this.x1[3] - dd / 2, this.y1[3] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x1[3] - dd / 8, this.y1[3] - poi0, this.x1[3] - dd / 2, this.y1[3] - poi1));
            this.x11[0] = this.x1[3] - dd / 2;
            this.y11[0] = this.y1[3] - dd;
            if (this.gap > 0) {
            	 //          g2d.drawLine(this.x1[1], this.y1[1] + dd, this.x1[1], this.y1[1] + dd / 2);
            	 //         drawArrowLine(g2d, this.x1[1] - dd / 2, this.y1[1] + 3 * dd / 4, this.x1[1], this.y1[1] + 3 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x1[1], this.y1[1] + dd, this.x1[1], this.y1[1] + dd / 2));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[1] - dd / 2, this.y1[1] + 3 * dd / 4, this.x1[1], this.y1[1] + 3 * dd / 4, 4, 4));

            } 
            if (this.face > 0) {
            	 //         g2d.drawLine(this.x1[0] - dd / 4, this.y1[0], this.x1[0] - 3 * dd / 4, this.y1[0]);
            	 //        g2d.drawLine(this.x1[0] - dd / 4, this.y1[2], this.x1[0] - 3 * dd / 4, this.y1[2]);
            	 //          g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x1[0] - dd, this.y1[0] + dd / 16);
            	 //        drawArrowLine(g2d, this.x1[0] - dd / 2, this.y1[2] - dd / 2, this.x1[0] - dd / 2, this.y1[2], 4, 4);
            	 //        drawArrowLine(g2d, this.x1[0] - dd / 2, this.y1[0] + dd / 2, this.x1[0] - dd / 2, this.y1[0], 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - dd / 4, this.y1[0], this.x1[0] - 3 * dd / 4, this.y1[0]));
              this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - dd / 4, this.y1[2], this.x1[0] - 3 * dd / 4, this.y1[2]));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x1[0] - dd, this.y1[0] + dd / 16));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] - dd / 2, this.y1[2] - dd / 2, this.x1[0] - dd / 2, this.y1[2], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] - dd / 2, this.y1[0] + dd / 2, this.x1[0] - dd / 2, this.y1[0], 4, 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[9] == 3) {
        	 //      g2d.drawString(v1, this.x1[0] + dd / 4, this.y1[0] - dd / 2);
        	 //        g2d.drawLine(this.x1[0], this.y1[0], this.x1[0] + dd / 4, this.y1[0] - dd / 4);
        	 //        g2d.drawLine(this.x1[0] + dd / 4, this.y1[0] - dd / 4, this.x1[0], this.y1[0] - dd / 2);
        	 //      g2d.drawLine(this.x1[0], this.y1[0] - dd / 2, this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4);
        	 //        g2d.drawLine(this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4, this.x1[7], this.y1[7]);
          this.extraTall.add(0, new ExtraTall(v1, this.x1[0] + dd / 4, this.y1[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[0] + dd / 4, this.y1[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x1[0] + dd / 4, this.y1[0] - dd / 4, this.x1[0], this.y1[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0] - dd / 2, this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4, this.x1[7], this.y1[7]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(stroke);
            //       g2d.drawString(this.vec[3] + "°", this.x9[0] - dd / 2, this.y9[8] + dd / 4);
            //      g2d.drawString(this.vec[5] + "°", this.x9[2] - dd / 2, this.y9[3] - dd / 6);
            this.extraTallTegn.add(0, new ExtraTall(this.vec[3] + "°", this.x9[0] - dd / 1, this.y9[8] + dd / 4));
            this.extraTallTegn.add(0, new ExtraTall(this.vec[5] + "°", this.x9[2] - dd / 1, this.y9[3] - dd / 6));
            Path2D.Double curvYG = new Path2D.Double();
            QuadCurve2D.Double curveYG = new QuadCurve2D.Double(this.x9[2], this.y9[2], this.x9[11], (this.y9[11] - dd / 4), this.x9[6], this.y9[2]);
            Path2D.Double curvYg = new Path2D.Double();
            QuadCurve2D.Double curveYg = new QuadCurve2D.Double(this.x9[0], this.y9[0], this.x9[8], (this.y9[8] + dd / 4), this.x9[5], this.y9[0]);
            this.x11[1] = this.x9[0] - dd / 2;
            this.y11[1] = this.y9[0] - dd;
            this.x11[2] = this.x9[2] - dd / 2;
            this.y11[2] = this.y9[2] + dd;
            g2d.setStroke(thichness05);
            double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi1 = (int)pod1;
            double pod0 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi0 = (int)pod0;
            //       g2d.drawLine(this.x1[4] - dd / 8, this.y1[4] - poi0, this.x1[4] - dd / 2, this.y1[4] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x1[4] - dd / 8, this.y1[4] - poi0, this.x1[4] - dd / 2, this.y1[4] - poi1));
            double pod2 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[5]) / 180.0D);
            int poi2 = (int)pod2;
            double pod20 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[5]) / 180.0D);
            int poi20 = (int)pod20;
            //         g2d.drawLine(this.x1[1] - dd / 8, this.y1[1] + poi20, this.x1[1] - dd / 2, this.y1[1] + poi2);
            this.extraLineTegn.add(0, new ExtraLine(this.x1[1] - dd / 8, this.y1[1] + poi20, this.x1[1] - dd / 2, this.y1[1] + poi2));
            //         g2d.drawLine(this.x1[2], this.y1[2] - this.face / 2, this.x1[0], this.y1[2] - this.face / 2);
            this.extraLineTegn.add(0, new ExtraLine(this.x1[2], this.y1[2] - this.face / 2, this.x1[0], this.y1[2] - this.face / 2));
            g2d.setStroke(thichness05);
            if (this.gap > 0) {
            	 // .drawLine(this.x1[2], this.y1[2] + 3 * dd / 2, this.x1[2], this.y1[2] + dd);
            	 //       drawArrowLine(g2d, this.x1[2] - dd / 2, this.y1[2] + 5 * dd / 4, this.x1[2], this.y1[2] + 5 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x1[2], this.y1[2] + 3 * dd / 2 - 2 , this.x1[2], this.y1[2] + dd  - 2));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[2] - dd / 2, this.y1[2] + 5 * dd / 4 -2, this.x1[2], this.y1[2] + 5 * dd / 4 - 2, 4, 4));
            } 
            if (this.face > 0) {
            	 //       g2d.drawLine(this.x1[0] - dd / 4, this.y1[2], this.x1[0] - 3 * dd / 4, this.y1[2]);
            	 //        g2d.drawLine(this.x1[0] - dd / 4, this.y1[3], this.x1[0] - 3 * dd / 4, this.y1[3]);
            	 //          g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x1[0] - dd, this.y1[2] + dd / 16);
            	 //         drawArrowLine(g2d, this.x1[0] - dd / 2, this.y1[3] - dd / 2, this.x1[0] - dd / 2, this.y1[3], 4, 4);
            	 //         drawArrowLine(g2d, this.x1[0] - dd / 2, this.y1[2] + dd / 2, this.x1[0] - dd / 2, this.y1[2], 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - dd / 4, this.y1[2], this.x1[0] - 3 * dd / 4, this.y1[2]));
              this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - dd / 4, this.y1[3], this.x1[0] - 3 * dd / 4, this.y1[3]));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x1[0] - dd, this.y1[2] + dd / 16));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] - dd / 2, this.y1[3] - dd / 2, this.x1[0] - dd / 2, this.y1[3], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] - dd / 2, this.y1[2] + dd / 2, this.x1[0] - dd / 2, this.y1[2], 4, 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[9] == 4) {
        	 //      g2d.drawString(v1, this.x1[0] + dd / 4, this.y1[0] - dd / 2);
        	 //       g2d.drawLine(this.x1[0], this.y1[0], this.x1[0] + dd / 4, this.y1[0] - dd / 4);
        	 //        g2d.drawLine(this.x1[0] + dd / 4, this.y1[0] - dd / 4, this.x1[0], this.y1[0] - dd / 2);
        	 //       g2d.drawLine(this.x1[0], this.y1[0] - dd / 2, this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4);
        	 //      g2d.drawLine(this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4, this.x2[0], this.y2[0]);
          this.extraTall.add(0, new ExtraTall(v1, this.x1[0] + dd / 4, this.y1[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0], this.x1[0] + dd / 4, this.y1[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x1[0] + dd / 4, this.y1[0] - dd / 4, this.x1[0], this.y1[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x1[0], this.y1[0] - dd / 2, this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x1[0] + dd / 4, this.y1[0] - 3 * dd / 4, this.x2[0], this.y2[0]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(stroke);
            //          g2d.drawString(this.vec[3] + "°", this.x2[1] - dd / 2, this.y2[1] - dd / 4);
            this.extraTallTegn.add(0, new ExtraTall(this.vec[3] + "°", this.x2[1] - dd / 1, this.y2[1] - dd / 4));
            //        g2d.drawString("R" + this.vec[4], this.x1[3] - dd / 2, this.y1[3] - dd / 8);
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[4], this.x1[3] - dd / 2, this.y1[3] - dd / 8));
            Path2D.Double curvYG = new Path2D.Double();
            QuadCurve2D.Double curveYG = new QuadCurve2D.Double(this.x9[4], this.y9[4], this.x9[6], (this.y9[6] + dd / 8), this.x9[5], this.y9[5]);
            g2d.setStroke(thichness05);
            double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi1 = (int)pod1;
            double pod0 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi0 = (int)pod0;
            //       g2d.drawLine(this.x2[1] - dd / 8, this.y2[1] - poi0, this.x2[1] - dd / 2, this.y2[1] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x2[1] - dd / 8, this.y2[1] - poi0, this.x2[1] - dd / 2, this.y2[1] - poi1));
            this.x11[3] = this.x2[1] - dd / 2;
            this.y11[3] = this.y2[1] - dd;
            if (this.gap > 0) {
            	 //        g2d.drawLine(this.x1[1], this.y1[1] + dd, this.x1[1], this.y1[1] + dd / 2);
            	 //         drawArrowLine(g2d, this.x1[1] - dd / 2, this.y1[1] + 3 * dd / 4, this.x1[1], this.y1[1] + 3 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x1[1], this.y1[1] + dd, this.x1[1], this.y1[1] + dd / 2));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[1] - dd / 2, this.y1[1] + 3 * dd / 4, this.x1[1], this.y1[1] + 3 * dd / 4, 4, 4));
            } 
            if (this.face > 0) {
            	 //           g2d.drawLine(this.x1[0] - dd / 4, this.y1[0], this.x1[0] - 3 * dd / 4, this.y1[0]);
            	 // .drawLine(this.x1[0] - dd / 4, this.y1[2], this.x1[0] - 3 * dd / 4, this.y1[2]);
            	 //         g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x1[0] - dd, this.y1[0] + dd / 16);
            	 //          drawArrowLine(g2d, this.x1[0] - dd / 2, this.y1[2] - dd / 2, this.x1[0] - dd / 2, this.y1[2], 4, 4);
            	 //        drawArrowLine(g2d, this.x1[0] - dd / 2, this.y1[0] + dd / 2, this.x1[0] - dd / 2, this.y1[0], 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - dd / 4, this.y1[0], this.x1[0] - 3 * dd / 4, this.y1[0]));
              this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - dd / 4, this.y1[2], this.x1[0] - 3 * dd / 4, this.y1[2]));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x1[0] - dd, this.y1[0] + dd / 16));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] - dd / 2, this.y1[2] - dd / 2, this.x1[0] - dd / 2, this.y1[2], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] - dd / 2, this.y1[0] + dd / 2, this.x1[0] - dd / 2, this.y1[0], 4, 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[9] == 5) {
        	 //       g2d.drawString(v1, this.x2[0] + dd / 4, this.y2[0] - dd / 2);
        	 //       g2d.drawLine(this.x2[0], this.y2[0], this.x2[0] + dd / 4, this.y2[0] - dd / 4);
        	 //       g2d.drawLine(this.x2[0] + dd / 4, this.y2[0] - dd / 4, this.x2[0], this.y2[0] - dd / 2);
        	 //         g2d.drawLine(this.x2[0], this.y2[0] - dd / 2, this.x2[0] + dd / 4, this.y2[0] - 3 * dd / 4);
        	 //       g2d.drawLine(this.x2[0] + dd / 4, this.y2[0] - 3 * dd / 4, this.x1[0], this.y1[0]);
          this.extraTall.add(0, new ExtraTall(v1, this.x2[0] + dd / 4, this.y2[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[0] + dd / 4, this.y2[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x2[0] + dd / 4, this.y2[0] - dd / 4, this.x2[0], this.y2[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0] - dd / 2, this.x2[0] + dd / 4, this.y2[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x2[0] + dd / 4, this.y2[0] - 3 * dd / 4, this.x1[0], this.y1[0]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(stroke);
            //       g2d.drawString("R" + this.vec[4], this.x3[1] - dd / 2, this.y3[1] - dd / 5);
            //       g2d.drawString("R" + this.vec[6], this.x3[0] - dd / 2, this.y3[0] + dd / 5);
            // .drawString(this.vec[3] + "°", this.x2[2] - dd / 2, this.y9[6]);
            //          g2d.drawString(this.vec[5] + "°", this.x1[2] - dd / 2, this.y1[2] + 5 * dd / 4);
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[4], this.x3[1] - dd / 2, this.y3[1] - dd / 5));
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[6], this.x3[0] - dd / 2, this.y3[0] + dd / 5));
            this.extraTallTegn.add(0, new ExtraTall(this.vec[3] + "°", this.x2[2] - dd / 1, this.y9[6]));
            this.extraTallTegn.add(0, new ExtraTall(this.vec[5] + "°", this.x1[2] - dd / 1, this.y1[2] + 5 * dd / 4));
            Path2D.Double curvYG = new Path2D.Double();
            QuadCurve2D.Double curveYG = new QuadCurve2D.Double(this.x1[2], this.y9[4], this.x1[3], (this.y9[6] + dd / 16), this.x3[1], this.y9[5]);
            this.x11[4] = this.x1[2] - dd / 2;
            this.y11[4] = this.y1[2] - dd;
            this.x11[5] = this.x2[2] - dd / 2;
            this.y11[5] = this.y2[2] + dd;
            Path2D.Double curvYH = new Path2D.Double();
            QuadCurve2D.Double curveYH = new QuadCurve2D.Double(this.x2[2], this.y2[2], ((this.x2[2] + this.x3[1]) / 2), (this.y2[2] + 10), this.x3[1], this.y2[2]);
            g2d.setStroke(thichness05);
            double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi1 = (int)pod1;
            double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi10 = (int)pod10;
            //         g2d.drawLine(this.x2[2] - dd / 8, this.y2[2] + poi10, this.x2[2] - dd / 2, this.y2[2] + poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x2[2] - dd / 8, this.y2[2] + poi10, this.x2[2] - dd / 2, this.y2[2] + poi1));
            double pod2 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[5]) / 180.0D);
            int poi2 = (int)pod2;
            double pod20 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[5]) / 180.0D);
            int poi20 = (int)pod20;
            //           g2d.drawLine(this.x1[2] - dd / 8, this.y1[2] - poi20, this.x1[2] - dd / 2, this.y1[2] - poi2);
            this.extraLineTegn.add(0, new ExtraLine(this.x1[2] - dd / 8, this.y1[2] - poi20, this.x1[2] - dd / 2, this.y1[2] - poi2));
            //       g2d.drawLine(this.x3[0], this.y3[0] + this.face / 2, this.x1[0], this.y3[0] + this.face / 2);
            this.extraLineTegn.add(0, new ExtraLine(this.x3[0], this.y3[0] + this.face / 2, this.x1[0], this.y3[0] + this.face / 2));
            if (this.gap > 0) {
            	 //         g2d.drawLine(this.x3[0], this.y3[0] + 3 * dd / 2, this.x3[0], this.y3[0] + dd);
            	 //         drawArrowLine(g2d, this.x3[0] - dd / 2, this.y3[0] + 5 * dd / 4, this.x3[0], this.y3[0] + 5 * dd / 4, 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x3[0], this.y3[0] + 3 * dd / 2 +2, this.x3[0], this.y3[0] + dd + 2));
              this.extraArrayTegn.add(0, new ExtraArray(this.x3[0] - dd / 2, this.y3[0] + 5 * dd / 4 + 2, this.x3[0], this.y3[0] + 5 * dd / 4 + 2, 4, 4));
            } 
            if (this.face > 0) {
            	 //         g2d.drawLine(this.x1[0] - dd / 4, this.y3[0], this.x1[0] - 3 * dd / 4, this.y3[0]);
            	 //       g2d.drawLine(this.x1[0] - dd / 4, this.y3[2], this.x1[0] - 3 * dd / 4, this.y3[2]);
            	 //        g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x1[0] - dd, this.y3[0] + dd / 16);
            	 //         drawArrowLine(g2d, this.x1[0] - dd / 2, this.y3[2] - dd / 2, this.x1[0] - dd / 2, this.y3[0], 4, 4);
            	 //          drawArrowLine(g2d, this.x1[0] - dd / 2, this.y3[0] + dd / 2, this.x1[0] - dd / 2, this.y3[1], 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - dd / 4, this.y3[0], this.x1[0] - 3 * dd / 4, this.y3[0]));
              this.extraLineTegn.add(0, new ExtraLine(this.x1[0] - dd / 4, this.y3[2], this.x1[0] - 3 * dd / 4, this.y3[2]));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x1[0] - dd, this.y3[0] + dd / 16));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] - dd / 2, this.y3[2] - dd / 2, this.x1[0] - dd / 2, this.y3[0], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x1[0] - dd / 2, this.y3[0] + dd / 2, this.x1[0] - dd / 2, this.y3[1], 4, 4));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
      } 
      if (this.plotType.equals("butt")) {
        int dd = this.fac * this.vec[14];
        String v1 = "2   ";
        if (this.vec[21] == 1) {
        	 //        g2d.drawString(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2);
        	 //          g2d.drawLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4);
        	 //        g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2);
        	 //        g2d.drawLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4);
        	 //     g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x5[7], this.y5[7]);
          this.extraTall.add(0, new ExtraTall(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x5[7], this.y5[7]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(thichness05);
            if (this.gap > 0) {
              int f = -this.forvs + this.forhs;
              if (f > 0)
                f = -f; 
              //         g2d.drawLine(this.x5[1], this.y5[1] + dd / 2 + f, this.x5[1], this.y5[1] + 1 * dd);
              //               g2d.drawString((new StringBuilder(String.valueOf(this.gap))).toString(), this.x5[1], this.y5[1] + 3 * dd / 2);
              this.extraLineTegn.add(0, new ExtraLine(this.x5[1], this.y5[1] + dd / 2 + f, this.x5[1], this.y5[1] + 1 * dd));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[1] + dd / 2, this.y5[1] + 3 * dd / 4 + f, this.x5[1], this.y5[1] + 3 * dd / 4 + f, 4, 4));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap))).toString(), this.x5[1], this.y5[1] +  5*dd/4 ));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[21] == 2) {
        	 //        g2d.drawString(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2);
        	 //         g2d.drawLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4);
        	 //       g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2);
        	 //       g2d.drawLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4);
        	 //       g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x5[7], this.y5[7]);
          this.extraTall.add(0, new ExtraTall(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x5[7], this.y5[7]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            //      g2d.drawString(this.vec[15] + "°", this.x5[2] + dd, this.y5[3] - dd / 4);
            this.extraTallTegn.add(0, new ExtraTall(this.vec[15] + "°", this.x5[2] + dd, this.y5[3] - dd / 4));
            g2d.setStroke(thichness05);
            double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi1 = (int)pod1;
            double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[3]) / 180.0D);
            int poi10 = (int)pod10;
            //          g2d.drawLine(this.x5[3] + dd / 8, this.y5[3] - poi10, this.x5[3] + dd / 2, this.y5[3] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x5[3] + dd / 8, this.y5[3] - poi10, this.x5[3] + dd / 2, this.y5[3] - poi1));
            this.x11[6] = this.x5[3] + dd / 2;
            this.y11[6] = this.y5[3] - dd;
            if (this.gap > 0) {
            	 //           g2d.drawLine(this.x5[1], this.y5[1] + dd / 2, this.x5[1], this.y5[1] + 1 * dd);
            	 //       drawArrowLine(g2d, this.x5[1] + dd / 2, this.y5[1] + 3 * dd / 4, this.x5[1], this.y5[1] + 3 * dd / 4, 4, 4);
            	 //        g2d.drawString((new StringBuilder(String.valueOf(this.gap))).toString(), this.x5[1], this.y5[1] + 3 * dd / 2);
              this.extraLineTegn.add(0, new ExtraLine(this.x5[1], this.y5[1] + dd / 2, this.x5[1], this.y5[1] + 1 * dd));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap))).toString(), this.x5[1], this.y5[1] + 5 * dd / 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[1] + dd / 2, this.y5[1] + 3 * dd / 4, this.x5[1], this.y5[1] + 3 * dd / 4, 4, 4));
            } 
            if (this.faceR > 0) {
            	 //         g2d.drawLine(this.x5[0] + dd / 4, this.y5[0], this.x5[0] + 3 * dd / 4, this.y5[0]);
            	 //        g2d.drawLine(this.x5[0] + dd / 4, this.y5[2], this.x5[0] + 3 * dd / 4, this.y5[2]);
            	 //        g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x5[0] + dd, this.y5[0] + dd / 16);
            	 //       drawArrowLine(g2d, this.x5[0] + dd / 2, this.y5[2] - dd / 2, this.x5[0] + dd / 2, this.y5[2], 4, 4);
            	 //       drawArrowLine(g2d, this.x5[0] + dd / 2, this.y5[0] + dd / 2, this.x5[0] + dd / 2, this.y5[0], 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0], this.x5[0] + 3 * dd / 4, this.y5[0]));
              this.extraLineTegn.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[2], this.x5[0] + 3 * dd / 4, this.y5[2]));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.faceR / 2))).toString(), this.x5[0] + dd, this.y5[0] + dd / 16));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[0] + dd / 2, this.y5[2] - dd / 2, this.x5[0] + dd / 2, this.y5[2], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[0] + dd / 2, this.y5[0] + dd / 2, this.x5[0] + dd / 2, this.y5[0], 4, 4));
            } 
            g2d.setStroke(stroke);
            if (this.vec[9] == 2) {
            	 //       g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y5[3] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y5[3] - dd / 2));
              QuadCurve2D.Double curve02 = new QuadCurve2D.Double(this.x11[0], (this.y11[0] - dd / 8), ((this.x11[0] + this.x11[6]) / 2), (this.y11[0] - dd / 2), this.x11[6], (this.y11[6] - dd / 8));
              //       g2d.draw(curve02);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[0], this.y11[0] - dd / 8, (this.x11[0] + this.x11[6]) / 2, this.y11[0] - dd / 2, this.x11[6], this.y11[6] - dd / 8));
              g2d.setStroke(stroke);
            } 
            if (this.vec[9] == 3) {
            	 //        g2d.drawString((this.vec[15] + this.vec[3]) + "°", this.x5[3] - dd / 4, this.y5[4] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", this.x5[3] - dd / 4, this.y5[4] - dd / 2));
              QuadCurve2D.Double curve03 = new QuadCurve2D.Double(this.x11[1], (this.y11[1] - dd / 8), ((this.x11[1] + this.x11[6]) / 2), (this.y11[1] - dd / 2), this.x11[6], (this.y11[6] - dd / 8));
              //         g2d.draw(curve03);
              g2d.setStroke(thichness05);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[1], this.y11[1] - dd / 8, (this.x11[1] + this.x11[6]) / 2, this.y11[1] - dd / 2, this.x11[6], this.y11[6] - dd / 8));
              g2d.setStroke(stroke);
            } 
            if (this.vec[9] == 4) {
            	 //         g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y5[3] - dd / 2);
              QuadCurve2D.Double curve04 = new QuadCurve2D.Double(this.x11[3], (this.y11[3] - dd / 8), ((this.x11[3] + this.x11[6]) / 2), (this.y11[3] - dd / 2), this.x11[6], (this.y11[6] - dd / 8));
              //      g2d.draw(curve04);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y5[3] - dd / 2));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[3], this.y11[3] - dd / 8, (this.x11[3] + this.x11[6]) / 2, this.y11[3] - dd / 2, this.x11[6], this.y11[6] - dd / 8));
              g2d.setStroke(thichness05);
              g2d.setStroke(stroke);
            } 
            if (this.vec[9] == 5) {
            	 //       g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y9[4] - dd);
              QuadCurve2D.Double curve05 = new QuadCurve2D.Double(this.x11[4], (this.y11[4] - dd / 8), ((this.x11[4] + this.x11[6]) / 2), (this.y11[4] - dd / 2), this.x11[6], (this.y11[6] - dd / 8));
              //         g2d.draw(curve05);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y9[4] - dd));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[4], this.y11[4] - dd / 8, (this.x11[4] + this.x11[6]) / 2, this.y11[4] - dd / 2, this.x11[6], this.y11[6] - dd / 8));
              g2d.setStroke(thichness05);
              g2d.setStroke(stroke);
            } 
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[21] == 3) {
        	 //       g2d.drawString(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2);
        	 //          g2d.drawLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4);
        	 //      g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2);
        	 //        g2d.drawLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4);
        	 //        g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x5[7], this.y5[7]);
          this.extraTall.add(0, new ExtraTall(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x5[7], this.y5[7]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            //        g2d.drawString(this.vec[17] + "°", this.x5[1] + dd / 2, this.y5[1] + dd / 4);
            //         g2d.drawString(this.vec[15] + "°", this.x5[4] + dd / 2, this.y5[4] - dd / 4);
            g2d.setStroke(thichness05);
            this.extraTallTegn.add(0, new ExtraTall(this.vec[17] + "°", this.x5[1] + dd / 2, this.y5[1] + dd / 4));
            this.extraTallTegn.add(0, new ExtraTall(this.vec[15] + "°", this.x5[4] + dd / 2, this.y5[4] - dd / 4));
            double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[17]) / 180.0D);
            int poi1 = (int)pod1;
            double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[17]) / 180.0D);
            int poi10 = (int)pod10;
            //          g2d.drawLine(this.x5[1] + dd / 8, this.y5[1] + poi10, this.x5[1] + dd / 2, this.y5[1] + poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x5[1] + dd / 8, this.y5[1] + poi10, this.x5[1] + dd / 2, this.y5[1] + poi1));
            double pod2 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[15]) / 180.0D);
            int poi2 = (int)pod2;
            double pod20 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[15]) / 180.0D);
            int poi20 = (int)pod20;
            //          g2d.drawLine(this.x5[4] + dd / 8, this.y5[4] - poi20, this.x5[4] + dd / 2, this.y5[4] - poi2);
            this.extraLineTegn.add(0, new ExtraLine(this.x5[4] + dd / 8, this.y5[4] - poi20, this.x5[4] + dd / 2, this.y5[4] - poi2));
            //          g2d.drawLine(this.x5[2], this.y5[2] - this.face / 2, this.x5[0], this.y5[2] - this.face / 2);
            this.extraLineTegn.add(0, new ExtraLine(this.x5[2], this.y5[2] - this.face / 2, this.x5[0], this.y5[2] - this.face / 2));
            this.x11[7] = this.x5[4] + dd / 2;
            this.y11[7] = this.y5[4] - dd;
            this.x11[8] = this.x5[1] + dd / 2;
            this.y11[8] = this.y5[1] + dd;
            if (this.gap > 0) {
            	 //         g2d.drawLine(this.x5[2], this.y5[1] + dd / 2, this.x5[2], this.y5[1] + 1 * dd);
            	 //         drawArrowLine(g2d, this.x5[2] + dd / 2, this.y5[1] + 3 * dd / 4, this.x5[2], this.y5[1] + 3 * dd / 4, 4, 4);
            	 //          g2d.drawString((new StringBuilder(String.valueOf(this.gap))).toString(), this.x5[2], this.y5[1] + 3 * dd / 2);
              this.extraLineTegn.add(0, new ExtraLine(this.x5[2], this.y5[1] + dd / 2, this.x5[2], this.y5[1] + 1 * dd));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap))).toString(), this.x5[2], this.y5[1] + 5 * dd / 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[2] + dd / 2, this.y5[1] + 3 * dd / 4, this.x5[2], this.y5[1] + 3 * dd / 4, 4, 4));
            } 
            if (this.faceR > 0) {
            	 //        g2d.drawLine(this.x5[0] + dd / 4, this.y5[3], this.x5[0] + 3 * dd / 4, this.y5[3]);
            	 //        g2d.drawLine(this.x5[0] + dd / 4, this.y5[2], this.x5[0] + 3 * dd / 4, this.y5[2]);
            	 //       g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x5[0] + dd, this.y5[2] + dd / 16);
            	 //        drawArrowLine(g2d, this.x5[0] + dd / 2, this.y5[2] - dd / 2, this.x5[0] + dd / 2, this.y5[3], 4, 4);
            	 //       drawArrowLine(g2d, this.x5[0] + dd / 2, this.y5[0], this.x5[0] + dd / 2, this.y5[2], 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[3], this.x5[0] + 3 * dd / 4, this.y5[3]));
              this.extraLineTegn.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[2], this.x5[0] + 3 * dd / 4, this.y5[2]));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.faceR / 2))).toString(), this.x5[0] + dd, this.y5[2] + dd / 16));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[0] + dd / 2, this.y5[2] - dd / 2, this.x5[0] + dd / 2, this.y5[3], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[0] + dd / 2, this.y5[0], this.x5[0] + dd / 2, this.y5[2], 4, 4));
            } 
            g2d.setStroke(stroke);
            if (this.vec[9] == 2) {
              QuadCurve2D.Double curveYHY = new QuadCurve2D.Double(this.x9[0], this.y9[0], 0.0D, (this.y5[4] - dd), this.x5[4], this.y5[4]);
              QuadCurve2D.Double curve12 = new QuadCurve2D.Double(this.x11[0], (this.y11[0] - dd / 8), ((this.x11[0] + this.x11[7]) / 2), (this.y11[0] - dd / 2), this.x11[7], (this.y11[7] - dd / 8));
              //       g2d.draw(curve12);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[0], this.y11[0] - dd / 8, (this.x11[0] + this.x11[7]) / 2, this.y11[0] - dd / 2, this.x11[7], this.y11[7] - dd / 8));
              g2d.setStroke(dashed);
              g2d.setStroke(stroke);
              g2d.setColor(Color.BLUE);
            } 
            if (this.vec[9] == 2) {
            	//       g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y5[4] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y5[4] - dd / 2));
            } 
            if (this.vec[9] == 3) {
               QuadCurve2D.Double curveYHY = new QuadCurve2D.Double(this.x9[0], this.y9[0], 0.0D, (this.y5[3] - dd), this.x5[4], this.y5[4]);
               QuadCurve2D.Double curve13 = new QuadCurve2D.Double(this.x11[1], (this.y11[1] - dd / 8), ((this.x11[1] + this.x11[7]) / 2), (this.y11[1] - dd / 2), this.x11[7], (this.y11[7] - dd / 8));
            	//       g2d.draw(curve13);
              QuadCurve2D.Double curve14 = new QuadCurve2D.Double(this.x11[2], (this.y11[2] + dd / 8), ((this.x11[2] + this.x11[8]) / 2), (this.y11[2] + dd / 2), this.x11[8], (this.y11[8] + dd / 8));
              //      g2d.draw(curve14);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[1], this.y11[1] - dd / 8, (this.x11[1] + this.x11[7]) / 2, this.y11[1] - dd / 2, this.x11[7], this.y11[7] - dd / 8));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[2], this.y11[2] + dd / 8, (this.x11[2] + this.x11[8]) / 2, this.y11[2] + dd / 2, this.x11[8], this.y11[8] + dd / 8));
              //         g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y5[4] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y5[4] - dd / 2));
              //      g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y5[1] + dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y5[1] + dd / 2));
              g2d.setStroke(dashed);
              g2d.setStroke(stroke);
            } 
            if (this.vec[9] == 4) {
            	//     g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y5[4] - dd / 4);
              QuadCurve2D.Double curve15 = new QuadCurve2D.Double(this.x11[3], (this.y11[3] - dd / 8), ((this.x11[3] + this.x11[7]) / 2), (this.y11[3] - dd / 2), this.x11[7], (this.y11[7] - dd / 8));
              //    g2d.draw(curve15);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y5[4] - dd / 4));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[3], this.y11[3] - dd / 8, (this.x11[3] + this.x11[7]) / 2, this.y11[3] - dd / 2, this.x11[7], this.y11[7] - dd / 8));
              g2d.setStroke(dashed);
              g2d.setStroke(stroke);
            } 
            if (this.vec[9] == 5) {
            	//        g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y9[4] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y9[4] - dd / 2));
              //       g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y5[1] + dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y5[1] + dd / 2));
              QuadCurve2D.Double curve16 = new QuadCurve2D.Double(this.x11[4], (this.y11[4] - dd / 8), ((this.x11[4] + this.x11[7]) / 2), (this.y11[4] - dd / 2), this.x11[7], (this.y11[7] - dd / 8));
              //       g2d.draw(curve16);
              QuadCurve2D.Double curve17 = new QuadCurve2D.Double(this.x11[5], (this.y11[5] + dd / 8), ((this.x11[5] + this.x11[8]) / 2), (this.y11[5] + dd / 2), this.x11[8], (this.y11[8] + dd / 8));
              //        g2d.draw(curve17);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[4], this.y11[4] - dd / 8, (this.x11[4] + this.x11[7]) / 2, this.y11[4] - dd / 2, this.x11[7], this.y11[7] - dd / 8));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[5], this.y11[5] + dd / 8, (this.x11[5] + this.x11[8]) / 2, this.y11[5] + dd / 2, this.x11[8], this.y11[8] + dd / 8));
              g2d.setStroke(dashed);
              g2d.setStroke(stroke);
            } 
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[21] == 4) {
        	//      g2d.drawString(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2);
        	//    g2d.drawLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4);
        	//      g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2);
        	//       g2d.drawLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4);
        	//     g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x6[0], this.y6[0]);
          this.extraTall.add(0, new ExtraTall(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x6[0], this.y6[0]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            //     g2d.drawString("R" + this.vec[16], this.x5[2] + dd / 2, this.y5[2] - dd / 16);
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[16], this.x5[2] + dd / 2, this.y5[2] - dd / 16));
            //     g2d.drawString(this.vec[15] + "°", this.x6[1] + dd / 2, this.y6[1] - dd / 4);
            this.extraTallTegn.add(0, new ExtraTall(this.vec[15] + "°", this.x6[1] + dd / 2, this.y6[1] - dd / 4));
            g2d.setStroke(thichness05);
            double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[15]) / 180.0D);
            int poi1 = (int)pod1;
            double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[15]) / 180.0D);
            int poi10 = (int)pod10;
            //      g2d.drawLine(this.x6[1] + dd / 8, this.y6[1] - poi10, this.x6[1] + dd / 2, this.y6[1] - poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x6[1] + dd / 8, this.y6[1] - poi10, this.x6[1] + dd / 2, this.y6[1] - poi1));
            this.x11[9] = this.x6[1] + dd / 2;
            this.y11[9] = this.y6[1] - dd;
            if (this.gap > 0) {
            	//        g2d.drawLine(this.x5[1], this.y5[1] + dd / 2, this.x5[1], this.y5[1] + 1 * dd);
            	//         drawArrowLine(g2d, this.x5[1] + dd / 2, this.y5[1] + 3 * dd / 4, this.x5[1], this.y5[1] + 3 * dd / 4, 4, 4);
            	//        g2d.drawString((new StringBuilder(String.valueOf(this.gap))).toString(), this.x5[1], this.y5[1] + 3 * dd / 2);
              this.extraLineTegn.add(0, new ExtraLine(this.x5[1], this.y5[1] + dd / 2, this.x5[1], this.y5[1] + 1 * dd));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap))).toString(), this.x5[1], this.y5[1] + 5 * dd / 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[1] + dd / 2, this.y5[1] + 3 * dd / 4, this.x5[1], this.y5[1] + 3 * dd / 4, 4, 4));
            } 
            if (this.faceR > 0) {
            	//        g2d.drawLine(this.x5[0] + dd / 4, this.y5[0], this.x5[0] + 3 * dd / 4, this.y5[0]);
            	//       g2d.drawLine(this.x5[0] + dd / 4, this.y5[2], this.x5[0] + 3 * dd / 4, this.y5[2]);
            	//      g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x5[0] + dd, this.y5[0] + dd / 16);
            	//        drawArrowLine(g2d, this.x5[0] + dd / 2, this.y5[2] - dd / 2, this.x5[0] + dd / 2, this.y5[2], 4, 4);
            	//     drawArrowLine(g2d, this.x5[0] + dd / 2, this.y5[0] + dd / 2, this.x5[0] + dd / 2, this.y5[0], 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0], this.x5[0] + 3 * dd / 4, this.y5[0]));
              this.extraLineTegn.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[2], this.x5[0] + 3 * dd / 4, this.y5[2]));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.faceR / 2))).toString(), this.x5[0] + dd, this.y5[0] + dd / 16));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[0] + dd / 2, this.y5[2] - dd / 2, this.x5[0] + dd / 2, this.y5[2], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[0] + dd / 2, this.y5[0] + dd / 2, this.x5[0] + dd / 2, this.y5[0], 4, 4));
            } 
            g2d.setStroke(stroke);
            if (this.vec[9] == 2) {
            	//        g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2));
              QuadCurve2D.Double curve20 = new QuadCurve2D.Double(this.x11[0], (this.y11[0] - dd / 8), ((this.x11[0] + this.x11[9]) / 2), (this.y11[0] - dd / 2), this.x11[9], (this.y11[9] - dd / 8));
              //       g2d.draw(curve20);
              g2d.setStroke(dashed);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[0], this.y11[0] - dd / 8, (this.x11[0] + this.x11[9]) / 2, this.y11[0] - dd / 2, this.x11[9], this.y11[9] - dd / 8));
              g2d.setStroke(stroke);
            } 
            if (this.vec[9] == 3) {
            	//       g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2));
              QuadCurve2D.Double curve21 = new QuadCurve2D.Double(this.x11[1], (this.y11[1] - dd / 8), ((this.x11[1] + this.x11[9]) / 2), (this.y11[1] - dd / 2), this.x11[9], (this.y11[9] - dd / 8));
              //       g2d.draw(curve21);
              g2d.setStroke(dashed);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[1], this.y11[1] - dd / 8, (this.x11[1] + this.x11[9]) / 2, this.y11[1] - dd / 2, this.x11[9], this.y11[9] - dd / 8));
              g2d.setStroke(stroke);
            } 
            if (this.vec[9] == 4) {
            	//       g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2));
              QuadCurve2D.Double curve22 = new QuadCurve2D.Double(this.x11[3], (this.y11[3] - dd / 8), ((this.x11[3] + this.x11[9]) / 2), (this.y11[3] - dd / 2), this.x11[9], (this.y11[9] - dd / 8));
              //      g2d.draw(curve22);
              g2d.setStroke(dashed);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[3], this.y11[3] - dd / 8, (this.x11[3] + this.x11[9]) / 2, this.y11[3] - dd / 2, this.x11[9], this.y11[9] - dd / 8));
              g2d.setStroke(stroke);
            } 
            if (this.vec[9] == 5) {
            	//     g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2));
              QuadCurve2D.Double curve23 = new QuadCurve2D.Double(this.x11[4], (this.y11[4] - dd / 8), ((this.x11[4] + this.x11[9]) / 2), (this.y11[4] - dd / 2), this.x11[9], (this.y11[9] - dd / 8));
              //    g2d.draw(curve23);
              g2d.setStroke(dashed);
              this.extraBueTegn.add(0, new ExtraBue(this.x11[4], this.y11[4] - dd / 8, (this.x11[4] + this.x11[9]) / 2, this.y11[4] - dd / 2, this.x11[9], this.y11[9] - dd / 8));
              g2d.setStroke(stroke);
            } 
            g2d.setColor(Color.BLACK);
          } 
        } 
        if (this.vec[21] == 5) {
        	//      g2d.drawString(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2);
        	//     g2d.drawLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4);
        	//      g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2);
        	//     g2d.drawLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4);
        	//      g2d.drawLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x6[0], this.y6[0]);
          this.extraTall.add(0, new ExtraTall(v1, this.x5[0] - dd / 4, this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[0] + dd / 4, this.y5[0] - dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - dd / 4, this.x5[0], this.y5[0] - dd / 2));
          this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0] - dd / 2, this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4));
          this.extraLine.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y5[0] - 3 * dd / 4, this.x6[0], this.y6[0]));
          if (Welding.this.tegning) {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(stroke);
            //        g2d.drawString("R" + this.vec[16], this.x7[0] + dd / 4, this.y6[1] + dd / 3);
            QuadCurve2D.Double curveYHHM = new QuadCurve2D.Double(this.x5[1], this.y5[1], ((this.x5[1] + this.x7[0]) / 2), (this.y5[1] + 10), this.x7[0], this.y5[1]);
            //.drawString("R" + this.vec[18], this.x7[0] + dd / 4, this.y5[1] - dd / 3);
            //    g2d.drawString(this.vec[17] + "°", this.x5[1] + dd / 2, this.y5[1] + dd / 4);
            //   g2d.drawString(this.vec[15] + "°", this.x6[1] + dd / 2, this.y6[1] - dd / 4);
            g2d.setStroke(thichness05);
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[16], this.x7[0] + dd / 4, this.y6[1] + dd / 3));
            this.extraTallTegn.add(0, new ExtraTall("r" + this.vec[18], this.x7[0] + dd / 4, this.y5[1] - dd / 3));
            this.extraTallTegn.add(0, new ExtraTall(this.vec[17] + "°", this.x5[1] + dd / 2, this.y5[1] + dd / 4));
            this.extraTallTegn.add(0, new ExtraTall(this.vec[15] + "°", this.x6[1] + dd / 2, this.y6[1] - dd / 4));
            double pod1 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[17]) / 180.0D);
            int poi1 = (int)pod1;
            double pod10 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[17]) / 180.0D);
            int poi10 = (int)pod10;
            //      g2d.drawLine(this.x5[1] + dd / 8, this.y5[1] + poi10, this.x5[1] + dd / 2, this.y5[1] + poi1);
            this.extraLineTegn.add(0, new ExtraLine(this.x5[1] + dd / 8, this.y5[1] + poi10, this.x5[1] + dd / 2, this.y5[1] + poi1));
            double pod2 = (dd / 2) * Math.tan(Math.PI * (90 - this.vec[15]) / 180.0D);
            int poi2 = (int)pod2;
            double pod20 = (dd / 8) * Math.tan(Math.PI * (90 - this.vec[15]) / 180.0D);
            int poi20 = (int)pod20;
            //       g2d.drawLine(this.x6[1] + dd / 8, this.y6[1] - poi20, this.x6[1] + dd / 2, this.y6[1] - poi2);
            this.extraLineTegn.add(0, new ExtraLine(this.x6[1] + dd / 8, this.y6[1] - poi20, this.x6[1] + dd / 2, this.y6[1] - poi2));
            this.x11[10] = this.x6[1] + dd / 2;
            this.y11[10] = this.y6[1] - dd;
            this.x11[11] = this.x5[1] + dd / 2;
            this.y11[11] = this.y5[1] + dd;
            //        g2d.drawLine(this.x7[0], this.y7[0] + this.face / 2, this.x5[0], this.y7[0] + this.face / 2);
            this.extraLineTegn.add(0, new ExtraLine(this.x7[0], this.y7[0] + this.vec[19], this.x5[0], this.y7[0] + this.vec[19]));
            if (this.gap > 0) {
            	//       g2d.drawLine(this.x7[0], this.y5[0] + dd / 2, this.x7[0], this.y5[0] + 1 * dd);
            	//      drawArrowLine(g2d, this.x7[0] + dd / 2, this.y5[1] + 3 * dd / 4, this.x7[0], this.y5[1] + 3 * dd / 4, 4, 4);
            	//        g2d.drawString((new StringBuilder(String.valueOf(this.gap))).toString(), this.x7[0], this.y5[0] + 3 * dd / 2);
              this.extraLineTegn.add(0, new ExtraLine(this.x7[0], this.y5[0] + dd / 2, this.x7[0], this.y5[0] + 1 * dd));
              this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.gap))).toString(), this.x7[0], this.y5[0] + 5 * dd / 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x7[0] + dd / 2, this.y5[1] + 3 * dd / 4, this.x7[0], this.y5[1] + 3 * dd / 4, 4, 4));
            } 
            if (this.faceR > 0) {
            	//     g2d.drawLine(this.x5[0] + dd / 4, this.y7[0], this.x5[0] + 3 * dd / 4, this.y7[0]);
            	//     g2d.drawLine(this.x5[0] + dd / 4, this.y7[1], this.x5[0] + 3 * dd / 4, this.y7[1]);
            	//     g2d.drawString((new StringBuilder(String.valueOf(this.face / 2))).toString(), this.x5[0] + dd, this.y7[0] + dd / 16);
            	//     drawArrowLine(g2d, this.x5[0] + dd / 2, this.y7[1] - dd / 2, this.x5[0] + dd / 2, this.y7[0], 4, 4);
            	//    drawArrowLine(g2d, this.x5[0] + dd / 2, this.y7[0] + dd / 2, this.x5[0] + dd / 2, this.y7[1], 4, 4);
              this.extraLineTegn.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y7[0], this.x5[0] + 3 * dd / 4, this.y7[0]));
              this.extraLineTegn.add(0, new ExtraLine(this.x5[0] + dd / 4, this.y7[1], this.x5[0] + 3 * dd / 4, this.y7[1]));
             this.extraTallTegn.add(0, new ExtraTall((new StringBuilder(String.valueOf(this.vec[19] ))).toString(), this.x5[0] + dd, this.y7[0] + dd / 16));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[0] + dd / 2, this.y7[1] - dd / 2, this.x5[0] + dd / 2, this.y7[0], 4, 4));
              this.extraArrayTegn.add(0, new ExtraArray(this.x5[0] + dd / 2, this.y7[0] + dd / 2, this.x5[0] + dd / 2, this.y7[1], 4, 4));
            } 
            g2d.setStroke(stroke);
            if (this.vec[9] == 2) {
            	//      g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2);
              QuadCurve2D.Double curve24 = new QuadCurve2D.Double(this.x11[0], (this.y11[0] - dd / 8), ((this.x11[0] + this.x11[10]) / 2), (this.y11[0] - dd / 2), this.x11[10], (this.y11[10] - dd / 8));
              //      g2d.draw(curve24);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[0], this.y11[0] - dd / 8, (this.x11[0] + this.x11[10]) / 2, this.y11[0] - dd / 2, this.x11[10], this.y11[10] - dd / 8));
            } 
            if (this.vec[9] == 3) {
            	//     g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd);
            	//      g2d.drawString((this.vec[17] + this.vec[5]) + "°", 0, this.y5[1] + dd / 2);
              QuadCurve2D.Double curve25 = new QuadCurve2D.Double(this.x11[1], (this.y11[1] - dd / 8), ((this.x11[1] + this.x11[10]) / 2), (this.y11[1] - dd / 2), this.x11[10], (this.y11[10] - dd / 8));
              //       g2d.draw(curve25);
              QuadCurve2D.Double curve29 = new QuadCurve2D.Double(this.x11[2], (this.y11[2] + dd / 8), ((this.x11[2] + this.x11[11]) / 2), (this.y11[2] + dd / 2), this.x11[11], (this.y11[11] + dd / 8));
              //   g2d.draw(curve29);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd));
              this.extraTallTegn.add(0, new ExtraTall((this.vec[17] + this.vec[5]) + "°", 0, this.y5[1] + dd / 2));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[1], this.y11[1] - dd / 8, (this.x11[1] + this.x11[10]) / 2, this.y11[1] - dd / 2, this.x11[10], this.y11[10] - dd / 8));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[2], this.y11[2] + dd / 8, (this.x11[2] + this.x11[11]) / 2, this.y11[2] + dd / 2, this.x11[11], this.y11[11] + dd / 8));
            } 
            if (this.vec[9] == 4) {
            	//      g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2);
              QuadCurve2D.Double curve26 = new QuadCurve2D.Double(this.x11[3], (this.y11[3] - dd / 8), ((this.x11[3] + this.x11[10]) / 2), (this.y11[3] - dd / 2), this.x11[10], (this.y11[10] - dd / 8));
              //      g2d.draw(curve26);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[3], this.y11[3] - dd / 8, (this.x11[3] + this.x11[10]) / 2, this.y11[3] - dd / 2, this.x11[10], this.y11[10] - dd / 8));
            } 
            if (this.vec[9] == 5) {
            	//        g2d.drawString((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2);
            	//       g2d.drawString((this.vec[17] + this.vec[5]) + "°", 0, this.y5[1] + dd / 2);
              QuadCurve2D.Double curve26 = new QuadCurve2D.Double(this.x11[4], (this.y11[4] - dd / 8), ((this.x11[4] + this.x11[10]) / 2), (this.y11[4] - dd / 2), this.x11[10], (this.y11[10] - dd / 8));
              //     g2d.draw(curve26);
              QuadCurve2D.Double curve28 = new QuadCurve2D.Double(this.x11[5], (this.y11[5] + dd / 8), ((this.x11[5] + this.x11[11]) / 2), (this.y11[5] + dd / 2), this.x11[11], (this.y11[11] + dd / 8));
              //   g2d.draw(curve28);
              this.extraTallTegn.add(0, new ExtraTall((this.vec[15] + this.vec[3]) + "°", 0, this.y6[1] - dd / 2));
              this.extraTallTegn.add(0, new ExtraTall((this.vec[17] + this.vec[5]) + "°", 0, this.y5[1] + dd / 2));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[4], this.y11[4] - dd / 8, (this.x11[4] + this.x11[10]) / 2, this.y11[4] - dd / 2, this.x11[10], this.y11[10] - dd / 8));
              this.extraBueTegn.add(0, new ExtraBue(this.x11[5], this.y11[5] + dd / 8, (this.x11[5] + this.x11[11]) / 2, this.y11[5] + dd / 2, this.x11[11], this.y11[11] + dd / 8));
            } 
            g2d.setStroke(stroke);
            g2d.setColor(Color.BLACK);
          } 
        } 
      } 
      if (this.plotType.equals("Butt") && this.vec[12] == 4) {
        Path2D.Double curvFU = new Path2D.Double();
        QuadCurve2D.Double curveFU = new QuadCurve2D.Double(this.x2[3], this.y2[3], Welding.this.xcentrumFU, Welding.this.ycentrumFU, this.x3[0], this.y3[0]);
        //     g2d.draw(curveFU);
        this.extraBue.add(0, new ExtraBue(this.x2[3], this.y2[3], Welding.this.xcentrumFU, Welding.this.ycentrumFU, this.x3[0], this.y3[0]));
      } 
      q.moveTo(this.x2[0], this.y2[0]);
      q.lineTo(this.x2[1], this.y2[1]);
      q.lineTo(this.x2[2], this.y2[2]);
      q.lineTo(this.x2[3], this.y2[3]);
      q.lineTo(this.x2[4], this.y2[4]);
      q.lineTo(this.x2[5], this.y2[5]);
      q.lineTo(this.x2[6], this.y2[6]);
      q.lineTo(this.x2[7], this.y2[7]);
    
      //   g2d.draw(q);
      this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[1], this.y2[1]));
      this.extraLine.add(0, new ExtraLine(this.x2[1], this.y2[1], this.x2[2], this.y2[2]));
      this.extraLine.add(0, new ExtraLine(this.x2[2], this.y2[2], this.x2[3], this.y2[3]));
      this.extraLine.add(0, new ExtraLine(this.x2[3], this.y2[3], this.x2[4], this.y2[4]));
      this.extraLine.add(0, new ExtraLine(this.x2[4], this.y2[4], this.x2[5], this.y2[5]));
      this.extraLine.add(0, new ExtraLine(this.x2[5], this.y2[5], this.x2[6], this.y2[6]));
      this.extraLine.add(0, new ExtraLine(this.x2[6], this.y2[6], this.x2[7], this.y2[7]));
      qqr.moveTo(this.x3[0], this.y3[0]);
      qqr.lineTo(this.x3[1], this.y3[1]);
      qqr.lineTo(this.x3[2], this.y3[2]);
      qqr.lineTo(this.x3[3], this.y3[3]);
      qqr.lineTo(this.x3[4], this.y3[4]);
      qqr.lineTo(this.x3[5], this.y3[5]);
      qqr.lineTo(this.x3[6], this.y3[6]);
      qqr.lineTo(this.x3[7], this.y3[7]);
      //   g2d.draw(qqr);
      this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
      this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
      this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
      this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
      this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
      this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
      this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
      qqs.moveTo(this.x4[0], this.y4[0]);
      qqs.lineTo(this.x4[1], this.y4[1]);
      qqs.lineTo(this.x4[2], this.y4[2]);
      qqs.lineTo(this.x4[3], this.y4[3]);
      qqs.lineTo(this.x4[4], this.y4[4]);
      qqs.lineTo(this.x4[5], this.y4[5]);
      qqs.lineTo(this.x4[6], this.y4[6]);
      qqs.lineTo(this.x4[7], this.y4[7]);
      //  g2d.draw(qqs);
      this.extraLine.add(0, new ExtraLine(this.x4[0], this.y4[0], this.x4[1], this.y4[1]));
      this.extraLine.add(0, new ExtraLine(this.x4[1], this.y4[1], this.x4[2], this.y4[2]));
      this.extraLine.add(0, new ExtraLine(this.x4[2], this.y4[2], this.x4[3], this.y4[3]));
      this.extraLine.add(0, new ExtraLine(this.x4[3], this.y4[3], this.x4[4], this.y4[4]));
      this.extraLine.add(0, new ExtraLine(this.x4[4], this.y4[4], this.x4[5], this.y4[5]));
      this.extraLine.add(0, new ExtraLine(this.x4[5], this.y4[5], this.x4[6], this.y4[6]));
      this.extraLine.add(0, new ExtraLine(this.x4[6], this.y4[6], this.x4[7], this.y4[7]));
      
      if (this.plotType.equals("flanged")) {
        Path2D.Double curvFLA = new Path2D.Double();
        QuadCurve2D.Double curveFLA = new QuadCurve2D.Double(this.x3[1], this.y3[1], Welding.this.xcentrumA, Welding.this.ycentrumA, this.x1[0], this.y1[0]);
        //     g2d.draw(curveFLA);
        this.extraBue.add(0, new ExtraBue(this.x3[1], this.y3[1], Welding.this.xcentrumA, Welding.this.ycentrumA, this.x1[0], this.y1[0]));
        Path2D.Double curvFLB = new Path2D.Double();
        QuadCurve2D.Double curveFLB = new QuadCurve2D.Double(this.x3[0], this.y3[1], Welding.this.xcentrumB, Welding.this.ycentrumB, this.x1[4], this.y1[4]);
        //    g2d.draw(curveFLB);
        this.extraBue.add(0, new ExtraBue(this.x3[0], this.y3[1], Welding.this.xcentrumB, Welding.this.ycentrumB, this.x1[4], this.y1[4]));
        Path2D.Double curvFLC = new Path2D.Double();
        QuadCurve2D.Double curveFLC = new QuadCurve2D.Double(this.x4[0], this.y4[0], Welding.this.xcentrumC, Welding.this.ycentrumC, this.x2[4], this.y2[4]);
        //     g2d.draw(curveFLC);
        this.extraBue.add(0, new ExtraBue(this.x4[0], this.y4[0], Welding.this.xcentrumC, Welding.this.ycentrumC, this.x2[4], this.y2[4]));
        Path2D.Double curvFLD = new Path2D.Double();
        QuadCurve2D.Double curveFLD = new QuadCurve2D.Double(this.x4[1], this.y4[1], Welding.this.xcentrumD, Welding.this.ycentrumD, this.x2[0], this.y2[0]);
        //    g2d.draw(curveFLD);
        this.extraBue.add(0, new ExtraBue(this.x4[1], this.y4[1], Welding.this.xcentrumD, Welding.this.ycentrumD, this.x2[0], this.y2[0]));
        String v30 = "1 ";
        //      g2d.drawString(v30, this.x1[2] + 20, this.y1[2] + 5);
        this.extraTall.add(0, new ExtraTall(v30, this.x1[2] + 20, this.y1[2] + 5));
        v30 = "2 ";
        //   g2d.drawString(v30, this.x2[2] - 20, this.y2[2] + 5);
        this.extraTall.add(0, new ExtraTall(v30, this.x2[2] - 20, this.y2[2] + 5));
      } 
      
      if (this.plotType.equals("filet") && this.vec[12] == 5) {
        Path2D.Double curvLDU = new Path2D.Double();
        QuadCurve2D.Double curveLDU = new QuadCurve2D.Double(this.x2[3], this.y2[3], Welding.this.xcentrumLDU, Welding.this.ycentrumLDU, this.x4[0], this.y4[0]);
        //   g2d.draw(curveLDU);
        Path2D.Double curvRDU = new Path2D.Double();
        QuadCurve2D.Double curveRDU = new QuadCurve2D.Double(this.x3[3], this.y3[3], Welding.this.xcentrumRDU, Welding.this.ycentrumRDU, this.x4[1], this.y4[1]);
        //   g2d.draw(curveRDU);
        this.extraBue.add(0, new ExtraBue(this.x2[3], this.y2[3], Welding.this.xcentrumLDU, Welding.this.ycentrumLDU, this.x4[0], this.y4[0]));
        this.extraBue.add(0, new ExtraBue(this.x3[3], this.y3[3], Welding.this.xcentrumRDU, Welding.this.ycentrumRDU, this.x4[1], this.y4[1]));
      } 
      
      if (this.plotType.equals("filet") && this.vec[12] == 4) {
        Path2D.Double curvLDU = new Path2D.Double();
        QuadCurve2D.Double curveLDU = new QuadCurve2D.Double(this.x2[3], this.y2[3], Welding.this.xcentrumFU, Welding.this.ycentrumFU, this.x3[0], this.y3[0]);
        //   g2d.draw(curveLDU);
        this.extraBue.add(0, new ExtraBue(this.x2[3], this.y2[3], Welding.this.xcentrumFU, Welding.this.ycentrumFU, this.x3[0], this.y3[0]));
      } 
      
      if (this.bue) {
        if ((this.plotType.equals("Butt") || this.plotType.equals("butt")) && this.vec[9] == 4) {
          double r11 = this.r1 * 1.4142D / this.fac;
          int r11i = (int)r11;
          QuadCurve2D.Double curvBUU = new QuadCurve2D.Double(this.x2[2], this.y2[2], this.xcentrum, this.ycentrum, this.x1[2], this.y1[2]);
          //    g2d.draw(curvBUU);
          this.extraBue.add(0, new ExtraBue(this.x2[2], this.y2[2], this.xcentrum, this.ycentrum, this.x1[2], this.y1[2]));
        } 
        
        if ((this.plotType.equals("Butt") || this.plotType.equals("butt")) && this.vec[9] == 5) {
          double r11 = this.r1 * 1.4142D / this.fac;
          int r11i = (int)r11;
          Path2D.Double curv = new Path2D.Double();
          QuadCurve2D.Double curve = new QuadCurve2D.Double(this.x3[0], this.y3[0], this.x1centrum, this.y1centrum, this.x1[3], this.y1[3]);
          //     g2d.draw(curve);
          this.extraBue.add(0, new ExtraBue(this.x3[0], this.y3[0], this.x1centrum, this.y1centrum, this.x1[3], this.y1[3]));
          Path2D.Double strek = new Path2D.Double();
          Path2D.Double qq = new Path2D.Double();
          qq.moveTo(this.x3[0], this.y3[0]);
          qq.lineTo(this.x3[1], this.y3[1]);
          qq.lineTo(this.x3[2], this.y3[2]);
          qq.lineTo(this.x3[3], this.y3[3]);
          qq.lineTo(this.x3[4], this.y3[4]);
          qq.lineTo(this.x3[5], this.y3[5]);
          qq.lineTo(this.x3[6], this.y3[6]);
          qq.lineTo(this.x3[7], this.y3[7]);
          //      g2d.draw(qq);
          this.extraLine.add(0, new ExtraLine(this.x3[0], this.y3[0], this.x3[1], this.y3[1]));
          this.extraLine.add(0, new ExtraLine(this.x3[1], this.y3[1], this.x3[2], this.y3[2]));
          this.extraLine.add(0, new ExtraLine(this.x3[2], this.y3[2], this.x3[3], this.y3[3]));
          this.extraLine.add(0, new ExtraLine(this.x3[3], this.y3[3], this.x3[4], this.y3[4]));
          this.extraLine.add(0, new ExtraLine(this.x3[4], this.y3[4], this.x3[5], this.y3[5]));
          this.extraLine.add(0, new ExtraLine(this.x3[5], this.y3[5], this.x3[6], this.y3[6]));
          this.extraLine.add(0, new ExtraLine(this.x3[6], this.y3[6], this.x3[7], this.y3[7]));
          Path2D.Double curv2 = new Path2D.Double();
          QuadCurve2D.Double curve2 = new QuadCurve2D.Double(this.x3[1], this.y3[1], this.x2centrum, this.y2centrum, this.x2[3], this.y2[3]);
          //    g2d.draw(curve2);
          this.extraBue.add(0, new ExtraBue(this.x3[1], this.y3[1], this.x2centrum, this.y2centrum, this.x2[3], this.y2[3]));
        } 
      } 
      if (this.index2 == 4) {
        Path2D.Double curvRU = new Path2D.Double();
        QuadCurve2D.Double curveRU = new QuadCurve2D.Double(this.x5[2], this.y5[2], this.xRUcentrum, this.yRUcentrum, this.x6[2], this.y6[2]);
        //   g2d.draw(curveRU);
        this.extraBue.add(0, new ExtraBue(this.x5[2], this.y5[2], this.xRUcentrum, this.yRUcentrum, this.x6[2], this.y6[2]));
      } 
      if (this.index2 == 5) {
        Path2D.Double curvRUU = new Path2D.Double();
        QuadCurve2D.Double curveRUU = new QuadCurve2D.Double(this.x5[2], this.y5[2], Welding.this.xRDU1centrum, Welding.this.yRDU1centrum, this.x7[1], this.y7[1]);
        //    g2d.draw(curveRUU);
        this.extraBue.add(0, new ExtraBue(this.x5[2], this.y5[2], Welding.this.xRDU1centrum, Welding.this.yRDU1centrum, this.x7[1], this.y7[1]));
        Path2D.Double curvRUD = new Path2D.Double();
        QuadCurve2D.Double curveRUD = new QuadCurve2D.Double(this.x6[2], this.y6[2], Welding.this.xRDUcentrum, Welding.this.yRDUcentrum, this.x7[0], this.y7[0]);
        //   g2d.draw(curveRUD);
        this.extraBue.add(0, new ExtraBue(this.x6[2], this.y6[2], Welding.this.xRDUcentrum, Welding.this.yRDUcentrum, this.x7[0], this.y7[0]));
      } 
      
      Path2D.Double qqI = new Path2D.Double();
      qqI.moveTo(this.x5[0], this.y5[0]);
      qqI.lineTo(this.x5[1], this.y5[1]);
      qqI.lineTo(this.x5[2], this.y5[2]);
      qqI.lineTo(this.x5[3], this.y5[3]);
      qqI.lineTo(this.x5[4], this.y5[4]);
      qqI.lineTo(this.x5[5], this.y5[5]);
      qqI.lineTo(this.x5[6], this.y5[6]);
      qqI.lineTo(this.x5[7], this.y5[7]);
      //   g2d.draw(qqI);
      
      this.extraLine.add(0, new ExtraLine(this.x5[0], this.y5[0], this.x5[1], this.y5[1]));
      this.extraLine.add(0, new ExtraLine(this.x5[1], this.y5[1], this.x5[2], this.y5[2]));
      this.extraLine.add(0, new ExtraLine(this.x5[2], this.y5[2], this.x5[3], this.y5[3]));
      this.extraLine.add(0, new ExtraLine(this.x5[3], this.y5[3], this.x5[4], this.y5[4]));
      this.extraLine.add(0, new ExtraLine(this.x5[4], this.y5[4], this.x5[5], this.y5[5]));
      this.extraLine.add(0, new ExtraLine(this.x5[5], this.y5[5], this.x5[6], this.y5[6]));
      this.extraLine.add(0, new ExtraLine(this.x5[6], this.y5[6], this.x5[7], this.y5[7]));
      
      Path2D.Double qqU = new Path2D.Double();
      qqU.moveTo(this.x6[0], this.y6[0]);
      qqU.lineTo(this.x6[1], this.y6[1]);
      qqU.lineTo(this.x6[2], this.y6[2]);
      qqU.lineTo(this.x6[3], this.y6[3]);
      qqU.lineTo(this.x6[4], this.y6[4]);
      qqU.lineTo(this.x6[5], this.y6[5]);
      qqU.lineTo(this.x6[6], this.y6[6]);
      qqU.lineTo(this.x6[7], this.y6[7]);
      //  g2d.draw(qqU);
      
      this.extraLine.add(0, new ExtraLine(this.x6[0], this.y6[0], this.x6[1], this.y6[1]));
      this.extraLine.add(0, new ExtraLine(this.x6[1], this.y6[1], this.x6[2], this.y6[2]));
      this.extraLine.add(0, new ExtraLine(this.x6[2], this.y6[2], this.x6[3], this.y6[3]));
      this.extraLine.add(0, new ExtraLine(this.x6[3], this.y6[3], this.x6[4], this.y6[4]));
      this.extraLine.add(0, new ExtraLine(this.x6[4], this.y6[4], this.x6[5], this.y6[5]));
      this.extraLine.add(0, new ExtraLine(this.x6[5], this.y6[5], this.x6[6], this.y6[6]));
      this.extraLine.add(0, new ExtraLine(this.x6[6], this.y6[6], this.x6[7], this.y6[7]));
      
      Path2D.Double qqUU = new Path2D.Double();
      qqUU.moveTo(this.x7[0], this.y7[0]);
      qqUU.lineTo(this.x7[1], this.y7[1]);
      qqUU.lineTo(this.x7[2], this.y7[2]);
      qqUU.lineTo(this.x7[3], this.y7[3]);
      qqUU.lineTo(this.x7[4], this.y7[4]);
      qqUU.lineTo(this.x7[5], this.y7[5]);
      qqUU.lineTo(this.x7[6], this.y7[6]);
      qqUU.lineTo(this.x7[7], this.y7[7]);
      //     g2d.draw(qqUU);
      
      this.extraLine.add(0, new ExtraLine(this.x7[0], this.y7[0], this.x7[1], this.y7[1]));
      this.extraLine.add(0, new ExtraLine(this.x7[1], this.y7[1], this.x7[2], this.y7[2]));
      this.extraLine.add(0, new ExtraLine(this.x7[2], this.y7[2], this.x7[3], this.y7[3]));
      this.extraLine.add(0, new ExtraLine(this.x7[3], this.y7[3], this.x7[4], this.y7[4]));
      this.extraLine.add(0, new ExtraLine(this.x7[4], this.y7[4], this.x7[5], this.y7[5]));
      this.extraLine.add(0, new ExtraLine(this.x7[5], this.y7[5], this.x7[6], this.y7[6]));
      this.extraLine.add(0, new ExtraLine(this.x7[6], this.y7[6], this.x7[7], this.y7[7]));
      
      if (this.plotType.equals("Lap joint")) {
        Path2D.Double curvCJLap = new Path2D.Double();
        int i;
        for (i = 0; i < 8 * Welding.this.s; i += 20) {
          QuadCurve2D.Double curveCJLap = new QuadCurve2D.Double((this.x2[0] + i), this.y2[0], (this.x2[0] + i + 10), (this.y2[6] - 1), (this.x2[3] + i), this.y2[3]);
          this.extraBue.add(0, new ExtraBue(this.x2[0] + i, this.y2[0], this.x2[0] + i + 10, this.y2[6] - 1, this.x2[3] + i, this.y2[3]));
          //     g2d.draw(curveCJLap);
        } 
        for (i = 0; i < 8 * Welding.this.s; i += 20) {
          QuadCurve2D.Double curveCJLap = new QuadCurve2D.Double((this.x1[0] + i), this.y1[0], (this.x1[0] + i + 10), 0.0D, (this.x1[3] + i), this.y1[3]);
          this.extraBue.add(0, new ExtraBue(this.x1[0] + i, this.y1[0], this.x1[0] + i + 10, 0, this.x1[3] + i, this.y1[3]));
          //       g2d.draw(curveCJLap);
        } 
        Ellipse2D.Double e1 = new Ellipse2D.Double(this.x8[0], this.y8[0], (2 * this.x8[1]), (2 * this.x8[1]));
        //     g2d.draw(e1);
        this.extraEllipse.add(0, new ExtraEllipse(this.x8[0], this.y8[0], 2 * this.x8[1], 2 * this.x8[1]));
        Ellipse2D.Double e2 = new Ellipse2D.Double(this.x8[3], this.y8[3], (2 * this.x8[4]), (2 * this.x8[4]));
        //      g2d.draw(e2);
        this.extraEllipse.add(0, new ExtraEllipse(this.x8[3], this.y8[3], 2 * this.x8[4], 2 * this.x8[4]));
        //   g2d.drawLine(this.x8[0], this.y8[7], this.x8[0] - 5, this.y8[7]);
        // g2d.drawLine(this.x8[1], this.y8[7], this.x8[1] + 5, this.y8[7]);
        //   g2d.drawLine(this.x8[3], this.y8[2], this.x8[3] - 5, this.y8[2]);
        //    g2d.drawLine(this.x8[4], this.y8[2], this.x8[4] + 5, this.y8[2]);
        //    g2d.drawLine(this.x8[0], this.y8[7] - 1, this.x8[0] - 5, this.y8[7] - 1);
        //     g2d.drawLine(this.x8[1], this.y8[7] - 1, this.x8[1] + 5, this.y8[7] - 1);
        //     g2d.drawLine(this.x8[3], this.y8[2] - 1, this.x8[3] - 5, this.y8[2] - 1);
        //    g2d.drawLine(this.x8[4], this.y8[2] - 1, this.x8[4] + 5, this.y8[2] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[0], this.y8[7], this.x8[0] - 5, this.y8[7]));
        this.extraLine.add(0, new ExtraLine(this.x8[1], this.y8[7], this.x8[1] + 5, this.y8[7]));
        this.extraLine.add(0, new ExtraLine(this.x8[3], this.y8[2], this.x8[3] - 5, this.y8[2]));
        this.extraLine.add(0, new ExtraLine(this.x8[4], this.y8[2], this.x8[4] + 5, this.y8[2]));
        this.extraLine.add(0, new ExtraLine(this.x8[0], this.y8[7] - 1, this.x8[0] - 5, this.y8[7] - 1));
        this.extraLine.add(0, new ExtraLine(this.x8[1], this.y8[7] - 1, this.x8[1] + 5, this.y8[7] - 1));
        this.extraLine.add(0, new ExtraLine(this.x8[3], this.y8[2] - 1, this.x8[3] - 5, this.y8[2] - 1));
        this.extraLine.add(0, new ExtraLine(this.x8[4], this.y8[2] - 1, this.x8[4] + 5, this.y8[2] - 1));
        
        if ( teksting) {  
        String v1 = "          Dimension 1 = " + this.vec[20] + " mm ";
        //     g2d.drawString(v1, this.x1[2], this.y1[2]);
     //   this.extraTall.add(0, new ExtraTall(v1, this.x1[2], this.y1[2]));
        v1 = "               Dimension 2  =  " + this.vec[21] + " mm ";
   //     this.extraTall.add(0, new ExtraTall(v1, this.x1[2] - 10, this.y2[1] + 20));
        //    g2d.drawString(v1, this.x1[2] - 10, this.y2[1] + 20);
        v1 = "               Gap = " + this.vec[22] + " mm";
  
        	int xstep = 110;
        	int ystep = 20;
            this.extraText.add(0, new ExtraText("Dimension1 "     , this.x1[2] - 5*ystep, this.y1[2] - ystep));   
            this.extraText.add(0, new ExtraText("Dimension2 " , this.x1[2]- 5*ystep, this.y2[1] + 20 ));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[20]))).toString(),this.x1[2]+ xstep- 3*ystep, this.y1[2] - ystep));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[21]))).toString(), this.x1[2]  + xstep- 3*ystep, this.y2[1] + 20 ));
       //     this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[2]))).toString(), xst + xstep, yst + 2*ystep));
            this.extraText.add(0, new ExtraText(" mm" , this.x1[2] + xstep + ystep- 3*ystep, this.y1[2] - ystep  )); 
            this.extraText.add(0, new ExtraText(" mm" , this.x1[2] + xstep + ystep- 3*ystep, this.y2[1] + 20 ));
       //     this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep, yst + 2*ystep ));
        	
        	
        }
      } 
      
      if (this.plotType.equals("Strap joint")) {
        Path2D.Double curvCJStrap = new Path2D.Double();
        int i;
        for (i = 0; i < 8 * Welding.this.s; i += 20) {
          QuadCurve2D.Double curveCJStrap = new QuadCurve2D.Double((this.x1[0] + i), this.y1[0], (this.x1[0] + i + 10), 0.0D, (this.x1[3] + i), this.y1[3]);
          //     g2d.draw(curveCJStrap);
          this.extraBue.add(0, new ExtraBue(this.x1[0] + i, this.y1[0], this.x1[0] + i + 10, 0, this.x1[3] + i, this.y1[3]));
        } 
        for (i = 0; i < 10 * Welding.this.s; i += 20) {
          QuadCurve2D.Double curveCJStrap = new QuadCurve2D.Double((this.x2[0] + i), this.y2[0], (this.x2[0] + i + 10), (this.y2[4] + 1), (this.x2[3] + i), this.y2[3]);
          //    g2d.draw(curveCJStrap);
          this.extraBue.add(0, new ExtraBue(this.x2[0] + i, this.y2[0], this.x2[0] + i + 10, this.y2[4] + 1, this.x2[3] + i, this.y2[3]));
        } 
        for (i = 0; i < 8 * Welding.this.s; i += 20) {
          QuadCurve2D.Double curveCJStrap = new QuadCurve2D.Double((this.x3[0] + i), this.y3[0], (this.x3[0] + i + 10), (this.y3[4] + 1), (this.x1[3] + i), this.y3[3]);
          //   g2d.draw(curveCJStrap);
          this.extraBue.add(0, new ExtraBue(this.x3[0] + i, this.y3[0], this.x3[0] + i + 10, this.y3[4] + 1, this.x1[3] + i, this.y3[3]));
        } 
        Ellipse2D.Double e1 = new Ellipse2D.Double(this.x8[0], this.y8[0], (2 * this.x8[1]), (2 * this.x8[1]));
        //   g2d.draw(e1);
        this.extraEllipse.add(0, new ExtraEllipse(this.x8[0], this.y8[0], 2 * this.x8[1], 2 * this.x8[1]));
        Ellipse2D.Double e2 = new Ellipse2D.Double(this.x8[3], this.y8[3], (2 * this.x8[4]), (2 * this.x8[4]));
      //  g2d.draw(e2);
        this.extraEllipse.add(0, new ExtraEllipse(this.x8[3], this.y8[3], 2 * this.x8[4], 2 * this.x8[4]));
        Ellipse2D.Double e3 = new Ellipse2D.Double(this.x8[6], this.y8[6], (2 * this.x8[7]), (2 * this.x8[7]));
        //     g2d.draw(e3);
        this.extraEllipse.add(0, new ExtraEllipse(this.x8[6], this.y8[6], 2 * this.x8[7], 2 * this.x8[7]));
        //   g2d.drawLine(this.x8[0], this.y8[7], this.x8[0] - 5, this.y8[7]);
        this.extraLine.add(0, new ExtraLine(this.x8[0], this.y8[7], this.x8[0] - 5, this.y8[7]));
        //    g2d.drawLine(this.x8[1], this.y8[7], this.x8[1] + 5, this.y8[7]);
        this.extraLine.add(0, new ExtraLine(this.x8[1], this.y8[7], this.x8[1] + 5, this.y8[7]));
        //    g2d.drawLine(this.x8[3], this.y8[2], this.x8[3] - 5, this.y8[2]);
        this.extraLine.add(0, new ExtraLine(this.x8[3], this.y8[2], this.x8[3] - 5, this.y8[2]));
        //   g2d.drawLine(this.x8[4], this.y8[2], this.x8[4] + 5, this.y8[2]);
        this.extraLine.add(0, new ExtraLine(this.x8[4], this.y8[2], this.x8[4] + 5, this.y8[2]));
        //     g2d.drawLine(this.x8[6], this.y8[5], this.x8[6] - 5, this.y8[5]);
        this.extraLine.add(0, new ExtraLine(this.x8[6], this.y8[5], this.x8[6] - 5, this.y8[5]));
        //     g2d.drawLine(this.x8[7], this.y8[5], this.x8[7] + 5, this.y8[5]);
        this.extraLine.add(0, new ExtraLine(this.x8[7], this.y8[5], this.x8[7] + 5, this.y8[5]));
        //  g2d.drawLine(this.x8[0], this.y8[7] - 1, this.x8[0] - 5, this.y8[7] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[0], this.y8[7] - 1, this.x8[0] - 5, this.y8[7] - 1));
        //     g2d.drawLine(this.x8[1], this.y8[7] - 1, this.x8[1] + 5, this.y8[7] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[1], this.y8[7] - 1, this.x8[1] + 5, this.y8[7] - 1));
        //     g2d.drawLine(this.x8[3], this.y8[2] - 1, this.x8[3] - 5, this.y8[2] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[3], this.y8[2] - 1, this.x8[3] - 5, this.y8[2] - 1));
        //       g2d.drawLine(this.x8[4], this.y8[2] - 1, this.x8[4] + 5, this.y8[2] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[4], this.y8[2] - 1, this.x8[4] + 5, this.y8[2] - 1));
        //      g2d.drawLine(this.x8[6], this.y8[5] - 1, this.x8[6] - 5, this.y8[5] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[6], this.y8[5] - 1, this.x8[6] - 5, this.y8[5] - 1));
        //      g2d.drawLine(this.x8[7], this.y8[5] - 1, this.x8[7] + 5, this.y8[5] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[7], this.y8[5] - 1, this.x8[7] + 5, this.y8[5] - 1));
        if ( teksting) {   
        
        String v1 = "Dimension 2 = " + this.vec[21] + " mm";
        //     g2d.drawString(v1, this.x8[1] + 40, this.y8[7]);
     //   this.extraTall.add(0, new ExtraTall(v1, this.x8[1] + 40, this.y8[7]));
        v1 = "Dimension 1 = " + this.vec[20] + " mm";
        //     g2d.drawString(v1, this.x8[4] + 40, this.y8[2]);
    //    this.extraTall.add(0, new ExtraTall(v1, this.x8[4] + 40, this.y8[2]));
        v1 = "Dimension 3 = " + this.vec[23] + " mm";
        //    g2d.drawString(v1, this.x8[7] + 40, this.y8[5]);
     //   this.extraTall.add(0, new ExtraTall(v1, this.x8[7] + 40, this.y8[5]));
        
  
        	int xstep = 110;
        	int ystep = 20;
            this.extraText.add(0, new ExtraText("Dimension2 "     , this.x8[4] + 20, this.y8[7]));   
            this.extraText.add(0, new ExtraText("Dimension1 " ,  this.x8[4] + 20, this.y8[2]));
            this.extraText.add(0, new ExtraText("Dimension3 " , this.x8[4] + 20, this.y8[5]));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[21]))).toString(),this.x8[4] + 40+ xstep , this.y8[7]));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[20]))).toString(), this.x8[4] + 40 + xstep, this.y8[2] ));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[23]))).toString(), this.x8[4] + 40 + xstep, this.y8[5]));
            this.extraText.add(0, new ExtraText(" mm" ,this.x8[4] + 40+ xstep + ystep, this.y8[7]   ));
            this.extraText.add(0, new ExtraText(" mm" , this.x8[4] + 40+ xstep + ystep, this.y8[2] ));
            this.extraText.add(0, new ExtraText(" mm" , this.x8[4] + 40 + xstep+ystep, this.y8[5] ));
        	
        	
        }
      } 
      
      if (this.plotType.equals("On plate")) {
        Path2D.Double curvCJPlate = new Path2D.Double();
        for (int i = 0; i < 6 * Welding.this.s; i += 20) {
          QuadCurve2D.Double curveCJPlate = new QuadCurve2D.Double(this.x2[1], (this.y2[1] + i), 0.0D, (this.y2[1] + i + 10), this.x2[7], (this.y2[1] + i));
          //    g2d.draw(curveCJPlate);
          this.extraBue.add(0, new ExtraBue(this.x2[1], this.y2[1] + i, 0, this.y2[1] + i + 10, this.x2[7], this.y2[1] + i));
        } 
        if ( teksting) {   
        String v1 = "            Dimension 1 = " + this.vec[20] + " mm";
        //     g2d.drawString(v1, this.x2[2], this.y2[2] + 10);
      //  this.extraTall.add(0, new ExtraTall(v1, this.x2[2], this.y2[2] + 10));
        v1 = "          Dimension 2 = " + this.vec[21] + " mm";
        //      g2d.drawString(v1, this.x1[1], this.y1[1]);
     //   this.extraTall.add(0, new ExtraTall(v1, this.x1[1], this.y1[1]));

        	int xstep = 110;
        	int ystep = 20;
            this.extraText.add(0, new ExtraText("Dimension1 "     ,this.x1[1]- 4*ystep, this.y2[2] + 10));   
            this.extraText.add(0, new ExtraText("Dimension2 " , this.x1[1]- 4*ystep, this.y1[1] + 2*ystep));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[20]))).toString(),this.x1[1]- 3*ystep+ xstep , this.y2[2] + 10));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[21]))).toString(), this.x1[1]- 3*ystep  + xstep, this.y1[1] + 2*ystep));
       //     this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[2]))).toString(), xst + xstep, yst + 2*ystep));
            this.extraText.add(0, new ExtraText(" mm" , this.x1[1]+ ystep + xstep - 3*ystep, this.y2[2] + 10 ));
            this.extraText.add(0, new ExtraText(" mm" , this.x1[1]+ ystep + xstep - 3*ystep,  this.y1[1] + 2*ystep));
       //     this.extraText.add(0, new ExtraText(" mm" , xst + xstep+ystep, yst + 2*ystep ));
        	
        	
        }
      } 
      
      if (this.plotType.equals("Cross joint")) {
        Path2D.Double curvCJ1 = new Path2D.Double();
        int i;
        for (i = 0; i < 4 * Welding.this.s; i += 20) {
          QuadCurve2D.Double double_ = new QuadCurve2D.Double((this.x1[0] + i), this.y1[0], (this.x1[0] + i + 10), 0.0D, (this.x1[3] + i), this.y1[3]);
          //        g2d.draw(double_);
          this.extraBue.add(0, new ExtraBue(this.x1[0] + i, this.y1[0], this.x1[0] + i + 10, 0, this.x1[3] + i, this.y1[3]));
        } 
        for (i = 0; i < 4 * Welding.this.s; i += 20) {
          QuadCurve2D.Double curveCJ1a = new QuadCurve2D.Double((this.x4[0] + i), this.y4[0], (this.x4[0] + i + 10), 0.0D, (this.x4[3] + i), this.y4[3]);
          //       g2d.draw(curveCJ1a);
          this.extraBue.add(0, new ExtraBue(this.x4[0] + i, this.y4[0], this.x4[0] + i + 10, 0, this.x4[3] + i, this.y4[3]));
        } 
        for (i = 0; i < 6 * Welding.this.s; i += 20) {
          QuadCurve2D.Double double_ = new QuadCurve2D.Double(this.x2[1], (this.y2[1] + i), 0.0D, (this.y2[1] + i + 10), this.x2[7], (this.y2[1] + i));
          //       g2d.draw(double_);
          this.extraBue.add(0, new ExtraBue(this.x2[1], this.y2[1] + i, 0, this.y2[1] + i + 10, this.x2[7], this.y2[1] + i));
        } 
        for (i = 0; i < 8 * Welding.this.s; i += 20) {
          QuadCurve2D.Double double_ = new QuadCurve2D.Double((this.x3[0] + i), this.y3[0], (this.x3[0] + i + 10), this.y3[1], (this.x3[0] + i), this.y3[2]);
          //         g2d.draw(double_);
          this.extraBue.add(0, new ExtraBue(this.x3[0] + i, this.y3[0], this.x3[0] + i + 10, this.y3[1], this.x3[0] + i, this.y3[2]));
        } 
        QuadCurve2D.Double curveCJ1 = new QuadCurve2D.Double(this.x8[0], this.y8[0], this.x8[2], this.y8[2], this.x8[1], this.y8[1]);
        Path2D.Double curvCJ2 = new Path2D.Double();
        QuadCurve2D.Double curveCJ2 = new QuadCurve2D.Double(this.x8[0], this.y8[0], this.x8[2], this.y8[4], this.x8[1], this.y8[1]);
        Ellipse2D.Double e1 = new Ellipse2D.Double(this.x8[0], this.y8[2], (2 * this.x8[1]), (2 * this.x8[1]));
        //    g2d.draw(e1);
        this.extraEllipse.add(0, new ExtraEllipse(this.x8[0], this.y8[2], 2 * this.x8[1], 2 * this.x8[1]));
        //     g2d.drawLine(this.x8[1], this.y8[3], this.x8[1] + 5, this.y8[3]);
        this.extraLine.add(0, new ExtraLine(this.x8[1], this.y8[3], this.x8[1] + 5, this.y8[3]));
        //     g2d.drawLine(this.x8[0], this.y8[3], this.x8[0] - 5, this.y8[3]);
        this.extraLine.add(0, new ExtraLine(this.x8[0], this.y8[3], this.x8[0] - 5, this.y8[3]));
        //      g2d.drawLine(this.x8[1], this.y8[3] - 1, this.x8[1] + 5, this.y8[3] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[1], this.y8[3] - 1, this.x8[1] + 5, this.y8[3] - 1));
        //      g2d.drawLine(this.x8[0], this.y8[3] - 1, this.x8[0] - 5, this.y8[3] - 1);
        this.extraLine.add(0, new ExtraLine(this.x8[0], this.y8[3] - 1, this.x8[0] - 5, this.y8[3] - 1));
        
        if ( teksting) {  
    
        String v1 = "            Dimension 2 = " + this.vec[21] + " mm";
        //       g2d.drawString(v1, this.x2[4], this.y2[4] + 10);
   //     this.extraTall.add(0, new ExtraTall(v1, this.x2[4], this.y2[4] + 10));
        v1 = "               Dimension 1 = " + this.vec[20] + " mm";
        //      g2d.drawString(v1, this.x3[1], this.y3[1]);
   //     this.extraTall.add(0, new ExtraTall(v1, this.x3[1], this.y3[1]));
        v1 = "               Dimension 1 = " + this.vec[20] + " mm";
        //       g2d.drawString(v1, this.x4[2], this.y4[2]);
   //     this.extraTall.add(0, new ExtraTall(v1, this.x4[2], this.y4[2]));

        

        	int xstep = 110;
        	int ystep = 20;
            this.extraText.add(0, new ExtraText("Dimension2 "     ,  this.x3[1]- 4*ystep, this.y2[4] + 10- 8*ystep));   
            this.extraText.add(0, new ExtraText("Dimension1 " , this.x3[1]-4*ystep, this.y3[1] + 3*ystep));
      //      this.extraText.add(0, new ExtraText("Dimention 3 " , this.x3[1], this.y3[1]));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[21]))).toString(), this.x3[1]- 3*ystep+ xstep , this.y2[4] + 10 - 8*ystep));
            this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[20]))).toString(),  this.x3[1]- 3*ystep  + xstep, this.y3[1] + 3*ystep));
      //      this.extraText.add(0, new ExtraText((new StringBuilder(String.valueOf(this.vec[20]))).toString(), this.x3[1] + xstep,this.y3[1] + 2*ystep));
            this.extraText.add(0, new ExtraText(" mm" ,  this.x3[1]- 3*ystep + xstep + ystep, this.y2[4] + 10 - 8*ystep ));
            this.extraText.add(0, new ExtraText(" mm" ,  this.x3[1] - 3*ystep + xstep + ystep, this.y3[1] + 3*ystep));
      //     this.extraText.add(0, new ExtraText(" mm" , this.x3[1]+ xstep- 2*ystep, this.y3[1] + 2*ystep ));
        	
        	
        }
      } 
      
      if (this.plotType.equals("corner")) {
    	 
        String v0 = " 1 ";
        //  g2d.drawString(v0, this.x1[0] + this.vec[1] / 4, this.y1[0] - 2 * this.vec[1]);
        this.extraTall.add(0, new ExtraTall(v0, this.x1[0] + this.vec[1] / 4, this.y1[0] - 2 * this.vec[1]));
        v0 = " 2 ";
        //     g2d.drawString(v0, this.x2[0] - this.vec[2], this.y2[0] - 2 * this.vec[2]);
        this.extraTall.add(0, new ExtraTall(v0, this.x2[0] - this.vec[2], this.y2[0] - 2 * this.vec[2]));
        //    g2d.drawLine(this.x2[0], this.y2[0], this.x2[0] + 5, this.y2[0] - this.vec[2]);
        this.extraLine.add(0, new ExtraLine(this.x2[0], this.y2[0], this.x2[0] + 5, this.y2[0] - this.vec[2]));
        //     g2d.drawLine(this.x2[0] + 5, this.y2[0] - this.vec[2], this.x2[3], this.y2[3]);
        this.extraLine.add(0, new ExtraLine(this.x2[0] + 5, this.y2[0] - this.vec[2], this.x2[3], this.y2[3]));
        
      } 
      if (this.plotType.equals("overlap")) {
        String v0 = " 1 ";
        //     g2d.drawString(v0, this.x1[4] - 20, this.y1[4] + 10);
        this.extraTall.add(0, new ExtraTall(v0, this.x1[4] - 20, this.y1[4] + 10));
        v0 = " 2 ";
        //     g2d.drawString(v0, this.x2[4] + 20, this.y2[4] + 5);
        this.extraTall.add(0, new ExtraTall(v0, this.x2[4] + 20, this.y2[4] + 5));
      } 
   ///////////////////////////////////////////////////////////////////////////////////////////
    	Color back = new Color(240,240,240); 		
      	g2d.setColor(back);
  //    	g2d.fillOval(-1, -1, 20, 20);
  	//////////////////////////////////////////
//	  g2d.translate( 150,   180);
  	///////////////////////////////////////////////////////////////////////////////////
  	
    if ( plotType.equals("filet") && gang[19] != 90  ) {
      	int rotMot =  ( gang[19] - 90);
 		g2d.drawLine( 0,  0,  0, 0);
    		g2d.rotate(Math.PI * rotMot / 180.0D);	
      	}
//radio(10,10);
  	if( gang[2] == 13) {
  		gang[6] = 0;
  		original = true;
  	}
  	if( gang[2] == 14) {
  		original= true;
  	}
    gang[22] = x1[13];
    gang[21] = y1[14];
//System.out.println("12432  " + x1[13] + " " + y1[14] );
    g2d.setFont(new Font("Serif", Font.BOLD,25));
    //////////////////////////
  	if ( gang[6] == 1)  {
  		new MenuComment(g, gang, extraComment);
  	}

    if (this.gang[5] == 0) {
        MenuElement tegnDate = new MenuElement(g, gang, extraLine, extraBue, extraEllipse, extraTall, extraBase, plotType, extraTallBase);
      	if ( teksting) {
      		new MenuText(g, gang, extraText,extraLineTabell );
      	}
    	if (tegning) {
    		MenuTegning tegningDate = new MenuTegning(g, gang, extraLineTegn, extraBueTegn, extraArrayTegn, extraTallTegn, extraBase, plotType);
        }
   //  new MenuClass(g);
    }
//    System.out.println("12423  " + x1[13] + " " + y1[14] );
      if (this.gang[5] == 1) {
        this.resultat = "Standard";
        this.original = true;
        MenuElement tegnDate = new MenuElement(g, gang, extraLine, extraBue, extraEllipse, extraTall, extraBase, plotType, extraTallBase);
      	if ( teksting) {
      		new MenuText(g, gang, extraText,extraLineTabell );
      	}
        if (tegning) {
            MenuTegning tegningDate = new MenuTegning(g, gang, extraLineTegn, extraBueTegn, extraArrayTegn, extraTallTegn, extraBase, plotType);
            }
 
      //      new MenuClass(g);
        musDemoNew(this.plotType, g);
      } 

      if (this.gang[5] == 2) {
        this.resultat = "Standard";
        this.original = false;
        MenuElement tegnDate = new MenuElement(g, gang, extraLine, extraBue, extraEllipse, extraTall, extraBase, plotType, extraTallBase);
      	if ( teksting) {
      		new MenuText(g, gang, extraText,extraLineTabell );
      	}
        if (tegning) {
       // 	 new MenuClass(g);
        MenuTegning tegningDate = new MenuTegning(g, gang, extraLineTegn, extraBueTegn, extraArrayTegn, extraTallTegn, extraBase, plotType);
        }
     
       
    //    new MenuMenu(g);
        musDemoNew(this.plotType, g);
      } 
      if ( plotType.equals("filet") && gang[19] != 90  ) {
        	int rotMot =  ( gang[19] - 90);
   		g2d.drawLine( 0,  0,  0, 0);
      		g2d.rotate(-Math.PI * rotMot / 180.0D);	
        	}
 //     System.out.println("12479  " + x1[13] + " " + y1[14] );
      if (Welding.this.generateOnFile.booleanValue()) {
        paintImage(g); 
   }
   }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public  void paintImage(Graphics g) {
      WeldData wListe = new WeldData(Welding.this.sveiseListe);
   //   Graphics2D g2de = (Graphics2D)g;
    	Color back = new Color(240,240,240); 
      int scaler = y1[14];
      int copyScaler = scaler;
      int xflytt = 0;
      int yflytt = 0;
      Path2D.Double qqss = new Path2D.Double();
      ////////////////////////////////////////////////////
      /*
 	 try {
			Welding weld = new Welding();
			System.out.println( weld.resultListe.size());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      */
      ////////////////
      if (this.gang[7] == 1) {
        this.gang[0] = 0;
        this.gang[1] = 0;
        this.gang[2] = 13;      
        this.gang[6] = 1;       
        } 
      
      /////////////////////////////////////////////////////////
      int width = 1600;
      int height = 1144;
      int transX = -xP/4;
      int transY = -yP/4;
      
      if ( gang[2] == 0 && y1[14] == 100  ) {
       width = 800;
       height = 572;
       transX = -xP/4;
       transY = -yP/4 ;
  //     y1[14] = 120;    // avbildes i lite format
      }
      if ( gang[2] == 0 && y1[14] == 160 ) {    // standard
          width = 800;
          height = 572;
          transX = -xP/4-140;
          transY = -yP/4 -160;
     //     y1[14] = 120;    // avbildes i lite format
         }
      if (this.gang[2] == 1) {
        width = 1680;
        height = 1080;
        transX = 0;
        transY = 0;
      } 
      if (this.gang[2] == 2) {
        width = 600;
        height = 397;
        transX = -100;
        transY = 0;
      } 
      if (this.gang[2] == 3) {
        width = 400;
        height = 280;
        transX = -200;
        transY = -200;
      } 
      if (this.gang[2] == 4) {
        width = 280;
        height = 196;
        transX = -270;
        transY = -230;
        this.y1[14] = 70;
      } 
      if (this.gang[2] == 5) {
        width = 196;
        height = 140;
        transX = -305;
        transY = -240;
        this.y1[14] = 50;
      } 
      if (this.gang[2] == 6) {
        width = 140;
        height = 98;
        transX = -330;
        transY = -270;
        this.y1[14] = 35;
      } 
      if (this.gang[2] == 7 || this.gang[2] == 8 || this.gang[2] == 9 || this.gang[2] == 10) {
        width  = 1600;  // 1342
        height = 1144;  // 962
        transX = 0;
        transY = 0;
 //       this.y1[14] = 160;
      } 
      if (this.gang[2] == 11  ) {
        width  = 1600;  // 1341
        height = 1144;  // 961
        transX = 0;
        transY = 0;
   //     this.y1[14] = 120;
      } 
     
      if (this.gang[2] == 12 ) {
          width  = 1600;  // 1341
          height = 1144;  // 961
          transX = 0;
          transY = 0;
     //     this.y1[14] = 120;
        }
       
      
      
      if (this.gang[2] == 15 ) {
          width  = 1600;  // 1341
          height = 1144;  // 961
          transX = 0;
          transY = 0;
     //     this.y1[14] = 120;
        } 
      if (this.gang[2] == 16) {
          width  = 1600;  // 1341
          height = 1144;  // 961
          transX = 0;
          transY = 0;
     //     this.y1[14] = 120;
        } 
      if (this.gang[2] == 13) {
        width = 1600;  // 1820
        height = 1144;  // 1300
        transX =  -1000 ;
        transY = -700 ;
  //      this.y1[14] = 400;

      } 
      if (this.gang[2] == 14) {
        width = 1600;   // 1680
        height = 1144;  // 1200
        transX = -800;
        transY = -700;
    //    this.y1[14] = 200;

      } 
      
      ////////////////////////////////////////////////////////////////////////////////////////////
      if (this.gang[1] == 1) {
        Welding.this.tegning = true;
      } else {
        Welding.this.tegning = false;
      } 
      if (this.gang[0] == 1) {
        Welding.this.teksting = true;
      } else {
        Welding.this.teksting = false;
      } 
      
      ////////////////////////////////////////////////////////////////////////////////////////
      Graphics2D g2dC = Welding.this.buffCopy.createGraphics();
      g2dC.setComposite(AlphaComposite.Clear);
      g2dC.setBackground(Color.WHITE);
      g2dC.fillRect(0, 0, width, height);
      BufferedImage buffImg = new BufferedImage(width, height, 2);
      Graphics2D g2d = buffImg.createGraphics();
      g2d.setFont(new Font("Serif", Font.BOLD,25));
      BufferedImage combined = new BufferedImage(width, height, 2);
      Graphics2D g2d2d = combined.createGraphics();
      Stroke oldStroke = g2d.getStroke();
      Stroke thichness05 = new BasicStroke(0.5F);
      Stroke thichness005 = new BasicStroke(0.05F);
      Stroke thichness1 = new BasicStroke(1.0F);
      Stroke thichness3 = new BasicStroke(3.0F);
      Stroke thichness6 = new BasicStroke(6.0F);
      Stroke dashed = new BasicStroke(3.0F, 0, 2, 0.0F, new float[] { 9.0F }, 0.0F);
      Stroke stroke = new BasicStroke(3.0F, 0, 2, 0.0F, new float[] { 1.0F }, 0.0F);
      float[] dashingPattern1 = { 2.0F, 2.0F };
      Stroke stroke1 = new BasicStroke(2.0F, 0, 2, 1.0F, dashingPattern1, 2.0F);
      float[] dashingPattern2 = { 10.0F, 4.0F };
      Stroke stroke2 = new BasicStroke(4.0F, 0, 2, 1.0F, dashingPattern1, 0.0F);
      float[] dashingPattern3 = { 10.0F, 10.0F, 1.0F, 10.0F };
      Stroke stroke3 = new BasicStroke(4.0F, 0, 2, 1.0F, dashingPattern1, 0.0F);
      stroke = oldStroke;
      stroke = thichness3;
      dashed = thichness005;
      g2d.setStroke(stroke);
      Color c = new Color(255, 255, 255, 255);
      g2d.setBackground(c);
      ////////////////////////////////////////////////////////////////////////////////////////////////////////
      RenderingHints rh = new RenderingHints(
          RenderingHints.KEY_ANTIALIASING, 
          RenderingHints.VALUE_ANTIALIAS_ON);
 
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      /*
      if (this.gang[7] == 1) 
      {
        if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Lap joint") || this.plotType.equals("On plate")) 
        {
          g2d.translate(50, -100);
        } else {
          g2d.translate(-300, -400);
        }  
      }
      if (this.gang[2] == 14) 
      {
          if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Lap joint") || this.plotType.equals("On plate")) 
          {
    //        g2d.translate(250, 500);
          } 
      }

*/
     /* 
      if (this.gang[2] == 14) 
      {
          if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") ) 
          {
            g2d.translate(0, 200);
          } 
      }
      */
      ////////////////////////////////////////////////////////////////////////////////////////////////////
      if (this.gang[2] != 7 && this.gang[2] != 8 && this.gang[2] != 9 && this.gang[2] != 10 && this.gang[2] != 11 && this.gang[2] != 12 && this.gang[2] != 15 && this.gang[2] != 16)
          g2d.clearRect(0, 0, width, height); 
      
      if (this.gang[2] == 7) {
        g2d.clearRect(0, 0, 800, 572);
        transX = -230;  // -70
        transY = -230;  // -60
    //    this.y1[14] = 50;
      } 
      if (this.gang[2] == 8) {
        g2d.clearRect(800, 0, 800, 572);
        transX = 550; // 600
        transY = -230;
    //    this.y1[14] = 50;
      } 
      if (this.gang[2] == 9) {
        g2d.clearRect(0, 572, 800, 572);
        transX = -230;
        transY = 300;  // 400
  //     this.y1[14] = 50;
      } 
      if (this.gang[2] == 10) {
        g2d.clearRect(800, 572, 800, 572);
        transX = 550;
        transY = 300;
   //     this.y1[14] = 50;
      } 
      if (this.gang[2] == 11) {
        g2d.clearRect(0, 0, 1600, 572);
        transX = -230;
        transY = -230;
  //      this.y1[14] = 0;
      } 
      if ( this.y1[14] == 250 && this.gang[2] == 12) {
        g2d.clearRect(0, 572, 1600, 572);
        transX = -800;
        transY = -600;
    //    this.y1[14] = 0;
      } 
   
      if ( this.y1[14] == 500 && this.gang[2] == 12) {   //  this.y1[14] == 600 && this.gang[2] == 12) {   //  this.y1[14] == 600 && 
          g2d.clearRect(0, 572, 1600, 572);
          transX = 0;
          transY = 0;
      //    this.y1[14] = 0;
          
          if (this.plotType.equals("Butt") || this.plotType.equals("butt")) {
    	//	  g2d.translate(150,  180);
              transX = -1200;
              transY = -700;
    	  }
    	  if (this.plotType.equals("filet")) {
    //		  g2d.translate(250,  100);
              transX = -1000;
              transY = -700;
    	  }
    	  if (this.plotType.equals("corner")) {
    	//	  g2d.translate(150,  550);
              transX = -1000;
              transY = -400;
    	  }
    	  if (this.plotType.equals("overlap")) {
    	//	  g2d.translate(500,  0);
              transX = -1000;
              transY = -900;
    	  }
    	  if (this.plotType.equals("flanged")) {
    	//	  g2d.translate(250,  -200);
              transX = -1000;
              transY = -900;
    	  }
    	  if (this.plotType.equals("Cross joint")) {
    //		  g2d.translate(250,  900);
              transX = -1200;
              transY = -50;
    	  }
    	  if (this.plotType.equals("Strap joint")) {
    //		  g2d.translate(250,  900);
              transX = -1000;
              transY = -100;
    	  }
    	  if (this.plotType.equals("Lap joint")) {
    //		  g2d.translate(250,  700);
              transX = -1000;
              transY = -400;
    	  }
    	  if (this.plotType.equals("On plate")) {
    //		  g2d.translate(250,  -400);
              transX = -1000;
              transY = -1000;
    	  } 
          
        } 
      if (this.gang[2] == 15) {
        g2d.clearRect(0, 0, 800, 1144);
        transX = -230;
        transY = -200;
  //     this.y1[14] = 0;
      } 

      if ( this.y1[14] == 500 && this.gang[2] == 16) {   //  this.y1[14] == 600 && this.gang[2] == 12) {   //  this.y1[14] == 600 && 
    	  g2d.clearRect(800, 0, 800, 1144);
          transX = 0;
          transY = 0;
      //    this.y1[14] = 0;
          
          if (this.plotType.equals("Butt") || this.plotType.equals("butt")) {
    	//	  g2d.translate(150,  180);
              transX =  -700;
              transY = -800;
    	  }
    	  if (this.plotType.equals("filet")) {
    //		  g2d.translate(250,  100);
              transX = -900;
              transY = -800;
    	  }
    	  if (this.plotType.equals("corner")) {
    	//	  g2d.translate(150,  550);
              transX = -900;
              transY = -500;
    	  }
    	  if (this.plotType.equals("overlap")) {
    	//	  g2d.translate(500,  0);
              transX = -600;
              transY = -900;
    	  }
    	  if (this.plotType.equals("flanged")) {
    	//	  g2d.translate(250,  -200);
              transX = -700;
              transY = -900;
    	  }
    	  if (this.plotType.equals("Cross joint")) {
    //		  g2d.translate(250,  900);
              transX = -700;
              transY = -50;
    	  }
    	  if (this.plotType.equals("Strap joint")) {
    //		  g2d.translate(250,  900);
              transX = -700;
              transY = -400;
    	  }
    	  if (this.plotType.equals("Lap joint")) {
    //		  g2d.translate(250,  700);
              transX = -700;
              transY = -400;
    	  }
    	  if (this.plotType.equals("On plate")) {
    //		  g2d.translate(250,  -400);
              transX = -700;
              transY = -1300;
    	  } 
          
        } 
      if ( this.y1[14] == 600 && this.gang[2] == 16) {
          g2d.clearRect(800, 0, 800, 1144);
          transX = 200;
          transY = 0;
    //      this.y1[14] = 0;
        }
////////////////////////////////////////////////////////////////////

   
      
      g2d.setColor(Color.BLACK);
      g2d.translate(transX, transY);
      g2d.setRenderingHints(rh);
////////////////////////(((((((((((((((((((((((((((((((((((((((
    
      if ( plotType.equals("filet") && gang[19] != 90  ) {
        	int rotMot =  ( gang[19] - 90);
   		g2d.drawLine( 0,  0,  0, 0);
      		g2d.rotate(Math.PI * rotMot / 180.0D);	
        	}
      /* 
  	if ( gang[6] == 1)  {
     		new MenuComment(g, gang, extraComment);
    	}
          MenuElement tegnDate = new MenuElement(g, gang, extraLine, extraBue, extraEllipse, extraTall, extraBase, plotType, extraTallBase);
        	if ( teksting) {
        		new MenuText(g, gang, extraText,extraLineTabell );
        	}
      	if (tegning) {
      		MenuTegning tegningDate = new MenuTegning(g, gang, extraLineTegn, extraBueTegn, extraArrayTegn, extraTallTegn, extraBase, plotType);
          }
      ///////////////((((((((((((((((((((((((((((((((((((((((((
*/ 
      
  
///////////////////////////////////////////////////////////
      int  roter = x1[13];
      int xtrans = transX;
      int ytrans = transY;
      
      /*
		if ((gang[2]== 13 || gang[2] == 14  )) {    // korreksjon for ikke visking
			ytrans = 250;
			xtrans = 490;	
			if (plotType.equals("corner")) {
				ytrans = 100;
			}
			if ( gang[2]== 13 ) {
				ytrans = ytrans - 100;
				xtrans = xtrans - 340;
		        if (plotType.equals("Cross joint") || plotType.equals("Strap joint") || plotType.equals("Lap joint") ) {
					scale = 250;
					ytrans = ytrans + 200;
				}
		        if ( plotType.equals("On plate")) {
					scale = 250;
					ytrans = ytrans ;
				}
		
		}
		}

      System.out.println("12814 " + (xP + xtrans) + " " + (yP + ytrans));
		    roter = x1[13];
			g2d.translate(xP+xtrans, yP+ytrans );
			g2d.scale(scaler/100.0, scaler/100.0);
			g2d.rotate(Math.PI * roter / 180.0D);	
		*/	
			
      ////////////////////////////////////////////////////////

	
    scaler = y1[14];

    gang[22] = x1[13];
    gang[21] = y1[14];
//   System.out.println( " 14252 kommentar: scaler roter " + scaler + "  " + roter);
//  System.out.println( " 14253 kommentar: scaler roter " + y1[14] + "  " + x1[13]);
    

    
    
 	///////////////////////////////
 	// tegning av figur MenuElement
//	System.out.println("scaler justert =  " + scaler/100.0);

    if (roter >= 0) {
      if (scaler > 0) {
        if (scaler < 1000) {
          g2d.scale(scaler / 100.0, scaler / 100.0);
        } else {
         g2d.scale(scaler / 100.0, scaler / 100.0);
        } 
        double factor = scaler / 100.0D;
        double deltaXD = this.xP / factor;
        double deltaYD = this.yP / factor;
        int facx = (int)deltaXD;
        int facy = (int)deltaYD;
   //     System.out.println("13110  " + facx + "  " + facy);
        /*
        if (this.gang[2] == 13) {
          facx += this.xP / 13;
          facy += this.yP / 12;
        } 
        if (this.gang[2] == 14) {
          facx += 105 * this.xP / 256;
          facy += 31 * this.yP / 128;
        } 
        if (this.gang[2] == 7 || this.gang[2] == 8 || this.gang[2] == 9 || this.gang[2] == 10) {
       //   facx = 240;
       //   facy = 100;
        } 
        */
  //      g2d.translate(-this.xP + facx, -this.yP + facy);
      } 
  /*
      if ( plotType.equals("filet") && gang[19] != 90  ) {
      	int rotMot =  ( gang[19] - 90);
 		g2d.drawLine( 0,  0,  0, 0);
    		g2d.rotate(Math.PI * rotMot / 180.0D);	
      	}
      
     */
      
      /////////////////////////////// kommentar start
      int tranX = 0;
      int tranY = 0;

    	if ( gang[6] == 1) {
       g2d.setColor(Color.BLUE);
       ExtraComment atall = new ExtraComment();
       for (int m = 0; m < this.extraComment.size(); m++) {
         atall = this.extraComment.get(m);
         int i1 = atall.getFirstX() + this.xP + tranX;
         int j1 = atall.getFirstY() + this.yP + tranY;
         String testTall = atall.getLastString();
         g2d.drawString(testTall, i1, j1);
       } 

    	}

//////////////////////////////////kommentar slutt      
      
 //// drawElement(g);
  	 /////////////////////////////////////////element start forberedelse

      
 
      int facult = (99 - gang[19])/10 ;
      int rest = (99 - gang[19])%10 ;
 //     System.out.println( "fac  " + facult);
      if( y1[14] == 100 ) {
          xflytt = -88*facult;
          yflytt =  66*facult; 
      }
      if( y1[14] == 160 ) {
    	  if ( facult == 0) {   
              xflytt = -68;
              yflytt =  88;   
    	  }
    	  if ( facult == 1) {  // 80
    			  xflytt = -68*facult;
    			  yflytt =  66*facult; 
    	  }
      	 if ( facult == 2) {  // 70
        			  xflytt = -150;
        			  yflytt = 117;        	
      	 }	  
    	 if ( facult == 3) {  // 60
        			  xflytt = -170;
        			  yflytt =   157;  
    	 }
    	 if ( facult == 4) {  // 50
        			  xflytt =   -320;
        			  yflytt =  175;  
      	 }
     }
      if( y1[14] == 500 ) {
 //   	  System.out.println(y1[14] + "  " + facult);

    	  if ( facult == 1) {  // 80
    			  xflytt = -65;
    			  yflytt =  66; 
    	  }
      	 if ( facult == 2) {  // 70
        			  xflytt = -145;
        			  yflytt = 118;        	
      	 }	  
    	 if ( facult == 3) {  // 60
        			  xflytt = -230;
        			  yflytt =   156;  
    	 }
    	 if ( facult == 4) {  // 50
        			  xflytt =   -320;
        			  yflytt =  177;  
      	 }
     }
      if( y1[14] == 400 ) {
    	  if ( facult == 0) {   
     //         xflytt = -68;
      //        yflytt =  88;   
    	  }
    	  if ( facult == 1) {  // 80
    			  xflytt = -68*facult;
    			  yflytt =  66*facult; 
    	  }
      	 if ( facult == 2) {  // 70
        			  xflytt = -143;
        			  yflytt = 115;        	
      	 }	  
    	 if ( facult == 3) {  // 60
        			  xflytt = -230;
        			  yflytt =   155;  
    	 }
    	 if ( facult == 4) {  // 50
        			  xflytt =   -320;
        			  yflytt =  176;  
      	 }
     }
      if( y1[14] == 250 ) {
          xflytt =  -40;
          yflytt =  66; 
      }

      

 //     System.out.println(g2d.translate.xProperty());
  // kommenter ut denne og tekst og figur blir ikke rotert  - riktig for 80 grader
  //  	qqss.moveTo(399,348);  // 1
      if ( plotType.equals("filet") && gang[19] != 90  ) {
      	int rotMot =  ( gang[19] - 90);
  //    	xflytt = 0;
  //   	yflytt = 0;
 //     	rotMot = -10;  // sette alle vinkler til 80 grader rotasjon
 //     	System.out.println(" flytt " + -xflytt + "  " + -yflytt);
      	g2d.translate( -xflytt, -yflytt);    // flytter slik at det blir korrekt for 80
//      	qqss.moveTo(0,0);
		g2d.drawLine( 0,  0,  0, 0);
    		g2d.rotate(-Math.PI * rotMot / 180.0D);	
    
    	
      	}
      
      ////////////////////////element f0rberedelse slutt
      if( y1[14] == 400 && gang[19] == 60 ) {
    	  g2d.translate(100, 100);
      }
      if( y1[14] == 400 && gang[19] == 50 ) {
    	  g2d.translate(180, 110);
      }
      if( y1[14] == 500 && gang[19] == 80 ) {
    	  g2d.translate(10, 10);
      }
      if( y1[14] == 500 && gang[19] == 70 ) {
    	  g2d.translate(30, 30);
      }
      if( y1[14] == 500 && gang[19] == 60 && gang[2] == 12 ) {
    	  g2d.translate(60, 90);
      }
      if( y1[14] == 500 && gang[19] == 50  && gang[2] == 12  ) {
    	  g2d.translate(80, 110);
      }
      if( y1[14] == 500 && gang[19] == 60 && gang[2] == 16 ) {
    	  g2d.translate(100, 40);
      }
      if( y1[14] == 500 && gang[19] == 50  && gang[2] == 16  ) {
    	  g2d.translate(175, 100);
      }
      if( y1[14] == 160 && gang[19] == 50  ) {
    	  g2d.translate(175, 130);
      }
      //////////////////////////////// element start
      if (roter > 0) {
          g2d.rotate(Math.PI * roter / 180.0D);
          double factor = roter / 180.0D;
          double deltaXD = this.xP * factor;
          double deltaYD = this.yP * factor;
          int facx = (int)deltaXD;
          int n = (int)deltaYD;
        } 
        
        // samlet rotasjon ferdig
      
      if ( plotType.equals("filet") ) {
        	int rotMot =  ( gang[19] - 90);
        	if (gang[19] != 90 ) {
        		g2d.drawLine( 0,  0,  0, 0);
    		 g2d.rotate(-Math.PI * rotMot / 180.0D);
    	
    	}
      }
      ExtraLine hline = new ExtraLine();
      g2d.setColor(Color.BLACK);
      for (int i = 0; i < this.extraLine.size(); i++) {
        hline = this.extraLine.get(i);
        int i1 = hline.getFirstX() + this.xP;
        int j1 = hline.getFirstY() + this.yP;
        int i2 = hline.getLastX() + this.xP;
        int j2 = hline.getLastY() + this.yP;
 //       System.out.println(  i + "  " + i1 + "  " + j1 +"  " +  i2 +"  " +  j2 );
        if ( !(i1 == xP && j1 == yP && i2 ==xP && j2 == yP)) {
   //        System.out.println(  i + "  " + i1 + "  " + j1 +"  " +  i2 +"  " +  j2 );
           
          g2d.drawLine(i1, j1, i2, j2);
           }
   

      } 
      ExtraEllipse hellips = new ExtraEllipse();
      g2d.setColor(Color.BLACK);
      for (int j = 0; j < this.extraEllipse.size(); j++) {
        hellips = this.extraEllipse.get(j);
        int i1 = hellips.getFirstX() + this.xP;
        int j1 = hellips.getFirstY() + this.yP;
        int i2 = Math.abs(hellips.getLastX());
        int j2 = Math.abs(hellips.getLastY());
        Ellipse2D.Double e23 = new Ellipse2D.Double(i1, j1, i2, j2);
   
        g2d.draw(e23);
      } 
      g2d.setColor(Color.BLACK);
      ExtraBue hbue = new ExtraBue();
      Path2D.Double curvYG39 = new Path2D.Double();
      for (int k = 0; k < this.extraBue.size(); k++) {
        hbue = this.extraBue.get(k);
        int i1 = hbue.getFirstX() + this.xP;
        int j1 = hbue.getFirstY() + this.yP;
        int i2 = hbue.getLastX() + this.xP;
        int j2 = hbue.getLastY() + this.yP;
        int k2 = hbue.getFirstZ() + this.xP;
        int k3 = hbue.getLastZ() + this.yP;
        Path2D.Double curveYG39 = new Path2D.Double();
        QuadCurve2D.Double curveYG391 = new QuadCurve2D.Double(i1, j1, i2, j2, k2, k3);
        g2d.draw(curveYG391);
      } 
      g2d.setColor(Color.BLACK);
      ExtraTall htall = new ExtraTall();
      for (int m = 0; m < this.extraTall.size(); m++) {
        htall = this.extraTall.get(m);
        int i1 = htall.getFirstX() + this.xP;
        int j1 = htall.getFirstY() + this.yP;
        String testTall = htall.getLastString();
        g2d.drawString(testTall, i1, j1);
      } 
 //   	Color back = new Color(240,240,240); 		
    	g2d.setColor(Color.WHITE);
 //   	g2d.fillOval(-1, -1, 20, 20);
    
        if ( plotType.equals("filet") && gang[19] != 90  ) {
        	int rotMot =  ( gang[19] - 90);
   		g2d.drawLine( 0,  0,  0, 0);
      		g2d.rotate(Math.PI * rotMot / 180.0D);	
        	}
 
    //////////////////////////////////////////////
    	
     	 if ( teksting) {
            	
        	 ExtraLine uline = new ExtraLine();
             g2d.setColor(Color.BLACK);
             for (int i = 0; i < this.extraLineTabell.size(); i++) {
               uline = this.extraLineTabell.get(i);
               int i1 = uline.getFirstX() + this.xP;
               int j1 = uline.getFirstY() + this.yP;
               int i2 = uline.getLastX() + this.xP;
               int j2 = uline.getLastY() + this.yP;
               
               g2d.drawLine(i1, j1, i2, j2);
             
             } 

        
             g2d.setColor(Color.BLUE);
             ExtraText etall = new ExtraText();
             for (int m = 0; m < this.extraText.size(); m++) {
               etall = this.extraText.get(m);
               int i1 = etall.getFirstX() + this.xP;
               int j1 = etall.getFirstY() + this.yP;
               String testTall = etall.getLastString();
               g2d.drawString(testTall, i1, j1);
             } 
               
        }

  		if (plotType.equals("filet") && gang[19] != 90 ) {

  			int rooter = 90 -gang[19];
          if (rooter > 0) {
            g2d.rotate(Math.PI * rooter / 180.0D);
            double factor = rooter / 180.0D;
            double deltaXD = this.xP * factor;
            double deltaYD = this.yP * factor;
            int facx = (int)deltaXD;
            int n = (int)deltaYD;
          } 
 		}
     	
     	/////////////////////
 

    //////////////////////////////////
 
    /////////////////////////////// tegning start
    	if (tegning ) {

     		
    		ExtraLine kline = new ExtraLine();
            g2d.setColor(Color.BLUE);
            for (int i = 0; i < this.extraLineTegn.size(); i++) {
              kline = this.extraLineTegn.get(i);
              int i1 = kline.getFirstX() + this.xP;
              int j1 = kline.getFirstY() + this.yP;
              int i2 = kline.getLastX() + this.xP;
              int j2 = kline.getLastY() + this.yP;
              g2d.drawLine(i1, j1, i2, j2);
            } 
            ExtraArray aline = new ExtraArray();
            g2d.setColor(Color.BLUE);
            for (int j = 0; j < this.extraArrayTegn.size(); j++) {
              aline = this.extraArrayTegn.get(j);
              int i1 = aline.getFirstX() + this.xP;
              int j1 = aline.getFirstY() + this.yP;
              int i2 = aline.getLastX() + this.xP;
              int j2 = aline.getLastY() + this.yP;
              int k1 = aline.getFirstZ();
              int k2 = aline.getLastZ();
            new  drawArrowLine(g2d, i1, j1, i2, j2, k1, k2);
            } 
            g2d.setColor(Color.BLUE);
            ExtraBue kbue = new ExtraBue();
            Path2D.Double curvYG399 = new Path2D.Double();
            for (int k = 0; k < this.extraBueTegn.size(); k++) {
              kbue = this.extraBueTegn.get(k);
              int i1 = kbue.getFirstX() + this.xP;
              int j1 = kbue.getFirstY() + this.yP;
              int i2 = kbue.getLastX() + this.xP;
              int j2 = kbue.getLastY() + this.yP;
              int k2 = kbue.getFirstZ() + this.xP;
              int k3 = kbue.getLastZ() + this.yP;
              Path2D.Double curveYG399 = new Path2D.Double();
              QuadCurve2D.Double curveYG391 = new QuadCurve2D.Double(i1, j1, i2, j2, k2, k3);
              g2d.draw(curveYG391);
            } 
            g2d.setColor(Color.BLUE);
            ExtraTall ltall = new ExtraTall();
            for (int m = 0; m < this.extraTallTegn.size(); m++) {
              ltall = this.extraTallTegn.get(m);
              int i1 = ltall.getFirstX() + this.xP;
              int j1 = ltall.getFirstY() + this.yP;
              String testTall = ltall.getLastString();
              g2d.drawString(testTall, i1, j1);
            } 
        	g2d.setColor(Color.WHITE);
  //      	g2d.fillOval(0, 0, 30, 30);
    	}
  
    /////////////////////////////tegning stop
    }
    if ( plotType.equals("filet") && gang[19] != 90  ) {
      	int rotMot =  ( gang[19] - 90);
 		g2d.drawLine( 0,  0,  0, 0);
    		g2d.rotate(Math.PI * rotMot / 180.0D);	
    		g2d.translate( xflytt,  yflytt);
      	}
    // grunnplanken start  
    ExtraBase bline = new ExtraBase();
    g2d.setColor(Color.BLACK);
 //   System.out.println(" her  " + this.extraBase.size());
    for (int i = 0; i < this.extraBase.size(); i++) {
        bline = this.extraBase.get(i);
        int i1 = bline.getFirstX()  + this.xP;
        int j1 = bline.getFirstY() + this.yP;
        int i2 = bline.getLastX()  + this.xP;
        int j2 = bline.getLastY() + this.yP;
        g2d.drawLine(i1, j1, i2, j2);
      } 
    ExtraTall btall = new ExtraTall();
    for (int mm = 0; mm < this.extraTallBase.size(); mm++) {
      btall = this.extraTallBase.get(mm);
      int i1 = btall.getFirstX() + this.xP;
      int j1 = btall.getFirstY() + this.yP;
      String testTall = btall.getLastString();
     g2d.drawString(testTall, i1, j1);
    }

    // grunnplanken slutt

    if ( plotType.equals("filet") && gang[19] != 90  ) {
    	int rotMot =  ( gang[19] - 90);
		g2d.drawLine( 0,  0,  0, 0);
//     		g2d.rotate(-Math.PI * rotMot / 180.0D);	
    	}
  /////////////////////

/*

    if (gang[2] == 14) {
    //    y1[14] = 300;
 //       if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Lap joint") || this.plotType.equals("On plate"))
 //         this.y1[14] = 200; 
        if (this.plotType.equals("corner")) {
          g2d.translate(490, 100);
        } else {
          g2d.translate(490, 250);
        } 
      } 
    */
//      g2d.translate(this.xP, this.yP);
 //     double scaler = this.y1[14] / 100.0D;
      if (scaler > 0.0D) {
 //       g2d.scale(scaler, scaler); 
  		g2d.drawLine( 0,  0,  0, 0);
      g2d.rotate(Math.PI * this.x1[13] / 180.0D);
    }

	      /////////////////////////////////////////////////////
				 
			
  //  	Color back = new Color(240,240,240); 		
    	g2d.setColor(Color.WHITE);
  //  	g2d.fillOval(-1, -1, 20, 20);
/////////////////////////////////////////

      
     
      ////////////////////////////////////////////////////
      WeldPoint tester = new WeldPoint();
      int numberWeld = Welding.this.sveiseListe.size();
  //    System.out.println("ddd "+ numberWeld + " " + weldList.size() + "  " + scaler);
      boolean punktPlottes = false;
      boolean textPlottes = false;
      Point textPoint = new Point();
      g2d.setColor(Color.RED);
      g2d.rotate(-3.141592653589793D * this.x1[13] / 180.0D);
 //     scaler = y1[14];
      if (scaler == 0 )
    	  scaler = 100;
//      System.out.println("13090 " + "  "  + scaler);
    //  if (scaler > 100)
        g2d.scale(100.0/y1[14], 100.0/y1[14]); 
   //     int fac = 200;
        int facx = 0 ;
        int facy = 0;
        if (this.y1[14] == 100 ) 
        {
        	facx = 100;
        	facy =  85;
        }
        if (this.y1[14] == 120 ) 
        {
        	facx = 180;
        	facy = 155;
        }
        if (this.y1[14] == 160 || gang[2] == 7 || gang[2] == 8 || gang[2] == 9 || gang[2] == 10 ) 
        {
        	facx = 350;
        	facy = 300;
        }
        if (this.y1[14] == 160 || gang[2] == 11  ) 
        {
        	facx = 340;
        	facy = 300;
        }
        if ( this.y1[14] == 250 || gang[2] == 12  ) 
        {
        	facx = 700;
        	facy = 300;
        }
        if (this.y1[14] == 160 || gang[2] == 15  ) 
        {
        	facx = 340;
        	facy = 300;
        }
        if (this.y1[14] == 250 || gang[2] == 16  ) 
        {
        	facx = 697;
        	facy = 413;
        }
        if (this.y1[14] == 200 && gang[2] == 0 && false ) 
        {

        	facx = 180;
        	facy = 155;
        }

        if (this.y1[14] == 500 && gang[2] == 13 ) 
        {
        	facx = 1550;
        	facy = 1335;
        }
        /*
        if (this.y1[14] == 300 && gang[2] == 14 ) 
        {
        	facx = -575;
        	facy = 40;
        }
        */

        if ( this.y1[14] == 500 && this.gang[2] == 12) { 
            facx = 0;
            facy= 0;       
            if (this.plotType.equals("Butt") || this.plotType.equals("butt")) {   
                facx = 1555;;  
                facy=   1310;
      	  }
      	  if (this.plotType.equals("filet")) {
                facx = 1450;
                facy=  1440;
      	  }
      	  if (this.plotType.equals("corner")) {
              facx = 1550;
              facy=  1000;
      	  }
      	  if (this.plotType.equals("overlap")) {
               
              facx = 1200;
              facy=  1580;
      	  }
      	  if (this.plotType.equals("flanged")) {
              facx = 1450;
              facy=  1680;
      	  }
      	  if (this.plotType.equals("Cross joint")) {
      //		  g2d.translate(250,  900);
                facx =1455;  // -1200
                facy= 630;   // 530
      	  }
      	  if (this.plotType.equals("Strap joint")) {
      //		  g2d.translate(250,  900);
                facx = 1455;;  
                facy=   910;  // 790
      	  }
      	  if (this.plotType.equals("Lap joint")) {
      //		  g2d.translate(250,  700);
              facx = 1455;;  
              facy=   982;  // 882
      	  }
      	  if (this.plotType.equals("On plate")) {
      //		  g2d.translate(250,  -400);
              facx = 1450;  
              facy=   1680;
      	  } 
            
          } 


        if ( this.y1[14] == 500 && this.gang[2] == 16) { 
            facx = 0;
            facy= 0;       
            if (this.plotType.equals("Butt") || this.plotType.equals("butt")) {   
                facx = 1630;;  
                facy=   1200;
      	  }
      	  if (this.plotType.equals("filet")) {
                facx = 1630;
                facy=  1380;
      	  }
      	  if (this.plotType.equals("corner")) {
              facx = 1630;
              facy=  925;
      	  }
      	  if (this.plotType.equals("overlap")) {
               
              facx = 1440;
              facy=  1480;
      	  }
      	  if (this.plotType.equals("flanged")) {
              facx = 1626;
              facy=  1680;
      	  }
      	  if (this.plotType.equals("Cross joint")) {
      //		  g2d.translate(250,  900);
                facx =1650;  // -1200
                facy= 480;   // -50
      	  }
      	  if (this.plotType.equals("Strap joint")) {
      //		  g2d.translate(250,  900);
                facx = 1655;;  
                facy=   490;
      	  }
      	  if (this.plotType.equals("Lap joint")) {
      //		  g2d.translate(250,  700);
              facx = 1655;;  
              facy=   782;
      	  }
      	  if (this.plotType.equals("On plate")) {
      //		  g2d.translate(250,  -400);
              facx = 1650;  
              facy=   1480;
      	  } 
            
          } 

        if ( this.y1[14] == 400 && this.gang[2] == 14) { 
            facx = 0;
            facy= 0;       
            if (this.plotType.equals("Butt") || this.plotType.equals("butt")) {   
                facx = 1000;  
                facy=   835;
      	  }
      	  if (this.plotType.equals("filet")) {
                facx = 1000;
                facy=  835;
      	  }
      	  if (this.plotType.equals("corner")) {
              facx = 1000;
              facy=  835;
      	  }
      	  if (this.plotType.equals("overlap")) {
               
              facx = 1000;
              facy=  835;
      	  }
      	  if (this.plotType.equals("flanged")) {
              facx = 1000;
              facy=  835;
      	  }
      	  if (this.plotType.equals("Cross joint")) {
      //		  g2d.translate(250,  900);
              facx = 1000;
              facy=  835;
      	  }
      	  if (this.plotType.equals("Strap joint")) {
      //		  g2d.translate(250,  900);
              facx = 1000;
              facy=  835;
      	  }
      	  if (this.plotType.equals("Lap joint")) {
      //		  g2d.translate(250,  700);
              facx = 1000;
              facy=  835;
      	  }
      	  if (this.plotType.equals("On plate")) {
      //		  g2d.translate(250,  -400);
              facx = 1000;
              facy=  835;
      	  } 
            
          } 
        
        
        
        
        
        
       g2d.translate(-this.xP/4+ facx, -this.yP/4 + facy);
  //    g2d.scale(1.1,  1.1);
       
       
       
      /* 
      if (this.gang[2] == 14) {
        this.y1[14] = 300;
        if (this.plotType.equals("Cross joint") || this.plotType.equals("Strap joint") || this.plotType.equals("Lap joint") || this.plotType.equals("On plate"))
          this.y1[14] = 200; 
        if (this.plotType.equals("corner")) {
          g2d.translate(-490, -100);
        } else {
          g2d.translate(-490, -250);
        } 
      } 
      */
       
      for (int ind = 0; ind < numberWeld; ind++) {
        Point firstPoint = new Point();
        Point middelPoint = new Point();
        Point lastPoint = new Point();
        g2d.setColor(Color.RED);
        tester = Welding.this.weldList.get(ind);
        firstPoint = tester.getWeldPointFirst();
        middelPoint = tester.getWeldPointMiddel();
        lastPoint = tester.getWeldPointLast();
        textPoint = tester.getWeldPointTextPoint();
        String ident = tester.getWeldPointText();
        Path2D.Double curvCJMus = new Path2D.Double();
        QuadCurve2D.Double curveCJMus = new QuadCurve2D.Double(firstPoint.x, firstPoint.y, middelPoint.x, middelPoint.y, lastPoint.x, lastPoint.y);
        g2d.draw(curveCJMus);
        if (punktPlottes) {
          g2d.setColor(Color.BLUE);
          g2d.drawOval(firstPoint.x, firstPoint.y, 3, 3);
          g2d.drawOval(lastPoint.x, lastPoint.y, 3, 3);
          g2d.drawOval(middelPoint.x, middelPoint.y, 5, 5);
        } 
        if (!textPlottes) {
          g2d.setColor(Color.BLUE);
          g2d.drawString(ident, textPoint.x, textPoint.y);
        } 
      } 
      
      if (Welding.this.generateOnFile.booleanValue()) {
        String fileType = "png";
        if (this.gang[3] == 1)
          fileType = "gif"; 
        if (this.gang[3] == 2)
          fileType = "jpg"; 
        if (this.gang[3] == 3)
          fileType = "bmp"; 
        String outputFile = String.valueOf(Welding.this.actualPath) + "\\" + Welding.this.imageName + "_" + Welding.this.choosenName + "." + fileType;
        String outputDir = String.valueOf(Welding.this.actualPath) + "\\";
        int indx = Welding.this.actualFiles.size();
        Welding.this.actualFiles.add(indx, outputFile);
        Welding.this.outPath = Paths.get(outputDir, new String[0]);
        if (!Files.exists(Welding.this.outPath, new java.nio.file.LinkOption[0]))
          try {
            Files.createDirectory(Welding.this.outPath, (FileAttribute<?>[])new FileAttribute[0]);
          } catch (IOException e) {
            e.printStackTrace();
          }  
        if ((this.gang[2] == 7 || this.gang[2] == 8 || this.gang[2] == 9 || this.gang[2] == 10 || this.gang[2] == 11 || this.gang[2] == 12 || this.gang[2] == 15 || this.gang[2] == 16) && this.listImage == 1) {
          Welding.this.images.add(buffImg);
          int i = Welding.this.images.size();
        } 
        if (this.gang[2] <= 6)
          Welding.this.images.add(buffImg); 
        if (this.gang[2] == 10 || this.gang[2] == 12 || this.gang[2] == 16)
          for (int j = 0; j < Welding.this.images.size(); j++)
            g2d2d.drawImage(Welding.this.images.get(j), 0, 0, (ImageObserver)null);  
        if (this.gang[2] <= 6)
          g2d2d.drawImage(Welding.this.images.get(0), 0, 0, (ImageObserver)null); 
        File file = new File(outputFile);
    	if (gang[5] == 2)
    	{
//    		paintArk(g, actualFiles);
    	}

        try {
          if (this.gang[2] != 7 && this.gang[2] != 8 && this.gang[2] != 9 && this.gang[2] != 11 && this.gang[2] != 13 && this.gang[2] != 14 && this.gang[2] != 15) {
            ImageIO.write(combined, fileType, file);
            Welding.this.images.remove(0);
          } else {
            ImageIO.write(buffImg, fileType, file);
            int numberOfElement = Welding.this.images.size();
            if (this.gang[2] == 10)
              for (int j = 0; j < numberOfElement; j++)
                Welding.this.images.remove(j);  
            if (this.gang[2] == 12)
              for (int j = 0; j < numberOfElement; j++)
                Welding.this.images.remove(j);  
            if (this.gang[2] == 16)
              for (int j = 0; j < numberOfElement; j++)
                Welding.this.images.remove(j);  
          } 
        } catch (IOException e) {
          System.out.println(" Path do not exist " + Welding.pathName);
          e.printStackTrace();
        } 
      }
    
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
    
  }                             
	
}	
	
	
	
	

