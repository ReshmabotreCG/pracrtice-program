package jobagency;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class CompanyJobRepository {
static String getJobPrediction(int age, String highestQualification) throws NotEligibleException{
String s= new String();
if (age >= 19)
{
if (age >= 21 && highestQualification.equals("B.E"))
s = "We have openings for junior developer&quot";
else if (age >= 26 && (highestQualification.equals("M.S"))||(highestQualification.equals("PhD")))
s = "We have openings for senior developer";
else if (age >= 19 && !(highestQualification.equals("B.E")) && !(highestQualification.equals("M.S")) &&
!(highestQualification.equals("PhD")))
throw new NotEligibleException("We do not have any job that matches your qualifications");

else
s = "Sorry we have no openings for now";
}

else
throw new NotEligibleException("You are underage for any job");
return s;
}
}
public class source1 {
public static String searchForJob(int age, String highestQualification) throws
NotEligibleException {
String s = new String();
if (age >= 200 || age <= 0) {
throw new NotEligibleException("The age entered is not typical for a humanbeing");
}
else {
s = CompanyJobRepository.getJobPrediction(age,
highestQualification);
} return s;
}
public static void main(String args[] ) {
try {
searchForJob(27, "M.S");
} catch (NotEligibleException e) {
System.out.println(e);
}

}
}
class NotEligibleException extends Exception {

public NotEligibleException(String msg) {
super(msg);
}
}