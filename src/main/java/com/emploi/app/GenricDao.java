package com.emploi.app;

import java.io.Serializable;
import java.util.List;

public interface GenricDao <T> {
		public void  addOrUpdate(T t)throws Exception;
	    public void delete (T t)throws Exception;
	    public T getByIndex(Serializable index)throws Exception;
	    public List<T> getAll()throws Exception;
}
