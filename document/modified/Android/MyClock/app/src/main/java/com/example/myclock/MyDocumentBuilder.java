package com.example.myclock;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;

public class MyDocumentBuilder extends DocumentBuilder {
    @Override
    public Document parse(InputSource inputSource) throws IOException, SAXException {
        return null;
    }

    @Override
    public boolean isNamespaceAware() {
        return false;
    }

    @Override
    public boolean isValidating() {
        return false;
    }

    public Document parse(String uri) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    @Override
    public void setEntityResolver(EntityResolver entityResolver) {

    }


    @Override
    public void setErrorHandler(ErrorHandler errorHandler) {

    }

    @Override
    public Document newDocument() {
        return null;
    }

    @Override
    public DOMImplementation getDOMImplementation() {
        return null;
    }
}
