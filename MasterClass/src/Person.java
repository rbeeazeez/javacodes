public class Person {

    //my instance variables
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }

    public String getFirstName(){
        return  this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age = age;
        }

    }

    public boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }else {
            return false;
        }
    }

    public String getFullName(){
        if (this.firstName  != null && this.lastName != null){
            return this.firstName + " " + this.lastName;
        }else if(this.lastName != null){
            return firstName;
        }else if(this.firstName != null){
            return lastName;
        }else{
            return "";
        }
    }
}
