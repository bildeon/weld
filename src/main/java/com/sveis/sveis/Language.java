package com.sveis.sveis;





public class Language {
 
	String[] ekstraString0 = {"Info", "Butt weld", "Filet weld", "Corner weld", "Overlap weld", "Flanged Weld", "Strength", "Cam steel" , "Butt weld spesifications" ,
			"Possible choose are:", "Scaler", "Rotate", "Choose Left design :", "Choose Right design :", "Give values for variable on left side :",
			"Give values for variable on right side :", "Gap", "Dy", "Tickness", "Top angle" , "Top radius", "Bottom angle", "Bottom radius", "Face", "Center",
			"Generate left side", "Generate right side", "With comments on page", "With value text on page", "With drawing on page", "Generate image on page",
			"Path name :", "File name :", "File extension :", "Screen size :", "Max size for weldstring", "Mouse move enable", "Full screen", "String drawing", "Comments",
			"Serveal pictures on same screen",  "4 parts", "Upper left", "Upper right", "Lower left", "Lower left & finishing", "2 horisontal parts", "Upper",
			"Lowers & finishing", "2 vertical parts", "Left", "Right & finishing", "Look at files", "Picture under", "Welding Procedure Specification", "A4", "Angle",
			"Plate 1", "Plate 2", "Dx", "Generate drawing", "Dimention 1", "Dimention 2", "Dimention 3", "Joint type", "Spesification for cam steel"
	
	
	
	};
	
	Language() {

	}
	
	public String[] getLanguageText(int j) {
		switch(j) {
		case '0' :
			return ekstraString0;
			
		default:
			return ekstraString0;  // standard language same as 0
		}
	}
}


