package assignments;

import java.util.ArrayList;
import java.util.Collections;

class CD implements Comparable<CD> {
    private String title;
    private String singer;

    public CD(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public int compareTo(CD ot) {
        return this.singer.compareToIgnoreCase(ot.singer);
    }

    @Override
    public String toString() {
        return "CD [Title=" + title + ", Singer=" + singer + "]";
    }
}
public class Question40 
{
	public static void main(String[] args) {
	ArrayList<CD> cd = new ArrayList<>();

	cd.add(new CD("Nuvvele Nuveele", "Anirudh"));
    cd.add(new CD("Kurchi Madatapetti", "S.S.Thaman"));
    cd.add(new CD("Suttamla Soosi", "Anurag Kulakarni"));
    cd.add(new CD("Old Vibes", "Kishore Kumar"));

    Collections.sort(cd);

    System.out.println("CDs sorted by Singer (ascending):");
    for (CD c : cd) {
        System.out.println(c);
    }
	}

}

/*
 * CDs sorted by Singer (ascending):
CD [Title=Nuvvele Nuveele, Singer=Anirudh]
CD [Title=Suttamla Soosi, Singer=Anurag Kulakarni]
CD [Title=Old Vibes, Singer=Kishore Kumar]
CD [Title=Kurchi Madatapetti, Singer=S.S.Thaman]
*/
