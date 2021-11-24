### HAPI instance
__FhirContext__ 
- HAPI API/Object(Client,Parser)를 위한 factory. 
- 서버 시작시 한번만 생성해 사용함(singleton)

__IParser__
```
FhirContext ctx = FhirContext.forR4();

IParser parser = ctx.newXmlParser();
IParser parser = ctx.newJsonParser();
parser.set


Patient patient = parser.parseResource(Patient.class, msgString);
```

---
### Example  
https://dzone.com/articles/fhir-code-in-10min
