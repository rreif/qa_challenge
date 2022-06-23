package resources.patients;

import com.github.javafaker.Faker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PatientDataGenerator {
    public JSONObject humanNames() {
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        JSONObject payloadObj = new JSONObject();
        JSONArray givenNameObj = new JSONArray();
        givenNameObj.add(firstName);

        JSONObject nameObj = new JSONObject();
        nameObj.put("given", givenNameObj);
        nameObj.put("family", lastName);

        return nameObj;
    }
}
