public class Client {
    public static void main(String[] args){
        ILecture MathLecture = LectureFactory.createLesson("MathLecture","Hakan GENÇOĞLU",6,2023);
        MathLecture.showLectureInfo();
    }
}
