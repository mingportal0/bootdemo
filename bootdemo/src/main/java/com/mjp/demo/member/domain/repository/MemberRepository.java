package com.mjp.demo.member.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mjp.demo.member.domain.entity.MemberEntity;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findByEmail(String userEmail);
}

