public class ScienceLecture implements ILecture {

    private String lectureName;
    private String lectureTeacher;
    private int lecturePoints;

    ScienceLecture(String lectureName, String lectureTeacher, int lecturePoints){
        this.lectureName=lectureName;
        this.lectureTeacher=lectureTeacher;
        this.lecturePoints=lecturePoints;
    }

    @Override
    public String getLectureName() {return lectureName;}

    @Override
    public String getLectureTeacher() {return lectureTeacher;}

    @Override
    public int getLecturePoints() {return lecturePoints;}

    @Override
    public void showLectureInfo() {
        System.out.println("lectureName: "+lectureName+" lectureTeacher: "+lectureTeacher+" lecturePoints: "+lecturePoints);

    }
}
