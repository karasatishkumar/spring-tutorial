package org.techiekernel.bean;

import org.springframework.stereotype.Service;

@Service("barBean")
public class Bar {

	@Override
	public String toString() {
		return "Bar []";
	}

}
