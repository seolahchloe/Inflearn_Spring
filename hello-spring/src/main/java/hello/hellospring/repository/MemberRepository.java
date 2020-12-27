package hello.hellospring.repository;

import  hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

    // Optional이란 findById나 Name을 가져온 값이 null일 경우
    // null을 그대로 반환하지 않고 Optional로 감싸서 반환하는 방법





}
