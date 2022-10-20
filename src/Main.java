import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<footballer> footballerList = new ArrayList<>();
        footballer footballer = new footballer("Ronaldo", 37, "Ronaldo@gmail.com", 92);
        footballer footballer2 = new footballer("Messi", 36, "Messi@gmail.com", 93);
        footballer footballer3 = new footballer("Zlatan", 35, "Zlatan@gmail.com", 88);
        footballer footballer4 = new footballer("Bale", 35, "Bale@gmail.com", 89);
        footballer footballer5 = new footballer("Neymar", 27, "Neymar@gmail.com", 87);
        footballer footballer6 = new footballer("Mbappe", 25, "Mbappe@gmail.com", 89);
        footballer footballer7 = new footballer("Halland", 26, "Halland@gmail.com", 90);
        footballer footballer8 = new footballer("Felix", 32, "Felix@gmail.com", 91);
        footballer footballer9 = new footballer("Aspas", 33, "Aspas@gmail.com", 85);
        footballer footballer10 = new footballer("Ramos", 34, "Ramos@gmail.com", 88);
        footballer footballer11 = new footballer("Casemiro", 28, "Casemiro@gmail.com", 91);
        footballer footballer12 = new footballer("Mane", 35, "Mane@gmail.com", 85);


        footballerList.add(footballer);
        footballerList.add(footballer2);
        footballerList.add(footballer3);
        footballerList.add(footballer4);
        footballerList.add(footballer5);
        footballerList.add(footballer6);
        footballerList.add(footballer7);
        footballerList.add(footballer8);
        footballerList.add(footballer9);
        footballerList.add(footballer10);
        footballerList.add(footballer11);
        footballerList.add(footballer12);
//        for (footballer f : footballerList) {
//            System.out.println(f);
//        }
        Collections.sort(footballerList, new sortAge());
        System.out.println(footballerList+"\n");

        Collections.sort(footballerList, new sortRating());
        System.out.println(footballerList+"\n");

        Collections.sort(footballerList, new sortName());
        System.out.println(footballerList+"\n");
    }
}

class footballer {
    String name;
    int age;
    String link;
    int rating;

    public footballer(String name, int age, String link, int rating) {
        this.name = name;
        this.age = age;
        this.link = link;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\n"+"Fotabaler(" +
                "name:" + name +
                ", age:" + age +
                ", link:" + link +
                ", rating:" + rating +
                ")";

    }
}
class sortAge implements Comparator<footballer>{
    @Override
    public int compare(footballer s1, footballer s2){
        if(s1.getAge()==s2.getAge())
            return 0;
        if(s1.getAge()>s2.getAge())
            return 1;
        else
            return -1;
    }
}

class sortRating implements Comparator<footballer>{
    @Override
    public int compare(footballer s1, footballer s2){
        if(s1.getRating()==s2.getRating())
            return 0;
        if(s1.getRating()>s2.getRating())
            return 1;
        else
            return -1;
    }
}
class sortName implements Comparator<footballer>{
    @Override
    public int compare(footballer s1, footballer s2){
        return s1.getName().compareTo(s2.getName());
    }
}
