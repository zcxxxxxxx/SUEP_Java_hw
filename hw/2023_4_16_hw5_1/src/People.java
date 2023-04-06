public class People {
    private String name, gender, homeAddress, educationBackground;
    private int age;
    People(String Name, String Gender, int Age, String HomeAddress, String EducationBackground){
        name = Name;
        gender = Gender;
        age = Age;
        homeAddress = HomeAddress;
        educationBackground = EducationBackground;
    }

    People(){}
    public void setName(String Name){
        name = Name;
    }

    public String getName(){
        return name;
    }

    public void setGender(String Gender){
        gender = Gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int Age){
        age = Age;
    }

    public int getAge(){
        return age;
    }

    public void setHomeAddress(String HomeAddress){
        homeAddress = HomeAddress;
    }

    public String getHomeAddress(){
        return homeAddress;
    }

    public void setEducationBackground(String EducationBackground){
        educationBackground = EducationBackground;
    }

    public String getEducationBackground(){
        return educationBackground;
    }
}
