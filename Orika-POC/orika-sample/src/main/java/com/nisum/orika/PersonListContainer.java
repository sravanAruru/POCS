package com.nisum.orika;

import java.util.List;

import com.nisum.orika.Name;

public class PersonListContainer {
	private List<Name> names;

	public PersonListContainer(List<Name> names) {
		this.names = names;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
