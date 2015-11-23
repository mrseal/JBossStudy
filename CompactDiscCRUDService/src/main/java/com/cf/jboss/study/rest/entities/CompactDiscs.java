package com.cf.jboss.study.rest.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CompactDiscs implements Serializable {

	private static final long serialVersionUID = 2914554694639829967L;

	private Collection<CompactDisc> discs;

	public Collection<CompactDisc> getDiscs() {
		return discs;
	}

	public void setDiscs(Collection<CompactDisc> discs) {
		this.discs = discs;
	}

}
