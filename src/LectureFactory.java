public class LectureFactory {
    public static ILecture createLesson(String lectureName, String lectureTeacher, int lecturePoints, int LectureYear){
        ILecture L;
        if(lectureName.equals("MathLecture")){L=new MathLecture(lectureName, lectureTeacher, lecturePoints);}
        else if (lectureName.equals("ScienceLecture")){L=new ScienceLecture(lectureName, lectureTeacher, lecturePoints);}
        else if(lectureName.equals("SportsLecture")){L=new SportsLecture(lectureName, lectureTeacher, lecturePoints);}
        else{throw new RuntimeException(lectureName+" Lecture not found.");}
        return L;
    }
}
