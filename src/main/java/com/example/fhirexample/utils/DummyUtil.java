package com.example.fhirexample.utils;

import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Patient;

public class DummyUtil {

    private static FhirContext ctx = FhirContext.forR4();

    private static void loadPatients(){
        Patient patient = new Patient();
        patient.addIdentifier().setSystem("http://optum.com/MRNs").setValue("MRN001");
        patient.addName()
                .setUse(HumanName.NameUse.OFFICIAL)
                .setFamily("Tester").addGiven("John").addGiven("Q");

//        String encoded = ctx.newJsonParser()
//                .setPrettyPrint(true)
//                .encodeResourceToString(patient);

//        System.out.println(encoded);
    }
}
