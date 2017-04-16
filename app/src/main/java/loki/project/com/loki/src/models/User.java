package loki.project.com.loki.src.models;

import loki.project.com.loki.src.enums.Privilege;
import loki.project.com.loki.src.enums.UserStatus;

/**
 * Created by User on 4/14/2017.
 */

public class User {
    private String name;
    private String password;
    private Privilege privilege;
    private UserStatus status;
}
