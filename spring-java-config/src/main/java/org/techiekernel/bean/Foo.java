package org.techiekernel.bean;

import org.springframework.stereotype.Service;

@Service("fooBean")
public class Foo {

	@Override
	public String toString() {
		return "Foo []";
	}

}
