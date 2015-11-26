package com.cf.study.jboss.end2end.application.ejb;

import java.util.Collection;

import javax.ejb.Local;

import com.cf.study.jboss.end2end.application.entities.CompactDisc;

@Local
public interface CompactDiscService {

	Collection<CompactDisc> getCatalog();

}
