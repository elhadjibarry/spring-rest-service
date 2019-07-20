package guru.springframework.springrestservice.domain;

import java.util.ArrayList;
import java.util.List;

public class UserData {

    private List<User> data = new ArrayList<>();

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public void addUser(User user) {
        this.data.add(user);
    }
}
