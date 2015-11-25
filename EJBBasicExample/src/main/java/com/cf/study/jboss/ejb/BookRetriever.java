package com.cf.study.jboss.ejb;

import javax.ejb.Remote;

@Remote
public interface BookRetriever {

	Book getBookByID(int id);

}