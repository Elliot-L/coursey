// both junit-4.12.jar and hamcrest-core-1.3.jar need to be added to the class build path to run JUnit tests

package coursy.onlineTools;

import org.apache.commons.beanutils.BeanUtils;
import java.io.Serializable;
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	
  
   //testing the uni class
	//first test
   @Test
   public void creating_printing_cloning_Uni() throws CloneNotSupportedException {
	   String uniName = "Dal";
	   long id = 999;
	   String city = "Halifax";
	   String task = "task";
	   String email = "email";
	   Date date = new Date();
	   Date startDate = date;
	   Date endDate = date;
	   Uni dal = new Uni();
	   dal.setUniversityName(uniName);
	   dal.setCity(city);
	   dal.setId(id);
	   dal.setEmail(email);
	   dal.setTask(task);
	   dal.setStartDate(startDate);
	   dal.setEndDate(endDate);
	   
	   String str = "Contact{" + "id=" + id + ", UniversityName=" + uniName
               + ", city=" + city + ", task=" + task + ", email="
               + email + ", startDate=" + startDate + ", endDate=" +endDate+ "}";
	   
	   //testing the toString method
	   assertEquals(str,dal.toString());
	   
	   //testing the clone method
	   
	  Uni uni2 = dal.clone();
	   
	  assertEquals(str,uni2.toString());
   }

   @Test
   public void UniForm_test(){
	   
	   
   }
   //@Test
  // public void testPrintMessage() {	  
    //  assertEquals(message,messageUtil.printMessage());
   //}
}