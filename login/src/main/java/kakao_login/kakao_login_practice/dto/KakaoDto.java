package kakao_login.kakao_login_practice.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class KakaoDto {

    private long id;
    private String email;
    private String nickname;
}
