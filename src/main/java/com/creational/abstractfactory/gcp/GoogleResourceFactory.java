package com.creational.abstractfactory.gcp;


import com.creational.abstractfactory.Instance;
import com.creational.abstractfactory.ResourceFactory;
import com.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
