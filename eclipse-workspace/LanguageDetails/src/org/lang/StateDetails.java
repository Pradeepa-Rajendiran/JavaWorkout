package org.lang;

public class StateDetails {
private void southIndia() {
	// TODO Auto-generated method stub
System.out.println("In SouthIndia Tamil and English is preferred");
}
private void northIndia() {
	// TODO Auto-generated method stub
System.out.println("In NorthIndia Hindi is preferred");
}
public static void main(String[] args) {
	StateDetails slang = new StateDetails();
	slang.southIndia();
	slang.northIndia();
	
	LanguageInfo lf=new LanguageInfo();
	lf.tamilLanguage();
	lf.englishLanguage();
	lf.hindiLanguage();
}
}
