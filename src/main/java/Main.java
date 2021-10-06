public class Main {
    public static void main(String... array){
        CommentClass myClass=new CommentClass();
        System.out.println(myClass.commented(2,3));
        System.out.println(myClass.commentedPartly('a',3));
        System.out.println(myClass.notCommennted(4,3));
    }
}
