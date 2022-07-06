public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = "true";
        Post.birthday = new FormDate();
        Post.birthday.day = String.valueOf(13);
        Post.birthday.month = String.valueOf(6);
        Post.birthday.year = String.valueOf(1999);
    }
}
