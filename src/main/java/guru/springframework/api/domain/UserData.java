package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/21/2017
 */
@Getter
@Setter
public class UserData {

    List<User> data;

}
