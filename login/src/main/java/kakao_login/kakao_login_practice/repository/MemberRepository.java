package kakao_login.kakao_login_practice.repository;

import kakao_login.kakao_login_practice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member save(Member member);
}
