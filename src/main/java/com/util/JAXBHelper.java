package com.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBHelper {

	private JAXBHelper() {
		throw new IllegalStateException("Utility class");
	}

	private static final ConcurrentHashMap<Class<?>, JAXBContext> CONTEXTM = new ConcurrentHashMap<>();
	private static ConcurrentHashMap<Class<?>, JAXBContext> CONTEXTU = new ConcurrentHashMap<>();

	public static <T> T convertToObject(String xml, Class<T> clazz) throws JAXBException {
		JAXBContext context = CONTEXTM.get(clazz);
		if (context == null) {
			context = JAXBContext.newInstance(clazz);
			CONTEXTM.putIfAbsent(clazz, context);
		}

		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(new StringReader(xml));
		if (clazz.isInstance(object)) {
			return clazz.cast(object);
		}
		throw new IllegalArgumentException("XML does not represent an instance of type:" + clazz.getName());

	}
	
	public static <T> String convertToXML(T object, Class<T> clazz) throws JAXBException {
		JAXBContext context = CONTEXTU.get(clazz);
		if (context == null) {
			context = JAXBContext.newInstance(clazz);
			CONTEXTU.putIfAbsent(clazz, context);
		}
		StringWriter stringWriter = new StringWriter();
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(object, stringWriter);
		String xmlContent = stringWriter.toString();
		return xmlContent;
	}

}
