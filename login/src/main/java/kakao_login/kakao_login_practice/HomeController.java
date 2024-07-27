package kakao_login.kakao_login_practice;

import kakao_login.kakao_login_practice.service.KakaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final KakaoService kaKaoService;

    @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("kakaoUrl", kaKaoService.getKakaoLogin());

        return "index";
    }
}
