package mashup.ac.kr.listviewphw;

/**
 * Created by Yoonyeong Kim on 2016-04-08.
 */
//모델객체: 데이터를 담을 그릇?
public class ListItem {

    String name;
    String phone;

    public ListItem() {

    }

    public ListItem(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

