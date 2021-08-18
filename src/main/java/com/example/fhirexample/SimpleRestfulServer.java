package com.example.fhirexample;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.RestfulServer;
import com.example.fhirexample.provider.PatientResourceProvider;

import javax.servlet.annotation.WebServlet;

@WebServlet("/*")
public class SimpleRestfulServer extends RestfulServer {

    @Override
    protected void initialize(){
        setFhirContext(FhirContext.forR4());
        registerProvider(new PatientResourceProvider());
    }

}
