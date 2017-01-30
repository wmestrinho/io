package data;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by WagnerMestrinho on 1/29/17.
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private String county;

    public User(String firstName, String lastName, int age, String city, String county) throws IOException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.county = county;
    }
    public User(String jsonInString) throws IOException {
        Gson gson = new Gson();
        User user = gson.fromJson(jsonInString, User.class);
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.age = user.age;
        this.city = user.city;
        this.county = user.county;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
    public void writeUserToDisk(String filePath){

        try (FileWriter fw = new FileWriter(filePath,true)) {
            Gson gson = new Gson();
            gson.toJson(this, fw);
            fw.write("\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

