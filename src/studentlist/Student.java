   /*
        [Class name]
        Author: [the name of the person who created the class. It might be different from yours]
        Date: [date]

        Description
        [Description about the class]
    */

package studentlist;

/**
 * This class represents a student
 * @author nolan
 */
public class Student {
    
    private String name;
    private String address; 

    public Student(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
