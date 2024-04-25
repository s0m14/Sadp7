package ProxyDesignPattern;

import java.util.Date;

public class UserSession {
    String userId;
    private Date lastAccessTime;

    public String getUserId() {
        return userId;
    }
}
