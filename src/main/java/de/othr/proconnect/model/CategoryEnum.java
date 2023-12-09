package de.othr.proconnect.model;

public enum CategoryEnum {
	
	ELECTRICIAN ("ELEC");
	
	private final String displayCategoryName;
	
	private CategoryEnum(String displayCategoryName) {
		this.displayCategoryName = displayCategoryName;
	}

	public String getDisplayCategoryName() {
		return displayCategoryName;
	}
}
