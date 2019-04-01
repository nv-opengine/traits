package com.gracefulcode.opengine.traits;

public class Trait {
	protected String name;
	protected String imageName;
	protected TraitCategory category;
	protected int weight;

	public Trait(String name) {
		this(name, "dark-ring");
	}

	public Trait(String name, String imageName) {
		this(name, imageName, 1);
	}

	public Trait(String name, String imageName, int weight) {
		this.name = name;
		this.imageName = imageName;
		this.weight = weight;
	}

	public void setCategory(TraitCategory category) {
		this.category = category;
	}

	public int adjustWeights(Trait trait, int currentWeight) {
		return currentWeight;
	}

	public String getImageName() {
		return this.imageName;
	}

	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.weight;
	}
}