package resources.patients;

import com.intuit.karate.junit5.Karate;

class PatientsRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("patients").relativeTo(getClass());
    }    

}

