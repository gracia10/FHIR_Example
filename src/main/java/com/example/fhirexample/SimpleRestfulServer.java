package com.example.fhirexample;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.RestfulServer;
import com.example.fhirexample.ResourceProvider.PatientResourceProvider;

import javax.servlet.annotation.WebServlet;

@WebServlet("/*")
public class SimpleRestfulServer extends RestfulServer {

    @Override
    protected void initialize(){
        setFhirContext(FhirContext.forR5());
        registerProvider(new PatientResourceProvider());
    }

}
