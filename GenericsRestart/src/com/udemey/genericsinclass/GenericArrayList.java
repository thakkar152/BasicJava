package com.udemey.genericsinclass;

import java.util.ArrayList;

public class GenericArrayList<T> {

	ArrayList<T> ar = new ArrayList<>();

	public void addElement(T element) {
		ar.add(element);
	}

}
