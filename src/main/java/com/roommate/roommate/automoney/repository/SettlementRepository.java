package com.roommate.roommate.automoney.repository;

import com.roommate.roommate.automoney.entity.Settlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Long> {
    
    @Query("SELECT s FROM Settlement s WHERE s.space.id = :spaceId ORDER BY s.createdAt DESC")
    List<Settlement> findBySpaceIdOrderByCreatedAtDesc(@Param("spaceId") Long spaceId);
    
    @Query("SELECT s FROM Settlement s WHERE s.space.id = :spaceId AND s.status = :status ORDER BY s.createdAt DESC")
    List<Settlement> findBySpaceIdAndStatusOrderByCreatedAtDesc(@Param("spaceId") Long spaceId, @Param("status") Settlement.SettlementStatus status);
    
    @Query("SELECT s FROM Settlement s WHERE s.space.id = :spaceId AND s.createdBy = :userId ORDER BY s.createdAt DESC")
    List<Settlement> findBySpaceIdAndCreatedByOrderByCreatedAtDesc(@Param("spaceId") Long spaceId, @Param("userId") Long userId);
}
