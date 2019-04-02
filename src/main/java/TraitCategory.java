package com.gracefulcode.opengine.traits;

public class TraitCategory {
	protected boolean required;
	protected Trait[] traits;
	protected String name;

	public TraitCategory(String name, boolean required, Trait ... traits) {
		this.name = name;
		this.required = required;
		this.traits = traits;

		for (Trait trait: traits) {
			trait.setCategory(this);
		}	
	}

	public Trait[] getTraits() {
		return this.traits;
	}

	public boolean isRequired() {
		return this.required;
	}
}
