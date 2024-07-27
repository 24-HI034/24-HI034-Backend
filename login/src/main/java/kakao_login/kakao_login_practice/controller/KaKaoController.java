package kakao_login.kakao_login_practice.controller;

import jakarta.servlet.http.HttpServletRequest;
import kakao_login.kakao_login_practice.MsgEntity;
import kakao_login.kakao_login_practice.dto.KakaoDto;
import kakao_login.kakao_login_practice.service.KakaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("kakao")
public class KaKaoController {

    private final KakaoService kaKaoService;

    @GetMapping("/callback")
    public ResponseEntity<MsgEntity> callback(HttpServletRequest request) throws Exception {
        KakaoDto kakaoInfo = kaKaoService.getKakaoInfo(request.getParameter("code"));

        return ResponseEntity.ok()
                .body(new MsgEntity("success", kakaoInfo));
    }
}
