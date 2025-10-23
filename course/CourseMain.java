package course;

public class CourseMain {
    public static void main(String[] args) {
        OnlineCourse oc = new OnlineCourse("Java Programming", "Mr. Smith", 3, "Udemy", 25);
        oc.displayDetails();
        System.out.println("Eligible for certificate? " + (oc.isEligibleForCertificate() ? "Yes" : "No"));
    }
}
