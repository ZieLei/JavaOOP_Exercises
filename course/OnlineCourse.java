package course;

public class OnlineCourse extends Course{

    private String platform;
    private int duration;

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }
    
    public boolean isEligibleForCertificate(){
        int minMonth = 6;
        return duration > minMonth ? true : false;
    }

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        super.displayDetails();
        System.out.println("Course platform: " + platform + ", Course Duration: " + duration);
    }
}
